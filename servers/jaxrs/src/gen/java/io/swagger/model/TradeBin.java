package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
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
  public TradeBin timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
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
  public TradeBin symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  
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
  public TradeBin open(Double open) {
    this.open = open;
    return this;
  }

  
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
  public TradeBin high(Double high) {
    this.high = high;
    return this;
  }

  
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
  public TradeBin low(Double low) {
    this.low = low;
    return this;
  }

  
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
  public TradeBin close(Double close) {
    this.close = close;
    return this;
  }

  
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
  public TradeBin trades(BigDecimal trades) {
    this.trades = trades;
    return this;
  }

  
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
  public TradeBin volume(BigDecimal volume) {
    this.volume = volume;
    return this;
  }

  
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
  public TradeBin vwap(Double vwap) {
    this.vwap = vwap;
    return this;
  }

  
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
  public TradeBin lastSize(BigDecimal lastSize) {
    this.lastSize = lastSize;
    return this;
  }

  
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
  public TradeBin turnover(BigDecimal turnover) {
    this.turnover = turnover;
    return this;
  }

  
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
  public TradeBin homeNotional(Double homeNotional) {
    this.homeNotional = homeNotional;
    return this;
  }

  
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
  public TradeBin foreignNotional(Double foreignNotional) {
    this.foreignNotional = foreignNotional;
    return this;
  }

  
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
  public TradeBin id(Double id) {
    this.id = id;
    return this;
  }

  
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
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeBin {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    trades: ").append(toIndentedString(trades)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    vwap: ").append(toIndentedString(vwap)).append("\n");
    sb.append("    lastSize: ").append(toIndentedString(lastSize)).append("\n");
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
    sb.append("    homeNotional: ").append(toIndentedString(homeNotional)).append("\n");
    sb.append("    foreignNotional: ").append(toIndentedString(foreignNotional)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

