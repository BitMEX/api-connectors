package io.swagger.client.model

import java.util.Date



case class Order (
  orderID: String,
  clOrdID: String,
  clOrdLinkID: String,
  account: Number,
  symbol: String,
  side: String,
  simpleOrderQty: Double,
  orderQty: Number,
  price: Double,
  displayQty: Number,
  stopPx: Double,
  pegOffsetValue: Double,
  pegPriceType: String,
  currency: String,
  settlCurrency: String,
  ordType: String,
  timeInForce: String,
  execInst: String,
  contingencyType: String,
  exDestination: String,
  ordStatus: String,
  triggered: String,
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
  timestamp: Date)
  
