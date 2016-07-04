package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class ApiKey (
  id: String,
secret: String,
name: String,
nonce: Number,
cidr: Option[String],
permissions: Option[List[String]],
enabled: Option[Boolean],
userId: Number,
created: Option[Date]
)
