# \OrderBookApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OrderBookGet**](OrderBookApi.md#OrderBookGet) | **Get** /orderBook | Get current orderbook [deprecated, use /orderBook/L2].
[**OrderBookGetL2**](OrderBookApi.md#OrderBookGetL2) | **Get** /orderBook/L2 | Get current orderbook in vertical format.


# **OrderBookGet**
> []OrderBook OrderBookGet($symbol, $depth)

Get current orderbook [deprecated, use /orderBook/L2].


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. | 
 **depth** | **float32**| Orderbook depth. | [optional] [default to 25]

### Return type

[**[]OrderBook**](OrderBook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrderBookGetL2**
> []OrderBookL2 OrderBookGetL2($symbol, $depth)

Get current orderbook in vertical format.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. | 
 **depth** | **float32**| Orderbook depth per side. Send 0 for full depth. | [optional] [default to 25]

### Return type

[**[]OrderBookL2**](OrderBookL2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

