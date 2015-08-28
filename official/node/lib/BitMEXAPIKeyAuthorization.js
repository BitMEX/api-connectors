var crypto = require('crypto');
var url = require('url');

/**
 * Handles HMAC signing for BitMEX API keys.
 */
var BitMEXAPIKeyAuthorization = function (apiKey, apiSecret) {
  this.apiKey = apiKey;
  this.apiSecret = apiSecret;
};

BitMEXAPIKeyAuthorization.prototype.apply = function (obj) {
  var nonce = new Date().valueOf();
  var parsedURL = url.parse(obj.url);
  var thisPath = parsedURL.pathname + (parsedURL.search || '');
  var signature = this.sign(obj.method.toUpperCase(), thisPath, nonce, obj.body);
  obj.headers['api-key'] = this.apiKey;
  obj.headers['api-nonce'] = nonce;
  obj.headers['api-signature'] = signature;
  return true;
};

BitMEXAPIKeyAuthorization.prototype.sign = function(verb, url, nonce, data) {
  if (!data || _.isEmpty(data)) data = '';
  else if (_.isObject(data)) data = JSON.stringify(data);

  return crypto.createHmac('sha256', this.apiSecret).update(verb + url + nonce + data).digest('hex');
};

module.exports = BitMEXAPIKeyAuthorization;
