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

exports.getBucketed = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/quote/bucketed",
    "notes" : "",
    "summary" : "Get previous quotes bucketed by seconds.",
    "method": "GET",
    "params" : [params.query("symbol", "Instrument name.", "string", true, false, ""),params.query("binSize", "Time interval to bucket by. Available options: ['1m', '5m', '1h', '1d'].", "string", false, false, "", "1m"),params.query("startTime", "Start date. Expects ISO formatted date strings.", "Date", false, false, ""),params.query("endTime", "End Date. Expects ISO formatted date strings.", "Date", false, false, ""),params.query("count", "Number of buckets to fetch.", "double", false, false, "")].concat([]).concat([]).concat([]),
    "type" : "List[Quote]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Quote]')],
    "nickname" : "getBucketed"
  },
  'action': function (req,res) {
    if (!req.params.symbol) {
      throw errors.invalid('symbol');
    }
    writeResponse(res, {message: "how about implementing getBucketed as a GET method?"});    
  }
};

