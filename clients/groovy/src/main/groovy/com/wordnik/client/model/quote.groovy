package com.wordnik.client.model;

import groovy.transform.Canonical
import java.util.Date;
@Canonical
class Quote {
  Date timestamp = null
  String symbol = null
  Double bidSize = null
  Double bidPrice = null
  Double askPrice = null
  Double askSize = null
  Double id = null
  }


