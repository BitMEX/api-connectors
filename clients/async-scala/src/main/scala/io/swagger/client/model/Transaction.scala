package io.swagger.client.model

import org.joda.time.DateTime


case class Transaction (
  transactID: String,
  account: Number,
  currency: String,
  transactType: String,
  amount: Number,
  fee: Number,
  transactStatus: String,
  address: String,
  tx: String,
  text: String,
  transactTime: Date,
  timestamp: Date
  
)
