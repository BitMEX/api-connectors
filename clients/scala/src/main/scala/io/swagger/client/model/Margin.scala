package io.swagger.client.model

import java.util.Date



case class Margin (
  account: Number,
  currency: String,
  riskLimit: Number,
  prevState: String,
  state: String,
  action: String,
  amount: Number,
  pendingCredit: Number,
  pendingDebit: Number,
  confirmedDebit: Number,
  prevRealisedPnl: Number,
  prevUnrealisedPnl: Number,
  grossComm: Number,
  grossOpenCost: Number,
  grossOpenPremium: Number,
  grossExecCost: Number,
  grossMarkValue: Number,
  riskValue: Number,
  taxableMargin: Number,
  initMargin: Number,
  maintMargin: Number,
  sessionMargin: Number,
  targetExcessMargin: Number,
  varMargin: Number,
  realisedPnl: Number,
  unrealisedPnl: Number,
  indicativeTax: Number,
  unrealisedProfit: Number,
  syntheticMargin: Number,
  walletBalance: Number,
  marginBalance: Number,
  marginBalancePcnt: Double,
  marginLeverage: Double,
  marginUsedPcnt: Double,
  excessMargin: Number,
  excessMarginPcnt: Double,
  availableMargin: Number,
  withdrawableMargin: Number,
  timestamp: Date,
  grossLastValue: Number,
  commission: Double)
  
