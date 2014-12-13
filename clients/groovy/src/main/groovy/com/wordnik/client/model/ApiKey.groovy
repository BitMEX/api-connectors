package com.wordnik.client.model;

import groovy.transform.Canonical
import com.wordnik.client.model.Object;
@Canonical
class ApiKey {
  String id = null
  String secret = null
  String name = null
  Double nonce = null
  String cidr = null
  Object constriants = null
  Boolean enabled = null
  Double userId = null
  }


