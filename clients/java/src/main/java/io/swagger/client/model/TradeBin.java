package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;
import java.math.BigDecimal;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T18:25:18.235-05:00")
public class TradeBin   {
  
  private Date timestamp = null;
  private String symbol = null;
  private Double open = null;
  private Double high = null;
  private Double low = null;
  private Double close = null;
  private BigDecimal trades = null;
  private BigDecimal volume = null;
  private Double vwap = null;
  private BigDecimal lastSize = null;
  private BigDecimal turnover = null;
  private Double homeNotional = null;
  private Double foreignNotional = null;
  private Double id = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("symbol")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("open")
  public Double getOpen() {
    return open;
  }
  public void setOpen(Double open) {
    this.open = open;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("high")
  public Double getHigh() {
    return high;
  }
  public void setHigh(Double high) {
    this.high = high;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("low")
  public Double getLow() {
    return low;
  }
  public void setLow(Double low) {
    this.low = low;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("close")
  public Double getClose() {
    return close;
  }
  public void setClose(Double close) {
    this.close = close;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("trades")
  public BigDecimal getTrades() {
    return trades;
  }
  public void setTrades(BigDecimal trades) {
    this.trades = trades;
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
  @JsonProperty("vwap")
  public Double getVwap() {
    return vwap;
  }
  public void setVwap(Double vwap) {
    this.vwap = vwap;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lastSize")
  public BigDecimal getLastSize() {
    return lastSize;
  }
  public void setLastSize(BigDecimal lastSize) {
    this.lastSize = lastSize;
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("homeNotional")
  public Double getHomeNotional() {
    return homeNotional;
  }
  public void setHomeNotional(Double homeNotional) {
    this.homeNotional = homeNotional;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("foreignNotional")
  public Double getForeignNotional() {
    return foreignNotional;
  }
  public void setForeignNotional(Double foreignNotional) {
    this.foreignNotional = foreignNotional;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeBin tradeBin = (TradeBin) o;
    return Objects.equals(timestamp, tradeBin.timestamp) &&
        Objects.equals(symbol, tradeBin.symbol) &&
        Objects.equals(open, tradeBin.open) &&
        Objects.equals(high, tradeBin.high) &&
        Objects.equals(low, tradeBin.low) &&
        Objects.equals(close, tradeBin.close) &&
        Objects.equals(trades, tradeBin.trades) &&
        Objects.equals(volume, tradeBin.volume) &&
        Objects.equals(vwap, tradeBin.vwap) &&
        Objects.equals(lastSize, tradeBin.lastSize) &&
        Objects.equals(turnover, tradeBin.turnover) &&
        Objects.equals(homeNotional, tradeBin.homeNotional) &&
        Objects.equals(foreignNotional, tradeBin.foreignNotional) &&
        Objects.equals(id, tradeBin.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, symbol, open, high, low, close, trades, volume, vwap, lastSize, turnover, homeNotional, foreignNotional, id);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeBin {\n");
    
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("    symbol: ").append(StringUtil.toIndentedString(symbol)).append("\n");
    sb.append("    open: ").append(StringUtil.toIndentedString(open)).append("\n");
    sb.append("    high: ").append(StringUtil.toIndentedString(high)).append("\n");
    sb.append("    low: ").append(StringUtil.toIndentedString(low)).append("\n");
    sb.append("    close: ").append(StringUtil.toIndentedString(close)).append("\n");
    sb.append("    trades: ").append(StringUtil.toIndentedString(trades)).append("\n");
    sb.append("    volume: ").append(StringUtil.toIndentedString(volume)).append("\n");
    sb.append("    vwap: ").append(StringUtil.toIndentedString(vwap)).append("\n");
    sb.append("    lastSize: ").append(StringUtil.toIndentedString(lastSize)).append("\n");
    sb.append("    turnover: ").append(StringUtil.toIndentedString(turnover)).append("\n");
    sb.append("    homeNotional: ").append(StringUtil.toIndentedString(homeNotional)).append("\n");
    sb.append("    foreignNotional: ").append(StringUtil.toIndentedString(foreignNotional)).append("\n");
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
