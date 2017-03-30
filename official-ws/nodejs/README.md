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
client.addStream('XBTUSD', 'instrument', function(data, symbol, tableName) {
  // Do something with the table data...
});
```

#### API Reference

###### new BitMEXClient(object options)

Options:

```js
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
"open"
"close"
"initialize"
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
"chat",        # Trollbox
"instrument",  # Instrument updates including turnover and bid/ask
"liquidation", # Liquidations
"orderBookL2", # Full orderBook using deltas
"quote",       # Top level of the book
"trade"        # Trades
```

#### Available Private Streams

The following streams require authentication via an API key. Use
[this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) to easily create a key.

```
"execution",   # Individual order placements and executions, settlements, commissions
"margin",      # Your account's margin details
"order",       # Order creations, cancellations, and updates
"position"     # Your positions, per instrument
```

### Debugging

For much more information on what this module is doing, run it with the `DEBUG` environment variable. For example:

```bash
# Display all debug messages
DEBUG=* node example.js
# Display all high-level debug messages
DEBUG=BitMEX:* node example.js
```
