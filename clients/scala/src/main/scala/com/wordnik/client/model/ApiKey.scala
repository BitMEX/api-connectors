package com.wordnik.client.model

case class ApiKey (
  id: String,
  secret: String,
  name: String,
  nonce: Double,
  cidr: String,
  constriants: Any,
  enabled: Boolean,
  userId: Double)

