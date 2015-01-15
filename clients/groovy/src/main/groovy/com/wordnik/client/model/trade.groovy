package com.wordnik.client.model;

import groovy.transform.Canonical
import java.util.Date;
@Canonical
class Trade {
  Date timestamp = null
  String symbol = null
  String side = null
  Double size = null
  Double price = null
  String tickDirection = null
  String trdMatchID = null
  Double grossValue = null
  Double homeNotional = null
  Double foreignNotional = null
  Double id = null
  }


