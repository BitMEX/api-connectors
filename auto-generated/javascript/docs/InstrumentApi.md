# BitMexApi.InstrumentApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**instrumentGet**](InstrumentApi.md#instrumentGet) | **GET** /instrument | Get instruments.
[**instrumentGetActive**](InstrumentApi.md#instrumentGetActive) | **GET** /instrument/active | Get all active instruments and instruments that have expired in &lt;24hrs.
[**instrumentGetActiveAndIndices**](InstrumentApi.md#instrumentGetActiveAndIndices) | **GET** /instrument/activeAndIndices | Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
[**instrumentGetActiveIntervals**](InstrumentApi.md#instrumentGetActiveIntervals) | **GET** /instrument/activeIntervals | Return all active contract series and interval pairs.
[**instrumentGetCompositeIndex**](InstrumentApi.md#instrumentGetCompositeIndex) | **GET** /instrument/compositeIndex | Show constituent parts of an index.
[**instrumentGetIndices**](InstrumentApi.md#instrumentGetIndices) | **GET** /instrument/indices | Get all price indices.


<a name="instrumentGet"></a>
# **instrumentGet**
> [Instrument] instrumentGet(opts)

Get instruments.

This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use &#x60;/instrument/active&#x60; to return active instruments, or use a filter like &#x60;{\&quot;state\&quot;: \&quot;Open\&quot;}&#x60;.

### Example
```javascript
import BitMexApi from 'bit_mex_api';

let apiInstance = new BitMexApi.InstrumentApi();

let opts = { 
  'symbol': "symbol_example", // String | Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.
  'filter': "filter_example", // String | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.
  'columns': "columns_example", // String | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
  'count': 100, // Number | Number of results to fetch.
  'start': 0, // Number | Starting point for results.
  'reverse': false, // Boolean | If true, will sort results newest first.
  'startTime': new Date("2013-10-20T19:20:30+01:00"), // Date | Starting date filter for results.
  'endTime': new Date("2013-10-20T19:20:30+01:00") // Date | Ending date filter for results.
};

apiInstance.instrumentGet(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. | [optional] 
 **filter** | **String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details. | [optional] 
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **Number**| Number of results to fetch. | [optional] [default to 100]
 **start** | **Number**| Starting point for results. | [optional] [default to 0]
 **reverse** | **Boolean**| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **Date**| Starting date filter for results. | [optional] 
 **endTime** | **Date**| Ending date filter for results. | [optional] 

### Return type

[**[Instrument]**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="instrumentGetActive"></a>
# **instrumentGetActive**
> [Instrument] instrumentGetActive()

Get all active instruments and instruments that have expired in &lt;24hrs.

### Example
```javascript
import BitMexApi from 'bit_mex_api';

let apiInstance = new BitMexApi.InstrumentApi();

apiInstance.instrumentGetActive((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[Instrument]**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="instrumentGetActiveAndIndices"></a>
# **instrumentGetActiveAndIndices**
> [Instrument] instrumentGetActiveAndIndices()

Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.

### Example
```javascript
import BitMexApi from 'bit_mex_api';

let apiInstance = new BitMexApi.InstrumentApi();

apiInstance.instrumentGetActiveAndIndices((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[Instrument]**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="instrumentGetActiveIntervals"></a>
# **instrumentGetActiveIntervals**
> InstrumentInterval instrumentGetActiveIntervals()

Return all active contract series and interval pairs.

This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as &#x60;[\&quot;BVOL:daily\&quot;, \&quot;BVOL:weekly\&quot;, \&quot;XBU:daily\&quot;, \&quot;XBU:monthly\&quot;, ...]&#x60;. These identifiers are usable in any query&#39;s &#x60;symbol&#x60; param. The second array is the current resolution of these intervals. Results are mapped at the same index.

### Example
```javascript
import BitMexApi from 'bit_mex_api';

let apiInstance = new BitMexApi.InstrumentApi();

apiInstance.instrumentGetActiveIntervals((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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
> [IndexComposite] instrumentGetCompositeIndex(opts)

Show constituent parts of an index.

Composite indices are built from multiple external price sources.  Use this endpoint to get the underlying prices of an index. For example, send a &#x60;symbol&#x60; of &#x60;.XBT&#x60; to get the ticks and weights of the constituent exchanges that build the \&quot;.XBT\&quot; index.  A tick with reference &#x60;\&quot;BMI\&quot;&#x60; and weight &#x60;null&#x60; is the composite index tick. 

### Example
```javascript
import BitMexApi from 'bit_mex_api';

let apiInstance = new BitMexApi.InstrumentApi();

let opts = { 
  'account': 1.2, // Number | 
  'symbol': ".XBT", // String | The composite index symbol.
  'filter': "filter_example", // String | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.
  'columns': "columns_example", // String | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
  'count': 100, // Number | Number of results to fetch.
  'start': 0, // Number | Starting point for results.
  'reverse': false, // Boolean | If true, will sort results newest first.
  'startTime': new Date("2013-10-20T19:20:30+01:00"), // Date | Starting date filter for results.
  'endTime': new Date("2013-10-20T19:20:30+01:00") // Date | Ending date filter for results.
};

apiInstance.instrumentGetCompositeIndex(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **Number**|  | [optional] 
 **symbol** | **String**| The composite index symbol. | [optional] [default to .XBT]
 **filter** | **String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details. | [optional] 
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **Number**| Number of results to fetch. | [optional] [default to 100]
 **start** | **Number**| Starting point for results. | [optional] [default to 0]
 **reverse** | **Boolean**| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **Date**| Starting date filter for results. | [optional] 
 **endTime** | **Date**| Ending date filter for results. | [optional] 

### Return type

[**[IndexComposite]**](IndexComposite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="instrumentGetIndices"></a>
# **instrumentGetIndices**
> [Instrument] instrumentGetIndices()

Get all price indices.

### Example
```javascript
import BitMexApi from 'bit_mex_api';

let apiInstance = new BitMexApi.InstrumentApi();

apiInstance.instrumentGetIndices((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[Instrument]**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

