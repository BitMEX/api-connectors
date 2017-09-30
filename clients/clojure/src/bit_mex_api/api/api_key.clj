(ns bit-mex-api.api.api-key
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn a-pi-key-disable-with-http-info
  "Disable an API Key."
  [api-key-id ]
  (call-api "/apiKey/disable" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"apiKeyID" api-key-id }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiKey" "apiNonce" "apiSignature"]}))

(defn a-pi-key-disable
  "Disable an API Key."
  [api-key-id ]
  (:data (a-pi-key-disable-with-http-info api-key-id)))

(defn a-pi-key-enable-with-http-info
  "Enable an API Key."
  [api-key-id ]
  (call-api "/apiKey/enable" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"apiKeyID" api-key-id }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiKey" "apiNonce" "apiSignature"]}))

(defn a-pi-key-enable
  "Enable an API Key."
  [api-key-id ]
  (:data (a-pi-key-enable-with-http-info api-key-id)))

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
              :auth-names    ["apiKey" "apiNonce" "apiSignature"]})))

(defn a-pi-key-get
  "Get your API Keys."
  ([] (a-pi-key-get nil))
  ([optional-params]
   (:data (a-pi-key-get-with-http-info optional-params))))

(defn a-pi-key-new-with-http-info
  "Create a new API Key.
  API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities."
  ([] (a-pi-key-new-with-http-info nil))
  ([{:keys [name cidr permissions enabled token ]}]
   (call-api "/apiKey" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"name" name "cidr" cidr "permissions" permissions "enabled" enabled "token" token }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiKey" "apiNonce" "apiSignature"]})))

(defn a-pi-key-new
  "Create a new API Key.
  API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities."
  ([] (a-pi-key-new nil))
  ([optional-params]
   (:data (a-pi-key-new-with-http-info optional-params))))

(defn a-pi-key-remove-with-http-info
  "Remove an API Key."
  [api-key-id ]
  (call-api "/apiKey" :delete
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"apiKeyID" api-key-id }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiKey" "apiNonce" "apiSignature"]}))

(defn a-pi-key-remove
  "Remove an API Key."
  [api-key-id ]
  (:data (a-pi-key-remove-with-http-info api-key-id)))

