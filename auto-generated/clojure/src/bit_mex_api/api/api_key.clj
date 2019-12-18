(ns bit-mex-api.api.api-key
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn a-pi-key-get-with-http-info
  "Get your API Keys."
  ([] (a-pi-key-get-with-http-info nil))
  ([{:keys [reverse ]}]
   (call-api "/apiKey" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"reverse" reverse }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn a-pi-key-get
  "Get your API Keys."
  ([] (a-pi-key-get nil))
  ([optional-params]
   (:data (a-pi-key-get-with-http-info optional-params))))

