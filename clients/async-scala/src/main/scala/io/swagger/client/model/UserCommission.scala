package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class UserCommission (
  makerFee: Option[Double],
takerFee: Option[Double],
settlementFee: Option[Double],
maxFee: Option[Double]
)
