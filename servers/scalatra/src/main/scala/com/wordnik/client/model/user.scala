package com.wordnik.client.model

import com.wordnik.client.model.UserPreferences
import java.math.BigDecimal
import java.util.Date


case class User (
  id: BigDecimal,
  firstname: String,
  lastname: String,
  status: String,
  username: String,
  email: String,
  phone: String,
  countryCode: BigDecimal,
  created: Date,
  lastUpdated: Date,
  preferences: UserPreferences,
  role: String,
  TFAEnabled: String,
  affiliateID: String,
  pgpPubKey: String,
  country: String,
  disabled: Boolean
)
