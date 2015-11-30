package io.swagger.client.model

import java.util.Date



case class Chat (
  id: Number,
  date: Date,
  user: String,
  message: String,
  html: String,
  fromBot: Boolean)
  
