/**
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

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * User Events for Auditing
 **/
@ApiModel(description = "User Events for Auditing")
public class UserEvent {
  
  @SerializedName("id")
  private Double id = null;
  public enum TypeEnum {
     apiKeyCreated,  deleverageExecution,  depositConfirmed,  depositPending,  banZeroVolumeApiUser,  liquidationOrderPlaced,  login,  existingAccountRegistrationAttempt,  passwordChanged,  positionStateLiquidated,  positionStateWarning,  resetPasswordConfirmed,  resetPasswordRequest,  transferCanceled,  transferCompleted,  transferReceived,  transferRequested,  twoFactorDisabled,  twoFactorEnabled,  withdrawalCanceled,  withdrawalCompleted,  withdrawalConfirmed,  withdrawalRequested,  addressSkipConfirmRequested,  addressSkipConfirmVerified,  verify,  restrictedAccount,  unrestrictedAccount,  disabledAccount,  enabledAccount,  role:roleMappingDestroy,  role:chatBanned,  role:withdrawalBanned,  role:orderBanned,  role:apiBanned,  role:restrictedJurisdictionPrivilege, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  public enum StatusEnum {
     success,  failure, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("userId")
  private Double userId = null;
  @SerializedName("createdById")
  private Double createdById = null;
  @SerializedName("ip")
  private String ip = null;
  @SerializedName("geoipCountry")
  private String geoipCountry = null;
  @SerializedName("geoipRegion")
  private String geoipRegion = null;
  @SerializedName("geoipSubRegion")
  private String geoipSubRegion = null;
  @SerializedName("eventMeta")
  private Object eventMeta = null;
  @SerializedName("created")
  private Date created = null;

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
   **/
  @ApiModelProperty(required = true, value = "")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getUserId() {
    return userId;
  }
  public void setUserId(Double userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getCreatedById() {
    return createdById;
  }
  public void setCreatedById(Double createdById) {
    this.createdById = createdById;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIp() {
    return ip;
  }
  public void setIp(String ip) {
    this.ip = ip;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getGeoipCountry() {
    return geoipCountry;
  }
  public void setGeoipCountry(String geoipCountry) {
    this.geoipCountry = geoipCountry;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getGeoipRegion() {
    return geoipRegion;
  }
  public void setGeoipRegion(String geoipRegion) {
    this.geoipRegion = geoipRegion;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getGeoipSubRegion() {
    return geoipSubRegion;
  }
  public void setGeoipSubRegion(String geoipSubRegion) {
    this.geoipSubRegion = geoipSubRegion;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getEventMeta() {
    return eventMeta;
  }
  public void setEventMeta(Object eventMeta) {
    this.eventMeta = eventMeta;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
    UserEvent userEvent = (UserEvent) o;
    return (this.id == null ? userEvent.id == null : this.id.equals(userEvent.id)) &&
        (this.type == null ? userEvent.type == null : this.type.equals(userEvent.type)) &&
        (this.status == null ? userEvent.status == null : this.status.equals(userEvent.status)) &&
        (this.userId == null ? userEvent.userId == null : this.userId.equals(userEvent.userId)) &&
        (this.createdById == null ? userEvent.createdById == null : this.createdById.equals(userEvent.createdById)) &&
        (this.ip == null ? userEvent.ip == null : this.ip.equals(userEvent.ip)) &&
        (this.geoipCountry == null ? userEvent.geoipCountry == null : this.geoipCountry.equals(userEvent.geoipCountry)) &&
        (this.geoipRegion == null ? userEvent.geoipRegion == null : this.geoipRegion.equals(userEvent.geoipRegion)) &&
        (this.geoipSubRegion == null ? userEvent.geoipSubRegion == null : this.geoipSubRegion.equals(userEvent.geoipSubRegion)) &&
        (this.eventMeta == null ? userEvent.eventMeta == null : this.eventMeta.equals(userEvent.eventMeta)) &&
        (this.created == null ? userEvent.created == null : this.created.equals(userEvent.created));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.createdById == null ? 0: this.createdById.hashCode());
    result = 31 * result + (this.ip == null ? 0: this.ip.hashCode());
    result = 31 * result + (this.geoipCountry == null ? 0: this.geoipCountry.hashCode());
    result = 31 * result + (this.geoipRegion == null ? 0: this.geoipRegion.hashCode());
    result = 31 * result + (this.geoipSubRegion == null ? 0: this.geoipSubRegion.hashCode());
    result = 31 * result + (this.eventMeta == null ? 0: this.eventMeta.hashCode());
    result = 31 * result + (this.created == null ? 0: this.created.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEvent {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  createdById: ").append(createdById).append("\n");
    sb.append("  ip: ").append(ip).append("\n");
    sb.append("  geoipCountry: ").append(geoipCountry).append("\n");
    sb.append("  geoipRegion: ").append(geoipRegion).append("\n");
    sb.append("  geoipSubRegion: ").append(geoipSubRegion).append("\n");
    sb.append("  eventMeta: ").append(eventMeta).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
