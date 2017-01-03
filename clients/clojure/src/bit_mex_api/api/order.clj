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
              :auth-names    []})))

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
  "Amend multiple orders.
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
              :auth-names    []})))

(defn order-amend-bulk
  "Amend multiple orders.
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
              :auth-names    []})))

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
              :auth-names    []})))

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
             :auth-names    []}))

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
              :auth-names    []})))

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
              :auth-names    []})))

(defn order-get-orders
  "Get your orders.
  To get open orders only, send {\"open\": true} in the filter param.

See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\">the FIX Spec</a> for explanations of these fields."
  ([] (order-get-orders nil))
  ([optional-params]
   (:data (order-get-orders-with-http-info optional-params))))

(defn order-new-with-http-info
  "Create a new order.
  This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.

If no order type is provided, BitMEX will assume 'Limit'.
Be very careful with 'Market' and 'Stop' orders as you may be filled at an unfavourable price.

You can submit bulk orders by POSTing an array of orders to `/api/v1/order/bulk`. Send a JSON payload
with the shape: `{\"orders\": [{...}, {...}]}`, with each inner object containing the same fields that would be
sent to this endpoint.

A note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order.
This clOrdID will come back as a property on the order and any related executions (including on the WebSocket),
and can be used to get or cancel the order. Max length is 36 characters.

To generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID.
Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix `'bmex_mm_'`
and the UUID `'7fbd6545-bb0c-11e4-a273-6003088a7c04'` creates `'bmex_mm_f71lRbsMEeSic2ADCIp8BA'`.

See the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152)
for an example of how to use and generate clOrdIDs."
  ([symbol ] (order-new-with-http-info symbol nil))
  ([symbol {:keys [side simple-order-qty quantity order-qty price display-qty stop-price stop-px cl-ord-id cl-ord-link-id peg-offset-value peg-price-type type ord-type time-in-force exec-inst contingency-type text ]}]
   (call-api "/order" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"symbol" symbol "side" side "simpleOrderQty" simple-order-qty "quantity" quantity "orderQty" order-qty "price" price "displayQty" display-qty "stopPrice" stop-price "stopPx" stop-px "clOrdID" cl-ord-id "clOrdLinkID" cl-ord-link-id "pegOffsetValue" peg-offset-value "pegPriceType" peg-price-type "type" type "ordType" ord-type "timeInForce" time-in-force "execInst" exec-inst "contingencyType" contingency-type "text" text }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn order-new
  "Create a new order.
  This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.

If no order type is provided, BitMEX will assume 'Limit'.
Be very careful with 'Market' and 'Stop' orders as you may be filled at an unfavourable price.

You can submit bulk orders by POSTing an array of orders to `/api/v1/order/bulk`. Send a JSON payload
with the shape: `{\"orders\": [{...}, {...}]}`, with each inner object containing the same fields that would be
sent to this endpoint.

A note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order.
This clOrdID will come back as a property on the order and any related executions (including on the WebSocket),
and can be used to get or cancel the order. Max length is 36 characters.

To generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID.
Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix `'bmex_mm_'`
and the UUID `'7fbd6545-bb0c-11e4-a273-6003088a7c04'` creates `'bmex_mm_f71lRbsMEeSic2ADCIp8BA'`.

See the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152)
for an example of how to use and generate clOrdIDs."
  ([symbol ] (order-new symbol nil))
  ([symbol optional-params]
   (:data (order-new-with-http-info symbol optional-params))))

(defn order-new-bulk-with-http-info
  "Create multiple new orders.
  This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.

Each individual order object in the array should have the same properties as an individual POST /order call.

This endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX
systems, this endpoint is ratelimited at `ceil(0.5 * orders)`. Submitting 10 orders via a bulk order call
will only count as 5 requests.

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
              :auth-names    []})))

(defn order-new-bulk
  "Create multiple new orders.
  This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.

Each individual order object in the array should have the same properties as an individual POST /order call.

This endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX
systems, this endpoint is ratelimited at `ceil(0.5 * orders)`. Submitting 10 orders via a bulk order call
will only count as 5 requests.

For now, only `application/json` is supported on this endpoint."
  ([] (order-new-bulk nil))
  ([optional-params]
   (:data (order-new-bulk-with-http-info optional-params))))

