// @flow
var debug = require('debug')('WebsocketManager');

module.exports = {
  streams: {},
  websocket: null,
  /**
   * Initialize primus websocket using primus-multiplex.
   * @param  {String} accessToken
   */
  init: function(accessToken){
    // Require Primus here so it doesn't attempt to get loaded on the server.
    // This is a standard primus engine.io build with primus-multiplex plugin.
    var Primus = require('primus');

    var url = '/realtimemd';
    if (accessToken) url += '?accessToken=' + accessToken;
    this.websocket = new Primus(url, {
      manual: true,
      // See https://github.com/primus/primus#strategy
      // Generally 'timeout' is disabled with auth but we want to use it anyway.
      strategy: [ 'online', 'timeout', 'disconnect' ],
      reconnect: {
        retries: Infinity,
        // in local set the max really low so we reconnect faster
        max: process.env.NODE_ENV === 'local' ? 500 : 60000
      },
      // Transport-specific options.
      // https://github.com/Automattic/engine.io-client#methods
      transport: {
        // Once 'websocket' succeeds once, will reconnect using websocket instead of polling
        rememberUpgrade: true
      }
    });
    this.websocket.on('open', function(){
      // clearTimeout(initialTimeout);
      debug('Main Websocket Connected');
    })
    .on('reconnect', function() {
      debug('Reconnecting...');
    })
    .on('reconnect scheduled', function() {
      debug('About to reconnect...');
    })
    .on('close', function(stream) {
      debug('Disconnected.');
    })
    .on('end', function() {
      debug('Websocket Failure.'); // usually user's internet has gone out
    })
    .on('incoming::error', function(e) { // error from server
      console.warn("Websocket connection error: " + e);
      if (e.description === 401) {
        console.warn("Auth has expired. Redirecting...");
        window.location.href = "/timeout";
      }
    }).open();
  },

  /**
   * Given a meta object, subscribe to a data stream via primus-multiplex.
   * This comes directly from the API, and is a wrapper around connecting, sending
   * a subscribe message, and filtering output.
   *
   * @param  {String}        meta Stream meta.
   */
  getWebSocketStream: function(name) {
    if (typeof name !== 'string') throw new Error('getWebSocketStream requires a string "name".');
    if (this.streams[name]) return this.streams[name];

    var me = this;
    var stream = this.streams[name] = this.websocket.channel(name);
    // Check auth status when data comes through.
    stream.on('data', function(data) {
      checkAuth(data);
      logErrors(data);
      logConnected(data, name);
    })
    .on('error', function(e) {
      // swallow - this is already handled in the main error handler above
    })
    .on('end', function() {
      // The stream must be removed on end, otherwise it will not be properly recreated
      // if it is needed again.
      // Don't use 'delete', it's very slow.
      me.streams[name] = null;
    });
    return stream;
  }
};

// Given a chunk, parse it and check if there's an error code. If so, and it's 419 (auth timeout),
// redirect to our special /timeout route which kills the accessToken & displays a message.
// Could also be a 401, which can happen when the token has expired and we haven't caught it yet for some reason -
// perhaps manual deletion.
function checkAuth(parsed) {
  if (parsed.status === 419 || parsed.status === 401) {
    console.error("Got timeout from websocket. Message: " + JSON.stringify(parsed));
    window.location.href = '/timeout';
  }
}

function logErrors(parsed) {
  if (parsed.error && parsed.status !== 401 && parsed.status !== 419) {
    console.error("Error on websocket:", parsed.error);
  }
}

function logConnected(parsed, name) {
  if (parsed.success) {
    debug('Connected to %s stream.', name);
  }
}
