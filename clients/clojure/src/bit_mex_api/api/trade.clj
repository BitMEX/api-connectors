(ns bit-mex-api.api.trade
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn trade-get-with-http-info
  "Get Trades.
  Please note that indices (symbols starting with `.`) post trades at intervals to the trade feed. These have a `size` of 0 and are used only to indicate a changing price.

See [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AE_6569.html) for explanations of these fields."
  ([] (trade-get-with-http-info nil))
  ([{:keys [symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/trade" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn trade-get
  "Get Trades.
  Please note that indices (symbols starting with `.`) post trades at intervals to the trade feed. These have a `size` of 0 and are used only to indicate a changing price.

See [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AE_6569.html) for explanations of these fields."
  ([] (trade-get nil))
  ([optional-params]
   (:data (trade-get-with-http-info optional-params))))

(defn trade-get-bucketed-with-http-info
  "Get previous trades in time buckets."
  ([] (trade-get-bucketed-with-http-info nil))
  ([{:keys [bin-size partial symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/trade/bucketed" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"binSize" bin-size "partial" partial "symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn trade-get-bucketed
  "Get previous trades in time buckets."
  ([] (trade-get-bucketed nil))
  ([optional-params]
   (:data (trade-get-bucketed-with-http-info optional-params))))

