# swagger_client.UserAffiliatesApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_affiliates_get**](UserAffiliatesApi.md#user_affiliates_get) | **GET** /userAffiliates | Get user&#39;s affiliates to a given depth


# **user_affiliates_get**
> list[XAny] user_affiliates_get(depth=depth, target_account_id=target_account_id, select_user_id=select_user_id)

Get user's affiliates to a given depth

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
api_instance = swagger_client.UserAffiliatesApi(swagger_client.ApiClient(configuration))
depth = 1.2 # float | the depth of affiliates to return. Eg depth = 2 would return direct affiliates and their affiliates (optional)
target_account_id = 1.2 # float | AccountId of Sub-Affiliate Account (optional)
select_user_id = 1.2 # float | User id of result array to keep (optional)

try:
    # Get user's affiliates to a given depth
    api_response = api_instance.user_affiliates_get(depth=depth, target_account_id=target_account_id, select_user_id=select_user_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling UserAffiliatesApi->user_affiliates_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depth** | **float**| the depth of affiliates to return. Eg depth &#x3D; 2 would return direct affiliates and their affiliates | [optional] 
 **target_account_id** | **float**| AccountId of Sub-Affiliate Account | [optional] 
 **select_user_id** | **float**| User id of result array to keep | [optional] 

### Return type

[**list[XAny]**](XAny.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

