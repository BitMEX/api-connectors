package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import com.wordnik.client.model.Object;
public class User {
  @JsonProperty("firstname")
  private String firstname = null;
  @JsonProperty("lastname")
  private String lastname = null;
  @JsonProperty("status")
  private String status = null;
  @JsonProperty("username")
  private String username = null;
  @JsonProperty("email")
  private String email = null;
  @JsonProperty("phone")
  private String phone = null;
  @JsonProperty("countryCode")
  private Double countryCode = null;
  @JsonProperty("created")
  private Date created = null;
  @JsonProperty("lastUpdated")
  private Date lastUpdated = null;
  @JsonProperty("preferences")
  private Object preferences = null;
  @JsonProperty("role")
  private String role = null;
  @JsonProperty("TFAEnabled")
  private String TFAEnabled = null;
  @JsonProperty("id")
  private Double id = null;
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

  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
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
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

