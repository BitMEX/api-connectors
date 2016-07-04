(ns bit-mex-api.api.funding
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn funding-get-with-http-info
  "Get funding history."
  ([] (funding-get-with-http-info nil))
  ([{:keys [symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/funding" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn funding-get
  "Get funding history."
  ([] (funding-get nil))
  ([optional-params]
   (:data (funding-get-with-http-info optional-params))))

