# SwaggerClient::PositionApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**position_get**](PositionApi.md#position_get) | **GET** /position | Get your positions.
[**position_isolate_margin**](PositionApi.md#position_isolate_margin) | **POST** /position/isolate | Enable isolated margin or cross margin per-position.
[**position_transfer_isolated_margin**](PositionApi.md#position_transfer_isolated_margin) | **POST** /position/transferMargin | Transfer equity in or out of a position.
[**position_update_leverage**](PositionApi.md#position_update_leverage) | **POST** /position/leverage | Choose leverage for a position.
[**position_update_risk_limit**](PositionApi.md#position_update_risk_limit) | **POST** /position/riskLimit | Update your risk limit.


# **position_get**
> Array&lt;Position&gt; position_get(opts)

Get your positions.

This endpoint is used for retrieving position information. The fields largely follow the [FIX spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html) definitions. Some selected fields are explained in more detail below.  The fields _account_, _symbol_, _currency_ are unique to each position and form its key.  Spot trading symbols returns a subset of the position fields, mainly the open order aggregates.  - **account**: Your unique account ID. - **symbol**: The contract for this position. - **currency**: The margin currency for this position. - **underlying**: Meta data of the _symbol_. - **quoteCurrency**: Meta data of the _symbol_, All prices are in the _quoteCurrency_ - **commission**: The maximum of the maker, taker, and settlement fee. - **initMarginReq**: The initial margin requirement. This will be at least the symbol's default initial maintenance margin, but can be higher if you choose lower leverage. - **maintMarginReq**: The maintenance margin requirement. This will be at least the symbol's default maintenance maintenance margin, but can be higher if you choose a higher risk limit. - **riskLimit**: This is a function of your _maintMarginReq_. - **leverage**: 1 / initMarginReq. - **crossMargin**: True/false depending on whether you set cross margin on this position. - **deleveragePercentile**: Indicates where your position is in the ADL queue. - **rebalancedPnl**: The value of realised PNL that has transferred to your wallet for this position. - **prevRealisedPnl**: The value of realised PNL that has transferred to your wallet for this position since the position was closed. - **currentQty**: The current position amount in contracts. - **currentCost**: The current cost of the position in the settlement currency of the symbol (_currency_). - **currentComm**: The current commission of the position in the settlement currency of the symbol (_currency_). - **realisedCost**: The realised cost of this position calculated with regard to average cost accounting. - **unrealisedCost**: _currentCost_ - _realisedCost_. - **grossOpenPremium**: The amount your bidding above the mark price in the settlement currency of the symbol (_currency_). - **markPrice**: The mark price of the symbol in _quoteCurrency_. - **markValue**: The _currentQty_ at the mark price in the settlement currency of the symbol (_currency_). - **homeNotional**: Value of position in units of _underlying_. - **foreignNotional**: Value of position in units of _quoteCurrency_. - **realisedPnl**: The negative of _realisedCost_. - **unrealisedPnl**: _unrealisedGrossPnl_. - **liquidationPrice**: Once markPrice reaches this price, this position will be liquidated. - **bankruptPrice**: Once markPrice reaches this price, this position will have no equity. 

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

api_instance = SwaggerClient::PositionApi.new

opts = { 
  filter: 'filter_example', # String | Table filter. For example, send {\"symbol\": \"XBTUSD\"}.
  columns: 'columns_example', # String | Which columns to fetch. For example, send [\"columnName\"].
  count: 8.14 # Float | Number of rows to fetch.
}

begin
  #Get your positions.
  result = api_instance.position_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PositionApi->position_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBTUSD\&quot;}. | [optional] 
 **columns** | **String**| Which columns to fetch. For example, send [\&quot;columnName\&quot;]. | [optional] 
 **count** | **Float**| Number of rows to fetch. | [optional] 

### Return type

[**Array&lt;Position&gt;**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **position_isolate_margin**
> Position position_isolate_margin(symbol, opts)

Enable isolated margin or cross margin per-position.

Users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.

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

api_instance = SwaggerClient::PositionApi.new

symbol = 'symbol_example' # String | Position symbol to isolate.

opts = { 
  enabled: true # BOOLEAN | True for isolated margin, false for cross margin.
}

begin
  #Enable isolated margin or cross margin per-position.
  result = api_instance.position_isolate_margin(symbol, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PositionApi->position_isolate_margin: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Position symbol to isolate. | 
 **enabled** | **BOOLEAN**| True for isolated margin, false for cross margin. | [optional] [default to true]

### Return type

[**Position**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **position_transfer_isolated_margin**
> Position position_transfer_isolated_margin(symbol, amount, opts)

Transfer equity in or out of a position.

When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.

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

api_instance = SwaggerClient::PositionApi.new

symbol = 'symbol_example' # String | Symbol of position to isolate.

amount = 8.14 # Float | Amount to transfer, in Satoshis. May be negative.

opts = { 
  target_account_id: 1.2 # Float | AccountId for the position that the margin would be transfered to, must be a paired account with main user.
}

begin
  #Transfer equity in or out of a position.
  result = api_instance.position_transfer_isolated_margin(symbol, amount, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PositionApi->position_transfer_isolated_margin: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Symbol of position to isolate. | 
 **amount** | **Float**| Amount to transfer, in Satoshis. May be negative. | 
 **target_account_id** | **Float**| AccountId for the position that the margin would be transfered to, must be a paired account with main user. | [optional] 

### Return type

[**Position**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **position_update_leverage**
> Position position_update_leverage(symbol, leverage, opts)

Choose leverage for a position.

Users can choose an isolated leverage. This will automatically enable isolated margin.

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

api_instance = SwaggerClient::PositionApi.new

symbol = 'symbol_example' # String | Symbol of position to adjust.

leverage = 1.2 # Float | Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.

opts = { 
  target_account_id: 1.2 # Float | AccountId for the position that the leverage would be changed on, must be a paired account with main user.
}

begin
  #Choose leverage for a position.
  result = api_instance.position_update_leverage(symbol, leverage, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PositionApi->position_update_leverage: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Symbol of position to adjust. | 
 **leverage** | **Float**| Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin. | 
 **target_account_id** | **Float**| AccountId for the position that the leverage would be changed on, must be a paired account with main user. | [optional] 

### Return type

[**Position**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **position_update_risk_limit**
> Position position_update_risk_limit(symbol, risk_limit, opts)

Update your risk limit.

Risk Limits limit the size of positions you can trade at various margin levels. Larger positions require more margin. Please see the Risk Limit documentation for more details.

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

api_instance = SwaggerClient::PositionApi.new

symbol = 'symbol_example' # String | Symbol of position to update risk limit on.

risk_limit = 8.14 # Float | New Risk Limit, in Satoshis.

opts = { 
  target_account_id: 1.2 # Float | AccountId for the position that the risk limit would be updated on, must be a paired account with main user.
}

begin
  #Update your risk limit.
  result = api_instance.position_update_risk_limit(symbol, risk_limit, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PositionApi->position_update_risk_limit: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Symbol of position to update risk limit on. | 
 **risk_limit** | **Float**| New Risk Limit, in Satoshis. | 
 **target_account_id** | **Float**| AccountId for the position that the risk limit would be updated on, must be a paired account with main user. | [optional] 

### Return type

[**Position**](Position.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



