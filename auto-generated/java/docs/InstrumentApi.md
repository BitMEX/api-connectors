# InstrumentApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**instrumentGet**](InstrumentApi.md#instrumentGet) | **GET** /instrument | Get instruments.
[**instrumentGetActive**](InstrumentApi.md#instrumentGetActive) | **GET** /instrument/active | Get all active instruments and instruments that have expired in &lt;24hrs.
[**instrumentGetActiveAndIndices**](InstrumentApi.md#instrumentGetActiveAndIndices) | **GET** /instrument/activeAndIndices | Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
[**instrumentGetActiveIntervals**](InstrumentApi.md#instrumentGetActiveIntervals) | **GET** /instrument/activeIntervals | Return all active contract series and interval pairs.
[**instrumentGetCompositeIndex**](InstrumentApi.md#instrumentGetCompositeIndex) | **GET** /instrument/compositeIndex | Show constituent parts of an index.
[**instrumentGetIndices**](InstrumentApi.md#instrumentGetIndices) | **GET** /instrument/indices | Get all price indices.
[**instrumentGetUsdVolume**](InstrumentApi.md#instrumentGetUsdVolume) | **GET** /instrument/usdVolume | Get a summary of exchange statistics in USD.


<a name="instrumentGet"></a>
# **instrumentGet**
> List&lt;Instrument&gt; instrumentGet(symbol, filter, columns, count, start, reverse, startTime, endTime)

Get instruments.

This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use &#x60;/instrument/active&#x60; to return active instruments, or use a filter like &#x60;{\&quot;state\&quot;: \&quot;Open\&quot;}&#x60;.  The instrument type is specified by the &#x60;typ&#x60; param.  - Perpetual Contracts - &#x60;FFWCSX&#x60; - Perpetual Contracts (FX underliers) - &#x60;FFWCSF&#x60; - Spot - &#x60;IFXXXP&#x60; - Futures - &#x60;FFCCSX&#x60; - BitMEX Basket Index - &#x60;MRBXXX&#x60; - BitMEX Crypto Index - &#x60;MRCXXX&#x60; - BitMEX FX Index - &#x60;MRFXXX&#x60; - BitMEX Lending/Premium Index - &#x60;MRRXXX&#x60; - BitMEX Volatility Index - &#x60;MRIXXX&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstrumentApi;


InstrumentApi apiInstance = new InstrumentApi();
String symbol = "symbol_example"; // String | Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive.
String filter = "filter_example"; // String | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
String columns = "columns_example"; // String | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
Integer count = 100; // Integer | Number of results to fetch. Must be a positive integer.
Integer start = 0; // Integer | Starting point for results.
Boolean reverse = false; // Boolean | If true, will sort results newest first.
OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | Starting date filter for results.
OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | Ending date filter for results.
try {
    List<Instrument> result = apiInstance.instrumentGet(symbol, filter, columns, count, start, reverse, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentApi#instrumentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. | [optional]
 **filter** | **String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional]
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional]
 **count** | **Integer**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **Integer**| Starting point for results. | [optional] [default to 0]
 **reverse** | **Boolean**| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **OffsetDateTime**| Starting date filter for results. | [optional]
 **endTime** | **OffsetDateTime**| Ending date filter for results. | [optional]

### Return type

[**List&lt;Instrument&gt;**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="instrumentGetActive"></a>
# **instrumentGetActive**
> List&lt;Instrument&gt; instrumentGetActive()

Get all active instruments and instruments that have expired in &lt;24hrs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstrumentApi;


InstrumentApi apiInstance = new InstrumentApi();
try {
    List<Instrument> result = apiInstance.instrumentGetActive();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentApi#instrumentGetActive");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Instrument&gt;**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="instrumentGetActiveAndIndices"></a>
# **instrumentGetActiveAndIndices**
> List&lt;Instrument&gt; instrumentGetActiveAndIndices()

Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstrumentApi;


InstrumentApi apiInstance = new InstrumentApi();
try {
    List<Instrument> result = apiInstance.instrumentGetActiveAndIndices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentApi#instrumentGetActiveAndIndices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Instrument&gt;**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="instrumentGetActiveIntervals"></a>
# **instrumentGetActiveIntervals**
> InstrumentInterval instrumentGetActiveIntervals()

Return all active contract series and interval pairs.

This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as &#x60;[\&quot;XBT:perpetual\&quot;, \&quot;XBT:quarterly\&quot;, \&quot;XBT:biquarterly\&quot;, \&quot;ETH:quarterly\&quot;, ...]&#x60;. These identifiers are usable in any query&#39;s &#x60;symbol&#x60; param. The second array is the current resolution of these intervals. Results are mapped at the same index.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstrumentApi;


InstrumentApi apiInstance = new InstrumentApi();
try {
    InstrumentInterval result = apiInstance.instrumentGetActiveIntervals();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentApi#instrumentGetActiveIntervals");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InstrumentInterval**](InstrumentInterval.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="instrumentGetCompositeIndex"></a>
# **instrumentGetCompositeIndex**
> List&lt;IndexComposite&gt; instrumentGetCompositeIndex(symbol, filter, columns, count, start, reverse, startTime, endTime)

Show constituent parts of an index.

Composite indices are built from multiple external price sources.  Use this endpoint to get the underlying prices of an index. For example, send a &#x60;symbol&#x60; of &#x60;.BXBT&#x60; to get the ticks and weights of the constituent exchanges that build the \&quot;.BXBT\&quot; index.  A tick with reference &#x60;\&quot;BMI\&quot;&#x60; and weight &#x60;null&#x60; is the composite index tick. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstrumentApi;


InstrumentApi apiInstance = new InstrumentApi();
String symbol = ".BXBT"; // String | The composite index symbol.
String filter = "filter_example"; // String | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`.
String columns = "columns_example"; // String | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
Integer count = 100; // Integer | Number of results to fetch. Must be a positive integer.
Integer start = 0; // Integer | Starting point for results.
Boolean reverse = false; // Boolean | If true, will sort results newest first.
OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | Starting date filter for results.
OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | Ending date filter for results.
try {
    List<IndexComposite> result = apiInstance.instrumentGetCompositeIndex(symbol, filter, columns, count, start, reverse, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentApi#instrumentGetCompositeIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| The composite index symbol. | [optional] [default to .BXBT]
 **filter** | **String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. | [optional]
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional]
 **count** | **Integer**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **Integer**| Starting point for results. | [optional] [default to 0]
 **reverse** | **Boolean**| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **OffsetDateTime**| Starting date filter for results. | [optional]
 **endTime** | **OffsetDateTime**| Ending date filter for results. | [optional]

### Return type

[**List&lt;IndexComposite&gt;**](IndexComposite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="instrumentGetIndices"></a>
# **instrumentGetIndices**
> List&lt;Instrument&gt; instrumentGetIndices()

Get all price indices.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstrumentApi;


InstrumentApi apiInstance = new InstrumentApi();
try {
    List<Instrument> result = apiInstance.instrumentGetIndices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentApi#instrumentGetIndices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Instrument&gt;**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="instrumentGetUsdVolume"></a>
# **instrumentGetUsdVolume**
> List&lt;StatsUSDBySymbol&gt; instrumentGetUsdVolume(symbol, columns)

Get a summary of exchange statistics in USD.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstrumentApi;


InstrumentApi apiInstance = new InstrumentApi();
String symbol = "symbol_example"; // String | Filter by symbol.
String columns = "columns_example"; // String | Array of column names to fetch.
try {
    List<StatsUSDBySymbol> result = apiInstance.instrumentGetUsdVolume(symbol, columns);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstrumentApi#instrumentGetUsdVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Filter by symbol. | [optional]
 **columns** | **String**| Array of column names to fetch. | [optional]

### Return type

[**List&lt;StatsUSDBySymbol&gt;**](StatsUSDBySymbol.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

