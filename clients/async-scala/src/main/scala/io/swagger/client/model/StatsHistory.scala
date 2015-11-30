package io.swagger.client.model

import org.joda.time.DateTime


case class StatsHistory (
  date: Date,
  rootSymbol: String,
  currency: String,
  volume: Number,
  turnover: Number
  
)
