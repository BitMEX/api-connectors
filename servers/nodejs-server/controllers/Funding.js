'use strict';

var url = require('url');


var Funding = require('./FundingService');


module.exports.funding.get = function funding.get (req, res, next) {
  Funding.funding.get(req.swagger.params, res, next);
};
