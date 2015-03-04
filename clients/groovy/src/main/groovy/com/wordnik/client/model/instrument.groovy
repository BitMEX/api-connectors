package com.wordnik.client.model;

import groovy.transform.Canonical
import java.util.Date;
@Canonical
class Instrument {
  String symbol = null
  String rootSymbol = null
  String state = null
  String typ = null
  Date listing = null
  Date front = null
  Date expiry = null
  Date relistInterval = null
  String inverseLeg = null
  String sellLeg = null
  String buyLeg = null
  String underlying = null
  String quoteCurrency = null
  String underlyingSymbol = null
  String reference = null
  String referenceSymbol = null
  Double tickSize = null
  Double multiplier = null
  String settlCurrency = null
  Double underlyingToSettleMultiplier = null
  Double quoteToSettleMultiplier = null
  Boolean isQuanto = null
  Boolean isInverse = null
  Double initMargin = null
  Double maintMargin = null
  Double limit = null
  Double makerFee = null
  Double takerFee = null
  Double insuranceFee = null
  Double hedgerMakerFee = null
  Double hedgerTakerFee = null
  Double hedgerInsuranceFee = null
  Date openingTimestamp = null
  Date closingTimestamp = null
  Date sessionInterval = null
  Double prevClosePrice = null
  Double limitDownPrice = null
  Double limitUpPrice = null
  Double prevTotalVolume = null
  Double totalVolume = null
  Double volume = null
  Double volume24h = null
  Double prevTotalTurnover = null
  Double totalTurnover = null
  Double turnover = null
  Double turnover24h = null
  Double vwap = null
  Double highPrice = null
  Double lowPrice = null
  Double lastPrice = null
  String lastTickDirection = null
  Double lastChangePcnt = null
  Double bidPrice = null
  Double midPrice = null
  Double askPrice = null
  Double openInterest = null
  Double openValue = null
  Double settledPrice = null
  Date timestamp = null
  }


