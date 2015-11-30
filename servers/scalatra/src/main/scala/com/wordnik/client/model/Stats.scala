package com.wordnik.client.model

import java.math.BigDecimal


case class Stats (
  rootSymbol: String,
  currency: String,
  volume24h: BigDecimal,
  turnover24h: BigDecimal,
  openInterest: BigDecimal,
  openValue: BigDecimal
)
