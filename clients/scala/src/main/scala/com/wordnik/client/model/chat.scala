package com.wordnik.client.model

import java.util.Date
case class Chat (
  id: Double,
  date: Date,
  user: String,
  message: String,
  html: String,
  fromBot: Boolean)

