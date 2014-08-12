package com.wordnik.client.model;

import java.util.Date;
import com.wordnik.client.model.AnonymousModel_6;
public class User {
  private String firstname = null;
  private String lastname = null;
  private String username = null;
  private String email = null;
  private Boolean emailVerified = null;
  private String phone = null;
  private Boolean phoneVerified = null;
  private String status = null;
  private Date created = null;
  private Date lastUpdated = null;
  private AnonymousModel_6 preferences = null;
  private Boolean isEmployee = null;
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

  public Boolean getEmailVerified() {
    return emailVerified;
  }
  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Boolean getPhoneVerified() {
    return phoneVerified;
  }
  public void setPhoneVerified(Boolean phoneVerified) {
    this.phoneVerified = phoneVerified;
  }

  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
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

  public AnonymousModel_6 getPreferences() {
    return preferences;
  }
  public void setPreferences(AnonymousModel_6 preferences) {
    this.preferences = preferences;
  }

  public Boolean getIsEmployee() {
    return isEmployee;
  }
  public void setIsEmployee(Boolean isEmployee) {
    this.isEmployee = isEmployee;
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
    sb.append("  username: ").append(username).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  emailVerified: ").append(emailVerified).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  phoneVerified: ").append(phoneVerified).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  lastUpdated: ").append(lastUpdated).append("\n");
    sb.append("  preferences: ").append(preferences).append("\n");
    sb.append("  isEmployee: ").append(isEmployee).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

