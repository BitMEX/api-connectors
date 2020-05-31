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
BitMEXAPIKeyAuthorization.prototype.apply = function (req) {
  if (req.loadSpec) return true;
  var nonce = Date.now() * 1000 + (nonceCounter++ % 1000); // prevents colliding nonces. Otherwise, use expires
  var parsedURL = url.parse(req.url);
  var thisPath = parsedURL.pathname + (parsedURL.search || '');
  var signature = this.sign(req.method.toUpperCase(), thisPath, nonce, req.body);
  req.headers['api-key'] = this.apiKey;
  // Alternatively, omit this and set 'api-expires' to a unix time in the future.
  // req.headers['api-expires'] = (Date.now() / 1000) + 5; // expires in 5s
  req.headers['api-nonce'] = nonce;
  req.headers['api-signature'] = signature;
  return true;
};

BitMEXAPIKeyAuthorization.prototype.sign = function(verb, url, nonce, data) {
  if (!data || _.isEmpty(data)) data = '';
  else if (_.isObject(data)) data = JSON.stringify(data);

  return crypto.createHmac('sha256', this.apiSecret).update(verb + url + nonce + data).digest('hex');
};

module.exports = BitMEXAPIKeyAuthorization;
