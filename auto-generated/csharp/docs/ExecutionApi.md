# IO.Swagger.Api.ExecutionApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ExecutionGet**](ExecutionApi.md#executionget) | **GET** /execution | Get all raw executions for your account.
[**ExecutionGetTradeHistory**](ExecutionApi.md#executiongettradehistory) | **GET** /execution/tradeHistory | Get all balance-affecting executions.


<a name="executionget"></a>
# **ExecutionGet**
> List<Execution> ExecutionGet (string symbol = null, string filter = null, string columns = null, int? count = null, int? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null)

Get all raw executions for your account.

This returns all raw transactions, which includes order opening and cancelation, and order status changes. It can be quite noisy. More focused information is available at `/execution/tradeHistory`.  You may also use the `filter` param to target your query. Specify an array as a filter value, such as `{\"execType\": [\"Settlement\", \"Trade\"]}` to filter on multiple values.  See [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_8_8.html) for explanations of these fields. 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ExecutionGetExample
    {
        public void main()
        {
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

            var apiInstance = new ExecutionApi();
            var symbol = symbol_example;  // string | Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive. (optional) 
            var filter = filter_example;  // string | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional) 
            var columns = columns_example;  // string | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional) 
            var count = 56;  // int? | Number of results to fetch. Must be a positive integer. (optional)  (default to 100)
            var start = 56;  // int? | Starting point for results. (optional)  (default to 0)
            var reverse = true;  // bool? | If true, will sort results newest first. (optional)  (default to false)
            var startTime = 2013-10-20T19:20:30+01:00;  // DateTime? | Starting date filter for results. (optional) 
            var endTime = 2013-10-20T19:20:30+01:00;  // DateTime? | Ending date filter for results. (optional) 

            try
            {
                // Get all raw executions for your account.
                List&lt;Execution&gt; result = apiInstance.ExecutionGet(symbol, filter, columns, count, start, reverse, startTime, endTime);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExecutionApi.ExecutionGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. | [optional] 
 **filter** | **string**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **string**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **int?**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **int?**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool?**| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **DateTime?**| Starting date filter for results. | [optional] 
 **endTime** | **DateTime?**| Ending date filter for results. | [optional] 

### Return type

[**List<Execution>**](Execution.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="executiongettradehistory"></a>
# **ExecutionGetTradeHistory**
> List<Execution> ExecutionGetTradeHistory (double? targetAccountId = null, string targetAccountIds = null, string symbol = null, string filter = null, string columns = null, int? count = null, int? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null)

Get all balance-affecting executions.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ExecutionGetTradeHistoryExample
    {
        public void main()
        {
            // Configure API key authorization: apiExpires
            Configuration.Default.AddApiKey("api-expires", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-expires", "Bearer");
            // Configure API key authorization: apiKey
            Configuration.Default.AddApiKey("api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-key", "Bearer");
            // Configure API key authorization: apiSignature
            Configuration.Default.AddApiKey("api-signature", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("api-signature", "Bearer");

            var apiInstance = new ExecutionApi();
            var targetAccountId = 1.2;  // double? | AccountId fetching the trade history, must be a paired account with main user. (optional) 
            var targetAccountIds = targetAccountIds_example;  // string | AccountIds fetching the trade history, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user (optional) 
            var symbol = symbol_example;  // string | Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive. (optional) 
            var filter = filter_example;  // string | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional) 
            var columns = columns_example;  // string | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional) 
            var count = 56;  // int? | Number of results to fetch. Must be a positive integer. (optional)  (default to 100)
            var start = 56;  // int? | Starting point for results. (optional)  (default to 0)
            var reverse = true;  // bool? | If true, will sort results newest first. (optional)  (default to false)
            var startTime = 2013-10-20T19:20:30+01:00;  // DateTime? | Starting date filter for results. (optional) 
            var endTime = 2013-10-20T19:20:30+01:00;  // DateTime? | Ending date filter for results. (optional) 

            try
            {
                // Get all balance-affecting executions.
                List&lt;Execution&gt; result = apiInstance.ExecutionGetTradeHistory(targetAccountId, targetAccountIds, symbol, filter, columns, count, start, reverse, startTime, endTime);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExecutionApi.ExecutionGetTradeHistory: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetAccountId** | **double?**| AccountId fetching the trade history, must be a paired account with main user. | [optional] 
 **targetAccountIds** | **string**| AccountIds fetching the trade history, must be a paired account with main user. Can be wildcard * to get all accounts linked to the authenticated user | [optional] 
 **symbol** | **string**| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. | [optional] 
 **filter** | **string**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional] 
 **columns** | **string**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **int?**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **int?**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool?**| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **DateTime?**| Starting date filter for results. | [optional] 
 **endTime** | **DateTime?**| Ending date filter for results. | [optional] 

### Return type

[**List<Execution>**](Execution.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

