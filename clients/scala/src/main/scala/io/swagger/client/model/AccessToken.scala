package io.swagger.client.model

import java.util.Date



case class AccessToken (
  id: String,
  /* time to live in seconds (2 weeks by default) */
  ttl: Double,
  created: Date,
  userId: Double)
  
