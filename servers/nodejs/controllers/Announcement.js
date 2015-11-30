'use strict';

var url = require('url');


var Announcement = require('./AnnouncementService');


module.exports.announcement.get = function announcement.get (req, res, next) {
  Announcement.announcement.get(req.swagger.params, res, next);
};

module.exports.announcement.getUrgent = function announcement.getUrgent (req, res, next) {
  Announcement.announcement.getUrgent(req.swagger.params, res, next);
};
