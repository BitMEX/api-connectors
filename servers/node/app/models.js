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

  "Instrument": {
  "id" : "Instrument",
  "name" : "",
  "required" : [ "symbol" ],
  "properties" : {
    "reference" : {
      "type" : "string"
    },
    "quoteToSettleMultiplier" : {
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
    "underlying" : {
      "type" : "string"
    },
    "makerFee" : {
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
    "lastSize" : {
      "type" : "number",
      "format" : "double"
    },
    "timestamp" : {
      "type" : "string",
      "format" : "date-time"
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
    "lastMkt" : {
      "type" : "string"
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
    "execCost" : {
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
    "cumQty" : {
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
    "notionalCurrency2" : {
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
    "notionalValue1" : {
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
    "openingComm" : {
      "type" : "number",
      "format" : "double"
    },
    "symbol" : {
      "type" : "string"
    },
    "notionalCurrency1" : {
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
    "notionalValue2" : {
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

  "Error": {
  "id" : "Error",
  "name" : "",
  "required" : [ "message", "code" ],
  "properties" : {
    "message" : {
      "type" : "string"
    },
    "code" : {
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
    "timestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "size" : {
      "type" : "number",
      "format" : "double"
    },
    "price" : {
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
    "cumQty" : {
      "type" : "number",
      "format" : "double"
    }
  }
}

  }
