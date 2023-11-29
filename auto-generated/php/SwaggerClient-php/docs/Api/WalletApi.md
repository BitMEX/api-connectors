# Swagger\Client\WalletApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**walletGetAssetsConfig**](WalletApi.md#walletGetAssetsConfig) | **GET** /wallet/assets | Get Assets Config
[**walletGetNetworksConfig**](WalletApi.md#walletGetNetworksConfig) | **GET** /wallet/networks | Get Networks Config


# **walletGetAssetsConfig**
> \Swagger\Client\Model\AssetsConfig[] walletGetAssetsConfig()

Get Assets Config

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\WalletApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->walletGetAssetsConfig();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletApi->walletGetAssetsConfig: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\AssetsConfig[]**](../Model/AssetsConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **walletGetNetworksConfig**
> \Swagger\Client\Model\NetworksConfig[] walletGetNetworksConfig()

Get Networks Config

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\WalletApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->walletGetNetworksConfig();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling WalletApi->walletGetNetworksConfig: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\NetworksConfig[]**](../Model/NetworksConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

