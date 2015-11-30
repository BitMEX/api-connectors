package com.wordnik.client.model

import java.math.BigDecimal
import java.util.Date


case class Affiliate (
  account: BigDecimal,
  currency: String,
  prevPayout: BigDecimal,
  prevTurnover: BigDecimal,
  prevComm: BigDecimal,
  prevTimestamp: Date,
  execTurnover: BigDecimal,
  execComm: BigDecimal,
  totalReferrals: BigDecimal,
  totalTurnover: BigDecimal,
  totalComm: BigDecimal,
  payoutPcnt: Double,
  pendingPayout: BigDecimal,
  timestamp: Date
)
