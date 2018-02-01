# swagger_client.ChatApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chat_get**](ChatApi.md#chat_get) | **GET** /chat | Get chat messages.
[**chat_get_channels**](ChatApi.md#chat_get_channels) | **GET** /chat/channels | Get available channels.
[**chat_get_connected**](ChatApi.md#chat_get_connected) | **GET** /chat/connected | Get connected users.
[**chat_new**](ChatApi.md#chat_new) | **POST** /chat | Send a chat message.


# **chat_get**
> list[Chat] chat_get(count=count, start=start, reverse=reverse, channel_id=channel_id)

Get chat messages.

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ChatApi()
count = 100 # float | Number of results to fetch. (optional) (default to 100)
start = 0 # float | Starting ID for results. (optional) (default to 0)
reverse = true # bool | If true, will sort results newest first. (optional) (default to true)
channel_id = 1.2 # float | Channel id. GET /chat/channels for ids. Leave blank for all. (optional)

try: 
    # Get chat messages.
    api_response = api_instance.chat_get(count=count, start=start, reverse=reverse, channel_id=channel_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ChatApi->chat_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **float**| Number of results to fetch. | [optional] [default to 100]
 **start** | **float**| Starting ID for results. | [optional] [default to 0]
 **reverse** | **bool**| If true, will sort results newest first. | [optional] [default to true]
 **channel_id** | **float**| Channel id. GET /chat/channels for ids. Leave blank for all. | [optional] 

### Return type

[**list[Chat]**](Chat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **chat_get_channels**
> list[ChatChannel] chat_get_channels()

Get available channels.

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ChatApi()

try: 
    # Get available channels.
    api_response = api_instance.chat_get_channels()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ChatApi->chat_get_channels: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[ChatChannel]**](ChatChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **chat_get_connected**
> ConnectedUsers chat_get_connected()

Get connected users.

Returns an array with browser users in the first position and API users (bots) in the second position.

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ChatApi()

try: 
    # Get connected users.
    api_response = api_instance.chat_get_connected()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ChatApi->chat_get_connected: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConnectedUsers**](ConnectedUsers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **chat_new**
> Chat chat_new(message, channel_id=channel_id)

Send a chat message.

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
api_instance = swagger_client.ChatApi(swagger_client.ApiClient(configuration))
message = 'message_example' # str | 
channel_id = 1 # float | Channel to post to. Default 1 (English). (optional) (default to 1)

try: 
    # Send a chat message.
    api_response = api_instance.chat_new(message, channel_id=channel_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ChatApi->chat_new: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | **str**|  | 
 **channel_id** | **float**| Channel to post to. Default 1 (English). | [optional] [default to 1]

### Return type

[**Chat**](Chat.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

