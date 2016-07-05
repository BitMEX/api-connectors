'use strict';

var url = require('url');


var Settlement = require('./SettlementService');


module.exports.settlement.get = function settlement.get (req, res, next) {
  Settlement.settlement.get(req.swagger.params, res, next);
};
