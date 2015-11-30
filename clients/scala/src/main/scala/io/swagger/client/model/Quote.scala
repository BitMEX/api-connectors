package io.swagger.client.model

import java.util.Date



case class Quote (
  timestamp: Date,
  symbol: String,
  bidSize: Number,
  bidPrice: Double,
  askPrice: Double,
  askSize: Number,
  id: Double)
  
