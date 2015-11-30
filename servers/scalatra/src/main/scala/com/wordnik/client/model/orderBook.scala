package com.wordnik.client.model

import java.math.BigDecimal
import java.util.Date


case class OrderBook (
  symbol: String,
  level: BigDecimal,
  bidSize: BigDecimal,
  bidPrice: Double,
  askPrice: Double,
  askSize: BigDecimal,
  timestamp: Date
)
