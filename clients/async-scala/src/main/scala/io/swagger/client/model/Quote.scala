package io.swagger.client.model

import org.joda.time.DateTime


case class Quote (
  timestamp: Date,
  symbol: String,
  bidSize: Number,
  bidPrice: Double,
  askPrice: Double,
  askSize: Number,
  id: Double
  
)
