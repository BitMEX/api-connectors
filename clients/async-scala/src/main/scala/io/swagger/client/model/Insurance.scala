package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Insurance (
  currency: String,
timestamp: DateTime,
walletBalance: Option[Number]
)
