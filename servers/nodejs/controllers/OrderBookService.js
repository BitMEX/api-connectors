'use strict';

exports.orderBook.getOrderBook = function(args, res, next) {
  /**
   * parameters expected in the args:
   * symbol (String)
   * depth (BigDecimal)
   **/

var examples = {};
  
  examples['application/json'] = [ {
  "symbol" : "aeiou",
  "askPrice" : 1.3579000000000001069366817318950779736042022705078125,
  "level" : 1.3579000000000001069366817318950779736042022705078125,
  "bidSize" : 1.3579000000000001069366817318950779736042022705078125,
  "bidPrice" : 1.3579000000000001069366817318950779736042022705078125,
  "askSize" : 1.3579000000000001069366817318950779736042022705078125,
  "timestamp" : "2015-11-30T19:35:59.591+0000"
} ];
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
