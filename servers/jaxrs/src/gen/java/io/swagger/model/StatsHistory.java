package io.swagger.model;

import java.util.Date;
import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class StatsHistory  {
  
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
    
    sb.append("  date: ").append(date).append("\n");
    sb.append("  rootSymbol: ").append(rootSymbol).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  volume: ").append(volume).append("\n");
    sb.append("  turnover: ").append(turnover).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
