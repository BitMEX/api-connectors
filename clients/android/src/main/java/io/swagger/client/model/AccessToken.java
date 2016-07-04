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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessToken accessToken = (AccessToken) o;
    return (id == null ? accessToken.id == null : id.equals(accessToken.id)) &&
        (ttl == null ? accessToken.ttl == null : ttl.equals(accessToken.ttl)) &&
        (created == null ? accessToken.created == null : created.equals(accessToken.created)) &&
        (userId == null ? accessToken.userId == null : userId.equals(accessToken.userId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (ttl == null ? 0: ttl.hashCode());
    result = 31 * result + (created == null ? 0: created.hashCode());
    result = 31 * result + (userId == null ? 0: userId.hashCode());
    return result;
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
