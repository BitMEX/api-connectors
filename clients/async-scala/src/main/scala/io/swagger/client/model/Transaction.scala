package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Transaction (
  transactID: String,
account: Option[Number],
currency: Option[String],
transactType: Option[String],
amount: Option[Number],
fee: Option[Number],
transactStatus: Option[String],
address: Option[String],
tx: Option[String],
text: Option[String],
transactTime: Option[DateTime],
timestamp: Option[DateTime]
)
