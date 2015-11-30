package io.swagger.client.model

import java.util.Date



case class StatsHistory (
  date: Date,
  rootSymbol: String,
  currency: String,
  volume: Number,
  turnover: Number)
  
