# BitMexApi.StatsApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statsGet**](StatsApi.md#statsGet) | **GET** /stats | Get exchange-wide and per-series turnover and volume statistics.
[**statsHistory**](StatsApi.md#statsHistory) | **GET** /stats/history | Get historical exchange-wide and per-series turnover and volume statistics.
[**statsHistoryUSD**](StatsApi.md#statsHistoryUSD) | **GET** /stats/historyUSD | Get a summary of exchange statistics in USD.


<a name="statsGet"></a>
# **statsGet**
> [Stats] statsGet()

Get exchange-wide and per-series turnover and volume statistics.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.StatsApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.statsGet(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[Stats]**](Stats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="statsHistory"></a>
# **statsHistory**
> [StatsHistory] statsHistory()

Get historical exchange-wide and per-series turnover and volume statistics.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.StatsApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.statsHistory(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[StatsHistory]**](StatsHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="statsHistoryUSD"></a>
# **statsHistoryUSD**
> [StatsUSD] statsHistoryUSD()

Get a summary of exchange statistics in USD.

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.StatsApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.statsHistoryUSD(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[StatsUSD]**](StatsUSD.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

