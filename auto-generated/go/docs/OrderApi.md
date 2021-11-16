# \OrderApi

All URIs are relative to *https://www.bitmex.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OrderAmend**](OrderApi.md#OrderAmend) | **Put** /order | Amend the quantity or price of an open order.
[**OrderCancel**](OrderApi.md#OrderCancel) | **Delete** /order | Cancel order(s). Send multiple order IDs to cancel in bulk.
[**OrderCancelAll**](OrderApi.md#OrderCancelAll) | **Delete** /order/all | Cancels all of your orders.
[**OrderCancelAllAfter**](OrderApi.md#OrderCancelAllAfter) | **Post** /order/cancelAllAfter | Automatically cancel all your orders after a specified timeout.
[**OrderClosePosition**](OrderApi.md#OrderClosePosition) | **Post** /order/closePosition | Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]
[**OrderGetOrders**](OrderApi.md#OrderGetOrders) | **Get** /order | Get your orders.
[**OrderNew**](OrderApi.md#OrderNew) | **Post** /order | Create a new order.


# **OrderAmend**
> Order OrderAmend(ctx, optional)
Amend the quantity or price of an open order.

Send an `orderID` or `origClOrdID` to identify the order you wish to amend.  Both order quantity and price can be amended. Only one `qty` field can be used to amend.  Use the `leavesQty` field to specify how much of the order you wish to remain open. This can be useful if you want to adjust your position's delta by a certain amount, regardless of how much of the order has already filled.  > A `leavesQty` can be used to make a \"Filled\" order live again, if it is received within 60 seconds of the fill.  Like order placement, amending can be done in bulk. Simply send a request to `PUT /api/v1/order/bulk` with a JSON body of the shape: `{\"orders\": [{...}, {...}]}`, each object containing the fields used in this endpoint. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***OrderAmendOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OrderAmendOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderID** | **optional.String**| Order ID | 
 **origClOrdID** | **optional.String**| Client Order ID. See POST /order. | 
 **clOrdID** | **optional.String**| Optional new Client Order ID, requires &#x60;origClOrdID&#x60;. | 
 **simpleOrderQty** | **optional.Float64**| Deprecated: simple orders are not supported after 2018/10/26 | 
 **orderQty** | **optional.Float32**| Optional order quantity in units of the instrument (i.e. contracts). | 
 **simpleLeavesQty** | **optional.Float64**| Deprecated: simple orders are not supported after 2018/10/26 | 
 **leavesQty** | **optional.Float32**| Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders. | 
 **price** | **optional.Float64**| Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. | 
 **stopPx** | **optional.Float64**| Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. | 
 **pegOffsetValue** | **optional.Float64**| Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders. | 
 **text** | **optional.String**| Optional amend annotation. e.g. &#39;Adjust skew&#39;. | 

### Return type

[**Order**](Order.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrderCancel**
> []Order OrderCancel(ctx, optional)
Cancel order(s). Send multiple order IDs to cancel in bulk.

Either an orderID or a clOrdID must be provided.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***OrderCancelOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OrderCancelOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderID** | **optional.String**| Order ID(s). | 
 **clOrdID** | **optional.String**| Client Order ID(s). See POST /order. | 
 **text** | **optional.String**| Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;. | 

### Return type

[**[]Order**](Order.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrderCancelAll**
> []Order OrderCancelAll(ctx, optional)
Cancels all of your orders.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***OrderCancelAllOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OrderCancelAllOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **optional.String**| Optional symbol. If provided, only cancels orders for that symbol. | 
 **filter** | **optional.String**| Optional filter for cancellation. Use to only cancel some orders, e.g. &#x60;{\&quot;side\&quot;: \&quot;Buy\&quot;}&#x60;. | 
 **text** | **optional.String**| Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39; | 

### Return type

[**[]Order**](Order.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrderCancelAllAfter**
> interface{} OrderCancelAllAfter(ctx, timeout)
Automatically cancel all your orders after a specified timeout.

Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.  Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.  This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#Dead-Mans-Switch-Auto-Cancel). 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **timeout** | **float64**| Timeout in ms. Set to 0 to cancel this timer.  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrderClosePosition**
> Order OrderClosePosition(ctx, symbol, optional)
Close a position. [Deprecated, use POST /order with execInst: 'Close']

If no `price` is specified, a market order will be submitted to close the whole of your position. This will also close all other open orders in this symbol.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **symbol** | **string**| Symbol of position to close. | 
 **optional** | ***OrderClosePositionOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OrderClosePositionOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **price** | **optional.Float64**| Optional limit price. | 

### Return type

[**Order**](Order.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrderGetOrders**
> []Order OrderGetOrders(ctx, optional)
Get your orders.

To get open orders only, send {\"open\": true} in the filter param.  See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\">the FIX Spec</a> for explanations of these fields.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***OrderGetOrdersOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OrderGetOrdersOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **optional.String**| Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;. | 
 **filter** | **optional.String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. | 
 **columns** | **optional.String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | 
 **count** | **optional.Float32**| Number of results to fetch. | [default to 100]
 **start** | **optional.Float32**| Starting point for results. | [default to 0]
 **reverse** | **optional.Bool**| If true, will sort results newest first. | [default to false]
 **startTime** | **optional.Time**| Starting date filter for results. | 
 **endTime** | **optional.Time**| Ending date filter for results. | 

### Return type

[**[]Order**](Order.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrderNew**
> Order OrderNew(ctx, symbol, optional)
Create a new order.

## Placing Orders  This endpoint is used for placing orders. See individual fields below for more details on their use.  #### Order Types  All orders require a `symbol`. All other fields are optional except when otherwise specified.  These are the valid `ordType`s:  - **Limit**: The default order type. Specify an `orderQty` and `price`. - **Market**: A traditional Market order. A Market order will execute until filled or your bankruptcy price is reached, at   which point it will cancel. - **Stop**: A Stop Market order. Specify an `orderQty` and `stopPx`. When the `stopPx` is reached, the order will be entered   into the book.   - On sell orders, the order will trigger if the triggering price is lower than the `stopPx`. On buys, higher.   - Note: Stop orders do not consume margin until triggered. Be sure that the required margin is available in your     account so that it may trigger fully.   - `Close` Stops don't require an `orderQty`. See Execution Instructions below. - **StopLimit**: Like a Stop Market, but enters a Limit order instead of a Market order. Specify an `orderQty`, `stopPx`,   and `price`. - **MarketIfTouched**: Similar to a Stop, but triggers are done in the opposite direction. Useful for Take Profit orders. - **LimitIfTouched**: As above; use for Take Profit Limit orders.  #### Execution Instructions  The following `execInst`s are supported. If using multiple, separate with a comma (e.g. `LastPrice,Close`).  - **ParticipateDoNotInitiate**: Also known as a Post-Only order. If this order would have executed on placement,   it will cancel instead. - **MarkPrice, LastPrice, IndexPrice**: Used by stop and if-touched orders to determine the triggering price.   Use only one. By default, `'MarkPrice'` is used. Also used for Pegged orders to define the value of `'LastPeg'`. - **ReduceOnly**: A `'ReduceOnly'` order can only reduce your position, not increase it. If you have a `'ReduceOnly'`   limit order that rests in the order book while the position is reduced by other orders, then its order quantity will   be amended down or canceled. If there are multiple `'ReduceOnly'` orders the least aggressive will be amended first. - **Close**: `'Close'` implies `'ReduceOnly'`. A `'Close'` order will cancel other active limit orders with the same side   and symbol if the open quantity exceeds the current position. This is useful for stops: by canceling these orders, a   `'Close'` Stop is ensured to have the margin required to execute, and can only execute up to the full size of your   position. If `orderQty` is not specified, a `'Close'` order has an `orderQty` equal to your current position's size.   - Note that a `Close` order without an `orderQty` requires a `side`, so that BitMEX knows if it should trigger     above or below the `stopPx`.  #### Linked Orders  [Linked Orders are deprecated as of 2018/11/10](https://blog.bitmex.com/api_announcement/deprecation-of-contingent-orders/)  #### Trailing Stops  You may use `pegPriceType` of `'TrailingStopPeg'` to create Trailing Stops. The pegged `stopPx` will move as the market moves away from the peg, and freeze as the market moves toward it.  To use, combine with `pegOffsetValue` to set the `stopPx` of your order. The peg is set to the triggering price specified in the `execInst` (default `'MarkPrice'`). Use a negative offset for stop-sell and buy-if-touched orders.  Requires `ordType`: `'Stop', 'StopLimit', 'MarketIfTouched', 'LimitIfTouched'`.  #### Simple Quantities  [Simple Quantities are deprecated as of 2018/10/26](https://blog.bitmex.com/api_announcement/deprecation-of-simpleorderqty-functionality/)  #### Rate Limits  See the [Bulk Order Documentation](#!/Order/Order_newBulk) if you need to place multiple orders at the same time. Bulk orders require fewer risk checks in the trading engine and thus are ratelimited at **1/10** the normal rate.  You can also improve your reactivity to market movements while staying under your ratelimit by using the [Amend](#!/Order/Order_amend) and [Amend Bulk](#!/Order/Order_amendBulk) endpoints. This allows you to stay in the market and avoids the cancel/replace cycle.  #### Tracking Your Orders  If you want to keep track of order IDs yourself, set a unique `clOrdID` per order. This `clOrdID` will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.  You can also change the `clOrdID` by amending an order, supplying an `origClOrdID`, and your desired new ID as the `clOrdID` param, like so:  ``` # Amends an order's leavesQty, and updates its clOrdID to \"def-456\" PUT /api/v1/order {\"origClOrdID\": \"abc-123\", \"clOrdID\": \"def-456\", \"leavesQty\": 1000} ``` 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **symbol** | **string**| Instrument symbol. e.g. &#39;XBTUSD&#39;. | 
 **optional** | ***OrderNewOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a OrderNewOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **side** | **optional.String**| Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless &#x60;orderQty&#x60; is negative. | 
 **simpleOrderQty** | **optional.Float64**| Deprecated: simple orders are not supported after 2018/10/26 | 
 **orderQty** | **optional.Float32**| Order quantity in units of the instrument (i.e. contracts). | 
 **price** | **optional.Float64**| Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. | 
 **displayQty** | **optional.Float32**| Optional quantity to display in the book. Use 0 for a fully hidden order. | 
 **stopPx** | **optional.Float64**| Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use &#x60;execInst&#x60; of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering. | 
 **clOrdID** | **optional.String**| Optional Client Order ID. This clOrdID will come back on the order and any related executions. | 
 **clOrdLinkID** | **optional.String**| Deprecated: linked orders are not supported after 2018/11/10. | 
 **pegOffsetValue** | **optional.Float64**| Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders. | 
 **pegPriceType** | **optional.String**| Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg. | 
 **ordType** | **optional.String**| Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, Pegged. Defaults to &#39;Limit&#39; when &#x60;price&#x60; is specified. Defaults to &#39;Stop&#39; when &#x60;stopPx&#x60; is specified. Defaults to &#39;StopLimit&#39; when &#x60;price&#x60; and &#x60;stopPx&#x60; are specified. | [default to Limit]
 **timeInForce** | **optional.String**| Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. | 
 **execInst** | **optional.String**| Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, IndexPrice, LastPrice, Close, ReduceOnly, Fixed. &#39;AllOrNone&#39; instruction requires &#x60;displayQty&#x60; to be 0. &#39;MarkPrice&#39;, &#39;IndexPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. | 
 **contingencyType** | **optional.String**| Deprecated: linked orders are not supported after 2018/11/10. | 
 **text** | **optional.String**| Optional order annotation. e.g. &#39;Take profit&#39;. | 

### Return type

[**Order**](Order.md)

### Authorization

[apiExpires](../README.md#apiExpires), [apiKey](../README.md#apiKey), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

