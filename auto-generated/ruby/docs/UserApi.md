# SwaggerClient::UserApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_cancel_withdrawal**](UserApi.md#user_cancel_withdrawal) | **POST** /user/cancelWithdrawal | Cancel a withdrawal.
[**user_check_referral_code**](UserApi.md#user_check_referral_code) | **GET** /user/checkReferralCode | Check if a referral code is valid.
[**user_communication_token**](UserApi.md#user_communication_token) | **POST** /user/communicationToken | Register your communication token for mobile clients
[**user_confirm**](UserApi.md#user_confirm) | **POST** /user/confirmEmail | Confirm your email address with a token.
[**user_confirm_withdrawal**](UserApi.md#user_confirm_withdrawal) | **POST** /user/confirmWithdrawal | Confirm a withdrawal.
[**user_create_sub_account**](UserApi.md#user_create_sub_account) | **POST** /user/addSubaccount | Creates a new sub-account.
[**user_create_unstaking_requests**](UserApi.md#user_create_unstaking_requests) | **POST** /user/unstakingRequests | Create unstaking request
[**user_delete_unstaking_requests**](UserApi.md#user_delete_unstaking_requests) | **DELETE** /user/unstakingRequests | Cancel unstaking request
[**user_get**](UserApi.md#user_get) | **GET** /user | Get your user model.
[**user_get_affiliate_status**](UserApi.md#user_get_affiliate_status) | **GET** /user/affiliateStatus | Get your current affiliate/referral status.
[**user_get_commission**](UserApi.md#user_get_commission) | **GET** /user/commission | Get your account&#39;s commission status.
[**user_get_csa**](UserApi.md#user_get_csa) | **GET** /user/csa | Get your account&#39;s CSA status.
[**user_get_deposit_address**](UserApi.md#user_get_deposit_address) | **GET** /user/depositAddress | Get a deposit address.
[**user_get_execution_history**](UserApi.md#user_get_execution_history) | **GET** /user/executionHistory | Get the execution history by day.
[**user_get_margin**](UserApi.md#user_get_margin) | **GET** /user/margin | Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
[**user_get_quote_fill_ratio**](UserApi.md#user_get_quote_fill_ratio) | **GET** /user/quoteFillRatio | Get 7 days worth of Quote Fill Ratio statistics.
[**user_get_quote_value_ratio**](UserApi.md#user_get_quote_value_ratio) | **GET** /user/quoteValueRatio | Get Quote Value Ratio statistics over the last 3 days
[**user_get_staking**](UserApi.md#user_get_staking) | **GET** /user/staking | Get the current user staking amount.
[**user_get_staking_instruments**](UserApi.md#user_get_staking_instruments) | **GET** /user/staking/instruments | List staking instruments
[**user_get_staking_tiers**](UserApi.md#user_get_staking_tiers) | **GET** /user/staking/tiers | List staking tiers for a given currency
[**user_get_trading_volume**](UserApi.md#user_get_trading_volume) | **GET** /user/tradingVolume | Get your 30 days USD average trading volume
[**user_get_unstaking_requests**](UserApi.md#user_get_unstaking_requests) | **GET** /user/unstakingRequests | Get the current user unstaking requests
[**user_get_wallet**](UserApi.md#user_get_wallet) | **GET** /user/wallet | Get your current wallet information.
[**user_get_wallet_history**](UserApi.md#user_get_wallet_history) | **GET** /user/walletHistory | Get a history of all of your wallet transactions (deposits, withdrawals, PNL).
[**user_get_wallet_summary**](UserApi.md#user_get_wallet_summary) | **GET** /user/walletSummary | Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
[**user_get_wallet_transfer_accounts**](UserApi.md#user_get_wallet_transfer_accounts) | **GET** /user/getWalletTransferAccounts | Get the list of accounts you can transfer funds between.
[**user_logout**](UserApi.md#user_logout) | **POST** /user/logout | Log out of BitMEX.
[**user_request_withdrawal**](UserApi.md#user_request_withdrawal) | **POST** /user/requestWithdrawal | Request a withdrawal to an external wallet.
[**user_save_preferences**](UserApi.md#user_save_preferences) | **POST** /user/preferences | Save user preferences.
[**user_update_sub_account**](UserApi.md#user_update_sub_account) | **POST** /user/updateSubaccount | Updates the sub-account name.
[**user_wallet_transfer**](UserApi.md#user_wallet_transfer) | **POST** /user/walletTransfer | Execute a transfer to a paired account.


# **user_cancel_withdrawal**
> Transaction user_cancel_withdrawal(token)

Cancel a withdrawal.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

token = 'token_example' # String | 


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
> Object user_check_referral_code(opts)

Check if a referral code is valid.

If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404 or 451 if invalid.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

opts = { 
  referral_code: 'referral_code_example' # String | 
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_communication_token**
> Array&lt;CommunicationToken&gt; user_communication_token(token, platform_agent)

Register your communication token for mobile clients

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

token = 'token_example' # String | 

platform_agent = 'platform_agent_example' # String | 


begin
  #Register your communication token for mobile clients
  result = api_instance.user_communication_token(token, platform_agent)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_communication_token: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  | 
 **platform_agent** | **String**|  | 

### Return type

[**Array&lt;CommunicationToken&gt;**](CommunicationToken.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

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

token = 'token_example' # String | 


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



# **user_confirm_withdrawal**
> Transaction user_confirm_withdrawal(token)

Confirm a withdrawal.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

token = 'token_example' # String | 


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



# **user_create_sub_account**
> Object user_create_sub_account(account_name)

Creates a new sub-account.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

account_name = 'account_name_example' # String | 


begin
  #Creates a new sub-account.
  result = api_instance.user_create_sub_account(account_name)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_create_sub_account: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account_name** | **String**|  | 

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_create_unstaking_requests**
> Object user_create_unstaking_requests(symbol, amount)

Create unstaking request

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

symbol = 'symbol_example' # String | 

amount = 1.2 # Float | 


begin
  #Create unstaking request
  result = api_instance.user_create_unstaking_requests(symbol, amount)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_create_unstaking_requests: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**|  | 
 **amount** | **Float**|  | 

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_delete_unstaking_requests**
> Object user_delete_unstaking_requests(redemption_id)

Cancel unstaking request

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

redemption_id = 'redemption_id_example' # String | 


begin
  #Cancel unstaking request
  result = api_instance.user_delete_unstaking_requests(redemption_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_delete_unstaking_requests: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **redemption_id** | **String**|  | 

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

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
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

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

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_affiliate_status**
> Affiliate user_get_affiliate_status(opts)

Get your current affiliate/referral status.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

opts = { 
  currency: 'XBt' # String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\"
}

begin
  #Get your current affiliate/referral status.
  result = api_instance.user_get_affiliate_status(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_affiliate_status: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]

### Return type

[**Affiliate**](Affiliate.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_commission**
> UserCommissionsBySymbol user_get_commission

Get your account's commission status.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

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

[**UserCommissionsBySymbol**](UserCommissionsBySymbol.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_csa**
> CollateralSupportAgreement user_get_csa

Get your account's CSA status.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

begin
  #Get your account's CSA status.
  result = api_instance.user_get_csa
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_csa: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CollateralSupportAgreement**](CollateralSupportAgreement.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_deposit_address**
> String user_get_deposit_address(currency, network)

Get a deposit address.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

currency = 'currency_example' # String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>

network = 'network_example' # String | The `network` parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the `network` parameter for each currency can be found from `networks.asset` from `GET /wallet/assets`.


begin
  #Get a deposit address.
  result = api_instance.user_get_deposit_address(currency, network)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_deposit_address: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; | 
 **network** | **String**| The &#x60;network&#x60; parameter is used to indicate which blockchain you would like to deposit from. The acceptable value in the &#x60;network&#x60; parameter for each currency can be found from &#x60;networks.asset&#x60; from &#x60;GET /wallet/assets&#x60;. | 

### Return type

**String**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_execution_history**
> Array&lt;Execution&gt; user_get_execution_history(symbol, timestamp)

Get the execution history by day.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

symbol = 'XBTUSD' # String | 

timestamp = DateTime.parse('2017-02-13T12:00:00.000Z') # DateTime | 


begin
  #Get the execution history by day.
  result = api_instance.user_get_execution_history(symbol, timestamp)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_execution_history: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**|  | [default to XBTUSD]
 **timestamp** | **DateTime**|  | [default to 2017-02-13T12:00:00.000Z]

### Return type

[**Array&lt;Execution&gt;**](Execution.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

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
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

opts = { 
  currency: 'XBt' # String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\"
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
 **currency** | **String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]

### Return type

[**Margin**](Margin.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_quote_fill_ratio**
> QuoteFillRatio user_get_quote_fill_ratio(opts)

Get 7 days worth of Quote Fill Ratio statistics.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

opts = { 
  target_account_id: 1.2 # Float | AccountId to get quote fill ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user
}

begin
  #Get 7 days worth of Quote Fill Ratio statistics.
  result = api_instance.user_get_quote_fill_ratio(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_quote_fill_ratio: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **target_account_id** | **Float**| AccountId to get quote fill ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user | [optional] 

### Return type

[**QuoteFillRatio**](QuoteFillRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_quote_value_ratio**
> QuoteValueRatio user_get_quote_value_ratio(opts)

Get Quote Value Ratio statistics over the last 3 days

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

opts = { 
  target_account_id: 1.2 # Float | AccountId to get quote value ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user
}

begin
  #Get Quote Value Ratio statistics over the last 3 days
  result = api_instance.user_get_quote_value_ratio(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_quote_value_ratio: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **target_account_id** | **Float**| AccountId to get quote value ratio for, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user | [optional] 

### Return type

[**QuoteValueRatio**](QuoteValueRatio.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_staking**
> Array&lt;StakingRecord&gt; user_get_staking(opts)

Get the current user staking amount.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

opts = { 
  currency: 'currency_example' # String | 
}

begin
  #Get the current user staking amount.
  result = api_instance.user_get_staking(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_staking: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  | [optional] 

### Return type

[**Array&lt;StakingRecord&gt;**](StakingRecord.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_staking_instruments**
> Array&lt;XAny&gt; user_get_staking_instruments(opts)

List staking instruments

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

opts = { 
  symbol: 'symbol_example', # String | 
  currency: 'currency_example' # String | 
}

begin
  #List staking instruments
  result = api_instance.user_get_staking_instruments(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_staking_instruments: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**|  | [optional] 
 **currency** | **String**|  | [optional] 

### Return type

[**Array&lt;XAny&gt;**](XAny.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_staking_tiers**
> Array&lt;XAny&gt; user_get_staking_tiers(currency)

List staking tiers for a given currency

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

currency = 'currency_example' # String | 


begin
  #List staking tiers for a given currency
  result = api_instance.user_get_staking_tiers(currency)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_staking_tiers: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  | 

### Return type

[**Array&lt;XAny&gt;**](XAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_trading_volume**
> Array&lt;TradingVolume&gt; user_get_trading_volume

Get your 30 days USD average trading volume

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

begin
  #Get your 30 days USD average trading volume
  result = api_instance.user_get_trading_volume
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_trading_volume: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;TradingVolume&gt;**](TradingVolume.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_unstaking_requests**
> Array&lt;StakingRecord&gt; user_get_unstaking_requests(status)

Get the current user unstaking requests

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

status = 'status_example' # String | 


begin
  #Get the current user unstaking requests
  result = api_instance.user_get_unstaking_requests(status)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_unstaking_requests: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**|  | 

### Return type

[**Array&lt;StakingRecord&gt;**](StakingRecord.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

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
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

opts = { 
  currency: 'XBt' # String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\"
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
 **currency** | **String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]

### Return type

[**Wallet**](Wallet.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

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
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

opts = { 
  currency: 'XBt', # String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\"
  count: 100, # Float | Number of results to fetch.
  start: 0, # Float | Starting point for results.
  target_account_id: 1.2 # Float | AccountId to view the history of, must be a paired account with the authorised user requesting the history.
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
 **currency** | **String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]
 **count** | **Float**| Number of results to fetch. | [optional] [default to 100]
 **start** | **Float**| Starting point for results. | [optional] [default to 0]
 **target_account_id** | **Float**| AccountId to view the history of, must be a paired account with the authorised user requesting the history. | [optional] 

### Return type

[**Array&lt;Transaction&gt;**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

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
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

opts = { 
  currency: 'XBt' # String | Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>. For all currencies specify \"all\"
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
 **currency** | **String**| Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt;. For all currencies specify \&quot;all\&quot; | [optional] [default to XBt]

### Return type

[**Array&lt;Transaction&gt;**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_get_wallet_transfer_accounts**
> Array&lt;XAny&gt; user_get_wallet_transfer_accounts

Get the list of accounts you can transfer funds between.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

begin
  #Get the list of accounts you can transfer funds between.
  result = api_instance.user_get_wallet_transfer_accounts
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_get_wallet_transfer_accounts: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;XAny&gt;**](XAny.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

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



# **user_request_withdrawal**
> Transaction user_request_withdrawal(currency, network, amount, opts)

Request a withdrawal to an external wallet.

This will send a confirmation email to the email address on record.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

currency = 'XBt' # String | Currency you're withdrawing. Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>

network = 'network_example' # String | The `network` parameter is used to indicate which blockchain you would like to withdraw from. The acceptable value in the `network` parameter for each currency can be found from `networks.asset` from `GET /wallet/assets`.

amount = 8.14 # Float | Amount of withdrawal currency.

opts = { 
  otp_token: 'otp_token_example', # String | 2FA token. Required for all external withdrawals unless the address has skip2FA in addressbook.
  address: 'address_example', # String | Destination Address. One of `address`, `addressId`, `targetUserId` has to be specified.
  address_id: 1.2, # Float | ID of the Destination Address. One of `address`, `addressId`, `targetUserId` has to be specified.
  target_user_id: 1.2, # Float | ID of the Target User. One of `address`, `addressId`, `targetUserId` has to be specified.
  fee: 1.2, # Float | Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.
  text: 'text_example' # String | Optional annotation, e.g. 'Transfer to home wallet'.
}

begin
  #Request a withdrawal to an external wallet.
  result = api_instance.user_request_withdrawal(currency, network, amount, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_request_withdrawal: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency you&#39;re withdrawing. Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; | [default to XBt]
 **network** | **String**| The &#x60;network&#x60; parameter is used to indicate which blockchain you would like to withdraw from. The acceptable value in the &#x60;network&#x60; parameter for each currency can be found from &#x60;networks.asset&#x60; from &#x60;GET /wallet/assets&#x60;. | 
 **amount** | **Float**| Amount of withdrawal currency. | 
 **otp_token** | **String**| 2FA token. Required for all external withdrawals unless the address has skip2FA in addressbook. | [optional] 
 **address** | **String**| Destination Address. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional] 
 **address_id** | **Float**| ID of the Destination Address. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional] 
 **target_user_id** | **Float**| ID of the Target User. One of &#x60;address&#x60;, &#x60;addressId&#x60;, &#x60;targetUserId&#x60; has to be specified. | [optional] 
 **fee** | **Float**| Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email. | [optional] 
 **text** | **String**| Optional annotation, e.g. &#39;Transfer to home wallet&#39;. | [optional] 

### Return type

[**Transaction**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

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
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

prefs = 'prefs_example' # String | 

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

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_update_sub_account**
> Object user_update_sub_account(target_account_id, account_name)

Updates the sub-account name.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

target_account_id = 1.2 # Float | 

account_name = 'account_name_example' # String | 


begin
  #Updates the sub-account name.
  result = api_instance.user_update_sub_account(target_account_id, account_name)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_update_sub_account: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **target_account_id** | **Float**|  | 
 **account_name** | **String**|  | 

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **user_wallet_transfer**
> Transaction user_wallet_transfer(currency, amount, target_account_id, opts)

Execute a transfer to a paired account.

This will send a confirmation email to the email address on record.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiExpires
  config.api_key['api-expires'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-expires'] = 'Bearer'

  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::UserApi.new

currency = 'currency_example' # String | Currency you're transfering. Any currency. For all currencies, see <a href=\"#!/Wallet/Wallet_getAssetsConfig\">asset config endpoint</a>

amount = 8.14 # Float | Amount of transfer.

target_account_id = 1.2 # Float | AccountId to send the transfer to, must be a paired account with the user sending the transfer.

opts = { 
  from_account_id: 1.2 # Float | AccountID to send the transfer from. Must be paired account with the authenticated user.
}

begin
  #Execute a transfer to a paired account.
  result = api_instance.user_wallet_transfer(currency, amount, target_account_id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->user_wallet_transfer: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**| Currency you&#39;re transfering. Any currency. For all currencies, see &lt;a href&#x3D;\&quot;#!/Wallet/Wallet_getAssetsConfig\&quot;&gt;asset config endpoint&lt;/a&gt; | 
 **amount** | **Float**| Amount of transfer. | 
 **target_account_id** | **Float**| AccountId to send the transfer to, must be a paired account with the user sending the transfer. | 
 **from_account_id** | **Float**| AccountID to send the transfer from. Must be paired account with the authenticated user. | [optional] 

### Return type

[**Transaction**](Transaction.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



