# BitMexApi.WalletApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**walletGetAssetsConfig**](WalletApi.md#walletGetAssetsConfig) | **GET** /wallet/assets | Get Assets Config
[**walletGetNetworksConfig**](WalletApi.md#walletGetNetworksConfig) | **GET** /wallet/networks | Get Networks Config


<a name="walletGetAssetsConfig"></a>
# **walletGetAssetsConfig**
> [AssetsConfig] walletGetAssetsConfig()

Get Assets Config

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.WalletApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.walletGetAssetsConfig(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[AssetsConfig]**](AssetsConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="walletGetNetworksConfig"></a>
# **walletGetNetworksConfig**
> [NetworksConfig] walletGetNetworksConfig()

Get Networks Config

### Example
```javascript
var BitMexApi = require('bit_mex_api');

var apiInstance = new BitMexApi.WalletApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.walletGetNetworksConfig(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[NetworksConfig]**](NetworksConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

