require 'json'


MyApp.add_route('GET', '/user', {
  "resourcePath" => "/User",
  "summary" => "Get your user model.",
  "nickname" => "user/get", 
  "responseClass" => "User", 
  "endpoint" => "/user", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('PUT', '/user', {
  "resourcePath" => "/User",
  "summary" => "Update your password, name, and other attributes.",
  "nickname" => "user/update", 
  "responseClass" => "User", 
  "endpoint" => "/user", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/user', {
  "resourcePath" => "/User",
  "summary" => "Register a new user.",
  "nickname" => "user/new", 
  "responseClass" => "User", 
  "endpoint" => "/user", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/user/affiliateStatus', {
  "resourcePath" => "/User",
  "summary" => "Get your current affiliate/referral status.",
  "nickname" => "user/get_affiliate_status", 
  "responseClass" => "array[Affiliate]", 
  "endpoint" => "/user/affiliateStatus", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/user/cancelWithdrawal', {
  "resourcePath" => "/User",
  "summary" => "Cancel a withdrawal.",
  "nickname" => "user/cancel_withdrawal", 
  "responseClass" => "Transaction", 
  "endpoint" => "/user/cancelWithdrawal", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/user/checkReferralCode', {
  "resourcePath" => "/User",
  "summary" => "Check if a referral code is valid.",
  "nickname" => "user/check_referral_code", 
  "responseClass" => "double", 
  "endpoint" => "/user/checkReferralCode", 
  "notes" => "If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404.",
  "parameters" => [
    
    {
      "name" => "referral_code",
      "description" => "",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/user/commission', {
  "resourcePath" => "/User",
  "summary" => "Get your account's commission status.",
  "nickname" => "user/get_commission", 
  "responseClass" => "array[UserCommission]", 
  "endpoint" => "/user/commission", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/user/confirmEmail', {
  "resourcePath" => "/User",
  "summary" => "Confirm your email address with a token.",
  "nickname" => "user/confirm_email", 
  "responseClass" => "AccessToken", 
  "endpoint" => "/user/confirmEmail", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/user/confirmEnableTFA', {
  "resourcePath" => "/User",
  "summary" => "Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.",
  "nickname" => "user/confirm_enable_tfa", 
  "responseClass" => "boolean", 
  "endpoint" => "/user/confirmEnableTFA", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/user/confirmPasswordReset', {
  "resourcePath" => "/User",
  "summary" => "Confirm a password reset.",
  "nickname" => "user/confirm_password_reset", 
  "responseClass" => "boolean", 
  "endpoint" => "/user/confirmPasswordReset", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/user/confirmWithdrawal', {
  "resourcePath" => "/User",
  "summary" => "Confirm a withdrawal.",
  "nickname" => "user/confirm_withdrawal", 
  "responseClass" => "Transaction", 
  "endpoint" => "/user/confirmWithdrawal", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/user/depositAddress', {
  "resourcePath" => "/User",
  "summary" => "Get a deposit address.",
  "nickname" => "user/get_deposit_address", 
  "responseClass" => "string", 
  "endpoint" => "/user/depositAddress", 
  "notes" => "",
  "parameters" => [
    
    {
      "name" => "currency",
      "description" => "",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      "defaultValue" => "XBt"
    },
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/user/disableTFA', {
  "resourcePath" => "/User",
  "summary" => "Disable two-factor auth for this account.",
  "nickname" => "user/disable_tfa", 
  "responseClass" => "boolean", 
  "endpoint" => "/user/disableTFA", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/user/login', {
  "resourcePath" => "/User",
  "summary" => "Log in to BitMEX.",
  "nickname" => "user/login", 
  "responseClass" => "AccessToken", 
  "endpoint" => "/user/login", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/user/logout', {
  "resourcePath" => "/User",
  "summary" => "Log out of BitMEX.",
  "nickname" => "user/logout", 
  "responseClass" => "void", 
  "endpoint" => "/user/logout", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/user/logoutAll', {
  "resourcePath" => "/User",
  "summary" => "Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.",
  "nickname" => "user/logout_all", 
  "responseClass" => "double", 
  "endpoint" => "/user/logoutAll", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/user/margin', {
  "resourcePath" => "/User",
  "summary" => "Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.",
  "nickname" => "user/get_margin", 
  "responseClass" => "Margin", 
  "endpoint" => "/user/margin", 
  "notes" => "",
  "parameters" => [
    
    {
      "name" => "currency",
      "description" => "",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      "defaultValue" => "XBt"
    },
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/user/preferences', {
  "resourcePath" => "/User",
  "summary" => "Save user preferences.",
  "nickname" => "user/save_preferences", 
  "responseClass" => "User", 
  "endpoint" => "/user/preferences", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/user/requestEnableTFA', {
  "resourcePath" => "/User",
  "summary" => "Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.",
  "nickname" => "user/request_enable_tfa", 
  "responseClass" => "boolean", 
  "endpoint" => "/user/requestEnableTFA", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/user/requestPasswordReset', {
  "resourcePath" => "/User",
  "summary" => "Request a password reset.",
  "nickname" => "user/request_password_reset", 
  "responseClass" => "boolean", 
  "endpoint" => "/user/requestPasswordReset", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/user/requestWithdrawal', {
  "resourcePath" => "/User",
  "summary" => "Request a withdrawal to an external wallet.",
  "nickname" => "user/request_withdrawal", 
  "responseClass" => "Transaction", 
  "endpoint" => "/user/requestWithdrawal", 
  "notes" => "This will send a confirmation email to the email address on record, unless requested via an API Key with the `withdraw` permission.",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/user/resendVerificationEmail', {
  "resourcePath" => "/User",
  "summary" => "Re-send verification email.",
  "nickname" => "user/send_verification_email", 
  "responseClass" => "boolean", 
  "endpoint" => "/user/resendVerificationEmail", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/user/walletHistory', {
  "resourcePath" => "/User",
  "summary" => "Get a history of all of your wallet transactions (deposits and withdrawals).",
  "nickname" => "user/get_wallet_history", 
  "responseClass" => "array[Transaction]", 
  "endpoint" => "/user/walletHistory", 
  "notes" => "",
  "parameters" => [
    
    {
      "name" => "currency",
      "description" => "",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      "defaultValue" => "XBt"
    },
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

