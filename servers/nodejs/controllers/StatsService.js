'use strict';

exports.stats.get = function(args, res, next) {
  /**
   * parameters expected in the args:
   **/

var examples = {};
  
  examples['application/json'] = [ {
  "openInterest" : 1.3579000000000001069366817318950779736042022705078125,
  "openValue" : 1.3579000000000001069366817318950779736042022705078125,
  "volume24h" : 1.3579000000000001069366817318950779736042022705078125,
  "currency" : "aeiou",
  "turnover24h" : 1.3579000000000001069366817318950779736042022705078125,
  "rootSymbol" : "aeiou"
} ];
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.stats.history = function(args, res, next) {
  /**
   * parameters expected in the args:
   **/

var examples = {};
  
  examples['application/json'] = [ {
  "date" : "2016-07-04T23:25:34.562+0000",
  "volume" : 1.3579000000000001069366817318950779736042022705078125,
  "currency" : "aeiou",
  "turnover" : 1.3579000000000001069366817318950779736042022705078125,
  "rootSymbol" : "aeiou"
} ];
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
