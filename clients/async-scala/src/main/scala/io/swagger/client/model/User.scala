package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class User (
  id: Option[Number],
ownerId: Option[Number],
firstname: Option[String],
lastname: Option[String],
username: String,
email: String,
phone: Option[String],
created: Option[DateTime],
lastUpdated: Option[DateTime],
preferences: Option[UserPreferences],
TFAEnabled: Option[String],
affiliateID: Option[String],
pgpPubKey: Option[String],
country: Option[String]
)
