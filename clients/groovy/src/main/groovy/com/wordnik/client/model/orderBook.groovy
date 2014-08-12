package com.wordnik.client.model;

import groovy.transform.Canonical
import java.util.Date;
@Canonical
class OrderBook {
  String symbol = null
  Double level = null
  Double bidSize = null
  Double bidPrice = null
  Double askPrice = null
  Double askSize = null
  Date timestamp = null
  }


