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

exports.getMyExecutions = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/execution",
    "notes" : "",
    "summary" : "Get your executions. This includes each trade and insurance charge.",
    "method": "GET",
    "params" : [params.query("filter", "Table filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;}.", "object", false, false, ""),params.query("count", "Number of executions to fetch", "double", false, false, "", 100)].concat([]).concat([]).concat([]),
    "type" : "List[Execution]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Execution]')],
    "nickname" : "getMyExecutions"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing getMyExecutions as a GET method?"});    
  }
};

