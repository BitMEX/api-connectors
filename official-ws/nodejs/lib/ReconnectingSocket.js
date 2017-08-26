'use strict';
const WebSocket = require('ws');
const debug = require('debug')('BitMEX:realtime-api:socket:internal');

function WebSocketClient(){
    this.autoReconnectInterval = 1000;    // ms
    this.logConnection = true;
}
WebSocketClient.prototype.open = function(url){
    this.url = url;
    this.instance = new WebSocket(this.url);
    this.instance.on('open', () => {
        this.log("Connected.");
        this.onopen();
    });
    this.instance.on('message', (data, flags) => {
        this.onmessage(data,flags);
    });
    this.instance.on('close', (e) => {
        switch (e){
        case 1000:  // CLOSE_NORMAL
            debug("Closed");
            break;
        default:    // Abnormal closure
            this.reconnect(e);
            break;
        }
        this.onclose(e);
    });
    this.instance.on('error', (e) => {
        if (e.code) {
            this.log("Error on connection: " + e.code);
        }
        switch (e.code){
        case 'ECONNREFUSED':
            break;
        default:
            this.onerror(e);
            break;
        }
    });
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
    console.log.apply(console, ['WebSocket:'].concat(args));
}

WebSocketClient.prototype.send = function(data, option) {
    try{
        debug(data);
        this.instance.send(data, option);
    } catch (e){
        this.instance.emit('error',e);
    }
};
WebSocketClient.prototype.reconnect = function(_event) {
    this.emit('reconnect');
    this.log('Retry in ' + this.autoReconnectInterval + ' ms');
    clearTimeout(this.reconnectTimeout);
    this.reconnectTimeout = setTimeout(() => {
        this.log("Reconnecting...");
        this.open(this.url);
    }, this.autoReconnectInterval);
};

module.exports = WebSocketClient;
