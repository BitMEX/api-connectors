package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Funding (
  timestamp: DateTime,
symbol: String,
fundingInterval: Option[DateTime],
fundingRate: Option[Double],
fundingRateDaily: Option[Double]
)
