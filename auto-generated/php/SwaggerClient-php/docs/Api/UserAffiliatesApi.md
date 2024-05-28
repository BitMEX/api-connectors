# Swagger\Client\UserAffiliatesApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAffiliatesGet**](UserAffiliatesApi.md#userAffiliatesGet) | **GET** /userAffiliates | Get user&#39;s affiliates to a given depth


# **userAffiliatesGet**
> \Swagger\Client\Model\XAny[] userAffiliatesGet($depth, $target_account_id, $select_user_id)

Get user's affiliates to a given depth

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

$apiInstance = new Swagger\Client\Api\UserAffiliatesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$depth = 1.2; // double | the depth of affiliates to return. Eg depth = 2 would return direct affiliates and their affiliates
$target_account_id = 1.2; // double | AccountId of Sub-Affiliate Account
$select_user_id = 1.2; // double | User id of result array to keep

try {
    $result = $apiInstance->userAffiliatesGet($depth, $target_account_id, $select_user_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserAffiliatesApi->userAffiliatesGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depth** | **double**| the depth of affiliates to return. Eg depth &#x3D; 2 would return direct affiliates and their affiliates | [optional]
 **target_account_id** | **double**| AccountId of Sub-Affiliate Account | [optional]
 **select_user_id** | **double**| User id of result array to keep | [optional]

### Return type

[**\Swagger\Client\Model\XAny[]**](../Model/XAny.md)

### Authorization

[apiExpires](../../README.md#apiExpires), [apiKey](../../README.md#apiKey), [apiSignature](../../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

