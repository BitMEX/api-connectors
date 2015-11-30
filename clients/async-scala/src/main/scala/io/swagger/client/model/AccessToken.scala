package io.swagger.client.model

import org.joda.time.DateTime


case class AccessToken (
  id: String,
  ttl: Double,  // time to live in seconds (2 weeks by default)
  created: Date,
  userId: Double
  
)
