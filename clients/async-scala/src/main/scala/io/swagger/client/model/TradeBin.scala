package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class TradeBin (
  timestamp: Option[Date],
symbol: Option[String],
open: Option[Double],
high: Option[Double],
low: Option[Double],
close: Option[Double],
trades: Option[Number],
volume: Option[Number],
vwap: Option[Double],
lastSize: Option[Number],
turnover: Option[Number],
homeNotional: Option[Double],
foreignNotional: Option[Double],
id: Option[Double]
)
