# \InsuranceApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**InsuranceGet**](InsuranceApi.md#InsuranceGet) | **Get** /insurance | Get insurance fund history.


# **InsuranceGet**
> []Insurance InsuranceGet(ctx, optional)
Get insurance fund history.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***InsuranceApiInsuranceGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a InsuranceApiInsuranceGetOpts struct

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

[**[]Insurance**](Insurance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

