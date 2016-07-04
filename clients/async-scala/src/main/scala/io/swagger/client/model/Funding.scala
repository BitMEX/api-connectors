package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Funding (
  timestamp: Date,
symbol: String,
fundingInterval: Option[Date],
fundingRate: Option[Double],
fundingRateDaily: Option[Double]
)
