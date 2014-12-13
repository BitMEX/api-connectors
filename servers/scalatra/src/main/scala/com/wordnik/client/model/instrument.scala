package com.wordnik.client.model

import java.util.Date
case class Instrument (
  symbol: String,

  rootSymbol: Option[String],

  state: Option[String],

  typ: Option[String],

  listing: Option[Date],

  front: Option[Date],

  expiry: Option[Date],

  inverseLeg: Option[String],

  sellLeg: Option[String],

  buyLeg: Option[String],

  underlying: Option[String],

  quoteCurrency: Option[String],

  underlyingSymbol: Option[String],

  reference: Option[String],

  referenceSymbol: Option[String],

  tickSize: Option[Double],

  multiplier: Option[Double],

  settlCurrency: Option[String],

  underlyingToSettleMultiplier: Option[Double],

  quoteToSettleMultiplier: Option[Double],

  isQuanto: Option[Boolean],

  isInverse: Option[Boolean],

  initMargin: Option[Double],

  maintMargin: Option[Double],

  limit: Option[Double],

  makerFee: Option[Double],

  takerFee: Option[Double],

  insuranceFee: Option[Double],

  openingTimestamp: Option[Date],

  closingTimestamp: Option[Date],

  prevClosePrice: Option[Double],

  limitDownPrice: Option[Double],

  limitUpPrice: Option[Double],

  prevTotalVolume: Option[Double],

  totalVolume: Option[Double],

  volume: Option[Double],

  vwap: Option[Double],

  highPrice: Option[Double],

  lowPrice: Option[Double],

  lastPrice: Option[Double],

  lastTickDirection: Option[String],

  lastChangePcnt: Option[Double],

  bidPrice: Option[Double],

  midPrice: Option[Double],

  askPrice: Option[Double],

  openInterest: Option[Double],

  settledPrice: Option[Double],

  timestamp: Option[Date]

  )

