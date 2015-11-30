(ns bit-mex-api.api.order
  (:require [bit-mex-api.core :refer [call-api check-required-params]])
  (:import (java.io File)))

(defn order-get-orders
  "Get your orders.
  To get open orders only, send {\"open\": true} in the filter param."
  ([] (order-get-orders nil))
  ([{:keys [symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/order" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))

(defn order-new-order
  "Create a new order.
  This endpoint is used for placing orders. Valid order types are 'Limit' and 'StopLimit'. If none is provided, BitMEX will assume a Limit Order.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix 'bmex_mm_' and the UUID '7fbd6545-bb0c-11e4-a273-6003088a7c04' creates 'bmex_mm_f71lRbsMEeSic2ADCIp8BA'.\n\nSee the BitMEX <a href='https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152'>Reference Market Maker</a> for an example of how to use and generate clOrdIDs."
  ([symbol quantity price ] (order-new-order symbol quantity price nil))
  ([symbol quantity price {:keys [time-in-force type stop-price cl-ord-id ]}]
   (call-api "/order" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"symbol" symbol "quantity" quantity "price" price "timeInForce" time-in-force "type" type "stopPrice" stop-price "clOrdID" cl-ord-id }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))

(defn order-cancel-order
  "Cancel order(s). Send multiple order IDs to cancel in bulk.
  Either an orderID or a clOrdID must be provided."
  ([] (order-cancel-order nil))
  ([{:keys [order-id cl-ord-id text ]}]
   (call-api "/order" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"orderID" order-id "clOrdID" cl-ord-id "text" text }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))

(defn order-cancel-all
  "Cancels all of your orders."
  ([] (order-cancel-all nil))
  ([{:keys [symbol filter text ]}]
   (call-api "/order/all" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"symbol" symbol "filter" filter "text" text }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))

(defn order-cancel-all-after
  "Automatically cancel all your orders after a specified timeout.
  Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. <br><br>Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.<br><br>This is also available via <a href=\"https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-\">WebSocket</a>."
  [timeout ]
  (call-api "/order/cancelAllAfter" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"timeout" timeout }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]}))

(defn order-close-position
  "Close a position with a market order.
  If no price is specified, a market order will be submitted to close the entirety of your position. Be careful with market orders as you may not be filled at a favorable price."
  ([symbol ] (order-close-position symbol nil))
  ([symbol {:keys [price ]}]
   (call-api "/order/closePosition" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"symbol" symbol "price" price }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))

(defn order-get-close-out-orders
  "Get open liquidation orders."
  ([] (order-get-close-out-orders nil))
  ([{:keys [filter ]}]
   (call-api "/order/liquidations" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter" filter }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))
