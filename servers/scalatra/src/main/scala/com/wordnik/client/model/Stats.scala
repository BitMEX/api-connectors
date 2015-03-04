package com.wordnik.client.model

case class Stats (
  rootSymbol: String,

  currency: Option[String],

  volume24h: Option[Double],

  turnover24h: Option[Double],

  openInterest: Option[Double],

  openValue: Option[Double]

  )

