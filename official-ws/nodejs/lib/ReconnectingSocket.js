const WebSocket = require('ws');
const debug = require('debug')('BitMEX:realtime-api:socket:internal');

const CLOSE_NORMAL = 1000;
const CLOSE_UNEXPECTED = 1011;
const CLOSE_DOWNTIME = 1012;

function WebSocketClient(){
  this.initialAutoReconnectInterval = 1000;    // ms
  this.autoReconnectInterval = this.initialAutoReconnectInterval;
  this.maxAutoReconnectInterval = 60000; // maximum wait between reconnect retrys
  this.logConnection = true;
}
WebSocketClient.prototype.open = function(url){
  this.url = url;
  this.instance = new WebSocket(this.url);
  this.instance.on('open', () => {
    this.autoReconnectInterval = this.initialAutoReconnectInterval; // reset delay
    this.log("Connected.");
    this.onopen();
  });
  this.instance.on('message', (data, flags) => {
    this.onmessage(data,flags);
  });
  this.instance.on('close', (code) => {
    let reconnecting = false;

    switch (code){
      case CLOSE_NORMAL:
        debug(`WebSocket closed normally.`);
        break;
      case CLOSE_UNEXPECTED:
        this.logError("WebSocket closed unexpectedly.");
        break;
      default:    // Abnormal closure
        this.logError(`WebSocket closed with code ${code}`);
        reconnecting = true;
        break;
    }
    this.onclose(code);
    if (reconnecting) {
      this.reconnect(code);
    } else {
      this.onend(code);
    }
  });
  this.instance.on('error', (e) => {
    if (e.code) {
      this.logError("Error on connection.", e.message);
    }
    switch (e.code){
      case 'ECONNREFUSED':
        break;
      default:
        this.onerror(e);
        break;
    }
  });
  this.instance.on('unexpected-response', (request, response) => {
    // Parse body
    let buf = '';
    response.on('data', (data) => { buf += data; });
    response.on('end', () => {

      let closeConnection = code => {
        if (code === CLOSE_UNEXPECTED)
          this.log('The WebSocket will terminate. Please manually reconnect.');
        request.abort();
        this.instance.close(code);
        this.instance.emit('close', code);
      };

      if (response.statusCode === 401) {
        this.logError(`Authentication invalid. Please check your credentials. Message: ${buf}`);
        closeConnection(CLOSE_UNEXPECTED);
      } else if (response.statusCode === 502 || response.statusCode === 503) {
        // server maintainance / downtime
        this.logError(`Server responded with [${response.statusCode}], will retry soon: ${buf}`);
        // first retry in at least 5 seconds
        this.autoReconnectInterval = Math.min(5000, this.autoReconnectInterval);
        closeConnection(CLOSE_DOWNTIME);
      } else {
        this.logError(`Unexpected response from server [${response.statusCode}]: ${buf}`);
        closeConnection(CLOSE_UNEXPECTED);
      }
    })

  })
};

// Forward eventemitter methods
['on', 'off', 'once', 'addListener', 'removeListener', 'emit'].forEach(function(key) {
  WebSocketClient.prototype[key] = function() {
    this.instance[key].apply(this.instance, arguments);
  };
});

WebSocketClient.prototype.log = function(...args) {
  if (!this.logConnection) return;
  console.log(new Date(), 'WebSocket [INFO]:', ...args);
}

WebSocketClient.prototype.logError = function(...args) {
  console.error(new Date(), 'WebSocket [ERROR]:', ...args);
}

WebSocketClient.prototype.send = function(data, option) {
  try{
    debug(data);
    this.instance.send(data, option);
  } catch (e){
    this.instance.emit('error',e);
  }
};
WebSocketClient.prototype.reconnect = function(_code) {
  this.log('Retry in ' + this.autoReconnectInterval + ' ms');
  clearTimeout(this.reconnectTimeout);
  this.reconnectTimeout = setTimeout(() => {
    this.emit('reconnect');
    // increase wait for next time to avoid spamming the server
    if (this.autoReconnectInterval < this.maxAutoReconnectInterval) {
      this.autoReconnectInterval *= 2;
      if (this.autoReconnectInterval > this.maxAutoReconnectInterval)
        this.autoReconnectInterval = this.maxAutoReconnectInterval;
    }
    this.instance.close(CLOSE_NORMAL, 'Reconnecting.');
    this.log("Reconnecting...");
    this.open(this.url);
  }, this.autoReconnectInterval);
};

module.exports = WebSocketClient;
