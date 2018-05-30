# IO.Swagger.Api.QuoteApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**QuoteGet**](QuoteApi.md#quoteget) | **GET** /quote | Get Quotes.
[**QuoteGetBucketed**](QuoteApi.md#quotegetbucketed) | **GET** /quote/bucketed | Get previous quotes in time buckets.


<a name="quoteget"></a>
# **QuoteGet**
> List<Quote> QuoteGet (string symbol = null, string filter = null, string columns = null, decimal? count = null, decimal? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null)

Get Quotes.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class QuoteGetExample
    {
        public void main()
        {
            var apiInstance = new QuoteApi();
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
                // Get Quotes.
                List&lt;Quote&gt; result = apiInstance.QuoteGet(symbol, filter, columns, count, start, reverse, startTime, endTime);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling QuoteApi.QuoteGet: " + e.Message );
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

[**List<Quote>**](Quote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="quotegetbucketed"></a>
# **QuoteGetBucketed**
> List<Quote> QuoteGetBucketed (string binSize = null, bool? partial = null, string symbol = null, string filter = null, string columns = null, decimal? count = null, decimal? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null)

Get previous quotes in time buckets.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class QuoteGetBucketedExample
    {
        public void main()
        {
            var apiInstance = new QuoteApi();
            var binSize = binSize_example;  // string | Time interval to bucket by. Available options: [1m,5m,1h,1d]. (optional)  (default to 1m)
            var partial = true;  // bool? | If true, will send in-progress (incomplete) bins for the current time period. (optional)  (default to false)
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
                // Get previous quotes in time buckets.
                List&lt;Quote&gt; result = apiInstance.QuoteGetBucketed(binSize, partial, symbol, filter, columns, count, start, reverse, startTime, endTime);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling QuoteApi.QuoteGetBucketed: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **binSize** | **string**| Time interval to bucket by. Available options: [1m,5m,1h,1d]. | [optional] [default to 1m]
 **partial** | **bool?**| If true, will send in-progress (incomplete) bins for the current time period. | [optional] [default to false]
 **symbol** | **string**| Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. | [optional] 
 **filter** | **string**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **string**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **decimal?**| Number of results to fetch. | [optional] [default to 100]
 **start** | **decimal?**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool?**| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **DateTime?**| Starting date filter for results. | [optional] 
 **endTime** | **DateTime?**| Ending date filter for results. | [optional] 

### Return type

[**List<Quote>**](Quote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

