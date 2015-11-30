package io.swagger.client.model

import org.joda.time.DateTime


case class RoleMapping (
  id: Double,
  principalType: String,  // The principal type, such as user, application, or role
  principalId: String,
  roleId: Double
  
)
