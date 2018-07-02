(ns bit-mex-api.api.schema
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn schema-get-with-http-info
  "Get model schemata for data objects returned by this API."
  ([] (schema-get-with-http-info nil))
  ([{:keys [model ]}]
   (call-api "/schema" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"model" model }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn schema-get
  "Get model schemata for data objects returned by this API."
  ([] (schema-get nil))
  ([optional-params]
   (:data (schema-get-with-http-info optional-params))))

(defn schema-websocket-help-with-http-info
  "Returns help text & subject list for websocket usage."
  []
  (call-api "/schema/websocketHelp" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn schema-websocket-help
  "Returns help text & subject list for websocket usage."
  []
  (:data (schema-websocket-help-with-http-info)))

