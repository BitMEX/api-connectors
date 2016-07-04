package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.math.BigDecimal;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T18:25:18.235-05:00")
public class Stats   {
  
  private String rootSymbol = null;
  private String currency = null;
  private BigDecimal volume24h = null;
  private BigDecimal turnover24h = null;
  private BigDecimal openInterest = null;
  private BigDecimal openValue = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("rootSymbol")
  public String getRootSymbol() {
    return rootSymbol;
  }
  public void setRootSymbol(String rootSymbol) {
    this.rootSymbol = rootSymbol;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("volume24h")
  public BigDecimal getVolume24h() {
    return volume24h;
  }
  public void setVolume24h(BigDecimal volume24h) {
    this.volume24h = volume24h;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("turnover24h")
  public BigDecimal getTurnover24h() {
    return turnover24h;
  }
  public void setTurnover24h(BigDecimal turnover24h) {
    this.turnover24h = turnover24h;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("openInterest")
  public BigDecimal getOpenInterest() {
    return openInterest;
  }
  public void setOpenInterest(BigDecimal openInterest) {
    this.openInterest = openInterest;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("openValue")
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
