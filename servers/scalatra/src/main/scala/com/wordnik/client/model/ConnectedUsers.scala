package com.wordnik.client.model

import java.math.BigDecimal


case class ConnectedUsers (
  users: BigDecimal,
  bots: BigDecimal
)
