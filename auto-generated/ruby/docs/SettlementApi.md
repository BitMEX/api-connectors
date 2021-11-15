# SwaggerClient::SettlementApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**settlement_get**](SettlementApi.md#settlement_get) | **GET** /settlement | Get settlement history.


# **settlement_get**
> Array&lt;Settlement&gt; settlement_get(opts)

Get settlement history.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SettlementApi.new

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
  #Get settlement history.
  result = api_instance.settlement_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SettlementApi->settlement_get: #{e}"
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

[**Array&lt;Settlement&gt;**](Settlement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



