package com.wordnik.client.model

import java.math.BigDecimal


case class Liquidation (
  orderID: String,
  symbol: String,
  side: String,
  price: Double,
  leavesQty: BigDecimal
)
