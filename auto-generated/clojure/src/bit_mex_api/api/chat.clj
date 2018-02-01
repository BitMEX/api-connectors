(ns bit-mex-api.api.chat
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn chat-get-with-http-info
  "Get chat messages."
  ([] (chat-get-with-http-info nil))
  ([{:keys [count start reverse channel-id ]}]
   (call-api "/chat" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"count" count "start" start "reverse" reverse "channelID" channel-id }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn chat-get
  "Get chat messages."
  ([] (chat-get nil))
  ([optional-params]
   (:data (chat-get-with-http-info optional-params))))

(defn chat-get-channels-with-http-info
  "Get available channels."
  []
  (call-api "/chat/channels" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn chat-get-channels
  "Get available channels."
  []
  (:data (chat-get-channels-with-http-info)))

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
  ([message ] (chat-new-with-http-info message nil))
  ([message {:keys [channel-id ]}]
   (call-api "/chat" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"message" message "channelID" channel-id }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiKey" "apiNonce" "apiSignature"]})))

(defn chat-new
  "Send a chat message."
  ([message ] (chat-new message nil))
  ([message optional-params]
   (:data (chat-new-with-http-info message optional-params))))

