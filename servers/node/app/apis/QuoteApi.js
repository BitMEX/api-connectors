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

exports.quote_getBucketed = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/quote/getBucketed",
    "notes" : "",
    "summary" : "Get previous quotes bucketed by seconds.",
    "method": "GET",
    "params" : [params.query("symbol", "Instrument name.", "string", true, false, ""),params.query("binSize", "Time interval to bucket by. Available options: ['30s', '5m', '1h', '1d'].", "string", false, false, "", "30s"),params.query("startTime", "Start date.", "Date", false, false, ""),params.query("endTime", "End Date.", "Date", false, false, ""),params.query("count", "Number of buckets to fetch", "double", false, false, "")].concat([]).concat([]).concat([]),
    "type" : "List[quote]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[quote]')],
    "nickname" : "quote_getBucketed"
  },
  'action': function (req,res) {
    if (!req.params.symbol) {
      throw errors.invalid('symbol');
    }
    writeResponse(res, {message: "how about implementing quote_getBucketed as a GET method?"});    
  }
};

