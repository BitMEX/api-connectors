package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class APIKey (
  id: String,
secret: String,
name: String,
nonce: Number,
cidr: Option[String],
permissions: Option[List[X-any]],
enabled: Option[Boolean],
userId: Number,
created: Option[DateTime]
)
