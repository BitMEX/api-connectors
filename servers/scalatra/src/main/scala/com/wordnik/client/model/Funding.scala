package com.wordnik.client.model

import java.util.Date


case class Funding (
  timestamp: Date,
  symbol: String,
  fundingInterval: Date,
  fundingRate: Double,
  fundingRateDaily: Double
)
