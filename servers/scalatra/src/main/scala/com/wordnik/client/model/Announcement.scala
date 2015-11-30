package com.wordnik.client.model

import java.math.BigDecimal
import java.util.Date


case class Announcement (
  id: BigDecimal,
  link: String,
  title: String,
  content: String,
  date: Date
)
