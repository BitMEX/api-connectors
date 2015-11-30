package com.wordnik.client.model

import java.math.BigDecimal


case class Error (
  message: String,
  code: BigDecimal
)
