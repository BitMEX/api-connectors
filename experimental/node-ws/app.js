'use strict';
if (!process.env.DEBUG) require('debug').enable('*'); // By default, all output is shown
var debug = require('debug')('message');

// This example opens a basic connection to the Testnet websocket API and subscribes to a few streams.
var WebSocket = require('ws');
var ws = new WebSocket('wss://testnet.bitmex.com/realtime');

ws.on('open', function open() {
  ws.send(JSON.stringify({subscribe: 'orderBook10'}));
  ws.send(JSON.stringify({subscribe: 'instrument'}));
});

ws.on('message', function(data, flags) {
  debug(data);
});

