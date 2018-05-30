# OrderBookApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderBookGetL2**](OrderBookApi.md#orderBookGetL2) | **GET** /orderBook/L2 | Get current orderbook in vertical format.


<a name="orderBookGetL2"></a>
# **orderBookGetL2**
> List&lt;OrderBookL2&gt; orderBookGetL2(symbol, depth)

Get current orderbook in vertical format.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderBookApi;


OrderBookApi apiInstance = new OrderBookApi();
String symbol = "symbol_example"; // String | Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
BigDecimal depth = new BigDecimal(); // BigDecimal | Orderbook depth per side. Send 0 for full depth.
try {
    List<OrderBookL2> result = apiInstance.orderBookGetL2(symbol, depth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderBookApi#orderBookGetL2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. |
 **depth** | **BigDecimal**| Orderbook depth per side. Send 0 for full depth. | [optional] [default to 25]

### Return type

[**List&lt;OrderBookL2&gt;**](OrderBookL2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

