package com.wordnik.client.model;

import groovy.transform.Canonical
import java.util.Date;
import com.wordnik.client.model.Object;
@Canonical
class User {
  String firstname = null
  String lastname = null
  String status = null
  String username = null
  String email = null
  String phone = null
  Double countryCode = null
  Date created = null
  Date lastUpdated = null
  Object preferences = null
  String role = null
  String TFAEnabled = null
  Double id = null
  }


