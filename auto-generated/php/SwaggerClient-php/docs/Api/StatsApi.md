# Swagger\Client\StatsApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statsGet**](StatsApi.md#statsGet) | **GET** /stats | Get exchange-wide and per-series turnover and volume statistics.
[**statsHistory**](StatsApi.md#statsHistory) | **GET** /stats/history | Get historical exchange-wide and per-series turnover and volume statistics.


# **statsGet**
> \Swagger\Client\Model\Stats[] statsGet()

Get exchange-wide and per-series turnover and volume statistics.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\StatsApi();

try {
    $result = $api_instance->statsGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StatsApi->statsGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\Stats[]**](../Model/Stats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **statsHistory**
> \Swagger\Client\Model\StatsHistory[] statsHistory()

Get historical exchange-wide and per-series turnover and volume statistics.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\StatsApi();

try {
    $result = $api_instance->statsHistory();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling StatsApi->statsHistory: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\StatsHistory[]**](../Model/StatsHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

