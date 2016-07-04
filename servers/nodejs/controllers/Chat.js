'use strict';

var url = require('url');


var Chat = require('./ChatService');


module.exports.chat.get = function chat.get (req, res, next) {
  Chat.chat.get(req.swagger.params, res, next);
};

module.exports.chat.new = function chat.new (req, res, next) {
  Chat.chat.new(req.swagger.params, res, next);
};

module.exports.chat.getConnected = function chat.getConnected (req, res, next) {
  Chat.chat.getConnected(req.swagger.params, res, next);
};
