package com.wordnik.client.model

import java.util.Date
case class User (
  id: Double,
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
  affiliateID: String)

