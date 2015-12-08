'use strict';
var SwaggerClient = require("swagger-client");
var _ = require('lodash');
var BitMEXAPIKeyAuthorization = require('./lib/BitMEXAPIKeyAuthorization');

var swagger = new SwaggerClient({
  url: 'https://testnet.bitmex.com/api/explorer/swagger.json',
  success: function() {
    if(swagger.ready === true) {
      isReady(swagger.apis);
    }
  }
});

// This is only needed if you're authorizing, comment it out otherwise.
// swagger.clientAuthorizations.add("apiKey", new BitMEXAPIKeyAuthorization('apiKey', 'apiSecret'));

function isReady(client) {
  // Inspect the client to view our API methods
  // All methods accept a data callback.
  inspect(client);

  console.log("This script will get the highest trade of the last 40 from XBT24H.")

  client.Trade.Trade_get({symbol: 'XBT24H', count: 40}, function(response) {
    var trades = JSON.parse(response.data.toString());
    // Print the max price traded in the last `count` trades.
    console.log('\nMax Trade:\n----\n', JSON.stringify(_.max(trades, 'price'), undefined, 2));
  }, function(response) {
    var err = JSON.parse(response.data.toString()).error;
    // Error handling...
    console.log('Error:', err.message);
  });
}

function inspect(client) {
  console.log("Inspecting BitMEX API...");
  Object.keys(client).forEach(function(model) {
    if (!client[model].operations) return;
    console.log("Available methods for %s: %s", model, Object.keys(client[model].operations).join(', '));
  });
  console.log("------------------------\n");
}
