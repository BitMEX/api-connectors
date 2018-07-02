# SwaggerClient::QuoteApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**quote_get**](QuoteApi.md#quote_get) | **GET** /quote | Get Quotes.
[**quote_get_bucketed**](QuoteApi.md#quote_get_bucketed) | **GET** /quote/bucketed | Get previous quotes in time buckets.


# **quote_get**
> Array&lt;Quote&gt; quote_get(opts)

Get Quotes.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::QuoteApi.new

opts = { 
  symbol: 'symbol_example', # String | Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.
  filter: 'filter_example', # String | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
  columns: 'columns_example', # String | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
  count: 100, # Float | Number of results to fetch.
  start: 0, # Float | Starting point for results.
  reverse: false, # BOOLEAN | If true, will sort results newest first.
  start_time: DateTime.parse('2013-10-20T19:20:30+01:00'), # DateTime | Starting date filter for results.
  end_time: DateTime.parse('2013-10-20T19:20:30+01:00') # DateTime | Ending date filter for results.
}

begin
  #Get Quotes.
  result = api_instance.quote_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling QuoteApi->quote_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. | [optional] 
 **filter** | **String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **Float**| Number of results to fetch. | [optional] [default to 100]
 **start** | **Float**| Starting point for results. | [optional] [default to 0]
 **reverse** | **BOOLEAN**| If true, will sort results newest first. | [optional] [default to false]
 **start_time** | **DateTime**| Starting date filter for results. | [optional] 
 **end_time** | **DateTime**| Ending date filter for results. | [optional] 

### Return type

[**Array&lt;Quote&gt;**](Quote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **quote_get_bucketed**
> Array&lt;Quote&gt; quote_get_bucketed(opts)

Get previous quotes in time buckets.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::QuoteApi.new

opts = { 
  bin_size: '1m', # String | Time interval to bucket by. Available options: [1m,5m,1h,1d].
  partial: false, # BOOLEAN | If true, will send in-progress (incomplete) bins for the current time period.
  symbol: 'symbol_example', # String | Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.
  filter: 'filter_example', # String | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
  columns: 'columns_example', # String | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
  count: 100, # Float | Number of results to fetch.
  start: 0, # Float | Starting point for results.
  reverse: false, # BOOLEAN | If true, will sort results newest first.
  start_time: DateTime.parse('2013-10-20T19:20:30+01:00'), # DateTime | Starting date filter for results.
  end_time: DateTime.parse('2013-10-20T19:20:30+01:00') # DateTime | Ending date filter for results.
}

begin
  #Get previous quotes in time buckets.
  result = api_instance.quote_get_bucketed(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling QuoteApi->quote_get_bucketed: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bin_size** | **String**| Time interval to bucket by. Available options: [1m,5m,1h,1d]. | [optional] [default to 1m]
 **partial** | **BOOLEAN**| If true, will send in-progress (incomplete) bins for the current time period. | [optional] [default to false]
 **symbol** | **String**| Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. | [optional] 
 **filter** | **String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **Float**| Number of results to fetch. | [optional] [default to 100]
 **start** | **Float**| Starting point for results. | [optional] [default to 0]
 **reverse** | **BOOLEAN**| If true, will sort results newest first. | [optional] [default to false]
 **start_time** | **DateTime**| Starting date filter for results. | [optional] 
 **end_time** | **DateTime**| Ending date filter for results. | [optional] 

### Return type

[**Array&lt;Quote&gt;**](Quote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



