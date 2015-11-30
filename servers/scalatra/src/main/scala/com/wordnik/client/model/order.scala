package com.wordnik.client.model

import java.math.BigDecimal
import java.util.Date


case class Order (
  orderID: String,
  clOrdID: String,
  account: BigDecimal,
  symbol: String,
  side: String,
  simpleOrderQty: Double,
  orderQty: BigDecimal,
  price: Double,
  minQty: BigDecimal,
  stopPx: Double,
  currency: String,
  settlCurrency: String,
  ordType: String,
  timeInForce: String,
  exDestination: String,
  ordStatus: String,
  workingIndicator: Boolean,
  ordRejReason: String,
  simpleLeavesQty: Double,
  leavesQty: BigDecimal,
  simpleCumQty: Double,
  cumQty: BigDecimal,
  avgPx: Double,
  multiLegReportingType: String,
  text: String,
  transactTime: Date,
  timestamp: Date
)
