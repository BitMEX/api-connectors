package com.wordnik.client.model

import java.util.Date
import java.math.BigDecimal


case class Quote (
  timestamp: Date,
  symbol: String,
  bidSize: BigDecimal,
  bidPrice: Double,
  askPrice: Double,
  askSize: BigDecimal,
  id: Double
)
