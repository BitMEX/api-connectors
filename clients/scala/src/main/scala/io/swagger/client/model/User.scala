package io.swagger.client.model

import java.util.Date



case class User (
  id: Number,
  firstname: String,
  lastname: String,
  status: String,
  username: String,
  email: String,
  phone: String,
  countryCode: Number,
  created: Date,
  lastUpdated: Date,
  preferences: UserPreferences,
  role: String,
  TFAEnabled: String,
  affiliateID: String,
  pgpPubKey: String,
  country: String,
  disabled: Boolean)
  
