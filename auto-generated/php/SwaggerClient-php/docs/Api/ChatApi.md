# Swagger\Client\ChatApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatGet**](ChatApi.md#chatGet) | **GET** /chat | Get chat messages.
[**chatGetChannels**](ChatApi.md#chatGetChannels) | **GET** /chat/channels | Get available channels.
[**chatGetConnected**](ChatApi.md#chatGetConnected) | **GET** /chat/connected | Get connected users.
[**chatGetPinnedMessage**](ChatApi.md#chatGetPinnedMessage) | **GET** /chat/pinned | Get pinned message for a channel.
[**chatNew**](ChatApi.md#chatNew) | **POST** /chat | Send a chat message.


# **chatGet**
> \Swagger\Client\Model\Chat[] chatGet($count, $start, $reverse, $channel_id)

Get chat messages.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$count = 100; // int | Number of results to fetch.
$start = 0; // int | Starting ID for results.
$reverse = true; // bool | If true, will sort results newest first.
$channel_id = 1; // double | Channel id. GET /chat/channels for ids. Global English by default

try {
    $result = $apiInstance->chatGet($count, $start, $reverse, $channel_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatApi->chatGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **int**| Number of results to fetch. | [optional] [default to 100]
 **start** | **int**| Starting ID for results. | [optional] [default to 0]
 **reverse** | **bool**| If true, will sort results newest first. | [optional] [default to true]
 **channel_id** | **double**| Channel id. GET /chat/channels for ids. Global English by default | [optional] [default to 1]

### Return type

[**\Swagger\Client\Model\Chat[]**](../Model/Chat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **chatGetChannels**
> \Swagger\Client\Model\ChatChannel[] chatGetChannels()

Get available channels.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->chatGetChannels();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatApi->chatGetChannels: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\ChatChannel[]**](../Model/ChatChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **chatGetConnected**
> \Swagger\Client\Model\ConnectedUsers chatGetConnected()

Get connected users.

Returns an array with browser users in the first position and API users (bots) in the second position.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->chatGetConnected();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatApi->chatGetConnected: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\ConnectedUsers**](../Model/ConnectedUsers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **chatGetPinnedMessage**
> \Swagger\Client\Model\PinnedMessage chatGetPinnedMessage($channel_id)

Get pinned message for a channel.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\ChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$channel_id = 1.2; // double | 

try {
    $result = $apiInstance->chatGetPinnedMessage($channel_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatApi->chatGetPinnedMessage: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel_id** | **double**|  |

### Return type

[**\Swagger\Client\Model\PinnedMessage**](../Model/PinnedMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **chatNew**
> \Swagger\Client\Model\Chat chatNew($message, $channel_id)

Send a chat message.

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

$apiInstance = new Swagger\Client\Api\ChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$message = "message_example"; // string | 
$channel_id = 1; // double | Channel to post to. Default 1 (English).

try {
    $result = $apiInstance->chatNew($message, $channel_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatApi->chatNew: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | **string**|  |
 **channel_id** | **double**| Channel to post to. Default 1 (English). | [optional] [default to 1]

### Return type

[**\Swagger\Client\Model\Chat**](../Model/Chat.md)

### Authorization

[apiExpires](../../README.md#apiExpires), [apiKey](../../README.md#apiKey), [apiSignature](../../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

