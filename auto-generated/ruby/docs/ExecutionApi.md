# SwaggerClient::ExecutionApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**execution_get**](ExecutionApi.md#execution_get) | **GET** /execution | Get all raw executions for your account.
[**execution_get_trade_history**](ExecutionApi.md#execution_get_trade_history) | **GET** /execution/tradeHistory | Get all balance-affecting executions.


# **execution_get**
> Array&lt;Execution&gt; execution_get(opts)

Get all raw executions for your account.

This returns all raw transactions, which includes order opening and cancelation, and order status changes. It can be quite noisy. More focused information is available at `/execution/tradeHistory`.  You may also use the `filter` param to target your query. Specify an array as a filter value, such as `{\"execType\": [\"Settlement\", \"Trade\"]}` to filter on multiple values.  See [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_8_8.html) for explanations of these fields. 

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

api_instance = SwaggerClient::ExecutionApi.new

opts = { 
  symbol: 'symbol_example', # String | Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive.
  filter: 'filter_example', # String | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
  columns: 'columns_example', # String | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
  count: 100, # Float | Number of results to fetch. Must be a positive integer.
  start: 0, # Float | Starting point for results.
  reverse: false, # BOOLEAN | If true, will sort results newest first.
  start_time: DateTime.parse('2013-10-20T19:20:30+01:00'), # DateTime | Starting date filter for results.
  end_time: DateTime.parse('2013-10-20T19:20:30+01:00') # DateTime | Ending date filter for results.
}

begin
  #Get all raw executions for your account.
  result = api_instance.execution_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExecutionApi->execution_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. | [optional] 
 **filter** | **String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **Float**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **Float**| Starting point for results. | [optional] [default to 0]
 **reverse** | **BOOLEAN**| If true, will sort results newest first. | [optional] [default to false]
 **start_time** | **DateTime**| Starting date filter for results. | [optional] 
 **end_time** | **DateTime**| Ending date filter for results. | [optional] 

### Return type

[**Array&lt;Execution&gt;**](Execution.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **execution_get_trade_history**
> Array&lt;Execution&gt; execution_get_trade_history(opts)

Get all balance-affecting executions.

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

api_instance = SwaggerClient::ExecutionApi.new

opts = { 
  symbol: 'symbol_example', # String | Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive.
  filter: 'filter_example', # String | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
  columns: 'columns_example', # String | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
  count: 100, # Float | Number of results to fetch. Must be a positive integer.
  start: 0, # Float | Starting point for results.
  reverse: false, # BOOLEAN | If true, will sort results newest first.
  start_time: DateTime.parse('2013-10-20T19:20:30+01:00'), # DateTime | Starting date filter for results.
  end_time: DateTime.parse('2013-10-20T19:20:30+01:00') # DateTime | Ending date filter for results.
}

begin
  #Get all balance-affecting executions.
  result = api_instance.execution_get_trade_history(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ExecutionApi->execution_get_trade_history: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. | [optional] 
 **filter** | **String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **Float**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **Float**| Starting point for results. | [optional] [default to 0]
 **reverse** | **BOOLEAN**| If true, will sort results newest first. | [optional] [default to false]
 **start_time** | **DateTime**| Starting date filter for results. | [optional] 
 **end_time** | **DateTime**| Ending date filter for results. | [optional] 

### Return type

[**Array&lt;Execution&gt;**](Execution.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



