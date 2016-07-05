package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class Leaderboard   {
  
  private String name = null;
  private Boolean isRealName = null;
  private Boolean isMe = null;
  private Double profit = null;

  /**
   **/
  public Leaderboard name(String name) {
    this.name = name;
    return this;
  }

  
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
  public Leaderboard isRealName(Boolean isRealName) {
    this.isRealName = isRealName;
    return this;
  }

  
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
  public Leaderboard isMe(Boolean isMe) {
    this.isMe = isMe;
    return this;
  }

  
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
  public Leaderboard profit(Double profit) {
    this.profit = profit;
    return this;
  }

  
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
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Leaderboard {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isRealName: ").append(toIndentedString(isRealName)).append("\n");
    sb.append("    isMe: ").append(toIndentedString(isMe)).append("\n");
    sb.append("    profit: ").append(toIndentedString(profit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

