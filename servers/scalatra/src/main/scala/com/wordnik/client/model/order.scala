package com.wordnik.client.model

import java.util.Date
case class Order (
  orderID: String,

  clOrdID: Option[String],

  account: Option[Double],

  symbol: Option[String],

  side: Option[String],

  orderQty: Option[Double],

  price: Option[Double],

  minQty: Option[Double],

  stopPx: Option[Double],

  currency: Option[String],

  settlCurrency: Option[String],

  ordType: Option[String],

  timeInForce: Option[String],

  exDestination: Option[String],

  ordStatus: Option[String],

  workingIndicator: Option[Boolean],

  ordRejReason: Option[String],

  leavesQty: Option[Double],

  cumQty: Option[Double],

  avgPx: Option[Double],

  multiLegReportingType: Option[String],

  text: Option[String],

  transactTime: Option[Date],

  timestamp: Option[Date]

  )

