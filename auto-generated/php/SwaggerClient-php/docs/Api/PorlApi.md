# Swagger\Client\PorlApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**porlGetNonce**](PorlApi.md#porlGetNonce) | **GET** /porl/nonce | Get your Proof of Reserves nonce and data.
[**porlGetSnapshots**](PorlApi.md#porlGetSnapshots) | **GET** /porl/snapshots | Get Proof of Reserves historical snapshots


# **porlGetNonce**
> \Swagger\Client\Model\Porl porlGetNonce()

Get your Proof of Reserves nonce and data.

## Proof of Reserves Nonce  This endpoint will return the nonce and associated data needed to validate BitMEX reserves data.  <! TODO link to docs, GitHub, etc >

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure API key authorization: apiExpires
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('api-expires', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('api-expires', 'Bearer');
// Configure API key authorization: apiKey
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('api-key', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('api-key', 'Bearer');
// Configure API key authorization: apiSignature
$config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKey('api-signature', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = Swagger\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('api-signature', 'Bearer');

$apiInstance = new Swagger\Client\Api\PorlApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->porlGetNonce();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PorlApi->porlGetNonce: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\Porl**](../Model/Porl.md)

### Authorization

[apiExpires](../../README.md#apiExpires), [apiKey](../../README.md#apiKey), [apiSignature](../../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **porlGetSnapshots**
> \Swagger\Client\Model\XAny[] porlGetSnapshots()

Get Proof of Reserves historical snapshots

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\PorlApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->porlGetSnapshots();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PorlApi->porlGetSnapshots: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\XAny[]**](../Model/XAny.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

