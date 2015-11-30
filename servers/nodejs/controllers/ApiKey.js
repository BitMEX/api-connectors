'use strict';

var url = require('url');


var ApiKey = require('./ApiKeyService');


module.exports.apiKey.getKeys = function apiKey.getKeys (req, res, next) {
  ApiKey.apiKey.getKeys(req.swagger.params, res, next);
};

module.exports.apiKey.createKey = function apiKey.createKey (req, res, next) {
  ApiKey.apiKey.createKey(req.swagger.params, res, next);
};

module.exports.apiKey.remove = function apiKey.remove (req, res, next) {
  ApiKey.apiKey.remove(req.swagger.params, res, next);
};

module.exports.apiKey.disable = function apiKey.disable (req, res, next) {
  ApiKey.apiKey.disable(req.swagger.params, res, next);
};

module.exports.apiKey.enable = function apiKey.enable (req, res, next) {
  ApiKey.apiKey.enable(req.swagger.params, res, next);
};
