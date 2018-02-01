# SwaggerClient::UserApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_cancel_withdrawal**](UserApi.md#user_cancel_withdrawal) | **POST** /user/cancelWithdrawal | Cancel a withdrawal.
[**user_check_referral_code**](UserApi.md#user_check_referral_code) | **GET** /user/checkReferralCode | Check if a referral code is valid.
[**user_confirm**](UserApi.md#user_confirm) | **POST** /user/confirmEmail | Confirm your email address with a token.
[**user_confirm_enable_tfa**](UserApi.md#user_confirm_enable_tfa) | **POST** /user/confirmEnableTFA | Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
[**user_confirm_withdrawal**](UserApi.md#user_confirm_withdrawal) | **POST** /user/confirmWithdrawal | Confirm a withdrawal.
[**user_disable_tfa**](UserApi.md#user_disable_tfa) | **POST** /user/disableTFA | Disable two-factor auth for this account.
[**user_get**](UserApi.md#user_get) | **GET** /user | Get your user model.
[**user_get_affiliate_status**](UserApi.md#user_get_affiliate_status) | **GET** /user/affiliateStatus | Get your current affiliate/referral status.
[**user_get_commission**](UserApi.md#user_get_commission) | **GET** /user/commission | Get your account&#39;s commission status.
[**user_get_deposit_address**](UserApi.md#user_get_deposit_address) | **GET** /user/depositAddress | Get a deposit address.
[**user_get_margin**](UserApi.md#user_get_margin) | **GET** /user/margin | Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
[**user_get_wallet**](UserApi.md#user_get_wallet) | **GET** /user/wallet | Get your current wallet information.
[**user_get_wallet_history**](UserApi.md#user_get_wallet_history) | **GET** /user/walletHistory | Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
[**user_get_wallet_summary**](UserApi.md#user_get_wallet_summary) | **GET** /user/walletSummary | Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
[**user_logout**](UserApi.md#user_logout) | **POST** /user/logout | Log out of BitMEX.
[**user_logout_all**](UserApi.md#user_logout_all) | **POST** /user/logoutAll | Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
[**user_min_withdrawal_fee**](UserApi.md#user_min_withdrawal_fee) | **GET** /user/minWithdrawalFee | Get the minimum withdrawal fee for a currency.
[**user_request_enable_tfa**](UserApi.md#user_request_enable_tfa) | **POST** /user/requestEnableTFA | Get secret key for setting up two-factor auth.
[**user_request_withdrawal**](UserApi.md#user_request_withdrawal) | **POST** /user/requestWithdrawal | Request a withdrawal to an external wallet.
[**user_save_preferences**](UserApi.md#user_save_preferences) | **POST** /user/preferences | Save user preferences.
[**user_update**](UserApi.md#user_update) | **PUT** /user | Update your password, name, and other attributes.


# **user_cancel_withdrawal**
> Transaction user_cancel_withdrawal(token)

Cancel a withdrawal.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

token = "token_example" # String | 


begin
  #Cancel a withdrawal.
  result = api_instance.user_cancel_withdrawal(token)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_cancel_withdrawal: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  | 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_check_referral_code**
> Float user_check_referral_code(opts)

Check if a referral code is valid.

If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

opts = { 
  referral_code: "referral_code_example" # String | 
}

begin
  #Check if a referral code is valid.
  result = api_instance.user_check_referral_code(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_check_referral_code: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referral_code** | **String**|  | [optional] 

### Return type

**Float**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_confirm**
> AccessToken user_confirm(token)

Confirm your email address with a token.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

token = "token_example" # String | 


begin
  #Confirm your email address with a token.
  result = api_instance.user_confirm(token)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_confirm: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  | 

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_confirm_enable_tfa**
> BOOLEAN user_confirm_enable_tfa(token, opts)

Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

token = "token_example" # String | Token from your selected TFA type.

opts = { 
  type: "type_example" # String | Two-factor auth type. Supported types: 'GA' (Google Authenticator), 'Yubikey'
}

begin
  #Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
  result = api_instance.user_confirm_enable_tfa(token, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_confirm_enable_tfa: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Token from your selected TFA type. | 
 **type** | **String**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39; | [optional] 

### Return type

**BOOLEAN**

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_confirm_withdrawal**
> Transaction user_confirm_withdrawal(token)

Confirm a withdrawal.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

token = "token_example" # String | 


begin
  #Confirm a withdrawal.
  result = api_instance.user_confirm_withdrawal(token)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_confirm_withdrawal: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  | 

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_disable_tfa**
> BOOLEAN user_disable_tfa(token, opts)

Disable two-factor auth for this account.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

token = "token_example" # String | Token from your selected TFA type.

opts = { 
  type: "type_example" # String | Two-factor auth type. Supported types: 'GA' (Google Authenticator)
}

begin
  #Disable two-factor auth for this account.
  result = api_instance.user_disable_tfa(token, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_disable_tfa: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Token from your selected TFA type. | 
 **type** | **String**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) | [optional] 

### Return type

**BOOLEAN**

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get**
> User user_get

Get your user model.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

begin
  #Get your user model.
  result = api_instance.user_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_affiliate_status**
> Affiliate user_get_affiliate_status

Get your current affiliate/referral status.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

begin
  #Get your current affiliate/referral status.
  result = api_instance.user_get_affiliate_status
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_affiliate_status: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Affiliate**](Affiliate.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_commission**
> Array&lt;UserCommission&gt; user_get_commission

Get your account's commission status.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

begin
  #Get your account's commission status.
  result = api_instance.user_get_commission
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_commission: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;UserCommission&gt;**](UserCommission.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_deposit_address**
> String user_get_deposit_address(opts)

Get a deposit address.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

opts = { 
  currency: "XBt" # String | 
}

begin
  #Get a deposit address.
  result = api_instance.user_get_deposit_address(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_deposit_address: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  | [optional] [default to XBt]

### Return type

**String**

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_margin**
> Margin user_get_margin(opts)

Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

opts = { 
  currency: "XBt" # String | 
}

begin
  #Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.
  result = api_instance.user_get_margin(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_margin: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  | [optional] [default to XBt]

### Return type

[**Margin**](Margin.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_wallet**
> Wallet user_get_wallet(opts)

Get your current wallet information.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

opts = { 
  currency: "XBt" # String | 
}

begin
  #Get your current wallet information.
  result = api_instance.user_get_wallet(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_wallet: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  | [optional] [default to XBt]

### Return type

[**Wallet**](Wallet.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_wallet_history**
> Array&lt;Transaction&gt; user_get_wallet_history(opts)

Get a history of all of your wallet transactions (deposits, withdrawals, PNL).

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

opts = { 
  currency: "XBt" # String | 
}

begin
  #Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
  result = api_instance.user_get_wallet_history(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_wallet_history: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  | [optional] [default to XBt]

### Return type

[**Array&lt;Transaction&gt;**](Transaction.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_wallet_summary**
> Array&lt;Transaction&gt; user_get_wallet_summary(opts)

Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

opts = { 
  currency: "XBt" # String | 
}

begin
  #Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
  result = api_instance.user_get_wallet_summary(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_wallet_summary: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  | [optional] [default to XBt]

### Return type

[**Array&lt;Transaction&gt;**](Transaction.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_logout**
> user_logout

Log out of BitMEX.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

begin
  #Log out of BitMEX.
  api_instance.user_logout
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_logout: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_logout_all**
> Float user_logout_all

Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

begin
  #Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.
  result = api_instance.user_logout_all
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_logout_all: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Float**

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_min_withdrawal_fee**
> Object user_min_withdrawal_fee(opts)

Get the minimum withdrawal fee for a currency.

This is changed based on network conditions to ensure timely withdrawals. During network congestion, this may be high. The fee is returned in the same currency.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

opts = { 
  currency: "XBt" # String | 
}

begin
  #Get the minimum withdrawal fee for a currency.
  result = api_instance.user_min_withdrawal_fee(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_min_withdrawal_fee: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  | [optional] [default to XBt]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_request_enable_tfa**
> BOOLEAN user_request_enable_tfa(opts)

Get secret key for setting up two-factor auth.

Use /confirmEnableTFA directly for Yubikeys. This fails if TFA is already enabled.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

opts = { 
  type: "type_example" # String | Two-factor auth type. Supported types: 'GA' (Google Authenticator)
}

begin
  #Get secret key for setting up two-factor auth.
  result = api_instance.user_request_enable_tfa(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_request_enable_tfa: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator) | [optional] 

### Return type

**BOOLEAN**

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_request_withdrawal**
> Transaction user_request_withdrawal(currency, amount, address, opts)

Request a withdrawal to an external wallet.

This will send a confirmation email to the email address on record, unless requested via an API Key with the `withdraw` permission.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

currency = "XBt" # String | Currency you're withdrawing. Options: `XBt`

amount = 3.4 # Float | Amount of withdrawal currency.

address = "address_example" # String | Destination Address.

opts = { 
  otp_token: "otp_token_example", # String | 2FA token. Required if 2FA is enabled on your account.
  fee: 1.2 # Float | Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.
}

begin
  #Request a withdrawal to an external wallet.
  result = api_instance.user_request_withdrawal(currency, amount, address, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_request_withdrawal: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency you&#39;re withdrawing. Options: &#x60;XBt&#x60; | [default to XBt]
 **amount** | **Float**| Amount of withdrawal currency. | 
 **address** | **String**| Destination Address. | 
 **otp_token** | **String**| 2FA token. Required if 2FA is enabled on your account. | [optional] 
 **fee** | **Float**| Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. | [optional] 

### Return type

[**Transaction**](Transaction.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_save_preferences**
> User user_save_preferences(prefs, opts)

Save user preferences.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

prefs = "prefs_example" # String | 

opts = { 
  overwrite: false # BOOLEAN | If true, will overwrite all existing preferences.
}

begin
  #Save user preferences.
  result = api_instance.user_save_preferences(prefs, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_save_preferences: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefs** | **String**|  | 
 **overwrite** | **BOOLEAN**| If true, will overwrite all existing preferences. | [optional] [default to false]

### Return type

[**User**](User.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_update**
> User user_update(opts)

Update your password, name, and other attributes.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

opts = { 
  firstname: "firstname_example", # String | 
  lastname: "lastname_example", # String | 
  old_password: "old_password_example", # String | 
  new_password: "new_password_example", # String | 
  new_password_confirm: "new_password_confirm_example", # String | 
  username: "username_example", # String | Username can only be set once. To reset, email support.
  country: "country_example", # String | Country of residence.
  pgp_pub_key: "pgp_pub_key_example" # String | PGP Public Key. If specified, automated emails will be sentwith this key.
}

begin
  #Update your password, name, and other attributes.
  result = api_instance.user_update(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_update: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstname** | **String**|  | [optional] 
 **lastname** | **String**|  | [optional] 
 **old_password** | **String**|  | [optional] 
 **new_password** | **String**|  | [optional] 
 **new_password_confirm** | **String**|  | [optional] 
 **username** | **String**| Username can only be set once. To reset, email support. | [optional] 
 **country** | **String**| Country of residence. | [optional] 
 **pgp_pub_key** | **String**| PGP Public Key. If specified, automated emails will be sentwith this key. | [optional] 

### Return type

[**User**](User.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



