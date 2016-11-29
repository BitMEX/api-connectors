'use strict';
var _ = require('lodash');
var crypto = require('crypto');
var querystring = require('querystring');

/**
 * Sign a message. hex( HMAC_SHA256(secret, verb + url + nonce + data) )
 * @param  {String} secret API secret.
 * @param  {String} verb   Request verb (GET, POST, etc).
 * @param  {String} url    Request URL.
 * @param  {Number} nonce  Nonce for this request.
 * @param  {String|Object} [data] Request body, if it exists.
 * @return {String}        Signature.
 */
module.exports = function signMessage(secret, verb, url, nonce, data) {
  if (!data || _.isEmpty(data)) data = '';
  else if (_.isObject(data)) data = JSON.stringify(data);

  return crypto.createHmac('sha256', secret).update(verb + url + nonce + data).digest('hex');
};

module.exports.getWSAuthQuery = function getWSAuthQuery(apiKey, apiSecret) {
  var nonce = new Date().valueOf();
  var query = {
    'api-nonce': nonce,
    'api-key': apiKey,
    'api-signature' :module.exports(apiSecret, 'GET', '/realtime', nonce)
  };

  return querystring.stringify(query);
};
