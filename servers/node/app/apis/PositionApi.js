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

exports.position_find = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/position",
    "notes" : "",
    "summary" : "Get your positions.",
    "method": "GET",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "List[position]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[position]')],
    "nickname" : "position_find"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing position_find as a GET method?"});    
  }
};

