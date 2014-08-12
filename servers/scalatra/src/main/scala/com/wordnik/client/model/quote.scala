package com.wordnik.client.model

import java.util.Date
case class Quote (
  timestamp: Option[Date],

  symbol: Option[String],

  bidSize: Option[Double],

  bidPrice: Option[Double],

  askPrice: Option[Double],

  askSize: Option[Double],

  id: Option[Double]

  )

