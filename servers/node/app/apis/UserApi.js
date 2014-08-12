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

exports.user_login = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/login",
    "notes" : "",
    "summary" : "Log in to BitMEX.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([params.body("body", "object", "", true)
    ]),
    "type" : "Any",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Any')],
    "nickname" : "user_login"
  },
  'action': function (req,res) {
    if (!req.params.body) {
      throw errors.invalid('body');
    }
    writeResponse(res, {message: "how about implementing user_login as a POST method?"});    
  }
};
exports.user_logout = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/logout",
    "notes" : "",
    "summary" : "Log out of BitMEX.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "",
    "responseMessages" : [errors.invalid('id'), errors.notFound('')],
    "nickname" : "user_logout"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing user_logout as a POST method?"});    
  }
};
exports.user_create = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user",
    "notes" : "",
    "summary" : "Register a new user.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([params.body("body", "user", "Model instance data", false)
    ]),
    "type" : "user",
    "responseMessages" : [errors.invalid('id'), errors.notFound('user')],
    "nickname" : "user_create"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing user_create as a POST method?"});    
  }
};
exports.user_getMe = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user",
    "notes" : "",
    "summary" : "Get your user model.",
    "method": "GET",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "user",
    "responseMessages" : [errors.invalid('id'), errors.notFound('user')],
    "nickname" : "user_getMe"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing user_getMe as a GET method?"});    
  }
};
exports.user_updateMe = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user",
    "notes" : "",
    "summary" : "Update your password, name, and other attributes.",
    "method": "PUT",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "user",
    "responseMessages" : [errors.invalid('id'), errors.notFound('user')],
    "nickname" : "user_updateMe"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing user_updateMe as a PUT method?"});    
  }
};
exports.user_savePreferences = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/savePrefs",
    "notes" : "",
    "summary" : "Save application preferences.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "user",
    "responseMessages" : [errors.invalid('id'), errors.notFound('user')],
    "nickname" : "user_savePreferences"
  },
  'action': function (req,res) {
    if (!req.params.prefs) {
      throw errors.invalid('prefs');
    }
    writeResponse(res, {message: "how about implementing user_savePreferences as a POST method?"});    
  }
};
exports.user_verifyPhone = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/requestSMS",
    "notes" : "",
    "summary" : "Request an SMS verification token.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "Boolean",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Boolean')],
    "nickname" : "user_verifyPhone"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing user_verifyPhone as a POST method?"});    
  }
};
exports.user_confirmPhone = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/confirmPhone",
    "notes" : "",
    "summary" : "Confirm your phone number by entering your SMS verification token.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "user",
    "responseMessages" : [errors.invalid('id'), errors.notFound('user')],
    "nickname" : "user_confirmPhone"
  },
  'action': function (req,res) {
    if (!req.params.token) {
      throw errors.invalid('token');
    }
    writeResponse(res, {message: "how about implementing user_confirmPhone as a POST method?"});    
  }
};

