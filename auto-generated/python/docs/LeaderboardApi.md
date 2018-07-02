# swagger_client.LeaderboardApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leaderboard_get**](LeaderboardApi.md#leaderboard_get) | **GET** /leaderboard | Get current leaderboard.
[**leaderboard_get_name**](LeaderboardApi.md#leaderboard_get_name) | **GET** /leaderboard/name | Get your alias on the leaderboard.


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

# **leaderboard_get_name**
> InlineResponse2001 leaderboard_get_name()

Get your alias on the leaderboard.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: apiKey
configuration = swagger_client.Configuration()
configuration.api_key['api-key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-key'] = 'Bearer'
# Configure API key authorization: apiNonce
configuration = swagger_client.Configuration()
configuration.api_key['api-nonce'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-nonce'] = 'Bearer'
# Configure API key authorization: apiSignature
configuration = swagger_client.Configuration()
configuration.api_key['api-signature'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-signature'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.LeaderboardApi(swagger_client.ApiClient(configuration))

try:
    # Get your alias on the leaderboard.
    api_response = api_instance.leaderboard_get_name()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LeaderboardApi->leaderboard_get_name: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

