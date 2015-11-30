package io.swagger.client.model

import org.joda.time.DateTime


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
  orderBookBinning: Number,
  orderControlsPlusMinus: Boolean,
  sounds: List[String],
  strictIPCheck: Boolean,
  tickerGroup: String,
  tickerPinned: Boolean,
  tradeLayout: String
  
)
