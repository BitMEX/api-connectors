package com.wordnik.client.model

import java.util.Date
case class Trade (
  timestamp: Date,
  symbol: String,
  side: String,
  size: Double,
  price: Double,
  tickDirection: String,
  trdMatchID: String,
  id: Double)

