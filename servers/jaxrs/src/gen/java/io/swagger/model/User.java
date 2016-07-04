package io.swagger.model;

import io.swagger.model.UserPreferences;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class User  {
  
  private BigDecimal id = null;
  private BigDecimal ownerId = null;
  private String firstname = null;
  private String lastname = null;
  private String status = null;
  private String username = null;
  private String email = null;
  private String phone = null;
  private BigDecimal countryCode = null;
  private Date created = null;
  private Date lastUpdated = null;
  private UserPreferences preferences = null;
  private String tFAEnabled = null;
  private String affiliateID = null;
  private String pgpPubKey = null;
  private String country = null;
  private Boolean disabled = false;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("ownerId")
  public BigDecimal getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(BigDecimal ownerId) {
    this.ownerId = ownerId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("firstname")
  public String getFirstname() {
    return firstname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lastname")
  public String getLastname() {
    return lastname;
  }
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("countryCode")
  public BigDecimal getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(BigDecimal countryCode) {
    this.countryCode = countryCode;
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lastUpdated")
  public Date getLastUpdated() {
    return lastUpdated;
  }
  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("preferences")
  public UserPreferences getPreferences() {
    return preferences;
  }
  public void setPreferences(UserPreferences preferences) {
    this.preferences = preferences;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("TFAEnabled")
  public String getTFAEnabled() {
    return tFAEnabled;
  }
  public void setTFAEnabled(String tFAEnabled) {
    this.tFAEnabled = tFAEnabled;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("affiliateID")
  public String getAffiliateID() {
    return affiliateID;
  }
  public void setAffiliateID(String affiliateID) {
    this.affiliateID = affiliateID;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pgpPubKey")
  public String getPgpPubKey() {
    return pgpPubKey;
  }
  public void setPgpPubKey(String pgpPubKey) {
    this.pgpPubKey = pgpPubKey;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("disabled")
  public Boolean getDisabled() {
    return disabled;
  }
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
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
        Objects.equals(status, user.status) &&
        Objects.equals(username, user.username) &&
        Objects.equals(email, user.email) &&
        Objects.equals(phone, user.phone) &&
        Objects.equals(countryCode, user.countryCode) &&
        Objects.equals(created, user.created) &&
        Objects.equals(lastUpdated, user.lastUpdated) &&
        Objects.equals(preferences, user.preferences) &&
        Objects.equals(tFAEnabled, user.tFAEnabled) &&
        Objects.equals(affiliateID, user.affiliateID) &&
        Objects.equals(pgpPubKey, user.pgpPubKey) &&
        Objects.equals(country, user.country) &&
        Objects.equals(disabled, user.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ownerId, firstname, lastname, status, username, email, phone, countryCode, created, lastUpdated, preferences, tFAEnabled, affiliateID, pgpPubKey, country, disabled);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  ownerId: ").append(ownerId).append("\n");
    sb.append("  firstname: ").append(firstname).append("\n");
    sb.append("  lastname: ").append(lastname).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  lastUpdated: ").append(lastUpdated).append("\n");
    sb.append("  preferences: ").append(preferences).append("\n");
    sb.append("  tFAEnabled: ").append(tFAEnabled).append("\n");
    sb.append("  affiliateID: ").append(affiliateID).append("\n");
    sb.append("  pgpPubKey: ").append(pgpPubKey).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  disabled: ").append(disabled).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
