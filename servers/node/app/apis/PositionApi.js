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
    "path" : "/position",
    "notes" : "",
    "summary" : "Get your positions.",
    "method": "GET",
    "params" : [params.query("filter", "Table filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;}.", "object", false, false, ""),params.query("columns", "Which columns to fetch. For example, send [&quot;columnName&quot;].", "Array[any]", false, false, ""),params.query("count", "Number of rows to fetch.", "double", false, false, "")].concat([]).concat([]).concat([]),
    "type" : "List[Position]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Position]')],
    "nickname" : "find"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing find as a GET method?"});    
  }
};

