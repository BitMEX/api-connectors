(ns bit-mex-api.api.notification
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn notification-get-with-http-info
  "Get your current notifications.
  This is an upcoming feature and currently does not return data."
  []
  (call-api "/notification" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiKey" "apiNonce" "apiSignature"]}))

(defn notification-get
  "Get your current notifications.
  This is an upcoming feature and currently does not return data."
  []
  (:data (notification-get-with-http-info)))

