# swagger_client.AddressApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**address_get**](AddressApi.md#address_get) | **GET** /address | Get your addresses.
[**address_new**](AddressApi.md#address_new) | **POST** /address | Creates a new saved address.


# **address_get**
> list[Address] address_get()

Get your addresses.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: apiExpires
configuration = swagger_client.Configuration()
configuration.api_key['api-expires'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-expires'] = 'Bearer'
# Configure API key authorization: apiKey
configuration = swagger_client.Configuration()
configuration.api_key['api-key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-key'] = 'Bearer'
# Configure API key authorization: apiSignature
configuration = swagger_client.Configuration()
configuration.api_key['api-signature'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-signature'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.AddressApi(swagger_client.ApiClient(configuration))

try:
    # Get your addresses.
    api_response = api_instance.address_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AddressApi->address_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[Address]**](Address.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **address_new**
> Address address_new(currency, network, address, name, note=note, skip_confirm=skip_confirm, skip2_fa=skip2_fa)

Creates a new saved address.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: apiExpires
configuration = swagger_client.Configuration()
configuration.api_key['api-expires'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-expires'] = 'Bearer'
# Configure API key authorization: apiKey
configuration = swagger_client.Configuration()
configuration.api_key['api-key'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-key'] = 'Bearer'
# Configure API key authorization: apiSignature
configuration = swagger_client.Configuration()
configuration.api_key['api-signature'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api-signature'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.AddressApi(swagger_client.ApiClient(configuration))
currency = 'currency_example' # str | Currency of the address. Options: `XBt`, `USDt`
network = 'network_example' # str | Selected network.
address = 'address_example' # str | Destination Address.
name = 'name_example' # str | Name of the entry, eg. 'Hardware wallet'.
note = 'note_example' # str | Optional annotation. (optional)
skip_confirm = false # bool | Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. (optional) (default to false)
skip2_fa = false # bool | Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. (optional) (default to false)

try:
    # Creates a new saved address.
    api_response = api_instance.address_new(currency, network, address, name, note=note, skip_confirm=skip_confirm, skip2_fa=skip2_fa)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AddressApi->address_new: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **str**| Currency of the address. Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; | 
 **network** | **str**| Selected network. | 
 **address** | **str**| Destination Address. | 
 **name** | **str**| Name of the entry, eg. &#39;Hardware wallet&#39;. | 
 **note** | **str**| Optional annotation. | [optional] 
 **skip_confirm** | **bool**| Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. | [optional] [default to false]
 **skip2_fa** | **bool**| Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. | [optional] [default to false]

### Return type

[**Address**](Address.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

