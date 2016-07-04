package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Quote (
  timestamp: Option[Date],
symbol: Option[String],
bidSize: Option[Number],
bidPrice: Option[Double],
askPrice: Option[Double],
askSize: Option[Number],
id: Option[Double]
)
