package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.LocalDate;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-05T09:41:19.947-05:00")

public class Quote   {
  
  private LocalDate timestamp = null;
  private String symbol = null;
  private BigDecimal bidSize = null;
  private Double bidPrice = null;
  private Double askPrice = null;
  private BigDecimal askSize = null;
  private Double id = null;

  /**
   **/
  public Quote timestamp(LocalDate timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timestamp")
  public LocalDate getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(LocalDate timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  public Quote symbol(String symbol) {
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
  public Quote bidSize(BigDecimal bidSize) {
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
  public Quote bidPrice(Double bidPrice) {
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
  public Quote askPrice(Double askPrice) {
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
  public Quote askSize(BigDecimal askSize) {
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
  public Quote id(Double id) {
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
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quote {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    bidSize: ").append(toIndentedString(bidSize)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    askPrice: ").append(toIndentedString(askPrice)).append("\n");
    sb.append("    askSize: ").append(toIndentedString(askSize)).append("\n");
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

