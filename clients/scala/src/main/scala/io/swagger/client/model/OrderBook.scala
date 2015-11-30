package io.swagger.client.model

import java.util.Date



case class OrderBook (
  symbol: String,
  level: Number,
  bidSize: Number,
  bidPrice: Double,
  askPrice: Double,
  askSize: Number,
  timestamp: Date)
  
