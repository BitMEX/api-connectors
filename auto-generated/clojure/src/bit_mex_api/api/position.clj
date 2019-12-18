(ns bit-mex-api.api.position
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn position-get-with-http-info
  "Get your positions.
  This endpoint is used for retrieving position information. The fields largely follow the [FIX spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html) definitions. Some selected fields are explained in more detail below.

The fields _account_, _symbol_, _currency_ are unique to each position and form its key.

- **account**: Your unique account ID.
- **symbol**: The contract for this position.
- **currency**: The margin currency for this position.
- **underlying**: Meta data of the _symbol_.
- **quoteCurrency**: Meta data of the _symbol_, All prices are in the _quoteCurrency_
- **commission**: The maximum of the maker, taker, and settlement fee.
- **initMarginReq**: The initial margin requirement. This will be at least the symbol's default initial maintenance margin, but can be higher if you choose lower leverage.
- **maintMarginReq**: The maintenance margin requirement. This will be at least the symbol's default maintenance maintenance margin, but can be higher if you choose a higher risk limit.
- **riskLimit**: This is a function of your _maintMarginReq_.
- **leverage**: 1 / initMarginReq.
- **crossMargin**: True/false depending on whether you set cross margin on this position.
- **deleveragePercentile**: Indicates where your position is in the ADL queue.
- **rebalancedPnl**: The value of realised PNL that has transferred to your wallet for this position.
- **prevRealisedPnl**: The value of realised PNL that has transferred to your wallet for this position since the position was closed.
- **currentQty**: The current position amount in contracts.
- **currentCost**: The current cost of the position in the settlement currency of the symbol (_currency_).
- **currentComm**: The current commission of the position in the settlement currency of the symbol (_currency_).
- **realisedCost**: The realised cost of this position calculated with regard to average cost accounting.
- **unrealisedCost**: _currentCost_ - _realisedCost_.
- **grossOpenCost**: The absolute value of your open orders for this symbol.
- **grossOpenPremium**: The amount your bidding above the mark price in the settlement currency of the symbol (_currency_).
- **markPrice**: The mark price of the symbol in _quoteCurrency_.
- **markValue**: The _currentQty_ at the mark price in the settlement currency of the symbol (_currency_).
- **homeNotional**: Value of position in units of _underlying_.
- **foreignNotional**: Value of position in units of _quoteCurrency_.
- **realisedPnl**: The negative of _realisedCost_.
- **unrealisedGrossPnl**: _markValue_ - _unrealisedCost_.
- **unrealisedPnl**: _unrealisedGrossPnl_.
- **liquidationPrice**: Once markPrice reaches this price, this position will be liquidated.
- **bankruptPrice**: Once markPrice reaches this price, this position will have no equity."
  ([] (position-get-with-http-info nil))
  ([{:keys [filter columns count ]}]
   (call-api "/position" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"filter" filter "columns" columns "count" count }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn position-get
  "Get your positions.
  This endpoint is used for retrieving position information. The fields largely follow the [FIX spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html) definitions. Some selected fields are explained in more detail below.

The fields _account_, _symbol_, _currency_ are unique to each position and form its key.

- **account**: Your unique account ID.
- **symbol**: The contract for this position.
- **currency**: The margin currency for this position.
- **underlying**: Meta data of the _symbol_.
- **quoteCurrency**: Meta data of the _symbol_, All prices are in the _quoteCurrency_
- **commission**: The maximum of the maker, taker, and settlement fee.
- **initMarginReq**: The initial margin requirement. This will be at least the symbol's default initial maintenance margin, but can be higher if you choose lower leverage.
- **maintMarginReq**: The maintenance margin requirement. This will be at least the symbol's default maintenance maintenance margin, but can be higher if you choose a higher risk limit.
- **riskLimit**: This is a function of your _maintMarginReq_.
- **leverage**: 1 / initMarginReq.
- **crossMargin**: True/false depending on whether you set cross margin on this position.
- **deleveragePercentile**: Indicates where your position is in the ADL queue.
- **rebalancedPnl**: The value of realised PNL that has transferred to your wallet for this position.
- **prevRealisedPnl**: The value of realised PNL that has transferred to your wallet for this position since the position was closed.
- **currentQty**: The current position amount in contracts.
- **currentCost**: The current cost of the position in the settlement currency of the symbol (_currency_).
- **currentComm**: The current commission of the position in the settlement currency of the symbol (_currency_).
- **realisedCost**: The realised cost of this position calculated with regard to average cost accounting.
- **unrealisedCost**: _currentCost_ - _realisedCost_.
- **grossOpenCost**: The absolute value of your open orders for this symbol.
- **grossOpenPremium**: The amount your bidding above the mark price in the settlement currency of the symbol (_currency_).
- **markPrice**: The mark price of the symbol in _quoteCurrency_.
- **markValue**: The _currentQty_ at the mark price in the settlement currency of the symbol (_currency_).
- **homeNotional**: Value of position in units of _underlying_.
- **foreignNotional**: Value of position in units of _quoteCurrency_.
- **realisedPnl**: The negative of _realisedCost_.
- **unrealisedGrossPnl**: _markValue_ - _unrealisedCost_.
- **unrealisedPnl**: _unrealisedGrossPnl_.
- **liquidationPrice**: Once markPrice reaches this price, this position will be liquidated.
- **bankruptPrice**: Once markPrice reaches this price, this position will have no equity."
  ([] (position-get nil))
  ([optional-params]
   (:data (position-get-with-http-info optional-params))))

(defn position-isolate-margin-with-http-info
  "Enable isolated margin or cross margin per-position."
  ([symbol ] (position-isolate-margin-with-http-info symbol nil))
  ([symbol {:keys [enabled ]}]
   (check-required-params symbol)
   (call-api "/position/isolate" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"symbol" symbol "enabled" enabled }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiExpires" "apiKey" "apiSignature"]})))

(defn position-isolate-margin
  "Enable isolated margin or cross margin per-position."
  ([symbol ] (position-isolate-margin symbol nil))
  ([symbol optional-params]
   (:data (position-isolate-margin-with-http-info symbol optional-params))))

(defn position-transfer-isolated-margin-with-http-info
  "Transfer equity in or out of a position."
  [symbol amount ]
  (check-required-params symbol amount)
  (call-api "/position/transferMargin" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"symbol" symbol "amount" amount }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn position-transfer-isolated-margin
  "Transfer equity in or out of a position."
  [symbol amount ]
  (:data (position-transfer-isolated-margin-with-http-info symbol amount)))

(defn position-update-leverage-with-http-info
  "Choose leverage for a position."
  [symbol leverage ]
  (check-required-params symbol leverage)
  (call-api "/position/leverage" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"symbol" symbol "leverage" leverage }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn position-update-leverage
  "Choose leverage for a position."
  [symbol leverage ]
  (:data (position-update-leverage-with-http-info symbol leverage)))

(defn position-update-risk-limit-with-http-info
  "Update your risk limit."
  [symbol risk-limit ]
  (check-required-params symbol risk-limit)
  (call-api "/position/riskLimit" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"symbol" symbol "riskLimit" risk-limit }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
             :auth-names    ["apiExpires" "apiKey" "apiSignature"]}))

(defn position-update-risk-limit
  "Update your risk limit."
  [symbol risk-limit ]
  (:data (position-update-risk-limit-with-http-info symbol risk-limit)))

