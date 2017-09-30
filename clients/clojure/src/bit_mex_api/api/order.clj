(ns bit-mex-api.api.order
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn order-amend-with-http-info
  "Amend the quantity or price of an open order.
  Send an `orderID` or `origClOrdID` to identify the order you wish to amend.

Both order quantity and price can be amended. Only one `qty` field can be used to amend.

Use the `leavesQty` field to specify how much of the order you wish to remain open. This can be useful
if you want to adjust your position's delta by a certain amount, regardless of how much of the order has
already filled.

Use the `simpleOrderQty` and `simpleLeavesQty` fields to specify order size in Bitcoin, rather than contracts.
These fields will round up to the nearest contract.

Like order placement, amending can be done in bulk. Simply send a request to `PUT /api/v1/order/bulk` with
a JSON body of the shape: `{\"orders\": [{...}, {...}]}`, each object containing the fields used in this endpoint."
  ([] (order-amend-with-http-info nil))
  ([{:keys [order-id orig-cl-ord-id cl-ord-id simple-order-qty order-qty simple-leaves-qty leaves-qty price stop-px peg-offset-value text ]}]
   (call-api "/order" :put
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"orderID" order-id "origClOrdID" orig-cl-ord-id "clOrdID" cl-ord-id "simpleOrderQty" simple-order-qty "orderQty" order-qty "simpleLeavesQty" simple-leaves-qty "leavesQty" leaves-qty "price" price "stopPx" stop-px "pegOffsetValue" peg-offset-value "text" text }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiKey" "apiNonce" "apiSignature"]})))

(defn order-amend
  "Amend the quantity or price of an open order.
  Send an `orderID` or `origClOrdID` to identify the order you wish to amend.

Both order quantity and price can be amended. Only one `qty` field can be used to amend.

Use the `leavesQty` field to specify how much of the order you wish to remain open. This can be useful
if you want to adjust your position's delta by a certain amount, regardless of how much of the order has
already filled.

Use the `simpleOrderQty` and `simpleLeavesQty` fields to specify order size in Bitcoin, rather than contracts.
These fields will round up to the nearest contract.

Like order placement, amending can be done in bulk. Simply send a request to `PUT /api/v1/order/bulk` with
a JSON body of the shape: `{\"orders\": [{...}, {...}]}`, each object containing the fields used in this endpoint."
  ([] (order-amend nil))
  ([optional-params]
   (:data (order-amend-with-http-info optional-params))))

(defn order-amend-bulk-with-http-info
  "Amend multiple orders for the same symbol.
  Similar to POST /amend, but with multiple orders. `application/json` only. Ratelimited at 50%."
  ([] (order-amend-bulk-with-http-info nil))
  ([{:keys [orders ]}]
   (call-api "/order/bulk" :put
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"orders" orders }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiKey" "apiNonce" "apiSignature"]})))

(defn order-amend-bulk
  "Amend multiple orders for the same symbol.
  Similar to POST /amend, but with multiple orders. `application/json` only. Ratelimited at 50%."
  ([] (order-amend-bulk nil))
  ([optional-params]
   (:data (order-amend-bulk-with-http-info optional-params))))

(defn order-cancel-with-http-info
  "Cancel order(s). Send multiple order IDs to cancel in bulk.
  Either an orderID or a clOrdID must be provided."
  ([] (order-cancel-with-http-info nil))
  ([{:keys [order-id cl-ord-id text ]}]
   (call-api "/order" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"orderID" order-id "clOrdID" cl-ord-id "text" text }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiKey" "apiNonce" "apiSignature"]})))

(defn order-cancel
  "Cancel order(s). Send multiple order IDs to cancel in bulk.
  Either an orderID or a clOrdID must be provided."
  ([] (order-cancel nil))
  ([optional-params]
   (:data (order-cancel-with-http-info optional-params))))

(defn order-cancel-all-with-http-info
  "Cancels all of your orders."
  ([] (order-cancel-all-with-http-info nil))
  ([{:keys [symbol filter text ]}]
   (call-api "/order/all" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"symbol" symbol "filter" filter "text" text }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiKey" "apiNonce" "apiSignature"]})))

(defn order-cancel-all
  "Cancels all of your orders."
  ([] (order-cancel-all nil))
  ([optional-params]
   (:data (order-cancel-all-with-http-info optional-params))))

(defn order-cancel-all-after-with-http-info
  "Automatically cancel all your orders after a specified timeout.
  Useful as a dead-man's switch to ensure your orders are canceled in case of an outage.
If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.

Example usage: call this route at 15s intervals with an offset of 60000 (60s).
If this route is not called within 60 seconds, all your orders will be automatically canceled.

This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-)."
  [timeout ]
  (call-api "/order/cancelAllAfter" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"timeout" timeout }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiKey" "apiNonce" "apiSignature"]}))

(defn order-cancel-all-after
  "Automatically cancel all your orders after a specified timeout.
  Useful as a dead-man's switch to ensure your orders are canceled in case of an outage.
If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.

Example usage: call this route at 15s intervals with an offset of 60000 (60s).
If this route is not called within 60 seconds, all your orders will be automatically canceled.

This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-)."
  [timeout ]
  (:data (order-cancel-all-after-with-http-info timeout)))

(defn order-close-position-with-http-info
  "Close a position. [Deprecated, use POST /order with execInst: 'Close']
  If no `price` is specified, a market order will be submitted to close the whole of your position. This will also close all other open orders in this symbol."
  ([symbol ] (order-close-position-with-http-info symbol nil))
  ([symbol {:keys [price ]}]
   (call-api "/order/closePosition" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"symbol" symbol "price" price }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiKey" "apiNonce" "apiSignature"]})))

(defn order-close-position
  "Close a position. [Deprecated, use POST /order with execInst: 'Close']
  If no `price` is specified, a market order will be submitted to close the whole of your position. This will also close all other open orders in this symbol."
  ([symbol ] (order-close-position symbol nil))
  ([symbol optional-params]
   (:data (order-close-position-with-http-info symbol optional-params))))

(defn order-get-orders-with-http-info
  "Get your orders.
  To get open orders only, send {\"open\": true} in the filter param.

See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\">the FIX Spec</a> for explanations of these fields."
  ([] (order-get-orders-with-http-info nil))
  ([{:keys [symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/order" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiKey" "apiNonce" "apiSignature"]})))

(defn order-get-orders
  "Get your orders.
  To get open orders only, send {\"open\": true} in the filter param.

See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\">the FIX Spec</a> for explanations of these fields."
  ([] (order-get-orders nil))
  ([optional-params]
   (:data (order-get-orders-with-http-info optional-params))))

(defn order-new-with-http-info
  "Create a new order.
  ## Placing Orders

This endpoint is used for placing orders. See individual fields below for more details on their use.

#### Order Types

All orders require a `symbol`. All other fields are optional except when otherwise specified.

These are the valid `ordType`s:

* **Limit**: The default order type. Specify an `orderQty` and `price`.
* **Market**: A traditional Market order. A Market order will execute until filled or your bankruptcy price is reached, at
  which point it will cancel.
* **MarketWithLeftOverAsLimit**: A market order that, after eating through the order book as far as
  permitted by available margin, will become a limit order. The difference between this type and `Market` only
  affects the behavior in thin books. Upon reaching the deepest possible price, if there is quantity left over,
  a `Market` order will cancel the remaining quantity. `MarketWithLeftOverAsLimit` will keep the remaining
  quantity in the books as a `Limit`.
* **Stop**: A Stop Market order. Specify an `orderQty` and `stopPx`. When the `stopPx` is reached, the order will be entered
  into the book.
  * On sell orders, the order will trigger if the triggering price is lower than the `stopPx`. On buys, higher.
  * Note: Stop orders do not consume margin until triggered. Be sure that the required margin is available in your
    account so that it may trigger fully.
  * `Close` Stops don't require an `orderQty`. See Execution Instructions below.
* **StopLimit**: Like a Stop Market, but enters a Limit order instead of a Market order. Specify an `orderQty`, `stopPx`,
  and `price`.
* **MarketIfTouched**: Similar to a Stop, but triggers are done in the opposite direction. Useful for Take Profit orders.
* **LimitIfTouched**: As above; use for Take Profit Limit orders.

#### Execution Instructions

The following `execInst`s are supported. If using multiple, separate with a comma (e.g. `LastPrice,Close`).

* **ParticipateDoNotInitiate**: Also known as a Post-Only order. If this order would have executed on placement,
  it will cancel instead.
* **AllOrNone**: Valid only for hidden orders (`displayQty: 0`). Use to only execute if the entire order would fill.
* **MarkPrice, LastPrice, IndexPrice**: Used by stop and if-touched orders to determine the triggering price.
  Use only one. By default, `'MarkPrice'` is used. Also used for Pegged orders to define the value of `'LastPeg'`.
* **ReduceOnly**: A `'ReduceOnly'` order can only reduce your position, not increase it. If you have a `'ReduceOnly'`
  limit order that rests in the order book while the position is reduced by other orders, then its order quantity will
  be amended down or canceled. If there are multiple `'ReduceOnly'` orders the least agresssive will be amended first.
* **Close**: `'Close'` implies `'ReduceOnly'`. A `'Close'` order will cancel other active limit orders with the same side
  and symbol if the open quantity exceeds the current position. This is useful for stops: by canceling these orders, a
  `'Close'` Stop is ensured to have the margin required to execute, and can only execute up to the full size of your
  position. If not specified, a `'Close'` order has an `orderQty` equal to your current position's size.

#### Linked Orders

Linked Orders are an advanced capability. It is very powerful, but its use requires careful coding and testing.
Please follow this document carefully and use the [Testnet Exchange](https://testnet.bitmex.com) while developing.

BitMEX offers four advanced Linked Order types:

* **OCO**: *One Cancels the Other*. A very flexible version of the standard Stop / Take Profit technique.
  Multiple orders may be linked together using a single `clOrdLinkID`. Send a `contingencyType` of
  `OneCancelsTheOther` on the orders. The first order that fully or partially executes (or activates
  for `Stop` orders) will cancel all other orders with the same `clOrdLinkID`.
* **OTO**: *One Triggers the Other*. Send a `contingencyType` of `'OneTriggersTheOther'` on the primary order and
  then subsequent orders with the same `clOrdLinkID` will be not be triggered until the primary order fully executes.
* **OUOA**: *One Updates the Other Absolute*. Send a `contingencyType` of `'OneUpdatesTheOtherAbsolute'` on the orders. Then
  as one order has a execution, other orders with the same `clOrdLinkID` will have their order quantity amended
  down by the execution quantity.
* **OUOP**: *One Updates the Other Proportional*. Send a `contingencyType` of `'OneUpdatesTheOtherProportional'` on the orders. Then
  as one order has a execution, other orders with the same `clOrdLinkID` will have their order quantity reduced proportionally
  by the fill percentage.

#### Trailing Stops

You may use `pegPriceType` of `'TrailingStopPeg'` to create Trailing Stops. The pegged `stopPx` will move as the market
moves away from the peg, and freeze as the market moves toward it.

To use, combine with `pegOffsetValue` to set the `stopPx` of your order. The peg is set to the triggering price
specified in the `execInst` (default `'MarkPrice'`). Use a negative offset for stop-sell and buy-if-touched orders.

Requires `ordType`: `'Stop', 'StopLimit', 'MarketIfTouched', 'LimitIfTouched'`.

#### Simple Quantities

Send a `simpleOrderQty` instead of an `orderQty` to create an order denominated in the underlying currency.
This is useful for opening up a position with 1 XBT of exposure without having to calculate how many contracts it is.

#### Rate Limits

See the [Bulk Order Documentation](#!/Order/Order_newBulk) if you need to place multiple orders at the same time.
Bulk orders require fewer risk checks in the trading engine and thus are ratelimited at **1/10** the normal rate.

You can also improve your reactivity to market movements while staying under your ratelimit by using the
[Amend](#!/Order/Order_amend) and [Amend Bulk](#!/Order/Order_amendBulk) endpoints. This allows you to stay
in the market and avoids the cancel/replace cycle.

#### Tracking Your Orders

If you want to keep track of order IDs yourself, set a unique `clOrdID` per order.
This `clOrdID` will come back as a property on the order and any related executions (including on the WebSocket),
and can be used to get or cancel the order. Max length is 36 characters."
  ([symbol ] (order-new-with-http-info symbol nil))
  ([symbol {:keys [side simple-order-qty quantity order-qty price display-qty stop-price stop-px cl-ord-id cl-ord-link-id peg-offset-value peg-price-type type ord-type time-in-force exec-inst contingency-type text ]}]
   (call-api "/order" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"symbol" symbol "side" side "simpleOrderQty" simple-order-qty "quantity" quantity "orderQty" order-qty "price" price "displayQty" display-qty "stopPrice" stop-price "stopPx" stop-px "clOrdID" cl-ord-id "clOrdLinkID" cl-ord-link-id "pegOffsetValue" peg-offset-value "pegPriceType" peg-price-type "type" type "ordType" ord-type "timeInForce" time-in-force "execInst" exec-inst "contingencyType" contingency-type "text" text }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiKey" "apiNonce" "apiSignature"]})))

(defn order-new
  "Create a new order.
  ## Placing Orders

This endpoint is used for placing orders. See individual fields below for more details on their use.

#### Order Types

All orders require a `symbol`. All other fields are optional except when otherwise specified.

These are the valid `ordType`s:

* **Limit**: The default order type. Specify an `orderQty` and `price`.
* **Market**: A traditional Market order. A Market order will execute until filled or your bankruptcy price is reached, at
  which point it will cancel.
* **MarketWithLeftOverAsLimit**: A market order that, after eating through the order book as far as
  permitted by available margin, will become a limit order. The difference between this type and `Market` only
  affects the behavior in thin books. Upon reaching the deepest possible price, if there is quantity left over,
  a `Market` order will cancel the remaining quantity. `MarketWithLeftOverAsLimit` will keep the remaining
  quantity in the books as a `Limit`.
* **Stop**: A Stop Market order. Specify an `orderQty` and `stopPx`. When the `stopPx` is reached, the order will be entered
  into the book.
  * On sell orders, the order will trigger if the triggering price is lower than the `stopPx`. On buys, higher.
  * Note: Stop orders do not consume margin until triggered. Be sure that the required margin is available in your
    account so that it may trigger fully.
  * `Close` Stops don't require an `orderQty`. See Execution Instructions below.
* **StopLimit**: Like a Stop Market, but enters a Limit order instead of a Market order. Specify an `orderQty`, `stopPx`,
  and `price`.
* **MarketIfTouched**: Similar to a Stop, but triggers are done in the opposite direction. Useful for Take Profit orders.
* **LimitIfTouched**: As above; use for Take Profit Limit orders.

#### Execution Instructions

The following `execInst`s are supported. If using multiple, separate with a comma (e.g. `LastPrice,Close`).

* **ParticipateDoNotInitiate**: Also known as a Post-Only order. If this order would have executed on placement,
  it will cancel instead.
* **AllOrNone**: Valid only for hidden orders (`displayQty: 0`). Use to only execute if the entire order would fill.
* **MarkPrice, LastPrice, IndexPrice**: Used by stop and if-touched orders to determine the triggering price.
  Use only one. By default, `'MarkPrice'` is used. Also used for Pegged orders to define the value of `'LastPeg'`.
* **ReduceOnly**: A `'ReduceOnly'` order can only reduce your position, not increase it. If you have a `'ReduceOnly'`
  limit order that rests in the order book while the position is reduced by other orders, then its order quantity will
  be amended down or canceled. If there are multiple `'ReduceOnly'` orders the least agresssive will be amended first.
* **Close**: `'Close'` implies `'ReduceOnly'`. A `'Close'` order will cancel other active limit orders with the same side
  and symbol if the open quantity exceeds the current position. This is useful for stops: by canceling these orders, a
  `'Close'` Stop is ensured to have the margin required to execute, and can only execute up to the full size of your
  position. If not specified, a `'Close'` order has an `orderQty` equal to your current position's size.

#### Linked Orders

Linked Orders are an advanced capability. It is very powerful, but its use requires careful coding and testing.
Please follow this document carefully and use the [Testnet Exchange](https://testnet.bitmex.com) while developing.

BitMEX offers four advanced Linked Order types:

* **OCO**: *One Cancels the Other*. A very flexible version of the standard Stop / Take Profit technique.
  Multiple orders may be linked together using a single `clOrdLinkID`. Send a `contingencyType` of
  `OneCancelsTheOther` on the orders. The first order that fully or partially executes (or activates
  for `Stop` orders) will cancel all other orders with the same `clOrdLinkID`.
* **OTO**: *One Triggers the Other*. Send a `contingencyType` of `'OneTriggersTheOther'` on the primary order and
  then subsequent orders with the same `clOrdLinkID` will be not be triggered until the primary order fully executes.
* **OUOA**: *One Updates the Other Absolute*. Send a `contingencyType` of `'OneUpdatesTheOtherAbsolute'` on the orders. Then
  as one order has a execution, other orders with the same `clOrdLinkID` will have their order quantity amended
  down by the execution quantity.
* **OUOP**: *One Updates the Other Proportional*. Send a `contingencyType` of `'OneUpdatesTheOtherProportional'` on the orders. Then
  as one order has a execution, other orders with the same `clOrdLinkID` will have their order quantity reduced proportionally
  by the fill percentage.

#### Trailing Stops

You may use `pegPriceType` of `'TrailingStopPeg'` to create Trailing Stops. The pegged `stopPx` will move as the market
moves away from the peg, and freeze as the market moves toward it.

To use, combine with `pegOffsetValue` to set the `stopPx` of your order. The peg is set to the triggering price
specified in the `execInst` (default `'MarkPrice'`). Use a negative offset for stop-sell and buy-if-touched orders.

Requires `ordType`: `'Stop', 'StopLimit', 'MarketIfTouched', 'LimitIfTouched'`.

#### Simple Quantities

Send a `simpleOrderQty` instead of an `orderQty` to create an order denominated in the underlying currency.
This is useful for opening up a position with 1 XBT of exposure without having to calculate how many contracts it is.

#### Rate Limits

See the [Bulk Order Documentation](#!/Order/Order_newBulk) if you need to place multiple orders at the same time.
Bulk orders require fewer risk checks in the trading engine and thus are ratelimited at **1/10** the normal rate.

You can also improve your reactivity to market movements while staying under your ratelimit by using the
[Amend](#!/Order/Order_amend) and [Amend Bulk](#!/Order/Order_amendBulk) endpoints. This allows you to stay
in the market and avoids the cancel/replace cycle.

#### Tracking Your Orders

If you want to keep track of order IDs yourself, set a unique `clOrdID` per order.
This `clOrdID` will come back as a property on the order and any related executions (including on the WebSocket),
and can be used to get or cancel the order. Max length is 36 characters."
  ([symbol ] (order-new symbol nil))
  ([symbol optional-params]
   (:data (order-new-with-http-info symbol optional-params))))

(defn order-new-bulk-with-http-info
  "Create multiple new orders for the same symbol.
  This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.

Each individual order object in the array should have the same properties as an individual POST /order call.

This endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX
systems, this endpoint is ratelimited at `ceil(0.1 * orders)`. Submitting 10 orders via a bulk order call
will only count as 1 request, 15 as 2, 32 as 4, and so on.

For now, only `application/json` is supported on this endpoint."
  ([] (order-new-bulk-with-http-info nil))
  ([{:keys [orders ]}]
   (call-api "/order/bulk" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"orders" orders }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiKey" "apiNonce" "apiSignature"]})))

(defn order-new-bulk
  "Create multiple new orders for the same symbol.
  This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.

Each individual order object in the array should have the same properties as an individual POST /order call.

This endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX
systems, this endpoint is ratelimited at `ceil(0.1 * orders)`. Submitting 10 orders via a bulk order call
will only count as 1 request, 15 as 2, 32 as 4, and so on.

For now, only `application/json` is supported on this endpoint."
  ([] (order-new-bulk nil))
  ([optional-params]
   (:data (order-new-bulk-with-http-info optional-params))))

