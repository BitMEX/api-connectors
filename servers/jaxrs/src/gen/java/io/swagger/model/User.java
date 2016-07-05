package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.UserPreferences;
import java.math.BigDecimal;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class User   {
  
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
  public User id(BigDecimal id) {
    this.id = id;
    return this;
  }

  
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
  public User ownerId(BigDecimal ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  
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
  public User firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  
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
  public User lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  
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
  public User status(String status) {
    this.status = status;
    return this;
  }

  
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
  public User username(String username) {
    this.username = username;
    return this;
  }

  
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
  public User email(String email) {
    this.email = email;
    return this;
  }

  
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
  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

  
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
  public User countryCode(BigDecimal countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  
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
  public User created(Date created) {
    this.created = created;
    return this;
  }

  
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
  public User lastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  
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
  public User preferences(UserPreferences preferences) {
    this.preferences = preferences;
    return this;
  }

  
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
  public User tFAEnabled(String tFAEnabled) {
    this.tFAEnabled = tFAEnabled;
    return this;
  }

  
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
  public User affiliateID(String affiliateID) {
    this.affiliateID = affiliateID;
    return this;
  }

  
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
  public User pgpPubKey(String pgpPubKey) {
    this.pgpPubKey = pgpPubKey;
    return this;
  }

  
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
  public User country(String country) {
    this.country = country;
    return this;
  }

  
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
  public User disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  
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
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    tFAEnabled: ").append(toIndentedString(tFAEnabled)).append("\n");
    sb.append("    affiliateID: ").append(toIndentedString(affiliateID)).append("\n");
    sb.append("    pgpPubKey: ").append(toIndentedString(pgpPubKey)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

