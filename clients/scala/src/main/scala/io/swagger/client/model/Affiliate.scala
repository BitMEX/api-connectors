package io.swagger.client.model

import java.util.Date



case class Affiliate (
  account: Number,
  currency: String,
  prevPayout: Number,
  prevTurnover: Number,
  prevComm: Number,
  prevTimestamp: Date,
  execTurnover: Number,
  execComm: Number,
  totalReferrals: Number,
  totalTurnover: Number,
  totalComm: Number,
  payoutPcnt: Double,
  pendingPayout: Number,
  timestamp: Date)
  
