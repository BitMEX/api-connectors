package com.wordnik.client.model

import java.util.Date
import java.math.BigDecimal


case class Settlement (
  timestamp: Date,
  symbol: String,
  settlementType: String,
  settledPrice: Double,
  bankrupt: BigDecimal,
  taxBase: BigDecimal,
  taxRate: Double
)
