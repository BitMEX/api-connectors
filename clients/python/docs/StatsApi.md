# swagger_client.StatsApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**stats_get**](StatsApi.md#stats_get) | **GET** /stats | Get exchange-wide and per-series turnover and volume statistics.
[**stats_history**](StatsApi.md#stats_history) | **GET** /stats/history | Get historical exchange-wide and per-series turnover and volume statistics.
[**stats_history_usd**](StatsApi.md#stats_history_usd) | **GET** /stats/historyUSD | Get a summary of exchange statistics in USD.


# **stats_get**
> list[Stats] stats_get()

Get exchange-wide and per-series turnover and volume statistics.

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.StatsApi()

try: 
    # Get exchange-wide and per-series turnover and volume statistics.
    api_response = api_instance.stats_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling StatsApi->stats_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Stats]**](Stats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stats_history**
> list[StatsHistory] stats_history()

Get historical exchange-wide and per-series turnover and volume statistics.

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.StatsApi()

try: 
    # Get historical exchange-wide and per-series turnover and volume statistics.
    api_response = api_instance.stats_history()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling StatsApi->stats_history: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[StatsHistory]**](StatsHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stats_history_usd**
> list[StatsUSD] stats_history_usd()

Get a summary of exchange statistics in USD.

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.StatsApi()

try: 
    # Get a summary of exchange statistics in USD.
    api_response = api_instance.stats_history_usd()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling StatsApi->stats_history_usd: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[StatsUSD]**](StatsUSD.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

