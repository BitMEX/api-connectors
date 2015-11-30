package io.swagger.client.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class AccessToken  {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("ttl")
  private Double ttl = 1209600.0;
  @SerializedName("created")
  private Date created = null;
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
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
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
