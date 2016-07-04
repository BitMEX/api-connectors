'use strict';

var url = require('url');


var Trade = require('./TradeService');


module.exports.trade.get = function trade.get (req, res, next) {
  Trade.trade.get(req.swagger.params, res, next);
};

module.exports.trade.getBucketed = function trade.getBucketed (req, res, next) {
  Trade.trade.getBucketed(req.swagger.params, res, next);
};
