'use strict';
var BitMEXClient = require('../index');

var client = new BitMEXClient({testnet: true});

client.addStream('XBTUSD', 'quote', function(data, symbol, table) {
  console.log('Update on ' + table + ':' + symbol + '. New data:\n', data, '\n');
});

client.on('error', function(e) {
  console.error('Received error:', e);
});
