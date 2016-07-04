# swagger_client.OrderApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**order_amend**](OrderApi.md#order_amend) | **PUT** /order | Amend the quantity or price of an open order.
[**order_amend_bulk**](OrderApi.md#order_amend_bulk) | **PUT** /order/bulk | Amend multiple orders.
[**order_cancel**](OrderApi.md#order_cancel) | **DELETE** /order | Cancel order(s). Send multiple order IDs to cancel in bulk.
[**order_cancel_all**](OrderApi.md#order_cancel_all) | **DELETE** /order/all | Cancels all of your orders.
[**order_cancel_all_after**](OrderApi.md#order_cancel_all_after) | **POST** /order/cancelAllAfter | Automatically cancel all your orders after a specified timeout.
[**order_close_position**](OrderApi.md#order_close_position) | **POST** /order/closePosition | Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]
[**order_get_orders**](OrderApi.md#order_get_orders) | **GET** /order | Get your orders.
[**order_new**](OrderApi.md#order_new) | **POST** /order | Create a new order.
[**order_new_bulk**](OrderApi.md#order_new_bulk) | **POST** /order/bulk | Create multiple new orders.


# **order_amend**
> Order order_amend(order_id=order_id, cl_ord_id=cl_ord_id, simple_order_qty=simple_order_qty, order_qty=order_qty, simple_leaves_qty=simple_leaves_qty, leaves_qty=leaves_qty, price=price, stop_px=stop_px, peg_offset_value=peg_offset_value, text=text)

Amend the quantity or price of an open order.

<p>Send an <code>orderID</code> or <code>clOrdID</code> to identify the order you wish to amend.</p> <p>Both order quantity and price can be amended. Only one <code>qty</code> field can be used to amend.</p> <p>Use the <code>leavesQty</code> field to specify how much of the order you wish to remain open. This can be useful if you want to adjust your position&#39;s delta by a certain amount, regardless of how much of the order has already filled.</p> <p>Use the <code>simpleOrderQty</code> and <code>simpleLeavesQty</code> fields to specify order size in Bitcoin, rather than contracts. These fields will round up to the nearest contract.</p> <p>Like order placement, amending can be done in bulk. Simply send a request to <code>PUT /api/v1/order/bulk</code> with a JSON body of the shape: <code>{&quot;orders&quot;: [{...}, {...}]}</code>, each object containing the fields used in this endpoint.</p> 

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.OrderApi()
order_id = 'order_id_example' # str | Order ID (optional)
cl_ord_id = 'cl_ord_id_example' # str | Client Order ID. See POST /order. (optional)
simple_order_qty = 1.2 # float | Optional order quantity in units of the underlying instrument (i.e. Bitcoin). (optional)
order_qty = 3.4 # float | Optional order quantity in units of the instrument (i.e. contracts). (optional)
simple_leaves_qty = 1.2 # float | Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders. (optional)
leaves_qty = 3.4 # float | Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders. (optional)
price = 1.2 # float | Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders. (optional)
stop_px = 1.2 # float | Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. (optional)
peg_offset_value = 1.2 # float | Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders. (optional)
text = 'text_example' # str | Optional amend annotation. e.g. 'Adjust skew'. (optional)

try: 
    # Amend the quantity or price of an open order.
    api_response = api_instance.order_amend(order_id=order_id, cl_ord_id=cl_ord_id, simple_order_qty=simple_order_qty, order_qty=order_qty, simple_leaves_qty=simple_leaves_qty, leaves_qty=leaves_qty, price=price, stop_px=stop_px, peg_offset_value=peg_offset_value, text=text)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling OrderApi->order_amend: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | **str**| Order ID | [optional] 
 **cl_ord_id** | **str**| Client Order ID. See POST /order. | [optional] 
 **simple_order_qty** | **float**| Optional order quantity in units of the underlying instrument (i.e. Bitcoin). | [optional] 
 **order_qty** | **float**| Optional order quantity in units of the instrument (i.e. contracts). | [optional] 
 **simple_leaves_qty** | **float**| Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders. | [optional] 
 **leaves_qty** | **float**| Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders. | [optional] 
 **price** | **float**| Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. | [optional] 
 **stop_px** | **float**| Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. | [optional] 
 **peg_offset_value** | **float**| Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders. | [optional] 
 **text** | **str**| Optional amend annotation. e.g. &#39;Adjust skew&#39;. | [optional] 

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **order_amend_bulk**
> list[Order] order_amend_bulk(orders=orders)

Amend multiple orders.

Similar to POST /amend, but with multiple orders. `application/json` only. Ratelimited at 50%.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.OrderApi()
orders = 'orders_example' # str | An array of orders. (optional)

try: 
    # Amend multiple orders.
    api_response = api_instance.order_amend_bulk(orders=orders)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling OrderApi->order_amend_bulk: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orders** | **str**| An array of orders. | [optional] 

### Return type

[**list[Order]**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **order_cancel**
> list[Order] order_cancel(order_id=order_id, cl_ord_id=cl_ord_id, text=text)

Cancel order(s). Send multiple order IDs to cancel in bulk.

Either an orderID or a clOrdID must be provided.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.OrderApi()
order_id = 'order_id_example' # str | Order ID(s). (optional)
cl_ord_id = 'cl_ord_id_example' # str | Client Order ID(s). See POST /order. (optional)
text = 'text_example' # str | Optional cancellation annotation. e.g. 'Spread Exceeded'. (optional)

try: 
    # Cancel order(s). Send multiple order IDs to cancel in bulk.
    api_response = api_instance.order_cancel(order_id=order_id, cl_ord_id=cl_ord_id, text=text)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling OrderApi->order_cancel: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | **str**| Order ID(s). | [optional] 
 **cl_ord_id** | **str**| Client Order ID(s). See POST /order. | [optional] 
 **text** | **str**| Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;. | [optional] 

### Return type

[**list[Order]**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **order_cancel_all**
> object order_cancel_all(symbol=symbol, filter=filter, text=text)

Cancels all of your orders.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.OrderApi()
symbol = 'symbol_example' # str | Optional symbol. If provided, only cancels orders for that symbol. (optional)
filter = 'filter_example' # str | Optional filter for cancellation. Use to only cancel some orders, e.g. `{\"side\": \"Buy\"}`. (optional)
text = 'text_example' # str | Optional cancellation annotation. e.g. 'Spread Exceeded' (optional)

try: 
    # Cancels all of your orders.
    api_response = api_instance.order_cancel_all(symbol=symbol, filter=filter, text=text)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling OrderApi->order_cancel_all: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Optional symbol. If provided, only cancels orders for that symbol. | [optional] 
 **filter** | **str**| Optional filter for cancellation. Use to only cancel some orders, e.g. &#x60;{\&quot;side\&quot;: \&quot;Buy\&quot;}&#x60;. | [optional] 
 **text** | **str**| Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39; | [optional] 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **order_cancel_all_after**
> object order_cancel_all_after(timeout)

Automatically cancel all your orders after a specified timeout.

Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.  Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.  This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-). 

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.OrderApi()
timeout = 1.2 # float | Timeout in ms. Set to 0 to cancel this timer. 

try: 
    # Automatically cancel all your orders after a specified timeout.
    api_response = api_instance.order_cancel_all_after(timeout)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling OrderApi->order_cancel_all_after: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeout** | **float**| Timeout in ms. Set to 0 to cancel this timer.  | 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **order_close_position**
> Order order_close_position(symbol, price=price)

Close a position. [Deprecated, use POST /order with execInst: 'Close']

If no `price` is specified, a market order will be submitted to close the whole of your position. + This will also close all other open orders in this symbol.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.OrderApi()
symbol = 'symbol_example' # str | Symbol of position to close.
price = 1.2 # float | Optional limit price. (optional)

try: 
    # Close a position. [Deprecated, use POST /order with execInst: 'Close']
    api_response = api_instance.order_close_position(symbol, price=price)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling OrderApi->order_close_position: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Symbol of position to close. | 
 **price** | **float**| Optional limit price. | [optional] 

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **order_get_orders**
> list[Order] order_get_orders(symbol=symbol, filter=filter, columns=columns, count=count, start=start, reverse=reverse, start_time=start_time, end_time=end_time)

Get your orders.

To get open orders only, send {\"open\": true} in the filter param.  See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\">the FIX Spec</a> for explanations of these fields.

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.OrderApi()
symbol = 'symbol_example' # str | Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`. (optional)
filter = 'filter_example' # str | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details. (optional)
columns = 'columns_example' # str | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
count = 100 # float | Number of results to fetch. (optional) (default to 100)
start = 0 # float | Starting point for results. (optional) (default to 0)
reverse = false # bool | If true, will sort results newest first. (optional) (default to false)
start_time = '2013-10-20' # date | Starting date filter for results. (optional)
end_time = '2013-10-20' # date | Ending date filter for results. (optional)

try: 
    # Get your orders.
    api_response = api_instance.order_get_orders(symbol=symbol, filter=filter, columns=columns, count=count, start=start, reverse=reverse, start_time=start_time, end_time=end_time)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling OrderApi->order_get_orders: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. | [optional] 
 **filter** | **str**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details. | [optional] 
 **columns** | **str**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **float**| Number of results to fetch. | [optional] [default to 100]
 **start** | **float**| Starting point for results. | [optional] [default to 0]
 **reverse** | **bool**| If true, will sort results newest first. | [optional] [default to false]
 **start_time** | **date**| Starting date filter for results. | [optional] 
 **end_time** | **date**| Ending date filter for results. | [optional] 

### Return type

[**list[Order]**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **order_new**
> Order order_new(symbol, side=side, simple_order_qty=simple_order_qty, quantity=quantity, order_qty=order_qty, price=price, display_qty=display_qty, stop_price=stop_price, stop_px=stop_px, cl_ord_id=cl_ord_id, cl_ord_link_id=cl_ord_link_id, peg_offset_value=peg_offset_value, peg_price_type=peg_price_type, type=type, ord_type=ord_type, time_in_force=time_in_force, exec_inst=exec_inst, contingency_type=contingency_type, text=text)

Create a new order.

This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  If no order type is provided, BitMEX will assume 'Limit'. Be very careful with 'Market' and 'Stop' orders as you may be filled at an unfavourable price.  You can submit bulk orders by POSTing an array of orders to `/api/v1/order/bulk`. Send a JSON payload with the shape: `{\"orders\": [{...}, {...}]}`, with each inner object containing the same fields that would be sent to this endpoint.  A note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This clOrdID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.  To generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix `'bmex_mm_'` and the UUID `'7fbd6545-bb0c-11e4-a273-6003088a7c04'` creates `'bmex_mm_f71lRbsMEeSic2ADCIp8BA'`.  See the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152) for an example of how to use and generate clOrdIDs. 

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.OrderApi()
symbol = 'symbol_example' # str | Instrument symbol. e.g. 'XBT24H'.
side = 'side_example' # str | Order side. Valid options: Buy, Sell. Defaults to 'Buy' unless `orderQty` or `simpleOrderQty` is negative. (optional)
simple_order_qty = 1.2 # float | Order quantity in units of the underlying instrument (i.e. Bitcoin). (optional)
quantity = 3.4 # float | Deprecated: use `orderQty`. (optional)
order_qty = 3.4 # float | Order quantity in units of the instrument (i.e. contracts). (optional)
price = 1.2 # float | Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders. (optional)
display_qty = 3.4 # float | Optional quantity to display in the book. Use 0 for a hidden order. (optional)
stop_price = 1.2 # float | Deprecated: use `stopPx`. (optional)
stop_px = 1.2 # float | Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of 'MarkPrice' or 'LastPrice' to define the current price used for triggering. (optional)
cl_ord_id = 'cl_ord_id_example' # str | Optional Client Order ID. This clOrdID will come back on the order and any related executions. (optional)
cl_ord_link_id = 'cl_ord_link_id_example' # str | Optional Client Order Link ID for contingent orders. (optional)
peg_offset_value = 1.2 # float | Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders. (optional)
peg_price_type = 'peg_price_type_example' # str | Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg. (optional)
type = 'type_example' # str | Deprecated: use `ordType`. (optional)
ord_type = 'Limit' # str | Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to 'Limit' when `price` is specified. Defaults to 'Stop' when `stopPx` is specified. Defaults to 'StopLimit' when `price` and `stopPx` are specified. (optional) (default to Limit)
time_in_force = 'time_in_force_example' # str | Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to 'GoodTillCancel' for 'Limit', 'StopLimit', 'LimitIfTouched', and 'MarketWithLeftOverAsLimit' orders. (optional)
exec_inst = 'exec_inst_example' # str | Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. 'AllOrNone' instruction requires `displayQty` to be 0. 'MarkPrice' or 'LastPrice' instruction valid for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. (optional)
contingency_type = 'contingency_type_example' # str | Optional contingency type for use with `clOrdLinkID`. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional. (optional)
text = 'text_example' # str | Optional order annotation. e.g. 'Take profit'. (optional)

try: 
    # Create a new order.
    api_response = api_instance.order_new(symbol, side=side, simple_order_qty=simple_order_qty, quantity=quantity, order_qty=order_qty, price=price, display_qty=display_qty, stop_price=stop_price, stop_px=stop_px, cl_ord_id=cl_ord_id, cl_ord_link_id=cl_ord_link_id, peg_offset_value=peg_offset_value, peg_price_type=peg_price_type, type=type, ord_type=ord_type, time_in_force=time_in_force, exec_inst=exec_inst, contingency_type=contingency_type, text=text)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling OrderApi->order_new: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **str**| Instrument symbol. e.g. &#39;XBT24H&#39;. | 
 **side** | **str**| Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless &#x60;orderQty&#x60; or &#x60;simpleOrderQty&#x60; is negative. | [optional] 
 **simple_order_qty** | **float**| Order quantity in units of the underlying instrument (i.e. Bitcoin). | [optional] 
 **quantity** | **float**| Deprecated: use &#x60;orderQty&#x60;. | [optional] 
 **order_qty** | **float**| Order quantity in units of the instrument (i.e. contracts). | [optional] 
 **price** | **float**| Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. | [optional] 
 **display_qty** | **float**| Optional quantity to display in the book. Use 0 for a hidden order. | [optional] 
 **stop_price** | **float**| Deprecated: use &#x60;stopPx&#x60;. | [optional] 
 **stop_px** | **float**| Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use &#x60;execInst&#x60; of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering. | [optional] 
 **cl_ord_id** | **str**| Optional Client Order ID. This clOrdID will come back on the order and any related executions. | [optional] 
 **cl_ord_link_id** | **str**| Optional Client Order Link ID for contingent orders. | [optional] 
 **peg_offset_value** | **float**| Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders. | [optional] 
 **peg_price_type** | **str**| Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg. | [optional] 
 **type** | **str**| Deprecated: use &#x60;ordType&#x60;. | [optional] 
 **ord_type** | **str**| Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to &#39;Limit&#39; when &#x60;price&#x60; is specified. Defaults to &#39;Stop&#39; when &#x60;stopPx&#x60; is specified. Defaults to &#39;StopLimit&#39; when &#x60;price&#x60; and &#x60;stopPx&#x60; are specified. | [optional] [default to Limit]
 **time_in_force** | **str**| Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, &#39;LimitIfTouched&#39;, and &#39;MarketWithLeftOverAsLimit&#39; orders. | [optional] 
 **exec_inst** | **str**| Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. &#39;AllOrNone&#39; instruction requires &#x60;displayQty&#x60; to be 0. &#39;MarkPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. | [optional] 
 **contingency_type** | **str**| Optional contingency type for use with &#x60;clOrdLinkID&#x60;. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional. | [optional] 
 **text** | **str**| Optional order annotation. e.g. &#39;Take profit&#39;. | [optional] 

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **order_new_bulk**
> list[Order] order_new_bulk(orders=orders)

Create multiple new orders.

This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  Each individual order object in the array should have the same properties as an individual POST /order call.  This endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX systems, this endpoint is ratelimited at `ceil(0.5 * orders)`. Submitting 10 orders via a bulk order call will only count as 5 requests.  For now, only `application/json` is supported on this endpoint. 

### Example 
```python
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.OrderApi()
orders = 'orders_example' # str | An array of orders. (optional)

try: 
    # Create multiple new orders.
    api_response = api_instance.order_new_bulk(orders=orders)
    pprint(api_response)
except ApiException as e:
    print "Exception when calling OrderApi->order_new_bulk: %s\n" % e
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orders** | **str**| An array of orders. | [optional] 

### Return type

[**list[Order]**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

