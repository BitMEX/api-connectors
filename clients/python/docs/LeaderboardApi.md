# swagger_client.LeaderboardApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leaderboard_get**](LeaderboardApi.md#leaderboard_get) | **GET** /leaderboard | Get current leaderboard.


# **leaderboard_get**
> list[Leaderboard] leaderboard_get(method=method)

Get current leaderboard.

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.LeaderboardApi()
method = 'notional' # str | Ranking type. Options: \"notional\", \"ROE\" (optional) (default to notional)

try: 
    # Get current leaderboard.
    api_response = api_instance.leaderboard_get(method=method)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LeaderboardApi->leaderboard_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **method** | **str**| Ranking type. Options: \&quot;notional\&quot;, \&quot;ROE\&quot; | [optional] [default to notional]

### Return type

[**list[Leaderboard]**](Leaderboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

