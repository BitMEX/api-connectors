package com.wordnik.client.model

import java.math.BigDecimal


case class OrderBookL2 (
  symbol: String,
  id: BigDecimal,
  side: String,
  size: BigDecimal,
  price: Double
)
