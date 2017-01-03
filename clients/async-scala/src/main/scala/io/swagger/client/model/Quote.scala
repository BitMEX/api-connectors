package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Quote (
  timestamp: Date,
symbol: String,
bidSize: Option[Number],
bidPrice: Option[Double],
askPrice: Option[Double],
askSize: Option[Number]
)
