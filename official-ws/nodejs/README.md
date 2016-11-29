### Node.JS Adapter for BitMEX Realtime Data

This is a reference adapter for receiving realtime data from the BitMEX API.

#### Usage

To get started, create a new client:

```javascript
var BitMEXClient = require('bitmex-realtime-api');
// See 'options' reference below
var client = new BitMEXClient({testnet: true});
// handle errors here. If no 'error' callback is attached. errors will crash the client.
client.on('error', function(error) { /* ... */ });
```

Then subscribe to a symbol and table, and pass a callback.

```javascript
client.addStream('XBU24H', 'instrument', function(data, symbol, tableName) {
  // Do something with the table data...
});
```

#### API Reference

###### new BitMEXClient(object options)

Options:

```javascript
{
  testnet: false, // set `true` to connect to the testnet site (testnet.bitmex.com)
  // Set API Key ID and Secret to subscribe to private streams.
  // See `Available Private Streams` below.
  apiKeyID: '',
  apiKeySecret: ''
}
```

###### client.addStream(string symbol, [string tableName], function callback)

Subscribe to a data stream. Pass a symbol to subscribe to all public data for an instrument.

Pass an optional `tableName` to only receive data for a specific table.

###### client.on(string eventName, function callback)

The client also doubles as a basic EventEmitter. The following events are fired:

```
"data",        # Raw data from the websocket
"error"
```

* Note: Don't forget to attach an `error` handler! If one is not attached, errors will be thrown
and crash your client.

###### client.getData(string symbol, [string tableName])

Use this function to access data directly. This returns all tables for a symbol.
Data returned by this method is safe to modify as it is cloned from the internal stores.

If speed is a concern, all data is accessible directly inside the client via the `client._data` property.
Do not modify this data, or you will corrupt further updates!

###### client.getSymbol(string symbol)

Same as above, but returns all tables for a given symbol.

###### client.getTable(string tableName)

Same as above, but returns all symbols for a given table.

#### Available Public Streams

The streams below echo the models described in the [API Explorer](https://www.bitmex.com/api/explorer).

```
"instrument",  # instrument updates including turnover and bid/ask
"orderBook",   # full orderBook using deltas
"quote",       # top level of the book
"trade"        # live trades
```

#### Available Private Streams

The following streams require authentication via an API key. Use
[this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) to easily create a key.
A UI for creating and managing API Keys is coming to BitMEX soon.

```
"execution",   # individual order placements and executions, settlements, commissions
"margin",      # your account's margin details
"order",       # order creations, cancellations, and updates
"position"     # your positions per-instrument
```
