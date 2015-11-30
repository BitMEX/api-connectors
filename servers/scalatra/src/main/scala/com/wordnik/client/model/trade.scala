package com.wordnik.client.model

import java.util.Date
import java.math.BigDecimal


case class Trade (
  timestamp: Date,
  symbol: String,
  side: String,
  size: BigDecimal,
  price: Double,
  tickDirection: String,
  trdMatchID: String,
  grossValue: BigDecimal,
  homeNotional: Double,
  foreignNotional: Double,
  id: Double
)
