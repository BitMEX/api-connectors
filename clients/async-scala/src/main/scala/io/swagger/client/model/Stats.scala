package io.swagger.client.model

import org.joda.time.DateTime


case class Stats (
  rootSymbol: String,
  currency: String,
  volume24h: Number,
  turnover24h: Number,
  openInterest: Number,
  openValue: Number
  
)
