package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Affiliate (
  account: Number,
currency: String,
prevPayout: Option[Number],
prevTurnover: Option[Number],
prevComm: Option[Number],
prevTimestamp: Option[Date],
execTurnover: Option[Number],
execComm: Option[Number],
totalReferrals: Option[Number],
totalTurnover: Option[Number],
totalComm: Option[Number],
payoutPcnt: Option[Double],
pendingPayout: Option[Number],
timestamp: Option[Date]
)
