# SwaggerClient::StatsApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**stats_get**](StatsApi.md#stats_get) | **GET** /stats | Get exchange-wide and per-series turnover and volume statistics.
[**stats_history**](StatsApi.md#stats_history) | **GET** /stats/history | Get historical exchange-wide and per-series turnover and volume statistics.
[**stats_history_usd**](StatsApi.md#stats_history_usd) | **GET** /stats/historyUSD | Get a summary of exchange statistics in USD.


# **stats_get**
> Array&lt;Stats&gt; stats_get

Get exchange-wide and per-series turnover and volume statistics.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::StatsApi.new

begin
  #Get exchange-wide and per-series turnover and volume statistics.
  result = api_instance.stats_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling StatsApi->stats_get: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;Stats&gt;**](Stats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **stats_history**
> Array&lt;StatsHistory&gt; stats_history

Get historical exchange-wide and per-series turnover and volume statistics.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::StatsApi.new

begin
  #Get historical exchange-wide and per-series turnover and volume statistics.
  result = api_instance.stats_history
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling StatsApi->stats_history: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;StatsHistory&gt;**](StatsHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **stats_history_usd**
> Array&lt;StatsUSD&gt; stats_history_usd

Get a summary of exchange statistics in USD.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::StatsApi.new

begin
  #Get a summary of exchange statistics in USD.
  result = api_instance.stats_history_usd
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling StatsApi->stats_history_usd: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;StatsUSD&gt;**](StatsUSD.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



