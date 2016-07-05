'use strict';

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
  "transactTime" : "2000-01-23T04:56:07.000+00:00",
  "currency" : "aeiou",
  "text" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "transactStatus" : "aeiou",
  "timestamp" : "2000-01-23T04:56:07.000+00:00"
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

exports.user.confirmEmail = function(args, res, next) {
  /**
   * parameters expected in the args:
  * token (String)
  **/
    var examples = {};
  examples['application/json'] = {
  "created" : "2000-01-23T04:56:07.000+00:00",
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
  "transactTime" : "2000-01-23T04:56:07.000+00:00",
  "currency" : "aeiou",
  "text" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "transactStatus" : "aeiou",
  "timestamp" : "2000-01-23T04:56:07.000+00:00"
};
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

exports.user.get = function(args, res, next) {
  /**
   * parameters expected in the args:
  **/
    var examples = {};
  examples['application/json'] = {
  "country" : "aeiou",
  "firstname" : "aeiou",
  "preferences" : {
    "tradeLayout" : "aeiou",
    "strictTimeout" : true,
    "orderBookBinning" : 1.3579000000000001069366817318950779736042022705078125,
    "debug" : true,
    "hideNotifications" : [ "aeiou" ],
    "strictIPCheck" : true,
    "tickerGroup" : "aeiou",
    "msgsSeen" : [ "aeiou" ],
    "orderControlsPlusMinus" : true,
    "hideConnectionModal" : true,
    "tickerPinned" : true,
    "locale" : "aeiou",
    "hideConfirmDialogs" : [ "aeiou" ],
    "disableEmails" : [ "aeiou" ],
    "hideFromLeaderboard" : true,
    "sounds" : [ "aeiou" ],
    "hidePhoneConfirm" : true,
    "colorTheme" : "aeiou",
    "announcementsLastSeen" : "2000-01-23T04:56:07.000+00:00",
    "currency" : "aeiou",
    "orderBookType" : "aeiou",
    "hideNameFromLeaderboard" : true
  },
  "created" : "2000-01-23T04:56:07.000+00:00",
  "ownerId" : 1.3579000000000001069366817318950779736042022705078125,
  "affiliateID" : "aeiou",
  "lastname" : "aeiou",
  "lastUpdated" : "2000-01-23T04:56:07.000+00:00",
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
  "prevTimestamp" : "2000-01-23T04:56:07.000+00:00",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "prevTurnover" : 1.3579000000000001069366817318950779736042022705078125,
  "totalComm" : 1.3579000000000001069366817318950779736042022705078125,
  "payoutPcnt" : 1.3579000000000001069366817318950779736042022705078125,
  "timestamp" : "2000-01-23T04:56:07.000+00:00"
} ];
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

exports.user.getMargin = function(args, res, next) {
  /**
   * parameters expected in the args:
  * currency (String)
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
  "grossLastValue" : 1.3579000000000001069366817318950779736042022705078125,
  "action" : "aeiou",
  "currency" : "aeiou",
  "commission" : 1.3579000000000001069366817318950779736042022705078125,
  "state" : "aeiou",
  "sessionMargin" : 1.3579000000000001069366817318950779736042022705078125,
  "marginBalance" : 1.3579000000000001069366817318950779736042022705078125,
  "timestamp" : "2000-01-23T04:56:07.000+00:00",
  "grossExecCost" : 1.3579000000000001069366817318950779736042022705078125,
  "targetExcessMargin" : 1.3579000000000001069366817318950779736042022705078125,
  "realisedPnl" : 1.3579000000000001069366817318950779736042022705078125,
  "varMargin" : 1.3579000000000001069366817318950779736042022705078125,
  "indicativeTax" : 1.3579000000000001069366817318950779736042022705078125,
  "amount" : 1.3579000000000001069366817318950779736042022705078125,
  "maintMargin" : 1.3579000000000001069366817318950779736042022705078125,
  "pendingDebit" : 1.3579000000000001069366817318950779736042022705078125,
  "riskValue" : 1.3579000000000001069366817318950779736042022705078125,
  "confirmedDebit" : 1.3579000000000001069366817318950779736042022705078125,
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
  "syntheticMargin" : 1.3579000000000001069366817318950779736042022705078125,
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

exports.user.getWalletHistory = function(args, res, next) {
  /**
   * parameters expected in the args:
  * currency (String)
  **/
    var examples = {};
  examples['application/json'] = [ {
  "amount" : 1.3579000000000001069366817318950779736042022705078125,
  "address" : "aeiou",
  "transactType" : "aeiou",
  "tx" : "aeiou",
  "transactID" : "aeiou",
  "fee" : 1.3579000000000001069366817318950779736042022705078125,
  "transactTime" : "2000-01-23T04:56:07.000+00:00",
  "currency" : "aeiou",
  "text" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "transactStatus" : "aeiou",
  "timestamp" : "2000-01-23T04:56:07.000+00:00"
} ];
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
  "created" : "2000-01-23T04:56:07.000+00:00",
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
  // no response value expected for this operation
  res.end();
}

exports.user.logoutAll = function(args, res, next) {
  /**
   * parameters expected in the args:
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

exports.user.new = function(args, res, next) {
  /**
   * parameters expected in the args:
  * email (String)
  * password (String)
  * country (String)
  * username (String)
  * firstname (String)
  * lastname (String)
  * acceptsTOS (String)
  * referrerID (String)
  * tfaType (String)
  * tfaToken (String)
  **/
    var examples = {};
  examples['application/json'] = {
  "country" : "aeiou",
  "firstname" : "aeiou",
  "preferences" : {
    "tradeLayout" : "aeiou",
    "strictTimeout" : true,
    "orderBookBinning" : 1.3579000000000001069366817318950779736042022705078125,
    "debug" : true,
    "hideNotifications" : [ "aeiou" ],
    "strictIPCheck" : true,
    "tickerGroup" : "aeiou",
    "msgsSeen" : [ "aeiou" ],
    "orderControlsPlusMinus" : true,
    "hideConnectionModal" : true,
    "tickerPinned" : true,
    "locale" : "aeiou",
    "hideConfirmDialogs" : [ "aeiou" ],
    "disableEmails" : [ "aeiou" ],
    "hideFromLeaderboard" : true,
    "sounds" : [ "aeiou" ],
    "hidePhoneConfirm" : true,
    "colorTheme" : "aeiou",
    "announcementsLastSeen" : "2000-01-23T04:56:07.000+00:00",
    "currency" : "aeiou",
    "orderBookType" : "aeiou",
    "hideNameFromLeaderboard" : true
  },
  "created" : "2000-01-23T04:56:07.000+00:00",
  "ownerId" : 1.3579000000000001069366817318950779736042022705078125,
  "affiliateID" : "aeiou",
  "lastname" : "aeiou",
  "lastUpdated" : "2000-01-23T04:56:07.000+00:00",
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
  "transactTime" : "2000-01-23T04:56:07.000+00:00",
  "currency" : "aeiou",
  "text" : "aeiou",
  "account" : 1.3579000000000001069366817318950779736042022705078125,
  "transactStatus" : "aeiou",
  "timestamp" : "2000-01-23T04:56:07.000+00:00"
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
    "strictTimeout" : true,
    "orderBookBinning" : 1.3579000000000001069366817318950779736042022705078125,
    "debug" : true,
    "hideNotifications" : [ "aeiou" ],
    "strictIPCheck" : true,
    "tickerGroup" : "aeiou",
    "msgsSeen" : [ "aeiou" ],
    "orderControlsPlusMinus" : true,
    "hideConnectionModal" : true,
    "tickerPinned" : true,
    "locale" : "aeiou",
    "hideConfirmDialogs" : [ "aeiou" ],
    "disableEmails" : [ "aeiou" ],
    "hideFromLeaderboard" : true,
    "sounds" : [ "aeiou" ],
    "hidePhoneConfirm" : true,
    "colorTheme" : "aeiou",
    "announcementsLastSeen" : "2000-01-23T04:56:07.000+00:00",
    "currency" : "aeiou",
    "orderBookType" : "aeiou",
    "hideNameFromLeaderboard" : true
  },
  "created" : "2000-01-23T04:56:07.000+00:00",
  "ownerId" : 1.3579000000000001069366817318950779736042022705078125,
  "affiliateID" : "aeiou",
  "lastname" : "aeiou",
  "lastUpdated" : "2000-01-23T04:56:07.000+00:00",
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

exports.user.update = function(args, res, next) {
  /**
   * parameters expected in the args:
  * firstname (String)
  * lastname (String)
  * oldPassword (String)
  * newPassword (String)
  * newPasswordConfirm (String)
  * username (String)
  * country (String)
  * pgpPubKey (String)
  **/
    var examples = {};
  examples['application/json'] = {
  "country" : "aeiou",
  "firstname" : "aeiou",
  "preferences" : {
    "tradeLayout" : "aeiou",
    "strictTimeout" : true,
    "orderBookBinning" : 1.3579000000000001069366817318950779736042022705078125,
    "debug" : true,
    "hideNotifications" : [ "aeiou" ],
    "strictIPCheck" : true,
    "tickerGroup" : "aeiou",
    "msgsSeen" : [ "aeiou" ],
    "orderControlsPlusMinus" : true,
    "hideConnectionModal" : true,
    "tickerPinned" : true,
    "locale" : "aeiou",
    "hideConfirmDialogs" : [ "aeiou" ],
    "disableEmails" : [ "aeiou" ],
    "hideFromLeaderboard" : true,
    "sounds" : [ "aeiou" ],
    "hidePhoneConfirm" : true,
    "colorTheme" : "aeiou",
    "announcementsLastSeen" : "2000-01-23T04:56:07.000+00:00",
    "currency" : "aeiou",
    "orderBookType" : "aeiou",
    "hideNameFromLeaderboard" : true
  },
  "created" : "2000-01-23T04:56:07.000+00:00",
  "ownerId" : 1.3579000000000001069366817318950779736042022705078125,
  "affiliateID" : "aeiou",
  "lastname" : "aeiou",
  "lastUpdated" : "2000-01-23T04:56:07.000+00:00",
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

