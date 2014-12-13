package com.wordnik.client.model

import java.util.Date
case class Transaction (
  transactID: String,

  account: Option[Double],

  currency: Option[String],

  transactType: Option[String],

  amount: Option[Double],

  transactStatus: Option[String],

  address: Option[String],

  tx: Option[String],

  text: Option[String],

  transactTime: Option[Date],

  timestamp: Option[Date]

  )

