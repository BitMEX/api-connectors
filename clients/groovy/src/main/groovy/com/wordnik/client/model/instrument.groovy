package com.wordnik.client.model;

import groovy.transform.Canonical
import java.util.Date;
@Canonical
class Instrument {
  String symbol = null
  String state = null
  String typ = null
  Date listing = null
  Date expiry = null
  String underlying = null
  String buyLeg = null
  String sellLeg = null
  String quoteCurrency = null
  String reference = null
  String referenceSymbol = null
  Double tickSize = null
  Double multiplier = null
  String settlCurrency = null
  Double initMargin = null
  Double maintMargin = null
  Double limit = null
  Date openingTimestamp = null
  Date closingTimestamp = null
  Double prevClosePrice = null
  Double limitDownPrice = null
  Double limitUpPrice = null
  Double volume = null
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
  Double settledPrice = null
  Date timestamp = null
  }


