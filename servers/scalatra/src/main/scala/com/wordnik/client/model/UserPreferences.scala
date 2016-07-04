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
  hideConnectionModal: Boolean,
  hideFromLeaderboard: Boolean,
  hideNameFromLeaderboard: Boolean,
  hideNotifications: List[String],
  hidePhoneConfirm: Boolean,
  locale: String,
  msgsSeen: List[String],
  orderBookBinning: BigDecimal,
  orderBookType: String,
  orderControlsPlusMinus: Boolean,
  sounds: List[String],
  strictIPCheck: Boolean,
  strictTimeout: Boolean,
  tickerGroup: String,
  tickerPinned: Boolean,
  tradeLayout: String
)
