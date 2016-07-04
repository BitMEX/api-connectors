package io.swagger.client.model

import org.joda.time.DateTime


case class Liquidation (
  orderID: String,
  symbol: String,
  side: String,
  price: Double,
  leavesQty: Number
  
)
