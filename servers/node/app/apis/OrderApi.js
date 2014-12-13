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

exports.newOrder = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/order/new",
    "notes" : "",
    "summary" : "Create a new order. [Deprecated]",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "Order",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Order')],
    "nickname" : "newOrder"
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
    writeResponse(res, {message: "how about implementing newOrder as a POST method?"});    
  }
};
exports.newOrder_OrderApi_0 = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/order",
    "notes" : "If you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions executions (including on the WebSocket), and can be used to cancel the order.",
    "summary" : "Create a new order.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "Order",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Order')],
    "nickname" : "newOrder_OrderApi_0"
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
    writeResponse(res, {message: "how about implementing newOrder_OrderApi_0 as a POST method?"});    
  }
};
exports.cancelOrder = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/order",
    "notes" : "Either an orderID or a clOrdID must be provided.",
    "summary" : "Cancel order(s). Send multiple order IDs to cancel in bulk.",
    "method": "DELETE",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "List[Order]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Order]')],
    "nickname" : "cancelOrder"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing cancelOrder as a DELETE method?"});    
  }
};
exports.getOrders = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/order",
    "notes" : "",
    "summary" : "Get your orders.",
    "method": "GET",
    "params" : [params.query("filter", "Filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;, &quot;open&quot;: true}.", "object", false, false, ""),params.query("columns", "Which columns to fetch. For example, send [&quot;columnName&quot;].", "Array[any]", false, false, ""),params.query("count", "Number of rows to fetch.", "double", false, false, "")].concat([]).concat([]).concat([]),
    "type" : "List[Order]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Order]')],
    "nickname" : "getOrders"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing getOrders as a GET method?"});    
  }
};
exports.cancelOrder_OrderApi_0 = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/order/cancel",
    "notes" : "",
    "summary" : "Cancel order(s). Send multiple order IDs to cancel in bulk. [Deprecated]",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "List[Order]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Order]')],
    "nickname" : "cancelOrder_OrderApi_0"
  },
  'action': function (req,res) {
    if (!req.params.orderID) {
      throw errors.invalid('orderID');
    }
    writeResponse(res, {message: "how about implementing cancelOrder_OrderApi_0 as a POST method?"});    
  }
};
exports.getOrders_OrderApi_0 = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/order/myOrders",
    "notes" : "",
    "summary" : "Get your orders. [Deprecated, use GET /order]",
    "method": "GET",
    "params" : [params.query("filter", "Filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;, &quot;open&quot;: true}.", "object", false, false, ""),params.query("columns", "Which columns to fetch. For example, send [&quot;columnName&quot;].", "Array[any]", false, false, ""),params.query("count", "Number of rows to fetch.", "double", false, false, "")].concat([]).concat([]).concat([]),
    "type" : "List[Order]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Order]')],
    "nickname" : "getOrders_OrderApi_0"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing getOrders_OrderApi_0 as a GET method?"});    
  }
};
exports.getOrders_OrderApi_1 = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/order/myOpenOrders",
    "notes" : "",
    "summary" : "Get your open orders.",
    "method": "GET",
    "params" : [params.query("filter", "Filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;, &quot;open&quot;: true}.", "object", false, false, ""),params.query("columns", "Which columns to fetch. For example, send [&quot;columnName&quot;].", "Array[any]", false, false, ""),params.query("count", "Number of rows to fetch.", "double", false, false, "")].concat([]).concat([]).concat([]),
    "type" : "List[Order]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Order]')],
    "nickname" : "getOrders_OrderApi_1"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing getOrders_OrderApi_1 as a GET method?"});    
  }
};
exports.cancelAllAfter = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/order/cancelAllAfter",
    "notes" : "Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. <br><br>Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.<br><br>This is also available via <a href="https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-">WebSocket</a>.",
    "summary" : "Automatically cancel all your orders after a specified timeout.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "Any",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Any')],
    "nickname" : "cancelAllAfter"
  },
  'action': function (req,res) {
    if (!req.params.timeout) {
      throw errors.invalid('timeout');
    }
    writeResponse(res, {message: "how about implementing cancelAllAfter as a POST method?"});    
  }
};

