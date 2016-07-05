'use strict';

exports.quote.get = function(args, res, next) {
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
  "askPrice" : 1.3579000000000001069366817318950779736042022705078125,
  "bidSize" : 1.3579000000000001069366817318950779736042022705078125,
  "id" : 1.3579000000000001069366817318950779736042022705078125,
  "bidPrice" : 1.3579000000000001069366817318950779736042022705078125,
  "askSize" : 1.3579000000000001069366817318950779736042022705078125,
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

exports.quote.getBucketed = function(args, res, next) {
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
  "askPrice" : 1.3579000000000001069366817318950779736042022705078125,
  "bidSize" : 1.3579000000000001069366817318950779736042022705078125,
  "id" : 1.3579000000000001069366817318950779736042022705078125,
  "bidPrice" : 1.3579000000000001069366817318950779736042022705078125,
  "askSize" : 1.3579000000000001069366817318950779736042022705078125,
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

