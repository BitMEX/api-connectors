(ns bit-mex-api.api.announcement
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn announcement-get-with-http-info
  "Get site announcements."
  ([] (announcement-get-with-http-info nil))
  ([{:keys [columns ]}]
   (call-api "/announcement" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"columns" columns }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn announcement-get
  "Get site announcements."
  ([] (announcement-get nil))
  ([optional-params]
   (:data (announcement-get-with-http-info optional-params))))

(defn announcement-get-urgent-with-http-info
  "Get urgent (banner) announcements."
  []
  (call-api "/announcement/urgent" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiKey" "apiNonce" "apiSignature"]}))

(defn announcement-get-urgent
  "Get urgent (banner) announcements."
  []
  (:data (announcement-get-urgent-with-http-info)))

