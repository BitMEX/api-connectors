package com.wordnik.client.model

import java.util.Date
import java.math.BigDecimal


case class Settlement (
  symbol: String,
  timestamp: Date,
  settlementType: String,
  settledPrice: Double,
  bankrupt: BigDecimal,
  taxBase: BigDecimal,
  taxRate: Double
)
