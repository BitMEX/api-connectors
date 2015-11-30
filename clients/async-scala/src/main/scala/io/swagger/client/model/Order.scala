package io.swagger.client.model

import org.joda.time.DateTime


case class Order (
  orderID: String,
  clOrdID: String,
  account: Number,
  symbol: String,
  side: String,
  simpleOrderQty: Double,
  orderQty: Number,
  price: Double,
  minQty: Number,
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
  leavesQty: Number,
  simpleCumQty: Double,
  cumQty: Number,
  avgPx: Double,
  multiLegReportingType: String,
  text: String,
  transactTime: Date,
  timestamp: Date
  
)
