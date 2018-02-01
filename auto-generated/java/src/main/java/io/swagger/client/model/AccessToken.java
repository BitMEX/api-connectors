package io.swagger.client.model;

import io.swagger.client.StringUtil;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

import io.swagger.annotations.*;



@ApiModel(description = "")
public class AccessToken   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("ttl")
  private Double ttl = 1209600.0d;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("userId")
  private Double userId = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
  public Double getTtl() {
    return ttl;
  }
  public void setTtl(Double ttl) {
    this.ttl = ttl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }
  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
