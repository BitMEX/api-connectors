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

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

import io.swagger.annotations.*;



/**
 * Information on Top Users
 **/
@ApiModel(description = "Information on Top Users")
public class Leaderboard   {
  
  @SerializedName("name")
  private String name = null;

  @SerializedName("isRealName")
  private Boolean isRealName = null;

  @SerializedName("isMe")
  private Boolean isMe = null;

  @SerializedName("profit")
  private Double profit = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean isIsRealName() {
    return isRealName;
  }
  public void setIsRealName(Boolean isRealName) {
    this.isRealName = isRealName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean isIsMe() {
    return isMe;
  }
  public void setIsMe(Boolean isMe) {
    this.isMe = isMe;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    isRealName: ").append(StringUtil.toIndentedString(isRealName)).append("\n");
    sb.append("    isMe: ").append(StringUtil.toIndentedString(isMe)).append("\n");
    sb.append("    profit: ").append(StringUtil.toIndentedString(profit)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
