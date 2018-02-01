# SwaggerClient::OrderApi

All URIs are relative to *https://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**order_amend**](OrderApi.md#order_amend) | **PUT** /order | Amend the quantity or price of an open order.
[**order_amend_bulk**](OrderApi.md#order_amend_bulk) | **PUT** /order/bulk | Amend multiple orders for the same symbol.
[**order_cancel**](OrderApi.md#order_cancel) | **DELETE** /order | Cancel order(s). Send multiple order IDs to cancel in bulk.
[**order_cancel_all**](OrderApi.md#order_cancel_all) | **DELETE** /order/all | Cancels all of your orders.
[**order_cancel_all_after**](OrderApi.md#order_cancel_all_after) | **POST** /order/cancelAllAfter | Automatically cancel all your orders after a specified timeout.
[**order_close_position**](OrderApi.md#order_close_position) | **POST** /order/closePosition | Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]
[**order_get_orders**](OrderApi.md#order_get_orders) | **GET** /order | Get your orders.
[**order_new**](OrderApi.md#order_new) | **POST** /order | Create a new order.
[**order_new_bulk**](OrderApi.md#order_new_bulk) | **POST** /order/bulk | Create multiple new orders for the same symbol.


# **order_amend**
> Order order_amend(opts)

Amend the quantity or price of an open order.

Send an `orderID` or `origClOrdID` to identify the order you wish to amend.  Both order quantity and price can be amended. Only one `qty` field can be used to amend.  Use the `leavesQty` field to specify how much of the order you wish to remain open. This can be useful if you want to adjust your position's delta by a certain amount, regardless of how much of the order has already filled.  Use the `simpleOrderQty` and `simpleLeavesQty` fields to specify order size in Bitcoin, rather than contracts. These fields will round up to the nearest contract.  Like order placement, amending can be done in bulk. Simply send a request to `PUT /api/v1/order/bulk` with a JSON body of the shape: `{\"orders\": [{...}, {...}]}`, each object containing the fields used in this endpoint. 

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::OrderApi.new

opts = { 
  order_id: "order_id_example", # String | Order ID
  orig_cl_ord_id: "orig_cl_ord_id_example", # String | Client Order ID. See POST /order.
  cl_ord_id: "cl_ord_id_example", # String | Optional new Client Order ID, requires `origClOrdID`.
  simple_order_qty: 1.2, # Float | Optional order quantity in units of the underlying instrument (i.e. Bitcoin).
  order_qty: 3.4, # Float | Optional order quantity in units of the instrument (i.e. contracts).
  simple_leaves_qty: 1.2, # Float | Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders.
  leaves_qty: 3.4, # Float | Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.
  price: 1.2, # Float | Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.
  stop_px: 1.2, # Float | Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.
  peg_offset_value: 1.2, # Float | Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders.
  text: "text_example" # String | Optional amend annotation. e.g. 'Adjust skew'.
}

begin
  #Amend the quantity or price of an open order.
  result = api_instance.order_amend(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->order_amend: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | **String**| Order ID | [optional] 
 **orig_cl_ord_id** | **String**| Client Order ID. See POST /order. | [optional] 
 **cl_ord_id** | **String**| Optional new Client Order ID, requires &#x60;origClOrdID&#x60;. | [optional] 
 **simple_order_qty** | **Float**| Optional order quantity in units of the underlying instrument (i.e. Bitcoin). | [optional] 
 **order_qty** | **Float**| Optional order quantity in units of the instrument (i.e. contracts). | [optional] 
 **simple_leaves_qty** | **Float**| Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders. | [optional] 
 **leaves_qty** | **Float**| Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders. | [optional] 
 **price** | **Float**| Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. | [optional] 
 **stop_px** | **Float**| Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. | [optional] 
 **peg_offset_value** | **Float**| Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders. | [optional] 
 **text** | **String**| Optional amend annotation. e.g. &#39;Adjust skew&#39;. | [optional] 

### Return type

[**Order**](Order.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **order_amend_bulk**
> Array&lt;Order&gt; order_amend_bulk(opts)

Amend multiple orders for the same symbol.

Similar to POST /amend, but with multiple orders. `application/json` only. Ratelimited at 50%.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::OrderApi.new

opts = { 
  orders: "orders_example" # String | An array of orders.
}

begin
  #Amend multiple orders for the same symbol.
  result = api_instance.order_amend_bulk(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->order_amend_bulk: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orders** | **String**| An array of orders. | [optional] 

### Return type

[**Array&lt;Order&gt;**](Order.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **order_cancel**
> Array&lt;Order&gt; order_cancel(opts)

Cancel order(s). Send multiple order IDs to cancel in bulk.

Either an orderID or a clOrdID must be provided.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::OrderApi.new

opts = { 
  order_id: "order_id_example", # String | Order ID(s).
  cl_ord_id: "cl_ord_id_example", # String | Client Order ID(s). See POST /order.
  text: "text_example" # String | Optional cancellation annotation. e.g. 'Spread Exceeded'.
}

begin
  #Cancel order(s). Send multiple order IDs to cancel in bulk.
  result = api_instance.order_cancel(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->order_cancel: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | **String**| Order ID(s). | [optional] 
 **cl_ord_id** | **String**| Client Order ID(s). See POST /order. | [optional] 
 **text** | **String**| Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;. | [optional] 

### Return type

[**Array&lt;Order&gt;**](Order.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **order_cancel_all**
> Object order_cancel_all(opts)

Cancels all of your orders.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::OrderApi.new

opts = { 
  symbol: "symbol_example", # String | Optional symbol. If provided, only cancels orders for that symbol.
  filter: "filter_example", # String | Optional filter for cancellation. Use to only cancel some orders, e.g. `{\"side\": \"Buy\"}`.
  text: "text_example" # String | Optional cancellation annotation. e.g. 'Spread Exceeded'
}

begin
  #Cancels all of your orders.
  result = api_instance.order_cancel_all(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->order_cancel_all: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Optional symbol. If provided, only cancels orders for that symbol. | [optional] 
 **filter** | **String**| Optional filter for cancellation. Use to only cancel some orders, e.g. &#x60;{\&quot;side\&quot;: \&quot;Buy\&quot;}&#x60;. | [optional] 
 **text** | **String**| Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39; | [optional] 

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **order_cancel_all_after**
> Object order_cancel_all_after(timeout)

Automatically cancel all your orders after a specified timeout.

Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.  Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.  This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-). 

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::OrderApi.new

timeout = 1.2 # Float | Timeout in ms. Set to 0 to cancel this timer. 


begin
  #Automatically cancel all your orders after a specified timeout.
  result = api_instance.order_cancel_all_after(timeout)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->order_cancel_all_after: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeout** | **Float**| Timeout in ms. Set to 0 to cancel this timer.  | 

### Return type

**Object**

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **order_close_position**
> Order order_close_position(symbol, opts)

Close a position. [Deprecated, use POST /order with execInst: 'Close']

If no `price` is specified, a market order will be submitted to close the whole of your position. This will also close all other open orders in this symbol.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::OrderApi.new

symbol = "symbol_example" # String | Symbol of position to close.

opts = { 
  price: 1.2 # Float | Optional limit price.
}

begin
  #Close a position. [Deprecated, use POST /order with execInst: 'Close']
  result = api_instance.order_close_position(symbol, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->order_close_position: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Symbol of position to close. | 
 **price** | **Float**| Optional limit price. | [optional] 

### Return type

[**Order**](Order.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **order_get_orders**
> Array&lt;Order&gt; order_get_orders(opts)

Get your orders.

To get open orders only, send {\"open\": true} in the filter param.  See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\">the FIX Spec</a> for explanations of these fields.

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::OrderApi.new

opts = { 
  symbol: "symbol_example", # String | Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.
  filter: "filter_example", # String | Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.
  columns: "columns_example", # String | Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
  count: 100, # Float | Number of results to fetch.
  start: 0, # Float | Starting point for results.
  reverse: false, # BOOLEAN | If true, will sort results newest first.
  start_time: DateTime.parse("2013-10-20T19:20:30+01:00"), # DateTime | Starting date filter for results.
  end_time: DateTime.parse("2013-10-20T19:20:30+01:00") # DateTime | Ending date filter for results.
}

begin
  #Get your orders.
  result = api_instance.order_get_orders(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->order_get_orders: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. | [optional] 
 **filter** | **String**| Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details. | [optional] 
 **columns** | **String**| Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. | [optional] 
 **count** | **Float**| Number of results to fetch. | [optional] [default to 100]
 **start** | **Float**| Starting point for results. | [optional] [default to 0]
 **reverse** | **BOOLEAN**| If true, will sort results newest first. | [optional] [default to false]
 **start_time** | **DateTime**| Starting date filter for results. | [optional] 
 **end_time** | **DateTime**| Ending date filter for results. | [optional] 

### Return type

[**Array&lt;Order&gt;**](Order.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **order_new**
> Order order_new(symbol, opts)

Create a new order.

## Placing Orders  This endpoint is used for placing orders. See individual fields below for more details on their use.  #### Order Types  All orders require a `symbol`. All other fields are optional except when otherwise specified.  These are the valid `ordType`s:  * **Limit**: The default order type. Specify an `orderQty` and `price`. * **Market**: A traditional Market order. A Market order will execute until filled or your bankruptcy price is reached, at   which point it will cancel. * **MarketWithLeftOverAsLimit**: A market order that, after eating through the order book as far as   permitted by available margin, will become a limit order. The difference between this type and `Market` only   affects the behavior in thin books. Upon reaching the deepest possible price, if there is quantity left over,   a `Market` order will cancel the remaining quantity. `MarketWithLeftOverAsLimit` will keep the remaining   quantity in the books as a `Limit`. * **Stop**: A Stop Market order. Specify an `orderQty` and `stopPx`. When the `stopPx` is reached, the order will be entered   into the book.   * On sell orders, the order will trigger if the triggering price is lower than the `stopPx`. On buys, higher.   * Note: Stop orders do not consume margin until triggered. Be sure that the required margin is available in your     account so that it may trigger fully.   * `Close` Stops don't require an `orderQty`. See Execution Instructions below. * **StopLimit**: Like a Stop Market, but enters a Limit order instead of a Market order. Specify an `orderQty`, `stopPx`,   and `price`. * **MarketIfTouched**: Similar to a Stop, but triggers are done in the opposite direction. Useful for Take Profit orders. * **LimitIfTouched**: As above; use for Take Profit Limit orders.  #### Execution Instructions  The following `execInst`s are supported. If using multiple, separate with a comma (e.g. `LastPrice,Close`).  * **ParticipateDoNotInitiate**: Also known as a Post-Only order. If this order would have executed on placement,   it will cancel instead. * **AllOrNone**: Valid only for hidden orders (`displayQty: 0`). Use to only execute if the entire order would fill. * **MarkPrice, LastPrice, IndexPrice**: Used by stop and if-touched orders to determine the triggering price.   Use only one. By default, `'MarkPrice'` is used. Also used for Pegged orders to define the value of `'LastPeg'`. * **ReduceOnly**: A `'ReduceOnly'` order can only reduce your position, not increase it. If you have a `'ReduceOnly'`   limit order that rests in the order book while the position is reduced by other orders, then its order quantity will   be amended down or canceled. If there are multiple `'ReduceOnly'` orders the least agresssive will be amended first. * **Close**: `'Close'` implies `'ReduceOnly'`. A `'Close'` order will cancel other active limit orders with the same side   and symbol if the open quantity exceeds the current position. This is useful for stops: by canceling these orders, a   `'Close'` Stop is ensured to have the margin required to execute, and can only execute up to the full size of your   position. If not specified, a `'Close'` order has an `orderQty` equal to your current position's size.  #### Linked Orders  Linked Orders are an advanced capability. It is very powerful, but its use requires careful coding and testing. Please follow this document carefully and use the [Testnet Exchange](https://testnet.bitmex.com) while developing.  BitMEX offers four advanced Linked Order types:  * **OCO**: *One Cancels the Other*. A very flexible version of the standard Stop / Take Profit technique.   Multiple orders may be linked together using a single `clOrdLinkID`. Send a `contingencyType` of   `OneCancelsTheOther` on the orders. The first order that fully or partially executes (or activates   for `Stop` orders) will cancel all other orders with the same `clOrdLinkID`. * **OTO**: *One Triggers the Other*. Send a `contingencyType` of `'OneTriggersTheOther'` on the primary order and   then subsequent orders with the same `clOrdLinkID` will be not be triggered until the primary order fully executes. * **OUOA**: *One Updates the Other Absolute*. Send a `contingencyType` of `'OneUpdatesTheOtherAbsolute'` on the orders. Then   as one order has a execution, other orders with the same `clOrdLinkID` will have their order quantity amended   down by the execution quantity. * **OUOP**: *One Updates the Other Proportional*. Send a `contingencyType` of `'OneUpdatesTheOtherProportional'` on the orders. Then   as one order has a execution, other orders with the same `clOrdLinkID` will have their order quantity reduced proportionally   by the fill percentage.  #### Trailing Stops  You may use `pegPriceType` of `'TrailingStopPeg'` to create Trailing Stops. The pegged `stopPx` will move as the market moves away from the peg, and freeze as the market moves toward it.  To use, combine with `pegOffsetValue` to set the `stopPx` of your order. The peg is set to the triggering price specified in the `execInst` (default `'MarkPrice'`). Use a negative offset for stop-sell and buy-if-touched orders.  Requires `ordType`: `'Stop', 'StopLimit', 'MarketIfTouched', 'LimitIfTouched'`.  #### Simple Quantities  Send a `simpleOrderQty` instead of an `orderQty` to create an order denominated in the underlying currency. This is useful for opening up a position with 1 XBT of exposure without having to calculate how many contracts it is.  #### Rate Limits  See the [Bulk Order Documentation](#!/Order/Order_newBulk) if you need to place multiple orders at the same time. Bulk orders require fewer risk checks in the trading engine and thus are ratelimited at **1/10** the normal rate.  You can also improve your reactivity to market movements while staying under your ratelimit by using the [Amend](#!/Order/Order_amend) and [Amend Bulk](#!/Order/Order_amendBulk) endpoints. This allows you to stay in the market and avoids the cancel/replace cycle.  #### Tracking Your Orders  If you want to keep track of order IDs yourself, set a unique `clOrdID` per order. This `clOrdID` will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters. 

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::OrderApi.new

symbol = "symbol_example" # String | Instrument symbol. e.g. 'XBTUSD'.

opts = { 
  side: "side_example", # String | Order side. Valid options: Buy, Sell. Defaults to 'Buy' unless `orderQty` or `simpleOrderQty` is negative.
  simple_order_qty: 1.2, # Float | Order quantity in units of the underlying instrument (i.e. Bitcoin).
  quantity: 3.4, # Float | Deprecated: use `orderQty`.
  order_qty: 3.4, # Float | Order quantity in units of the instrument (i.e. contracts).
  price: 1.2, # Float | Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.
  display_qty: 3.4, # Float | Optional quantity to display in the book. Use 0 for a fully hidden order.
  stop_price: 1.2, # Float | Deprecated: use `stopPx`.
  stop_px: 1.2, # Float | Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of 'MarkPrice' or 'LastPrice' to define the current price used for triggering.
  cl_ord_id: "cl_ord_id_example", # String | Optional Client Order ID. This clOrdID will come back on the order and any related executions.
  cl_ord_link_id: "cl_ord_link_id_example", # String | Optional Client Order Link ID for contingent orders.
  peg_offset_value: 1.2, # Float | Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders.
  peg_price_type: "peg_price_type_example", # String | Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg.
  type: "type_example", # String | Deprecated: use `ordType`.
  ord_type: "Limit", # String | Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to 'Limit' when `price` is specified. Defaults to 'Stop' when `stopPx` is specified. Defaults to 'StopLimit' when `price` and `stopPx` are specified.
  time_in_force: "time_in_force_example", # String | Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to 'GoodTillCancel' for 'Limit', 'StopLimit', 'LimitIfTouched', and 'MarketWithLeftOverAsLimit' orders.
  exec_inst: "exec_inst_example", # String | Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, IndexPrice, LastPrice, Close, ReduceOnly, Fixed. 'AllOrNone' instruction requires `displayQty` to be 0. 'MarkPrice', 'IndexPrice' or 'LastPrice' instruction valid for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders.
  contingency_type: "contingency_type_example", # String | Optional contingency type for use with `clOrdLinkID`. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional.
  text: "text_example" # String | Optional order annotation. e.g. 'Take profit'.
}

begin
  #Create a new order.
  result = api_instance.order_new(symbol, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->order_new: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Instrument symbol. e.g. &#39;XBTUSD&#39;. | 
 **side** | **String**| Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless &#x60;orderQty&#x60; or &#x60;simpleOrderQty&#x60; is negative. | [optional] 
 **simple_order_qty** | **Float**| Order quantity in units of the underlying instrument (i.e. Bitcoin). | [optional] 
 **quantity** | **Float**| Deprecated: use &#x60;orderQty&#x60;. | [optional] 
 **order_qty** | **Float**| Order quantity in units of the instrument (i.e. contracts). | [optional] 
 **price** | **Float**| Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders. | [optional] 
 **display_qty** | **Float**| Optional quantity to display in the book. Use 0 for a fully hidden order. | [optional] 
 **stop_price** | **Float**| Deprecated: use &#x60;stopPx&#x60;. | [optional] 
 **stop_px** | **Float**| Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use &#x60;execInst&#x60; of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering. | [optional] 
 **cl_ord_id** | **String**| Optional Client Order ID. This clOrdID will come back on the order and any related executions. | [optional] 
 **cl_ord_link_id** | **String**| Optional Client Order Link ID for contingent orders. | [optional] 
 **peg_offset_value** | **Float**| Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders. | [optional] 
 **peg_price_type** | **String**| Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg. | [optional] 
 **type** | **String**| Deprecated: use &#x60;ordType&#x60;. | [optional] 
 **ord_type** | **String**| Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to &#39;Limit&#39; when &#x60;price&#x60; is specified. Defaults to &#39;Stop&#39; when &#x60;stopPx&#x60; is specified. Defaults to &#39;StopLimit&#39; when &#x60;price&#x60; and &#x60;stopPx&#x60; are specified. | [optional] [default to Limit]
 **time_in_force** | **String**| Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, &#39;LimitIfTouched&#39;, and &#39;MarketWithLeftOverAsLimit&#39; orders. | [optional] 
 **exec_inst** | **String**| Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, IndexPrice, LastPrice, Close, ReduceOnly, Fixed. &#39;AllOrNone&#39; instruction requires &#x60;displayQty&#x60; to be 0. &#39;MarkPrice&#39;, &#39;IndexPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. | [optional] 
 **contingency_type** | **String**| Optional contingency type for use with &#x60;clOrdLinkID&#x60;. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional. | [optional] 
 **text** | **String**| Optional order annotation. e.g. &#39;Take profit&#39;. | [optional] 

### Return type

[**Order**](Order.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



# **order_new_bulk**
> Array&lt;Order&gt; order_new_bulk(opts)

Create multiple new orders for the same symbol.

This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  Each individual order object in the array should have the same properties as an individual POST /order call.  This endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX systems, this endpoint is ratelimited at `ceil(0.1 * orders)`. Submitting 10 orders via a bulk order call will only count as 1 request, 15 as 2, 32 as 4, and so on.  For now, only `application/json` is supported on this endpoint. 

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: apiKey
  config.api_key['api-key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-key'] = 'Bearer'

  # Configure API key authorization: apiNonce
  config.api_key['api-nonce'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-nonce'] = 'Bearer'

  # Configure API key authorization: apiSignature
  config.api_key['api-signature'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api-signature'] = 'Bearer'
end

api_instance = SwaggerClient::OrderApi.new

opts = { 
  orders: "orders_example" # String | An array of orders.
}

begin
  #Create multiple new orders for the same symbol.
  result = api_instance.order_new_bulk(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling OrderApi->order_new_bulk: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orders** | **String**| An array of orders. | [optional] 

### Return type

[**Array&lt;Order&gt;**](Order.md)

### Authorization

[apiKey](../README.md#apiKey), [apiNonce](../README.md#apiNonce), [apiSignature](../README.md#apiSignature)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript



