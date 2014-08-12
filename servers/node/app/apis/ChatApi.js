var swagger = require("swagger-node-express");
var url = require("url");
var errors = swagger.errors;
var params = swagger.params;

/* add model includes */

function writeResponse (response, data) {
  response.header('Access-Control-Allow-Origin', "*");
  response.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
  response.header("Access-Control-Allow-Headers", "Content-Type");
  response.header("Content-Type", "application/json; charset=utf-8");
  response.send(JSON.stringify(data));
}

exports.models = models = require("../models.js");

exports.chat_create = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/chat",
    "notes" : "",
    "summary" : "Send a chat message.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "chat",
    "responseMessages" : [errors.invalid('id'), errors.notFound('chat')],
    "nickname" : "chat_create"
  },
  'action': function (req,res) {
    if (!req.params.message) {
      throw errors.invalid('message');
    }
    writeResponse(res, {message: "how about implementing chat_create as a POST method?"});    
  }
};
exports.chat_find = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/chat",
    "notes" : "",
    "summary" : "Get chat messages.",
    "method": "GET",
    "params" : [params.query("count", "", "double", false, false, "", 100)].concat([]).concat([]).concat([]),
    "type" : "List[chat]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[chat]')],
    "nickname" : "chat_find"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing chat_find as a GET method?"});    
  }
};

