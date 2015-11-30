package io.swagger.client.model

import org.joda.time.DateTime


case class ApiKey (
  id: String,
  secret: String,
  name: String,
  nonce: Number,
  cidr: String,
  permissions: List[String],
  enabled: Boolean,
  userId: Number,
  created: Date
  
)
