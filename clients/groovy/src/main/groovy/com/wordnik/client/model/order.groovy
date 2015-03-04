package com.wordnik.client.model;

import groovy.transform.Canonical
import java.util.Date;
@Canonical
class Order {
  String orderID = null
  String clOrdID = null
  Double account = null
  String symbol = null
  String side = null
  Double simpleOrderQty = null
  Double orderQty = null
  Double price = null
  Double minQty = null
  Double stopPx = null
  String currency = null
  String settlCurrency = null
  String ordType = null
  String timeInForce = null
  String exDestination = null
  String ordStatus = null
  Boolean workingIndicator = null
  String ordRejReason = null
  Double simpleLeavesQty = null
  Double leavesQty = null
  Double simpleCumQty = null
  Double cumQty = null
  Double avgPx = null
  String multiLegReportingType = null
  String text = null
  Date transactTime = null
  Date timestamp = null
  }


