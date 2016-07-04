package com.wordnik.client.model

import java.util.Date
import java.math.BigDecimal


case class Insurance (
  currency: String,
  timestamp: Date,
  walletBalance: BigDecimal
)
