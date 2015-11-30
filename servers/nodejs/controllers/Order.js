'use strict';

var url = require('url');


var Order = require('./OrderService');


module.exports.order.getOrders = function order.getOrders (req, res, next) {
  Order.order.getOrders(req.swagger.params, res, next);
};

module.exports.order.newOrder = function order.newOrder (req, res, next) {
  Order.order.newOrder(req.swagger.params, res, next);
};

module.exports.order.cancelOrder = function order.cancelOrder (req, res, next) {
  Order.order.cancelOrder(req.swagger.params, res, next);
};

module.exports.order.cancelAll = function order.cancelAll (req, res, next) {
  Order.order.cancelAll(req.swagger.params, res, next);
};

module.exports.order.cancelAllAfter = function order.cancelAllAfter (req, res, next) {
  Order.order.cancelAllAfter(req.swagger.params, res, next);
};

module.exports.order.closePosition = function order.closePosition (req, res, next) {
  Order.order.closePosition(req.swagger.params, res, next);
};

module.exports.order.getCloseOutOrders = function order.getCloseOutOrders (req, res, next) {
  Order.order.getCloseOutOrders(req.swagger.params, res, next);
};
