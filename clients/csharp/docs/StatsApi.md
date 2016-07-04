# IO.Swagger.Api.StatsApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**StatsGet**](StatsApi.md#statsget) | **GET** /stats | Get exchange-wide and per-series turnover and volume statistics.
[**StatsHistory**](StatsApi.md#statshistory) | **GET** /stats/history | Get historical exchange-wide and per-series turnover and volume statistics.


# **StatsGet**
> List<Stats> StatsGet ()

Get exchange-wide and per-series turnover and volume statistics.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class StatsGetExample
    {
        public void main()
        {
            
            var apiInstance = new StatsApi();

            try
            {
                // Get exchange-wide and per-series turnover and volume statistics.
                List&lt;Stats&gt; result = apiInstance.StatsGet();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StatsApi.StatsGet: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<Stats>**](Stats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StatsHistory**
> List<StatsHistory> StatsHistory ()

Get historical exchange-wide and per-series turnover and volume statistics.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class StatsHistoryExample
    {
        public void main()
        {
            
            var apiInstance = new StatsApi();

            try
            {
                // Get historical exchange-wide and per-series turnover and volume statistics.
                List&lt;StatsHistory&gt; result = apiInstance.StatsHistory();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StatsApi.StatsHistory: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<StatsHistory>**](StatsHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

