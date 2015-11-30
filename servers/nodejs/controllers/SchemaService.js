'use strict';

exports.schema.find = function(args, res, next) {
  /**
   * parameters expected in the args:
   * model (String)
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
exports.schema.websocketHelp = function(args, res, next) {
  /**
   * parameters expected in the args:
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
