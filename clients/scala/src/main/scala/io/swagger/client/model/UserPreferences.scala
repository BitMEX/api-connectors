package io.swagger.client.model

import java.util.Date



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
  orderBookBinning: Number,
  orderBookType: String,
  orderControlsPlusMinus: Boolean,
  sounds: List[String],
  strictIPCheck: Boolean,
  strictTimeout: Boolean,
  tickerGroup: String,
  tickerPinned: Boolean,
  tradeLayout: String)
  
