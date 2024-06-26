/*
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.XAny;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Persistent API Keys for Developers
 */
@ApiModel(description = "Persistent API Keys for Developers")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-28T18:24:26.857+08:00")
public class APIKey {
  @SerializedName("id")
  private String id = null;

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nonce")
  private Long nonce = 0l;

  @SerializedName("cidr")
  private String cidr = null;

  @SerializedName("cidrs")
  private List<XAny> cidrs = null;

  @SerializedName("targetAccountId")
  private Integer targetAccountId = null;

  @SerializedName("permissions")
  private List<XAny> permissions = null;

  @SerializedName("enabled")
  private Boolean enabled = false;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  public APIKey id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public APIKey secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public APIKey name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public APIKey nonce(Long nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * Get nonce
   * @return nonce
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getNonce() {
    return nonce;
  }

  public void setNonce(Long nonce) {
    this.nonce = nonce;
  }

  public APIKey cidr(String cidr) {
    this.cidr = cidr;
    return this;
  }

   /**
   * Get cidr
   * @return cidr
  **/
  @ApiModelProperty(value = "")
  public String getCidr() {
    return cidr;
  }

  public void setCidr(String cidr) {
    this.cidr = cidr;
  }

  public APIKey cidrs(List<XAny> cidrs) {
    this.cidrs = cidrs;
    return this;
  }

  public APIKey addCidrsItem(XAny cidrsItem) {
    if (this.cidrs == null) {
      this.cidrs = new ArrayList<XAny>();
    }
    this.cidrs.add(cidrsItem);
    return this;
  }

   /**
   * Get cidrs
   * @return cidrs
  **/
  @ApiModelProperty(value = "")
  public List<XAny> getCidrs() {
    return cidrs;
  }

  public void setCidrs(List<XAny> cidrs) {
    this.cidrs = cidrs;
  }

  public APIKey targetAccountId(Integer targetAccountId) {
    this.targetAccountId = targetAccountId;
    return this;
  }

   /**
   * Get targetAccountId
   * @return targetAccountId
  **/
  @ApiModelProperty(value = "")
  public Integer getTargetAccountId() {
    return targetAccountId;
  }

  public void setTargetAccountId(Integer targetAccountId) {
    this.targetAccountId = targetAccountId;
  }

  public APIKey permissions(List<XAny> permissions) {
    this.permissions = permissions;
    return this;
  }

  public APIKey addPermissionsItem(XAny permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<XAny>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @ApiModelProperty(value = "")
  public List<XAny> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<XAny> permissions) {
    this.permissions = permissions;
  }

  public APIKey enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public APIKey userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public APIKey created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIKey apIKey = (APIKey) o;
    return Objects.equals(this.id, apIKey.id) &&
        Objects.equals(this.secret, apIKey.secret) &&
        Objects.equals(this.name, apIKey.name) &&
        Objects.equals(this.nonce, apIKey.nonce) &&
        Objects.equals(this.cidr, apIKey.cidr) &&
        Objects.equals(this.cidrs, apIKey.cidrs) &&
        Objects.equals(this.targetAccountId, apIKey.targetAccountId) &&
        Objects.equals(this.permissions, apIKey.permissions) &&
        Objects.equals(this.enabled, apIKey.enabled) &&
        Objects.equals(this.userId, apIKey.userId) &&
        Objects.equals(this.created, apIKey.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, secret, name, nonce, cidr, cidrs, targetAccountId, permissions, enabled, userId, created);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIKey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    cidrs: ").append(toIndentedString(cidrs)).append("\n");
    sb.append("    targetAccountId: ").append(toIndentedString(targetAccountId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

