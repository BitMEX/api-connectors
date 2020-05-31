const SwaggerClient = require("swagger-client");
const _ = require('lodash');
const BitMEXAPIKeyAuthorization = require('./lib/BitMEXAPIKeyAuthorization');

// Comment out if you're not requesting any user data.
const authorization = new BitMEXAPIKeyAuthorization('api-key', 'api-secret')

new SwaggerClient({
  // Switch this to `www.bitmex.com` when you're ready to try it out for real.
  // Don't forget the `www`!
  url: 'https://testnet.bitmex.com/api/explorer/swagger.json',
  requestInterceptor(req) {
    // Despite swagger seeing that JSON is the expected type, it will still build formdata bodies
    // Long saga, may be fixed in https://github.com/swagger-api/swagger-js/pull/1500
    req.headers['Content-Type'] = "application/x-www-form-urlencoded";
    // Unfortunately, swagger-client removed custom authorizations in version 3.
    // We implement our authorization as an interceptor instead.
    if (typeof authorization !== 'undefined') {
      authorization.apply(req);
    }
  }
})
.then(async function(client) {
  // Print client capabilities
  inspect(client.apis);

  try {
    //
    // Get a trade
    //
    const tradeResponse = await client.apis.Trade.Trade_get({symbol: 'XBTUSD', count: 40})
    const trades = JSON.parse(tradeResponse.data);
    // Print the max price traded in the last `count` trades.
    console.log('\nMax Trade:\n----\n', JSON.stringify(_.max(trades, 'price'), undefined, 2));

    //
    // Get your margin (authenticated request)
    //
    const marginResponse = await client.apis.User.User_getMargin()
    const margin = JSON.parse(marginResponse.data);
    const marginBalance = (margin.marginBalance / 1e8).toFixed(4);
    console.log('\nMargin Balance:', marginBalance, 'XBT');

    //
    // Placing an order - commented for your safety
    //
    // const orderResponse = await client.apis.Order.Order_new({symbol: 'XBTUSD', price: 1000, orderQty: 1})
    // console.log(orderResponse.data);

    //
    // Placing a bulk order - commented for your safety
    //
    // const bulkOrderResponse = await client.apis.Order.Order_newBulk({
    //   // Required to stringify on bulk routes, otherwise swagger will send [object Object]
    //   "orders": JSON.stringify([
    //     {"symbol":"XBTUSD","price":2433.5,"orderQty":147,"side":"Buy"},
    //     {"symbol":"XBTUSD","price":2431.0,"orderQty":190,"side":"Buy"}
    //   ])
    // });
    // console.log(bulkOrderResponse.data);

  } catch (e) {
    // Error handling...
    console.error('Error:', e);
  }
})
.catch(function(e) {
  console.error("Unable to connect:", e);
})

function inspect(apis) {
  console.log("Inspecting BitMEX API...");
  Object.keys(apis).forEach(function(model) {
    console.log("Available methods for %s: %s", model, Object.keys(apis[model]).join(', '));
  });
  console.log("------------------------\n");
}

