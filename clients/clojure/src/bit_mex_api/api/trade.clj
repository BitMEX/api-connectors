(ns bit-mex-api.api.trade
  (:require [bit-mex-api.core :refer [call-api check-required-params]])
  (:import (java.io File)))

(defn trade-get
  "Get Trades."
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

(defn trade-get-by-date
  "Get trades between two dates. [Deprecated, use GET /trades]"
  ([start-time ] (trade-get-by-date start-time nil))
  ([start-time {:keys [symbol end-time ]}]
   (call-api "/trade/byDate" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))

(defn trade-get-recent
  "Get recent trades. [Deprecated, use GET /trades]"
  ([count ] (trade-get-recent count nil))
  ([count {:keys [symbol ]}]
   (call-api "/trade/recent" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "count" count }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))
