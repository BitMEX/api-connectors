'use strict';
const debug = require('debug')('BitMEX:realtime-api:socket');
const signMessage = require('./signMessage');
const WebSocketClient = require('./ReconnectingSocket');

module.exports = function createSocket(options, emitter) {
  'use strict';
  let endpoint = options.endpoint;
  if (options.apiKeyID && options.apiKeySecret) {
    endpoint += '?' + signMessage.getWSAuthQuery(options.apiKeyID, options.apiKeySecret);
  }
  debug('connecting to %s', endpoint);

  const client = new WebSocketClient();

  client.onopen = function() {
    client.opened = true;
    debug('Connection to BitMEX at', endpoint, 'opened.');
    emitter.emit('open');
  };

  client.onclose = function() {
    client.opened = false;
    debug('Connection to BitMEX at', endpoint, 'opened.');
    emitter.emit('close');
  }

  client.onmessage = function(data) {
    try {
      data = JSON.parse(data);
    } catch(e) {
      emitter.emit('error', 'Unable to parse incoming data:', data);
      return;
    }

    if (data.error) return emitter.emit('error', data.error);
    if (!data.data) return; // connection or subscription notice

    // If no data was found, stub the symbol. At least we'll get keys.
    const symbol = data.data[0] && data.data[0].symbol || 'stub';

    // Fires events as <table>:<symbol>:<action>, such as
    // instrument:XBTUSD:update
    const key = data.table + ':' + symbol + ':' + data.action;
    debug('emitting %s with data %j', key, data);
    emitter.emit(key, data);
  };

  client.onerror = function(e) {
    const listeners = emitter.listeners('error');
    // If no error listeners are attached, throw.
    if (!listeners.length) throw e;
    else emitter.emit('error', e);
  }

  client.open(endpoint);

  return client;
};
