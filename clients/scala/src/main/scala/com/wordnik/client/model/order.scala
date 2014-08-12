package com.wordnik.client.model

import java.util.Date
case class Order (
  orderID: String,
  clOrdID: String,
  account: Double,
  symbol: String,
  side: String,
  orderQty: Double,
  price: Double,
  minQty: Double,
  stopPx: Double,
  currency: String,
  settlCurrency: String,
  ordType: String,
  timeInForce: String,
  exDestination: String,
  ordStatus: String,
  workingIndicator: Boolean,
  ordRejReason: String,
  leavesQty: Double,
  cumQty: Double,
  avgPx: Double,
  multiLegReportingType: String,
  text: String,
  transactTime: Date,
  timestamp: Date)

