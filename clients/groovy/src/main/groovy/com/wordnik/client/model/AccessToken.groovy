package com.wordnik.client.model;

import groovy.transform.Canonical
import java.util.Date;
@Canonical
class AccessToken {
  String id = null
  /* time to live in seconds (2 weeks by default) */
  Double ttl = null
  Date created = null
  Double userId = null
  }


