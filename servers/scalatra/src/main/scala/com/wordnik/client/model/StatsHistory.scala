package com.wordnik.client.model

import java.util.Date
import java.math.BigDecimal


case class StatsHistory (
  date: Date,
  rootSymbol: String,
  currency: String,
  volume: BigDecimal,
  turnover: BigDecimal
)
