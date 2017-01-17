'use strict';
var SwaggerClient = require("swagger-client");
var _ = require('lodash');
var BitMEXAPIKeyAuthorization = require('./lib/BitMEXAPIKeyAuthorization');

new SwaggerClient({
  // Switch this to `www.bitmex.com` when you're ready to try it out for real.
  // Don't forget the `www`!
  url: 'https://testnet.bitmex.com/api/explorer/swagger.json',
  usePromise: true
})
.then(function(client) {
  // Comment out if you're not requesting any user data.
  client.clientAuthorizations.add("apiKey", new BitMEXAPIKeyAuthorization('api-key', 'api-secret'));

  // Print client capabilities
  inspect(client.apis);

  // Get a trade
  client.Trade.Trade_get({symbol: 'XBT24H', count: 40})
  .then(function(response) {
    var trades = JSON.parse(response.data.toString());
    // Print the max price traded in the last `count` trades.
    console.log('\nMax Trade:\n----\n', JSON.stringify(_.max(trades, 'price'), undefined, 2));
  })
  .catch(function(e) {
    // Error handling...
    console.log('Error:', e.statusText);
  });
})
.catch(function(e) {
  console.error("Unable to connect:", e);
})

function inspect(client) {
  console.log("Inspecting BitMEX API...");
  Object.keys(client).forEach(function(model) {
    if (!client[model].operations) return;
    console.log("Available methods for %s: %s", model, Object.keys(client[model].operations).join(', '));
  });
  console.log("------------------------\n");
}
