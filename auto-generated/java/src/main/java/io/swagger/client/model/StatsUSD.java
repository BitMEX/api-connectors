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
public class StatsUSD   {
  
  @SerializedName("rootSymbol")
  private String rootSymbol = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("turnover24h")
  private BigDecimal turnover24h = null;

  @SerializedName("turnover30d")
  private BigDecimal turnover30d = null;

  @SerializedName("turnover365d")
  private BigDecimal turnover365d = null;

  @SerializedName("turnover")
  private BigDecimal turnover = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getRootSymbol() {
    return rootSymbol;
  }
  public void setRootSymbol(String rootSymbol) {
    this.rootSymbol = rootSymbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTurnover24h() {
    return turnover24h;
  }
  public void setTurnover24h(BigDecimal turnover24h) {
    this.turnover24h = turnover24h;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTurnover30d() {
    return turnover30d;
  }
  public void setTurnover30d(BigDecimal turnover30d) {
    this.turnover30d = turnover30d;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTurnover365d() {
    return turnover365d;
  }
  public void setTurnover365d(BigDecimal turnover365d) {
    this.turnover365d = turnover365d;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTurnover() {
    return turnover;
  }
  public void setTurnover(BigDecimal turnover) {
    this.turnover = turnover;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsUSD statsUSD = (StatsUSD) o;
    return Objects.equals(rootSymbol, statsUSD.rootSymbol) &&
        Objects.equals(currency, statsUSD.currency) &&
        Objects.equals(turnover24h, statsUSD.turnover24h) &&
        Objects.equals(turnover30d, statsUSD.turnover30d) &&
        Objects.equals(turnover365d, statsUSD.turnover365d) &&
        Objects.equals(turnover, statsUSD.turnover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootSymbol, currency, turnover24h, turnover30d, turnover365d, turnover);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsUSD {\n");
    
    sb.append("    rootSymbol: ").append(StringUtil.toIndentedString(rootSymbol)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    turnover24h: ").append(StringUtil.toIndentedString(turnover24h)).append("\n");
    sb.append("    turnover30d: ").append(StringUtil.toIndentedString(turnover30d)).append("\n");
    sb.append("    turnover365d: ").append(StringUtil.toIndentedString(turnover365d)).append("\n");
    sb.append("    turnover: ").append(StringUtil.toIndentedString(turnover)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
