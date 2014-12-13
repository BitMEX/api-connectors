package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.wordnik.client.model.Object;
public class ApiKey {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("secret")
  private String secret = null;
  @JsonProperty("name")
  private String name = null;
  @JsonProperty("nonce")
  private Double nonce = null;
  @JsonProperty("cidr")
  private String cidr = null;
  @JsonProperty("constriants")
  private Object constriants = null;
  @JsonProperty("enabled")
  private Boolean enabled = null;
  @JsonProperty("userId")
  private Double userId = null;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getSecret() {
    return secret;
  }
  public void setSecret(String secret) {
    this.secret = secret;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Double getNonce() {
    return nonce;
  }
  public void setNonce(Double nonce) {
    this.nonce = nonce;
  }

  public String getCidr() {
    return cidr;
  }
  public void setCidr(String cidr) {
    this.cidr = cidr;
  }

  public Object getConstriants() {
    return constriants;
  }
  public void setConstriants(Object constriants) {
    this.constriants = constriants;
  }

  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
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
    sb.append("class ApiKey {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  secret: ").append(secret).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  nonce: ").append(nonce).append("\n");
    sb.append("  cidr: ").append(cidr).append("\n");
    sb.append("  constriants: ").append(constriants).append("\n");
    sb.append("  enabled: ").append(enabled).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

