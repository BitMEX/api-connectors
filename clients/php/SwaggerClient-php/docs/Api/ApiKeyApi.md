# Swagger\Client\ApiKeyApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiKeyDisable**](ApiKeyApi.md#apiKeyDisable) | **POST** /apiKey/disable | Disable an API Key.
[**apiKeyEnable**](ApiKeyApi.md#apiKeyEnable) | **POST** /apiKey/enable | Enable an API Key.
[**apiKeyGet**](ApiKeyApi.md#apiKeyGet) | **GET** /apiKey | Get your API Keys.
[**apiKeyNew**](ApiKeyApi.md#apiKeyNew) | **POST** /apiKey | Create a new API Key.
[**apiKeyRemove**](ApiKeyApi.md#apiKeyRemove) | **DELETE** /apiKey | Remove an API Key.


# **apiKeyDisable**
> \Swagger\Client\Model\ApiKey apiKeyDisable($api_key_id)

Disable an API Key.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ApiKeyApi();
$api_key_id = "api_key_id_example"; // string | API Key ID (public component).

try {
    $result = $api_instance->apiKeyDisable($api_key_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ApiKeyApi->apiKeyDisable: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key_id** | **string**| API Key ID (public component). |

### Return type

[**\Swagger\Client\Model\ApiKey**](../Model/ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **apiKeyEnable**
> \Swagger\Client\Model\ApiKey apiKeyEnable($api_key_id)

Enable an API Key.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ApiKeyApi();
$api_key_id = "api_key_id_example"; // string | API Key ID (public component).

try {
    $result = $api_instance->apiKeyEnable($api_key_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ApiKeyApi->apiKeyEnable: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key_id** | **string**| API Key ID (public component). |

### Return type

[**\Swagger\Client\Model\ApiKey**](../Model/ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **apiKeyGet**
> \Swagger\Client\Model\ApiKey[] apiKeyGet($reverse)

Get your API Keys.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ApiKeyApi();
$reverse = false; // bool | If true, will sort results newest first.

try {
    $result = $api_instance->apiKeyGet($reverse);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ApiKeyApi->apiKeyGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reverse** | **bool**| If true, will sort results newest first. | [optional] [default to false]

### Return type

[**\Swagger\Client\Model\ApiKey[]**](../Model/ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **apiKeyNew**
> \Swagger\Client\Model\ApiKey apiKeyNew($name, $cidr, $permissions, $enabled, $token)

Create a new API Key.

API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ApiKeyApi();
$name = "name_example"; // string | Key name. This name is for reference only.
$cidr = "cidr_example"; // string | CIDR block to restrict this key to. To restrict to a single address, append \"/32\", e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. <a href=\"http://software77.net/cidr-101.html\">More on CIDR blocks</a>
$permissions = "permissions_example"; // string | Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\"order\", \"withdraw\"].
$enabled = false; // bool | Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.
$token = "token_example"; // string | OTP Token (YubiKey, Google Authenticator)

try {
    $result = $api_instance->apiKeyNew($name, $cidr, $permissions, $enabled, $token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ApiKeyApi->apiKeyNew: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**| Key name. This name is for reference only. | [optional]
 **cidr** | **string**| CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href&#x3D;\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt; | [optional]
 **permissions** | **string**| Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;withdraw\&quot;]. | [optional]
 **enabled** | **bool**| Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. | [optional] [default to false]
 **token** | **string**| OTP Token (YubiKey, Google Authenticator) | [optional]

### Return type

[**\Swagger\Client\Model\ApiKey**](../Model/ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **apiKeyRemove**
> \Swagger\Client\Model\InlineResponse200 apiKeyRemove($api_key_id)

Remove an API Key.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\ApiKeyApi();
$api_key_id = "api_key_id_example"; // string | API Key ID (public component).

try {
    $result = $api_instance->apiKeyRemove($api_key_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ApiKeyApi->apiKeyRemove: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key_id** | **string**| API Key ID (public component). |

### Return type

[**\Swagger\Client\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

