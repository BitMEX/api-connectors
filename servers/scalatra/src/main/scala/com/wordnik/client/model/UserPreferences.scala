package com.wordnik.client.model

import java.util.Date
import java.math.BigDecimal


case class UserPreferences (
  announcementsLastSeen: Date,
  colorTheme: String,
  currency: String,
  debug: Boolean,
  disableEmails: List[String],
  hideConfirmDialogs: List[String],
  hideNotifications: List[String],
  hidePhoneConfirm: Boolean,
  msgsSeen: List[String],
  orderBookBinning: BigDecimal,
  orderControlsPlusMinus: Boolean,
  sounds: List[String],
  strictIPCheck: Boolean,
  tickerGroup: String,
  tickerPinned: Boolean,
  tradeLayout: String
)
