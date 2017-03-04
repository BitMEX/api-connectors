package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class StatsHistory (
  date: DateTime,
rootSymbol: String,
currency: Option[String],
volume: Option[Number],
turnover: Option[Number]
)
