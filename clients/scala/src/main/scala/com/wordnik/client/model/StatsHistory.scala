package com.wordnik.client.model

import java.util.Date
case class StatsHistory (
  date: Date,
  rootSymbol: String,
  currency: String,
  volume: Double,
  turnover: Double)

