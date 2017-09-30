(ns bit-mex-api.api.execution
  (:require [bit-mex-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn execution-get-with-http-info
  "Get all raw executions for your account.
  This returns all raw transactions, which includes order opening and cancelation, and order status
changes. It can be quite noisy. More focused information is available at `/execution/tradeHistory`.

You may also use the `filter` param to target your query. Specify an array as a filter value, such as
`{\"execType\": [\"Settlement\", \"Trade\"]}` to filter on multiple values.

See [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_8_8.html) for explanations of these fields."
  ([] (execution-get-with-http-info nil))
  ([{:keys [symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/execution" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiKey" "apiNonce" "apiSignature"]})))

(defn execution-get
  "Get all raw executions for your account.
  This returns all raw transactions, which includes order opening and cancelation, and order status
changes. It can be quite noisy. More focused information is available at `/execution/tradeHistory`.

You may also use the `filter` param to target your query. Specify an array as a filter value, such as
`{\"execType\": [\"Settlement\", \"Trade\"]}` to filter on multiple values.

See [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_8_8.html) for explanations of these fields."
  ([] (execution-get nil))
  ([optional-params]
   (:data (execution-get-with-http-info optional-params))))

(defn execution-get-trade-history-with-http-info
  "Get all balance-affecting executions. This includes each trade, insurance charge, and settlement."
  ([] (execution-get-trade-history-with-http-info nil))
  ([{:keys [symbol filter columns count start reverse start-time end-time ]}]
   (call-api "/execution/tradeHistory" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"symbol" symbol "filter" filter "columns" columns "count" count "start" start "reverse" reverse "startTime" start-time "endTime" end-time }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]
              :auth-names    ["apiKey" "apiNonce" "apiSignature"]})))

(defn execution-get-trade-history
  "Get all balance-affecting executions. This includes each trade, insurance charge, and settlement."
  ([] (execution-get-trade-history nil))
  ([optional-params]
   (:data (execution-get-trade-history-with-http-info optional-params))))

