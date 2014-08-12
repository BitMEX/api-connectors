var swagger = require("swagger-node-express");
var url = require("url");
var errors = swagger.errors;
var params = swagger.params;

/* add model includes */

function writeResponse (response, data) {
  response.header('Access-Control-Allow-Origin', "*");
  response.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
  response.header("Access-Control-Allow-Headers", "Content-Type");
  response.header("Content-Type", "application/json; charset=utf-8");
  response.send(JSON.stringify(data));
}

exports.models = models = require("../models.js");

exports.leaderboard_getOrderBook = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/leaderboard",
    "notes" : "",
    "summary" : "Get current leaderboard.",
    "method": "GET",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "List[leaderboard]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[leaderboard]')],
    "nickname" : "leaderboard_getOrderBook"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing leaderboard_getOrderBook as a GET method?"});    
  }
};

