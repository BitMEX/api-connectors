# \OrderBookApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OrderBookGetL2**](OrderBookApi.md#OrderBookGetL2) | **Get** /orderBook/L2 | Get current orderbook in vertical format.


# **OrderBookGetL2**
> []OrderBookL2 OrderBookGetL2(ctx, symbol, optional)
Get current orderbook in vertical format.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **symbol** | **string**| Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. | 
 **optional** | ***OrderBookApiOrderBookGetL2Opts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OrderBookApiOrderBookGetL2Opts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **depth** | **optional.Float32**| Orderbook depth per side. Send 0 for full depth. | [default to 25]

### Return type

[**[]OrderBookL2**](OrderBookL2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

