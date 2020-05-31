const request = require('request');
const crypto = require('crypto');

const apiKey = "API_KEY";
const apiSecret = "API_SECRET";

const verb = 'POST';
const path = '/api/v1/order';
const expires = Math.round(new Date().getTime() / 1000) + 60; // 1 min in the future
const data = {
  symbol: "XBTUSD",
  orderQty: 1,
  price: 590,
  ordType: "Limit"
};

// Pre-compute the postBody so we can be sure that we're using *exactly* the same body in the request
// and in the signature. If you don't do this, you might get differently-sorted keys and blow the signature.
const postBody = JSON.stringify(data);

const signature = crypto.createHmac('sha256', apiSecret)
  .update(verb + path + expires + postBody)
  .digest('hex');

const headers = {
  'content-type' : 'application/json',
  'Accept': 'application/json',
  'X-Requested-With': 'XMLHttpRequest',
  // This example uses the 'expires' scheme. You can also use the 'nonce' scheme. See
  // https://www.bitmex.com/app/apiKeysUsage for more details.
  'api-expires': expires,
  'api-key': apiKey,
  'api-signature': signature
};

const requestOptions = {
  headers: headers,
  // Notice we are using testnet here. Switch to www to query the production site.
  url: 'https://testnet.bitmex.com' + path,
  method: verb,
  body: postBody
};

request(requestOptions, function(error, response, body) {
  if (error) { console.log(error); }
  console.log(body);
});
