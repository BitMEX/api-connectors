'use strict';
const BitMEXClient = require('./index');
// See 'options' reference in README
const client = new BitMEXClient({
  testnet: true,
  apiKeyID: '',
  apiKeySecret: '',
});


// handle errors here. If no 'error' callback is attached. errors will crash the client.
client.on('error', console.error);
client.on('open', () => console.log('Connection opened.'));
client.on('close', () => console.log('Connection closed.'));
client.on('initialize', () => console.log('Client initialized, data is flowing.'));

client.addStream('XBTUSD', 'quote', function(data, symbol, tableName) {
  console.log(`Got update for ${tableName}:${symbol}. Current state:\n${JSON.stringify(data).slice(0, 100)}...`);
  // Do something with the table data...
});

client.addStream('XBTUSD', 'trade', (...args) => { console.log('trade data: ', args); });

// If authenticated:
// client.addStream('*', 'order', (...args) => { console.log('order data: ', args); });
