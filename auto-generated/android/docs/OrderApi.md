# OrderApi

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


<a name="orderAmend"></a>
# **orderAmend**
> Order orderAmend(orderID, origClOrdID, clOrdID, simpleOrderQty, orderQty, simpleLeavesQty, leavesQty, price, stopPx, pegOffsetValue, text)

Amend the quantity or price of an open order.

Send an &#x60;orderID&#x60; or &#x60;origClOrdID&#x60; to identify the order you wish to amend.  Both order quantity and price can be amended. Only one &#x60;qty&#x60; field can be used to amend.  Use the &#x60;leavesQty&#x60; field to specify how much of the order you wish to remain open. This can be useful if you want to adjust your position&#39;s delta by a certain amount, regardless of how much of the order has already filled.  &gt; A &#x60;leavesQty&#x60; can be used to make a \&quot;Filled\&quot; order live again, if it is received within 60 seconds of the fill.  Like order placement, amending can be done in bulk. Simply send a request to &#x60;PUT /api/v1/order/bulk&#x60; with a JSON body of the shape: &#x60;{\&quot;orders\&quot;: [{...}, {...}]}&#x60;, each object containing the fields used in this endpoint. 

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
String orderID = "orderID_example"; // String | Order ID
String origClOrdID = "origClOrdID_example"; // String | Client Order ID. See POST /order.
String clOrdID = "clOrdID_example"; // String | Optional new Client Order ID, requires `origClOrdID`.
Double simpleOrderQty = 3.4D; // Double | Deprecated: simple orders are not supported after 2018/10/26
BigDecimal orderQty = new BigDecimal(); // BigDecimal | Optional order quantity in units of the instrument (i.e. contracts).
Double simpleLeavesQty = 3.4D; // Double | Deprecated: simple orders are not supported after 2018/10/26
BigDecimal leavesQty = new BigDecimal(); // BigDecimal | Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.
Double price = 3.4D; // Double | Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.
Double stopPx = 3.4D; // Double | Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.
Double pegOffsetValue = 3.4D; // Double | Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders.
String text = "text_example"; // String | Optional amend annotation. e.g. 'Adjust skew'.
try {
    Order result = apiInstance.orderAmend(orderID, origClOrdID, clOrdID, simpleOrderQty, orderQty, simpleLeavesQty, leavesQty, price, stopPx, pegOffsetValue, text);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderAmend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderID** | **String**| Order ID | [optional]
 **origClOrdID** | **String**| Client Order ID. See POST /order. | [optional]
 **clOrdID** | **String**| Optional new Client Order ID, requires &#x60;origClOrdID&#x60;. | [optional]
 **simpleOrderQty** | **Double**| Deprecated: simple orders are not supported after 2018/10/26 | [optional]
 **orderQty** | **BigDecimal**| Optional order quantity in units of the instrument (i.e. contracts). | [optional]
 **simpleLeavesQty** | **Double**| Deprecated: simple orders are not supported after 2018/10/26 | [optional]
 **leavesQty** | **BigDecimal**| Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders. | [optional]
 **price** | **Double**| Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. | [optional]
 **stopPx** | **Double**| Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. | [optional]
 **pegOffsetValue** | **Double**| Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders. | [optional]
 **text** | **String**| Optional amend annotation. e.g. &#39;Adjust skew&#39;. | [optional]

### Return type

[**Order**](Order.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="orderCancel"></a>
# **orderCancel**
> List&lt;Order&gt; orderCancel(orderID, clOrdID, text)

Cancel order(s). Send multiple order IDs to cancel in bulk.

Either an orderID or a clOrdID must be provided.

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
String orderID = "orderID_example"; // String | Order ID(s).
String clOrdID = "clOrdID_example"; // String | Client Order ID(s). See POST /order.
String text = "text_example"; // String | Optional cancellation annotation. e.g. 'Spread Exceeded'.
try {
    List<Order> result = apiInstance.orderCancel(orderID, clOrdID, text);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderCancel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderID** | **String**| Order ID(s). | [optional]
 **clOrdID** | **String**| Client Order ID(s). See POST /order. | [optional]
 **text** | **String**| Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;. | [optional]

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="orderCancelAll"></a>
# **orderCancelAll**
> List&lt;Order&gt; orderCancelAll(symbol, filter, text)

Cancels all of your orders.

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
String symbol = "symbol_example"; // String | Optional symbol. If provided, only cancels orders for that symbol.
String filter = "filter_example"; // String | Optional filter for cancellation. Use to only cancel some orders, e.g. `{\"side\": \"Buy\"}`.
String text = "text_example"; // String | Optional cancellation annotation. e.g. 'Spread Exceeded'
try {
    List<Order> result = apiInstance.orderCancelAll(symbol, filter, text);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderCancelAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Optional symbol. If provided, only cancels orders for that symbol. | [optional]
 **filter** | **String**| Optional filter for cancellation. Use to only cancel some orders, e.g. &#x60;{\&quot;side\&quot;: \&quot;Buy\&quot;}&#x60;. | [optional]
 **text** | **String**| Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39; | [optional]

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="orderCancelAllAfter"></a>
# **orderCancelAllAfter**
> Object orderCancelAllAfter(timeout)

Automatically cancel all your orders after a specified timeout.

Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.  Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.  This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#Dead-Mans-Switch-Auto-Cancel). 

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
Double timeout = 3.4D; // Double | Timeout in ms. Set to 0 to cancel this timer. 
try {
    Object result = apiInstance.orderCancelAllAfter(timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderCancelAllAfter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeout** | **Double**| Timeout in ms. Set to 0 to cancel this timer.  |

### Return type

**Object**

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="orderClosePosition"></a>
# **orderClosePosition**
> Order orderClosePosition(symbol, price)

Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]

If no &#x60;price&#x60; is specified, a market order will be submitted to close the whole of your position. This will also close all other open orders in this symbol.

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
String symbol = "symbol_example"; // String | Symbol of position to close.
Double price = 3.4D; // Double | Optional limit price.
try {
    Order result = apiInstance.orderClosePosition(symbol, price);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderClosePosition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Symbol of position to close. |
 **price** | **Double**| Optional limit price. | [optional]

### Return type

[**Order**](Order.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="orderGetOrders"></a>
# **orderGetOrders**
> List&lt;Order&gt; orderGetOrders(symbol, filter, columns, count, start, reverse, startTime, endTime)

Get your orders.

To get open orders only, send {\&quot;open\&quot;: true} in the filter param.  See &lt;a href&#x3D;\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
String symbol = "symbol_example"; // String | Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive.
String filter = "filter_example"; // String | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
String columns = "columns_example"; // String | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
BigDecimal count = new BigDecimal(); // BigDecimal | Number of results to fetch. Must be a positive integer.
BigDecimal start = new BigDecimal(); // BigDecimal | Starting point for results.
Boolean reverse = false; // Boolean | If true, will sort results newest first.
Date startTime = new Date(); // Date | Starting date filter for results.
Date endTime = new Date(); // Date | Ending date filter for results.
try {
    List<Order> result = apiInstance.orderGetOrders(symbol, filter, columns, count, start, reverse, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderGetOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. | [optional]
 **filter** | **String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | [optional]
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional]
 **count** | **BigDecimal**| Number of results to fetch. Must be a positive integer. | [optional] [default to 100]
 **start** | **BigDecimal**| Starting point for results. | [optional] [default to 0]
 **reverse** | **Boolean**| If true, will sort results newest first. | [optional] [default to false]
 **startTime** | **Date**| Starting date filter for results. | [optional]
 **endTime** | **Date**| Ending date filter for results. | [optional]

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="orderNew"></a>
# **orderNew**
> Order orderNew(symbol, side, simpleOrderQty, orderQty, price, displayQty, stopPx, clOrdID, clOrdLinkID, pegOffsetValue, pegPriceType, ordType, timeInForce, execInst, contingencyType, text)

Create a new order.

## Placing Orders  This endpoint is used for placing orders. See individual fields below for more details on their use.  #### Order Types  All orders require a &#x60;symbol&#x60;. All other fields are optional except when otherwise specified.  These are the valid &#x60;ordType&#x60;s:  - **Limit**: The default order type. Specify an &#x60;orderQty&#x60; and &#x60;price&#x60;. - **Market**: A traditional Market order. A Market order will execute until filled or your bankruptcy price is reached, at   which point it will cancel. - **Stop**: A Stop Market order. Specify an &#x60;orderQty&#x60; and &#x60;stopPx&#x60;. When the &#x60;stopPx&#x60; is reached, the order will be entered   into the book.   - On sell orders, the order will trigger if the triggering price is lower than the &#x60;stopPx&#x60;. On buys, higher.   - Note: Stop orders do not consume margin until triggered. Be sure that the required margin is available in your     account so that it may trigger fully.   - &#x60;Close&#x60; Stops don&#39;t require an &#x60;orderQty&#x60;. See Execution Instructions below. - **StopLimit**: Like a Stop Market, but enters a Limit order instead of a Market order. Specify an &#x60;orderQty&#x60;, &#x60;stopPx&#x60;,   and &#x60;price&#x60;. - **MarketIfTouched**: Similar to a Stop, but triggers are done in the opposite direction. Useful for Take Profit orders. - **LimitIfTouched**: As above; use for Take Profit Limit orders. - **Pegged**: Pegged orders allow users to submit a limit price relative to the current market price. Specify a   &#x60;pegPriceType&#x60;, and &#x60;pegOffsetValue&#x60;.   - Pegged orders **must** have an &#x60;execInst&#x60; of &#x60;Fixed&#x60;. This means the limit price is set at the time the order     is accepted and does not change as the reference price changes.   - &#x60;PrimaryPeg&#x60;: Price is set relative to near touch price.   - &#x60;MarketPeg&#x60;: Price is set relative to far touch price.   - A &#x60;pegPriceType&#x60; submitted with no &#x60;ordType&#x60; is treated as a &#x60;Pegged&#x60; order.  #### Execution Instructions  The following &#x60;execInst&#x60;s are supported. If using multiple, separate with a comma (e.g. &#x60;LastPrice,Close&#x60;).  - **ParticipateDoNotInitiate**: Also known as a Post-Only order. If this order would have executed on placement, it will cancel instead.   This is intended to protect you from the far touch moving towards you while the order is in transit.   It is not intended for speculating on the far touch moving away after submission - we consider such behaviour abusive and monitor for it. - **MarkPrice, LastPrice, IndexPrice**: Used by stop and if-touched orders to determine the triggering price.   Use only one. By default, &#x60;MarkPrice&#x60; is used. Also used for Pegged orders to define the value of &#x60;LastPeg&#x60;. - **ReduceOnly**: A &#x60;ReduceOnly&#x60; order can only reduce your position, not increase it. If you have a &#x60;ReduceOnly&#x60;   limit order that rests in the order book while the position is reduced by other orders, then its order quantity will   be amended down or canceled. If there are multiple &#x60;ReduceOnly&#x60; orders the least aggressive will be amended first. - **Close**: &#x60;Close&#x60; implies &#x60;ReduceOnly&#x60;. A &#x60;Close&#x60; order will cancel other active limit orders with the same side   and symbol if the open quantity exceeds the current position. This is useful for stops: by canceling these orders, a   &#x60;Close&#x60; Stop is ensured to have the margin required to execute, and can only execute up to the full size of your   position. If &#x60;orderQty&#x60; is not specified, a &#x60;Close&#x60; order has an &#x60;orderQty&#x60; equal to your current position&#39;s size.   - Note that a &#x60;Close&#x60; order without an &#x60;orderQty&#x60; requires a &#x60;side&#x60;, so that BitMEX knows if it should trigger     above or below the &#x60;stopPx&#x60;. - **LastWithinMark**: Used by stop orders with &#x60;LastPrice&#x60; to allow stop triggers only when:   - For Sell Stop Market / Stop Limit Order     - Last Price &amp;lt&#x3D; Stop Price     - Last Price &amp;gt&#x3D; Mark Price × (1 - 5%)   - For Buy Stop Market / Stop Limit Order:     - Last Price &amp;gt&#x3D; Stop Price     - Last Price &amp;lt&#x3D; Mark Price × (1 + 5%) - **Fixed**: Pegged orders **must** have an &#x60;execInst&#x60; of &#x60;Fixed&#x60;. This means the limit price is set at the time   the order is accepted and does not change as the reference price changes.  #### Pegged Orders  Pegged orders allow users to submit a limit price relative to the current market price. The limit price is set once when the order is submitted and does not change with the reference price. This order type is not intended for speculating on the far touch moving away after submission - we consider such behaviour abusive and monitor for it.  Pegged orders have an &#x60;ordType&#x60; of &#x60;Pegged&#x60;, and an &#x60;execInst&#x60; of &#x60;Fixed&#x60;.  A &#x60;pegPriceType&#x60; and &#x60;pegOffsetValue&#x60; must also be submitted:  - &#x60;PrimaryPeg&#x60; - price is set relative to the **near touch** price - &#x60;MarketPeg&#x60; - price is set relative to the **far touch** price  #### Trailing Stop Pegged Orders  Use &#x60;pegPriceType&#x60; of &#x60;TrailingStopPeg&#x60; to create Trailing Stops.  The price is set at submission and updates once per second if the underlying price (last/mark/index) has moved by more than 0.1%. &#x60;stopPx&#x60; then moves as the market moves away from the peg, and freezes as the market moves toward it.  Use &#x60;pegOffsetValue&#x60; to set the &#x60;stopPx&#x60; of your order. The peg is set to the triggering price specified in the &#x60;execInst&#x60; (default &#x60;MarkPrice&#x60;). Use a negative offset for stop-sell and buy-if-touched orders.  Requires &#x60;ordType&#x60;: &#x60;Stop&#x60;, &#x60;StopLimit&#x60;, &#x60;MarketIfTouched&#x60;, &#x60;LimitIfTouched&#x60;.  #### Linked Orders  [Linked Orders are deprecated as of 2018/11/10](https://blog.bitmex.com/api_announcement/deprecation-of-contingent-orders/)  #### Trailing Stops  You may use &#x60;pegPriceType&#x60; of &#x60;&#39;TrailingStopPeg&#39;&#x60; to create Trailing Stops. The pegged &#x60;stopPx&#x60; will move as the market moves away from the peg, and freeze as the market moves toward it.  To use, combine with &#x60;pegOffsetValue&#x60; to set the &#x60;stopPx&#x60; of your order. The peg is set to the triggering price specified in the &#x60;execInst&#x60; (default &#x60;&#39;MarkPrice&#39;&#x60;). Use a negative offset for stop-sell and buy-if-touched orders.  Requires &#x60;ordType&#x60;: &#x60;&#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, &#39;LimitIfTouched&#39;&#x60;.  #### Simple Quantities  [Simple Quantities are deprecated as of 2018/10/26](https://blog.bitmex.com/api_announcement/deprecation-of-simpleorderqty-functionality/)  #### Rate Limits  See the [Bulk Order Documentation](#!/Order/Order_newBulk) if you need to place multiple orders at the same time. Bulk orders require fewer risk checks in the trading engine and thus are ratelimited at **1/10** the normal rate.  You can also improve your reactivity to market movements while staying under your ratelimit by using the [Amend](#!/Order/Order_amend) and [Amend Bulk](#!/Order/Order_amendBulk) endpoints. This allows you to stay in the market and avoids the cancel/replace cycle.  #### Tracking Your Orders  If you want to keep track of order IDs yourself, set a unique &#x60;clOrdID&#x60; per order. This &#x60;clOrdID&#x60; will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.  You can also change the &#x60;clOrdID&#x60; by amending an order, supplying an &#x60;origClOrdID&#x60;, and your desired new ID as the &#x60;clOrdID&#x60; param, like so:  &#x60;&#x60;&#x60; # Amends an order&#39;s leavesQty, and updates its clOrdID to \&quot;def-456\&quot; PUT /api/v1/order {\&quot;origClOrdID\&quot;: \&quot;abc-123\&quot;, \&quot;clOrdID\&quot;: \&quot;def-456\&quot;, \&quot;leavesQty\&quot;: 1000} &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.api.OrderApi;

OrderApi apiInstance = new OrderApi();
String symbol = "symbol_example"; // String | Instrument symbol. e.g. 'XBTUSD'.
String side = "side_example"; // String | Order side. Valid options: Buy, Sell. Defaults to 'Buy' unless `orderQty` is negative.
Double simpleOrderQty = 3.4D; // Double | Deprecated: simple orders are not supported after 2018/10/26
BigDecimal orderQty = new BigDecimal(); // BigDecimal | Order quantity in units of the instrument (i.e. contracts).
Double price = 3.4D; // Double | Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.
BigDecimal displayQty = new BigDecimal(); // BigDecimal | Optional quantity to display in the book. Use 0 for a fully hidden order.
Double stopPx = 3.4D; // Double | Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of 'MarkPrice' or 'LastPrice' to define the current price used for triggering.
String clOrdID = "clOrdID_example"; // String | Optional Client Order ID. This clOrdID will come back on the order and any related executions.
String clOrdLinkID = "clOrdLinkID_example"; // String | Deprecated: linked orders are not supported after 2018/11/10.
Double pegOffsetValue = 3.4D; // Double | Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders.
String pegPriceType = "pegPriceType_example"; // String | Optional peg price type. Valid options: MarketPeg, PrimaryPeg, TrailingStopPeg.
String ordType = "Limit"; // String | Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, Pegged. Defaults to 'Limit' when `price` is specified. Defaults to 'Stop' when `stopPx` is specified. Defaults to 'StopLimit' when `price` and `stopPx` are specified.
String timeInForce = "timeInForce_example"; // String | Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to 'GoodTillCancel' for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.
String execInst = "execInst_example"; // String | Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, IndexPrice, LastPrice, Close, ReduceOnly, Fixed, LastWithinMark. 'AllOrNone' instruction requires `displayQty` to be 0. 'MarkPrice', 'IndexPrice' or 'LastPrice' instruction valid for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. 'LastWithinMark' instruction valid for 'Stop' and 'StopLimit' with instruction 'LastPrice'.
String contingencyType = "contingencyType_example"; // String | Deprecated: linked orders are not supported after 2018/11/10.
String text = "text_example"; // String | Optional order annotation. e.g. 'Take profit'.
try {
    Order result = apiInstance.orderNew(symbol, side, simpleOrderQty, orderQty, price, displayQty, stopPx, clOrdID, clOrdLinkID, pegOffsetValue, pegPriceType, ordType, timeInForce, execInst, contingencyType, text);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderNew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. e.g. &#39;XBTUSD&#39;. |
 **side** | **String**| Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless &#x60;orderQty&#x60; is negative. | [optional]
 **simpleOrderQty** | **Double**| Deprecated: simple orders are not supported after 2018/10/26 | [optional]
 **orderQty** | **BigDecimal**| Order quantity in units of the instrument (i.e. contracts). | [optional]
 **price** | **Double**| Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. | [optional]
 **displayQty** | **BigDecimal**| Optional quantity to display in the book. Use 0 for a fully hidden order. | [optional]
 **stopPx** | **Double**| Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use &#x60;execInst&#x60; of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering. | [optional]
 **clOrdID** | **String**| Optional Client Order ID. This clOrdID will come back on the order and any related executions. | [optional]
 **clOrdLinkID** | **String**| Deprecated: linked orders are not supported after 2018/11/10. | [optional]
 **pegOffsetValue** | **Double**| Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders. | [optional]
 **pegPriceType** | **String**| Optional peg price type. Valid options: MarketPeg, PrimaryPeg, TrailingStopPeg. | [optional]
 **ordType** | **String**| Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, Pegged. Defaults to &#39;Limit&#39; when &#x60;price&#x60; is specified. Defaults to &#39;Stop&#39; when &#x60;stopPx&#x60; is specified. Defaults to &#39;StopLimit&#39; when &#x60;price&#x60; and &#x60;stopPx&#x60; are specified. | [optional] [default to Limit]
 **timeInForce** | **String**| Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. | [optional]
 **execInst** | **String**| Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, IndexPrice, LastPrice, Close, ReduceOnly, Fixed, LastWithinMark. &#39;AllOrNone&#39; instruction requires &#x60;displayQty&#x60; to be 0. &#39;MarkPrice&#39;, &#39;IndexPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. &#39;LastWithinMark&#39; instruction valid for &#39;Stop&#39; and &#39;StopLimit&#39; with instruction &#39;LastPrice&#39;. | [optional]
 **contingencyType** | **String**| Deprecated: linked orders are not supported after 2018/11/10. | [optional]
 **text** | **String**| Optional order annotation. e.g. &#39;Take profit&#39;. | [optional]

### Return type

[**Order**](Order.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

