(ns bit-mex-api.api.user-affiliates
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn user-affiliates-get-with-http-info
  "Get user's affiliates to a given depth"
  ([] (user-affiliates-get-with-http-info nil))
  ([{:keys [depth target-account-id select-user-id ]}]
   (call-api "/userAffiliates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"depth" depth "targetAccountId" target-account-id "selectUserId" select-user-id }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn user-affiliates-get
  "Get user's affiliates to a given depth"
  ([] (user-affiliates-get nil))
  ([optional-params]
   (:data (user-affiliates-get-with-http-info optional-params))))

