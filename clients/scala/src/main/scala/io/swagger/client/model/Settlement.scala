package io.swagger.client.model

import java.util.Date



case class Settlement (
  symbol: String,
  timestamp: Date,
  settlementType: String,
  settledPrice: Double,
  bankrupt: Number,
  taxBase: Number,
  taxRate: Double)
  
