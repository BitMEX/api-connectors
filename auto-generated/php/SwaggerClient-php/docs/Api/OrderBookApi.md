# Swagger\Client\OrderBookApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderBookGet**](OrderBookApi.md#orderBookGet) | **GET** /orderBook | Get current orderbook [deprecated, use /orderBook/L2].
[**orderBookGetL2**](OrderBookApi.md#orderBookGetL2) | **GET** /orderBook/L2 | Get current orderbook in vertical format.


# **orderBookGet**
> \Swagger\Client\Model\OrderBook[] orderBookGet($symbol, $depth)

Get current orderbook [deprecated, use /orderBook/L2].

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\OrderBookApi();
$symbol = "symbol_example"; // string | Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
$depth = 25; // float | Orderbook depth.

try {
    $result = $api_instance->orderBookGet($symbol, $depth);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderBookApi->orderBookGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. |
 **depth** | **float**| Orderbook depth. | [optional] [default to 25]

### Return type

[**\Swagger\Client\Model\OrderBook[]**](../Model/OrderBook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **orderBookGetL2**
> \Swagger\Client\Model\OrderBookL2[] orderBookGetL2($symbol, $depth)

Get current orderbook in vertical format.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\OrderBookApi();
$symbol = "symbol_example"; // string | Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
$depth = 25; // float | Orderbook depth per side. Send 0 for full depth.

try {
    $result = $api_instance->orderBookGetL2($symbol, $depth);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderBookApi->orderBookGetL2: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. |
 **depth** | **float**| Orderbook depth per side. Send 0 for full depth. | [optional] [default to 25]

### Return type

[**\Swagger\Client\Model\OrderBookL2[]**](../Model/OrderBookL2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

