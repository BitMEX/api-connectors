# \InstrumentApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**InstrumentGet**](InstrumentApi.md#InstrumentGet) | **Get** /instrument | Get instruments.
[**InstrumentGetActive**](InstrumentApi.md#InstrumentGetActive) | **Get** /instrument/active | Get all active instruments and instruments that have expired in &lt;24hrs.
[**InstrumentGetActiveAndIndices**](InstrumentApi.md#InstrumentGetActiveAndIndices) | **Get** /instrument/activeAndIndices | Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
[**InstrumentGetActiveIntervals**](InstrumentApi.md#InstrumentGetActiveIntervals) | **Get** /instrument/activeIntervals | Return all active contract series and interval pairs.
[**InstrumentGetCompositeIndex**](InstrumentApi.md#InstrumentGetCompositeIndex) | **Get** /instrument/compositeIndex | Show constituent parts of an index.
[**InstrumentGetIndices**](InstrumentApi.md#InstrumentGetIndices) | **Get** /instrument/indices | Get all price indices.
[**InstrumentGetUsdVolume**](InstrumentApi.md#InstrumentGetUsdVolume) | **Get** /instrument/usdVolume | Get a summary of exchange statistics in USD.


# **InstrumentGet**
> []Instrument InstrumentGet(ctx, optional)
Get instruments.

This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use `/instrument/active` to return active instruments, or use a filter like `{\"state\": \"Open\"}`.  The instrument type is specified by the `typ` param.  - Perpetual Contracts - `FFWCSX` - Perpetual Contracts (FX underliers) - `FFWCSF` - Spot - `IFXXXP` - Futures - `FFCCSX` - BitMEX Basket Index - `MRBXXX` - BitMEX Crypto Index - `MRCXXX` - BitMEX FX Index - `MRFXXX` - BitMEX Lending/Premium Index - `MRRXXX` - BitMEX Volatility Index - `MRIXXX` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***InstrumentApiInstrumentGetOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a InstrumentApiInstrumentGetOpts struct

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

[**[]Instrument**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InstrumentGetActive**
> []Instrument InstrumentGetActive(ctx, )
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
> []Instrument InstrumentGetActiveAndIndices(ctx, )
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
> InstrumentInterval InstrumentGetActiveIntervals(ctx, )
Return all active contract series and interval pairs.

This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as `[\"XBT:perpetual\", \"XBT:quarterly\", \"XBT:biquarterly\", \"ETH:quarterly\", ...]`. These identifiers are usable in any query's `symbol` param. The second array is the current resolution of these intervals. Results are mapped at the same index.

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
> []IndexComposite InstrumentGetCompositeIndex(ctx, optional)
Show constituent parts of an index.

Composite indices are built from multiple external price sources.  Use this endpoint to get the underlying prices of an index. For example, send a `symbol` of `.BXBT` to get the ticks and weights of the constituent exchanges that build the \".BXBT\" index.  A tick with reference `\"BMI\"` and weight `null` is the composite index tick. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***InstrumentApiInstrumentGetCompositeIndexOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a InstrumentApiInstrumentGetCompositeIndexOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **optional.String**| The composite index symbol. | [default to .BXBT]
 **filter** | **optional.String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. | 
 **columns** | **optional.String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | 
 **count** | **optional.Float32**| Number of results to fetch. Must be a positive integer. | [default to 100]
 **start** | **optional.Float32**| Starting point for results. | [default to 0]
 **reverse** | **optional.Bool**| If true, will sort results newest first. | [default to false]
 **startTime** | **optional.Time**| Starting date filter for results. | 
 **endTime** | **optional.Time**| Ending date filter for results. | 

### Return type

[**[]IndexComposite**](IndexComposite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InstrumentGetIndices**
> []Instrument InstrumentGetIndices(ctx, )
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

# **InstrumentGetUsdVolume**
> []StatsUsdbySymbol InstrumentGetUsdVolume(ctx, optional)
Get a summary of exchange statistics in USD.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***InstrumentApiInstrumentGetUsdVolumeOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a InstrumentApiInstrumentGetUsdVolumeOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **optional.String**| Filter by symbol. | 
 **columns** | **optional.String**| Array of column names to fetch. | 

### Return type

[**[]StatsUsdbySymbol**](StatsUSDBySymbol.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

