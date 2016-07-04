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
  "triggered" : "aeiou",
  "clOrdLinkID" : "aeiou",
  "execInst" : "aeiou",
  "pegOffsetValue" : 1.3579000000000001069366817318950779736042022705078125,
  "pegPriceType" : "aeiou",
  "contingencyType" : "aeiou",
  "simpleCumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "settlCurrency" : "aeiou",
  "ordRejReason" : "aeiou",
  "price" : 1.3579000000000001069366817318950779736042022705078125,
  "orderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "currency" : "aeiou",
  "text" : "aeiou",
  "timeInForce" : "aeiou",
  "timestamp" : "2016-07-04T23:25:34.530+0000",
  "ordStatus" : "aeiou",
  "side" : "aeiou",
  "simpleOrderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "orderID" : "aeiou",
  "leavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "cumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "displayQty" : 1.3579000000000001069366817318950779736042022705078125,
  "simpleLeavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "clOrdID" : "aeiou",
  "avgPx" : 1.3579000000000001069366817318950779736042022705078125,
  "multiLegReportingType" : "aeiou",
  "workingIndicator" : true,
  "transactTime" : "2016-07-04T23:25:34.530+0000",
  "exDestination" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "stopPx" : 1.3579000000000001069366817318950779736042022705078125,
  "ordType" : "aeiou"
} ];
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.order.amend = function(args, res, next) {
  /**
   * parameters expected in the args:
   * orderID (String)
   * clOrdID (String)
   * simpleOrderQty (Double)
   * orderQty (BigDecimal)
   * simpleLeavesQty (Double)
   * leavesQty (BigDecimal)
   * price (Double)
   * stopPx (Double)
   * pegOffsetValue (Double)
   * text (String)
   **/

var examples = {};
  
  examples['application/json'] = {
  "symbol" : "aeiou",
  "triggered" : "aeiou",
  "clOrdLinkID" : "aeiou",
  "execInst" : "aeiou",
  "pegOffsetValue" : 1.3579000000000001069366817318950779736042022705078125,
  "pegPriceType" : "aeiou",
  "contingencyType" : "aeiou",
  "simpleCumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "settlCurrency" : "aeiou",
  "ordRejReason" : "aeiou",
  "price" : 1.3579000000000001069366817318950779736042022705078125,
  "orderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "currency" : "aeiou",
  "text" : "aeiou",
  "timeInForce" : "aeiou",
  "timestamp" : "2016-07-04T23:25:34.532+0000",
  "ordStatus" : "aeiou",
  "side" : "aeiou",
  "simpleOrderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "orderID" : "aeiou",
  "leavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "cumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "displayQty" : 1.3579000000000001069366817318950779736042022705078125,
  "simpleLeavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "clOrdID" : "aeiou",
  "avgPx" : 1.3579000000000001069366817318950779736042022705078125,
  "multiLegReportingType" : "aeiou",
  "workingIndicator" : true,
  "transactTime" : "2016-07-04T23:25:34.532+0000",
  "exDestination" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "stopPx" : 1.3579000000000001069366817318950779736042022705078125,
  "ordType" : "aeiou"
};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.order.new = function(args, res, next) {
  /**
   * parameters expected in the args:
   * symbol (String)
   * side (String)
   * simpleOrderQty (Double)
   * quantity (BigDecimal)
   * orderQty (BigDecimal)
   * price (Double)
   * displayQty (BigDecimal)
   * stopPrice (Double)
   * stopPx (Double)
   * clOrdID (String)
   * clOrdLinkID (String)
   * pegOffsetValue (Double)
   * pegPriceType (String)
   * type (String)
   * ordType (String)
   * timeInForce (String)
   * execInst (String)
   * contingencyType (String)
   * text (String)
   **/

var examples = {};
  
  examples['application/json'] = {
  "symbol" : "aeiou",
  "triggered" : "aeiou",
  "clOrdLinkID" : "aeiou",
  "execInst" : "aeiou",
  "pegOffsetValue" : 1.3579000000000001069366817318950779736042022705078125,
  "pegPriceType" : "aeiou",
  "contingencyType" : "aeiou",
  "simpleCumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "settlCurrency" : "aeiou",
  "ordRejReason" : "aeiou",
  "price" : 1.3579000000000001069366817318950779736042022705078125,
  "orderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "currency" : "aeiou",
  "text" : "aeiou",
  "timeInForce" : "aeiou",
  "timestamp" : "2016-07-04T23:25:34.533+0000",
  "ordStatus" : "aeiou",
  "side" : "aeiou",
  "simpleOrderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "orderID" : "aeiou",
  "leavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "cumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "displayQty" : 1.3579000000000001069366817318950779736042022705078125,
  "simpleLeavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "clOrdID" : "aeiou",
  "avgPx" : 1.3579000000000001069366817318950779736042022705078125,
  "multiLegReportingType" : "aeiou",
  "workingIndicator" : true,
  "transactTime" : "2016-07-04T23:25:34.533+0000",
  "exDestination" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "stopPx" : 1.3579000000000001069366817318950779736042022705078125,
  "ordType" : "aeiou"
};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.order.cancel = function(args, res, next) {
  /**
   * parameters expected in the args:
   * orderID (String)
   * clOrdID (String)
   * text (String)
   **/

var examples = {};
  
  examples['application/json'] = [ {
  "symbol" : "aeiou",
  "triggered" : "aeiou",
  "clOrdLinkID" : "aeiou",
  "execInst" : "aeiou",
  "pegOffsetValue" : 1.3579000000000001069366817318950779736042022705078125,
  "pegPriceType" : "aeiou",
  "contingencyType" : "aeiou",
  "simpleCumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "settlCurrency" : "aeiou",
  "ordRejReason" : "aeiou",
  "price" : 1.3579000000000001069366817318950779736042022705078125,
  "orderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "currency" : "aeiou",
  "text" : "aeiou",
  "timeInForce" : "aeiou",
  "timestamp" : "2016-07-04T23:25:34.537+0000",
  "ordStatus" : "aeiou",
  "side" : "aeiou",
  "simpleOrderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "orderID" : "aeiou",
  "leavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "cumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "displayQty" : 1.3579000000000001069366817318950779736042022705078125,
  "simpleLeavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "clOrdID" : "aeiou",
  "avgPx" : 1.3579000000000001069366817318950779736042022705078125,
  "multiLegReportingType" : "aeiou",
  "workingIndicator" : true,
  "transactTime" : "2016-07-04T23:25:34.537+0000",
  "exDestination" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "stopPx" : 1.3579000000000001069366817318950779736042022705078125,
  "ordType" : "aeiou"
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
exports.order.amendBulk = function(args, res, next) {
  /**
   * parameters expected in the args:
   * orders (String)
   **/

var examples = {};
  
  examples['application/json'] = [ {
  "symbol" : "aeiou",
  "triggered" : "aeiou",
  "clOrdLinkID" : "aeiou",
  "execInst" : "aeiou",
  "pegOffsetValue" : 1.3579000000000001069366817318950779736042022705078125,
  "pegPriceType" : "aeiou",
  "contingencyType" : "aeiou",
  "simpleCumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "settlCurrency" : "aeiou",
  "ordRejReason" : "aeiou",
  "price" : 1.3579000000000001069366817318950779736042022705078125,
  "orderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "currency" : "aeiou",
  "text" : "aeiou",
  "timeInForce" : "aeiou",
  "timestamp" : "2016-07-04T23:25:34.540+0000",
  "ordStatus" : "aeiou",
  "side" : "aeiou",
  "simpleOrderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "orderID" : "aeiou",
  "leavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "cumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "displayQty" : 1.3579000000000001069366817318950779736042022705078125,
  "simpleLeavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "clOrdID" : "aeiou",
  "avgPx" : 1.3579000000000001069366817318950779736042022705078125,
  "multiLegReportingType" : "aeiou",
  "workingIndicator" : true,
  "transactTime" : "2016-07-04T23:25:34.540+0000",
  "exDestination" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "stopPx" : 1.3579000000000001069366817318950779736042022705078125,
  "ordType" : "aeiou"
} ];
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.order.newBulk = function(args, res, next) {
  /**
   * parameters expected in the args:
   * orders (String)
   **/

var examples = {};
  
  examples['application/json'] = [ {
  "symbol" : "aeiou",
  "triggered" : "aeiou",
  "clOrdLinkID" : "aeiou",
  "execInst" : "aeiou",
  "pegOffsetValue" : 1.3579000000000001069366817318950779736042022705078125,
  "pegPriceType" : "aeiou",
  "contingencyType" : "aeiou",
  "simpleCumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "settlCurrency" : "aeiou",
  "ordRejReason" : "aeiou",
  "price" : 1.3579000000000001069366817318950779736042022705078125,
  "orderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "currency" : "aeiou",
  "text" : "aeiou",
  "timeInForce" : "aeiou",
  "timestamp" : "2016-07-04T23:25:34.542+0000",
  "ordStatus" : "aeiou",
  "side" : "aeiou",
  "simpleOrderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "orderID" : "aeiou",
  "leavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "cumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "displayQty" : 1.3579000000000001069366817318950779736042022705078125,
  "simpleLeavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "clOrdID" : "aeiou",
  "avgPx" : 1.3579000000000001069366817318950779736042022705078125,
  "multiLegReportingType" : "aeiou",
  "workingIndicator" : true,
  "transactTime" : "2016-07-04T23:25:34.542+0000",
  "exDestination" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "stopPx" : 1.3579000000000001069366817318950779736042022705078125,
  "ordType" : "aeiou"
} ];
  

  
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
  "triggered" : "aeiou",
  "clOrdLinkID" : "aeiou",
  "execInst" : "aeiou",
  "pegOffsetValue" : 1.3579000000000001069366817318950779736042022705078125,
  "pegPriceType" : "aeiou",
  "contingencyType" : "aeiou",
  "simpleCumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "settlCurrency" : "aeiou",
  "ordRejReason" : "aeiou",
  "price" : 1.3579000000000001069366817318950779736042022705078125,
  "orderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "currency" : "aeiou",
  "text" : "aeiou",
  "timeInForce" : "aeiou",
  "timestamp" : "2016-07-04T23:25:34.543+0000",
  "ordStatus" : "aeiou",
  "side" : "aeiou",
  "simpleOrderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "orderID" : "aeiou",
  "leavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "cumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "displayQty" : 1.3579000000000001069366817318950779736042022705078125,
  "simpleLeavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "clOrdID" : "aeiou",
  "avgPx" : 1.3579000000000001069366817318950779736042022705078125,
  "multiLegReportingType" : "aeiou",
  "workingIndicator" : true,
  "transactTime" : "2016-07-04T23:25:34.543+0000",
  "exDestination" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "stopPx" : 1.3579000000000001069366817318950779736042022705078125,
  "ordType" : "aeiou"
};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
