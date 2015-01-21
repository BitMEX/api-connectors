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

exports.getOrderBook = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/orderBook",
    "notes" : "",
    "summary" : "Get current orderbook.",
    "method": "GET",
    "params" : [params.query("symbol", "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.", "string", true, false, ""),params.query("depth", "Orderbook depth.", "double", , false, "", 25)].concat([]).concat([]).concat([]),
    "type" : "List[OrderBook]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[OrderBook]')],
    "nickname" : "getOrderBook"
  },
  'action': function (req,res) {
    if (!req.params.symbol) {
      throw errors.invalid('symbol');
    }
    writeResponse(res, {message: "how about implementing getOrderBook as a GET method?"});    
  }
};

