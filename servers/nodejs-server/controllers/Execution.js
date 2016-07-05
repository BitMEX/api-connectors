'use strict';

var url = require('url');


var Execution = require('./ExecutionService');


module.exports.execution.get = function execution.get (req, res, next) {
  Execution.execution.get(req.swagger.params, res, next);
};

module.exports.execution.getTradeHistory = function execution.getTradeHistory (req, res, next) {
  Execution.execution.getTradeHistory(req.swagger.params, res, next);
};
