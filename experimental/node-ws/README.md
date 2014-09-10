# NodeJS Sample Connector

### Summary

A websocket client using mux-demux and sockjs-client to connect to the BitMEX WSS API. The implementation here
is similar in many ways to the implementation used in the BitMEX web interface.

For a simpler solution, one could use the [ws](https://github.com/einaros/ws) instead, and simply
send subscribe commands. When messages come down, simply read the `table` attribute and route to the handler
of your choice.

### Running

```bash
npm install
node app.js
```

### Example output

```
~/g/B/a/e/node-ws (master|✚2) $ node app.js
messages Connecting to websockets at wss://www.bitmex.com... +0ms
messages Main Websocket Connected +159ms
stream:orderBook:XBTU14 Opening stream to subject: orderBook:XBTU14 +0ms
stream:instrument:XBTU14 Opening stream to subject: instrument:XBTU14 +0ms
stream:orderBook:XBTU14 mx stream started: {"subject":"orderBook:XBTU14"} +2ms
stream:instrument:XBTU14 mx stream started: {"subject":"instrument:XBTU14"} +1ms
stream:orderBook:XBTU14 { success: true, subscribe: 'orderBook:XBTU14' } +29ms
stream:instrument:XBTU14 { success: true, subscribe: 'instrument:XBTU14' } +2ms
stream:orderBook:XBTU14 { table: 'orderBook', keys: [ 'symbol', 'level' ], action: 'update', data: [ { symbol: 'XBTU14', level: 3, bidSize: 2120, timestamp: '2014-09-10T04:06:15.617Z' } ], timestamp: '2014-09-10T04:06:15.617Z' } +9s
stream:orderBook:XBTU14 { table: 'orderBook', keys: [ 'symbol', 'level' ], action: 'update', data: [ { symbol: 'XBTU14', level: 2, bidSize: 1, bidPrice: 482.33, timestamp: '2014-09-10T04:06:24.674Z' }, { symbol: 'XBTU14', level: 3, bidSize: 1670, bidPrice: 480.81, timestamp: '2014-09-10T04:06:24.674Z' }, { symbol: 'XBTU14', level: 4, bidSize: 2120, bidPrice: 479.73, timestamp: '2014-09-10T04:06:24.674Z' }, { symbol: 'XBTU14', level: 5, bidSize: 334, bidPrice: 479.72, timestamp: '2014-09-10T04:06:24.674Z' }, { symbol: 'XBTU14', level: 6, bidSize: 881, bidPrice: 478.76, timestamp: '2014-09-10T04:06:24.674Z' }, { symbol: 'XBTU14', level: 7, bidSize: 3330, bidPrice: 478.44, timestamp: '2014-09-10T04:06:24.674Z' }, { symbol: 'XBTU14', level: 8, bidSize: 800, bidPrice: 476, timestamp: '2014-09-10T04:06:24.674Z' }, { symbol: 'XBTU14', level: 9, bidSize: 4170, bidPrice: 473.7, timestamp: '2014-09-10T04:06:24.674Z' } ], timestamp: '2014-09-10T04:06:24.674Z' } +9s
```
