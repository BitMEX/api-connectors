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
    "path" : "/stats",
    "notes" : "",
    "summary" : "Get exchange-wide and per-series turnover and volume statistics.",
    "method": "GET",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "List[Stats]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Stats]')],
    "nickname" : "find"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing find as a GET method?"});    
  }
};
exports.history = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/stats/history",
    "notes" : "",
    "summary" : "Get historical exchange-wide and per-series turnover and volume statistics.",
    "method": "GET",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "List[StatsHistory]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[StatsHistory]')],
    "nickname" : "history"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing history as a GET method?"});    
  }
};

