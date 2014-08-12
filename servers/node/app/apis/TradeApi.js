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

exports.trade_getBucketed = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/trade/getBucketed",
    "notes" : "",
    "summary" : "Get previous trades bucketed by seconds.",
    "method": "GET",
    "params" : [params.query("symbol", "Instrument name.", "string", true, false, ""),params.query("binSize", "Time interval to bucket by. Available options: ['30s', '5m', '1h', '1d'].", "string", false, false, "", "30s"),params.query("startTime", "Start date.", "Date", false, false, ""),params.query("endTime", "End Date.", "Date", false, false, ""),params.query("count", "Number of buckets to fetch", "double", false, false, ""),params.query("useMillisecondTime", "Return dates in milliseconds (GMT). Useful for charting.", "boolean", false, false, "")].concat([]).concat([]).concat([]),
    "type" : "List[tradeBin]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[tradeBin]')],
    "nickname" : "trade_getBucketed"
  },
  'action': function (req,res) {
    if (!req.params.symbol) {
      throw errors.invalid('symbol');
    }
    writeResponse(res, {message: "how about implementing trade_getBucketed as a GET method?"});    
  }
};
exports.trade_getByDate = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/trade/getByDate",
    "notes" : "",
    "summary" : "Get trades within two dates.",
    "method": "GET",
    "params" : [params.query("symbol", "Instrument name.", "string", true, false, ""),params.query("starttime", "Start date.", "Date", true, false, ""),params.query("endtime", "End Date.", "Date", false, false, "")].concat([]).concat([]).concat([]),
    "type" : "List[trade]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[trade]')],
    "nickname" : "trade_getByDate"
  },
  'action': function (req,res) {
    if (!req.params.symbol) {
      throw errors.invalid('symbol');
    }
    if (!req.params.starttime) {
      throw errors.invalid('starttime');
    }
    writeResponse(res, {message: "how about implementing trade_getByDate as a GET method?"});    
  }
};
exports.trade_getRecent = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/trade/getRecent",
    "notes" : "",
    "summary" : "Get recent trades.",
    "method": "GET",
    "params" : [params.query("symbol", "Instrument name.", "string", true, false, ""),params.query("count", "Number of trades to fetch", "double", true, false, "")].concat([]).concat([]).concat([]),
    "type" : "List[any]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[any]')],
    "nickname" : "trade_getRecent"
  },
  'action': function (req,res) {
    if (!req.params.symbol) {
      throw errors.invalid('symbol');
    }
    if (!req.params.count) {
      throw errors.invalid('count');
    }
    writeResponse(res, {message: "how about implementing trade_getRecent as a GET method?"});    
  }
};

