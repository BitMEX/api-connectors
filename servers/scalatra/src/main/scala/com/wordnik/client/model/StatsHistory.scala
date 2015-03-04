package com.wordnik.client.model

import java.util.Date
case class StatsHistory (
  date: Date,

  rootSymbol: String,

  currency: Option[String],

  volume: Option[Double],

  turnover: Option[Double]

  )

