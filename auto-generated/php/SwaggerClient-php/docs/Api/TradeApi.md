# Swagger\Client\TradeApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tradeGet**](TradeApi.md#tradeGet) | **GET** /trade | Get Trades.
[**tradeGetBucketed**](TradeApi.md#tradeGetBucketed) | **GET** /trade/bucketed | Get previous trades in time buckets.


# **tradeGet**
> \Swagger\Client\Model\Trade[] tradeGet($symbol, $filter, $columns, $count, $start, $reverse, $start_time, $end_time)

Get Trades.

Please note that indices (symbols starting with `.`) post trades at intervals to the trade feed. These have a `size` of 0 and are used only to indicate a changing price.  See [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AE_6569.html) for explanations of these fields.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\TradeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$symbol = "symbol_example"; // string | Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.
$filter = "filter_example"; // string | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
$columns = "columns_example"; // string | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
$count = 100; // float | Number of results to fetch.
$start = 0; // float | Starting point for results.
$reverse = false; // bool | If true, will sort results newest first.
$start_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Starting date filter for results.
$end_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Ending date filter for results.

try {
    $result = $apiInstance->tradeGet($symbol, $filter, $columns, $count, $start, $reverse, $start_time, $end_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TradeApi->tradeGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. | [optional]
 **filter** | **string**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional]
 **columns** | **string**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional]
 **count** | **float**| Number of results to fetch. | [optional] [default to 100]
 **start** | **float**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool**| If true, will sort results newest first. | [optional] [default to false]
 **start_time** | **\DateTime**| Starting date filter for results. | [optional]
 **end_time** | **\DateTime**| Ending date filter for results. | [optional]

### Return type

[**\Swagger\Client\Model\Trade[]**](../Model/Trade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **tradeGetBucketed**
> \Swagger\Client\Model\TradeBin[] tradeGetBucketed($bin_size, $partial, $symbol, $filter, $columns, $count, $start, $reverse, $start_time, $end_time)

Get previous trades in time buckets.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\TradeApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$bin_size = "1m"; // string | Time interval to bucket by. Available options: [1m,5m,1h,1d].
$partial = false; // bool | If true, will send in-progress (incomplete) bins for the current time period.
$symbol = "symbol_example"; // string | Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.
$filter = "filter_example"; // string | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
$columns = "columns_example"; // string | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
$count = 100; // float | Number of results to fetch.
$start = 0; // float | Starting point for results.
$reverse = false; // bool | If true, will sort results newest first.
$start_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Starting date filter for results.
$end_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Ending date filter for results.

try {
    $result = $apiInstance->tradeGetBucketed($bin_size, $partial, $symbol, $filter, $columns, $count, $start, $reverse, $start_time, $end_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TradeApi->tradeGetBucketed: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bin_size** | **string**| Time interval to bucket by. Available options: [1m,5m,1h,1d]. | [optional] [default to 1m]
 **partial** | **bool**| If true, will send in-progress (incomplete) bins for the current time period. | [optional] [default to false]
 **symbol** | **string**| Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. | [optional]
 **filter** | **string**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional]
 **columns** | **string**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional]
 **count** | **float**| Number of results to fetch. | [optional] [default to 100]
 **start** | **float**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool**| If true, will sort results newest first. | [optional] [default to false]
 **start_time** | **\DateTime**| Starting date filter for results. | [optional]
 **end_time** | **\DateTime**| Ending date filter for results. | [optional]

### Return type

[**\Swagger\Client\Model\TradeBin[]**](../Model/TradeBin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

