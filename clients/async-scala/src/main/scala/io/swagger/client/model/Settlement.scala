package io.swagger.client.model

import org.joda.time.DateTime


case class Settlement (
  timestamp: Date,
  symbol: String,
  settlementType: String,
  settledPrice: Double,
  bankrupt: Number,
  taxBase: Number,
  taxRate: Double
  
)
