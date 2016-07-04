package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Chat (
  id: Option[Number],
date: Date,
user: String,
message: String,
html: String,
fromBot: Option[Boolean]
)
