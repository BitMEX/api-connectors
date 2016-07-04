package io.swagger.client.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ConnectedUsers  {
  
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
    return (users == null ? connectedUsers.users == null : users.equals(connectedUsers.users)) &&
        (bots == null ? connectedUsers.bots == null : bots.equals(connectedUsers.bots));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (users == null ? 0: users.hashCode());
    result = 31 * result + (bots == null ? 0: bots.hashCode());
    return result;
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
