package io.swagger.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-07-04T18:25:23.952-05:00")
public class OrderBook  {
  
  private String symbol = null;
  private BigDecimal level = null;
  private BigDecimal bidSize = null;
  private Double bidPrice = null;
  private Double askPrice = null;
  private BigDecimal askSize = null;
  private Date timestamp = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("symbol")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("level")
  public BigDecimal getLevel() {
    return level;
  }
  public void setLevel(BigDecimal level) {
    this.level = level;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bidSize")
  public BigDecimal getBidSize() {
    return bidSize;
  }
  public void setBidSize(BigDecimal bidSize) {
    this.bidSize = bidSize;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bidPrice")
  public Double getBidPrice() {
    return bidPrice;
  }
  public void setBidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("askPrice")
  public Double getAskPrice() {
    return askPrice;
  }
  public void setAskPrice(Double askPrice) {
    this.askPrice = askPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("askSize")
  public BigDecimal getAskSize() {
    return askSize;
  }
  public void setAskSize(BigDecimal askSize) {
    this.askSize = askSize;
  }

  
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBook orderBook = (OrderBook) o;
    return Objects.equals(symbol, orderBook.symbol) &&
        Objects.equals(level, orderBook.level) &&
        Objects.equals(bidSize, orderBook.bidSize) &&
        Objects.equals(bidPrice, orderBook.bidPrice) &&
        Objects.equals(askPrice, orderBook.askPrice) &&
        Objects.equals(askSize, orderBook.askSize) &&
        Objects.equals(timestamp, orderBook.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, level, bidSize, bidPrice, askPrice, askSize, timestamp);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBook {\n");
    
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  level: ").append(level).append("\n");
    sb.append("  bidSize: ").append(bidSize).append("\n");
    sb.append("  bidPrice: ").append(bidPrice).append("\n");
    sb.append("  askPrice: ").append(askPrice).append("\n");
    sb.append("  askSize: ").append(askSize).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
