# QuoteApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**quoteGet**](QuoteApi.md#quoteGet) | **GET** /quote | Get Quotes.
[**quoteGetBucketed**](QuoteApi.md#quoteGetBucketed) | **GET** /quote/bucketed | Get previous quotes in time buckets.


<a name="quoteGet"></a>
# **quoteGet**
> List&lt;Quote&gt; quoteGet(symbol, filter, columns, count, start, reverse, startTime, endTime)

Get Quotes.

### Example
```java
// Import classes:
//import io.swagger.client.api.QuoteApi;

QuoteApi apiInstance = new QuoteApi();
String symbol = "symbol_example"; // String | Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive.
String filter = "filter_example"; // String | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
String columns = "columns_example"; // String | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
Integer count = 100; // Integer | Number of results to fetch. Must be a positive integer.
Integer start = 0; // Integer | Starting point for results.
Boolean reverse = false; // Boolean | If true, will sort results newest first.
Date startTime = new Date(); // Date | Starting date filter for results.
Date endTime = new Date(); // Date | Ending date filter for results.
try {
    List<Quote> result = apiInstance.quoteGet(symbol, filter, columns, count, start, reverse, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuoteApi#quoteGet");
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
 **startTime** | **Date**| Starting date filter for results. | [optional]
 **endTime** | **Date**| Ending date filter for results. | [optional]

### Return type

[**List&lt;Quote&gt;**](Quote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="quoteGetBucketed"></a>
# **quoteGetBucketed**
> List&lt;Quote&gt; quoteGetBucketed(binSize, partial, symbol, filter, columns, count, start, reverse, startTime, endTime)

Get previous quotes in time buckets.

Timestamps returned by our bucketed endpoints are the **end** of the period, indicating when the bucket was written to disk. Some other common systems use the timestamp as the beginning of the period. Please be aware of this when using this endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.api.QuoteApi;

QuoteApi apiInstance = new QuoteApi();
String binSize = "1m"; // String | Time interval to bucket by. Available options: [1m,5m,1h,1d].
Boolean partial = false; // Boolean | If true, will send in-progress (incomplete) bins for the current time period.
String symbol = "symbol_example"; // String | Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive.
String filter = "filter_example"; // String | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
String columns = "columns_example"; // String | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
Integer count = 100; // Integer | Number of results to fetch. Must be a positive integer.
Integer start = 0; // Integer | Starting point for results.
Boolean reverse = false; // Boolean | If true, will sort results newest first.
Date startTime = new Date(); // Date | Starting date filter for results.
Date endTime = new Date(); // Date | Ending date filter for results.
try {
    List<Quote> result = apiInstance.quoteGetBucketed(binSize, partial, symbol, filter, columns, count, start, reverse, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuoteApi#quoteGetBucketed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binSize** | **String**| Time interval to bucket by. Available options: [1m,5m,1h,1d]. | [optional] [default to 1m]
 **partial** | **Boolean**| If true, will send in-progress (incomplete) bins for the current time period. | [optional] [default to false]
 **symbol** | **String**| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. | [optional]
 **filter** | **String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional]
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional]
 **count** | **Integer**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **Integer**| Starting point for results. | [optional] [default to 0]
 **reverse** | **Boolean**| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **Date**| Starting date filter for results. | [optional]
 **endTime** | **Date**| Ending date filter for results. | [optional]

### Return type

[**List&lt;Quote&gt;**](Quote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

