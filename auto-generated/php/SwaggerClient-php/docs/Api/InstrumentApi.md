# Swagger\Client\InstrumentApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**instrumentGet**](InstrumentApi.md#instrumentGet) | **GET** /instrument | Get instruments.
[**instrumentGetActive**](InstrumentApi.md#instrumentGetActive) | **GET** /instrument/active | Get all active instruments and instruments that have expired in &lt;24hrs.
[**instrumentGetActiveAndIndices**](InstrumentApi.md#instrumentGetActiveAndIndices) | **GET** /instrument/activeAndIndices | Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
[**instrumentGetActiveIntervals**](InstrumentApi.md#instrumentGetActiveIntervals) | **GET** /instrument/activeIntervals | Return all active contract series and interval pairs.
[**instrumentGetCompositeIndex**](InstrumentApi.md#instrumentGetCompositeIndex) | **GET** /instrument/compositeIndex | Show constituent parts of an index.
[**instrumentGetIndices**](InstrumentApi.md#instrumentGetIndices) | **GET** /instrument/indices | Get all price indices.
[**instrumentGetUsdVolume**](InstrumentApi.md#instrumentGetUsdVolume) | **GET** /instrument/usdVolume | Get a summary of exchange statistics in USD.


# **instrumentGet**
> \Swagger\Client\Model\Instrument[] instrumentGet($symbol, $filter, $columns, $count, $start, $reverse, $start_time, $end_time)

Get instruments.

This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use `/instrument/active` to return active instruments, or use a filter like `{\"state\": \"Open\"}`.  The instrument type is specified by the `typ` param.  - Perpetual Contracts - `FFWCSX` - Perpetual Contracts (FX underliers) - `FFWCSF` - Spot - `IFXXXP` - Futures - `FFCCSX` - BitMEX Basket Index - `MRBXXX` - BitMEX Crypto Index - `MRCXXX` - BitMEX FX Index - `MRFXXX` - BitMEX Lending/Premium Index - `MRRXXX` - BitMEX Volatility Index - `MRIXXX`

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\InstrumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$symbol = "symbol_example"; // string | Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive.
$filter = "filter_example"; // string | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
$columns = "columns_example"; // string | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
$count = 100; // int | Number of results to fetch. Must be a positive integer.
$start = 0; // int | Starting point for results.
$reverse = false; // bool | If true, will sort results newest first.
$start_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Starting date filter for results.
$end_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Ending date filter for results.

try {
    $result = $apiInstance->instrumentGet($symbol, $filter, $columns, $count, $start, $reverse, $start_time, $end_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InstrumentApi->instrumentGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. | [optional]
 **filter** | **string**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional]
 **columns** | **string**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional]
 **count** | **int**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **int**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool**| If true, will sort results newest first. | [optional] [default to false]
 **start_time** | **\DateTime**| Starting date filter for results. | [optional]
 **end_time** | **\DateTime**| Ending date filter for results. | [optional]

### Return type

[**\Swagger\Client\Model\Instrument[]**](../Model/Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **instrumentGetActive**
> \Swagger\Client\Model\Instrument[] instrumentGetActive()

Get all active instruments and instruments that have expired in <24hrs.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\InstrumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->instrumentGetActive();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InstrumentApi->instrumentGetActive: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\Instrument[]**](../Model/Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **instrumentGetActiveAndIndices**
> \Swagger\Client\Model\Instrument[] instrumentGetActiveAndIndices()

Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\InstrumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->instrumentGetActiveAndIndices();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InstrumentApi->instrumentGetActiveAndIndices: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\Instrument[]**](../Model/Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **instrumentGetActiveIntervals**
> \Swagger\Client\Model\InstrumentInterval instrumentGetActiveIntervals()

Return all active contract series and interval pairs.

This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as `[\"XBT:perpetual\", \"XBT:quarterly\", \"XBT:biquarterly\", \"ETH:quarterly\", ...]`. These identifiers are usable in any query's `symbol` param. The second array is the current resolution of these intervals. Results are mapped at the same index.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\InstrumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->instrumentGetActiveIntervals();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InstrumentApi->instrumentGetActiveIntervals: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\InstrumentInterval**](../Model/InstrumentInterval.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **instrumentGetCompositeIndex**
> \Swagger\Client\Model\IndexComposite[] instrumentGetCompositeIndex($symbol, $filter, $columns, $count, $start, $reverse, $start_time, $end_time)

Show constituent parts of an index.

Composite indices are built from multiple external price sources.  Use this endpoint to get the underlying prices of an index. For example, send a `symbol` of `.BXBT` to get the ticks and weights of the constituent exchanges that build the \".BXBT\" index.  A tick with reference `\"BMI\"` and weight `null` is the composite index tick.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\InstrumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$symbol = ".BXBT"; // string | The composite index symbol.
$filter = "filter_example"; // string | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`.
$columns = "columns_example"; // string | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
$count = 100; // int | Number of results to fetch. Must be a positive integer.
$start = 0; // int | Starting point for results.
$reverse = false; // bool | If true, will sort results newest first.
$start_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Starting date filter for results.
$end_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Ending date filter for results.

try {
    $result = $apiInstance->instrumentGetCompositeIndex($symbol, $filter, $columns, $count, $start, $reverse, $start_time, $end_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InstrumentApi->instrumentGetCompositeIndex: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| The composite index symbol. | [optional] [default to .BXBT]
 **filter** | **string**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. | [optional]
 **columns** | **string**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional]
 **count** | **int**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **int**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool**| If true, will sort results newest first. | [optional] [default to false]
 **start_time** | **\DateTime**| Starting date filter for results. | [optional]
 **end_time** | **\DateTime**| Ending date filter for results. | [optional]

### Return type

[**\Swagger\Client\Model\IndexComposite[]**](../Model/IndexComposite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **instrumentGetIndices**
> \Swagger\Client\Model\Instrument[] instrumentGetIndices()

Get all price indices.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\InstrumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->instrumentGetIndices();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InstrumentApi->instrumentGetIndices: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\Swagger\Client\Model\Instrument[]**](../Model/Instrument.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **instrumentGetUsdVolume**
> \Swagger\Client\Model\StatsUSDBySymbol[] instrumentGetUsdVolume($symbol, $columns)

Get a summary of exchange statistics in USD.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Swagger\Client\Api\InstrumentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$symbol = "symbol_example"; // string | Filter by symbol.
$columns = "columns_example"; // string | Array of column names to fetch.

try {
    $result = $apiInstance->instrumentGetUsdVolume($symbol, $columns);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling InstrumentApi->instrumentGetUsdVolume: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Filter by symbol. | [optional]
 **columns** | **string**| Array of column names to fetch. | [optional]

### Return type

[**\Swagger\Client\Model\StatsUSDBySymbol[]**](../Model/StatsUSDBySymbol.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

