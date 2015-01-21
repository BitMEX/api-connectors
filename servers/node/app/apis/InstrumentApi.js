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
    "path" : "/instrument",
    "notes" : "",
    "summary" : "Get instruments.",
    "method": "GET",
    "params" : [params.query("filter", "Table filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;}.", "object", , false, "")].concat([]).concat([]).concat([]),
    "type" : "List[Instrument]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Instrument]')],
    "nickname" : "get"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing get as a GET method?"});    
  }
};
exports.getActive = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/instrument/active",
    "notes" : "",
    "summary" : "Get all active instruments and instruments that have expired in <24hrs.",
    "method": "GET",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "List[Instrument]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Instrument]')],
    "nickname" : "getActive"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing getActive as a GET method?"});    
  }
};

