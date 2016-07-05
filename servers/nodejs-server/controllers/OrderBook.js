'use strict';

var url = require('url');


var OrderBook = require('./OrderBookService');


module.exports.orderBook.get = function orderBook.get (req, res, next) {
  OrderBook.orderBook.get(req.swagger.params, res, next);
};

module.exports.orderBook.getL2 = function orderBook.getL2 (req, res, next) {
  OrderBook.orderBook.getL2(req.swagger.params, res, next);
};
