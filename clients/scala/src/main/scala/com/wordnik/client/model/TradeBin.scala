package com.wordnik.client.model

import java.util.Date
case class TradeBin (
  timestamp: Date,
  symbol: String,
  open: Double,
  high: Double,
  low: Double,
  close: Double,
  trades: Double,
  volume: Double,
  vwap: Double,
  lastSize: Double,
  turnover: Double,
  homeNotional: Double,
  foreignNotional: Double,
  id: Double)

