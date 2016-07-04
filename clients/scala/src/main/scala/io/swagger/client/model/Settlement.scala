package io.swagger.client.model

import java.util.Date



case class Settlement (
  timestamp: Date,
  symbol: String,
  settlementType: String,
  settledPrice: Double,
  bankrupt: Number,
  taxBase: Number,
  taxRate: Double)
  
