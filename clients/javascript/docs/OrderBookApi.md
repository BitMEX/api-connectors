# BitMexApi.OrderBookApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderBookGet**](OrderBookApi.md#orderBookGet) | **GET** /orderBook | Get current orderbook [deprecated, use /orderBook/L2].
[**orderBookGetL2**](OrderBookApi.md#orderBookGetL2) | **GET** /orderBook/L2 | Get current orderbook in vertical format.


<a name="orderBookGet"></a>
# **orderBookGet**
> [OrderBook] orderBookGet(symbol, opts)

Get current orderbook [deprecated, use /orderBook/L2].

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.OrderBookApi();

var symbol = "symbol_example"; // String | Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.

var opts = { 
  'depth': 25 // Number | Orderbook depth.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.orderBookGet(symbol, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. | 
 **depth** | **Number**| Orderbook depth. | [optional] [default to 25]

### Return type

[**[OrderBook]**](OrderBook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="orderBookGetL2"></a>
# **orderBookGetL2**
> [OrderBookL2] orderBookGetL2(symbol, opts)

Get current orderbook in vertical format.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.OrderBookApi();

var symbol = "symbol_example"; // String | Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.

var opts = { 
  'depth': 25 // Number | Orderbook depth per side. Send 0 for full depth.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.orderBookGetL2(symbol, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. | 
 **depth** | **Number**| Orderbook depth per side. Send 0 for full depth. | [optional] [default to 25]

### Return type

[**[OrderBookL2]**](OrderBookL2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

