'use strict';
var _ = require('lodash');
var crypto = require('crypto');
var url = require('url');

/**
 * Handles HMAC signing for BitMEX API keys.
 */
var BitMEXAPIKeyAuthorization = function (apiKey, apiSecret) {
  this.apiKey = apiKey;
  this.apiSecret = apiSecret;
};

var nonceCounter = 0;
BitMEXAPIKeyAuthorization.prototype.apply = function (obj) {
  var nonce = Date.now() * 1000 + (nonceCounter++ % 1000); // prevents colliding nonces. Otherwise, use expires
  var parsedURL = url.parse(obj.url);
  var thisPath = parsedURL.pathname + (parsedURL.search || '');
  var signature = this.sign(obj.method.toUpperCase(), thisPath, nonce, obj.body);
  obj.headers['api-key'] = this.apiKey;
  // Alternatively, omit this and set 'api-expires' to a unix time in the future.
  // obj.headers['api-expires'] = (Date.now() / 1000) + 5; // expires in 5s
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
