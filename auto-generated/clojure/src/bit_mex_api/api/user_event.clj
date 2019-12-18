(ns bit-mex-api.api.user-event
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn user-event-get-with-http-info
  "Get your user events"
  ([] (user-event-get-with-http-info nil))
  ([{:keys [count start-id ]}]
   (call-api "/userEvent" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"count" count "startId" start-id }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn user-event-get
  "Get your user events"
  ([] (user-event-get nil))
  ([optional-params]
   (:data (user-event-get-with-http-info optional-params))))

