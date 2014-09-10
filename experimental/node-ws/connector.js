'use strict';
var reconnectCore = require('reconnect-core');
var sockJS = require('sockjs-stream');
var muxDemux = require('mux-demux');
var stream = require('stream');
var debug = require('debug')('messages');

/**
 * This module connects to the BitMEX API to create discrete streams that
 * are subscribed to a single subject.
 */
module.exports = {
  /**
   * Initialize websocket.
   * @param  {String} accessToken Optional accessToken if you intend to sub to auth-required streams.
   */
  init: function(accessToken){
    var me = this;

    // This requires an accessToken. Get one from the REST interface via /user/login.
    this.accessToken = accessToken; 

    var baseURL = "wss://www.bitmex.com";
    debug('Connecting to websockets at %s...', baseURL);

    var reconnect = reconnectCore(sockJS);
    var connected = false;

    return reconnect()
    .on('connect', function(stream){
      connected = true;
      var mx = muxDemux();
      // Pipe through muxdemux.
      stream.pipe(mx).pipe(stream);

      me.socketStream = stream;
      me.mxStream = mx;
      debug('Main Websocket Connected');
    })
    .on('reconnect', function() {
      if (connected) debug('Lost connection to %s, reconnecting...', baseURL);
    })
    .on('disconnect', function(err) {
      if (err) console.error(err);
      if (me.socketStream) me.socketStream.closed = true;
      if (me.mxStream) me.mxStream.closed = true;
    })
    .on('close', function(err) {
      if(err) console.error(err);
    })
    .connect(baseURL + '/realtimemd');
  },

  /**
   * Given a meta object, subscribe to a data stream via mux-demux.
   * This comes directly from the API, and is a wrapper around connecting, sending
   * a subscribe message, and filtering output.
   * @param  {*}        meta Stream meta.
   */ 
  getWebSocketStream: function(meta) {
    if (!meta.name && !meta.subject) {
      throw new Error('getWebSocketStream requires a `name` or `subject` attribute on the meta object.');
    }

    var me = this;

    // Mangle meta
    meta = this.processMeta(meta);
    var debugStream = require('debug')('stream:' + meta.subject);

    debugStream('Opening stream to subject: %s', meta.subject);

    // Create a stream that stays open even during reconnects.
    // If it is explicitly ended, we will no longer reconnect the mx stream.
    var duplex = new stream.Duplex({objectMode: true});

    // FIFO
    var writeBuffer = [];
    duplex._write = function(chunk, enc, cb) {
      // Push to the write buffer, where writes will be queued in case of disconnects.
      writeBuffer.push(chunk);
      // Emit a custom event.
      duplex.emit('write');
      cb();
    };
    duplex._read = function(size) {
      // nothing, mx stream is doing the pushing
    };

    // Called every time we connect, may be called many times due to reconnects.
    var onConnect = this._onMXStreamConnect.bind(this, meta, writeBuffer, duplex, debugStream);

    // When the duplex is explicitly ended, don't reconnect the mux-demux stream.
    duplex.on('finish', function() {
      me.emitter.removeListener('websocket:connect', onConnect);
    });

    // Create the stream right away if we are already connected.
    if (this.mxStream && !this.mxStream.closed) {
      process.nextTick(onConnect);
    }

    return duplex;
  },
  /**
   * When a MX stream connects, this is called.
   * @param  {Object} meta        Meta used to initialize the MX Stream.
   * @param  {Array} writeBuffer  Buffer of queued writes from the client.
   * @param  {Stream} duplex      Outer duplex stream.
   * @param  {Function} debug     Debugger.
   */
  _onMXStreamConnect: function(meta, writeBuffer, duplex, debug) {
    var stream = this.mxStream.createStream(meta);
    debug('mx stream started: %j', meta);
    // When data comes in, push to the readable side of our duplex.
    // This is parsed as it comes in by sockjs.
    stream.on('data', function(chunk) {
      debug(chunk);
      checkAuth(chunk);
      duplex.push(chunk);
    });
    // When we are disconnected, end the writing.
    var endStream = stream.end.bind(stream);
    stream.on('end', function() {
      debug('mx stream ended: %j', meta);
      duplex.removeAllListeners('write');
      duplex.removeListener('finish', endStream);
    });
    duplex.on('finish', endStream);
    // Pipe writes from the duplex into the outgoing mx stream.
    duplex.on('write', function(){
      stream.write(writeBuffer.shift());
    });
    // Write any messages that may have queued up.
    while(writeBuffer.length) {
      stream.write(writeBuffer.shift());
    }
  },
  /**
   * Given a meta object, do some additional processing to it.
   * @param  {Object} meta Meta object
   * @return {Object}      Meta object with accessToken and translated args.
   */
  processMeta: function(meta) {
    meta.accessToken = this.accessToken;
    meta.subject = meta.subject || meta.name;
    if (meta.args && meta.args.length) meta.subject += ':' + meta.args.join(':');
    return meta;
  }
};

// Given a chunk, parse it and check if there's an error code. If so, and it's 419 (auth timeout),
// print a message. Here you'd want to reauth with the REST interface.
// Could also be a 401, which can happen when the token has expired and we haven't caught it yet for some reason -
// perhaps manual deletion.
function checkAuth(parsed) {
  if (parsed.status === 419 || parsed.status === 401) {
    console.error("Auth timeout, would need to re-auth here"); // Redirect to our timeout route
  }
}
