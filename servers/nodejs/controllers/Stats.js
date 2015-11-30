'use strict';

var url = require('url');


var Stats = require('./StatsService');


module.exports.stats.find = function stats.find (req, res, next) {
  Stats.stats.find(req.swagger.params, res, next);
};

module.exports.stats.history = function stats.history (req, res, next) {
  Stats.stats.history(req.swagger.params, res, next);
};
