package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Stats (
  rootSymbol: String,
currency: Option[String],
volume24h: Option[Number],
turnover24h: Option[Number],
openInterest: Option[Number],
openValue: Option[Number]
)
