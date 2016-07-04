package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class OrderBookL2 (
  symbol: String,
id: Number,
side: String,
size: Option[Number],
price: Option[Double]
)
