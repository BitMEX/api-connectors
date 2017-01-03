# Swagger\Client\OrderApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderAmend**](OrderApi.md#orderAmend) | **PUT** /order | Amend the quantity or price of an open order.
[**orderAmendBulk**](OrderApi.md#orderAmendBulk) | **PUT** /order/bulk | Amend multiple orders.
[**orderCancel**](OrderApi.md#orderCancel) | **DELETE** /order | Cancel order(s). Send multiple order IDs to cancel in bulk.
[**orderCancelAll**](OrderApi.md#orderCancelAll) | **DELETE** /order/all | Cancels all of your orders.
[**orderCancelAllAfter**](OrderApi.md#orderCancelAllAfter) | **POST** /order/cancelAllAfter | Automatically cancel all your orders after a specified timeout.
[**orderClosePosition**](OrderApi.md#orderClosePosition) | **POST** /order/closePosition | Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]
[**orderGetOrders**](OrderApi.md#orderGetOrders) | **GET** /order | Get your orders.
[**orderNew**](OrderApi.md#orderNew) | **POST** /order | Create a new order.
[**orderNewBulk**](OrderApi.md#orderNewBulk) | **POST** /order/bulk | Create multiple new orders.


# **orderAmend**
> \Swagger\Client\Model\Order orderAmend($order_id, $orig_cl_ord_id, $cl_ord_id, $simple_order_qty, $order_qty, $simple_leaves_qty, $leaves_qty, $price, $stop_px, $peg_offset_value, $text)

Amend the quantity or price of an open order.

Send an `orderID` or `origClOrdID` to identify the order you wish to amend.  Both order quantity and price can be amended. Only one `qty` field can be used to amend.  Use the `leavesQty` field to specify how much of the order you wish to remain open. This can be useful if you want to adjust your position's delta by a certain amount, regardless of how much of the order has already filled.  Use the `simpleOrderQty` and `simpleLeavesQty` fields to specify order size in Bitcoin, rather than contracts. These fields will round up to the nearest contract.  Like order placement, amending can be done in bulk. Simply send a request to `PUT /api/v1/order/bulk` with a JSON body of the shape: `{\"orders\": [{...}, {...}]}`, each object containing the fields used in this endpoint.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\OrderApi();
$order_id = "order_id_example"; // string | Order ID
$orig_cl_ord_id = "orig_cl_ord_id_example"; // string | Client Order ID. See POST /order.
$cl_ord_id = "cl_ord_id_example"; // string | Optional new Client Order ID, requires `origClOrdID`.
$simple_order_qty = 1.2; // double | Optional order quantity in units of the underlying instrument (i.e. Bitcoin).
$order_qty = 3.4; // float | Optional order quantity in units of the instrument (i.e. contracts).
$simple_leaves_qty = 1.2; // double | Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders.
$leaves_qty = 3.4; // float | Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.
$price = 1.2; // double | Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.
$stop_px = 1.2; // double | Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.
$peg_offset_value = 1.2; // double | Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders.
$text = "text_example"; // string | Optional amend annotation. e.g. 'Adjust skew'.

try {
    $result = $api_instance->orderAmend($order_id, $orig_cl_ord_id, $cl_ord_id, $simple_order_qty, $order_qty, $simple_leaves_qty, $leaves_qty, $price, $stop_px, $peg_offset_value, $text);
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
 **simple_order_qty** | **double**| Optional order quantity in units of the underlying instrument (i.e. Bitcoin). | [optional]
 **order_qty** | **float**| Optional order quantity in units of the instrument (i.e. contracts). | [optional]
 **simple_leaves_qty** | **double**| Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders. | [optional]
 **leaves_qty** | **float**| Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders. | [optional]
 **price** | **double**| Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. | [optional]
 **stop_px** | **double**| Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. | [optional]
 **peg_offset_value** | **double**| Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders. | [optional]
 **text** | **string**| Optional amend annotation. e.g. &#39;Adjust skew&#39;. | [optional]

### Return type

[**\Swagger\Client\Model\Order**](../Model/Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **orderAmendBulk**
> \Swagger\Client\Model\Order[] orderAmendBulk($orders)

Amend multiple orders.

Similar to POST /amend, but with multiple orders. `application/json` only. Ratelimited at 50%.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\OrderApi();
$orders = "orders_example"; // string | An array of orders.

try {
    $result = $api_instance->orderAmendBulk($orders);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->orderAmendBulk: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orders** | **string**| An array of orders. | [optional]

### Return type

[**\Swagger\Client\Model\Order[]**](../Model/Order.md)

### Authorization

No authorization required

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

$api_instance = new Swagger\Client\Api\OrderApi();
$order_id = "order_id_example"; // string | Order ID(s).
$cl_ord_id = "cl_ord_id_example"; // string | Client Order ID(s). See POST /order.
$text = "text_example"; // string | Optional cancellation annotation. e.g. 'Spread Exceeded'.

try {
    $result = $api_instance->orderCancel($order_id, $cl_ord_id, $text);
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **orderCancelAll**
> object orderCancelAll($symbol, $filter, $text)

Cancels all of your orders.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\OrderApi();
$symbol = "symbol_example"; // string | Optional symbol. If provided, only cancels orders for that symbol.
$filter = "filter_example"; // string | Optional filter for cancellation. Use to only cancel some orders, e.g. `{\"side\": \"Buy\"}`.
$text = "text_example"; // string | Optional cancellation annotation. e.g. 'Spread Exceeded'

try {
    $result = $api_instance->orderCancelAll($symbol, $filter, $text);
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

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **orderCancelAllAfter**
> object orderCancelAllAfter($timeout)

Automatically cancel all your orders after a specified timeout.

Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.  Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.  This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-).

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\OrderApi();
$timeout = 1.2; // double | Timeout in ms. Set to 0 to cancel this timer.

try {
    $result = $api_instance->orderCancelAllAfter($timeout);
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

No authorization required

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

$api_instance = new Swagger\Client\Api\OrderApi();
$symbol = "symbol_example"; // string | Symbol of position to close.
$price = 1.2; // double | Optional limit price.

try {
    $result = $api_instance->orderClosePosition($symbol, $price);
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

No authorization required

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

$api_instance = new Swagger\Client\Api\OrderApi();
$symbol = "symbol_example"; // string | Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.
$filter = "filter_example"; // string | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.
$columns = "columns_example"; // string | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
$count = 100; // float | Number of results to fetch.
$start = 0; // float | Starting point for results.
$reverse = false; // bool | If true, will sort results newest first.
$start_time = new \DateTime(); // \DateTime | Starting date filter for results.
$end_time = new \DateTime(); // \DateTime | Ending date filter for results.

try {
    $result = $api_instance->orderGetOrders($symbol, $filter, $columns, $count, $start, $reverse, $start_time, $end_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->orderGetOrders: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. | [optional]
 **filter** | **string**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details. | [optional]
 **columns** | **string**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional]
 **count** | **float**| Number of results to fetch. | [optional] [default to 100]
 **start** | **float**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool**| If true, will sort results newest first. | [optional] [default to false]
 **start_time** | **\DateTime**| Starting date filter for results. | [optional]
 **end_time** | **\DateTime**| Ending date filter for results. | [optional]

### Return type

[**\Swagger\Client\Model\Order[]**](../Model/Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **orderNew**
> \Swagger\Client\Model\Order orderNew($symbol, $side, $simple_order_qty, $quantity, $order_qty, $price, $display_qty, $stop_price, $stop_px, $cl_ord_id, $cl_ord_link_id, $peg_offset_value, $peg_price_type, $type, $ord_type, $time_in_force, $exec_inst, $contingency_type, $text)

Create a new order.

This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  If no order type is provided, BitMEX will assume 'Limit'. Be very careful with 'Market' and 'Stop' orders as you may be filled at an unfavourable price.  You can submit bulk orders by POSTing an array of orders to `/api/v1/order/bulk`. Send a JSON payload with the shape: `{\"orders\": [{...}, {...}]}`, with each inner object containing the same fields that would be sent to this endpoint.  A note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This clOrdID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.  To generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix `'bmex_mm_'` and the UUID `'7fbd6545-bb0c-11e4-a273-6003088a7c04'` creates `'bmex_mm_f71lRbsMEeSic2ADCIp8BA'`.  See the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152) for an example of how to use and generate clOrdIDs.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\OrderApi();
$symbol = "symbol_example"; // string | Instrument symbol. e.g. 'XBT24H'.
$side = "side_example"; // string | Order side. Valid options: Buy, Sell. Defaults to 'Buy' unless `orderQty` or `simpleOrderQty` is negative.
$simple_order_qty = 1.2; // double | Order quantity in units of the underlying instrument (i.e. Bitcoin).
$quantity = 3.4; // float | Deprecated: use `orderQty`.
$order_qty = 3.4; // float | Order quantity in units of the instrument (i.e. contracts).
$price = 1.2; // double | Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.
$display_qty = 3.4; // float | Optional quantity to display in the book. Use 0 for a hidden order.
$stop_price = 1.2; // double | Deprecated: use `stopPx`.
$stop_px = 1.2; // double | Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of 'MarkPrice' or 'LastPrice' to define the current price used for triggering.
$cl_ord_id = "cl_ord_id_example"; // string | Optional Client Order ID. This clOrdID will come back on the order and any related executions.
$cl_ord_link_id = "cl_ord_link_id_example"; // string | Optional Client Order Link ID for contingent orders.
$peg_offset_value = 1.2; // double | Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders.
$peg_price_type = "peg_price_type_example"; // string | Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg.
$type = "type_example"; // string | Deprecated: use `ordType`.
$ord_type = "Limit"; // string | Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to 'Limit' when `price` is specified. Defaults to 'Stop' when `stopPx` is specified. Defaults to 'StopLimit' when `price` and `stopPx` are specified.
$time_in_force = "time_in_force_example"; // string | Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to 'GoodTillCancel' for 'Limit', 'StopLimit', 'LimitIfTouched', and 'MarketWithLeftOverAsLimit' orders.
$exec_inst = "exec_inst_example"; // string | Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, IndexPrice, LastPrice, Close, ReduceOnly, Fixed. 'AllOrNone' instruction requires `displayQty` to be 0. 'MarkPrice' or 'LastPrice' instruction valid for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders.
$contingency_type = "contingency_type_example"; // string | Optional contingency type for use with `clOrdLinkID`. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional.
$text = "text_example"; // string | Optional order annotation. e.g. 'Take profit'.

try {
    $result = $api_instance->orderNew($symbol, $side, $simple_order_qty, $quantity, $order_qty, $price, $display_qty, $stop_price, $stop_px, $cl_ord_id, $cl_ord_link_id, $peg_offset_value, $peg_price_type, $type, $ord_type, $time_in_force, $exec_inst, $contingency_type, $text);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->orderNew: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **string**| Instrument symbol. e.g. &#39;XBT24H&#39;. |
 **side** | **string**| Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless &#x60;orderQty&#x60; or &#x60;simpleOrderQty&#x60; is negative. | [optional]
 **simple_order_qty** | **double**| Order quantity in units of the underlying instrument (i.e. Bitcoin). | [optional]
 **quantity** | **float**| Deprecated: use &#x60;orderQty&#x60;. | [optional]
 **order_qty** | **float**| Order quantity in units of the instrument (i.e. contracts). | [optional]
 **price** | **double**| Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. | [optional]
 **display_qty** | **float**| Optional quantity to display in the book. Use 0 for a hidden order. | [optional]
 **stop_price** | **double**| Deprecated: use &#x60;stopPx&#x60;. | [optional]
 **stop_px** | **double**| Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use &#x60;execInst&#x60; of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering. | [optional]
 **cl_ord_id** | **string**| Optional Client Order ID. This clOrdID will come back on the order and any related executions. | [optional]
 **cl_ord_link_id** | **string**| Optional Client Order Link ID for contingent orders. | [optional]
 **peg_offset_value** | **double**| Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders. | [optional]
 **peg_price_type** | **string**| Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg. | [optional]
 **type** | **string**| Deprecated: use &#x60;ordType&#x60;. | [optional]
 **ord_type** | **string**| Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to &#39;Limit&#39; when &#x60;price&#x60; is specified. Defaults to &#39;Stop&#39; when &#x60;stopPx&#x60; is specified. Defaults to &#39;StopLimit&#39; when &#x60;price&#x60; and &#x60;stopPx&#x60; are specified. | [optional] [default to Limit]
 **time_in_force** | **string**| Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, &#39;LimitIfTouched&#39;, and &#39;MarketWithLeftOverAsLimit&#39; orders. | [optional]
 **exec_inst** | **string**| Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, IndexPrice, LastPrice, Close, ReduceOnly, Fixed. &#39;AllOrNone&#39; instruction requires &#x60;displayQty&#x60; to be 0. &#39;MarkPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. | [optional]
 **contingency_type** | **string**| Optional contingency type for use with &#x60;clOrdLinkID&#x60;. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional. | [optional]
 **text** | **string**| Optional order annotation. e.g. &#39;Take profit&#39;. | [optional]

### Return type

[**\Swagger\Client\Model\Order**](../Model/Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **orderNewBulk**
> \Swagger\Client\Model\Order[] orderNewBulk($orders)

Create multiple new orders.

This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  Each individual order object in the array should have the same properties as an individual POST /order call.  This endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX systems, this endpoint is ratelimited at `ceil(0.5 * orders)`. Submitting 10 orders via a bulk order call will only count as 5 requests.  For now, only `application/json` is supported on this endpoint.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\OrderApi();
$orders = "orders_example"; // string | An array of orders.

try {
    $result = $api_instance->orderNewBulk($orders);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrderApi->orderNewBulk: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orders** | **string**| An array of orders. | [optional]

### Return type

[**\Swagger\Client\Model\Order[]**](../Model/Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

