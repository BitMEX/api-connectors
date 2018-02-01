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
import java.math.BigDecimal;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

import io.swagger.annotations.*;



@ApiModel(description = "")
public class ConnectedUsers   {
  
  @SerializedName("users")
  private BigDecimal users = null;

  @SerializedName("bots")
  private BigDecimal bots = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getUsers() {
    return users;
  }
  public void setUsers(BigDecimal users) {
    this.users = users;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getBots() {
    return bots;
  }
  public void setBots(BigDecimal bots) {
    this.bots = bots;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectedUsers connectedUsers = (ConnectedUsers) o;
    return Objects.equals(users, connectedUsers.users) &&
        Objects.equals(bots, connectedUsers.bots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, bots);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectedUsers {\n");
    
    sb.append("    users: ").append(StringUtil.toIndentedString(users)).append("\n");
    sb.append("    bots: ").append(StringUtil.toIndentedString(bots)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
