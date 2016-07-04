(ns bit-mex-api.api.trade
  (:require [bit-mex-api.core :refer [call-api check-required-params]])
  (:import (java.io File)))

(defn trade-get
  "Get Trades.
  Please note that indices (symbols starting with `.`) post trades at intervals to the trade feed. These have a `size` of 0 and are used only to indicate a changing price.\n\nSee [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AE_6569.html) for explanations of these fields."
  ([] (trade-get nil))
  ([{:keys [symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/trade" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))

(defn trade-get-bucketed
  "Get previous trades in time buckets."
  ([] (trade-get-bucketed nil))
  ([{:keys [bin-size symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/trade/bucketed" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"binSize" bin-size "symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))
