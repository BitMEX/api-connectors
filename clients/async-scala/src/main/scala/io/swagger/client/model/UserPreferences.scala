package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class UserPreferences (
  announcementsLastSeen: Option[Date],
colorTheme: Option[String],
currency: Option[String],
debug: Option[Boolean],
disableEmails: Option[List[String]],
hideConfirmDialogs: Option[List[String]],
hideConnectionModal: Option[Boolean],
hideFromLeaderboard: Option[Boolean],
hideNameFromLeaderboard: Option[Boolean],
hideNotifications: Option[List[String]],
hidePhoneConfirm: Option[Boolean],
locale: Option[String],
msgsSeen: Option[List[String]],
orderBookBinning: Option[Number],
orderBookType: Option[String],
orderControlsPlusMinus: Option[Boolean],
sounds: Option[List[String]],
strictIPCheck: Option[Boolean],
strictTimeout: Option[Boolean],
tickerGroup: Option[String],
tickerPinned: Option[Boolean],
tradeLayout: Option[String]
)
