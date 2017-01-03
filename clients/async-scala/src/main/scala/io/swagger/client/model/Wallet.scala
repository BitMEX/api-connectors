package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Wallet (
  account: Number,
currency: String,
prevDeposited: Option[Number],
prevWithdrawn: Option[Number],
prevAmount: Option[Number],
prevTimestamp: Option[Date],
deltaDeposited: Option[Number],
deltaWithdrawn: Option[Number],
deltaAmount: Option[Number],
deposited: Option[Number],
withdrawn: Option[Number],
amount: Option[Number],
pendingCredit: Option[Number],
pendingDebit: Option[Number],
confirmedDebit: Option[Number],
timestamp: Option[Date],
addr: Option[String]
)
