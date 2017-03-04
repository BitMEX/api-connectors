package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Settlement (
  timestamp: DateTime,
symbol: String,
settlementType: Option[String],
settledPrice: Option[Double],
bankrupt: Option[Number],
taxBase: Option[Number],
taxRate: Option[Double]
)
