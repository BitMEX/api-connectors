package io.swagger.client.model;

import io.swagger.client.StringUtil;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UserPreferences;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

import io.swagger.annotations.*;



/**
 * Account Operations
 **/
@ApiModel(description = "Account Operations")
public class User   {
  
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("ownerId")
  private BigDecimal ownerId = null;

  @SerializedName("firstname")
  private String firstname = null;

  @SerializedName("lastname")
  private String lastname = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("preferences")
  private UserPreferences preferences = null;

  @SerializedName("TFAEnabled")
  private String tfAEnabled = null;

  @SerializedName("affiliateID")
  private String affiliateID = null;

  @SerializedName("pgpPubKey")
  private String pgpPubKey = null;

  @SerializedName("country")
  private String country = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(BigDecimal ownerId) {
    this.ownerId = ownerId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFirstname() {
    return firstname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastname() {
    return lastname;
  }
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }
  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UserPreferences getPreferences() {
    return preferences;
  }
  public void setPreferences(UserPreferences preferences) {
    this.preferences = preferences;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTfAEnabled() {
    return tfAEnabled;
  }
  public void setTfAEnabled(String tfAEnabled) {
    this.tfAEnabled = tfAEnabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAffiliateID() {
    return affiliateID;
  }
  public void setAffiliateID(String affiliateID) {
    this.affiliateID = affiliateID;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPgpPubKey() {
    return pgpPubKey;
  }
  public void setPgpPubKey(String pgpPubKey) {
    this.pgpPubKey = pgpPubKey;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(id, user.id) &&
        Objects.equals(ownerId, user.ownerId) &&
        Objects.equals(firstname, user.firstname) &&
        Objects.equals(lastname, user.lastname) &&
        Objects.equals(username, user.username) &&
        Objects.equals(email, user.email) &&
        Objects.equals(phone, user.phone) &&
        Objects.equals(created, user.created) &&
        Objects.equals(lastUpdated, user.lastUpdated) &&
        Objects.equals(preferences, user.preferences) &&
        Objects.equals(tfAEnabled, user.tfAEnabled) &&
        Objects.equals(affiliateID, user.affiliateID) &&
        Objects.equals(pgpPubKey, user.pgpPubKey) &&
        Objects.equals(country, user.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ownerId, firstname, lastname, username, email, phone, created, lastUpdated, preferences, tfAEnabled, affiliateID, pgpPubKey, country);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    ownerId: ").append(StringUtil.toIndentedString(ownerId)).append("\n");
    sb.append("    firstname: ").append(StringUtil.toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(StringUtil.toIndentedString(lastname)).append("\n");
    sb.append("    username: ").append(StringUtil.toIndentedString(username)).append("\n");
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(StringUtil.toIndentedString(phone)).append("\n");
    sb.append("    created: ").append(StringUtil.toIndentedString(created)).append("\n");
    sb.append("    lastUpdated: ").append(StringUtil.toIndentedString(lastUpdated)).append("\n");
    sb.append("    preferences: ").append(StringUtil.toIndentedString(preferences)).append("\n");
    sb.append("    tfAEnabled: ").append(StringUtil.toIndentedString(tfAEnabled)).append("\n");
    sb.append("    affiliateID: ").append(StringUtil.toIndentedString(affiliateID)).append("\n");
    sb.append("    pgpPubKey: ").append(StringUtil.toIndentedString(pgpPubKey)).append("\n");
    sb.append("    country: ").append(StringUtil.toIndentedString(country)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
