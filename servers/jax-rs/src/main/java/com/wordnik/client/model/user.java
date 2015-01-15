package com.wordnik.client.model;

import java.util.Date;
import com.wordnik.client.model.Object;
public class User {
  private Double id = null;
  private String firstname = null;
  private String lastname = null;
  private String status = null;
  private String username = null;
  private String email = null;
  private String phone = null;
  private Double countryCode = null;
  private Date created = null;
  private Date lastUpdated = null;
  private Object preferences = null;
  private String role = null;
  private String TFAEnabled = null;
  private String affiliateID = null;
  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Double getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(Double countryCode) {
    this.countryCode = countryCode;
  }

  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  public Date getLastUpdated() {
    return lastUpdated;
  }
  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public Object getPreferences() {
    return preferences;
  }
  public void setPreferences(Object preferences) {
    this.preferences = preferences;
  }

  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }

  public String getTFAEnabled() {
    return TFAEnabled;
  }
  public void setTFAEnabled(String TFAEnabled) {
    this.TFAEnabled = TFAEnabled;
  }

  public String getAffiliateID() {
    return affiliateID;
  }
  public void setAffiliateID(String affiliateID) {
    this.affiliateID = affiliateID;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("  id: ").append(id).append("\n");
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
    sb.append("  role: ").append(role).append("\n");
    sb.append("  TFAEnabled: ").append(TFAEnabled).append("\n");
    sb.append("  affiliateID: ").append(affiliateID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

