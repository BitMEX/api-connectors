(ns bit-mex-api.api.announcement
  (:require [bit-mex-api.core :refer [call-api check-required-params]])
  (:import (java.io File)))

(defn announcement-get
  "Get site announcements."
  ([] (announcement-get nil))
  ([{:keys [columns ]}]
   (call-api "/announcement" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"columns" columns }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))

(defn announcement-get-urgent
  "Get urgent (banner) announcements."
  []
  (call-api "/announcement/urgent" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]}))
