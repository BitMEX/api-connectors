package com.wordnik.client.model

import java.util.Date
case class Instrument (
  symbol: String,

  state: Option[String],

  typ: Option[String],

  listing: Option[Date],

  expiry: Option[Date],

  underlying: Option[String],

  buyLeg: Option[String],

  sellLeg: Option[String],

  quoteCurrency: Option[String],

  reference: Option[String],

  referenceSymbol: Option[String],

  tickSize: Option[Double],

  multiplier: Option[Double],

  settlCurrency: Option[String],

  initMargin: Option[Double],

  maintMargin: Option[Double],

  limit: Option[Double],

  openingTimestamp: Option[Date],

  closingTimestamp: Option[Date],

  prevClosePrice: Option[Double],

  limitDownPrice: Option[Double],

  limitUpPrice: Option[Double],

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

