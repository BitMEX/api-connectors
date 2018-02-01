# \InstrumentApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**InstrumentGet**](InstrumentApi.md#InstrumentGet) | **Get** /instrument | Get instruments.
[**InstrumentGetActive**](InstrumentApi.md#InstrumentGetActive) | **Get** /instrument/active | Get all active instruments and instruments that have expired in &lt;24hrs.
[**InstrumentGetActiveAndIndices**](InstrumentApi.md#InstrumentGetActiveAndIndices) | **Get** /instrument/activeAndIndices | Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
[**InstrumentGetActiveIntervals**](InstrumentApi.md#InstrumentGetActiveIntervals) | **Get** /instrument/activeIntervals | Return all active contract series and interval pairs.
[**InstrumentGetCompositeIndex**](InstrumentApi.md#InstrumentGetCompositeIndex) | **Get** /instrument/compositeIndex | Show constituent parts of an index.
[**InstrumentGetIndices**](InstrumentApi.md#InstrumentGetIndices) | **Get** /instrument/indices | Get all price indices.


# **InstrumentGet**
> []Instrument InstrumentGet(optional)
Get instruments.

This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use `/instrument/active` to return active instruments, or use a filter like `{\"state\": \"Open\"}`.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. | 
 **filter** | **string**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details. | 
 **columns** | **string**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | 
 **count** | **float32**| Number of results to fetch. | [default to 100]
 **start** | **float32**| Starting point for results. | [default to 0]
 **reverse** | **bool**| If true, will sort results newest first. | [default to false]
 **startTime** | **time.Time**| Starting date filter for results. | 
 **endTime** | **time.Time**| Ending date filter for results. | 

### Return type

[**[]Instrument**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InstrumentGetActive**
> []Instrument InstrumentGetActive()
Get all active instruments and instruments that have expired in <24hrs.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]Instrument**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InstrumentGetActiveAndIndices**
> []Instrument InstrumentGetActiveAndIndices()
Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]Instrument**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InstrumentGetActiveIntervals**
> InstrumentInterval InstrumentGetActiveIntervals()
Return all active contract series and interval pairs.

This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as `[\"BVOL:daily\", \"BVOL:weekly\", \"XBU:daily\", \"XBU:monthly\", ...]`. These identifiers are usable in any query's `symbol` param. The second array is the current resolution of these intervals. Results are mapped at the same index.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**InstrumentInterval**](InstrumentInterval.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InstrumentGetCompositeIndex**
> []IndexComposite InstrumentGetCompositeIndex(optional)
Show constituent parts of an index.

Composite indices are built from multiple external price sources.  Use this endpoint to get the underlying prices of an index. For example, send a `symbol` of `.XBT` to get the ticks and weights of the constituent exchanges that build the \".XBT\" index.  A tick with reference `\"BMI\"` and weight `null` is the composite index tick. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **float64**|  | 
 **symbol** | **string**| The composite index symbol. | [default to .XBT]
 **filter** | **string**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details. | 
 **columns** | **string**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | 
 **count** | **float32**| Number of results to fetch. | [default to 100]
 **start** | **float32**| Starting point for results. | [default to 0]
 **reverse** | **bool**| If true, will sort results newest first. | [default to false]
 **startTime** | **time.Time**| Starting date filter for results. | 
 **endTime** | **time.Time**| Ending date filter for results. | 

### Return type

[**[]IndexComposite**](IndexComposite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InstrumentGetIndices**
> []Instrument InstrumentGetIndices()
Get all price indices.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]Instrument**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

