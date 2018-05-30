# IO.Swagger.Api.LiquidationApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LiquidationGet**](LiquidationApi.md#liquidationget) | **GET** /liquidation | Get liquidation orders.


<a name="liquidationget"></a>
# **LiquidationGet**
> List<Liquidation> LiquidationGet (string symbol = null, string filter = null, string columns = null, decimal? count = null, decimal? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null)

Get liquidation orders.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class LiquidationGetExample
    {
        public void main()
        {
            var apiInstance = new LiquidationApi();
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
                // Get liquidation orders.
                List&lt;Liquidation&gt; result = apiInstance.LiquidationGet(symbol, filter, columns, count, start, reverse, startTime, endTime);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LiquidationApi.LiquidationGet: " + e.Message );
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

[**List<Liquidation>**](Liquidation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

