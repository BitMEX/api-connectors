package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class AccessToken (
  id: String,
ttl: Option[Double],  // time to live in seconds (2 weeks by default)
created: Option[Date],
userId: Option[Double]
)
