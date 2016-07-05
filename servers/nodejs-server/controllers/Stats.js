'use strict';

var url = require('url');


var Stats = require('./StatsService');


module.exports.stats.get = function stats.get (req, res, next) {
  Stats.stats.get(req.swagger.params, res, next);
};

module.exports.stats.history = function stats.history (req, res, next) {
  Stats.stats.history(req.swagger.params, res, next);
};
