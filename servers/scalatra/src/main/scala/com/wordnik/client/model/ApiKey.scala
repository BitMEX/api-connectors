package com.wordnik.client.model

case class ApiKey (
  id: String,

  secret: String,

  name: String,

  nonce: Double,

  cidr: Option[String],

  constriants: Option[Any],

  enabled: Option[Boolean],

  userId: Double

  )

