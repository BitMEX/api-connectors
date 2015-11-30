package io.swagger.client.model

import java.util.Date



case class ApiKey (
  id: String,
  secret: String,
  name: String,
  nonce: Number,
  cidr: String,
  permissions: List[String],
  enabled: Boolean,
  userId: Number,
  created: Date)
  
