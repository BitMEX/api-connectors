require 'json'

MyApp.add_route('get', '/depositAddress', {
  "resourcePath" => "/user",
  "summary" => "Get a deposit address.",
  "nickname" => "getDepositAddress", 
  "responseClass" => "string", 
  "endpoint" => "/depositAddress", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "currency",
      "description" => "",
      "dataType" => "string",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      "defaultValue" => "XBt"},
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('get', '/walletHistory', {
  "resourcePath" => "/user",
  "summary" => "Get a history of all of your wallet transactions (deposits and withdrawals).",
  "nickname" => "getWalletHistory", 
  "responseClass" => "Array[Transaction]", 
  "endpoint" => "/walletHistory", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/requestWithdrawal', {
  "resourcePath" => "/user",
  "summary" => "Request a withdrawal to an external wallet.",
  "nickname" => "requestWithdrawal", 
  "responseClass" => "Transaction", 
  "endpoint" => "/requestWithdrawal", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/cancelWithdrawal', {
  "resourcePath" => "/user",
  "summary" => "Cancel a withdrawal.",
  "nickname" => "cancelWithdrawal", 
  "responseClass" => "Transaction", 
  "endpoint" => "/cancelWithdrawal", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/confirmWithdrawal', {
  "resourcePath" => "/user",
  "summary" => "Confirm a withdrawal.",
  "nickname" => "confirmWithdrawal", 
  "responseClass" => "Transaction", 
  "endpoint" => "/confirmWithdrawal", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/requestEnableTFA', {
  "resourcePath" => "/user",
  "summary" => "Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled.",
  "nickname" => "requestEnableTFA", 
  "responseClass" => "boolean", 
  "endpoint" => "/requestEnableTFA", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/confirmEnableTFA', {
  "resourcePath" => "/user",
  "summary" => "Confirm two-factor auth for this account.",
  "nickname" => "confirmEnableTFA", 
  "responseClass" => "boolean", 
  "endpoint" => "/confirmEnableTFA", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('get', '/resendVerificationEmail', {
  "resourcePath" => "/user",
  "summary" => "Re-send verification email.",
  "nickname" => "sendVerificationEmail", 
  "responseClass" => "boolean", 
  "endpoint" => "/resendVerificationEmail", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "email",
      "description" => "",
      "dataType" => "string",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/confirmEmail', {
  "resourcePath" => "/user",
  "summary" => "Confirm your email address with a token.",
  "nickname" => "confirmEmail", 
  "responseClass" => "boolean", 
  "endpoint" => "/confirmEmail", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/requestPasswordReset', {
  "resourcePath" => "/user",
  "summary" => "Request a password reset.",
  "nickname" => "requestPasswordReset", 
  "responseClass" => "boolean", 
  "endpoint" => "/requestPasswordReset", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/confirmPasswordReset', {
  "resourcePath" => "/user",
  "summary" => "Confirm a password reset.",
  "nickname" => "confirmPasswordReset", 
  "responseClass" => "boolean", 
  "endpoint" => "/confirmPasswordReset", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('get', '/affiliateStatus', {
  "resourcePath" => "/user",
  "summary" => "Get your current affiliate/referral status.",
  "nickname" => "getAffiliateStatus", 
  "responseClass" => "Array[Affiliate]", 
  "endpoint" => "/affiliateStatus", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('get', '/checkReferralCode', {
  "resourcePath" => "/user",
  "summary" => "Check if a referral code is valid.",
  "nickname" => "checkReferralCode", 
  "responseClass" => "double", 
  "endpoint" => "/checkReferralCode", 
  "notes" => "If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404.",
  "parameters" => [
    {
      "name" => "referralCode",
      "description" => "",
      "dataType" => "string",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/', {
  "resourcePath" => "/user",
  "summary" => "Register a new user.",
  "nickname" => "newUser", 
  "responseClass" => "User", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('get', '/', {
  "resourcePath" => "/user",
  "summary" => "Get your user model. This also includes your margin data.",
  "nickname" => "getMe", 
  "responseClass" => "User", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('put', '/', {
  "resourcePath" => "/user",
  "summary" => "Update your password, name, and other attributes.",
  "nickname" => "updateMe", 
  "responseClass" => "User", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/login', {
  "resourcePath" => "/user",
  "summary" => "Log in to BitMEX.",
  "nickname" => "login", 
  "responseClass" => "AccessToken", 
  "endpoint" => "/login", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/logout', {
  "resourcePath" => "/user",
  "summary" => "Log out of BitMEX.",
  "nickname" => "logout", 
  "responseClass" => "void", 
  "endpoint" => "/logout", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/logoutAll', {
  "resourcePath" => "/user",
  "summary" => "Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.",
  "nickname" => "logoutAll", 
  "responseClass" => "void", 
  "endpoint" => "/logoutAll", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/preferences', {
  "resourcePath" => "/user",
  "summary" => "Save application preferences.",
  "nickname" => "savePreferences", 
  "responseClass" => "User", 
  "endpoint" => "/preferences", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('get', '/commission', {
  "resourcePath" => "/user",
  "summary" => "Get your account's commission status.",
  "nickname" => "getCommission", 
  "responseClass" => "Array[any]", 
  "endpoint" => "/commission", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('get', '/margin', {
  "resourcePath" => "/user",
  "summary" => "Get your account's margin status.",
  "nickname" => "getMargin", 
  "responseClass" => "Margin", 
  "endpoint" => "/margin", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


