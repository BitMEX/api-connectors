package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T18:25:18.235-05:00")
public class AccessToken   {
  
  private String id = null;
  private Double ttl = 1209600.0d;
  private Date created = null;
  private Double userId = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * time to live in seconds (2 weeks by default)
   **/
  @ApiModelProperty(value = "time to live in seconds (2 weeks by default)")
  @JsonProperty("ttl")
  public Double getTtl() {
    return ttl;
  }
  public void setTtl(Double ttl) {
    this.ttl = ttl;
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
  @JsonProperty("userId")
  public Double getUserId() {
    return userId;
  }
  public void setUserId(Double userId) {
    this.userId = userId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessToken accessToken = (AccessToken) o;
    return Objects.equals(id, accessToken.id) &&
        Objects.equals(ttl, accessToken.ttl) &&
        Objects.equals(created, accessToken.created) &&
        Objects.equals(userId, accessToken.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ttl, created, userId);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessToken {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    ttl: ").append(StringUtil.toIndentedString(ttl)).append("\n");
    sb.append("    created: ").append(StringUtil.toIndentedString(created)).append("\n");
    sb.append("    userId: ").append(StringUtil.toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
