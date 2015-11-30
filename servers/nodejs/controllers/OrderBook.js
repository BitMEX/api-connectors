'use strict';

var url = require('url');


var OrderBook = require('./OrderBookService');


module.exports.orderBook.getOrderBook = function orderBook.getOrderBook (req, res, next) {
  OrderBook.orderBook.getOrderBook(req.swagger.params, res, next);
};
