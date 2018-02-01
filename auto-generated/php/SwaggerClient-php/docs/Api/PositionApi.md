# Swagger\Client\PositionApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**positionGet**](PositionApi.md#positionGet) | **GET** /position | Get your positions.
[**positionIsolateMargin**](PositionApi.md#positionIsolateMargin) | **POST** /position/isolate | Enable isolated margin or cross margin per-position.
[**positionTransferIsolatedMargin**](PositionApi.md#positionTransferIsolatedMargin) | **POST** /position/transferMargin | Transfer equity in or out of a position.
[**positionUpdateLeverage**](PositionApi.md#positionUpdateLeverage) | **POST** /position/leverage | Choose leverage for a position.
[**positionUpdateRiskLimit**](PositionApi.md#positionUpdateRiskLimit) | **POST** /position/riskLimit | Update your risk limit.


# **positionGet**
> \Swagger\Client\Model\Position[] positionGet($filter, $columns, $count)

Get your positions.

See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\">the FIX Spec</a> for explanations of these fields.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\PositionApi();
$filter = "filter_example"; // string | Table filter. For example, send {\"symbol\": \"XBT24H\"}.
$columns = "columns_example"; // string | Which columns to fetch. For example, send [\"columnName\"].
$count = 3.4; // float | Number of rows to fetch.

try {
    $result = $api_instance->positionGet($filter, $columns, $count);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PositionApi->positionGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **string**| Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}. | [optional]
 **columns** | **string**| Which columns to fetch. For example, send [\&quot;columnName\&quot;]. | [optional]
 **count** | **float**| Number of rows to fetch. | [optional]

### Return type

[**\Swagger\Client\Model\Position[]**](../Model/Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **positionIsolateMargin**
> \Swagger\Client\Model\Position positionIsolateMargin($symbol, $enabled)

Enable isolated margin or cross margin per-position.

On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\PositionApi();
$symbol = "symbol_example"; // string | Position symbol to isolate.
$enabled = true; // bool | True for isolated margin, false for cross margin.

try {
    $result = $api_instance->positionIsolateMargin($symbol, $enabled);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PositionApi->positionIsolateMargin: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Position symbol to isolate. |
 **enabled** | **bool**| True for isolated margin, false for cross margin. | [optional] [default to true]

### Return type

[**\Swagger\Client\Model\Position**](../Model/Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **positionTransferIsolatedMargin**
> \Swagger\Client\Model\Position positionTransferIsolatedMargin($symbol, $amount)

Transfer equity in or out of a position.

When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\PositionApi();
$symbol = "symbol_example"; // string | Symbol of position to isolate.
$amount = 3.4; // float | Amount to transfer, in Satoshis. May be negative.

try {
    $result = $api_instance->positionTransferIsolatedMargin($symbol, $amount);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PositionApi->positionTransferIsolatedMargin: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Symbol of position to isolate. |
 **amount** | **float**| Amount to transfer, in Satoshis. May be negative. |

### Return type

[**\Swagger\Client\Model\Position**](../Model/Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **positionUpdateLeverage**
> \Swagger\Client\Model\Position positionUpdateLeverage($symbol, $leverage)

Choose leverage for a position.

On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\PositionApi();
$symbol = "symbol_example"; // string | Symbol of position to adjust.
$leverage = 1.2; // double | Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.

try {
    $result = $api_instance->positionUpdateLeverage($symbol, $leverage);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PositionApi->positionUpdateLeverage: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Symbol of position to adjust. |
 **leverage** | **double**| Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin. |

### Return type

[**\Swagger\Client\Model\Position**](../Model/Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **positionUpdateRiskLimit**
> \Swagger\Client\Model\Position positionUpdateRiskLimit($symbol, $risk_limit)

Update your risk limit.

Risk Limits limit the size of positions you can trade at various margin levels. Larger positions require more margin. Please see the Risk Limit documentation for more details.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\PositionApi();
$symbol = "symbol_example"; // string | Symbol of position to isolate.
$risk_limit = 3.4; // float | New Risk Limit, in Satoshis.

try {
    $result = $api_instance->positionUpdateRiskLimit($symbol, $risk_limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PositionApi->positionUpdateRiskLimit: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Symbol of position to isolate. |
 **risk_limit** | **float**| New Risk Limit, in Satoshis. |

### Return type

[**\Swagger\Client\Model\Position**](../Model/Position.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

