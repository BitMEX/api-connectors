# SwaggerClient::InstrumentApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**instrument_get**](InstrumentApi.md#instrument_get) | **GET** /instrument | Get instruments.
[**instrument_get_active**](InstrumentApi.md#instrument_get_active) | **GET** /instrument/active | Get all active instruments and instruments that have expired in &lt;24hrs.
[**instrument_get_active_and_indices**](InstrumentApi.md#instrument_get_active_and_indices) | **GET** /instrument/activeAndIndices | Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
[**instrument_get_active_intervals**](InstrumentApi.md#instrument_get_active_intervals) | **GET** /instrument/activeIntervals | Return all active contract series and interval pairs.
[**instrument_get_composite_index**](InstrumentApi.md#instrument_get_composite_index) | **GET** /instrument/compositeIndex | Show constituent parts of an index.
[**instrument_get_indices**](InstrumentApi.md#instrument_get_indices) | **GET** /instrument/indices | Get all price indices.
[**instrument_get_usd_volume**](InstrumentApi.md#instrument_get_usd_volume) | **GET** /instrument/usdVolume | Get a summary of exchange statistics in USD.


# **instrument_get**
> Array&lt;Instrument&gt; instrument_get(opts)

Get instruments.

This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use `/instrument/active` to return active instruments, or use a filter like `{\"state\": \"Open\"}`.  The instrument type is specified by the `typ` param.  - Perpetual Contracts - `FFWCSX` - Perpetual Contracts (FX underliers) - `FFWCSF` - Spot - `IFXXXP` - Futures - `FFCCSX` - BitMEX Basket Index - `MRBXXX` - BitMEX Crypto Index - `MRCXXX` - BitMEX FX Index - `MRFXXX` - BitMEX Lending/Premium Index - `MRRXXX` - BitMEX Volatility Index - `MRIXXX` 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InstrumentApi.new

opts = { 
  symbol: 'symbol_example', # String | Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive.
  filter: 'filter_example', # String | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
  columns: 'columns_example', # String | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
  count: 100, # Integer | Number of results to fetch. Must be a positive integer.
  start: 0, # Integer | Starting point for results.
  reverse: false, # BOOLEAN | If true, will sort results newest first.
  start_time: DateTime.parse('2013-10-20T19:20:30+01:00'), # DateTime | Starting date filter for results.
  end_time: DateTime.parse('2013-10-20T19:20:30+01:00') # DateTime | Ending date filter for results.
}

begin
  #Get instruments.
  result = api_instance.instrument_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InstrumentApi->instrument_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. | [optional] 
 **filter** | **String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **Integer**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **Integer**| Starting point for results. | [optional] [default to 0]
 **reverse** | **BOOLEAN**| If true, will sort results newest first. | [optional] [default to false]
 **start_time** | **DateTime**| Starting date filter for results. | [optional] 
 **end_time** | **DateTime**| Ending date filter for results. | [optional] 

### Return type

[**Array&lt;Instrument&gt;**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **instrument_get_active**
> Array&lt;Instrument&gt; instrument_get_active

Get all active instruments and instruments that have expired in <24hrs.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InstrumentApi.new

begin
  #Get all active instruments and instruments that have expired in <24hrs.
  result = api_instance.instrument_get_active
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InstrumentApi->instrument_get_active: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;Instrument&gt;**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **instrument_get_active_and_indices**
> Array&lt;Instrument&gt; instrument_get_active_and_indices

Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InstrumentApi.new

begin
  #Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
  result = api_instance.instrument_get_active_and_indices
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InstrumentApi->instrument_get_active_and_indices: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;Instrument&gt;**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **instrument_get_active_intervals**
> InstrumentInterval instrument_get_active_intervals

Return all active contract series and interval pairs.

This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as `[\"XBT:perpetual\", \"XBT:quarterly\", \"XBT:biquarterly\", \"ETH:quarterly\", ...]`. These identifiers are usable in any query's `symbol` param. The second array is the current resolution of these intervals. Results are mapped at the same index.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InstrumentApi.new

begin
  #Return all active contract series and interval pairs.
  result = api_instance.instrument_get_active_intervals
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InstrumentApi->instrument_get_active_intervals: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InstrumentInterval**](InstrumentInterval.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **instrument_get_composite_index**
> Array&lt;IndexComposite&gt; instrument_get_composite_index(opts)

Show constituent parts of an index.

Composite indices are built from multiple external price sources.  Use this endpoint to get the underlying prices of an index. For example, send a `symbol` of `.BXBT` to get the ticks and weights of the constituent exchanges that build the \".BXBT\" index.  A tick with reference `\"BMI\"` and weight `null` is the composite index tick. 

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InstrumentApi.new

opts = { 
  symbol: '.BXBT', # String | The composite index symbol.
  filter: 'filter_example', # String | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`.
  columns: 'columns_example', # String | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
  count: 100, # Integer | Number of results to fetch. Must be a positive integer.
  start: 0, # Integer | Starting point for results.
  reverse: false, # BOOLEAN | If true, will sort results newest first.
  start_time: DateTime.parse('2013-10-20T19:20:30+01:00'), # DateTime | Starting date filter for results.
  end_time: DateTime.parse('2013-10-20T19:20:30+01:00') # DateTime | Ending date filter for results.
}

begin
  #Show constituent parts of an index.
  result = api_instance.instrument_get_composite_index(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InstrumentApi->instrument_get_composite_index: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| The composite index symbol. | [optional] [default to .BXBT]
 **filter** | **String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. | [optional] 
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **Integer**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **Integer**| Starting point for results. | [optional] [default to 0]
 **reverse** | **BOOLEAN**| If true, will sort results newest first. | [optional] [default to false]
 **start_time** | **DateTime**| Starting date filter for results. | [optional] 
 **end_time** | **DateTime**| Ending date filter for results. | [optional] 

### Return type

[**Array&lt;IndexComposite&gt;**](IndexComposite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **instrument_get_indices**
> Array&lt;Instrument&gt; instrument_get_indices

Get all price indices.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InstrumentApi.new

begin
  #Get all price indices.
  result = api_instance.instrument_get_indices
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InstrumentApi->instrument_get_indices: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;Instrument&gt;**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **instrument_get_usd_volume**
> Array&lt;StatsUSDBySymbol&gt; instrument_get_usd_volume(opts)

Get a summary of exchange statistics in USD.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::InstrumentApi.new

opts = { 
  symbol: 'symbol_example', # String | Filter by symbol.
  columns: 'columns_example' # String | Array of column names to fetch.
}

begin
  #Get a summary of exchange statistics in USD.
  result = api_instance.instrument_get_usd_volume(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling InstrumentApi->instrument_get_usd_volume: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Filter by symbol. | [optional] 
 **columns** | **String**| Array of column names to fetch. | [optional] 

### Return type

[**Array&lt;StatsUSDBySymbol&gt;**](StatsUSDBySymbol.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



