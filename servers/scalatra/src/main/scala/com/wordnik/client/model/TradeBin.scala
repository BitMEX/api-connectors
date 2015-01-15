package com.wordnik.client.model

import java.util.Date
case class TradeBin (
  timestamp: Option[Date],

  symbol: Option[String],

  open: Option[Double],

  high: Option[Double],

  low: Option[Double],

  close: Option[Double],

  trades: Option[Double],

  volume: Option[Double],

  vwap: Option[Double],

  lastSize: Option[Double],

  turnover: Option[Double],

  homeNotional: Option[Double],

  foreignNotional: Option[Double],

  id: Option[Double]

  )

