package io.swagger.client.model

import org.joda.time.DateTime


case class Trade (
  timestamp: Date,
  symbol: String,
  side: String,
  size: Number,
  price: Double,
  tickDirection: String,
  trdMatchID: String,
  grossValue: Number,
  homeNotional: Double,
  foreignNotional: Double,
  id: Double
  
)
