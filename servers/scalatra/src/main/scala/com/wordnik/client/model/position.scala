package com.wordnik.client.model

import java.util.Date
case class Position (
  account: Double,

  symbol: String,

  currency: Option[String],

  prevPnl: Option[Double],

  prevClosePrice: Option[Double],

  openingTimestamp: Option[Date],

  openingBuyQty: Option[Double],

  openingBuyCost: Option[Double],

  openingSellQty: Option[Double],

  openingSellCost: Option[Double],

  openingQty: Option[Double],

  openingCost: Option[Double],

  openingComm: Option[Double],

  openOrderBuyQty: Option[Double],

  openOrderBuyCost: Option[Double],

  openOrderSellQty: Option[Double],

  openOrderSellCost: Option[Double],

  execBuyQty: Option[Double],

  execBuyCost: Option[Double],

  execSellQty: Option[Double],

  execSellCost: Option[Double],

  execQty: Option[Double],

  execCost: Option[Double],

  execComm: Option[Double],

  currentTimestamp: Option[Date],

  currentBuyQty: Option[Double],

  currentBuyCost: Option[Double],

  currentSellQty: Option[Double],

  currentSellCost: Option[Double],

  currentQty: Option[Double],

  currentCost: Option[Double],

  currentComm: Option[Double],

  grossOpenCost: Option[Double],

  grossExecCost: Option[Double],

  lastPrice: Option[Double],

  lastValue: Option[Double],

  initMargin: Option[Double],

  maintMargin: Option[Double],

  sessionMargin: Option[Double],

  targetExcessMargin: Option[Double],

  varMargin: Option[Double],

  pnl: Option[Double],

  pnlPcnt: Option[Double],

  avgBuyPrice: Option[Double],

  avgSellPrice: Option[Double],

  avgEntryPrice: Option[Double],

  breakEvenPrice: Option[Double],

  marginCallPrice: Option[Double],

  liquidationPrice: Option[Double],

  bankruptPrice: Option[Double],

  timestamp: Option[Date]

  )

