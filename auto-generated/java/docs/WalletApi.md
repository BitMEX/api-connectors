# WalletApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**walletGetAssetsConfig**](WalletApi.md#walletGetAssetsConfig) | **GET** /wallet/assets | Get Assets Config
[**walletGetNetworksConfig**](WalletApi.md#walletGetNetworksConfig) | **GET** /wallet/networks | Get Networks Config


<a name="walletGetAssetsConfig"></a>
# **walletGetAssetsConfig**
> List&lt;AssetsConfig&gt; walletGetAssetsConfig()

Get Assets Config

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
try {
    List<AssetsConfig> result = apiInstance.walletGetAssetsConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#walletGetAssetsConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AssetsConfig&gt;**](AssetsConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="walletGetNetworksConfig"></a>
# **walletGetNetworksConfig**
> List&lt;NetworksConfig&gt; walletGetNetworksConfig()

Get Networks Config

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
try {
    List<NetworksConfig> result = apiInstance.walletGetNetworksConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#walletGetNetworksConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;NetworksConfig&gt;**](NetworksConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

