package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class OrderBook (
  symbol: String,
level: Number,
bidSize: Option[Number],
bidPrice: Option[Double],
askPrice: Option[Double],
askSize: Option[Number],
timestamp: Option[Date]
)
