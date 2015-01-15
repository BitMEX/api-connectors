package com.wordnik.client.model

import java.util.Date
case class Affiliate (
  account: Double,
  currency: String,
  prevPayout: Double,
  prevTurnover: Double,
  prevComm: Double,
  prevTimestamp: Date,
  execTurnover: Double,
  execComm: Double,
  totalReferrals: Double,
  totalTurnover: Double,
  totalComm: Double,
  payoutPcnt: Double,
  pendingPayout: Double,
  timestamp: Date)

