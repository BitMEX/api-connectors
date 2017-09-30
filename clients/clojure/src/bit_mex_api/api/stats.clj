(ns bit-mex-api.api.stats
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn stats-get-with-http-info
  "Get exchange-wide and per-series turnover and volume statistics."
  []
  (call-api "/stats" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn stats-get
  "Get exchange-wide and per-series turnover and volume statistics."
  []
  (:data (stats-get-with-http-info)))

(defn stats-history-with-http-info
  "Get historical exchange-wide and per-series turnover and volume statistics."
  []
  (call-api "/stats/history" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn stats-history
  "Get historical exchange-wide and per-series turnover and volume statistics."
  []
  (:data (stats-history-with-http-info)))

(defn stats-history-usd-with-http-info
  "Get a summary of exchange statistics in USD."
  []
  (call-api "/stats/historyUSD" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn stats-history-usd
  "Get a summary of exchange statistics in USD."
  []
  (:data (stats-history-usd-with-http-info)))

