const _ = require('lodash');
const debug = require('debug')('BitMEX:realtime-api:socket');
const debugEmit = require('debug')('BitMEX:realtime-api:socket:emit');
const signMessage = require('./signMessage');
const WebSocketClient = require('./ReconnectingSocket');

module.exports = function createSocket(options, bmexClient) {
  const endpoint = makeEndpoint(options);
  debug('connecting to %s', endpoint);

  // Create client and bind listeners.
  const wsClient = new WebSocketClient();

  function onReconnect() {
    wsClient.url = makeEndpoint(options);
    debug('Reconnecting to BitMEX at ', wsClient.url);
  }

  wsClient.onopen = function() {
    wsClient.opened = true;
    debug('Connection to BitMEX at', wsClient.url, 'opened.');
    bmexClient.emit('open');

    // Have to regenerate endpoint on reconnection so we have a new nonce.
    wsClient.addListener('reconnect', onReconnect);
  };

  wsClient.onclose = function() {
    wsClient.opened = false;
    debug('Connection to BitMEX at', wsClient.url, 'closed.');
    bmexClient.emit('close');
  };

  wsClient.onmessage = function(data) {
    try {
      if (data === "pong") {
        return;
      }
      data = JSON.parse(data);
      debug('Received %j', data);
    } catch(e) {
      bmexClient.emit('error', 'Unable to parse incoming data:', data);
      return;
    }

    if (data.error) return bmexClient.emit('error', data.error);
    if (!data.data) return; // connection or subscription notice

    const tableNoSymbol = _.includes(bmexClient.constructor.noSymbolTables, data.table);

    if (tableNoSymbol) {
      // For no-symbol tables, emit a '*' event.
      emitFullData(bmexClient, data);
    } else {
      // Emit all data on partials for full tables. Thie ensures all downstream listeners
      // know the table is fully initialized. Split symbol data will emit too.
      if (data.action === 'partial' && !(data.filter && data.filter.symbol)) {
        emitFullData(bmexClient, data);
      }

      // Fires events as <table>:<action>:<symbol>, such as
      // instrument:update:XBTUSD.
      // Consumers may be listening on:
      // * action filter   (e.g. `instrument:partial:*`)
      // * symbol filter   (e.g. `instrument:*:XBTUSD`)
      // * table filter    (e.g. `instrument:*:*`)
      emitSplitData(bmexClient, data);
    }
  };

  wsClient.onerror = function(e) {
    const listeners = bmexClient.listeners('error');
    // If no error listeners are attached, throw.
    if (!listeners.length) throw e;
    else bmexClient.emit('error', e);
  };

  wsClient.onend = function(code) {
    const listeners = bmexClient.listeners('end');
    // If no end listeners are attached, throw.
    if (!listeners.length) throw new Error('WebSocket closed. Please check errors above.');
    else bmexClient.emit('end', code);

    // Cleanup
    wsClient.removeListener('reconnect', onReconnect);
  };

  wsClient.open(endpoint);

  return wsClient;
};


// Emits data split by symbol.
function emitSplitData(emitter, data) {
  const {table, action} = data;

  // Technically, we can change this (e.g. chat channels)
  const filterKey = data.filterKey || 'symbol';

  // Generate data by symbol
  const symbolData = data.data.reduce((accumulator, currentValue) => {
    if (currentValue[filterKey] in accumulator) {
      accumulator[currentValue[filterKey]].push(currentValue);
    } else {
      accumulator[currentValue[filterKey]] = [currentValue];
    }
    return accumulator;
  }, {});

  // If an empty partial is emitted, it will look like the following:
  // {"table":"order","action":"partial",..."filter":{"symbol":"XBTZ19"}}
  // This allows us to know which filtered partial is empty.
  //
  // We need to emit it so upstream knows we received this, it was just an empty list.
  if (data.action === 'partial' && data.filter && data.filter.symbol) {
    symbolData[data.filter.symbol] = symbolData[data.filter.symbol] || [];
  }

  Object.keys(symbolData).forEach((symbol) => {
    const key = `${table}:${action}:${symbol}`;
    debugEmit('emitting %s with data %j', key, symbolData[symbol]);
    emitter.emit(key, _.extend({}, data, {data: symbolData[symbol]}));
  });
}

function emitFullData(emitter, data) {
  const {table, action} = data;

  const key = `${table}:${action}:*`;
  debugEmit('emitting %s with data %j', key, data.data);
  emitter.emit(key, data);
}

function makeEndpoint(options) {
  let endpoint = options.endpoint;
  if (options.apiKeyID && options.apiKeySecret) {
    endpoint += '?' + signMessage.getWSAuthQuery(options.apiKeyID, options.apiKeySecret);
  }
  return endpoint;
}
