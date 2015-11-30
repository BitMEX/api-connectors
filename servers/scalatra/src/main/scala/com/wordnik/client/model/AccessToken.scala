package com.wordnik.client.model

import java.util.Date


case class AccessToken (
  id: String,
  ttl: Double,
  created: Date,
  userId: Double
)
