'use strict';

var url = require('url');


var Schema = require('./SchemaService');


module.exports.schema.find = function schema.find (req, res, next) {
  Schema.schema.find(req.swagger.params, res, next);
};

module.exports.schema.websocketHelp = function schema.websocketHelp (req, res, next) {
  Schema.schema.websocketHelp(req.swagger.params, res, next);
};
