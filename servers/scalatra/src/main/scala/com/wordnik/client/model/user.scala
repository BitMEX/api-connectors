package com.wordnik.client.model

import java.util.Date
case class User (
  id: Option[Double],

  firstname: Option[String],

  lastname: Option[String],

  status: Option[String],

  username: String,

  email: String,

  phone: Option[String],

  countryCode: Option[Double],

  created: Option[Date],

  lastUpdated: Option[Date],

  preferences: Option[Any],

  role: Option[String],

  TFAEnabled: Option[String],

  affiliateID: Option[String]

  )

