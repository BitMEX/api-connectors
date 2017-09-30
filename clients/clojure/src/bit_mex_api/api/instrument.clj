(ns bit-mex-api.api.instrument
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn instrument-get-with-http-info
  "Get instruments.
  This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use `/instrument/active` to return active instruments, or use a filter like `{\"state\": \"Open\"}`."
  ([] (instrument-get-with-http-info nil))
  ([{:keys [symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/instrument" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn instrument-get
  "Get instruments.
  This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use `/instrument/active` to return active instruments, or use a filter like `{\"state\": \"Open\"}`."
  ([] (instrument-get nil))
  ([optional-params]
   (:data (instrument-get-with-http-info optional-params))))

(defn instrument-get-active-with-http-info
  "Get all active instruments and instruments that have expired in <24hrs."
  []
  (call-api "/instrument/active" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn instrument-get-active
  "Get all active instruments and instruments that have expired in <24hrs."
  []
  (:data (instrument-get-active-with-http-info)))

(defn instrument-get-active-and-indices-with-http-info
  "Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active."
  []
  (call-api "/instrument/activeAndIndices" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn instrument-get-active-and-indices
  "Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active."
  []
  (:data (instrument-get-active-and-indices-with-http-info)))

(defn instrument-get-active-intervals-with-http-info
  "Return all active contract series and interval pairs.
  This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as `[\"BVOL:daily\", \"BVOL:weekly\", \"XBU:daily\", \"XBU:monthly\", ...]`. These identifiers are usable in any query's `symbol` param. The second array is the current resolution of these intervals. Results are mapped at the same index."
  []
  (call-api "/instrument/activeIntervals" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn instrument-get-active-intervals
  "Return all active contract series and interval pairs.
  This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as `[\"BVOL:daily\", \"BVOL:weekly\", \"XBU:daily\", \"XBU:monthly\", ...]`. These identifiers are usable in any query's `symbol` param. The second array is the current resolution of these intervals. Results are mapped at the same index."
  []
  (:data (instrument-get-active-intervals-with-http-info)))

(defn instrument-get-composite-index-with-http-info
  "Show constituent parts of an index.
  Composite indices are built from multiple external price sources.

Use this endpoint to get the underlying prices of an index. For example, send a `symbol` of `.XBT` to
get the ticks and weights of the constituent exchanges that build the \".XBT\" index.

A tick with reference `\"BMI\"` and weight `null` is the composite index tick."
  ([] (instrument-get-composite-index-with-http-info nil))
  ([{:keys [account symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/instrument/compositeIndex" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"account" account "symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn instrument-get-composite-index
  "Show constituent parts of an index.
  Composite indices are built from multiple external price sources.

Use this endpoint to get the underlying prices of an index. For example, send a `symbol` of `.XBT` to
get the ticks and weights of the constituent exchanges that build the \".XBT\" index.

A tick with reference `\"BMI\"` and weight `null` is the composite index tick."
  ([] (instrument-get-composite-index nil))
  ([optional-params]
   (:data (instrument-get-composite-index-with-http-info optional-params))))

(defn instrument-get-indices-with-http-info
  "Get all price indices."
  []
  (call-api "/instrument/indices" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn instrument-get-indices
  "Get all price indices."
  []
  (:data (instrument-get-indices-with-http-info)))

