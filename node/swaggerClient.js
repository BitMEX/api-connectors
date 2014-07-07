'use strict';
var client = require("swagger-client");
var _ = require('lodash');

var swagger = new client.SwaggerApi({
  url: 'http://localhost:3000/api/swagger/resources',
  success: function() {
    if(swagger.ready === true) {
      isReady(swagger.apis);
    }
  }
});

function isReady(client) {
  // Inspect the client to view our API methods
  // All methods accept a data callback.
  client.trades.trade_getRecent({symbol: 'XBTN14'}, function(response) {
    var trades = JSON.parse(response.data.toString());
    console.log('max:', _.max(trades, 'price'));
  }, function(response) {
    var err = JSON.parse(response.data.toString()).error;
    // Error handling...
    console.log('Error:', err.message);
  });
}
