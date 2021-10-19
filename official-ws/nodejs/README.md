### Node.JS Adapter for BitMEX Realtime Data

This is a reference adapter for receiving realtime data from the BitMEX API.

#### Usage

> The following is runnable in [example.js](example.js).

To get started, create a new client:

```js
const BitMEXClient = require('bitmex-realtime-api');
// See 'options' reference below
const client = new BitMEXClient({testnet: true});
```

Then subscribe to a symbol and table, and pass a callback.

```js
client.addStream('XBTUSD', 'instrument', function (data, symbol, tableName) {
  // Do something with the table data...
});
```

#### API Reference

##### new BitMEXClient(object options)

Options:

```js
{
  testnet: false, // set `true` to connect to the testnet site (testnet.bitmex.com)
  // Set API Key ID and Secret to subscribe to private streams.
  // See `Available Private Streams` below.
  apiKeyID: '',
  apiKeySecret: '',
  maxTableLen: 10000  // the maximum number of table elements to keep in memory (FIFO queue)
}
```

##### client.addStream(string symbol, [string tableName], function callback)

Subscribe to a data stream. Pass a symbol to subscribe to all public data for an instrument.

Pass `tableName` to receive data for a specific table.

```js
client.addStream('XBTUSD', 'quote', function (data, symbol, tableName) {
  if (!data.length) return;
  const quote = data[data.length - 1];  // the last data element is the newest quote
  // Do something with the quote (.bidPrice, .bidSize, .askPrice, .askSize)
});
```

##### client.on(string eventName, function callback)

The client also doubles as a basic EventEmitter. The following events are fired:

```
"initialize"  // Socket initialized, client.streams available
"error"
"open"
"close"
```
Example:
```js
client.on('initialize', () => {
  console.log(client.streams);  // Log .public, .private and .all stream names
});
```

**Note**: Don't forget to attach an `error` handler! If one is not attached, errors will be thrown
and crash your client.

##### client.getData([string symbol], [string tableName])

Use this function to access data directly. Pass either a symbol, or tableName, or both.
Data returned by this method is safe to modify as it is cloned from the internal stores.

If speed is a concern, all data is accessible directly inside the client via the `client._data` property.
Do not modify this data, or you will corrupt further updates!

##### client.getSymbol(string symbol)

Same as above, but returns all tables for a given symbol.

##### client.getTable(string tableName)

Same as above, but returns all symbols for a given table.

```js
client.addStream('XBTUSD', 'trade', () => {});
setTimeout(() => {
  console.log('XBTUSD trades during the last few seconds:', client.getTable('trade').XBTUSD);
}, 5000);
```

#### Available Public Streams

The streams below echo the models described in the [API Explorer](https://www.bitmex.com/api/explorer).

```
"chat",            // Trollbox
"instrument",      // Instrument updates including turnover and bid/ask
"liquidation",     // Liquidations
"orderBookL2_25",  // Top 25 levels of level 2 order book
"orderBook10",     // Last 10 bids and asks (price and size)
"quote",           // Top level of the book
"trade"            // Trades
...                // See https://www.bitmex.com/app/wsAPI#Subscriptions for more streams
```

#### Available Private Streams

The following streams require authentication via an API key.

```
"execution",    // Individual order placements and executions, settlements, commissions
"margin",       // Your account's margin details
"order",        // Order creations, cancellations, and updates
"position"      // Your positions, per instrument
...             // See https://www.bitmex.com/app/wsAPI#Subscriptions for more streams
```

### Debugging

For much more information on what this module is doing, run it with the `DEBUG` environment variable. For example:

```bash
# Display all debug messages
DEBUG=* node example.js
# Display all high-level debug messages
DEBUG=BitMEX:* node example.js
```

### Heartbeat
https://www.bitmex.com/app/wsAPI#Heartbeats

you can implement a more thorough solution, but hope this helps along
```
setInterval(() => {
  client.socket.send("ping")
}, 30 * 1000); // sends ping every 30 s
```