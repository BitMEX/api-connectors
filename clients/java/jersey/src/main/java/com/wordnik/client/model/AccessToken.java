package com.wordnik.client.model;

import java.util.Date;
public class AccessToken {
  private String id = null;
  /* time to live in seconds (2 weeks by default) */
  private Double ttl = null;
  private Date created = null;
  private Double userId = null;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public Double getTtl() {
    return ttl;
  }
  public void setTtl(Double ttl) {
    this.ttl = ttl;
  }

  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  public Double getUserId() {
    return userId;
  }
  public void setUserId(Double userId) {
    this.userId = userId;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessToken {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  ttl: ").append(ttl).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

