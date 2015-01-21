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

exports.get = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/chat",
    "notes" : "",
    "summary" : "Get chat messages.",
    "method": "GET",
    "params" : [params.query("count", "Number of results to fetch.", "double", , false, "", 100),params.query("start", "Starting point for results.", "double", , false, ""),params.query("reverse", "If true, will sort results newest first.", "boolean", , false, "")].concat([]).concat([]).concat([]),
    "type" : "List[Chat]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Chat]')],
    "nickname" : "get"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing get as a GET method?"});    
  }
};
exports.send = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/chat",
    "notes" : "",
    "summary" : "Send a chat message.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "Chat",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Chat')],
    "nickname" : "send"
  },
  'action': function (req,res) {
    if (!req.params.message) {
      throw errors.invalid('message');
    }
    writeResponse(res, {message: "how about implementing send as a POST method?"});    
  }
};

