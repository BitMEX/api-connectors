'use strict';

var url = require('url');


var Position = require('./PositionService');


module.exports.position.get = function position.get (req, res, next) {
  Position.position.get(req.swagger.params, res, next);
};

module.exports.position.isolateMargin = function position.isolateMargin (req, res, next) {
  Position.position.isolateMargin(req.swagger.params, res, next);
};

module.exports.position.updateLeverage = function position.updateLeverage (req, res, next) {
  Position.position.updateLeverage(req.swagger.params, res, next);
};

module.exports.position.transferIsolatedMargin = function position.transferIsolatedMargin (req, res, next) {
  Position.position.transferIsolatedMargin(req.swagger.params, res, next);
};
