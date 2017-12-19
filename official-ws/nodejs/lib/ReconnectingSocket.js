'use strict';
const WebSocket = require('ws');
const debug = require('debug')('BitMEX:realtime-api:socket:internal');

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
        case 1000:  // CLOSE_NORMAL
            debug("Closed");
            break;
        case 1011:  // UNEXPECTED_CONDITION
            this.logError("Closing Websocket")
            break;
        default:    // Abnormal closure
            this.logError('Websocket closed.');
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
            if (response.statusCode === 401) {
                this.logError(`Authentication invalid. Please check your credentials. Message: ${buf}`);
            } else {
                this.logError(`Unexpected response from server [${response.statusCode}]: ${buf}`);
            }
            this.log('The WebSocket will terminate. Please manually reconnect.');
            request.abort();
            this.instance.close(1011);
            this.instance.emit('close', 1011);
        })

    })
};

// Forward eventemitter methods
['on', 'off', 'once', 'addListener', 'removeListener', 'emit'].forEach(function(key) {
    WebSocketClient.prototype[key] = function() {
        this.instance[key].apply(this.instance, arguments);
    };
});

WebSocketClient.prototype.log = function() {
    if (!this.logConnection) return;
    const args = [].slice.call(arguments);
    console.log.apply(console, ['WebSocket [INFO]:'].concat(args));
}

WebSocketClient.prototype.logError = function() {
    const args = [].slice.call(arguments);
    console.error.apply(console, ['WebSocket [ERROR]:'].concat(args));
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
    this.emit('reconnect');
    this.log('Retry in ' + this.autoReconnectInterval + ' ms');
    clearTimeout(this.reconnectTimeout);
    this.reconnectTimeout = setTimeout(() => {
        // incease wait for next time to avoid spamming the server
        if (this.autoReconnectInterval < this.maxAutoReconnectInterval) {
            this.autoReconnectInterval *= 2;
            if (this.autoReconnectInterval > this.maxAutoReconnectInterval)
                this.autoReconnectInterval = this.maxAutoReconnectInterval;
        }
        this.instance.close(1000, 'Reconnecting.');
        this.log("Reconnecting...");
        this.open(this.url);
    }, this.autoReconnectInterval);
};

module.exports = WebSocketClient;
