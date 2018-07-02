# IO.Swagger.Api.StatsApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**StatsGet**](StatsApi.md#statsget) | **GET** /stats | Get exchange-wide and per-series turnover and volume statistics.
[**StatsHistory**](StatsApi.md#statshistory) | **GET** /stats/history | Get historical exchange-wide and per-series turnover and volume statistics.
[**StatsHistoryUSD**](StatsApi.md#statshistoryusd) | **GET** /stats/historyUSD | Get a summary of exchange statistics in USD.


<a name="statsget"></a>
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

<a name="statshistory"></a>
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

<a name="statshistoryusd"></a>
# **StatsHistoryUSD**
> List<StatsUSD> StatsHistoryUSD ()

Get a summary of exchange statistics in USD.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class StatsHistoryUSDExample
    {
        public void main()
        {
            var apiInstance = new StatsApi();

            try
            {
                // Get a summary of exchange statistics in USD.
                List&lt;StatsUSD&gt; result = apiInstance.StatsHistoryUSD();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StatsApi.StatsHistoryUSD: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<StatsUSD>**](StatsUSD.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

