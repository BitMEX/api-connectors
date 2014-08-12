package com.wordnik.client.model;

import java.util.Date;
public class Chat {
  private Double id = null;
  private Date date = null;
  private String user = null;
  private String message = null;
  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chat {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

