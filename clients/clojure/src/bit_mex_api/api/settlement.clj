(ns bit-mex-api.api.settlement
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn settlement-get-with-http-info
  "Get settlement history."
  ([] (settlement-get-with-http-info nil))
  ([{:keys [symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/settlement" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn settlement-get
  "Get settlement history."
  ([] (settlement-get nil))
  ([optional-params]
   (:data (settlement-get-with-http-info optional-params))))

