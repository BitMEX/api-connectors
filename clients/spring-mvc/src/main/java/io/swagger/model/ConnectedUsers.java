package io.swagger.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-30T13:35:50.750-06:00")
public class ConnectedUsers  {
  
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
    
    sb.append("  users: ").append(users).append("\n");
    sb.append("  bots: ").append(bots).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
