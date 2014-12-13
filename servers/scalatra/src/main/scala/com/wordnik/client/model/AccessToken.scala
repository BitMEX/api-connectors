package com.wordnik.client.model

import java.util.Date
case class AccessToken (
  id: String,

  ttl: Option[Double],// time to live in seconds (2 weeks by default)

  created: Option[Date],

  userId: Option[Double]

  )

