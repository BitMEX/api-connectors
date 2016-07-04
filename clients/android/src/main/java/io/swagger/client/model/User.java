package io.swagger.client.model;

import io.swagger.client.model.UserPreferences;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class User  {
  
  @SerializedName("id")
  private BigDecimal id = null;
  @SerializedName("ownerId")
  private BigDecimal ownerId = null;
  @SerializedName("firstname")
  private String firstname = null;
  @SerializedName("lastname")
  private String lastname = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("username")
  private String username = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("countryCode")
  private BigDecimal countryCode = null;
  @SerializedName("created")
  private Date created = null;
  @SerializedName("lastUpdated")
  private Date lastUpdated = null;
  @SerializedName("preferences")
  private UserPreferences preferences = null;
  @SerializedName("TFAEnabled")
  private String tFAEnabled = null;
  @SerializedName("affiliateID")
  private String affiliateID = null;
  @SerializedName("pgpPubKey")
  private String pgpPubKey = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("disabled")
  private Boolean disabled = null;

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
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
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
  public BigDecimal getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(BigDecimal countryCode) {
    this.countryCode = countryCode;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getLastUpdated() {
    return lastUpdated;
  }
  public void setLastUpdated(Date lastUpdated) {
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
  public String getTFAEnabled() {
    return tFAEnabled;
  }
  public void setTFAEnabled(String tFAEnabled) {
    this.tFAEnabled = tFAEnabled;
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

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (id == null ? user.id == null : id.equals(user.id)) &&
        (ownerId == null ? user.ownerId == null : ownerId.equals(user.ownerId)) &&
        (firstname == null ? user.firstname == null : firstname.equals(user.firstname)) &&
        (lastname == null ? user.lastname == null : lastname.equals(user.lastname)) &&
        (status == null ? user.status == null : status.equals(user.status)) &&
        (username == null ? user.username == null : username.equals(user.username)) &&
        (email == null ? user.email == null : email.equals(user.email)) &&
        (phone == null ? user.phone == null : phone.equals(user.phone)) &&
        (countryCode == null ? user.countryCode == null : countryCode.equals(user.countryCode)) &&
        (created == null ? user.created == null : created.equals(user.created)) &&
        (lastUpdated == null ? user.lastUpdated == null : lastUpdated.equals(user.lastUpdated)) &&
        (preferences == null ? user.preferences == null : preferences.equals(user.preferences)) &&
        (tFAEnabled == null ? user.tFAEnabled == null : tFAEnabled.equals(user.tFAEnabled)) &&
        (affiliateID == null ? user.affiliateID == null : affiliateID.equals(user.affiliateID)) &&
        (pgpPubKey == null ? user.pgpPubKey == null : pgpPubKey.equals(user.pgpPubKey)) &&
        (country == null ? user.country == null : country.equals(user.country)) &&
        (disabled == null ? user.disabled == null : disabled.equals(user.disabled));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (ownerId == null ? 0: ownerId.hashCode());
    result = 31 * result + (firstname == null ? 0: firstname.hashCode());
    result = 31 * result + (lastname == null ? 0: lastname.hashCode());
    result = 31 * result + (status == null ? 0: status.hashCode());
    result = 31 * result + (username == null ? 0: username.hashCode());
    result = 31 * result + (email == null ? 0: email.hashCode());
    result = 31 * result + (phone == null ? 0: phone.hashCode());
    result = 31 * result + (countryCode == null ? 0: countryCode.hashCode());
    result = 31 * result + (created == null ? 0: created.hashCode());
    result = 31 * result + (lastUpdated == null ? 0: lastUpdated.hashCode());
    result = 31 * result + (preferences == null ? 0: preferences.hashCode());
    result = 31 * result + (tFAEnabled == null ? 0: tFAEnabled.hashCode());
    result = 31 * result + (affiliateID == null ? 0: affiliateID.hashCode());
    result = 31 * result + (pgpPubKey == null ? 0: pgpPubKey.hashCode());
    result = 31 * result + (country == null ? 0: country.hashCode());
    result = 31 * result + (disabled == null ? 0: disabled.hashCode());
    return result;
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
