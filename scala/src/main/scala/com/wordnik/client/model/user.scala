package com.wordnik.client.model

import java.util.Date
import com.wordnik.client.model.AnonymousModel_6
case class User (
  firstname: String,
  lastname: String,
  username: String,
  email: String,
  emailVerified: Boolean,
  phone: String,
  phoneVerified: Boolean,
  status: String,
  created: Date,
  lastUpdated: Date,
  preferences: AnonymousModel_6,
  isEmployee: Boolean,
  id: Double)

