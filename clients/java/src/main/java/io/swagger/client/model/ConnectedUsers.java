package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.math.BigDecimal;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T18:25:18.235-05:00")
public class ConnectedUsers   {
  
  private BigDecimal users = null;
  private BigDecimal bots = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("users")
  public BigDecimal getUsers() {
    return users;
  }
  public void setUsers(BigDecimal users) {
    this.users = users;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bots")
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
