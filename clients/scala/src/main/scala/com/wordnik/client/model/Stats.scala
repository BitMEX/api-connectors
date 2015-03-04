package com.wordnik.client.model

case class Stats (
  rootSymbol: String,
  currency: String,
  volume24h: Double,
  turnover24h: Double,
  openInterest: Double,
  openValue: Double)

