package com.wordnik.client.model

import java.util.Date
case class OrderBook (
  symbol: String,
  level: Double,
  bidSize: Double,
  bidPrice: Double,
  askPrice: Double,
  askSize: Double,
  timestamp: Date)

