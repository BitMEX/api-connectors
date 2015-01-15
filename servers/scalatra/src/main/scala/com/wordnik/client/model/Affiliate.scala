package com.wordnik.client.model

import java.util.Date
case class Affiliate (
  account: Double,

  currency: String,

  prevPayout: Option[Double],

  prevTurnover: Option[Double],

  prevComm: Option[Double],

  prevTimestamp: Option[Date],

  execTurnover: Option[Double],

  execComm: Option[Double],

  totalReferrals: Option[Double],

  totalTurnover: Option[Double],

  totalComm: Option[Double],

  payoutPcnt: Option[Double],

  pendingPayout: Option[Double],

  timestamp: Option[Date]

  )

