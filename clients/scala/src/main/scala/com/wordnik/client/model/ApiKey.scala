package com.wordnik.client.model

import com.wordnik.client.model.Object
case class ApiKey (
  id: String,
  secret: String,
  name: String,
  nonce: Double,
  cidr: String,
  constriants: Any,
  enabled: Boolean,
  userId: Double)

