'use strict';
var EventEmitter = require('eventemitter2').EventEmitter2;
var util = require('util');
var debug = require('debug')('BitMEX:realtime-api');
var createSocket = require('./lib/createSocket');
var deltaParser = require('./lib/deltaParser');
var getStreams = require('./lib/getStreams');

var endpoints = {
  production: 'wss://www.bitmex.com/realtime',
  testnet: 'wss://testnet.bitmex.com/realtime'
};
var noSymbolTables = BitMEXClient.noSymbolTables = [
  'margin',
  'chat'
];

module.exports = BitMEXClient;

function BitMEXClient(options) {
  var emitter = this;
  // We inherit from EventEmitter2, which supports wildcards.
  EventEmitter.call(emitter, {
    wildcard: true,
    delimiter: ':',
    maxListeners: Infinity
  });
  if (!options) options = {};
  this._data = {}; // internal data store
  this._keys = {}; // keys store - populated by images on connect
  if (!options.endpoint) {
    options.endpoint = options.testnet ? endpoints.testnet : endpoints.production;
  }
  console.log(options)

  // Initialize the socket.
  this.socket = createSocket(options, emitter);
  if (options.apiKeyID) {
    this.authenticated = true;
  }

  // Get valid streams so we can validate our subscriptions.
  getStreams(options.endpoint, function(err, streams) {
    if (err) throw err;
    emitter.initialized = true;
    emitter.streams = streams;
    emitter.emit('initialized');
  });
}
util.inherits(BitMEXClient, EventEmitter);

/**
 * Simple data getter. Clones data on the way out so it can be safely modified.
 * @param  {String} symbol      Symbol of data to retrieve.
 * @param  {String} [tableName] Table / stream name.
 * @return {Object}             All current data. If no tableName is provided, will return an object keyed by
 *                              the table name.
 */
BitMEXClient.prototype.getData = function(symbol, tableName) {
  var shouldAppendSymbol = noSymbolTables.indexOf(tableName) === -1;
  var dataKey = shouldAppendSymbol ? symbol : 'stub';
  var out = this._data[dataKey] || [];
  if (tableName && out[tableName]) {
    out = out[tableName];
  }
  return clone(out);
};

/**
 * Get data for all symbols, by table.
 */
BitMEXClient.prototype.getTable = function(tableName) {
  var data = this._data;
  var shouldAppendSymbol = noSymbolTables.indexOf(tableName) === -1;
  var symbols = shouldAppendSymbol ? Object.keys(data) : ['stub'];
  var out = symbols.reduce(function(memo, symbol) {
    return memo.concat(data[symbol][tableName]);
  }, []);
  return clone(out);
};

/**
 * Add a stream to listen to. This function calls back with a full dataset with the arity
 * (data, symbol, tableName).
 *
 * To catch errors, attach an 'error' listener to the client itself.
 *
 * If no tableName is passed, will subscribe to all public tables.
 *
 * @param {String}   symbol    Symbol to subscribe to.
 * @param {String}   [tableName] Table to subscribe to. See README.
 * @param {Function} callback  Data callback.
 */
BitMEXClient.prototype.addStream = function(symbol, tableName, callback) {
  var client = this;
  if (!this.initialized) {
    return this.once('initialized', function() {
      client.addStream(symbol, tableName, callback);
    });
  }
  if (!this.socket.opened) {
    // Not open yet. Call this when open
    return this.socket.once('open', function() {
      addStream(client, symbol, tableName, callback);
    });
  }

  // Massage arguments.

  // Allow omitting tableName
  if (typeof tableName === 'function') {
    callback = tableName;
    tableName = '*';
  }
  if (typeof callback !== 'function') throw new Error('A callback must be passed to BitMEXClient#addStream.');

  else if (client.streams.all.indexOf(tableName) === -1) {
    callback(new Error('Unknown table for BitMEX subscription: ' + tableName +
      '. Available tables are ' + client.streams.all + '.'));
  }

  addStream(client, symbol, tableName, callback);
};

function addStream(client, symbol, tableName, callback) {

  // Tell BitMEX we want to subscribe to this data. If wildcard, sub to all tables.
  var toSubscribe = [tableName];
  if (tableName === '*') {
    // This list comes from the getSymbols call, which hits
    // https://www.bitmex.com/api/v1/schema/websocketHelp
    toSubscribe = client.streams[client.authenticated ? 'all' : 'public'];
  }
  // For each subscription,
  toSubscribe.forEach(function(table) {
    // Create a subscription topic.

    // Some tables don't take symbols.
    var shouldAppendSymbol = noSymbolTables.indexOf(tableName) === -1;

    var subscription = [tableName, shouldAppendSymbol ? symbol : '*'].join(':');

    debug('Opening listener to %s.', subscription);

    // Add the listener for deltas before subscribing at BitMEX.
    // These events come from createSocket, which does minimal data parsing
    // to figure out what table and symbol the data is for.
    //
    // The emitter emits 'partial', 'update', 'insert', and 'delete' events, listen to them all.
    console.log(subscription)
    client.on(subscription + ':*', function(data) {
      var split = this.event.split(':');
      var tableName = split[0], symbol = split[1], action = split[2];

      try {
        var newData = deltaParser.onAction(action, tableName, symbol, client, data);
        callback(newData, symbol, tableName);
      } catch(e) {
        client.emit('error', e);
      }
    });

    client.socket.send(JSON.stringify({op: 'subscribe', args: subscription}));
  });
}

function clone(data) {
  return JSON.parse(JSON.stringify(data));
}
