# swagger_client.AnnouncementApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**announcement_get**](AnnouncementApi.md#announcement_get) | **GET** /announcement | Get site announcements.
[**announcement_get_urgent**](AnnouncementApi.md#announcement_get_urgent) | **GET** /announcement/urgent | Get urgent (banner) announcements.


# **announcement_get**
> list[Announcement] announcement_get(columns=columns)

Get site announcements.

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AnnouncementApi()
columns = 'columns_example' # str | Array of column names to fetch. If omitted, will return all columns. (optional)

try: 
    # Get site announcements.
    api_response = api_instance.announcement_get(columns=columns)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AnnouncementApi->announcement_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columns** | **str**| Array of column names to fetch. If omitted, will return all columns. | [optional] 

### Return type

[**list[Announcement]**](Announcement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **announcement_get_urgent**
> list[Announcement] announcement_get_urgent()

Get urgent (banner) announcements.

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
api_instance = swagger_client.AnnouncementApi(swagger_client.ApiClient(configuration))

try: 
    # Get urgent (banner) announcements.
    api_response = api_instance.announcement_get_urgent()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AnnouncementApi->announcement_get_urgent: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Announcement]**](Announcement.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

