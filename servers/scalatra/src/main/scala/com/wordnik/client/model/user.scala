package com.wordnik.client.model

import java.util.Date
import com.wordnik.client.model.AnonymousModel_6
case class User (
  firstname: Option[String],

  lastname: Option[String],

  username: Option[String],

  email: String,

  emailVerified: Option[Boolean],

  phone: String,

  phoneVerified: Option[Boolean],

  status: Option[String],

  created: Option[Date],

  lastUpdated: Option[Date],

  preferences: Option[AnonymousModel_6],

  isEmployee: Option[Boolean],

  id: Option[Double]

  )

