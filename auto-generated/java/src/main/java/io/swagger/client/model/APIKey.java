package io.swagger.client.model;

import io.swagger.client.StringUtil;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.XAny;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

import io.swagger.annotations.*;



/**
 * Persistent API Keys for Developers
 **/
@ApiModel(description = "Persistent API Keys for Developers")
public class APIKey   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nonce")
  private BigDecimal nonce = null;

  @SerializedName("cidr")
  private String cidr = null;

  @SerializedName("permissions")
  private List<XAny> permissions = new ArrayList<XAny>();

  @SerializedName("enabled")
  private Boolean enabled = false;

  @SerializedName("userId")
  private BigDecimal userId = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSecret() {
    return secret;
  }
  public void setSecret(String secret) {
    this.secret = secret;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getNonce() {
    return nonce;
  }
  public void setNonce(BigDecimal nonce) {
    this.nonce = nonce;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCidr() {
    return cidr;
  }
  public void setCidr(String cidr) {
    this.cidr = cidr;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<XAny> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<XAny> permissions) {
    this.permissions = permissions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean isEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getUserId() {
    return userId;
  }
  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }
  public void setCreated(OffsetDateTime created) {
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
    APIKey apIKey = (APIKey) o;
    return Objects.equals(id, apIKey.id) &&
        Objects.equals(secret, apIKey.secret) &&
        Objects.equals(name, apIKey.name) &&
        Objects.equals(nonce, apIKey.nonce) &&
        Objects.equals(cidr, apIKey.cidr) &&
        Objects.equals(permissions, apIKey.permissions) &&
        Objects.equals(enabled, apIKey.enabled) &&
        Objects.equals(userId, apIKey.userId) &&
        Objects.equals(created, apIKey.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, secret, name, nonce, cidr, permissions, enabled, userId, created);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIKey {\n");
    
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
