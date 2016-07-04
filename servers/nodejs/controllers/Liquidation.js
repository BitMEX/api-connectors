'use strict';

var url = require('url');


var Liquidation = require('./LiquidationService');


module.exports.liquidation.get = function liquidation.get (req, res, next) {
  Liquidation.liquidation.get(req.swagger.params, res, next);
};
