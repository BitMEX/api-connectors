package io.swagger.client.model;

import java.util.Date;
import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class TradeBin  {
  
  @SerializedName("timestamp")
  private Date timestamp = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("open")
  private Double open = null;
  @SerializedName("high")
  private Double high = null;
  @SerializedName("low")
  private Double low = null;
  @SerializedName("close")
  private Double close = null;
  @SerializedName("trades")
  private BigDecimal trades = null;
  @SerializedName("volume")
  private BigDecimal volume = null;
  @SerializedName("vwap")
  private Double vwap = null;
  @SerializedName("lastSize")
  private BigDecimal lastSize = null;
  @SerializedName("turnover")
  private BigDecimal turnover = null;
  @SerializedName("homeNotional")
  private Double homeNotional = null;
  @SerializedName("foreignNotional")
  private Double foreignNotional = null;
  @SerializedName("id")
  private Double id = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getOpen() {
    return open;
  }
  public void setOpen(Double open) {
    this.open = open;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getHigh() {
    return high;
  }
  public void setHigh(Double high) {
    this.high = high;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLow() {
    return low;
  }
  public void setLow(Double low) {
    this.low = low;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getClose() {
    return close;
  }
  public void setClose(Double close) {
    this.close = close;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTrades() {
    return trades;
  }
  public void setTrades(BigDecimal trades) {
    this.trades = trades;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getVolume() {
    return volume;
  }
  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getVwap() {
    return vwap;
  }
  public void setVwap(Double vwap) {
    this.vwap = vwap;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getLastSize() {
    return lastSize;
  }
  public void setLastSize(BigDecimal lastSize) {
    this.lastSize = lastSize;
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getHomeNotional() {
    return homeNotional;
  }
  public void setHomeNotional(Double homeNotional) {
    this.homeNotional = homeNotional;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getForeignNotional() {
    return foreignNotional;
  }
  public void setForeignNotional(Double foreignNotional) {
    this.foreignNotional = foreignNotional;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeBin {\n");
    
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  open: ").append(open).append("\n");
    sb.append("  high: ").append(high).append("\n");
    sb.append("  low: ").append(low).append("\n");
    sb.append("  close: ").append(close).append("\n");
    sb.append("  trades: ").append(trades).append("\n");
    sb.append("  volume: ").append(volume).append("\n");
    sb.append("  vwap: ").append(vwap).append("\n");
    sb.append("  lastSize: ").append(lastSize).append("\n");
    sb.append("  turnover: ").append(turnover).append("\n");
    sb.append("  homeNotional: ").append(homeNotional).append("\n");
    sb.append("  foreignNotional: ").append(foreignNotional).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
