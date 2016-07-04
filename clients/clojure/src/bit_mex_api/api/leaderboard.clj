(ns bit-mex-api.api.leaderboard
  (:require [bit-mex-api.core :refer [call-api check-required-params]])
  (:import (java.io File)))

(defn leaderboard-get
  "Get current leaderboard."
  ([] (leaderboard-get nil))
  ([{:keys [method ]}]
   (call-api "/leaderboard" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"method" method }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))
