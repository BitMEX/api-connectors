exports.models = {
  "Quote": {
  "id" : "Quote",
  "name" : "",
  "properties" : {
    "askSize" : {
      "type" : "number",
      "format" : "double"
    },
    "askPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "timestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "bidPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "symbol" : {
      "type" : "string"
    },
    "id" : {
      "type" : "number",
      "format" : "double"
    },
    "bidSize" : {
      "type" : "number",
      "format" : "double"
    }
  }
},

  "Stats": {
  "id" : "Stats",
  "name" : "",
  "required" : [ "rootSymbol" ],
  "properties" : {
    "openValue" : {
      "type" : "number",
      "format" : "double"
    },
    "volume24h" : {
      "type" : "number",
      "format" : "double"
    },
    "openInterest" : {
      "type" : "number",
      "format" : "double"
    },
    "currency" : {
      "type" : "string"
    },
    "turnover24h" : {
      "type" : "number",
      "format" : "double"
    },
    "rootSymbol" : {
      "type" : "string"
    }
  }
},

  "Transaction": {
  "id" : "Transaction",
  "name" : "",
  "required" : [ "transactID" ],
  "properties" : {
    "timestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "text" : {
      "type" : "string"
    },
    "amount" : {
      "type" : "number",
      "format" : "double"
    },
    "transactID" : {
      "type" : "string"
    },
    "transactType" : {
      "type" : "string"
    },
    "currency" : {
      "type" : "string"
    },
    "address" : {
      "type" : "string"
    },
    "transactStatus" : {
      "type" : "string"
    },
    "account" : {
      "type" : "number",
      "format" : "double"
    },
    "transactTime" : {
      "type" : "string",
      "format" : "date-time"
    },
    "tx" : {
      "type" : "string"
    }
  }
},

  "ApiKey": {
  "id" : "ApiKey",
  "name" : "",
  "required" : [ "id", "secret", "name", "nonce", "userId" ],
  "properties" : {
    "secret" : {
      "type" : "string"
    },
    "name" : {
      "type" : "string"
    },
    "nonce" : {
      "type" : "number",
      "format" : "double"
    },
    "cidr" : {
      "type" : "string"
    },
    "enabled" : {
      "type" : "boolean"
    },
    "id" : {
      "type" : "string"
    },
    "userId" : {
      "type" : "number",
      "format" : "double"
    },
    "constriants" : {
      "type" : "object"
    }
  }
},

  "AccessToken": {
  "id" : "AccessToken",
  "name" : "",
  "required" : [ "id" ],
  "properties" : {
    "id" : {
      "type" : "string"
    },
    "ttl" : {
      "type" : "number",
      "format" : "double",
      "description" : "time to live in seconds (2 weeks by default)"
    },
    "created" : {
      "type" : "string",
      "format" : "date-time"
    },
    "userId" : {
      "type" : "number",
      "format" : "double"
    }
  }
},

  "Chat": {
  "id" : "Chat",
  "name" : "",
  "required" : [ "date", "user", "message", "html" ],
  "properties" : {
    "fromBot" : {
      "type" : "boolean"
    },
    "id" : {
      "type" : "number",
      "format" : "double"
    },
    "date" : {
      "type" : "string",
      "format" : "date-time"
    },
    "message" : {
      "type" : "string"
    },
    "html" : {
      "type" : "string"
    },
    "user" : {
      "type" : "string"
    }
  }
},

  "Affiliate": {
  "id" : "Affiliate",
  "name" : "",
  "required" : [ "account", "currency" ],
  "properties" : {
    "timestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "totalReferrals" : {
      "type" : "number",
      "format" : "double"
    },
    "payoutPcnt" : {
      "type" : "number",
      "format" : "double"
    },
    "execTurnover" : {
      "type" : "number",
      "format" : "double"
    },
    "totalComm" : {
      "type" : "number",
      "format" : "double"
    },
    "prevPayout" : {
      "type" : "number",
      "format" : "double"
    },
    "prevTurnover" : {
      "type" : "number",
      "format" : "double"
    },
    "execComm" : {
      "type" : "number",
      "format" : "double"
    },
    "currency" : {
      "type" : "string"
    },
    "pendingPayout" : {
      "type" : "number",
      "format" : "double"
    },
    "account" : {
      "type" : "number",
      "format" : "double"
    },
    "totalTurnover" : {
      "type" : "number",
      "format" : "double"
    },
    "prevComm" : {
      "type" : "number",
      "format" : "double"
    },
    "prevTimestamp" : {
      "type" : "string",
      "format" : "date-time"
    }
  }
},

  "Instrument": {
  "id" : "Instrument",
  "name" : "",
  "required" : [ "symbol" ],
  "properties" : {
    "openValue" : {
      "type" : "number",
      "format" : "double"
    },
    "reference" : {
      "type" : "string"
    },
    "sessionInterval" : {
      "type" : "string",
      "format" : "date-time"
    },
    "volume24h" : {
      "type" : "number",
      "format" : "double"
    },
    "quoteToSettleMultiplier" : {
      "type" : "number",
      "format" : "double"
    },
    "hedgerMakerFee" : {
      "type" : "number",
      "format" : "double"
    },
    "sellLeg" : {
      "type" : "string"
    },
    "midPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "askPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "timestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "lowPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "quoteCurrency" : {
      "type" : "string"
    },
    "state" : {
      "type" : "string"
    },
    "hedgerInsuranceFee" : {
      "type" : "number",
      "format" : "double"
    },
    "settlCurrency" : {
      "type" : "string"
    },
    "settledPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "front" : {
      "type" : "string",
      "format" : "date-time"
    },
    "buyLeg" : {
      "type" : "string"
    },
    "underlyingSymbol" : {
      "type" : "string"
    },
    "hedgerTakerFee" : {
      "type" : "number",
      "format" : "double"
    },
    "insuranceFee" : {
      "type" : "number",
      "format" : "double"
    },
    "listing" : {
      "type" : "string",
      "format" : "date-time"
    },
    "openingTimestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "isQuanto" : {
      "type" : "boolean"
    },
    "bidPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "lastPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "initMargin" : {
      "type" : "number",
      "format" : "double"
    },
    "inverseLeg" : {
      "type" : "string"
    },
    "symbol" : {
      "type" : "string"
    },
    "isInverse" : {
      "type" : "boolean"
    },
    "maintMargin" : {
      "type" : "number",
      "format" : "double"
    },
    "takerFee" : {
      "type" : "number",
      "format" : "double"
    },
    "prevTotalVolume" : {
      "type" : "number",
      "format" : "double"
    },
    "openInterest" : {
      "type" : "number",
      "format" : "double"
    },
    "multiplier" : {
      "type" : "number",
      "format" : "double"
    },
    "typ" : {
      "type" : "string"
    },
    "vwap" : {
      "type" : "number",
      "format" : "double"
    },
    "highPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "lastTickDirection" : {
      "type" : "string"
    },
    "closingTimestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "limitUpPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "prevTotalTurnover" : {
      "type" : "number",
      "format" : "double"
    },
    "underlying" : {
      "type" : "string"
    },
    "makerFee" : {
      "type" : "number",
      "format" : "double"
    },
    "turnover24h" : {
      "type" : "number",
      "format" : "double"
    },
    "limitDownPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "expiry" : {
      "type" : "string",
      "format" : "date-time"
    },
    "lastChangePcnt" : {
      "type" : "number",
      "format" : "double"
    },
    "limit" : {
      "type" : "number",
      "format" : "double"
    },
    "totalTurnover" : {
      "type" : "number",
      "format" : "double"
    },
    "underlyingToSettleMultiplier" : {
      "type" : "number",
      "format" : "double"
    },
    "volume" : {
      "type" : "number",
      "format" : "double"
    },
    "tickSize" : {
      "type" : "number",
      "format" : "double"
    },
    "referenceSymbol" : {
      "type" : "string"
    },
    "totalVolume" : {
      "type" : "number",
      "format" : "double"
    },
    "relistInterval" : {
      "type" : "string",
      "format" : "date-time"
    },
    "turnover" : {
      "type" : "number",
      "format" : "double"
    },
    "rootSymbol" : {
      "type" : "string"
    },
    "prevClosePrice" : {
      "type" : "number",
      "format" : "double"
    }
  }
},

  "TradeBin": {
  "id" : "TradeBin",
  "name" : "",
  "properties" : {
    "foreignNotional" : {
      "type" : "number",
      "format" : "double"
    },
    "lastSize" : {
      "type" : "number",
      "format" : "double"
    },
    "timestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "homeNotional" : {
      "type" : "number",
      "format" : "double"
    },
    "open" : {
      "type" : "number",
      "format" : "double"
    },
    "symbol" : {
      "type" : "string"
    },
    "low" : {
      "type" : "number",
      "format" : "double"
    },
    "id" : {
      "type" : "number",
      "format" : "double"
    },
    "trades" : {
      "type" : "number",
      "format" : "double"
    },
    "vwap" : {
      "type" : "number",
      "format" : "double"
    },
    "close" : {
      "type" : "number",
      "format" : "double"
    },
    "volume" : {
      "type" : "number",
      "format" : "double"
    },
    "high" : {
      "type" : "number",
      "format" : "double"
    },
    "turnover" : {
      "type" : "number",
      "format" : "double"
    }
  }
},

  "Execution": {
  "id" : "Execution",
  "name" : "",
  "required" : [ "execID" ],
  "properties" : {
    "side" : {
      "type" : "string"
    },
    "workingIndicator" : {
      "type" : "boolean"
    },
    "tradePublishIndicator" : {
      "type" : "string"
    },
    "lastMkt" : {
      "type" : "string"
    },
    "foreignNotional" : {
      "type" : "number",
      "format" : "double"
    },
    "execID" : {
      "type" : "string"
    },
    "lastPx" : {
      "type" : "number",
      "format" : "double"
    },
    "orderID" : {
      "type" : "string"
    },
    "timestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "commission" : {
      "type" : "number",
      "format" : "double"
    },
    "homeNotional" : {
      "type" : "number",
      "format" : "double"
    },
    "lastQty" : {
      "type" : "number",
      "format" : "double"
    },
    "settlCurrency" : {
      "type" : "string"
    },
    "multiLegReportingType" : {
      "type" : "string"
    },
    "timeInForce" : {
      "type" : "string"
    },
    "price" : {
      "type" : "number",
      "format" : "double"
    },
    "ordStatus" : {
      "type" : "string"
    },
    "simpleCumQty" : {
      "type" : "number",
      "format" : "double"
    },
    "execCost" : {
      "type" : "number",
      "format" : "double"
    },
    "simpleOrderQty" : {
      "type" : "number",
      "format" : "double"
    },
    "text" : {
      "type" : "string"
    },
    "leavesQty" : {
      "type" : "number",
      "format" : "double"
    },
    "orderQty" : {
      "type" : "number",
      "format" : "double"
    },
    "symbol" : {
      "type" : "string"
    },
    "underlyingLastPx" : {
      "type" : "number",
      "format" : "double"
    },
    "ordRejReason" : {
      "type" : "string"
    },
    "minQty" : {
      "type" : "number",
      "format" : "double"
    },
    "trdMatchID" : {
      "type" : "string"
    },
    "execComm" : {
      "type" : "number",
      "format" : "double"
    },
    "lastLiquidityInd" : {
      "type" : "string"
    },
    "currency" : {
      "type" : "string"
    },
    "avgPx" : {
      "type" : "number",
      "format" : "double"
    },
    "account" : {
      "type" : "number",
      "format" : "double"
    },
    "commType" : {
      "type" : "string"
    },
    "stopPx" : {
      "type" : "number",
      "format" : "double"
    },
    "transactTime" : {
      "type" : "string",
      "format" : "date-time"
    },
    "ordType" : {
      "type" : "string"
    },
    "execType" : {
      "type" : "string"
    },
    "exDestination" : {
      "type" : "string"
    },
    "clOrdID" : {
      "type" : "string"
    },
    "simpleLeavesQty" : {
      "type" : "number",
      "format" : "double"
    },
    "cumQty" : {
      "type" : "number",
      "format" : "double"
    }
  }
},

  "Margin": {
  "id" : "Margin",
  "name" : "",
  "required" : [ "account", "currency" ],
  "properties" : {
    "grossExecCost" : {
      "type" : "number",
      "format" : "double"
    },
    "walletBalance" : {
      "type" : "number",
      "format" : "double"
    },
    "realisedPnl" : {
      "type" : "number",
      "format" : "double"
    },
    "timestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "commission" : {
      "type" : "number",
      "format" : "double"
    },
    "state" : {
      "type" : "string"
    },
    "varMargin" : {
      "type" : "number",
      "format" : "double"
    },
    "riskValue" : {
      "type" : "number",
      "format" : "double"
    },
    "marginUsedPcnt" : {
      "type" : "number",
      "format" : "double"
    },
    "grossOpenCost" : {
      "type" : "number",
      "format" : "double"
    },
    "marginBalance" : {
      "type" : "number",
      "format" : "double"
    },
    "targetExcessMargin" : {
      "type" : "number",
      "format" : "double"
    },
    "marginBalancePcnt" : {
      "type" : "number",
      "format" : "double"
    },
    "excessMargin" : {
      "type" : "number",
      "format" : "double"
    },
    "initMargin" : {
      "type" : "number",
      "format" : "double"
    },
    "amount" : {
      "type" : "number",
      "format" : "double"
    },
    "availableMargin" : {
      "type" : "number",
      "format" : "double"
    },
    "maintMargin" : {
      "type" : "number",
      "format" : "double"
    },
    "grossComm" : {
      "type" : "number",
      "format" : "double"
    },
    "riskLimit" : {
      "type" : "number",
      "format" : "double"
    },
    "pendingDebit" : {
      "type" : "number",
      "format" : "double"
    },
    "marginLeverage" : {
      "type" : "number",
      "format" : "double"
    },
    "currency" : {
      "type" : "string"
    },
    "pendingCredit" : {
      "type" : "number",
      "format" : "double"
    },
    "withdrawableMargin" : {
      "type" : "number",
      "format" : "double"
    },
    "sessionMargin" : {
      "type" : "number",
      "format" : "double"
    },
    "account" : {
      "type" : "number",
      "format" : "double"
    },
    "prevRealisedPnl" : {
      "type" : "number",
      "format" : "double"
    },
    "excessMarginPcnt" : {
      "type" : "number",
      "format" : "double"
    },
    "prevUnrealisedPnl" : {
      "type" : "number",
      "format" : "double"
    },
    "action" : {
      "type" : "string"
    },
    "grossLastValue" : {
      "type" : "number",
      "format" : "double"
    },
    "unrealisedPnl" : {
      "type" : "number",
      "format" : "double"
    }
  }
},

  "User": {
  "id" : "User",
  "name" : "",
  "required" : [ "username", "email" ],
  "properties" : {
    "affiliateID" : {
      "type" : "string"
    },
    "email" : {
      "type" : "string"
    },
    "role" : {
      "type" : "string"
    },
    "username" : {
      "type" : "string"
    },
    "lastUpdated" : {
      "type" : "string",
      "format" : "date-time"
    },
    "firstname" : {
      "type" : "string"
    },
    "lastname" : {
      "type" : "string"
    },
    "id" : {
      "type" : "number",
      "format" : "double"
    },
    "TFAEnabled" : {
      "type" : "string"
    },
    "countryCode" : {
      "type" : "number",
      "format" : "double"
    },
    "status" : {
      "type" : "string"
    },
    "preferences" : {
      "type" : "object"
    },
    "phone" : {
      "type" : "string"
    },
    "created" : {
      "type" : "string",
      "format" : "date-time"
    }
  }
},

  "OrderBook": {
  "id" : "OrderBook",
  "name" : "",
  "required" : [ "symbol", "level" ],
  "properties" : {
    "askSize" : {
      "type" : "number",
      "format" : "double"
    },
    "askPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "timestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "bidPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "symbol" : {
      "type" : "string"
    },
    "bidSize" : {
      "type" : "number",
      "format" : "double"
    },
    "level" : {
      "type" : "number",
      "format" : "double"
    }
  }
},

  "StatsHistory": {
  "id" : "StatsHistory",
  "name" : "",
  "required" : [ "date", "rootSymbol" ],
  "properties" : {
    "date" : {
      "type" : "string",
      "format" : "date-time"
    },
    "currency" : {
      "type" : "string"
    },
    "volume" : {
      "type" : "number",
      "format" : "double"
    },
    "turnover" : {
      "type" : "number",
      "format" : "double"
    },
    "rootSymbol" : {
      "type" : "string"
    }
  }
},

  "Position": {
  "id" : "Position",
  "name" : "",
  "required" : [ "account", "symbol" ],
  "properties" : {
    "grossExecCost" : {
      "type" : "number",
      "format" : "double"
    },
    "currentTimestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "liquidationPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "foreignNotional" : {
      "type" : "number",
      "format" : "double"
    },
    "realisedPnl" : {
      "type" : "number",
      "format" : "double"
    },
    "simplePnlPcnt" : {
      "type" : "number",
      "format" : "double"
    },
    "timestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "commission" : {
      "type" : "number",
      "format" : "double"
    },
    "homeNotional" : {
      "type" : "number",
      "format" : "double"
    },
    "quoteCurrency" : {
      "type" : "string"
    },
    "varMargin" : {
      "type" : "number",
      "format" : "double"
    },
    "openingQty" : {
      "type" : "number",
      "format" : "double"
    },
    "currentQty" : {
      "type" : "number",
      "format" : "double"
    },
    "openOrderBuyCost" : {
      "type" : "number",
      "format" : "double"
    },
    "execCost" : {
      "type" : "number",
      "format" : "double"
    },
    "unrealisedPnlPcnt" : {
      "type" : "number",
      "format" : "double"
    },
    "grossOpenCost" : {
      "type" : "number",
      "format" : "double"
    },
    "currentComm" : {
      "type" : "number",
      "format" : "double"
    },
    "targetExcessMargin" : {
      "type" : "number",
      "format" : "double"
    },
    "openOrderSellQty" : {
      "type" : "number",
      "format" : "double"
    },
    "openingTimestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "simplePnl" : {
      "type" : "number",
      "format" : "double"
    },
    "lastPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "initMargin" : {
      "type" : "number",
      "format" : "double"
    },
    "simpleQty" : {
      "type" : "number",
      "format" : "double"
    },
    "marginCallPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "avgEntryPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "execSellQty" : {
      "type" : "number",
      "format" : "double"
    },
    "simpleValue" : {
      "type" : "number",
      "format" : "double"
    },
    "openingComm" : {
      "type" : "number",
      "format" : "double"
    },
    "symbol" : {
      "type" : "string"
    },
    "maintMargin" : {
      "type" : "number",
      "format" : "double"
    },
    "execQty" : {
      "type" : "number",
      "format" : "double"
    },
    "bankruptPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "openOrderSellCost" : {
      "type" : "number",
      "format" : "double"
    },
    "openOrderBuyQty" : {
      "type" : "number",
      "format" : "double"
    },
    "execBuyCost" : {
      "type" : "number",
      "format" : "double"
    },
    "lastValue" : {
      "type" : "number",
      "format" : "double"
    },
    "execComm" : {
      "type" : "number",
      "format" : "double"
    },
    "execSellCost" : {
      "type" : "number",
      "format" : "double"
    },
    "currency" : {
      "type" : "string"
    },
    "openingCost" : {
      "type" : "number",
      "format" : "double"
    },
    "underlying" : {
      "type" : "string"
    },
    "sessionMargin" : {
      "type" : "number",
      "format" : "double"
    },
    "account" : {
      "type" : "number",
      "format" : "double"
    },
    "prevRealisedPnl" : {
      "type" : "number",
      "format" : "double"
    },
    "prevUnrealisedPnl" : {
      "type" : "number",
      "format" : "double"
    },
    "execBuyQty" : {
      "type" : "number",
      "format" : "double"
    },
    "simpleCost" : {
      "type" : "number",
      "format" : "double"
    },
    "unrealisedCost" : {
      "type" : "number",
      "format" : "double"
    },
    "currentCost" : {
      "type" : "number",
      "format" : "double"
    },
    "realisedCost" : {
      "type" : "number",
      "format" : "double"
    },
    "unrealisedPnl" : {
      "type" : "number",
      "format" : "double"
    },
    "breakEvenPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "prevClosePrice" : {
      "type" : "number",
      "format" : "double"
    }
  }
},

  "Trade": {
  "id" : "Trade",
  "name" : "",
  "properties" : {
    "side" : {
      "type" : "string"
    },
    "foreignNotional" : {
      "type" : "number",
      "format" : "double"
    },
    "timestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "size" : {
      "type" : "number",
      "format" : "double"
    },
    "homeNotional" : {
      "type" : "number",
      "format" : "double"
    },
    "price" : {
      "type" : "number",
      "format" : "double"
    },
    "grossValue" : {
      "type" : "number",
      "format" : "double"
    },
    "symbol" : {
      "type" : "string"
    },
    "id" : {
      "type" : "number",
      "format" : "double"
    },
    "tickDirection" : {
      "type" : "string"
    },
    "trdMatchID" : {
      "type" : "string"
    }
  }
},

  "Order": {
  "id" : "Order",
  "name" : "",
  "required" : [ "orderID" ],
  "properties" : {
    "side" : {
      "type" : "string"
    },
    "workingIndicator" : {
      "type" : "boolean"
    },
    "orderID" : {
      "type" : "string"
    },
    "timestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "settlCurrency" : {
      "type" : "string"
    },
    "multiLegReportingType" : {
      "type" : "string"
    },
    "timeInForce" : {
      "type" : "string"
    },
    "price" : {
      "type" : "number",
      "format" : "double"
    },
    "ordStatus" : {
      "type" : "string"
    },
    "simpleCumQty" : {
      "type" : "number",
      "format" : "double"
    },
    "simpleOrderQty" : {
      "type" : "number",
      "format" : "double"
    },
    "text" : {
      "type" : "string"
    },
    "leavesQty" : {
      "type" : "number",
      "format" : "double"
    },
    "orderQty" : {
      "type" : "number",
      "format" : "double"
    },
    "symbol" : {
      "type" : "string"
    },
    "ordRejReason" : {
      "type" : "string"
    },
    "minQty" : {
      "type" : "number",
      "format" : "double"
    },
    "currency" : {
      "type" : "string"
    },
    "avgPx" : {
      "type" : "number",
      "format" : "double"
    },
    "account" : {
      "type" : "number",
      "format" : "double"
    },
    "stopPx" : {
      "type" : "number",
      "format" : "double"
    },
    "transactTime" : {
      "type" : "string",
      "format" : "date-time"
    },
    "ordType" : {
      "type" : "string"
    },
    "exDestination" : {
      "type" : "string"
    },
    "clOrdID" : {
      "type" : "string"
    },
    "simpleLeavesQty" : {
      "type" : "number",
      "format" : "double"
    },
    "cumQty" : {
      "type" : "number",
      "format" : "double"
    }
  }
}

  }
