(ns bit-mex-api.api.address
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn address-get-with-http-info
  "Get your addresses."
  []
  (call-api "/address" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn address-get
  "Get your addresses."
  []
  (:data (address-get-with-http-info)))

(defn address-new-with-http-info
  "Creates a new saved address."
  ([currency network address name ] (address-new-with-http-info currency network address name nil))
  ([currency network address name {:keys [note skip-confirm skip2-fa ]}]
   (check-required-params currency network address name)
   (call-api "/address" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"currency" currency "network" network "address" address "name" name "note" note "skipConfirm" skip-confirm "skip2FA" skip2-fa }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn address-new
  "Creates a new saved address."
  ([currency network address name ] (address-new currency network address name nil))
  ([currency network address name optional-params]
   (:data (address-new-with-http-info currency network address name optional-params))))

