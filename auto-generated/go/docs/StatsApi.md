# \StatsApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**StatsGet**](StatsApi.md#StatsGet) | **Get** /stats | Get exchange-wide and per-series turnover and volume statistics.
[**StatsHistory**](StatsApi.md#StatsHistory) | **Get** /stats/history | Get historical exchange-wide and per-series turnover and volume statistics.
[**StatsHistoryUSD**](StatsApi.md#StatsHistoryUSD) | **Get** /stats/historyUSD | Get a summary of exchange statistics in USD.


# **StatsGet**
> []Stats StatsGet(ctx, )
Get exchange-wide and per-series turnover and volume statistics.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]Stats**](Stats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StatsHistory**
> []StatsHistory StatsHistory(ctx, )
Get historical exchange-wide and per-series turnover and volume statistics.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]StatsHistory**](StatsHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **StatsHistoryUSD**
> []StatsUsd StatsHistoryUSD(ctx, )
Get a summary of exchange statistics in USD.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]StatsUsd**](StatsUSD.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

