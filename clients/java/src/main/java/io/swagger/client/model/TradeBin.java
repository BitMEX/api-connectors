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
import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

import io.swagger.annotations.*;



@ApiModel(description = "")
public class TradeBin   {
  
  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

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

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
        Objects.equals(foreignNotional, tradeBin.foreignNotional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, symbol, open, high, low, close, trades, volume, vwap, lastSize, turnover, homeNotional, foreignNotional);
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
    sb.append("}");
    return sb.toString();
  }
}
