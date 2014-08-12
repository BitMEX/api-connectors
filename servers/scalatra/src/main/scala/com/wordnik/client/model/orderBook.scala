package com.wordnik.client.model

import java.util.Date
case class OrderBook (
  symbol: String,

  level: Double,

  bidSize: Option[Double],

  bidPrice: Option[Double],

  askPrice: Option[Double],

  askSize: Option[Double],

  timestamp: Option[Date]

  )

