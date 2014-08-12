exports.models = {
  "chat": {
  "id" : "chat",
  "name" : "",
  "required" : [ "id", "date", "user", "message" ],
  "properties" : {
    "id" : {
      "type" : "number",
      "format" : "double"
    },
    "date" : {
      "type" : "string",
      "format" : "date-time"
    },
    "user" : {
      "type" : "string"
    },
    "message" : {
      "type" : "string"
    }
  }
},

  "orderBook": {
  "id" : "orderBook",
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

  "position": {
  "id" : "position",
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
    "pnl" : {
      "type" : "number",
      "format" : "double"
    },
    "liquidationPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "timestamp" : {
      "type" : "string",
      "format" : "date-time"
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
    "prevPnl" : {
      "type" : "number",
      "format" : "double"
    },
    "openingTimestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "lastPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "initMargin" : {
      "type" : "number",
      "format" : "double"
    },
    "currentBuyCost" : {
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
    "avgBuyPrice" : {
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
    "currentSellCost" : {
      "type" : "number",
      "format" : "double"
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
    "openingSellCost" : {
      "type" : "number",
      "format" : "double"
    },
    "lastValue" : {
      "type" : "number",
      "format" : "double"
    },
    "openingBuyQty" : {
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
    "pnlPcnt" : {
      "type" : "number",
      "format" : "double"
    },
    "openingBuyCost" : {
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
    "currentSellQty" : {
      "type" : "number",
      "format" : "double"
    },
    "execBuyQty" : {
      "type" : "number",
      "format" : "double"
    },
    "currentBuyQty" : {
      "type" : "number",
      "format" : "double"
    },
    "avgSellPrice" : {
      "type" : "number",
      "format" : "double"
    },
    "currentCost" : {
      "type" : "number",
      "format" : "double"
    },
    "openingSellQty" : {
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

  "order": {
  "id" : "order",
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
},

  "instrument": {
  "id" : "instrument",
  "name" : "",
  "required" : [ "symbol" ],
  "properties" : {
    "reference" : {
      "type" : "string"
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
    "buyLeg" : {
      "type" : "string"
    },
    "listing" : {
      "type" : "string",
      "format" : "date-time"
    },
    "openingTimestamp" : {
      "type" : "string",
      "format" : "date-time"
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
    "symbol" : {
      "type" : "string"
    },
    "maintMargin" : {
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
    "prevClosePrice" : {
      "type" : "number",
      "format" : "double"
    }
  }
},

  "trade": {
  "id" : "trade",
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

  "leaderboard": {
  "id" : "leaderboard",
  "name" : "",
  "required" : [ "username", "marginBalance" ],
  "properties" : {
    "username" : {
      "type" : "string"
    },
    "marginBalance" : {
      "type" : "number",
      "format" : "double"
    }
  }
},

  "user": {
  "id" : "user",
  "name" : "",
  "required" : [ "email", "phone" ],
  "properties" : {
    "emailVerified" : {
      "type" : "boolean"
    },
    "email" : {
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
    "phoneVerified" : {
      "type" : "boolean"
    },
    "status" : {
      "type" : "string"
    },
    "preferences" : {
      "type" : "AnonymousModel_6"
    },
    "isEmployee" : {
      "type" : "boolean"
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

  "quote": {
  "id" : "quote",
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
}

  }
