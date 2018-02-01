# SwaggerClient::OrderBookApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**order_book_get**](OrderBookApi.md#order_book_get) | **GET** /orderBook | Get current orderbook [deprecated, use /orderBook/L2].
[**order_book_get_l2**](OrderBookApi.md#order_book_get_l2) | **GET** /orderBook/L2 | Get current orderbook in vertical format.


# **order_book_get**
> Array&lt;OrderBook&gt; order_book_get(symbol, opts)

Get current orderbook [deprecated, use /orderBook/L2].

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::OrderBookApi.new

symbol = "symbol_example" # String | Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.

opts = { 
  depth: 25 # Float | Orderbook depth.
}

begin
  #Get current orderbook [deprecated, use /orderBook/L2].
  result = api_instance.order_book_get(symbol, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderBookApi->order_book_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. | 
 **depth** | **Float**| Orderbook depth. | [optional] [default to 25]

### Return type

[**Array&lt;OrderBook&gt;**](OrderBook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **order_book_get_l2**
> Array&lt;OrderBookL2&gt; order_book_get_l2(symbol, opts)

Get current orderbook in vertical format.

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::OrderBookApi.new

symbol = "symbol_example" # String | Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.

opts = { 
  depth: 25 # Float | Orderbook depth per side. Send 0 for full depth.
}

begin
  #Get current orderbook in vertical format.
  result = api_instance.order_book_get_l2(symbol, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderBookApi->order_book_get_l2: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. | 
 **depth** | **Float**| Orderbook depth per side. Send 0 for full depth. | [optional] [default to 25]

### Return type

[**Array&lt;OrderBookL2&gt;**](OrderBookL2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



