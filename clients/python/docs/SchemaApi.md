# swagger_client.SchemaApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schema_get**](SchemaApi.md#schema_get) | **GET** /schema | Get model schemata for data objects returned by this API.
[**schema_websocket_help**](SchemaApi.md#schema_websocket_help) | **GET** /schema/websocketHelp | Returns help text &amp; subject list for websocket usage.


# **schema_get**
> object schema_get(model=model)

Get model schemata for data objects returned by this API.

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SchemaApi()
model = 'model_example' # str | Optional model filter. If omitted, will return all models. (optional)

try: 
    # Get model schemata for data objects returned by this API.
    api_response = api_instance.schema_get(model=model)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SchemaApi->schema_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **str**| Optional model filter. If omitted, will return all models. | [optional] 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schema_websocket_help**
> object schema_websocket_help()

Returns help text & subject list for websocket usage.

### Example 
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SchemaApi()

try: 
    # Returns help text & subject list for websocket usage.
    api_response = api_instance.schema_websocket_help()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SchemaApi->schema_websocket_help: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

