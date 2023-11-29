(ns bit-mex-api.api.guild
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn guild-archive-with-http-info
  "Archive a guild"
  []
  (call-api "/guild/archive" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn guild-archive
  "Archive a guild"
  []
  (:data (guild-archive-with-http-info)))

(defn guild-edit-with-http-info
  "Edit guild new guild"
  ([name emoji pot-distribution-percent pot-distribution-type ] (guild-edit-with-http-info name emoji pot-distribution-percent pot-distribution-type nil))
  ([name emoji pot-distribution-percent pot-distribution-type {:keys [pot-trader-id description twitter discord img-url is-private ]}]
   (check-required-params name emoji pot-distribution-percent pot-distribution-type)
   (call-api "/guild" :put
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"name" name "emoji" emoji "potDistributionPercent" pot-distribution-percent "potDistributionType" pot-distribution-type "potTraderId" pot-trader-id "description" description "twitter" twitter "discord" discord "imgUrl" img-url "isPrivate" is-private }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn guild-edit
  "Edit guild new guild"
  ([name emoji pot-distribution-percent pot-distribution-type ] (guild-edit name emoji pot-distribution-percent pot-distribution-type nil))
  ([name emoji pot-distribution-percent pot-distribution-type optional-params]
   (:data (guild-edit-with-http-info name emoji pot-distribution-percent pot-distribution-type optional-params))))

(defn guild-get-with-http-info
  "Get all guilds"
  []
  (call-api "/guild" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn guild-get
  "Get all guilds"
  []
  (:data (guild-get-with-http-info)))

(defn guild-join-with-http-info
  "Request to Join a private guild or join a public guild"
  [code ]
  (check-required-params code)
  (call-api "/guild/join" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"code" code }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn guild-join
  "Request to Join a private guild or join a public guild"
  [code ]
  (:data (guild-join-with-http-info code)))

(defn guild-kick-with-http-info
  "Kick member from guild"
  [member-user-id ]
  (check-required-params member-user-id)
  (call-api "/guild/kick" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"memberUserId" member-user-id }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn guild-kick
  "Kick member from guild"
  [member-user-id ]
  (:data (guild-kick-with-http-info member-user-id)))

(defn guild-leave-with-http-info
  "Leave guild or cancel guild join request"
  []
  (call-api "/guild/leave" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn guild-leave
  "Leave guild or cancel guild join request"
  []
  (:data (guild-leave-with-http-info)))

(defn guild-new-with-http-info
  "Creates a new guild"
  ([name emoji pot-distribution-percent pot-distribution-type ] (guild-new-with-http-info name emoji pot-distribution-percent pot-distribution-type nil))
  ([name emoji pot-distribution-percent pot-distribution-type {:keys [description twitter discord img-url is-private ]}]
   (check-required-params name emoji pot-distribution-percent pot-distribution-type)
   (call-api "/guild" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"name" name "emoji" emoji "potDistributionPercent" pot-distribution-percent "potDistributionType" pot-distribution-type "description" description "twitter" twitter "discord" discord "imgUrl" img-url "isPrivate" is-private }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn guild-new
  "Creates a new guild"
  ([name emoji pot-distribution-percent pot-distribution-type ] (guild-new name emoji pot-distribution-percent pot-distribution-type nil))
  ([name emoji pot-distribution-percent pot-distribution-type optional-params]
   (:data (guild-new-with-http-info name emoji pot-distribution-percent pot-distribution-type optional-params))))

(defn guild-share-trades-with-http-info
  "Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI"
  [share-trades ]
  (check-required-params share-trades)
  (call-api "/guild/shareTrades" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"shareTrades" share-trades }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn guild-share-trades
  "Toggle share trades for your account, which controls whether your guild members can see your orders and positions in their UI"
  [share-trades ]
  (:data (guild-share-trades-with-http-info share-trades)))

