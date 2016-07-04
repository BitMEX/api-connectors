(ns bit-mex-api.api.instrument
  (:require [bit-mex-api.core :refer [call-api check-required-params]])
  (:import (java.io File)))

(defn instrument-get
  "Get instruments.
  This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use `/instrument/active` to return active instruments, or use a filter like `{\"state\": \"Open\"}`."
  ([] (instrument-get nil))
  ([{:keys [symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/instrument" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))

(defn instrument-get-active
  "Get all active instruments and instruments that have expired in <24hrs."
  []
  (call-api "/instrument/active" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]}))

(defn instrument-get-active-and-indices
  "Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active."
  []
  (call-api "/instrument/activeAndIndices" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]}))

(defn instrument-get-active-intervals
  "Return all active contract series and interval pairs.
  This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as `[\"BVOL:daily\", \"BVOL:weekly\", \"XBU:daily\", \"XBU:monthly\", ...]`. These identifiers are usable in any query's `symbol` param. The second array is the current resolution of these intervals. Results are mapped at the same index."
  []
  (call-api "/instrument/activeIntervals" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]}))

(defn instrument-get-indices
  "Get all price indices."
  []
  (call-api "/instrument/indices" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]}))
