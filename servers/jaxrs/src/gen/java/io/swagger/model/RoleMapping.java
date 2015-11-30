package io.swagger.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * Map principals to roles
 **/
@ApiModel(description = "Map principals to roles")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class RoleMapping  {
  
  private Double id = null;
  private String principalType = null;
  private String principalId = null;
  private Double roleId = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  
  /**
   * The principal type, such as user, application, or role
   **/
  @ApiModelProperty(value = "The principal type, such as user, application, or role")
  @JsonProperty("principalType")
  public String getPrincipalType() {
    return principalType;
  }
  public void setPrincipalType(String principalType) {
    this.principalType = principalType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("principalId")
  public String getPrincipalId() {
    return principalId;
  }
  public void setPrincipalId(String principalId) {
    this.principalId = principalId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("roleId")
  public Double getRoleId() {
    return roleId;
  }
  public void setRoleId(Double roleId) {
    this.roleId = roleId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleMapping roleMapping = (RoleMapping) o;
    return Objects.equals(id, roleMapping.id) &&
        Objects.equals(principalType, roleMapping.principalType) &&
        Objects.equals(principalId, roleMapping.principalId) &&
        Objects.equals(roleId, roleMapping.roleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, principalType, principalId, roleId);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleMapping {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  principalType: ").append(principalType).append("\n");
    sb.append("  principalId: ").append(principalId).append("\n");
    sb.append("  roleId: ").append(roleId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
