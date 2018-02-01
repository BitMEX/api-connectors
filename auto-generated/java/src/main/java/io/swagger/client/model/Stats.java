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



/**
 * Exchange Statistics
 **/
@ApiModel(description = "Exchange Statistics")
public class Stats   {
  
  @SerializedName("rootSymbol")
  private String rootSymbol = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("volume24h")
  private BigDecimal volume24h = null;

  @SerializedName("turnover24h")
  private BigDecimal turnover24h = null;

  @SerializedName("openInterest")
  private BigDecimal openInterest = null;

  @SerializedName("openValue")
  private BigDecimal openValue = null;

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
  public BigDecimal getVolume24h() {
    return volume24h;
  }
  public void setVolume24h(BigDecimal volume24h) {
    this.volume24h = volume24h;
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
  public BigDecimal getOpenInterest() {
    return openInterest;
  }
  public void setOpenInterest(BigDecimal openInterest) {
    this.openInterest = openInterest;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOpenValue() {
    return openValue;
  }
  public void setOpenValue(BigDecimal openValue) {
    this.openValue = openValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stats stats = (Stats) o;
    return Objects.equals(rootSymbol, stats.rootSymbol) &&
        Objects.equals(currency, stats.currency) &&
        Objects.equals(volume24h, stats.volume24h) &&
        Objects.equals(turnover24h, stats.turnover24h) &&
        Objects.equals(openInterest, stats.openInterest) &&
        Objects.equals(openValue, stats.openValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootSymbol, currency, volume24h, turnover24h, openInterest, openValue);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stats {\n");
    
    sb.append("    rootSymbol: ").append(StringUtil.toIndentedString(rootSymbol)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    volume24h: ").append(StringUtil.toIndentedString(volume24h)).append("\n");
    sb.append("    turnover24h: ").append(StringUtil.toIndentedString(turnover24h)).append("\n");
    sb.append("    openInterest: ").append(StringUtil.toIndentedString(openInterest)).append("\n");
    sb.append("    openValue: ").append(StringUtil.toIndentedString(openValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
