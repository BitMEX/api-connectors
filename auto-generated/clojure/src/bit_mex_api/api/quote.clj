(ns bit-mex-api.api.quote
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn quote-get-with-http-info
  "Get Quotes."
  ([] (quote-get-with-http-info nil))
  ([{:keys [symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/quote" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn quote-get
  "Get Quotes."
  ([] (quote-get nil))
  ([optional-params]
   (:data (quote-get-with-http-info optional-params))))

(defn quote-get-bucketed-with-http-info
  "Get previous quotes in time buckets."
  ([] (quote-get-bucketed-with-http-info nil))
  ([{:keys [bin-size partial symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/quote/bucketed" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"binSize" bin-size "partial" partial "symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn quote-get-bucketed
  "Get previous quotes in time buckets."
  ([] (quote-get-bucketed nil))
  ([optional-params]
   (:data (quote-get-bucketed-with-http-info optional-params))))

