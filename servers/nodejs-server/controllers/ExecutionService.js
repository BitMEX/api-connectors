'use strict';

exports.execution.get = function(args, res, next) {
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
  "homeNotional" : 1.3579000000000001069366817318950779736042022705078125,
  "pegOffsetValue" : 1.3579000000000001069366817318950779736042022705078125,
  "pegPriceType" : "aeiou",
  "execID" : "aeiou",
  "contingencyType" : "aeiou",
  "foreignNotional" : 1.3579000000000001069366817318950779736042022705078125,
  "lastMkt" : "aeiou",
  "simpleCumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "execCost" : 1.3579000000000001069366817318950779736042022705078125,
  "execComm" : 1.3579000000000001069366817318950779736042022705078125,
  "settlCurrency" : "aeiou",
  "ordRejReason" : "aeiou",
  "price" : 1.3579000000000001069366817318950779736042022705078125,
  "trdMatchID" : "aeiou",
  "orderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "currency" : "aeiou",
  "commission" : 1.3579000000000001069366817318950779736042022705078125,
  "text" : "aeiou",
  "execType" : "aeiou",
  "timeInForce" : "aeiou",
  "timestamp" : "2000-01-23T04:56:07.000+00:00",
  "ordStatus" : "aeiou",
  "side" : "aeiou",
  "simpleOrderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "orderID" : "aeiou",
  "lastPx" : 1.3579000000000001069366817318950779736042022705078125,
  "leavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "cumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "tradePublishIndicator" : "aeiou",
  "displayQty" : 1.3579000000000001069366817318950779736042022705078125,
  "simpleLeavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "clOrdID" : "aeiou",
  "lastQty" : 1.3579000000000001069366817318950779736042022705078125,
  "avgPx" : 1.3579000000000001069366817318950779736042022705078125,
  "multiLegReportingType" : "aeiou",
  "workingIndicator" : true,
  "lastLiquidityInd" : "aeiou",
  "transactTime" : "2000-01-23T04:56:07.000+00:00",
  "exDestination" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "underlyingLastPx" : 1.3579000000000001069366817318950779736042022705078125,
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

exports.execution.getTradeHistory = function(args, res, next) {
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
  "homeNotional" : 1.3579000000000001069366817318950779736042022705078125,
  "pegOffsetValue" : 1.3579000000000001069366817318950779736042022705078125,
  "pegPriceType" : "aeiou",
  "execID" : "aeiou",
  "contingencyType" : "aeiou",
  "foreignNotional" : 1.3579000000000001069366817318950779736042022705078125,
  "lastMkt" : "aeiou",
  "simpleCumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "execCost" : 1.3579000000000001069366817318950779736042022705078125,
  "execComm" : 1.3579000000000001069366817318950779736042022705078125,
  "settlCurrency" : "aeiou",
  "ordRejReason" : "aeiou",
  "price" : 1.3579000000000001069366817318950779736042022705078125,
  "trdMatchID" : "aeiou",
  "orderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "currency" : "aeiou",
  "commission" : 1.3579000000000001069366817318950779736042022705078125,
  "text" : "aeiou",
  "execType" : "aeiou",
  "timeInForce" : "aeiou",
  "timestamp" : "2000-01-23T04:56:07.000+00:00",
  "ordStatus" : "aeiou",
  "side" : "aeiou",
  "simpleOrderQty" : 1.3579000000000001069366817318950779736042022705078125,
  "orderID" : "aeiou",
  "lastPx" : 1.3579000000000001069366817318950779736042022705078125,
  "leavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "cumQty" : 1.3579000000000001069366817318950779736042022705078125,
  "tradePublishIndicator" : "aeiou",
  "displayQty" : 1.3579000000000001069366817318950779736042022705078125,
  "simpleLeavesQty" : 1.3579000000000001069366817318950779736042022705078125,
  "clOrdID" : "aeiou",
  "lastQty" : 1.3579000000000001069366817318950779736042022705078125,
  "avgPx" : 1.3579000000000001069366817318950779736042022705078125,
  "multiLegReportingType" : "aeiou",
  "workingIndicator" : true,
  "lastLiquidityInd" : "aeiou",
  "transactTime" : "2000-01-23T04:56:07.000+00:00",
  "exDestination" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "underlyingLastPx" : 1.3579000000000001069366817318950779736042022705078125,
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

