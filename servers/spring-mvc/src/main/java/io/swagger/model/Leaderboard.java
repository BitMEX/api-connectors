package io.swagger.model;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-07-04T18:25:39.823-05:00")
public class Leaderboard  {
  
  private String name = null;
  private Boolean isRealName = null;
  private Boolean isMe = null;
  private Double profit = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("isRealName")
  public Boolean getIsRealName() {
    return isRealName;
  }
  public void setIsRealName(Boolean isRealName) {
    this.isRealName = isRealName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("isMe")
  public Boolean getIsMe() {
    return isMe;
  }
  public void setIsMe(Boolean isMe) {
    this.isMe = isMe;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("profit")
  public Double getProfit() {
    return profit;
  }
  public void setProfit(Double profit) {
    this.profit = profit;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Leaderboard leaderboard = (Leaderboard) o;
    return Objects.equals(name, leaderboard.name) &&
        Objects.equals(isRealName, leaderboard.isRealName) &&
        Objects.equals(isMe, leaderboard.isMe) &&
        Objects.equals(profit, leaderboard.profit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isRealName, isMe, profit);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Leaderboard {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  isRealName: ").append(isRealName).append("\n");
    sb.append("  isMe: ").append(isMe).append("\n");
    sb.append("  profit: ").append(profit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
