package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Announcement (
  id: Number,
link: Option[String],
title: Option[String],
content: Option[String],
date: Option[Date]
)
