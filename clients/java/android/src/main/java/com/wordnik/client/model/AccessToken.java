package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
public class AccessToken {
  @JsonProperty("id")
  private String id = null;
  /* time to live in seconds (2 weeks by default) */
  @JsonProperty("ttl")
  private Double ttl = null;
  @JsonProperty("created")
  private Date created = null;
  @JsonProperty("userId")
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

