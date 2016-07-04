(ns bit-mex-api.api.insurance
  (:require [bit-mex-api.core :refer [call-api check-required-params]])
  (:import (java.io File)))

(defn insurance-get
  "Get insurance fund history."
  ([] (insurance-get nil))
  ([{:keys [symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/insurance" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))
