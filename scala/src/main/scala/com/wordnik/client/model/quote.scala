package com.wordnik.client.model

import java.util.Date
case class Quote (
  timestamp: Date,
  symbol: String,
  bidSize: Double,
  bidPrice: Double,
  askPrice: Double,
  askSize: Double,
  id: Double)

