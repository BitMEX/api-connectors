package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;
import java.math.BigDecimal;
import java.util.Date;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T18:25:18.235-05:00")
public class ApiKey   {
  
  private String id = null;
  private String secret = null;
  private String name = null;
  private BigDecimal nonce = null;
  private String cidr = null;
  private List<String> permissions = new ArrayList<String>();
  private Boolean enabled = false;
  private BigDecimal userId = null;
  private Date created = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("secret")
  public String getSecret() {
    return secret;
  }
  public void setSecret(String secret) {
    this.secret = secret;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("nonce")
  public BigDecimal getNonce() {
    return nonce;
  }
  public void setNonce(BigDecimal nonce) {
    this.nonce = nonce;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("cidr")
  public String getCidr() {
    return cidr;
  }
  public void setCidr(String cidr) {
    this.cidr = cidr;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("userId")
  public BigDecimal getUserId() {
    return userId;
  }
  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKey apiKey = (ApiKey) o;
    return Objects.equals(id, apiKey.id) &&
        Objects.equals(secret, apiKey.secret) &&
        Objects.equals(name, apiKey.name) &&
        Objects.equals(nonce, apiKey.nonce) &&
        Objects.equals(cidr, apiKey.cidr) &&
        Objects.equals(permissions, apiKey.permissions) &&
        Objects.equals(enabled, apiKey.enabled) &&
        Objects.equals(userId, apiKey.userId) &&
        Objects.equals(created, apiKey.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, secret, name, nonce, cidr, permissions, enabled, userId, created);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKey {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    secret: ").append(StringUtil.toIndentedString(secret)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    nonce: ").append(StringUtil.toIndentedString(nonce)).append("\n");
    sb.append("    cidr: ").append(StringUtil.toIndentedString(cidr)).append("\n");
    sb.append("    permissions: ").append(StringUtil.toIndentedString(permissions)).append("\n");
    sb.append("    enabled: ").append(StringUtil.toIndentedString(enabled)).append("\n");
    sb.append("    userId: ").append(StringUtil.toIndentedString(userId)).append("\n");
    sb.append("    created: ").append(StringUtil.toIndentedString(created)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
