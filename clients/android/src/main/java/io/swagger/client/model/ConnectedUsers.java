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
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectedUsers {\n");
    
    sb.append("  users: ").append(users).append("\n");
    sb.append("  bots: ").append(bots).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
