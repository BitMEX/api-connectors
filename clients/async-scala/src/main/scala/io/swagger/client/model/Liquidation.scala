package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Liquidation (
  orderID: String,
symbol: Option[String],
side: Option[String],
price: Option[Double],
leavesQty: Option[Number]
)
