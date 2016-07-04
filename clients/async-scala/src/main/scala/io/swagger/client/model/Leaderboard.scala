package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Leaderboard (
  name: String,
isRealName: Option[Boolean],
isMe: Option[Boolean],
profit: Option[Double]
)
