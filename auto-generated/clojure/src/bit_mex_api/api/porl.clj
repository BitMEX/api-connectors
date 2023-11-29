(ns bit-mex-api.api.porl
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn porl-get-nonce-with-http-info
  "Get your Proof of Reserves nonce and data.
  ## Proof of Reserves Nonce

This endpoint will return the nonce and associated data needed to validate BitMEX reserves data.

<! TODO link to docs, GitHub, etc >"
  []
  (call-api "/porl/nonce" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn porl-get-nonce
  "Get your Proof of Reserves nonce and data.
  ## Proof of Reserves Nonce

This endpoint will return the nonce and associated data needed to validate BitMEX reserves data.

<! TODO link to docs, GitHub, etc >"
  []
  (:data (porl-get-nonce-with-http-info)))

(defn porl-get-snapshots-with-http-info
  "Get Proof of Reserves historical snapshots"
  []
  (call-api "/porl/snapshots" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn porl-get-snapshots
  "Get Proof of Reserves historical snapshots"
  []
  (:data (porl-get-snapshots-with-http-info)))

