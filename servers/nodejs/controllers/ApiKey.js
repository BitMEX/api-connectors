'use strict';

var url = require('url');


var ApiKey = require('./ApiKeyService');


module.exports.apiKey.get = function apiKey.get (req, res, next) {
  ApiKey.apiKey.get(req.swagger.params, res, next);
};

module.exports.apiKey.new = function apiKey.new (req, res, next) {
  ApiKey.apiKey.new(req.swagger.params, res, next);
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
