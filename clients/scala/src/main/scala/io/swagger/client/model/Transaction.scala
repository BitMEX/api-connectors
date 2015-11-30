package io.swagger.client.model

import java.util.Date



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
  timestamp: Date)
  
