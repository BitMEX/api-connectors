var client = require("swagger-client")
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
  client.trades.trade_getRecent({symbol: 'XBTN14', count: 1000}, function(data){
    var trades = JSON.parse(data.data.toString());
    console.log('max:', _.max(trades, 'price'));
  });
}
