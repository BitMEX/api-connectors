package com.wordnik.client.model

import java.util.Date
import com.wordnik.client.model.Object
case class User (
  firstname: String,
  lastname: String,
  status: String,
  username: String,
  email: String,
  phone: String,
  countryCode: Double,
  created: Date,
  lastUpdated: Date,
  preferences: Any,
  role: String,
  TFAEnabled: String,
  id: Double)

