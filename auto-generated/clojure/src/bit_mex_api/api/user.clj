(ns bit-mex-api.api.user
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn user-cancel-pending-withdrawal-with-http-info
  "Cancel pending withdrawal"
  [transact-id ]
  (check-required-params transact-id)
  (call-api "/user/withdrawal" :delete
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"transactID" transact-id }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn user-cancel-pending-withdrawal
  "Cancel pending withdrawal"
  [transact-id ]
  (:data (user-cancel-pending-withdrawal-with-http-info transact-id)))

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

(defn user-create-sub-account-with-http-info
  "Creates a new sub-account."
  [account-name ]
  (check-required-params account-name)
  (call-api "/user/addSubaccount" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"accountName" account-name }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn user-create-sub-account
  "Creates a new sub-account."
  [account-name ]
  (:data (user-create-sub-account-with-http-info account-name)))

(defn user-create-unstaking-requests-with-http-info
  "Create unstaking request"
  [symbol amount ]
  (check-required-params symbol amount)
  (call-api "/user/unstakingRequests" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"symbol" symbol "amount" amount }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn user-create-unstaking-requests
  "Create unstaking request"
  [symbol amount ]
  (:data (user-create-unstaking-requests-with-http-info symbol amount)))

(defn user-delete-unstaking-requests-with-http-info
  "Cancel unstaking request"
  [redemption-id ]
  (check-required-params redemption-id)
  (call-api "/user/unstakingRequests" :delete
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"redemptionID" redemption-id }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn user-delete-unstaking-requests
  "Cancel unstaking request"
  [redemption-id ]
  (:data (user-delete-unstaking-requests-with-http-info redemption-id)))

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

(defn user-get-csa-with-http-info
  "Get your account's CSA status."
  []
  (call-api "/user/csa" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn user-get-csa
  "Get your account's CSA status."
  []
  (:data (user-get-csa-with-http-info)))

(defn user-get-deposit-address-with-http-info
  "Get a deposit address."
  [currency network ]
  (check-required-params currency network)
  (call-api "/user/depositAddress" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"currency" currency "network" network }
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn user-get-deposit-address
  "Get a deposit address."
  [currency network ]
  (:data (user-get-deposit-address-with-http-info currency network)))

(defn user-get-deposit-address-information-with-http-info
  "Get a deposit address."
  [currency network ]
  (check-required-params currency network)
  (call-api "/user/depositAddressInformation" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"currency" currency "network" network }
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn user-get-deposit-address-information
  "Get a deposit address."
  [currency network ]
  (:data (user-get-deposit-address-information-with-http-info currency network)))

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
  ([] (user-get-quote-fill-ratio-with-http-info nil))
  ([{:keys [target-account-id ]}]
   (call-api "/user/quoteFillRatio" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"targetAccountId" target-account-id }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn user-get-quote-fill-ratio
  "Get 7 days worth of Quote Fill Ratio statistics."
  ([] (user-get-quote-fill-ratio nil))
  ([optional-params]
   (:data (user-get-quote-fill-ratio-with-http-info optional-params))))

(defn user-get-quote-value-ratio-with-http-info
  "Get Quote Value Ratio statistics over the last 3 days"
  ([] (user-get-quote-value-ratio-with-http-info nil))
  ([{:keys [target-account-id ]}]
   (call-api "/user/quoteValueRatio" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"targetAccountId" target-account-id }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn user-get-quote-value-ratio
  "Get Quote Value Ratio statistics over the last 3 days"
  ([] (user-get-quote-value-ratio nil))
  ([optional-params]
   (:data (user-get-quote-value-ratio-with-http-info optional-params))))

(defn user-get-staking-with-http-info
  "Get the current user staking amount."
  ([] (user-get-staking-with-http-info nil))
  ([{:keys [currency ]}]
   (call-api "/user/staking" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"currency" currency }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn user-get-staking
  "Get the current user staking amount."
  ([] (user-get-staking nil))
  ([optional-params]
   (:data (user-get-staking-with-http-info optional-params))))

(defn user-get-staking-instruments-with-http-info
  "List staking instruments"
  ([] (user-get-staking-instruments-with-http-info nil))
  ([{:keys [symbol currency ]}]
   (call-api "/user/staking/instruments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "currency" currency }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn user-get-staking-instruments
  "List staking instruments"
  ([] (user-get-staking-instruments nil))
  ([optional-params]
   (:data (user-get-staking-instruments-with-http-info optional-params))))

(defn user-get-staking-tiers-with-http-info
  "List staking tiers for a given currency"
  [currency ]
  (check-required-params currency)
  (call-api "/user/staking/tiers" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"currency" currency }
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    []}))

(defn user-get-staking-tiers
  "List staking tiers for a given currency"
  [currency ]
  (:data (user-get-staking-tiers-with-http-info currency)))

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

(defn user-get-unstaking-requests-with-http-info
  "Get the current user unstaking requests"
  [status ]
  (check-required-params status)
  (call-api "/user/unstakingRequests" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"status" status }
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn user-get-unstaking-requests
  "Get the current user unstaking requests"
  [status ]
  (:data (user-get-unstaking-requests-with-http-info status)))

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
  ([{:keys [currency count start target-account-id reverse ]}]
   (call-api "/user/walletHistory" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"currency" currency "count" count "start" start "targetAccountId" target-account-id "reverse" reverse }
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
  "Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
  Provides an aggregated view of transactions, by transaction type, over a specific time period."
  ([] (user-get-wallet-summary-with-http-info nil))
  ([{:keys [currency start-time end-time ]}]
   (call-api "/user/walletSummary" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"currency" currency "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn user-get-wallet-summary
  "Get a summary of all of your wallet transactions (deposits, withdrawals, PNL).
  Provides an aggregated view of transactions, by transaction type, over a specific time period."
  ([] (user-get-wallet-summary nil))
  ([optional-params]
   (:data (user-get-wallet-summary-with-http-info optional-params))))

(defn user-get-wallet-transfer-accounts-with-http-info
  "Get the list of accounts you can transfer funds between."
  []
  (call-api "/user/getWalletTransferAccounts" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn user-get-wallet-transfer-accounts
  "Get the list of accounts you can transfer funds between."
  []
  (:data (user-get-wallet-transfer-accounts-with-http-info)))

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

(defn user-request-withdrawal-with-http-info
  "Request a withdrawal to an external wallet.
  This will send a confirmation email to the email address on record."
  ([currency network amount ] (user-request-withdrawal-with-http-info currency network amount nil))
  ([currency network amount {:keys [otp-token address memo address-id target-user-id fee text ]}]
   (check-required-params currency network amount)
   (call-api "/user/requestWithdrawal" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"otpToken" otp-token "currency" currency "network" network "amount" amount "address" address "memo" memo "addressId" address-id "targetUserId" target-user-id "fee" fee "text" text }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn user-request-withdrawal
  "Request a withdrawal to an external wallet.
  This will send a confirmation email to the email address on record."
  ([currency network amount ] (user-request-withdrawal currency network amount nil))
  ([currency network amount optional-params]
   (:data (user-request-withdrawal-with-http-info currency network amount optional-params))))

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

(defn user-update-sub-account-with-http-info
  "Updates the sub-account name."
  [target-account-id account-name ]
  (check-required-params target-account-id account-name)
  (call-api "/user/updateSubaccount" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"targetAccountId" target-account-id "accountName" account-name }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn user-update-sub-account
  "Updates the sub-account name."
  [target-account-id account-name ]
  (:data (user-update-sub-account-with-http-info target-account-id account-name)))

(defn user-wallet-transfer-with-http-info
  "Execute a transfer to a paired account.
  This will send a confirmation email to the email address on record."
  ([currency amount target-account-id ] (user-wallet-transfer-with-http-info currency amount target-account-id nil))
  ([currency amount target-account-id {:keys [from-account-id ]}]
   (check-required-params currency amount target-account-id)
   (call-api "/user/walletTransfer" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"currency" currency "amount" amount "fromAccountId" from-account-id "targetAccountId" target-account-id }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn user-wallet-transfer
  "Execute a transfer to a paired account.
  This will send a confirmation email to the email address on record."
  ([currency amount target-account-id ] (user-wallet-transfer currency amount target-account-id nil))
  ([currency amount target-account-id optional-params]
   (:data (user-wallet-transfer-with-http-info currency amount target-account-id optional-params))))

