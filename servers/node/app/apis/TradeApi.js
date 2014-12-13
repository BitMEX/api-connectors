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
    "path" : "/trade/bucketed",
    "notes" : "",
    "summary" : "Get previous trades bucketed by seconds.",
    "method": "GET",
    "params" : [params.query("symbol", "Instrument name.", "string", true, false, ""),params.query("binSize", "Time interval to bucket by. Available options: ['30s', '1m', '5m', '1h', '1d'].", "string", false, false, "", "1m"),params.query("startTime", "Start date. Expects ISO formatted date strings.", "Date", false, false, ""),params.query("endTime", "End Date. Expects ISO formatted date strings.", "Date", false, false, ""),params.query("count", "Number of buckets to fetch.", "double", false, false, ""),params.query("useMillisecondTime", "Return dates in milliseconds (GMT). Useful for charting.", "boolean", false, false, "")].concat([]).concat([]).concat([]),
    "type" : "List[TradeBin]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[TradeBin]')],
    "nickname" : "getBucketed"
  },
  'action': function (req,res) {
    if (!req.params.symbol) {
      throw errors.invalid('symbol');
    }
    writeResponse(res, {message: "how about implementing getBucketed as a GET method?"});    
  }
};
exports.getByDate = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/trade/byDate",
    "notes" : "",
    "summary" : "Get trades between two dates.",
    "method": "GET",
    "params" : [params.query("symbol", "Instrument name.", "string", false, false, ""),params.query("startTime", "Start date.", "Date", true, false, ""),params.query("endTime", "End Date.", "Date", false, false, "")].concat([]).concat([]).concat([]),
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
    "summary" : "Get recent trades.",
    "method": "GET",
    "params" : [params.query("symbol", "Instrument name.", "string", false, false, ""),params.query("count", "Number of trades to fetch", "double", true, false, "", 100)].concat([]).concat([]).concat([]),
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

