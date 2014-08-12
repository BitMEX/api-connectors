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

exports.instrument_find = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/instrument",
    "notes" : "",
    "summary" : "Get all listed instruments.",
    "method": "GET",
    "params" : [params.query("filter", "Filter defining fields, where, orderBy, offset, and limit", "object", false, false, "")].concat([]).concat([]).concat([]),
    "type" : "List[instrument]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[instrument]')],
    "nickname" : "instrument_find"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing instrument_find as a GET method?"});    
  }
};

