const WebSocket = require('ws');
var debug = require('debug')('BitMEX:realtime-api:socket:internal');

function WebSocketClient(){
    this.autoReconnectInterval = 5 * 1000;    // ms
}
WebSocketClient.prototype.open = function(url){
    var that = this;
    this.url = url;
    this.instance = new WebSocket(this.url);
    this.instance.on('open',function() {
        that.onopen();
    });
    this.instance.on('message', function(data,flags) {
        that.onmessage(data,flags);
    });
    this.instance.on('close', function(e) {
        switch (e){
        case 1000:  // CLOSE_NORMAL
            console.log("WebSocket: closed");
            break;
        default:    // Abnormal closure
            that.reconnect(e);
            break;
        }
        that.onclose(e);
    });
    this.instance.on('error', function(e) {
        switch (e.code){
        case 'ECONNREFUSED':
            that.reconnect(e);
            break;
        default:
            that.onerror(e);
            break;
        }
    });
};

// Forward eventemitter methods
['on', 'off', 'once', 'addListener', 'removeListener'].forEach(function(key) {
    WebSocketClient.prototype[key] = function() {
        this.instance[key].apply(this.instance, arguments);
    };
});

WebSocketClient.prototype.send = function(data,option) {
    try{
        debug(data);
        this.instance.send(data,option);
    } catch (e){
        this.instance.emit('error',e);
    }
};
WebSocketClient.prototype.reconnect = function(e) {
    console.log('WebSocketClient: retry in ' + this.autoReconnectInterval + ' ms');
    var that = this;
    setTimeout(function(){
        console.log("WebSocketClient: reconnecting...");
        that.open(that.url);
    }, this.autoReconnectInterval);
};
WebSocketClient.prototype.onopen = function(e){ console.log("WebSocketClient: open",arguments); }
WebSocketClient.prototype.onmessage = function(data,flags,number){  console.log("WebSocketClient: message",arguments);  }
WebSocketClient.prototype.onerror = function(e){    console.log("WebSocketClient: error",arguments);    }
WebSocketClient.prototype.onclose = function(e){    console.log("WebSocketClient: closed",arguments);   }

module.exports = WebSocketClient;
