(ns bit-mex-api.api.user
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn user-cancel-withdrawal-with-http-info
  "Cancel a withdrawal."
  [token ]
  (check-required-params token)
  (call-api "/user/cancelWithdrawal" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"token" token }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn user-cancel-withdrawal
  "Cancel a withdrawal."
  [token ]
  (:data (user-cancel-withdrawal-with-http-info token)))

(defn user-check-referral-code-with-http-info
  "Check if a referral code is valid.
  If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404 or 451 if invalid."
  ([] (user-check-referral-code-with-http-info nil))
  ([{:keys [referral-code ]}]
   (call-api "/user/checkReferralCode" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"referralCode" referral-code }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn user-check-referral-code
  "Check if a referral code is valid.
  If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404 or 451 if invalid."
  ([] (user-check-referral-code nil))
  ([optional-params]
   (:data (user-check-referral-code-with-http-info optional-params))))

(defn user-communication-token-with-http-info
  "Register your communication token for mobile clients"
  [token platform-agent ]
  (check-required-params token platform-agent)
  (call-api "/user/communicationToken" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"token" token "platformAgent" platform-agent }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn user-communication-token
  "Register your communication token for mobile clients"
  [token platform-agent ]
  (:data (user-communication-token-with-http-info token platform-agent)))

(defn user-confirm-with-http-info
  "Confirm your email address with a token."
  [token ]
  (check-required-params token)
  (call-api "/user/confirmEmail" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"token" token }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn user-confirm
  "Confirm your email address with a token."
  [token ]
  (:data (user-confirm-with-http-info token)))

(defn user-confirm-withdrawal-with-http-info
  "Confirm a withdrawal."
  [token ]
  (check-required-params token)
  (call-api "/user/confirmWithdrawal" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"token" token }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn user-confirm-withdrawal
  "Confirm a withdrawal."
  [token ]
  (:data (user-confirm-withdrawal-with-http-info token)))

(defn user-get-with-http-info
  "Get your user model."
  []
  (call-api "/user" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn user-get
  "Get your user model."
  []
  (:data (user-get-with-http-info)))

(defn user-get-affiliate-status-with-http-info
  "Get your current affiliate/referral status."
  ([] (user-get-affiliate-status-with-http-info nil))
  ([{:keys [currency ]}]
   (call-api "/user/affiliateStatus" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"currency" currency }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn user-get-affiliate-status
  "Get your current affiliate/referral status."
  ([] (user-get-affiliate-status nil))
  ([optional-params]
   (:data (user-get-affiliate-status-with-http-info optional-params))))

(defn user-get-commission-with-http-info
  "Get your account's commission status."
  []
  (call-api "/user/commission" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn user-get-commission
  "Get your account's commission status."
  []
  (:data (user-get-commission-with-http-info)))

(defn user-get-deposit-address-with-http-info
  "Get a deposit address."
  ([] (user-get-deposit-address-with-http-info nil))
  ([{:keys [currency ]}]
   (call-api "/user/depositAddress" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"currency" currency }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn user-get-deposit-address
  "Get a deposit address."
  ([] (user-get-deposit-address nil))
  ([optional-params]
   (:data (user-get-deposit-address-with-http-info optional-params))))

(defn user-get-execution-history-with-http-info
  "Get the execution history by day."
  [symbol timestamp ]
  (check-required-params symbol timestamp)
  (call-api "/user/executionHistory" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"symbol" symbol "timestamp" timestamp }
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn user-get-execution-history
  "Get the execution history by day."
  [symbol timestamp ]
  (:data (user-get-execution-history-with-http-info symbol timestamp)))

(defn user-get-margin-with-http-info
  "Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies."
  ([] (user-get-margin-with-http-info nil))
  ([{:keys [currency ]}]
   (call-api "/user/margin" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"currency" currency }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn user-get-margin
  "Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies."
  ([] (user-get-margin nil))
  ([optional-params]
   (:data (user-get-margin-with-http-info optional-params))))

(defn user-get-quote-fill-ratio-with-http-info
  "Get 7 days worth of Quote Fill Ratio statistics."
  []
  (call-api "/user/quoteFillRatio" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn user-get-quote-fill-ratio
  "Get 7 days worth of Quote Fill Ratio statistics."
  []
  (:data (user-get-quote-fill-ratio-with-http-info)))

(defn user-get-quote-value-ratio-with-http-info
  "Get Quote Value Ratio statistics over the last 3 days"
  []
  (call-api "/user/quoteValueRatio" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn user-get-quote-value-ratio
  "Get Quote Value Ratio statistics over the last 3 days"
  []
  (:data (user-get-quote-value-ratio-with-http-info)))

(defn user-get-trading-volume-with-http-info
  "Get your 30 days USD average trading volume"
  []
  (call-api "/user/tradingVolume" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn user-get-trading-volume
  "Get your 30 days USD average trading volume"
  []
  (:data (user-get-trading-volume-with-http-info)))

(defn user-get-wallet-with-http-info
  "Get your current wallet information."
  ([] (user-get-wallet-with-http-info nil))
  ([{:keys [currency ]}]
   (call-api "/user/wallet" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"currency" currency }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn user-get-wallet
  "Get your current wallet information."
  ([] (user-get-wallet nil))
  ([optional-params]
   (:data (user-get-wallet-with-http-info optional-params))))

(defn user-get-wallet-history-with-http-info
  "Get a history of all of your wallet transactions (deposits, withdrawals, PNL)."
  ([] (user-get-wallet-history-with-http-info nil))
  ([{:keys [currency count start ]}]
   (call-api "/user/walletHistory" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"currency" currency "count" count "start" start }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn user-get-wallet-history
  "Get a history of all of your wallet transactions (deposits, withdrawals, PNL)."
  ([] (user-get-wallet-history nil))
  ([optional-params]
   (:data (user-get-wallet-history-with-http-info optional-params))))

(defn user-get-wallet-summary-with-http-info
  "Get a summary of all of your wallet transactions (deposits, withdrawals, PNL)."
  ([] (user-get-wallet-summary-with-http-info nil))
  ([{:keys [currency ]}]
   (call-api "/user/walletSummary" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"currency" currency }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn user-get-wallet-summary
  "Get a summary of all of your wallet transactions (deposits, withdrawals, PNL)."
  ([] (user-get-wallet-summary nil))
  ([optional-params]
   (:data (user-get-wallet-summary-with-http-info optional-params))))

(defn user-logout-with-http-info
  "Log out of BitMEX."
  []
  (call-api "/user/logout" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn user-logout
  "Log out of BitMEX."
  []
  (:data (user-logout-with-http-info)))

(defn user-min-withdrawal-fee-with-http-info
  "Get the minimum, maximum, and recommended withdrawal fees for a currency.
  This is changed based on network conditions to ensure timely withdrawals. During network congestion, this may be high. The fee is returned in the same currency.

The \"fee\" field is the recommended fee for fast confirmation on the blockchain."
  ([] (user-min-withdrawal-fee-with-http-info nil))
  ([{:keys [currency amount ]}]
   (call-api "/user/minWithdrawalFee" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"currency" currency "amount" amount }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    []})))

(defn user-min-withdrawal-fee
  "Get the minimum, maximum, and recommended withdrawal fees for a currency.
  This is changed based on network conditions to ensure timely withdrawals. During network congestion, this may be high. The fee is returned in the same currency.

The \"fee\" field is the recommended fee for fast confirmation on the blockchain."
  ([] (user-min-withdrawal-fee nil))
  ([optional-params]
   (:data (user-min-withdrawal-fee-with-http-info optional-params))))

(defn user-request-withdrawal-with-http-info
  "Request a withdrawal to an external wallet.
  This will send a confirmation email to the email address on record."
  ([currency amount ] (user-request-withdrawal-with-http-info currency amount nil))
  ([currency amount {:keys [otp-token address address-id target-user-id fee text ]}]
   (check-required-params currency amount)
   (call-api "/user/requestWithdrawal" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"otpToken" otp-token "currency" currency "amount" amount "address" address "addressId" address-id "targetUserId" target-user-id "fee" fee "text" text }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn user-request-withdrawal
  "Request a withdrawal to an external wallet.
  This will send a confirmation email to the email address on record."
  ([currency amount ] (user-request-withdrawal currency amount nil))
  ([currency amount optional-params]
   (:data (user-request-withdrawal-with-http-info currency amount optional-params))))

(defn user-save-preferences-with-http-info
  "Save user preferences."
  ([prefs ] (user-save-preferences-with-http-info prefs nil))
  ([prefs {:keys [overwrite ]}]
   (check-required-params prefs)
   (call-api "/user/preferences" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"prefs" prefs "overwrite" overwrite }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn user-save-preferences
  "Save user preferences."
  ([prefs ] (user-save-preferences prefs nil))
  ([prefs optional-params]
   (:data (user-save-preferences-with-http-info prefs optional-params))))

