# Swagger\Client\ChatApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatGet**](ChatApi.md#chatGet) | **GET** /chat | Get chat messages.
[**chatGetConnected**](ChatApi.md#chatGetConnected) | **GET** /chat/connected | Get connected users.
[**chatNew**](ChatApi.md#chatNew) | **POST** /chat | Send a chat message.


# **chatGet**
> \Swagger\Client\Model\Chat[] chatGet($count, $start, $reverse)

Get chat messages.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ChatApi();
$count = 100; // float | Number of results to fetch.
$start = 0; // float | Starting point for results.
$reverse = true; // bool | If true, will sort results newest first.

try {
    $result = $api_instance->chatGet($count, $start, $reverse);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatApi->chatGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **float**| Number of results to fetch. | [optional] [default to 100]
 **start** | **float**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool**| If true, will sort results newest first. | [optional] [default to true]

### Return type

[**\Swagger\Client\Model\Chat[]**](../Model/Chat.md)

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

$api_instance = new Swagger\Client\Api\ChatApi();

try {
    $result = $api_instance->chatGetConnected();
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

# **chatNew**
> \Swagger\Client\Model\Chat chatNew($message)

Send a chat message.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ChatApi();
$message = "message_example"; // string | 

try {
    $result = $api_instance->chatNew($message);
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

### Return type

[**\Swagger\Client\Model\Chat**](../Model/Chat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

