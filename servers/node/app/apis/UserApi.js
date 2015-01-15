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

exports.getDepositAddress = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/depositAddress",
    "notes" : "",
    "summary" : "Get a deposit address.",
    "method": "GET",
    "params" : [params.query("currency", "", "string", false, false, "", "XBt")].concat([]).concat([]).concat([]),
    "type" : "String",
    "responseMessages" : [errors.invalid('id'), errors.notFound('String')],
    "nickname" : "getDepositAddress"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing getDepositAddress as a GET method?"});    
  }
};
exports.getWalletHistory = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/walletHistory",
    "notes" : "",
    "summary" : "Get a history of all of your wallet transactions (deposits and withdrawals).",
    "method": "GET",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "List[Transaction]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Transaction]')],
    "nickname" : "getWalletHistory"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing getWalletHistory as a GET method?"});    
  }
};
exports.requestWithdrawal = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/requestWithdrawal",
    "notes" : "",
    "summary" : "Request a withdrawal to an external wallet.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "Transaction",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Transaction')],
    "nickname" : "requestWithdrawal"
  },
  'action': function (req,res) {
    if (!req.params.currency) {
      throw errors.invalid('currency');
    }
    if (!req.params.amount) {
      throw errors.invalid('amount');
    }
    if (!req.params.address) {
      throw errors.invalid('address');
    }
    writeResponse(res, {message: "how about implementing requestWithdrawal as a POST method?"});    
  }
};
exports.cancelWithdrawal = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/cancelWithdrawal",
    "notes" : "",
    "summary" : "Cancel a withdrawal.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "Transaction",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Transaction')],
    "nickname" : "cancelWithdrawal"
  },
  'action': function (req,res) {
    if (!req.params.token) {
      throw errors.invalid('token');
    }
    writeResponse(res, {message: "how about implementing cancelWithdrawal as a POST method?"});    
  }
};
exports.confirmWithdrawal = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/confirmWithdrawal",
    "notes" : "",
    "summary" : "Confirm a withdrawal.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "Transaction",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Transaction')],
    "nickname" : "confirmWithdrawal"
  },
  'action': function (req,res) {
    if (!req.params.token) {
      throw errors.invalid('token');
    }
    writeResponse(res, {message: "how about implementing confirmWithdrawal as a POST method?"});    
  }
};
exports.requestEnableTFA = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/requestEnableTFA",
    "notes" : "",
    "summary" : "Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "Boolean",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Boolean')],
    "nickname" : "requestEnableTFA"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing requestEnableTFA as a POST method?"});    
  }
};
exports.confirmEnableTFA = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/confirmEnableTFA",
    "notes" : "",
    "summary" : "Confirm two-factor auth for this account.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "Boolean",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Boolean')],
    "nickname" : "confirmEnableTFA"
  },
  'action': function (req,res) {
    if (!req.params.token) {
      throw errors.invalid('token');
    }
    writeResponse(res, {message: "how about implementing confirmEnableTFA as a POST method?"});    
  }
};
exports.sendVerificationEmail = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/resendVerificationEmail",
    "notes" : "",
    "summary" : "Re-send verification email.",
    "method": "GET",
    "params" : [params.query("email", "", "string", true, false, "")].concat([]).concat([]).concat([]),
    "type" : "Boolean",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Boolean')],
    "nickname" : "sendVerificationEmail"
  },
  'action': function (req,res) {
    if (!req.params.email) {
      throw errors.invalid('email');
    }
    writeResponse(res, {message: "how about implementing sendVerificationEmail as a GET method?"});    
  }
};
exports.confirmEmail = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/confirmEmail",
    "notes" : "",
    "summary" : "Confirm your email address with a token.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "Boolean",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Boolean')],
    "nickname" : "confirmEmail"
  },
  'action': function (req,res) {
    if (!req.params.token) {
      throw errors.invalid('token');
    }
    writeResponse(res, {message: "how about implementing confirmEmail as a POST method?"});    
  }
};
exports.requestPasswordReset = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/requestPasswordReset",
    "notes" : "",
    "summary" : "Request a password reset.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "Boolean",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Boolean')],
    "nickname" : "requestPasswordReset"
  },
  'action': function (req,res) {
    if (!req.params.email) {
      throw errors.invalid('email');
    }
    writeResponse(res, {message: "how about implementing requestPasswordReset as a POST method?"});    
  }
};
exports.confirmPasswordReset = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/confirmPasswordReset",
    "notes" : "",
    "summary" : "Confirm a password reset.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "Boolean",
    "responseMessages" : [errors.invalid('id'), errors.notFound('Boolean')],
    "nickname" : "confirmPasswordReset"
  },
  'action': function (req,res) {
    if (!req.params.email) {
      throw errors.invalid('email');
    }
    if (!req.params.token) {
      throw errors.invalid('token');
    }
    if (!req.params.newPassword) {
      throw errors.invalid('newPassword');
    }
    writeResponse(res, {message: "how about implementing confirmPasswordReset as a POST method?"});    
  }
};
exports.getAffiliateStatus = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/affiliateStatus",
    "notes" : "",
    "summary" : "Get your current affiliate/referral status.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "List[Affiliate]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[Affiliate]')],
    "nickname" : "getAffiliateStatus"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing getAffiliateStatus as a POST method?"});    
  }
};
exports.newUser = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user",
    "notes" : "",
    "summary" : "Register a new user.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "User",
    "responseMessages" : [errors.invalid('id'), errors.notFound('User')],
    "nickname" : "newUser"
  },
  'action': function (req,res) {
    if (!req.params.email) {
      throw errors.invalid('email');
    }
    if (!req.params.password) {
      throw errors.invalid('password');
    }
    if (!req.params.username) {
      throw errors.invalid('username');
    }
    writeResponse(res, {message: "how about implementing newUser as a POST method?"});    
  }
};
exports.getMe = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user",
    "notes" : "",
    "summary" : "Get your user model.",
    "method": "GET",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "User",
    "responseMessages" : [errors.invalid('id'), errors.notFound('User')],
    "nickname" : "getMe"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing getMe as a GET method?"});    
  }
};
exports.updateMe = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user",
    "notes" : "",
    "summary" : "Update your password, name, and other attributes.",
    "method": "PUT",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "User",
    "responseMessages" : [errors.invalid('id'), errors.notFound('User')],
    "nickname" : "updateMe"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing updateMe as a PUT method?"});    
  }
};
exports.login = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/login",
    "notes" : "",
    "summary" : "Log in to BitMEX.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "AccessToken",
    "responseMessages" : [errors.invalid('id'), errors.notFound('AccessToken')],
    "nickname" : "login"
  },
  'action': function (req,res) {
    if (!req.params.email) {
      throw errors.invalid('email');
    }
    if (!req.params.password) {
      throw errors.invalid('password');
    }
    writeResponse(res, {message: "how about implementing login as a POST method?"});    
  }
};
exports.logout = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/logout",
    "notes" : "",
    "summary" : "Log out of BitMEX.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "",
    "responseMessages" : [errors.invalid('id'), errors.notFound('')],
    "nickname" : "logout"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing logout as a POST method?"});    
  }
};
exports.logoutAll = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/logoutAll",
    "notes" : "",
    "summary" : "Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "",
    "responseMessages" : [errors.invalid('id'), errors.notFound('')],
    "nickname" : "logoutAll"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing logoutAll as a POST method?"});    
  }
};
exports.savePreferences = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/preferences",
    "notes" : "",
    "summary" : "Save application preferences.",
    "method": "POST",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "User",
    "responseMessages" : [errors.invalid('id'), errors.notFound('User')],
    "nickname" : "savePreferences"
  },
  'action': function (req,res) {
    if (!req.params.prefs) {
      throw errors.invalid('prefs');
    }
    writeResponse(res, {message: "how about implementing savePreferences as a POST method?"});    
  }
};
exports.getCommission = {
  'spec': {
    "description" : "Operations about pets",
    "path" : "/user/commission",
    "notes" : "",
    "summary" : "Get your account's commission status.",
    "method": "GET",
    "params" : [].concat([]).concat([]).concat([]),
    "type" : "List[any]",
    "responseMessages" : [errors.invalid('id'), errors.notFound('List[any]')],
    "nickname" : "getCommission"
  },
  'action': function (req,res) {
    writeResponse(res, {message: "how about implementing getCommission as a GET method?"});    
  }
};

