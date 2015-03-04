package com.wordnik.client.model;

import groovy.transform.Canonical
import java.util.Date;
@Canonical
class StatsHistory {
  Date date = null
  String rootSymbol = null
  String currency = null
  Double volume = null
  Double turnover = null
  }


