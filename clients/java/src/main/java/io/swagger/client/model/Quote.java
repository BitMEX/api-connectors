package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;
import java.math.BigDecimal;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T18:25:18.235-05:00")
public class Quote   {
  
  private Date timestamp = null;
  private String symbol = null;
  private BigDecimal bidSize = null;
  private Double bidPrice = null;
  private Double askPrice = null;
  private BigDecimal askSize = null;
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
    Quote quote = (Quote) o;
    return Objects.equals(timestamp, quote.timestamp) &&
        Objects.equals(symbol, quote.symbol) &&
        Objects.equals(bidSize, quote.bidSize) &&
        Objects.equals(bidPrice, quote.bidPrice) &&
        Objects.equals(askPrice, quote.askPrice) &&
        Objects.equals(askSize, quote.askSize) &&
        Objects.equals(id, quote.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, symbol, bidSize, bidPrice, askPrice, askSize, id);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quote {\n");
    
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("    symbol: ").append(StringUtil.toIndentedString(symbol)).append("\n");
    sb.append("    bidSize: ").append(StringUtil.toIndentedString(bidSize)).append("\n");
    sb.append("    bidPrice: ").append(StringUtil.toIndentedString(bidPrice)).append("\n");
    sb.append("    askPrice: ").append(StringUtil.toIndentedString(askPrice)).append("\n");
    sb.append("    askSize: ").append(StringUtil.toIndentedString(askSize)).append("\n");
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
