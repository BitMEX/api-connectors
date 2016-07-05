'use strict';

exports.leaderboard.get = function(args, res, next) {
  /**
   * parameters expected in the args:
  * method (String)
  **/
    var examples = {};
  examples['application/json'] = [ {
  "isMe" : true,
  "name" : "aeiou",
  "isRealName" : true,
  "profit" : 1.3579000000000001069366817318950779736042022705078125
} ];
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

