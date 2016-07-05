package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class OrderBook   {
  
  private String symbol = null;
  private BigDecimal level = null;
  private BigDecimal bidSize = null;
  private Double bidPrice = null;
  private Double askPrice = null;
  private BigDecimal askSize = null;
  private Date timestamp = null;

  /**
   **/
  public OrderBook symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  
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
  public OrderBook level(BigDecimal level) {
    this.level = level;
    return this;
  }

  
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
  public OrderBook bidSize(BigDecimal bidSize) {
    this.bidSize = bidSize;
    return this;
  }

  
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
  public OrderBook bidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
    return this;
  }

  
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
  public OrderBook askPrice(Double askPrice) {
    this.askPrice = askPrice;
    return this;
  }

  
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
  public OrderBook askSize(BigDecimal askSize) {
    this.askSize = askSize;
    return this;
  }

  
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
  public OrderBook timestamp(Date timestamp) {
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
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBook {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    bidSize: ").append(toIndentedString(bidSize)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    askPrice: ").append(toIndentedString(askPrice)).append("\n");
    sb.append("    askSize: ").append(toIndentedString(askSize)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

