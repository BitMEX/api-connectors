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
    "path" : "/trade",
    "notes" : "",
    "summary" : "Get Trades.",
    "method": "GET",
    "params" : [params.query("symbol", "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.", "string", false, false, ""),params.query("filter", "Generic table filter. Send JSON key/value pairs, such as {&quot;key&quot;: &quot;value&quot;}.", "object", false, false, ""),params.query("columns", "Array of column names to fetch. If omitted, will return all columns. Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.", "Array[string]", false, false, ""),params.query("count", "Number of results to fetch.", "double", false, false, "", 100),params.query("start", "Starting point for results.", "double", false, false, ""),params.query("reverse", "If true, will sort results newest first.", "boolean", false, false, ""),params.query("startTime", "Starting date filter for results.", "Date", false, false, ""),params.query("endTime", "Ending date filter for results.", "Date", false, false, "")].concat([]).concat([]).concat([]),
    "type" : "List[Trade]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Trade]')],
    "nickname" : "get"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing get as a GET method?"});    
  }
};
exports.getBucketed = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/trade/bucketed",
    "notes" : "",
    "summary" : "Get previous trades in time buckets.",
    "method": "GET",
    "params" : [params.query("binSize", "Time interval to bucket by. Available options: ['30s', '1m', '5m', '1h', '1d'].", "string", false, false, "", "1m"),params.query("symbol", "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.", "string", false, false, ""),params.query("filter", "Generic table filter. Send JSON key/value pairs, such as {&quot;key&quot;: &quot;value&quot;}.", "object", false, false, ""),params.query("columns", "Array of column names to fetch. If omitted, will return all columns. Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.", "Array[string]", false, false, ""),params.query("count", "Number of results to fetch.", "double", false, false, "", 100),params.query("start", "Starting point for results.", "double", false, false, ""),params.query("reverse", "If true, will sort results newest first.", "boolean", false, false, ""),params.query("startTime", "Starting date filter for results.", "Date", false, false, ""),params.query("endTime", "Ending date filter for results.", "Date", false, false, "")].concat([]).concat([]).concat([]),
    "type" : "List[TradeBin]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[TradeBin]')],
    "nickname" : "getBucketed"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing getBucketed as a GET method?"});    
  }
};
exports.getByDate = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/trade/byDate",
    "notes" : "",
    "summary" : "Get trades between two dates. [Deprecated, use GET /trades]",
    "method": "GET",
    "params" : [params.query("symbol", "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.", "string", false, false, ""),params.query("startTime", "Start date.", "Date", true, false, ""),params.query("endTime", "End Date.", "Date", false, false, "")].concat([]).concat([]).concat([]),
    "type" : "List[Trade]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Trade]')],
    "nickname" : "getByDate"
  },
  'action': function (req,res) {
    if (!req.params.startTime) {
      throw errors.invalid('startTime');
    }
    writeResponse(res, {message: "how about implementing getByDate as a GET method?"});    
  }
};
exports.getRecent = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/trade/recent",
    "notes" : "",
    "summary" : "Get recent trades. [Deprecated, use GET /trades]",
    "method": "GET",
    "params" : [params.query("symbol", "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.", "string", false, false, ""),params.query("count", "Number of trades to fetch.", "double", true, false, "", 100)].concat([]).concat([]).concat([]),
    "type" : "List[Trade]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Trade]')],
    "nickname" : "getRecent"
  },
  'action': function (req,res) {
    if (!req.params.count) {
      throw errors.invalid('count');
    }
    writeResponse(res, {message: "how about implementing getRecent as a GET method?"});    
  }
};

