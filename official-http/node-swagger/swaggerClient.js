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
  client.Trade.Trade_get({symbol: 'XBTUSD', count: 40})
  .then(function(response) {
    var trades = JSON.parse(response.data.toString());
    // Print the max price traded in the last `count` trades.
    console.log('\nMax Trade:\n----\n', JSON.stringify(_.max(trades, 'price'), undefined, 2));
  })
  .catch(function(e) {
    // Error handling...
    console.log('Error:', e.statusText);
  })

  client.User.User_getMargin()
  .then(function(response) {
    var margin = JSON.parse(response.data.toString());
    var marginBalance = (margin.marginBalance / 1e8).toFixed(4);
    console.log('\nMargin Balance:', marginBalance, 'XBT');
  })
  .catch(function(e) {
    // Error handling...
    console.log('Error:', e.statusText);
  })

  // Example: Placing an order - commented for your safety
  // .then(function() {
  //   return client.Order.Order_new({symbol: 'XBTUSD', price: 1000, orderQty: 1})
  // })
  // .then(function (response) {
  //   console.log(response.data.toString());
  // });

  // Example: sending a bulk order
  // Note: due to a bug in the Swagger client, you must stringify the Array, otherwise
  // we will be sent `["[object Object]","[object Object]"]`
  // client.Order.Order_newBulk({
  //   "orders": JSON.stringify([
  //     {"symbol":"XBTUSD","price":2433.5,"orderQty":147,"side":"Sell"},
  //     {"symbol":"XBTUSD","price":2431.1,"orderQty":190,"side":"Sell"}
  //   ])
  // })
  // .then(function (response) {
  //   console.log(response.data.toString());
  // });
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
