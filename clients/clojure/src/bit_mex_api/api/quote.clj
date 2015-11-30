(ns bit-mex-api.api.quote
  (:require [bit-mex-api.core :refer [call-api check-required-params]])
  (:import (java.io File)))

(defn quote-get
  "Get Quotes."
  ([] (quote-get nil))
  ([{:keys [symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/quote" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))

(defn quote-get-bucketed
  "Get previous quotes in time buckets."
  ([] (quote-get-bucketed nil))
  ([{:keys [bin-size symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/quote/bucketed" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"binSize" bin-size "symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))
