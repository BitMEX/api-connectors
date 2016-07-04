package io.swagger.client.model

import org.joda.time.DateTime


case class Funding (
  timestamp: Date,
  symbol: String,
  fundingInterval: Date,
  fundingRate: Double,
  fundingRateDaily: Double
  
)
