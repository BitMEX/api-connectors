'use strict';

var url = require('url');


var Insurance = require('./InsuranceService');


module.exports.insurance.get = function insurance.get (req, res, next) {
  Insurance.insurance.get(req.swagger.params, res, next);
};
