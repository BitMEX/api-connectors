'use strict';

exports.chat.get = function(args, res, next) {
  /**
   * parameters expected in the args:
  * count (BigDecimal)
  * start (BigDecimal)
  * reverse (Boolean)
  **/
    var examples = {};
  examples['application/json'] = [ {
  "date" : "2000-01-23T04:56:07.000+00:00",
  "html" : "aeiou",
  "id" : 1.3579000000000001069366817318950779736042022705078125,
  "message" : "aeiou",
  "user" : "aeiou",
  "fromBot" : true
} ];
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

exports.chat.getConnected = function(args, res, next) {
  /**
   * parameters expected in the args:
  **/
    var examples = {};
  examples['application/json'] = {
  "bots" : 1.3579000000000001069366817318950779736042022705078125,
  "users" : 1.3579000000000001069366817318950779736042022705078125
};
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

exports.chat.new = function(args, res, next) {
  /**
   * parameters expected in the args:
  * message (String)
  **/
    var examples = {};
  examples['application/json'] = {
  "date" : "2000-01-23T04:56:07.000+00:00",
  "html" : "aeiou",
  "id" : 1.3579000000000001069366817318950779736042022705078125,
  "message" : "aeiou",
  "user" : "aeiou",
  "fromBot" : true
};
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

