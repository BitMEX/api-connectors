# \TradeApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TradeGet**](TradeApi.md#TradeGet) | **Get** /trade | Get Trades.
[**TradeGetBucketed**](TradeApi.md#TradeGetBucketed) | **Get** /trade/bucketed | Get previous trades in time buckets.


# **TradeGet**
> []Trade TradeGet(ctx, optional)
Get Trades.

Please note that indices (symbols starting with `.`) post trades at intervals to the trade feed. These have a `size` of 0 and are used only to indicate a changing price.  See [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AE_6569.html) for explanations of these fields.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***TradeApiTradeGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a TradeApiTradeGetOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **optional.String**| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. | 
 **filter** | **optional.String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | 
 **columns** | **optional.String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | 
 **count** | **optional.Float32**| Number of results to fetch. Must be a positive integer. | [default to 100]
 **start** | **optional.Float32**| Starting point for results. | [default to 0]
 **reverse** | **optional.Bool**| If true, will sort results newest first. | [default to false]
 **startTime** | **optional.Time**| Starting date filter for results. | 
 **endTime** | **optional.Time**| Ending date filter for results. | 

### Return type

[**[]Trade**](Trade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TradeGetBucketed**
> []TradeBin TradeGetBucketed(ctx, optional)
Get previous trades in time buckets.

Timestamps returned by our bucketed endpoints are the **end** of the period, indicating when the bucket was written to disk. Some other common systems use the timestamp as the beginning of the period. Please be aware of this when using this endpoint.  Also note the `open` price is equal to the `close` price of the previous timeframe bucket.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***TradeApiTradeGetBucketedOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a TradeApiTradeGetBucketedOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binSize** | **optional.String**| Time interval to bucket by. Available options: [1m,5m,1h,1d]. | [default to 1m]
 **partial** | **optional.Bool**| If true, will send in-progress (incomplete) bins for the current time period. | [default to false]
 **symbol** | **optional.String**| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. | 
 **filter** | **optional.String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | 
 **columns** | **optional.String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | 
 **count** | **optional.Float32**| Number of results to fetch. Must be a positive integer. | [default to 100]
 **start** | **optional.Float32**| Starting point for results. | [default to 0]
 **reverse** | **optional.Bool**| If true, will sort results newest first. | [default to false]
 **startTime** | **optional.Time**| Starting date filter for results. | 
 **endTime** | **optional.Time**| Ending date filter for results. | 

### Return type

[**[]TradeBin**](TradeBin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

