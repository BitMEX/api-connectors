'use strict';

var url = require('url');


var Order = require('./OrderService');


module.exports.order.getOrders = function order.getOrders (req, res, next) {
  Order.order.getOrders(req.swagger.params, res, next);
};

module.exports.order.amend = function order.amend (req, res, next) {
  Order.order.amend(req.swagger.params, res, next);
};

module.exports.order.new = function order.new (req, res, next) {
  Order.order.new(req.swagger.params, res, next);
};

module.exports.order.cancel = function order.cancel (req, res, next) {
  Order.order.cancel(req.swagger.params, res, next);
};

module.exports.order.cancelAll = function order.cancelAll (req, res, next) {
  Order.order.cancelAll(req.swagger.params, res, next);
};

module.exports.order.amendBulk = function order.amendBulk (req, res, next) {
  Order.order.amendBulk(req.swagger.params, res, next);
};

module.exports.order.newBulk = function order.newBulk (req, res, next) {
  Order.order.newBulk(req.swagger.params, res, next);
};

module.exports.order.cancelAllAfter = function order.cancelAllAfter (req, res, next) {
  Order.order.cancelAllAfter(req.swagger.params, res, next);
};

module.exports.order.closePosition = function order.closePosition (req, res, next) {
  Order.order.closePosition(req.swagger.params, res, next);
};
