package io.swagger.client.model

import java.util.Date



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
  id: Double)
  
