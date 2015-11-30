(ns bit-mex-api.api.position
  (:require [bit-mex-api.core :refer [call-api check-required-params]])
  (:import (java.io File)))

(defn position-find
  "Get your positions."
  ([] (position-find nil))
  ([{:keys [filter columns count ]}]
   (call-api "/position" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter" filter "columns" columns "count" count }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))

(defn position-isolate-margin
  "Toggle isolated (fixed) margin per-position.
  On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off. A position must be open to isolate it."
  ([symbol ] (position-isolate-margin symbol nil))
  ([symbol {:keys [enabled ]}]
   (call-api "/position/isolate" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"symbol" symbol "enabled" enabled }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))

(defn position-transfer-isolated-margin
  "Transfer equity in or out of a position.
  When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold."
  [symbol amount ]
  (call-api "/position/transferMargin" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"symbol" symbol "amount" amount }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]}))
