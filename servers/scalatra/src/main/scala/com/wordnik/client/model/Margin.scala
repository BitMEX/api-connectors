package com.wordnik.client.model

import java.util.Date
case class Margin (
  account: Double,

  currency: String,

  commission: Option[Double],

  riskLimit: Option[Double],

  state: Option[String],

  action: Option[String],

  amount: Option[Double],

  pendingCredit: Option[Double],

  pendingDebit: Option[Double],

  prevRealisedPnl: Option[Double],

  prevUnrealisedPnl: Option[Double],

  grossComm: Option[Double],

  grossOpenCost: Option[Double],

  grossExecCost: Option[Double],

  grossLastValue: Option[Double],

  riskValue: Option[Double],

  initMargin: Option[Double],

  maintMargin: Option[Double],

  sessionMargin: Option[Double],

  targetExcessMargin: Option[Double],

  varMargin: Option[Double],

  realisedPnl: Option[Double],

  unrealisedPnl: Option[Double],

  walletBalance: Option[Double],

  marginBalance: Option[Double],

  marginBalancePcnt: Option[Double],

  marginLeverage: Option[Double],

  marginUsedPcnt: Option[Double],

  excessMargin: Option[Double],

  excessMarginPcnt: Option[Double],

  availableMargin: Option[Double],

  withdrawableMargin: Option[Double],

  timestamp: Option[Date]

  )

