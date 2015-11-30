'use strict';

var url = require('url');


var User = require('./UserService');


module.exports.user.getMe = function user.getMe (req, res, next) {
  User.user.getMe(req.swagger.params, res, next);
};

module.exports.user.updateMe = function user.updateMe (req, res, next) {
  User.user.updateMe(req.swagger.params, res, next);
};

module.exports.user.newUser = function user.newUser (req, res, next) {
  User.user.newUser(req.swagger.params, res, next);
};

module.exports.user.getAffiliateStatus = function user.getAffiliateStatus (req, res, next) {
  User.user.getAffiliateStatus(req.swagger.params, res, next);
};

module.exports.user.cancelWithdrawal = function user.cancelWithdrawal (req, res, next) {
  User.user.cancelWithdrawal(req.swagger.params, res, next);
};

module.exports.user.checkReferralCode = function user.checkReferralCode (req, res, next) {
  User.user.checkReferralCode(req.swagger.params, res, next);
};

module.exports.user.getCommission = function user.getCommission (req, res, next) {
  User.user.getCommission(req.swagger.params, res, next);
};

module.exports.user.confirmEmail = function user.confirmEmail (req, res, next) {
  User.user.confirmEmail(req.swagger.params, res, next);
};

module.exports.user.confirmEnableTFA = function user.confirmEnableTFA (req, res, next) {
  User.user.confirmEnableTFA(req.swagger.params, res, next);
};

module.exports.user.confirmPasswordReset = function user.confirmPasswordReset (req, res, next) {
  User.user.confirmPasswordReset(req.swagger.params, res, next);
};

module.exports.user.confirmWithdrawal = function user.confirmWithdrawal (req, res, next) {
  User.user.confirmWithdrawal(req.swagger.params, res, next);
};

module.exports.user.getDepositAddress = function user.getDepositAddress (req, res, next) {
  User.user.getDepositAddress(req.swagger.params, res, next);
};

module.exports.user.disableTFA = function user.disableTFA (req, res, next) {
  User.user.disableTFA(req.swagger.params, res, next);
};

module.exports.user.login = function user.login (req, res, next) {
  User.user.login(req.swagger.params, res, next);
};

module.exports.user.logout = function user.logout (req, res, next) {
  User.user.logout(req.swagger.params, res, next);
};

module.exports.user.logoutAll = function user.logoutAll (req, res, next) {
  User.user.logoutAll(req.swagger.params, res, next);
};

module.exports.user.getMargin = function user.getMargin (req, res, next) {
  User.user.getMargin(req.swagger.params, res, next);
};

module.exports.user.savePreferences = function user.savePreferences (req, res, next) {
  User.user.savePreferences(req.swagger.params, res, next);
};

module.exports.user.requestEnableTFA = function user.requestEnableTFA (req, res, next) {
  User.user.requestEnableTFA(req.swagger.params, res, next);
};

module.exports.user.requestPasswordReset = function user.requestPasswordReset (req, res, next) {
  User.user.requestPasswordReset(req.swagger.params, res, next);
};

module.exports.user.requestWithdrawal = function user.requestWithdrawal (req, res, next) {
  User.user.requestWithdrawal(req.swagger.params, res, next);
};

module.exports.user.sendVerificationEmail = function user.sendVerificationEmail (req, res, next) {
  User.user.sendVerificationEmail(req.swagger.params, res, next);
};

module.exports.user.getWalletHistory = function user.getWalletHistory (req, res, next) {
  User.user.getWalletHistory(req.swagger.params, res, next);
};
