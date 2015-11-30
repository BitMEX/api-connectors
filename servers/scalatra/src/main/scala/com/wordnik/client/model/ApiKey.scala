package com.wordnik.client.model

import java.math.BigDecimal
import java.util.Date


case class ApiKey (
  id: String,
  secret: String,
  name: String,
  nonce: BigDecimal,
  cidr: String,
  permissions: List[String],
  enabled: Boolean,
  userId: BigDecimal,
  created: Date
)
