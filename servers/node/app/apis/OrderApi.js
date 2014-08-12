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

exports.order_newOrder = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/order/new",
    "notes" : "",
    "summary" : "Create a new order.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "order",
    "responseMessages" : [errors.invalid('id'), errors.notFound('order')],
    "nickname" : "order_newOrder"
  },
  'action': function (req,res) {
    if (!req.params.symbol) {
      throw errors.invalid('symbol');
    }
    if (!req.params.quantity) {
      throw errors.invalid('quantity');
    }
    if (!req.params.price) {
      throw errors.invalid('price');
    }
    writeResponse(res, {message: "how about implementing order_newOrder as a POST method?"});    
  }
};
exports.order_cancelOrder = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/order/cancel",
    "notes" : "",
    "summary" : "Cancel an order.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "order",
    "responseMessages" : [errors.invalid('id'), errors.notFound('order')],
    "nickname" : "order_cancelOrder"
  },
  'action': function (req,res) {
    if (!req.params.orderID) {
      throw errors.invalid('orderID');
    }
    writeResponse(res, {message: "how about implementing order_cancelOrder as a POST method?"});    
  }
};
exports.order_myOrders = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/order/myOrders",
    "notes" : "",
    "summary" : "Get your recent orders.",
    "method": "GET",
    "params" : [params.query("filter", "Table filter. Filter e.g. by symbol.", "object", false, false, ""),params.query("columns", "Which columns to fetch.", "array[string]", false, false, ""),params.query("count", "Number of rows to fetch", "double", false, false, "")].concat([]).concat([]).concat([]),
    "type" : "List[order]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[order]')],
    "nickname" : "order_myOrders"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing order_myOrders as a GET method?"});    
  }
};
exports.order_myOpenOrders = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/order/myOpenOrders",
    "notes" : "",
    "summary" : "Get your open orders.",
    "method": "GET",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "List[order]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[order]')],
    "nickname" : "order_myOpenOrders"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing order_myOpenOrders as a GET method?"});    
  }
};

