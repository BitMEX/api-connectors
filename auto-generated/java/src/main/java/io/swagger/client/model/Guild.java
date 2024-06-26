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
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Guild
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-28T18:24:26.857+08:00")
public class Guild {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("updated")
  private OffsetDateTime updated = null;

  @SerializedName("archived")
  private Boolean archived = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("imgUrl")
  private String imgUrl = null;

  @SerializedName("mobileHeroImgUrl")
  private String mobileHeroImgUrl = null;

  @SerializedName("emoji")
  private String emoji = null;

  @SerializedName("logoUrl")
  private String logoUrl = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("chatChannelId")
  private Double chatChannelId = null;

  @SerializedName("isPrivate")
  private Boolean isPrivate = null;

  @SerializedName("affiliateId")
  private String affiliateId = null;

  @SerializedName("potDistributionPreferences")
  private Object potDistributionPreferences = null;

  @SerializedName("socials")
  private Object socials = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  public Guild id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Guild created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Guild updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public Guild archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @ApiModelProperty(value = "")
  public Boolean isArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public Guild name(String name) {
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

  public Guild imgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
    return this;
  }

   /**
   * Get imgUrl
   * @return imgUrl
  **/
  @ApiModelProperty(value = "")
  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public Guild mobileHeroImgUrl(String mobileHeroImgUrl) {
    this.mobileHeroImgUrl = mobileHeroImgUrl;
    return this;
  }

   /**
   * Get mobileHeroImgUrl
   * @return mobileHeroImgUrl
  **/
  @ApiModelProperty(value = "")
  public String getMobileHeroImgUrl() {
    return mobileHeroImgUrl;
  }

  public void setMobileHeroImgUrl(String mobileHeroImgUrl) {
    this.mobileHeroImgUrl = mobileHeroImgUrl;
  }

  public Guild emoji(String emoji) {
    this.emoji = emoji;
    return this;
  }

   /**
   * Get emoji
   * @return emoji
  **/
  @ApiModelProperty(value = "")
  public String getEmoji() {
    return emoji;
  }

  public void setEmoji(String emoji) {
    this.emoji = emoji;
  }

  public Guild logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @ApiModelProperty(value = "")
  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  public Guild description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Guild chatChannelId(Double chatChannelId) {
    this.chatChannelId = chatChannelId;
    return this;
  }

   /**
   * Get chatChannelId
   * @return chatChannelId
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getChatChannelId() {
    return chatChannelId;
  }

  public void setChatChannelId(Double chatChannelId) {
    this.chatChannelId = chatChannelId;
  }

  public Guild isPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
    return this;
  }

   /**
   * Get isPrivate
   * @return isPrivate
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsPrivate() {
    return isPrivate;
  }

  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }

  public Guild affiliateId(String affiliateId) {
    this.affiliateId = affiliateId;
    return this;
  }

   /**
   * Get affiliateId
   * @return affiliateId
  **/
  @ApiModelProperty(value = "")
  public String getAffiliateId() {
    return affiliateId;
  }

  public void setAffiliateId(String affiliateId) {
    this.affiliateId = affiliateId;
  }

  public Guild potDistributionPreferences(Object potDistributionPreferences) {
    this.potDistributionPreferences = potDistributionPreferences;
    return this;
  }

   /**
   * Get potDistributionPreferences
   * @return potDistributionPreferences
  **/
  @ApiModelProperty(value = "")
  public Object getPotDistributionPreferences() {
    return potDistributionPreferences;
  }

  public void setPotDistributionPreferences(Object potDistributionPreferences) {
    this.potDistributionPreferences = potDistributionPreferences;
  }

  public Guild socials(Object socials) {
    this.socials = socials;
    return this;
  }

   /**
   * Get socials
   * @return socials
  **/
  @ApiModelProperty(value = "")
  public Object getSocials() {
    return socials;
  }

  public void setSocials(Object socials) {
    this.socials = socials;
  }

  public Guild deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guild guild = (Guild) o;
    return Objects.equals(this.id, guild.id) &&
        Objects.equals(this.created, guild.created) &&
        Objects.equals(this.updated, guild.updated) &&
        Objects.equals(this.archived, guild.archived) &&
        Objects.equals(this.name, guild.name) &&
        Objects.equals(this.imgUrl, guild.imgUrl) &&
        Objects.equals(this.mobileHeroImgUrl, guild.mobileHeroImgUrl) &&
        Objects.equals(this.emoji, guild.emoji) &&
        Objects.equals(this.logoUrl, guild.logoUrl) &&
        Objects.equals(this.description, guild.description) &&
        Objects.equals(this.chatChannelId, guild.chatChannelId) &&
        Objects.equals(this.isPrivate, guild.isPrivate) &&
        Objects.equals(this.affiliateId, guild.affiliateId) &&
        Objects.equals(this.potDistributionPreferences, guild.potDistributionPreferences) &&
        Objects.equals(this.socials, guild.socials) &&
        Objects.equals(this.deleted, guild.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, updated, archived, name, imgUrl, mobileHeroImgUrl, emoji, logoUrl, description, chatChannelId, isPrivate, affiliateId, potDistributionPreferences, socials, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guild {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    imgUrl: ").append(toIndentedString(imgUrl)).append("\n");
    sb.append("    mobileHeroImgUrl: ").append(toIndentedString(mobileHeroImgUrl)).append("\n");
    sb.append("    emoji: ").append(toIndentedString(emoji)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    chatChannelId: ").append(toIndentedString(chatChannelId)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    affiliateId: ").append(toIndentedString(affiliateId)).append("\n");
    sb.append("    potDistributionPreferences: ").append(toIndentedString(potDistributionPreferences)).append("\n");
    sb.append("    socials: ").append(toIndentedString(socials)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

