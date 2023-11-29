# swagger_client.PorlApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**porl_get_nonce**](PorlApi.md#porl_get_nonce) | **GET** /porl/nonce | Get your Proof of Reserves nonce and data.
[**porl_get_snapshots**](PorlApi.md#porl_get_snapshots) | **GET** /porl/snapshots | Get Proof of Reserves historical snapshots


# **porl_get_nonce**
> Porl porl_get_nonce()

Get your Proof of Reserves nonce and data.

## Proof of Reserves Nonce  This endpoint will return the nonce and associated data needed to validate BitMEX reserves data.  <! TODO link to docs, GitHub, etc > 

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
api_instance = swagger_client.PorlApi(swagger_client.ApiClient(configuration))

try:
    # Get your Proof of Reserves nonce and data.
    api_response = api_instance.porl_get_nonce()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PorlApi->porl_get_nonce: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Porl**](Porl.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **porl_get_snapshots**
> list[XAny] porl_get_snapshots()

Get Proof of Reserves historical snapshots

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.PorlApi()

try:
    # Get Proof of Reserves historical snapshots
    api_response = api_instance.porl_get_snapshots()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PorlApi->porl_get_snapshots: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[XAny]**](XAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

