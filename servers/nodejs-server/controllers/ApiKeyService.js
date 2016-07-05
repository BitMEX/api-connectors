'use strict';

exports.apiKey.disable = function(args, res, next) {
  /**
   * parameters expected in the args:
  * apiKeyID (String)
  **/
    var examples = {};
  examples['application/json'] = {
  "permissions" : [ "aeiou" ],
  "created" : "2000-01-23T04:56:07.000+00:00",
  "name" : "aeiou",
  "cidr" : "aeiou",
  "id" : "aeiou",
  "secret" : "aeiou",
  "nonce" : 1.3579000000000001069366817318950779736042022705078125,
  "userId" : 1.3579000000000001069366817318950779736042022705078125,
  "enabled" : true
};
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

exports.apiKey.enable = function(args, res, next) {
  /**
   * parameters expected in the args:
  * apiKeyID (String)
  **/
    var examples = {};
  examples['application/json'] = {
  "permissions" : [ "aeiou" ],
  "created" : "2000-01-23T04:56:07.000+00:00",
  "name" : "aeiou",
  "cidr" : "aeiou",
  "id" : "aeiou",
  "secret" : "aeiou",
  "nonce" : 1.3579000000000001069366817318950779736042022705078125,
  "userId" : 1.3579000000000001069366817318950779736042022705078125,
  "enabled" : true
};
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

exports.apiKey.get = function(args, res, next) {
  /**
   * parameters expected in the args:
  * reverse (Boolean)
  **/
    var examples = {};
  examples['application/json'] = [ {
  "permissions" : [ "aeiou" ],
  "created" : "2000-01-23T04:56:07.000+00:00",
  "name" : "aeiou",
  "cidr" : "aeiou",
  "id" : "aeiou",
  "secret" : "aeiou",
  "nonce" : 1.3579000000000001069366817318950779736042022705078125,
  "userId" : 1.3579000000000001069366817318950779736042022705078125,
  "enabled" : true
} ];
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

exports.apiKey.new = function(args, res, next) {
  /**
   * parameters expected in the args:
  * name (String)
  * cidr (String)
  * permissions (String)
  * enabled (Boolean)
  * token (String)
  **/
    var examples = {};
  examples['application/json'] = {
  "permissions" : [ "aeiou" ],
  "created" : "2000-01-23T04:56:07.000+00:00",
  "name" : "aeiou",
  "cidr" : "aeiou",
  "id" : "aeiou",
  "secret" : "aeiou",
  "nonce" : 1.3579000000000001069366817318950779736042022705078125,
  "userId" : 1.3579000000000001069366817318950779736042022705078125,
  "enabled" : true
};
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

exports.apiKey.remove = function(args, res, next) {
  /**
   * parameters expected in the args:
  * apiKeyID (String)
  **/
    var examples = {};
  examples['application/json'] = {
  "success" : true
};
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

