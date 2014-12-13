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

exports.createKey = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/apiKey",
    "notes" : "API Keys can also be created via<a href="https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py">this Python script</a>.",
    "summary" : "Create a new API Key.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "ApiKey",
    "responseMessages" : [errors.invalid('id'), errors.notFound('ApiKey')],
    "nickname" : "createKey"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing createKey as a POST method?"});    
  }
};
exports.getKeys = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/apiKey",
    "notes" : "",
    "summary" : "Get your API Keys.",
    "method": "GET",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "List[ApiKey]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[ApiKey]')],
    "nickname" : "getKeys"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing getKeys as a GET method?"});    
  }
};
exports.remove = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/apiKey",
    "notes" : "",
    "summary" : "Remove an API Key.",
    "method": "DELETE",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "Boolean",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Boolean')],
    "nickname" : "remove"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing remove as a DELETE method?"});    
  }
};
exports.disable = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/apiKey/disable",
    "notes" : "",
    "summary" : "Disable an API Key.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "ApiKey",
    "responseMessages" : [errors.invalid('id'), errors.notFound('ApiKey')],
    "nickname" : "disable"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing disable as a POST method?"});    
  }
};
exports.enable = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/apiKey/enable",
    "notes" : "",
    "summary" : "Enable an API Key.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "ApiKey",
    "responseMessages" : [errors.invalid('id'), errors.notFound('ApiKey')],
    "nickname" : "enable"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing enable as a POST method?"});    
  }
};

