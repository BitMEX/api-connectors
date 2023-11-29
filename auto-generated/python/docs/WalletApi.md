# swagger_client.WalletApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**wallet_get_assets_config**](WalletApi.md#wallet_get_assets_config) | **GET** /wallet/assets | Get Assets Config
[**wallet_get_networks_config**](WalletApi.md#wallet_get_networks_config) | **GET** /wallet/networks | Get Networks Config


# **wallet_get_assets_config**
> list[AssetsConfig] wallet_get_assets_config()

Get Assets Config

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletApi()

try:
    # Get Assets Config
    api_response = api_instance.wallet_get_assets_config()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletApi->wallet_get_assets_config: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[AssetsConfig]**](AssetsConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **wallet_get_networks_config**
> list[NetworksConfig] wallet_get_networks_config()

Get Networks Config

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WalletApi()

try:
    # Get Networks Config
    api_response = api_instance.wallet_get_networks_config()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WalletApi->wallet_get_networks_config: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[NetworksConfig]**](NetworksConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

