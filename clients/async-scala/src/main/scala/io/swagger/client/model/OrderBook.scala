package io.swagger.client.model

import org.joda.time.DateTime


case class OrderBook (
  symbol: String,
  level: Number,
  bidSize: Number,
  bidPrice: Double,
  askPrice: Double,
  askSize: Number,
  timestamp: Date
  
)
