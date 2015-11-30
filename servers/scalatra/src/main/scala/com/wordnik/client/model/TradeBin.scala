package com.wordnik.client.model

import java.util.Date
import java.math.BigDecimal


case class TradeBin (
  timestamp: Date,
  symbol: String,
  open: Double,
  high: Double,
  low: Double,
  close: Double,
  trades: BigDecimal,
  volume: BigDecimal,
  vwap: Double,
  lastSize: BigDecimal,
  turnover: BigDecimal,
  homeNotional: Double,
  foreignNotional: Double,
  id: Double
)
