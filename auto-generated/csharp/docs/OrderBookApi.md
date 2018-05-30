# IO.Swagger.Api.OrderBookApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OrderBookGetL2**](OrderBookApi.md#orderbookgetl2) | **GET** /orderBook/L2 | Get current orderbook in vertical format.


<a name="orderbookgetl2"></a>
# **OrderBookGetL2**
> List<OrderBookL2> OrderBookGetL2 (string symbol, decimal? depth = null)

Get current orderbook in vertical format.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class OrderBookGetL2Example
    {
        public void main()
        {
            var apiInstance = new OrderBookApi();
            var symbol = symbol_example;  // string | Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
            var depth = 8.14;  // decimal? | Orderbook depth per side. Send 0 for full depth. (optional)  (default to 25)

            try
            {
                // Get current orderbook in vertical format.
                List&lt;OrderBookL2&gt; result = apiInstance.OrderBookGetL2(symbol, depth);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrderBookApi.OrderBookGetL2: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. | 
 **depth** | **decimal?**| Orderbook depth per side. Send 0 for full depth. | [optional] [default to 25]

### Return type

[**List<OrderBookL2>**](OrderBookL2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

