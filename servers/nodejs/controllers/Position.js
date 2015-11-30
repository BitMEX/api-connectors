'use strict';

var url = require('url');


var Position = require('./PositionService');


module.exports.position.find = function position.find (req, res, next) {
  Position.position.find(req.swagger.params, res, next);
};

module.exports.position.isolateMargin = function position.isolateMargin (req, res, next) {
  Position.position.isolateMargin(req.swagger.params, res, next);
};

module.exports.position.transferIsolatedMargin = function position.transferIsolatedMargin (req, res, next) {
  Position.position.transferIsolatedMargin(req.swagger.params, res, next);
};
