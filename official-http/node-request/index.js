var request = require('request');
var crypto = require('crypto');

var apiKey = "API_KEY";
var apiSecret = "API_SECRET";

var verb = 'POST',
  path = '/api/v1/order',
  expires = Math.round(new Date().getTime() / 1000) + 60, // 1 min in the future
  data = {symbol:"XBTUSD",orderQty:1,price:590,ordType:"Limit"};

// Pre-compute the postBody so we can be sure that we're using *exactly* the same body in the request
// and in the signature. If you don't do this, you might get differently-sorted keys and blow the signature.
var postBody = JSON.stringify(data);

var signature = crypto.createHmac('sha256', apiSecret).update(verb + path + expires + postBody).digest('hex');

var headers = {
  'content-type' : 'application/json',
  'Accept': 'application/json',
  'X-Requested-With': 'XMLHttpRequest',
  // This example uses the 'expires' scheme. You can also use the 'nonce' scheme. See
  // https://www.bitmex.com/app/apiKeysUsage for more details.
  'api-expires': expires,
  'api-key': apiKey,
  'api-signature': signature
};

// This example uses 'testnet api' for production is so important use url with 'www' (https://www.bitmex.com)
const requestOptions = {
  headers: headers,
  url:'https://testnet.bitmex.com'+path,
  method: verb,
  body: postBody
};

request(requestOptions, function(error, response, body) {
  if (error) { console.log(error); }
  console.log(body);
});
