'use strict';

var url = require('url');


var Quote = require('./QuoteService');


module.exports.quote.get = function quote.get (req, res, next) {
  Quote.quote.get(req.swagger.params, res, next);
};

module.exports.quote.getBucketed = function quote.getBucketed (req, res, next) {
  Quote.quote.getBucketed(req.swagger.params, res, next);
};
