package com.wordnik.client.model

import java.math.BigDecimal
import java.util.Date


case class Chat (
  id: BigDecimal,
  date: Date,
  user: String,
  message: String,
  html: String,
  fromBot: Boolean
)
