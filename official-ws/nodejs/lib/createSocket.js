'use strict';
const _ = require('lodash');
const debug = require('debug')('BitMEX:realtime-api:socket');
const signMessage = require('./signMessage');
const WebSocketClient = require('./ReconnectingSocket');

module.exports = function createSocket(options, bmexClient) {
  'use strict';

  const endpoint = makeEndpoint(options);
  debug('connecting to %s', endpoint);

  // Create client and bind listeners.
  const wsClient = new WebSocketClient();

  wsClient.onopen = function() {
    wsClient.opened = true;
    debug('Connection to BitMEX at', wsClient.url, 'opened.');
    bmexClient.emit('open');
  };

  wsClient.onclose = function() {
    wsClient.opened = false;
    debug('Connection to BitMEX at', wsClient.url, 'closed.');
    bmexClient.emit('close');
  };

  wsClient.onmessage = function(data) {
    try {
      data = JSON.parse(data);
    } catch(e) {
      bmexClient.emit('error', 'Unable to parse incoming data:', data);
      return;
    }

    if (data.error) return bmexClient.emit('error', data.error);
    if (!data.data) return; // connection or subscription notice


    // Fires events as <table>:<action>:<symbol>, such as
    // instrument:update:XBTUSD.
    // Consumers may be listening on:
    // * action filter   (e.g. `instrument:partial:*`)
    // * symbol filter   (e.g. `instrument:*:XBTUSD`)
    // * table filter    (e.g. `instrument:*:*`)
    emitSplitData(bmexClient, data);

    // For no-symbol tables, emit a '*' event.
    const tableNoSymbol = _.includes(bmexClient.constructor.noSymbolTables, data.table);
    if (tableNoSymbol) {
      emitFullData(bmexClient, data);
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
  };

  wsClient.open(endpoint);

  // Have to regenerate endpoint on reconnection so we have a new nonce.
  wsClient.addListener('reconnect', function() {
    wsClient.url = makeEndpoint(options);
    debug('Reconnecting to BitMEX at ', wsClient.url);
  });

  return wsClient;
};

function emitSplitData(emitter, data) {
  const {table, action} = data;

  // Technically, we can change this (e.g. chat channels)
  const filterKey = data.filterKey || 'symbol';

  // By looking at what we're subscribed to, we can save time by only emitting those events.
  const matchingStreams = emitter._listenerTree[table];
  const symbolData = _.mapValues(matchingStreams, () => []);

  // This is similar to _groupBy, but faster.
  for (let i = 0; i < data.data.length; i++) {
    const d = data.data[i];
    if (symbolData[d[filterKey]]) symbolData[d[filterKey]].push(d);
  }

  Object.keys(symbolData).forEach((symbol) => {
    const key = `${table}:${action}:${symbol}`;
    debug('emitting %s with data %j', key, symbolData[symbol]);
    emitter.emit(key, _.extend({}, data, {data: symbolData[symbol]}));
  });
}

function emitFullData(emitter, data) {
  const {table, action} = data;

  const key = `${table}:${action}:*`;
  debug('emitting %s with data %j', key, data.data);
  emitter.emit(key, data);
}

function makeEndpoint(options) {
  let endpoint = options.endpoint;
  if (options.apiKeyID && options.apiKeySecret) {
    endpoint += '?' + signMessage.getWSAuthQuery(options.apiKeyID, options.apiKeySecret);
  }
  return endpoint;
}
