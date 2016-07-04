'use strict';

var url = require('url');


var Leaderboard = require('./LeaderboardService');


module.exports.leaderboard.get = function leaderboard.get (req, res, next) {
  Leaderboard.leaderboard.get(req.swagger.params, res, next);
};
