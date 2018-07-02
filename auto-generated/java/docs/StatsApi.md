# StatsApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statsGet**](StatsApi.md#statsGet) | **GET** /stats | Get exchange-wide and per-series turnover and volume statistics.
[**statsHistory**](StatsApi.md#statsHistory) | **GET** /stats/history | Get historical exchange-wide and per-series turnover and volume statistics.
[**statsHistoryUSD**](StatsApi.md#statsHistoryUSD) | **GET** /stats/historyUSD | Get a summary of exchange statistics in USD.


<a name="statsGet"></a>
# **statsGet**
> List&lt;Stats&gt; statsGet()

Get exchange-wide and per-series turnover and volume statistics.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StatsApi;


StatsApi apiInstance = new StatsApi();
try {
    List<Stats> result = apiInstance.statsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsApi#statsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Stats&gt;**](Stats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="statsHistory"></a>
# **statsHistory**
> List&lt;StatsHistory&gt; statsHistory()

Get historical exchange-wide and per-series turnover and volume statistics.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StatsApi;


StatsApi apiInstance = new StatsApi();
try {
    List<StatsHistory> result = apiInstance.statsHistory();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsApi#statsHistory");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;StatsHistory&gt;**](StatsHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="statsHistoryUSD"></a>
# **statsHistoryUSD**
> List&lt;StatsUSD&gt; statsHistoryUSD()

Get a summary of exchange statistics in USD.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.StatsApi;


StatsApi apiInstance = new StatsApi();
try {
    List<StatsUSD> result = apiInstance.statsHistoryUSD();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsApi#statsHistoryUSD");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;StatsUSD&gt;**](StatsUSD.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

