(ns bit-mex-api.api.chat
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn chat-get-with-http-info
  "Get chat messages."
  ([] (chat-get-with-http-info nil))
  ([{:keys [count start reverse ]}]
   (call-api "/chat" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"count" count "start" start "reverse" reverse }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn chat-get
  "Get chat messages."
  ([] (chat-get nil))
  ([optional-params]
   (:data (chat-get-with-http-info optional-params))))

(defn chat-get-connected-with-http-info
  "Get connected users.
  Returns an array with browser users in the first position and API users (bots) in the second position."
  []
  (call-api "/chat/connected" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn chat-get-connected
  "Get connected users.
  Returns an array with browser users in the first position and API users (bots) in the second position."
  []
  (:data (chat-get-connected-with-http-info)))

(defn chat-new-with-http-info
  "Send a chat message."
  [message ]
  (call-api "/chat" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"message" message }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn chat-new
  "Send a chat message."
  [message ]
  (:data (chat-new-with-http-info message)))

