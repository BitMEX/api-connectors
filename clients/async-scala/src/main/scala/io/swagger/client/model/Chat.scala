package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Chat (
  id: Option[Number],
date: DateTime,
user: String,
message: String,
html: String,
fromBot: Option[Boolean],
channelID: Option[Double]
)
