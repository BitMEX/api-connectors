/**
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  ---  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  ---  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.XAny;
import java.math.BigDecimal;
import java.util.*;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Persistent API Keys for Developers
 **/
@ApiModel(description = "Persistent API Keys for Developers")
public class APIKey {
  
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
  private List<XAny> permissions = null;
  @SerializedName("enabled")
  private Boolean enabled = null;
  @SerializedName("userId")
  private BigDecimal userId = null;
  @SerializedName("created")
  private Date created = null;

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
  public Boolean getEnabled() {
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
    APIKey aPIKey = (APIKey) o;
    return (this.id == null ? aPIKey.id == null : this.id.equals(aPIKey.id)) &&
        (this.secret == null ? aPIKey.secret == null : this.secret.equals(aPIKey.secret)) &&
        (this.name == null ? aPIKey.name == null : this.name.equals(aPIKey.name)) &&
        (this.nonce == null ? aPIKey.nonce == null : this.nonce.equals(aPIKey.nonce)) &&
        (this.cidr == null ? aPIKey.cidr == null : this.cidr.equals(aPIKey.cidr)) &&
        (this.permissions == null ? aPIKey.permissions == null : this.permissions.equals(aPIKey.permissions)) &&
        (this.enabled == null ? aPIKey.enabled == null : this.enabled.equals(aPIKey.enabled)) &&
        (this.userId == null ? aPIKey.userId == null : this.userId.equals(aPIKey.userId)) &&
        (this.created == null ? aPIKey.created == null : this.created.equals(aPIKey.created));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.secret == null ? 0: this.secret.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.nonce == null ? 0: this.nonce.hashCode());
    result = 31 * result + (this.cidr == null ? 0: this.cidr.hashCode());
    result = 31 * result + (this.permissions == null ? 0: this.permissions.hashCode());
    result = 31 * result + (this.enabled == null ? 0: this.enabled.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIKey {\n");
    
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
