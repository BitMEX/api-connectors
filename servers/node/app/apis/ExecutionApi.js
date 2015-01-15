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
    "path" : "/execution",
    "notes" : "This returns all raw transactions, which includes order opening and cancelation, and order status changes. It can be quite noisy. More focused information is available at /execution/tradeHistory. You may also use the `filter` param to target your query. Specify an array as a filter value, such as {"execType": ["Settlement", "Trade"]} to filter on multiple values.",
    "summary" : "Get all raw executions for your account.",
    "method": "GET",
    "params" : [params.query("symbol", "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.", "string", false, false, ""),params.query("filter", "Generic table filter. Send JSON key/value pairs, such as {&quot;key&quot;: &quot;value&quot;}.", "object", false, false, ""),params.query("columns", "Array of column names to fetch. If omitted, will return all columns. Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.", "Array[string]", false, false, ""),params.query("count", "Number of results to fetch.", "double", false, false, "", 100),params.query("start", "Starting point for results.", "double", false, false, ""),params.query("reverse", "If true, will sort results newest first.", "boolean", false, false, ""),params.query("startTime", "Starting date filter for results.", "Date", false, false, ""),params.query("endTime", "Ending date filter for results.", "Date", false, false, "")].concat([]).concat([]).concat([]),
    "type" : "List[Execution]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Execution]')],
    "nickname" : "get"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing get as a GET method?"});    
  }
};
exports.getTradeHistory = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/execution/tradeHistory",
    "notes" : "",
    "summary" : "Get all balance-affecting executions. This includes each trade, insurance charge, and settlement.",
    "method": "GET",
    "params" : [params.query("symbol", "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.", "string", false, false, ""),params.query("filter", "Generic table filter. Send JSON key/value pairs, such as {&quot;key&quot;: &quot;value&quot;}.", "object", false, false, ""),params.query("columns", "Array of column names to fetch. If omitted, will return all columns. Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.", "Array[string]", false, false, ""),params.query("count", "Number of results to fetch.", "double", false, false, "", 100),params.query("start", "Starting point for results.", "double", false, false, ""),params.query("reverse", "If true, will sort results newest first.", "boolean", false, false, ""),params.query("startTime", "Starting date filter for results.", "Date", false, false, ""),params.query("endTime", "Ending date filter for results.", "Date", false, false, "")].concat([]).concat([]).concat([]),
    "type" : "List[Execution]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Execution]')],
    "nickname" : "getTradeHistory"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing getTradeHistory as a GET method?"});    
  }
};

