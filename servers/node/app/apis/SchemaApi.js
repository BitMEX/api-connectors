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

exports.find = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/schema",
    "notes" : "",
    "summary" : "Get model schemata for data objects returned by this API.",
    "method": "GET",
    "params" : [params.query("model", "Optional model filter. If omitted, will return all models.", "string", false, false, "")].concat([]).concat([]).concat([]),
    "type" : "Any",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Any')],
    "nickname" : "find"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing find as a GET method?"});    
  }
};
exports.websocketHelp = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/schema/websocketHelp",
    "notes" : "",
    "summary" : "Returns help text & subject list for websocket usage.",
    "method": "GET",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "Any",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Any')],
    "nickname" : "websocketHelp"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing websocketHelp as a GET method?"});    
  }
};

