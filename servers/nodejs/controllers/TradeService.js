'use strict';

exports.trade.get = function(args, res, next) {
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
  "foreignNotional" : 1.3579000000000001069366817318950779736042022705078125,
  "symbol" : "aeiou",
  "side" : "aeiou",
  "tickDirection" : "aeiou",
  "size" : 1.3579000000000001069366817318950779736042022705078125,
  "price" : 1.3579000000000001069366817318950779736042022705078125,
  "grossValue" : 1.3579000000000001069366817318950779736042022705078125,
  "trdMatchID" : "aeiou",
  "homeNotional" : 1.3579000000000001069366817318950779736042022705078125,
  "id" : 1.3579000000000001069366817318950779736042022705078125,
  "timestamp" : "2015-11-30T19:35:59.608+0000"
} ];
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.trade.getBucketed = function(args, res, next) {
  /**
   * parameters expected in the args:
   * binSize (String)
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
  "vwap" : 1.3579000000000001069366817318950779736042022705078125,
  "trades" : 1.3579000000000001069366817318950779736042022705078125,
  "homeNotional" : 1.3579000000000001069366817318950779736042022705078125,
  "volume" : 1.3579000000000001069366817318950779736042022705078125,
  "foreignNotional" : 1.3579000000000001069366817318950779736042022705078125,
  "high" : 1.3579000000000001069366817318950779736042022705078125,
  "low" : 1.3579000000000001069366817318950779736042022705078125,
  "lastSize" : 1.3579000000000001069366817318950779736042022705078125,
  "id" : 1.3579000000000001069366817318950779736042022705078125,
  "close" : 1.3579000000000001069366817318950779736042022705078125,
  "turnover" : 1.3579000000000001069366817318950779736042022705078125,
  "open" : 1.3579000000000001069366817318950779736042022705078125,
  "timestamp" : "2015-11-30T19:35:59.609+0000"
} ];
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.trade.getByDate = function(args, res, next) {
  /**
   * parameters expected in the args:
   * startTime (date)
   * symbol (String)
   * endTime (date)
   **/

var examples = {};
  
  examples['application/json'] = [ {
  "foreignNotional" : 1.3579000000000001069366817318950779736042022705078125,
  "symbol" : "aeiou",
  "side" : "aeiou",
  "tickDirection" : "aeiou",
  "size" : 1.3579000000000001069366817318950779736042022705078125,
  "price" : 1.3579000000000001069366817318950779736042022705078125,
  "grossValue" : 1.3579000000000001069366817318950779736042022705078125,
  "trdMatchID" : "aeiou",
  "homeNotional" : 1.3579000000000001069366817318950779736042022705078125,
  "id" : 1.3579000000000001069366817318950779736042022705078125,
  "timestamp" : "2015-11-30T19:35:59.610+0000"
} ];
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.trade.getRecent = function(args, res, next) {
  /**
   * parameters expected in the args:
   * count (BigDecimal)
   * symbol (String)
   **/

var examples = {};
  
  examples['application/json'] = [ {
  "foreignNotional" : 1.3579000000000001069366817318950779736042022705078125,
  "symbol" : "aeiou",
  "side" : "aeiou",
  "tickDirection" : "aeiou",
  "size" : 1.3579000000000001069366817318950779736042022705078125,
  "price" : 1.3579000000000001069366817318950779736042022705078125,
  "grossValue" : 1.3579000000000001069366817318950779736042022705078125,
  "trdMatchID" : "aeiou",
  "homeNotional" : 1.3579000000000001069366817318950779736042022705078125,
  "id" : 1.3579000000000001069366817318950779736042022705078125,
  "timestamp" : "2015-11-30T19:35:59.611+0000"
} ];
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
