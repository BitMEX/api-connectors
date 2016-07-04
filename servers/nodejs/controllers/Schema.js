'use strict';

var url = require('url');


var Schema = require('./SchemaService');


module.exports.schema.get = function schema.get (req, res, next) {
  Schema.schema.get(req.swagger.params, res, next);
};

module.exports.schema.websocketHelp = function schema.websocketHelp (req, res, next) {
  Schema.schema.websocketHelp(req.swagger.params, res, next);
};
