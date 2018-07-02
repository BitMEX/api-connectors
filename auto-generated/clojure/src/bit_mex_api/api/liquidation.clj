(ns bit-mex-api.api.liquidation
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn liquidation-get-with-http-info
  "Get liquidation orders."
  ([] (liquidation-get-with-http-info nil))
  ([{:keys [symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/liquidation" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn liquidation-get
  "Get liquidation orders."
  ([] (liquidation-get nil))
  ([optional-params]
   (:data (liquidation-get-with-http-info optional-params))))

