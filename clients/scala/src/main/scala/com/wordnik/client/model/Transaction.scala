package com.wordnik.client.model

import java.util.Date
case class Transaction (
  transactID: String,
  account: Double,
  currency: String,
  transactType: String,
  amount: Double,
  transactStatus: String,
  address: String,
  tx: String,
  text: String,
  transactTime: Date,
  timestamp: Date)

