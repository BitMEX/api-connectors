(ns bit-mex-api.api.global-notification
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn global-notification-get-with-http-info
  "Get your current GlobalNotifications.
  This is an upcoming feature and currently does not return data."
  []
  (call-api "/globalNotification" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn global-notification-get
  "Get your current GlobalNotifications.
  This is an upcoming feature and currently does not return data."
  []
  (:data (global-notification-get-with-http-info)))

