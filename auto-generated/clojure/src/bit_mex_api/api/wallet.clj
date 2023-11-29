(ns bit-mex-api.api.wallet
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn wallet-get-assets-config-with-http-info
  "Get Assets Config"
  []
  (call-api "/wallet/assets" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn wallet-get-assets-config
  "Get Assets Config"
  []
  (:data (wallet-get-assets-config-with-http-info)))

(defn wallet-get-networks-config-with-http-info
  "Get Networks Config"
  []
  (call-api "/wallet/networks" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn wallet-get-networks-config
  "Get Networks Config"
  []
  (:data (wallet-get-networks-config-with-http-info)))

