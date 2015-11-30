package io.swagger.client.model

import java.util.Date



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
  id: Double)
  
