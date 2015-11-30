package io.swagger.model;

import java.util.*;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-30T13:35:50.750-06:00")
public class ApiKey  {
  
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
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  secret: ").append(secret).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  nonce: ").append(nonce).append("\n");
    sb.append("  cidr: ").append(cidr).append("\n");
    sb.append("  permissions: ").append(permissions).append("\n");
    sb.append("  enabled: ").append(enabled).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
