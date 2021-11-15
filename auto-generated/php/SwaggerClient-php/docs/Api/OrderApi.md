# Swagger\Client\OrderApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderAmend**](OrderApi.md#orderAmend) | **PUT** /order | Amend the quantity or price of an open order.
[**orderCancel**](OrderApi.md#orderCancel) | **DELETE** /order | Cancel order(s). Send multiple order IDs to cancel in bulk.
[**orderCancelAll**](OrderApi.md#orderCancelAll) | **DELETE** /order/all | Cancels all of your orders.
[**orderCancelAllAfter**](OrderApi.md#orderCancelAllAfter) | **POST** /order/cancelAllAfter | Automatically cancel all your orders after a specified timeout.
[**orderClosePosition**](OrderApi.md#orderClosePosition) | **POST** /order/closePosition | Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]
[**orderGetOrders**](OrderApi.md#orderGetOrders) | **GET** /order | Get your orders.
[**orderNew**](OrderApi.md#orderNew) | **POST** /order | Create a new order.


# **orderAmend**
> \Swagger\Client\Model\Order orderAmend($order_id, $orig_cl_ord_id, $cl_ord_id, $simple_order_qty, $order_qty, $simple_leaves_qty, $leaves_qty, $price, $stop_px, $peg_offset_value, $text)

Amend the quantity or price of an open order.

Send an `orderID` or `origClOrdID` to identify the order you wish to amend.  Both order quantity and price can be amended. Only one `qty` field can be used to amend.  Use the `leavesQty` field to specify how much of the order you wish to remain open. This can be useful if you want to adjust your position's delta by a certain amount, regardless of how much of the order has already filled.  > A `leavesQty` can be used to make a \"Filled\" order live again, if it is received within 60 seconds of the fill.  Like order placement, amending can be done in bulk. Simply send a request to `PUT /api/v1/order/bulk` with a JSON body of the shape: `{\"orders\": [{...}, {...}]}`, each object containing the fields used in this endpoint.

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

$apiInstance = new Swagger\Client\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_id = "order_id_example"; // string | Order ID
$orig_cl_ord_id = "orig_cl_ord_id_example"; // string | Client Order ID. See POST /order.
$cl_ord_id = "cl_ord_id_example"; // string | Optional new Client Order ID, requires `origClOrdID`.
$simple_order_qty = 1.2; // double | Deprecated: simple orders are not supported after 2018/10/26
$order_qty = 8.14; // float | Optional order quantity in units of the instrument (i.e. contracts).
$simple_leaves_qty = 1.2; // double | Deprecated: simple orders are not supported after 2018/10/26
$leaves_qty = 8.14; // float | Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.
$price = 1.2; // double | Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.
$stop_px = 1.2; // double | Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.
$peg_offset_value = 1.2; // double | Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders.
$text = "text_example"; // string | Optional amend annotation. e.g. 'Adjust skew'.

try {
    $result = $apiInstance->orderAmend($order_id, $orig_cl_ord_id, $cl_ord_id, $simple_order_qty, $order_qty, $simple_leaves_qty, $leaves_qty, $price, $stop_px, $peg_offset_value, $text);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->orderAmend: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | **string**| Order ID | [optional]
 **orig_cl_ord_id** | **string**| Client Order ID. See POST /order. | [optional]
 **cl_ord_id** | **string**| Optional new Client Order ID, requires &#x60;origClOrdID&#x60;. | [optional]
 **simple_order_qty** | **double**| Deprecated: simple orders are not supported after 2018/10/26 | [optional]
 **order_qty** | **float**| Optional order quantity in units of the instrument (i.e. contracts). | [optional]
 **simple_leaves_qty** | **double**| Deprecated: simple orders are not supported after 2018/10/26 | [optional]
 **leaves_qty** | **float**| Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders. | [optional]
 **price** | **double**| Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. | [optional]
 **stop_px** | **double**| Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. | [optional]
 **peg_offset_value** | **double**| Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders. | [optional]
 **text** | **string**| Optional amend annotation. e.g. &#39;Adjust skew&#39;. | [optional]

### Return type

[**\Swagger\Client\Model\Order**](../Model/Order.md)

### Authorization

[apiExpires](../../README.md#apiExpires), [apiKey](../../README.md#apiKey), [apiSignature](../../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **orderCancel**
> \Swagger\Client\Model\Order[] orderCancel($order_id, $cl_ord_id, $text)

Cancel order(s). Send multiple order IDs to cancel in bulk.

Either an orderID or a clOrdID must be provided.

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

$apiInstance = new Swagger\Client\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_id = "order_id_example"; // string | Order ID(s).
$cl_ord_id = "cl_ord_id_example"; // string | Client Order ID(s). See POST /order.
$text = "text_example"; // string | Optional cancellation annotation. e.g. 'Spread Exceeded'.

try {
    $result = $apiInstance->orderCancel($order_id, $cl_ord_id, $text);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->orderCancel: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | **string**| Order ID(s). | [optional]
 **cl_ord_id** | **string**| Client Order ID(s). See POST /order. | [optional]
 **text** | **string**| Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;. | [optional]

### Return type

[**\Swagger\Client\Model\Order[]**](../Model/Order.md)

### Authorization

[apiExpires](../../README.md#apiExpires), [apiKey](../../README.md#apiKey), [apiSignature](../../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **orderCancelAll**
> \Swagger\Client\Model\Order[] orderCancelAll($symbol, $filter, $text)

Cancels all of your orders.

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

$apiInstance = new Swagger\Client\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$symbol = "symbol_example"; // string | Optional symbol. If provided, only cancels orders for that symbol.
$filter = "filter_example"; // string | Optional filter for cancellation. Use to only cancel some orders, e.g. `{\"side\": \"Buy\"}`.
$text = "text_example"; // string | Optional cancellation annotation. e.g. 'Spread Exceeded'

try {
    $result = $apiInstance->orderCancelAll($symbol, $filter, $text);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->orderCancelAll: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Optional symbol. If provided, only cancels orders for that symbol. | [optional]
 **filter** | **string**| Optional filter for cancellation. Use to only cancel some orders, e.g. &#x60;{\&quot;side\&quot;: \&quot;Buy\&quot;}&#x60;. | [optional]
 **text** | **string**| Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39; | [optional]

### Return type

[**\Swagger\Client\Model\Order[]**](../Model/Order.md)

### Authorization

[apiExpires](../../README.md#apiExpires), [apiKey](../../README.md#apiKey), [apiSignature](../../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **orderCancelAllAfter**
> object orderCancelAllAfter($timeout)

Automatically cancel all your orders after a specified timeout.

Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.  Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.  This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#Dead-Mans-Switch-Auto-Cancel).

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

$apiInstance = new Swagger\Client\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$timeout = 1.2; // double | Timeout in ms. Set to 0 to cancel this timer.

try {
    $result = $apiInstance->orderCancelAllAfter($timeout);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->orderCancelAllAfter: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeout** | **double**| Timeout in ms. Set to 0 to cancel this timer. |

### Return type

**object**

### Authorization

[apiExpires](../../README.md#apiExpires), [apiKey](../../README.md#apiKey), [apiSignature](../../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **orderClosePosition**
> \Swagger\Client\Model\Order orderClosePosition($symbol, $price)

Close a position. [Deprecated, use POST /order with execInst: 'Close']

If no `price` is specified, a market order will be submitted to close the whole of your position. This will also close all other open orders in this symbol.

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

$apiInstance = new Swagger\Client\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$symbol = "symbol_example"; // string | Symbol of position to close.
$price = 1.2; // double | Optional limit price.

try {
    $result = $apiInstance->orderClosePosition($symbol, $price);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->orderClosePosition: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Symbol of position to close. |
 **price** | **double**| Optional limit price. | [optional]

### Return type

[**\Swagger\Client\Model\Order**](../Model/Order.md)

### Authorization

[apiExpires](../../README.md#apiExpires), [apiKey](../../README.md#apiKey), [apiSignature](../../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **orderGetOrders**
> \Swagger\Client\Model\Order[] orderGetOrders($symbol, $filter, $columns, $count, $start, $reverse, $start_time, $end_time)

Get your orders.

To get open orders only, send {\"open\": true} in the filter param.  See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\">the FIX Spec</a> for explanations of these fields.

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

$apiInstance = new Swagger\Client\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$symbol = "symbol_example"; // string | Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive.
$filter = "filter_example"; // string | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
$columns = "columns_example"; // string | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
$count = 100; // float | Number of results to fetch. Must be a positive integer.
$start = 0; // float | Starting point for results.
$reverse = false; // bool | If true, will sort results newest first.
$start_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Starting date filter for results.
$end_time = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Ending date filter for results.

try {
    $result = $apiInstance->orderGetOrders($symbol, $filter, $columns, $count, $start, $reverse, $start_time, $end_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->orderGetOrders: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. | [optional]
 **filter** | **string**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional]
 **columns** | **string**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional]
 **count** | **float**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **float**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool**| If true, will sort results newest first. | [optional] [default to false]
 **start_time** | **\DateTime**| Starting date filter for results. | [optional]
 **end_time** | **\DateTime**| Ending date filter for results. | [optional]

### Return type

[**\Swagger\Client\Model\Order[]**](../Model/Order.md)

### Authorization

[apiExpires](../../README.md#apiExpires), [apiKey](../../README.md#apiKey), [apiSignature](../../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **orderNew**
> \Swagger\Client\Model\Order orderNew($symbol, $side, $simple_order_qty, $order_qty, $price, $display_qty, $stop_px, $cl_ord_id, $cl_ord_link_id, $peg_offset_value, $peg_price_type, $ord_type, $time_in_force, $exec_inst, $contingency_type, $text)

Create a new order.

## Placing Orders  This endpoint is used for placing orders. See individual fields below for more details on their use.  #### Order Types  All orders require a `symbol`. All other fields are optional except when otherwise specified.  These are the valid `ordType`s:  - **Limit**: The default order type. Specify an `orderQty` and `price`. - **Market**: A traditional Market order. A Market order will execute until filled or your bankruptcy price is reached, at   which point it will cancel. - **Stop**: A Stop Market order. Specify an `orderQty` and `stopPx`. When the `stopPx` is reached, the order will be entered   into the book.   - On sell orders, the order will trigger if the triggering price is lower than the `stopPx`. On buys, higher.   - Note: Stop orders do not consume margin until triggered. Be sure that the required margin is available in your     account so that it may trigger fully.   - `Close` Stops don't require an `orderQty`. See Execution Instructions below. - **StopLimit**: Like a Stop Market, but enters a Limit order instead of a Market order. Specify an `orderQty`, `stopPx`,   and `price`. - **MarketIfTouched**: Similar to a Stop, but triggers are done in the opposite direction. Useful for Take Profit orders. - **LimitIfTouched**: As above; use for Take Profit Limit orders. - **Pegged**: Pegged orders allow users to submit a limit price relative to the current market price. Specify a   `pegPriceType`, and `pegOffsetValue`.   - Pegged orders **must** have an `execInst` of `Fixed`. This means the limit price is set at the time the order     is accepted and does not change as the reference price changes.   - `PrimaryPeg`: Price is set relative to near touch price.   - `MarketPeg`: Price is set relative to far touch price.   - A `pegPriceType` submitted with no `ordType` is treated as a `Pegged` order.  #### Execution Instructions  The following `execInst`s are supported. If using multiple, separate with a comma (e.g. `LastPrice,Close`).  - **ParticipateDoNotInitiate**: Also known as a Post-Only order. If this order would have executed on placement, it will cancel instead.   This is intended to protect you from the far touch moving towards you while the order is in transit.   It is not intended for speculating on the far touch moving away after submission - we consider such behaviour abusive and monitor for it. - **MarkPrice, LastPrice, IndexPrice**: Used by stop and if-touched orders to determine the triggering price.   Use only one. By default, `MarkPrice` is used. Also used for Pegged orders to define the value of `LastPeg`. - **ReduceOnly**: A `ReduceOnly` order can only reduce your position, not increase it. If you have a `ReduceOnly`   limit order that rests in the order book while the position is reduced by other orders, then its order quantity will   be amended down or canceled. If there are multiple `ReduceOnly` orders the least aggressive will be amended first. - **Close**: `Close` implies `ReduceOnly`. A `Close` order will cancel other active limit orders with the same side   and symbol if the open quantity exceeds the current position. This is useful for stops: by canceling these orders, a   `Close` Stop is ensured to have the margin required to execute, and can only execute up to the full size of your   position. If `orderQty` is not specified, a `Close` order has an `orderQty` equal to your current position's size.   - Note that a `Close` order without an `orderQty` requires a `side`, so that BitMEX knows if it should trigger     above or below the `stopPx`. - **LastWithinMark**: Used by stop orders with `LastPrice` to allow stop triggers only when:   - For Sell Stop Market / Stop Limit Order     - Last Price &lt= Stop Price     - Last Price &gt= Mark Price × (1 - 5%)   - For Buy Stop Market / Stop Limit Order:     - Last Price &gt= Stop Price     - Last Price &lt= Mark Price × (1 + 5%) - **Fixed**: Pegged orders **must** have an `execInst` of `Fixed`. This means the limit price is set at the time   the order is accepted and does not change as the reference price changes.  #### Pegged Orders  Pegged orders allow users to submit a limit price relative to the current market price. The limit price is set once when the order is submitted and does not change with the reference price. This order type is not intended for speculating on the far touch moving away after submission - we consider such behaviour abusive and monitor for it.  Pegged orders have an `ordType` of `Pegged`, and an `execInst` of `Fixed`.  A `pegPriceType` and `pegOffsetValue` must also be submitted:  - `PrimaryPeg` - price is set relative to the **near touch** price - `MarketPeg` - price is set relative to the **far touch** price  #### Trailing Stop Pegged Orders  Use `pegPriceType` of `TrailingStopPeg` to create Trailing Stops.  The price is set at submission and updates once per second if the underlying price (last/mark/index) has moved by more than 0.1%. `stopPx` then moves as the market moves away from the peg, and freezes as the market moves toward it.  Use `pegOffsetValue` to set the `stopPx` of your order. The peg is set to the triggering price specified in the `execInst` (default `MarkPrice`). Use a negative offset for stop-sell and buy-if-touched orders.  Requires `ordType`: `Stop`, `StopLimit`, `MarketIfTouched`, `LimitIfTouched`.  #### Linked Orders  [Linked Orders are deprecated as of 2018/11/10](https://blog.bitmex.com/api_announcement/deprecation-of-contingent-orders/)  #### Trailing Stops  You may use `pegPriceType` of `'TrailingStopPeg'` to create Trailing Stops. The pegged `stopPx` will move as the market moves away from the peg, and freeze as the market moves toward it.  To use, combine with `pegOffsetValue` to set the `stopPx` of your order. The peg is set to the triggering price specified in the `execInst` (default `'MarkPrice'`). Use a negative offset for stop-sell and buy-if-touched orders.  Requires `ordType`: `'Stop', 'StopLimit', 'MarketIfTouched', 'LimitIfTouched'`.  #### Simple Quantities  [Simple Quantities are deprecated as of 2018/10/26](https://blog.bitmex.com/api_announcement/deprecation-of-simpleorderqty-functionality/)  #### Rate Limits  See the [Bulk Order Documentation](#!/Order/Order_newBulk) if you need to place multiple orders at the same time. Bulk orders require fewer risk checks in the trading engine and thus are ratelimited at **1/10** the normal rate.  You can also improve your reactivity to market movements while staying under your ratelimit by using the [Amend](#!/Order/Order_amend) and [Amend Bulk](#!/Order/Order_amendBulk) endpoints. This allows you to stay in the market and avoids the cancel/replace cycle.  #### Tracking Your Orders  If you want to keep track of order IDs yourself, set a unique `clOrdID` per order. This `clOrdID` will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.  You can also change the `clOrdID` by amending an order, supplying an `origClOrdID`, and your desired new ID as the `clOrdID` param, like so:  ``` # Amends an order's leavesQty, and updates its clOrdID to \"def-456\" PUT /api/v1/order {\"origClOrdID\": \"abc-123\", \"clOrdID\": \"def-456\", \"leavesQty\": 1000} ```

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

$apiInstance = new Swagger\Client\Api\OrderApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$symbol = "symbol_example"; // string | Instrument symbol. e.g. 'XBTUSD'.
$side = "side_example"; // string | Order side. Valid options: Buy, Sell. Defaults to 'Buy' unless `orderQty` is negative.
$simple_order_qty = 1.2; // double | Deprecated: simple orders are not supported after 2018/10/26
$order_qty = 8.14; // float | Order quantity in units of the instrument (i.e. contracts).
$price = 1.2; // double | Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.
$display_qty = 8.14; // float | Optional quantity to display in the book. Use 0 for a fully hidden order.
$stop_px = 1.2; // double | Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of 'MarkPrice' or 'LastPrice' to define the current price used for triggering.
$cl_ord_id = "cl_ord_id_example"; // string | Optional Client Order ID. This clOrdID will come back on the order and any related executions.
$cl_ord_link_id = "cl_ord_link_id_example"; // string | Deprecated: linked orders are not supported after 2018/11/10.
$peg_offset_value = 1.2; // double | Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders.
$peg_price_type = "peg_price_type_example"; // string | Optional peg price type. Valid options: MarketPeg, PrimaryPeg, TrailingStopPeg.
$ord_type = "Limit"; // string | Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, Pegged. Defaults to 'Limit' when `price` is specified. Defaults to 'Stop' when `stopPx` is specified. Defaults to 'StopLimit' when `price` and `stopPx` are specified.
$time_in_force = "time_in_force_example"; // string | Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to 'GoodTillCancel' for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.
$exec_inst = "exec_inst_example"; // string | Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, IndexPrice, LastPrice, Close, ReduceOnly, Fixed, LastWithinMark. 'AllOrNone' instruction requires `displayQty` to be 0. 'MarkPrice', 'IndexPrice' or 'LastPrice' instruction valid for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. 'LastWithinMark' instruction valid for 'Stop' and 'StopLimit' with instruction 'LastPrice'.
$contingency_type = "contingency_type_example"; // string | Deprecated: linked orders are not supported after 2018/11/10.
$text = "text_example"; // string | Optional order annotation. e.g. 'Take profit'.

try {
    $result = $apiInstance->orderNew($symbol, $side, $simple_order_qty, $order_qty, $price, $display_qty, $stop_px, $cl_ord_id, $cl_ord_link_id, $peg_offset_value, $peg_price_type, $ord_type, $time_in_force, $exec_inst, $contingency_type, $text);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->orderNew: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Instrument symbol. e.g. &#39;XBTUSD&#39;. |
 **side** | **string**| Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless &#x60;orderQty&#x60; is negative. | [optional]
 **simple_order_qty** | **double**| Deprecated: simple orders are not supported after 2018/10/26 | [optional]
 **order_qty** | **float**| Order quantity in units of the instrument (i.e. contracts). | [optional]
 **price** | **double**| Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. | [optional]
 **display_qty** | **float**| Optional quantity to display in the book. Use 0 for a fully hidden order. | [optional]
 **stop_px** | **double**| Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use &#x60;execInst&#x60; of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering. | [optional]
 **cl_ord_id** | **string**| Optional Client Order ID. This clOrdID will come back on the order and any related executions. | [optional]
 **cl_ord_link_id** | **string**| Deprecated: linked orders are not supported after 2018/11/10. | [optional]
 **peg_offset_value** | **double**| Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders. | [optional]
 **peg_price_type** | **string**| Optional peg price type. Valid options: MarketPeg, PrimaryPeg, TrailingStopPeg. | [optional]
 **ord_type** | **string**| Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, Pegged. Defaults to &#39;Limit&#39; when &#x60;price&#x60; is specified. Defaults to &#39;Stop&#39; when &#x60;stopPx&#x60; is specified. Defaults to &#39;StopLimit&#39; when &#x60;price&#x60; and &#x60;stopPx&#x60; are specified. | [optional] [default to Limit]
 **time_in_force** | **string**| Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. | [optional]
 **exec_inst** | **string**| Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, IndexPrice, LastPrice, Close, ReduceOnly, Fixed, LastWithinMark. &#39;AllOrNone&#39; instruction requires &#x60;displayQty&#x60; to be 0. &#39;MarkPrice&#39;, &#39;IndexPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. &#39;LastWithinMark&#39; instruction valid for &#39;Stop&#39; and &#39;StopLimit&#39; with instruction &#39;LastPrice&#39;. | [optional]
 **contingency_type** | **string**| Deprecated: linked orders are not supported after 2018/11/10. | [optional]
 **text** | **string**| Optional order annotation. e.g. &#39;Take profit&#39;. | [optional]

### Return type

[**\Swagger\Client\Model\Order**](../Model/Order.md)

### Authorization

[apiExpires](../../README.md#apiExpires), [apiKey](../../README.md#apiKey), [apiSignature](../../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

