# Swagger\Client\AddressApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addressGet**](AddressApi.md#addressGet) | **GET** /address | Get your addresses.
[**addressNew**](AddressApi.md#addressNew) | **POST** /address | Creates a new saved address.


# **addressGet**
> \Swagger\Client\Model\Address[] addressGet()

Get your addresses.

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

$apiInstance = new Swagger\Client\Api\AddressApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->addressGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AddressApi->addressGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\Address[]**](../Model/Address.md)

### Authorization

[apiExpires](../../README.md#apiExpires), [apiKey](../../README.md#apiKey), [apiSignature](../../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **addressNew**
> \Swagger\Client\Model\Address addressNew($currency, $network, $address, $name, $note, $skip_confirm, $skip2_fa)

Creates a new saved address.

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

$apiInstance = new Swagger\Client\Api\AddressApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$currency = "currency_example"; // string | Currency of the address. Options: `XBt`, `USDt`
$network = "network_example"; // string | Selected network.
$address = "address_example"; // string | Destination Address.
$name = "name_example"; // string | Name of the entry, eg. 'Hardware wallet'.
$note = "note_example"; // string | Optional annotation.
$skip_confirm = false; // bool | Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation.
$skip2_fa = false; // bool | Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation.

try {
    $result = $apiInstance->addressNew($currency, $network, $address, $name, $note, $skip_confirm, $skip2_fa);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AddressApi->addressNew: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **string**| Currency of the address. Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; |
 **network** | **string**| Selected network. |
 **address** | **string**| Destination Address. |
 **name** | **string**| Name of the entry, eg. &#39;Hardware wallet&#39;. |
 **note** | **string**| Optional annotation. | [optional]
 **skip_confirm** | **bool**| Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. | [optional] [default to false]
 **skip2_fa** | **bool**| Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. | [optional] [default to false]

### Return type

[**\Swagger\Client\Model\Address**](../Model/Address.md)

### Authorization

[apiExpires](../../README.md#apiExpires), [apiKey](../../README.md#apiKey), [apiSignature](../../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

