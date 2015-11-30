package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;
import java.math.BigDecimal;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-30T13:35:44.556-06:00")
public class StatsHistory   {
  
  private Date date = null;
  private String rootSymbol = null;
  private String currency = null;
  private BigDecimal volume = null;
  private BigDecimal turnover = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  
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
  @JsonProperty("volume")
  public BigDecimal getVolume() {
    return volume;
  }
  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("turnover")
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
    StatsHistory statsHistory = (StatsHistory) o;
    return Objects.equals(date, statsHistory.date) &&
        Objects.equals(rootSymbol, statsHistory.rootSymbol) &&
        Objects.equals(currency, statsHistory.currency) &&
        Objects.equals(volume, statsHistory.volume) &&
        Objects.equals(turnover, statsHistory.turnover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, rootSymbol, currency, volume, turnover);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsHistory {\n");
    
    sb.append("    date: ").append(StringUtil.toIndentedString(date)).append("\n");
    sb.append("    rootSymbol: ").append(StringUtil.toIndentedString(rootSymbol)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    volume: ").append(StringUtil.toIndentedString(volume)).append("\n");
    sb.append("    turnover: ").append(StringUtil.toIndentedString(turnover)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
