'use strict';

exports.user.getMe = function(args, res, next) {
  /**
   * parameters expected in the args:
   **/

var examples = {};
  
  examples['application/json'] = {
  "country" : "aeiou",
  "firstname" : "aeiou",
  "preferences" : {
    "tradeLayout" : "aeiou",
    "orderBookBinning" : 1.3579000000000001069366817318950779736042022705078125,
    "debug" : true,
    "hideNotifications" : [ "aeiou" ],
    "strictIPCheck" : true,
    "tickerGroup" : "aeiou",
    "msgsSeen" : [ "aeiou" ],
    "orderControlsPlusMinus" : true,
    "tickerPinned" : true,
    "hideConfirmDialogs" : [ "aeiou" ],
    "disableEmails" : [ "aeiou" ],
    "sounds" : [ "aeiou" ],
    "hidePhoneConfirm" : true,
    "colorTheme" : "aeiou",
    "announcementsLastSeen" : "2015-11-30T19:35:59.611+0000",
    "currency" : "aeiou"
  },
  "role" : "aeiou",
  "created" : "2015-11-30T19:35:59.611+0000",
  "affiliateID" : "aeiou",
  "lastname" : "aeiou",
  "lastUpdated" : "2015-11-30T19:35:59.611+0000",
  "phone" : "aeiou",
  "countryCode" : 1.3579000000000001069366817318950779736042022705078125,
  "TFAEnabled" : "aeiou",
  "disabled" : true,
  "id" : 1.3579000000000001069366817318950779736042022705078125,
  "email" : "aeiou",
  "pgpPubKey" : "aeiou",
  "status" : "aeiou",
  "username" : "aeiou"
};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.updateMe = function(args, res, next) {
  /**
   * parameters expected in the args:
   * firstname (String)
   * lastname (String)
   * oldPassword (String)
   * newPassword (String)
   * newPasswordConfirm (String)
   * country (String)
   * pgpPubKey (String)
   **/

var examples = {};
  
  examples['application/json'] = {
  "country" : "aeiou",
  "firstname" : "aeiou",
  "preferences" : {
    "tradeLayout" : "aeiou",
    "orderBookBinning" : 1.3579000000000001069366817318950779736042022705078125,
    "debug" : true,
    "hideNotifications" : [ "aeiou" ],
    "strictIPCheck" : true,
    "tickerGroup" : "aeiou",
    "msgsSeen" : [ "aeiou" ],
    "orderControlsPlusMinus" : true,
    "tickerPinned" : true,
    "hideConfirmDialogs" : [ "aeiou" ],
    "disableEmails" : [ "aeiou" ],
    "sounds" : [ "aeiou" ],
    "hidePhoneConfirm" : true,
    "colorTheme" : "aeiou",
    "announcementsLastSeen" : "2015-11-30T19:35:59.612+0000",
    "currency" : "aeiou"
  },
  "role" : "aeiou",
  "created" : "2015-11-30T19:35:59.612+0000",
  "affiliateID" : "aeiou",
  "lastname" : "aeiou",
  "lastUpdated" : "2015-11-30T19:35:59.612+0000",
  "phone" : "aeiou",
  "countryCode" : 1.3579000000000001069366817318950779736042022705078125,
  "TFAEnabled" : "aeiou",
  "disabled" : true,
  "id" : 1.3579000000000001069366817318950779736042022705078125,
  "email" : "aeiou",
  "pgpPubKey" : "aeiou",
  "status" : "aeiou",
  "username" : "aeiou"
};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.newUser = function(args, res, next) {
  /**
   * parameters expected in the args:
   * email (String)
   * password (String)
   * username (String)
   * firstname (String)
   * lastname (String)
   * acceptsTOS (String)
   * referrerID (String)
   * country (String)
   **/

var examples = {};
  
  examples['application/json'] = {
  "country" : "aeiou",
  "firstname" : "aeiou",
  "preferences" : {
    "tradeLayout" : "aeiou",
    "orderBookBinning" : 1.3579000000000001069366817318950779736042022705078125,
    "debug" : true,
    "hideNotifications" : [ "aeiou" ],
    "strictIPCheck" : true,
    "tickerGroup" : "aeiou",
    "msgsSeen" : [ "aeiou" ],
    "orderControlsPlusMinus" : true,
    "tickerPinned" : true,
    "hideConfirmDialogs" : [ "aeiou" ],
    "disableEmails" : [ "aeiou" ],
    "sounds" : [ "aeiou" ],
    "hidePhoneConfirm" : true,
    "colorTheme" : "aeiou",
    "announcementsLastSeen" : "2015-11-30T19:35:59.613+0000",
    "currency" : "aeiou"
  },
  "role" : "aeiou",
  "created" : "2015-11-30T19:35:59.613+0000",
  "affiliateID" : "aeiou",
  "lastname" : "aeiou",
  "lastUpdated" : "2015-11-30T19:35:59.613+0000",
  "phone" : "aeiou",
  "countryCode" : 1.3579000000000001069366817318950779736042022705078125,
  "TFAEnabled" : "aeiou",
  "disabled" : true,
  "id" : 1.3579000000000001069366817318950779736042022705078125,
  "email" : "aeiou",
  "pgpPubKey" : "aeiou",
  "status" : "aeiou",
  "username" : "aeiou"
};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.getAffiliateStatus = function(args, res, next) {
  /**
   * parameters expected in the args:
   **/

var examples = {};
  
  examples['application/json'] = [ {
  "execTurnover" : 1.3579000000000001069366817318950779736042022705078125,
  "totalTurnover" : 1.3579000000000001069366817318950779736042022705078125,
  "execComm" : 1.3579000000000001069366817318950779736042022705078125,
  "totalReferrals" : 1.3579000000000001069366817318950779736042022705078125,
  "currency" : "aeiou",
  "pendingPayout" : 1.3579000000000001069366817318950779736042022705078125,
  "prevPayout" : 1.3579000000000001069366817318950779736042022705078125,
  "prevComm" : 1.3579000000000001069366817318950779736042022705078125,
  "prevTimestamp" : "2015-11-30T19:35:59.615+0000",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "prevTurnover" : 1.3579000000000001069366817318950779736042022705078125,
  "totalComm" : 1.3579000000000001069366817318950779736042022705078125,
  "payoutPcnt" : 1.3579000000000001069366817318950779736042022705078125,
  "timestamp" : "2015-11-30T19:35:59.615+0000"
} ];
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.cancelWithdrawal = function(args, res, next) {
  /**
   * parameters expected in the args:
   * token (String)
   **/

var examples = {};
  
  examples['application/json'] = {
  "amount" : 1.3579000000000001069366817318950779736042022705078125,
  "address" : "aeiou",
  "transactType" : "aeiou",
  "tx" : "aeiou",
  "transactID" : "aeiou",
  "fee" : 1.3579000000000001069366817318950779736042022705078125,
  "transactTime" : "2015-11-30T19:35:59.616+0000",
  "currency" : "aeiou",
  "text" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "transactStatus" : "aeiou",
  "timestamp" : "2015-11-30T19:35:59.616+0000"
};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.checkReferralCode = function(args, res, next) {
  /**
   * parameters expected in the args:
   * referralCode (String)
   **/

var examples = {};
  
  examples['application/json'] = 1.3579000000000001069366817318950779736042022705078125;
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.getCommission = function(args, res, next) {
  /**
   * parameters expected in the args:
   **/

var examples = {};
  
  examples['application/json'] = [ {
  "insuranceFee" : "aeiou",
  "takerFee" : "aeiou",
  "makerFee" : "aeiou"
} ];
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.confirmEmail = function(args, res, next) {
  /**
   * parameters expected in the args:
   * token (String)
   **/

var examples = {};
  
  examples['application/json'] = {
  "created" : "2015-11-30T19:35:59.617+0000",
  "id" : "aeiou",
  "ttl" : 1.3579000000000001069366817318950779736042022705078125,
  "userId" : 1.3579000000000001069366817318950779736042022705078125
};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.confirmEnableTFA = function(args, res, next) {
  /**
   * parameters expected in the args:
   * token (String)
   * type (String)
   **/

var examples = {};
  
  examples['application/json'] = true;
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.confirmPasswordReset = function(args, res, next) {
  /**
   * parameters expected in the args:
   * token (String)
   * newPassword (String)
   **/

var examples = {};
  
  examples['application/json'] = true;
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.confirmWithdrawal = function(args, res, next) {
  /**
   * parameters expected in the args:
   * token (String)
   **/

var examples = {};
  
  examples['application/json'] = {
  "amount" : 1.3579000000000001069366817318950779736042022705078125,
  "address" : "aeiou",
  "transactType" : "aeiou",
  "tx" : "aeiou",
  "transactID" : "aeiou",
  "fee" : 1.3579000000000001069366817318950779736042022705078125,
  "transactTime" : "2015-11-30T19:35:59.619+0000",
  "currency" : "aeiou",
  "text" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "transactStatus" : "aeiou",
  "timestamp" : "2015-11-30T19:35:59.619+0000"
};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.getDepositAddress = function(args, res, next) {
  /**
   * parameters expected in the args:
   * currency (String)
   **/

var examples = {};
  
  examples['application/json'] = "aeiou";
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.disableTFA = function(args, res, next) {
  /**
   * parameters expected in the args:
   * token (String)
   * type (String)
   **/

var examples = {};
  
  examples['application/json'] = true;
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.login = function(args, res, next) {
  /**
   * parameters expected in the args:
   * email (String)
   * password (String)
   * token (String)
   **/

var examples = {};
  
  examples['application/json'] = {
  "created" : "2015-11-30T19:35:59.620+0000",
  "id" : "aeiou",
  "ttl" : 1.3579000000000001069366817318950779736042022705078125,
  "userId" : 1.3579000000000001069366817318950779736042022705078125
};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.logout = function(args, res, next) {
  /**
   * parameters expected in the args:
   **/

var examples = {};
  

  
  res.end();
}
exports.user.logoutAll = function(args, res, next) {
  /**
   * parameters expected in the args:
   **/

var examples = {};
  

  
  res.end();
}
exports.user.getMargin = function(args, res, next) {
  /**
   * parameters expected in the args:
   **/

var examples = {};
  
  examples['application/json'] = {
  "grossMarkValue" : 1.3579000000000001069366817318950779736042022705078125,
  "marginUsedPcnt" : 1.3579000000000001069366817318950779736042022705078125,
  "marginLeverage" : 1.3579000000000001069366817318950779736042022705078125,
  "marginBalancePcnt" : 1.3579000000000001069366817318950779736042022705078125,
  "unrealisedPnl" : 1.3579000000000001069366817318950779736042022705078125,
  "riskLimit" : 1.3579000000000001069366817318950779736042022705078125,
  "prevUnrealisedPnl" : 1.3579000000000001069366817318950779736042022705078125,
  "walletBalance" : 1.3579000000000001069366817318950779736042022705078125,
  "action" : "aeiou",
  "currency" : "aeiou",
  "state" : "aeiou",
  "sessionMargin" : 1.3579000000000001069366817318950779736042022705078125,
  "marginBalance" : 1.3579000000000001069366817318950779736042022705078125,
  "timestamp" : "2015-11-30T19:35:59.621+0000",
  "grossExecCost" : 1.3579000000000001069366817318950779736042022705078125,
  "targetExcessMargin" : 1.3579000000000001069366817318950779736042022705078125,
  "realisedPnl" : 1.3579000000000001069366817318950779736042022705078125,
  "varMargin" : 1.3579000000000001069366817318950779736042022705078125,
  "indicativeTax" : 1.3579000000000001069366817318950779736042022705078125,
  "amount" : 1.3579000000000001069366817318950779736042022705078125,
  "maintMargin" : 1.3579000000000001069366817318950779736042022705078125,
  "pendingDebit" : 1.3579000000000001069366817318950779736042022705078125,
  "riskValue" : 1.3579000000000001069366817318950779736042022705078125,
  "grossComm" : 1.3579000000000001069366817318950779736042022705078125,
  "grossOpenPremium" : 1.3579000000000001069366817318950779736042022705078125,
  "excessMarginPcnt" : 1.3579000000000001069366817318950779736042022705078125,
  "withdrawableMargin" : 1.3579000000000001069366817318950779736042022705078125,
  "pendingCredit" : 1.3579000000000001069366817318950779736042022705078125,
  "grossOpenCost" : 1.3579000000000001069366817318950779736042022705078125,
  "prevState" : "aeiou",
  "prevRealisedPnl" : 1.3579000000000001069366817318950779736042022705078125,
  "excessMargin" : 1.3579000000000001069366817318950779736042022705078125,
  "unrealisedProfit" : 1.3579000000000001069366817318950779736042022705078125,
  "initMargin" : 1.3579000000000001069366817318950779736042022705078125,
  "taxableMargin" : 1.3579000000000001069366817318950779736042022705078125,
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "availableMargin" : 1.3579000000000001069366817318950779736042022705078125
};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.savePreferences = function(args, res, next) {
  /**
   * parameters expected in the args:
   * prefs (String)
   * overwrite (Boolean)
   **/

var examples = {};
  
  examples['application/json'] = {
  "country" : "aeiou",
  "firstname" : "aeiou",
  "preferences" : {
    "tradeLayout" : "aeiou",
    "orderBookBinning" : 1.3579000000000001069366817318950779736042022705078125,
    "debug" : true,
    "hideNotifications" : [ "aeiou" ],
    "strictIPCheck" : true,
    "tickerGroup" : "aeiou",
    "msgsSeen" : [ "aeiou" ],
    "orderControlsPlusMinus" : true,
    "tickerPinned" : true,
    "hideConfirmDialogs" : [ "aeiou" ],
    "disableEmails" : [ "aeiou" ],
    "sounds" : [ "aeiou" ],
    "hidePhoneConfirm" : true,
    "colorTheme" : "aeiou",
    "announcementsLastSeen" : "2015-11-30T19:35:59.621+0000",
    "currency" : "aeiou"
  },
  "role" : "aeiou",
  "created" : "2015-11-30T19:35:59.621+0000",
  "affiliateID" : "aeiou",
  "lastname" : "aeiou",
  "lastUpdated" : "2015-11-30T19:35:59.621+0000",
  "phone" : "aeiou",
  "countryCode" : 1.3579000000000001069366817318950779736042022705078125,
  "TFAEnabled" : "aeiou",
  "disabled" : true,
  "id" : 1.3579000000000001069366817318950779736042022705078125,
  "email" : "aeiou",
  "pgpPubKey" : "aeiou",
  "status" : "aeiou",
  "username" : "aeiou"
};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.requestEnableTFA = function(args, res, next) {
  /**
   * parameters expected in the args:
   * type (String)
   * token (String)
   **/

var examples = {};
  
  examples['application/json'] = true;
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.requestPasswordReset = function(args, res, next) {
  /**
   * parameters expected in the args:
   * email (String)
   **/

var examples = {};
  
  examples['application/json'] = true;
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.requestWithdrawal = function(args, res, next) {
  /**
   * parameters expected in the args:
   * currency (String)
   * amount (BigDecimal)
   * address (String)
   * otpToken (String)
   * fee (Double)
   **/

var examples = {};
  
  examples['application/json'] = {
  "amount" : 1.3579000000000001069366817318950779736042022705078125,
  "address" : "aeiou",
  "transactType" : "aeiou",
  "tx" : "aeiou",
  "transactID" : "aeiou",
  "fee" : 1.3579000000000001069366817318950779736042022705078125,
  "transactTime" : "2015-11-30T19:35:59.623+0000",
  "currency" : "aeiou",
  "text" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "transactStatus" : "aeiou",
  "timestamp" : "2015-11-30T19:35:59.623+0000"
};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.sendVerificationEmail = function(args, res, next) {
  /**
   * parameters expected in the args:
   * email (String)
   **/

var examples = {};
  
  examples['application/json'] = true;
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.user.getWalletHistory = function(args, res, next) {
  /**
   * parameters expected in the args:
   **/

var examples = {};
  
  examples['application/json'] = [ {
  "amount" : 1.3579000000000001069366817318950779736042022705078125,
  "address" : "aeiou",
  "transactType" : "aeiou",
  "tx" : "aeiou",
  "transactID" : "aeiou",
  "fee" : 1.3579000000000001069366817318950779736042022705078125,
  "transactTime" : "2015-11-30T19:35:59.624+0000",
  "currency" : "aeiou",
  "text" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "transactStatus" : "aeiou",
  "timestamp" : "2015-11-30T19:35:59.624+0000"
} ];
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
