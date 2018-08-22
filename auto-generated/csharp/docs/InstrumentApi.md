# IO.Swagger.Api.InstrumentApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**InstrumentGet**](InstrumentApi.md#instrumentget) | **GET** /instrument | Get instruments.
[**InstrumentGetActive**](InstrumentApi.md#instrumentgetactive) | **GET** /instrument/active | Get all active instruments and instruments that have expired in &lt;24hrs.
[**InstrumentGetActiveAndIndices**](InstrumentApi.md#instrumentgetactiveandindices) | **GET** /instrument/activeAndIndices | Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
[**InstrumentGetActiveIntervals**](InstrumentApi.md#instrumentgetactiveintervals) | **GET** /instrument/activeIntervals | Return all active contract series and interval pairs.
[**InstrumentGetCompositeIndex**](InstrumentApi.md#instrumentgetcompositeindex) | **GET** /instrument/compositeIndex | Show constituent parts of an index.
[**InstrumentGetIndices**](InstrumentApi.md#instrumentgetindices) | **GET** /instrument/indices | Get all price indices.


<a name="instrumentget"></a>
# **InstrumentGet**
> List<Instrument> InstrumentGet (string symbol = null, string filter = null, string columns = null, decimal? count = null, decimal? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null)

Get instruments.

This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use `/instrument/active` to return active instruments, or use a filter like `{\"state\": \"Open\"}`.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InstrumentGetExample
    {
        public void main()
        {
            var apiInstance = new InstrumentApi();
            var symbol = symbol_example;  // string | Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`. (optional) 
            var filter = filter_example;  // string | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional) 
            var columns = columns_example;  // string | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional) 
            var count = 8.14;  // decimal? | Number of results to fetch. (optional)  (default to 100)
            var start = 8.14;  // decimal? | Starting point for results. (optional)  (default to 0)
            var reverse = true;  // bool? | If true, will sort results newest first. (optional)  (default to false)
            var startTime = 2013-10-20T19:20:30+01:00;  // DateTime? | Starting date filter for results. (optional) 
            var endTime = 2013-10-20T19:20:30+01:00;  // DateTime? | Ending date filter for results. (optional) 

            try
            {
                // Get instruments.
                List&lt;Instrument&gt; result = apiInstance.InstrumentGet(symbol, filter, columns, count, start, reverse, startTime, endTime);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstrumentApi.InstrumentGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. | [optional] 
 **filter** | **string**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **string**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **decimal?**| Number of results to fetch. | [optional] [default to 100]
 **start** | **decimal?**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool?**| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **DateTime?**| Starting date filter for results. | [optional] 
 **endTime** | **DateTime?**| Ending date filter for results. | [optional] 

### Return type

[**List<Instrument>**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="instrumentgetactive"></a>
# **InstrumentGetActive**
> List<Instrument> InstrumentGetActive ()

Get all active instruments and instruments that have expired in <24hrs.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InstrumentGetActiveExample
    {
        public void main()
        {
            var apiInstance = new InstrumentApi();

            try
            {
                // Get all active instruments and instruments that have expired in <24hrs.
                List&lt;Instrument&gt; result = apiInstance.InstrumentGetActive();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstrumentApi.InstrumentGetActive: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<Instrument>**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="instrumentgetactiveandindices"></a>
# **InstrumentGetActiveAndIndices**
> List<Instrument> InstrumentGetActiveAndIndices ()

Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InstrumentGetActiveAndIndicesExample
    {
        public void main()
        {
            var apiInstance = new InstrumentApi();

            try
            {
                // Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
                List&lt;Instrument&gt; result = apiInstance.InstrumentGetActiveAndIndices();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstrumentApi.InstrumentGetActiveAndIndices: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<Instrument>**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="instrumentgetactiveintervals"></a>
# **InstrumentGetActiveIntervals**
> InstrumentInterval InstrumentGetActiveIntervals ()

Return all active contract series and interval pairs.

This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as `[\"XBT:perpetual\", \"XBT:monthly\", \"XBT:quarterly\", \"ETH:monthly\", ...]`. These identifiers are usable in any query's `symbol` param. The second array is the current resolution of these intervals. Results are mapped at the same index.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InstrumentGetActiveIntervalsExample
    {
        public void main()
        {
            var apiInstance = new InstrumentApi();

            try
            {
                // Return all active contract series and interval pairs.
                InstrumentInterval result = apiInstance.InstrumentGetActiveIntervals();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstrumentApi.InstrumentGetActiveIntervals: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="instrumentgetcompositeindex"></a>
# **InstrumentGetCompositeIndex**
> List<IndexComposite> InstrumentGetCompositeIndex (double? account = null, string symbol = null, string filter = null, string columns = null, decimal? count = null, decimal? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null)

Show constituent parts of an index.

Composite indices are built from multiple external price sources.  Use this endpoint to get the underlying prices of an index. For example, send a `symbol` of `.XBT` to get the ticks and weights of the constituent exchanges that build the \".XBT\" index.  A tick with reference `\"BMI\"` and weight `null` is the composite index tick. 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InstrumentGetCompositeIndexExample
    {
        public void main()
        {
            var apiInstance = new InstrumentApi();
            var account = 1.2;  // double? |  (optional) 
            var symbol = symbol_example;  // string | The composite index symbol. (optional)  (default to .XBT)
            var filter = filter_example;  // string | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional) 
            var columns = columns_example;  // string | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional) 
            var count = 8.14;  // decimal? | Number of results to fetch. (optional)  (default to 100)
            var start = 8.14;  // decimal? | Starting point for results. (optional)  (default to 0)
            var reverse = true;  // bool? | If true, will sort results newest first. (optional)  (default to false)
            var startTime = 2013-10-20T19:20:30+01:00;  // DateTime? | Starting date filter for results. (optional) 
            var endTime = 2013-10-20T19:20:30+01:00;  // DateTime? | Ending date filter for results. (optional) 

            try
            {
                // Show constituent parts of an index.
                List&lt;IndexComposite&gt; result = apiInstance.InstrumentGetCompositeIndex(account, symbol, filter, columns, count, start, reverse, startTime, endTime);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstrumentApi.InstrumentGetCompositeIndex: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | **double?**|  | [optional] 
 **symbol** | **string**| The composite index symbol. | [optional] [default to .XBT]
 **filter** | **string**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **string**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **decimal?**| Number of results to fetch. | [optional] [default to 100]
 **start** | **decimal?**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool?**| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **DateTime?**| Starting date filter for results. | [optional] 
 **endTime** | **DateTime?**| Ending date filter for results. | [optional] 

### Return type

[**List<IndexComposite>**](IndexComposite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="instrumentgetindices"></a>
# **InstrumentGetIndices**
> List<Instrument> InstrumentGetIndices ()

Get all price indices.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class InstrumentGetIndicesExample
    {
        public void main()
        {
            var apiInstance = new InstrumentApi();

            try
            {
                // Get all price indices.
                List&lt;Instrument&gt; result = apiInstance.InstrumentGetIndices();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling InstrumentApi.InstrumentGetIndices: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<Instrument>**](Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

