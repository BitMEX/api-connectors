(ns bit-mex-api.api.order-book
  (:require [bit-mex-api.core :refer [call-api check-required-params]])
  (:import (java.io File)))

(defn order-book-get
  "Get current orderbook [deprecated, use /orderBook/L2]."
  ([symbol ] (order-book-get symbol nil))
  ([symbol {:keys [depth ]}]
   (call-api "/orderBook" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "depth" depth }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))

(defn order-book-get-l2
  "Get current orderbook in vertical format."
  ([symbol ] (order-book-get-l2 symbol nil))
  ([symbol {:keys [depth ]}]
   (call-api "/orderBook/L2" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "depth" depth }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))
