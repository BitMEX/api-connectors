(ns bit-mex-api.api.order-book
  (:require [bit-mex-api.core :refer [call-api check-required-params]])
  (:import (java.io File)))

(defn order-book-get-order-book
  "Get current orderbook."
  ([symbol ] (order-book-get-order-book symbol nil))
  ([symbol {:keys [depth ]}]
   (call-api "/orderBook" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "depth" depth }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))
