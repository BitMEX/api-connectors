package com.wordnik.client.model

import java.math.BigDecimal
import java.util.Date


case class Transaction (
  transactID: String,
  account: BigDecimal,
  currency: String,
  transactType: String,
  amount: BigDecimal,
  fee: BigDecimal,
  transactStatus: String,
  address: String,
  tx: String,
  text: String,
  transactTime: Date,
  timestamp: Date
)
