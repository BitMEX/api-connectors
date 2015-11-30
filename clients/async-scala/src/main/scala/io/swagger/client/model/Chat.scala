package io.swagger.client.model

import org.joda.time.DateTime


case class Chat (
  id: Number,
  date: Date,
  user: String,
  message: String,
  html: String,
  fromBot: Boolean
  
)
