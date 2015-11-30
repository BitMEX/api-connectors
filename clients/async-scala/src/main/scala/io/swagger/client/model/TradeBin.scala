package io.swagger.client.model

import org.joda.time.DateTime


case class TradeBin (
  timestamp: Date,
  symbol: String,
  open: Double,
  high: Double,
  low: Double,
  close: Double,
  trades: Number,
  volume: Number,
  vwap: Double,
  lastSize: Number,
  turnover: Number,
  homeNotional: Double,
  foreignNotional: Double,
  id: Double
  
)
