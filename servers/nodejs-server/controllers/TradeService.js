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
  "timestamp" : "2000-01-23T04:56:07.000+00:00"
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
  "timestamp" : "2000-01-23T04:56:07.000+00:00"
} ];
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

