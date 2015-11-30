package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Map principals to roles
 **/
@ApiModel(description = "Map principals to roles")
public class RoleMapping  {
  
  @SerializedName("id")
  private Double id = null;
  @SerializedName("principalType")
  private String principalType = null;
  @SerializedName("principalId")
  private String principalId = null;
  @SerializedName("roleId")
  private Double roleId = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
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
  public String getPrincipalType() {
    return principalType;
  }
  public void setPrincipalType(String principalType) {
    this.principalType = principalType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getPrincipalId() {
    return principalId;
  }
  public void setPrincipalId(String principalId) {
    this.principalId = principalId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getRoleId() {
    return roleId;
  }
  public void setRoleId(Double roleId) {
    this.roleId = roleId;
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
