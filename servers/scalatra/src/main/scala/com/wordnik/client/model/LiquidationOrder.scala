package com.wordnik.client.model

import java.math.BigDecimal


case class LiquidationOrder (
  symbol: String,
  side: String,
  qty: BigDecimal,
  price: Double
)
