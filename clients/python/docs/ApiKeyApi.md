# swagger_client.ApiKeyApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**api_key_disable**](ApiKeyApi.md#api_key_disable) | **POST** /apiKey/disable | Disable an API Key.
[**api_key_enable**](ApiKeyApi.md#api_key_enable) | **POST** /apiKey/enable | Enable an API Key.
[**api_key_get**](ApiKeyApi.md#api_key_get) | **GET** /apiKey | Get your API Keys.
[**api_key_new**](ApiKeyApi.md#api_key_new) | **POST** /apiKey | Create a new API Key.
[**api_key_remove**](ApiKeyApi.md#api_key_remove) | **DELETE** /apiKey | Remove an API Key.


# **api_key_disable**
> ApiKey api_key_disable(api_key_id)

Disable an API Key.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ApiKeyApi()
api_key_id = 'api_key_id_example' # str | API Key ID (public component).

try: 
    # Disable an API Key.
    api_response = api_instance.api_key_disable(api_key_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ApiKeyApi->api_key_disable: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key_id** | **str**| API Key ID (public component). | 

### Return type

[**ApiKey**](ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_key_enable**
> ApiKey api_key_enable(api_key_id)

Enable an API Key.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ApiKeyApi()
api_key_id = 'api_key_id_example' # str | API Key ID (public component).

try: 
    # Enable an API Key.
    api_response = api_instance.api_key_enable(api_key_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ApiKeyApi->api_key_enable: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key_id** | **str**| API Key ID (public component). | 

### Return type

[**ApiKey**](ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_key_get**
> list[ApiKey] api_key_get(reverse=reverse)

Get your API Keys.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ApiKeyApi()
reverse = false # bool | If true, will sort results newest first. (optional) (default to false)

try: 
    # Get your API Keys.
    api_response = api_instance.api_key_get(reverse=reverse)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ApiKeyApi->api_key_get: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reverse** | **bool**| If true, will sort results newest first. | [optional] [default to false]

### Return type

[**list[ApiKey]**](ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_key_new**
> ApiKey api_key_new(name=name, cidr=cidr, permissions=permissions, enabled=enabled, token=token)

Create a new API Key.

API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ApiKeyApi()
name = 'name_example' # str | Key name. This name is for reference only. (optional)
cidr = 'cidr_example' # str | CIDR block to restrict this key to. To restrict to a single address, append \"/32\", e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. <a href=\"http://software77.net/cidr-101.html\">More on CIDR blocks</a> (optional)
permissions = 'permissions_example' # str | Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\"order\", \"withdraw\"]. (optional)
enabled = false # bool | Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. (optional) (default to false)
token = 'token_example' # str | OTP Token (YubiKey, Google Authenticator) (optional)

try: 
    # Create a new API Key.
    api_response = api_instance.api_key_new(name=name, cidr=cidr, permissions=permissions, enabled=enabled, token=token)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ApiKeyApi->api_key_new: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| Key name. This name is for reference only. | [optional] 
 **cidr** | **str**| CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href&#x3D;\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt; | [optional] 
 **permissions** | **str**| Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;withdraw\&quot;]. | [optional] 
 **enabled** | **bool**| Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. | [optional] [default to false]
 **token** | **str**| OTP Token (YubiKey, Google Authenticator) | [optional] 

### Return type

[**ApiKey**](ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_key_remove**
> InlineResponse200 api_key_remove(api_key_id)

Remove an API Key.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ApiKeyApi()
api_key_id = 'api_key_id_example' # str | API Key ID (public component).

try: 
    # Remove an API Key.
    api_response = api_instance.api_key_remove(api_key_id)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling ApiKeyApi->api_key_remove: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key_id** | **str**| API Key ID (public component). | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

