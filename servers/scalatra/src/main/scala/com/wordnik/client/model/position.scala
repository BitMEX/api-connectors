package com.wordnik.client.model

import java.util.Date
case class Position (
  account: Double,

  symbol: String,

  underlying: Option[String],

  quoteCurrency: Option[String],

  currency: Option[String],

  commission: Option[Double],

  prevRealisedPnl: Option[Double],

  prevUnrealisedPnl: Option[Double],

  prevClosePrice: Option[Double],

  realisedCost: Option[Double],

  realisedPnl: Option[Double],

  openingTimestamp: Option[Date],

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

  currentQty: Option[Double],

  currentCost: Option[Double],

  currentComm: Option[Double],

  unrealisedCost: Option[Double],

  grossOpenCost: Option[Double],

  grossExecCost: Option[Double],

  lastPrice: Option[Double],

  lastValue: Option[Double],

  homeNotional: Option[Double],

  foreignNotional: Option[Double],

  notionalCurrency1: Option[String],

  notionalValue1: Option[Double],

  notionalCurrency2: Option[String],

  notionalValue2: Option[Double],

  initMargin: Option[Double],

  maintMargin: Option[Double],

  sessionMargin: Option[Double],

  targetExcessMargin: Option[Double],

  varMargin: Option[Double],

  unrealisedPnl: Option[Double],

  unrealisedPnlPcnt: Option[Double],

  avgEntryPrice: Option[Double],

  breakEvenPrice: Option[Double],

  marginCallPrice: Option[Double],

  liquidationPrice: Option[Double],

  bankruptPrice: Option[Double],

  timestamp: Option[Date]

  )

