'use strict';

exports.order.getOrders = function(args, res, next) {
  /**
   * parameters expected in the args:
   * symbol (String)
   * filter (String)
   * columns (String)
   * count (BigDecimal)
   * start (BigDecimal)
   * reverse (Boolean)
   * startTime (date)
   * endTime (date)
   **/

var examples = {};
  
  examples['application/json'] = [ {
  "symbol" : "aeiou",
  "simpleCumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "settlCurrency" : "aeiou",
  "ordRejReason" : "aeiou",
  "price" : 1.3579000000000001069366817318950779736042022705078125,
  "orderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "currency" : "aeiou",
  "text" : "aeiou",
  "timeInForce" : "aeiou",
  "timestamp" : "2015-11-30T19:35:59.581+0000",
  "ordStatus" : "aeiou",
  "side" : "aeiou",
  "simpleOrderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "orderID" : "aeiou",
  "leavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "cumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "simpleLeavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "clOrdID" : "aeiou",
  "avgPx" : 1.3579000000000001069366817318950779736042022705078125,
  "multiLegReportingType" : "aeiou",
  "workingIndicator" : true,
  "transactTime" : "2015-11-30T19:35:59.581+0000",
  "exDestination" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "stopPx" : 1.3579000000000001069366817318950779736042022705078125,
  "ordType" : "aeiou",
  "minQty" : 1.3579000000000001069366817318950779736042022705078125
} ];
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.order.newOrder = function(args, res, next) {
  /**
   * parameters expected in the args:
   * symbol (String)
   * quantity (BigDecimal)
   * price (Double)
   * timeInForce (String)
   * type (String)
   * stopPrice (Double)
   * clOrdID (String)
   **/

var examples = {};
  
  examples['application/json'] = {
  "symbol" : "aeiou",
  "simpleCumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "settlCurrency" : "aeiou",
  "ordRejReason" : "aeiou",
  "price" : 1.3579000000000001069366817318950779736042022705078125,
  "orderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "currency" : "aeiou",
  "text" : "aeiou",
  "timeInForce" : "aeiou",
  "timestamp" : "2015-11-30T19:35:59.584+0000",
  "ordStatus" : "aeiou",
  "side" : "aeiou",
  "simpleOrderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "orderID" : "aeiou",
  "leavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "cumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "simpleLeavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "clOrdID" : "aeiou",
  "avgPx" : 1.3579000000000001069366817318950779736042022705078125,
  "multiLegReportingType" : "aeiou",
  "workingIndicator" : true,
  "transactTime" : "2015-11-30T19:35:59.584+0000",
  "exDestination" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "stopPx" : 1.3579000000000001069366817318950779736042022705078125,
  "ordType" : "aeiou",
  "minQty" : 1.3579000000000001069366817318950779736042022705078125
};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.order.cancelOrder = function(args, res, next) {
  /**
   * parameters expected in the args:
   * orderID (String)
   * clOrdID (String)
   * text (String)
   **/

var examples = {};
  
  examples['application/json'] = [ {
  "symbol" : "aeiou",
  "simpleCumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "settlCurrency" : "aeiou",
  "ordRejReason" : "aeiou",
  "price" : 1.3579000000000001069366817318950779736042022705078125,
  "orderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "currency" : "aeiou",
  "text" : "aeiou",
  "timeInForce" : "aeiou",
  "timestamp" : "2015-11-30T19:35:59.586+0000",
  "ordStatus" : "aeiou",
  "side" : "aeiou",
  "simpleOrderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "orderID" : "aeiou",
  "leavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "cumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "simpleLeavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "clOrdID" : "aeiou",
  "avgPx" : 1.3579000000000001069366817318950779736042022705078125,
  "multiLegReportingType" : "aeiou",
  "workingIndicator" : true,
  "transactTime" : "2015-11-30T19:35:59.586+0000",
  "exDestination" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "stopPx" : 1.3579000000000001069366817318950779736042022705078125,
  "ordType" : "aeiou",
  "minQty" : 1.3579000000000001069366817318950779736042022705078125
} ];
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.order.cancelAll = function(args, res, next) {
  /**
   * parameters expected in the args:
   * symbol (String)
   * filter (String)
   * text (String)
   **/

var examples = {};
  
  examples['application/json'] = { };
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.order.cancelAllAfter = function(args, res, next) {
  /**
   * parameters expected in the args:
   * timeout (Double)
   **/

var examples = {};
  
  examples['application/json'] = { };
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.order.closePosition = function(args, res, next) {
  /**
   * parameters expected in the args:
   * symbol (String)
   * price (Double)
   **/

var examples = {};
  
  examples['application/json'] = {
  "symbol" : "aeiou",
  "simpleCumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "settlCurrency" : "aeiou",
  "ordRejReason" : "aeiou",
  "price" : 1.3579000000000001069366817318950779736042022705078125,
  "orderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "currency" : "aeiou",
  "text" : "aeiou",
  "timeInForce" : "aeiou",
  "timestamp" : "2015-11-30T19:35:59.589+0000",
  "ordStatus" : "aeiou",
  "side" : "aeiou",
  "simpleOrderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "orderID" : "aeiou",
  "leavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "cumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "simpleLeavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "clOrdID" : "aeiou",
  "avgPx" : 1.3579000000000001069366817318950779736042022705078125,
  "multiLegReportingType" : "aeiou",
  "workingIndicator" : true,
  "transactTime" : "2015-11-30T19:35:59.589+0000",
  "exDestination" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "stopPx" : 1.3579000000000001069366817318950779736042022705078125,
  "ordType" : "aeiou",
  "minQty" : 1.3579000000000001069366817318950779736042022705078125
};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.order.getCloseOutOrders = function(args, res, next) {
  /**
   * parameters expected in the args:
   * filter (String)
   **/

var examples = {};
  
  examples['application/json'] = [ {
  "symbol" : "aeiou",
  "side" : "aeiou",
  "price" : 1.3579000000000001069366817318950779736042022705078125,
  "qty" : 1.3579000000000001069366817318950779736042022705078125
} ];
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
