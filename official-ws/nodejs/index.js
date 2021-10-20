const _ = require('lodash');
const EventEmitter = require('eventemitter2').EventEmitter2;
const util = require('util');
const debug = require('debug')('BitMEX:realtime-api');
const createSocket = require('./lib/createSocket');
const deltaParser = require('./lib/deltaParser');
const getStreams = require('./lib/getStreams');

const DEFAULT_MAX_TABLE_LEN = 10000;

const endpoints = {
  production: 'wss://ws.bitmex.com/realtime',
  testnet: 'wss://ws.testnet.bitmex.com/realtime'
};
const httpEndpoints = {
  production: 'https://www.bitmex.com/api/v1',
  testnet: 'https://testnet.bitmex.com/api/v1'
}
const noSymbolTables = BitMEXClient.noSymbolTables = [
  'account',
  'affiliate',
  'funds',
  'insurance',
  'margin',
  'transact',
  'wallet',
  'announcement',
  'connected',
  'chat',
  'publicNotifications',
  'privateNotifications'
];

module.exports = BitMEXClient;

function BitMEXClient(options) {
  const emitter = this;
  // We inherit from EventEmitter2, which supports wildcards.
  EventEmitter.call(emitter, {
    wildcard: true,
    delimiter: ':',
    maxListeners: Infinity,
    newListener: true,
  });
  if (!options) options = {};
  this._data = {}; // internal data store keyed by [tableName][symbol]. Used by deltaParser.
  this._keys = {}; // keys store - populated by images on connect
  this._maxTableLen = typeof options.maxTableLen === 'number' ? options.maxTableLen : DEFAULT_MAX_TABLE_LEN;
  if (!options.endpoint) {
    options.endpoint = options.testnet ? endpoints.testnet : endpoints.production;
  }
  if (!options.httpEndpoint) {
    options.httpEndpoint = options.testnet ? httpEndpoints.testnet : httpEndpoints.production;
  }
  if (process.env.BITMEX_ENDPOINT) options.endpoint = process.env.BITMEX_ENDPOINT;
  debug(options)

  this._setupListenerTracking();

  // Initialize the socket.
  this.socket = createSocket(options, emitter);
  if (options.apiKeyID) {
    this.authenticated = true;
  }

  // Get valid streams so we can validate our subscriptions.
  getStreams(options.httpEndpoint, function(err, streams) {
    if (err) throw err;
    emitter.initialized = true;
    emitter.streams = streams;
    emitter.emit('initialize');
  });
}
util.inherits(BitMEXClient, EventEmitter);

/**
 * Simple data getter. Clones data on the way out so it can be safely modified.
 * @param  {String} [symbol]    Symbol of data to retrieve.
 * @param  {String} [tableName] Table / stream name.
 * @return {Object}             All current data. If no tableName is provided, will return an object keyed by
 *                              the table name.
 */
BitMEXClient.prototype.getData = function(symbol, tableName) {
  const tableUsesSymbol = noSymbolTables.indexOf(tableName) === -1;
  if (!tableUsesSymbol) symbol = '*';
  let out;

  // Both filters specified, easy return
  if (symbol && tableName) {
    out = this._data[tableName][symbol] || [];
  }
  // Since we're keying by [table][symbol], we have to search deep
  else if (symbol && !tableName) {
    out = Object.keys(this._data).reduce((memo, tableKey) => {
      memo[tableKey] = this._data[tableKey][symbol] || [];
      return memo;
    }, {});
  }
  // All table data
  else if (!symbol && tableName) {
    out = this._data[tableName] || {};
  } else {
    throw new Error('Pass a symbol, tableName, or both to getData([symbol], [tableName]) - but one must be provided.');
  }
  return _.cloneDeep(out);
};

/**
 * Helper to get data for all symbols, by table.
 */
BitMEXClient.prototype.getTable = function(tableName) {
  return this.getData(null, tableName);
};

/**
 * Helper to get data for all tables, by symbol.
 */
BitMEXClient.prototype.getSymbol = function(symbol) {
  return this.getData(symbol);
};

/**
 * Add a stream to listen to. This function calls back with a full dataset with the arity
 * (data, symbol, tableName).
 *
 * To catch errors, attach an 'error' listener to the client itself.
 *
 * If a tableName of '*' is passed, it will subscribe to all public tables.
 *
 * @param {String}   symbol    Symbol to subscribe to.
 * @param {String}   [tableName] Table to subscribe to. See README.
 * @param {Function} callback  Data callback.
 */
BitMEXClient.prototype.addStream = function(symbol, tableName, callback) {
  const client = this;
  if (!this.initialized) {
    return this.once('initialize', () => client.addStream(symbol, tableName, callback));
  }
  if (!this.socket.opened) {
    // Not open yet. Call this when open
    return this.socket.once('open', () => client.addStream(symbol, tableName, callback))
  }

  // Massage arguments.
  if (typeof callback !== 'function') throw new Error('A callback must be passed to BitMEXClient#addStream.');

  else if (client.streams.all.indexOf(tableName) === -1) {
    throw new Error('Unknown table for BitMEX subscription: ' + tableName +
      '. Available tables are ' + client.streams.all + '.');
  }

  // TODO return async iterable instead
  addStreamHelper(client, symbol, tableName, callback);
};

// Keep track of listeners in a tree. This helps us know what is still
// subscribed to, so we can open & close connections as required.
BitMEXClient.prototype._setupListenerTracking = function() {
  const listenerTree = this._listenerTree = {};
  this.on('newListener', (eventName) => {
    const split = eventName.split(':');
    if (split.length !== 3) return; // other events

    const [table, , symbol] = split;
    if (!listenerTree[table]) listenerTree[table] = {};
    if (!listenerTree[table][symbol]) listenerTree[table][symbol] = 0;
    listenerTree[table][symbol]++;
  });
  this.on('removeListener', (eventName) => {
    const split = eventName.split(':');
    if (split.length !== 3) return; // other events
    const [table, , symbol] = split;
    listenerTree[table][symbol]--;
  });
}

BitMEXClient.prototype.subscriptionCount = function(table, symbol) {
  return this._listenerTree[table] && this._listenerTree[table][symbol] || 0;
};

BitMEXClient.prototype.sendSubscribeRequest = function(table, symbol) {
  const subscribePayload = {op: 'subscribe', args: `${table}:${symbol}`};
  debug('sending: %j', subscribePayload)
  this.socket.send(JSON.stringify(subscribePayload));
};

function addStreamHelper(client, symbol, tableName, callback) {
  const tableUsesSymbol = noSymbolTables.indexOf(tableName) === -1;
  if (!tableUsesSymbol) symbol = '*';

  // Tell BitMEX we want to subscribe to this data. If wildcard, sub to all tables.
  let toSubscribe;
  if (tableName === '*') {
    // This list comes from the getSymbols call, which hits
    // https://www.bitmex.com/api/v1/schema/websocketHelp
    toSubscribe = client.streams[client.authenticated ? 'all' : 'public'];
  } else {
    // Normal sub
    toSubscribe = [tableName];
  }

  // For each subscription,
  toSubscribe.forEach(function(table) {
    // Create a subscription topic.
    const subscription = `${table}:*:${symbol}`;

    debug('Opening listener to %s.', subscription);

    // Add the listener for deltas before subscribing at BitMEX.
    // These events come from createSocket, which does minimal data parsing
    // to figure out what table and symbol the data is for.
    //
    // The emitter emits 'partial', 'update', 'insert', and 'delete' events, listen to them all.
    client.on(subscription, function(data) {
      const [table, action, symbol] = this.event.split(':');

      try {
        const newData = deltaParser.onAction(action, table, symbol, client, data);
        // Shift oldest elements out of the table (FIFO queue) to prevent unbounded memory growth
        if (newData.length > client._maxTableLen) {
          newData.splice(0, newData.length - client._maxTableLen);
        }
        callback(newData, symbol, table);
      } catch(e) {
        client.emit('error', e);
      }
    });

    // If this is the first sub, subscribe to bitmex adapter.
    if (client.subscriptionCount(table, symbol) === 1) {
      const openSubscription = () => client.sendSubscribeRequest(table, symbol);
      // If we reconnect, will need to reopen.
      client.on('open', openSubscription);
      // If we're already opened, prime the pump (I made that up)
      if (client.socket.opened) openSubscription();
    }
  });
}

if (require.main === module) {
  console.error('This module is not meant to be run directly. Try running example.js instead.');
  process.exit(1);
}
