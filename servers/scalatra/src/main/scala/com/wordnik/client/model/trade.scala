package com.wordnik.client.model

import java.util.Date
case class Trade (
  timestamp: Option[Date],

  symbol: Option[String],

  side: Option[String],

  size: Option[Double],

  price: Option[Double],

  tickDirection: Option[String],

  trdMatchID: Option[String],

  id: Option[Double]

  )

