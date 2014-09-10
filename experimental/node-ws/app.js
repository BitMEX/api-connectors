'use strict';
if (!process.env.DEBUG) require('debug').enable('*'); // By default, all output is shown
var debug = require('debug')('main');
var connector = require('./connector');

// This example uses shoe to open a streaming interface to the BitMEX API.
// Mux-demux then multiplexes the single stream so we can create multiple streams,
// one for each subject.
var emitter = connector.init();

// Once we've connected, we can start opening streams.
// These streams are wrappers around mux-demux streams.
// This is powerful - because the underlying stream can disconnect entirely, and as soon
// as connection is available again the data will start flowing out the same stream object!
// 
// Additionally, these are duplex streams, and you can write to them without worry, even if the underlying
// stream is disconnected; the writes will be queued until a connection is available again.
// 
// For now there is very little API functionality that involves writes from the clients, but later on we will
// implement message replay and other features.
emitter.on('connect', function() {
  var orderBookStream = connector.getWebSocketStream({subject: 'orderBook:XBTU14'});
  var instrumentStream = connector.getWebSocketStream({subject: 'instrument:XBTU14'});
});
