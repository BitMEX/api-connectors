const events = require('events');
const debug = require('debug')('BitMEX:mocks:ReconnectingSocket');

class ReconnectingSocket extends events.EventEmitter {
  constructor() {
    super();
    this.initialAutoReconnectInterval = 1000;    // ms
    this.autoReconnectInterval = this.initialAutoReconnectInterval;
    this.maxAutoReconnectInterval = 60000; // maximum wait between reconnect retrys
    this.logConnection = true;
  }

  open(url) {
    debug('Opening mock connection to %s', url);
    this.url = url;
    this.instance = new events.EventEmitter();
  }

  log(...args) {
    debug('log: %j', args);
  }

  logError(...args) {
    debug('logError: %j', args);
  }

  send(data, option) {
    debug('send: %j (options: %j)', data, option);
  }

  reconnect(_code) {
    debug('reconnecting');
  }
}

['on', 'off', 'once', 'addListener', 'removeListener', 'emit'].forEach(function(key) {
  ReconnectingSocket.prototype[key] = function() {
    this.instance[key].apply(this.instance, arguments);
  };
});

module.exports = ReconnectingSocket;