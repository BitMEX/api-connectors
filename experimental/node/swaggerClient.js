'use strict';
var client = require("swagger-client");
var _ = require('lodash');

var swagger = new client.SwaggerApi({
  url: 'https://www.bitmex.com/api/explorer/resources',
  success: function() {
    if(swagger.ready === true) {
      isReady(swagger.apis);
    }
  }
});

function isReady(client) {
  // Inspect the client to view our API methods
  // All methods accept a data callback.
  client.trade.get({symbol: 'XBU24H', count: 40}, function(response) {
    var trades = JSON.parse(response.data.toString());
    // Print the max price traded in the last `count` trades.
    console.log('max:', _.max(trades, 'price'));
  }, function(response) {
    var err = JSON.parse(response.data.toString()).error;
    // Error handling...
    console.log('Error:', err.message);
  });
}
