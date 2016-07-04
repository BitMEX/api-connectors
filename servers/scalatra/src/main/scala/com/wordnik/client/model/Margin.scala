package com.wordnik.client.model

import java.math.BigDecimal
import java.util.Date


case class Margin (
  account: BigDecimal,
  currency: String,
  riskLimit: BigDecimal,
  prevState: String,
  state: String,
  action: String,
  amount: BigDecimal,
  pendingCredit: BigDecimal,
  pendingDebit: BigDecimal,
  confirmedDebit: BigDecimal,
  prevRealisedPnl: BigDecimal,
  prevUnrealisedPnl: BigDecimal,
  grossComm: BigDecimal,
  grossOpenCost: BigDecimal,
  grossOpenPremium: BigDecimal,
  grossExecCost: BigDecimal,
  grossMarkValue: BigDecimal,
  riskValue: BigDecimal,
  taxableMargin: BigDecimal,
  initMargin: BigDecimal,
  maintMargin: BigDecimal,
  sessionMargin: BigDecimal,
  targetExcessMargin: BigDecimal,
  varMargin: BigDecimal,
  realisedPnl: BigDecimal,
  unrealisedPnl: BigDecimal,
  indicativeTax: BigDecimal,
  unrealisedProfit: BigDecimal,
  syntheticMargin: BigDecimal,
  walletBalance: BigDecimal,
  marginBalance: BigDecimal,
  marginBalancePcnt: Double,
  marginLeverage: Double,
  marginUsedPcnt: Double,
  excessMargin: BigDecimal,
  excessMarginPcnt: Double,
  availableMargin: BigDecimal,
  withdrawableMargin: BigDecimal,
  timestamp: Date,
  grossLastValue: BigDecimal,
  commission: Double
)
