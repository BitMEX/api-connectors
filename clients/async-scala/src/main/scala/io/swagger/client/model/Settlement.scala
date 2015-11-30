package io.swagger.client.model

import org.joda.time.DateTime


case class Settlement (
  symbol: String,
  timestamp: Date,
  settlementType: String,
  settledPrice: Double,
  bankrupt: Number,
  taxBase: Number,
  taxRate: Double
  
)
