package com.wordnik.client.model;

import groovy.transform.Canonical
import java.util.Date;
@Canonical
class Execution {
  String execID = null
  String orderID = null
  String clOrdID = null
  Double account = null
  String symbol = null
  String side = null
  Double lastQty = null
  Double lastPx = null
  Double underlyingLastPx = null
  String lastMkt = null
  String lastLiquidityInd = null
  Double orderQty = null
  Double price = null
  Double minQty = null
  Double stopPx = null
  String currency = null
  String settlCurrency = null
  String execType = null
  String ordType = null
  String timeInForce = null
  String exDestination = null
  String ordStatus = null
  Boolean workingIndicator = null
  String ordRejReason = null
  Double leavesQty = null
  Double cumQty = null
  Double avgPx = null
  Double commission = null
  String commType = null
  String tradePublishIndicator = null
  String multiLegReportingType = null
  String text = null
  String trdMatchID = null
  Double execCost = null
  Double execComm = null
  Double homeNotional = null
  Double foreignNotional = null
  Date transactTime = null
  Date timestamp = null
  }


