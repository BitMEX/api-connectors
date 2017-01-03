package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Quote  {
  
  @SerializedName("timestamp")
  private Date timestamp = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("bidSize")
  private BigDecimal bidSize = null;
  @SerializedName("bidPrice")
  private Double bidPrice = null;
  @SerializedName("askPrice")
  private Double askPrice = null;
  @SerializedName("askSize")
  private BigDecimal askSize = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
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
  public BigDecimal getBidSize() {
    return bidSize;
  }
  public void setBidSize(BigDecimal bidSize) {
    this.bidSize = bidSize;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getBidPrice() {
    return bidPrice;
  }
  public void setBidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getAskPrice() {
    return askPrice;
  }
  public void setAskPrice(Double askPrice) {
    this.askPrice = askPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getAskSize() {
    return askSize;
  }
  public void setAskSize(BigDecimal askSize) {
    this.askSize = askSize;
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
    return (timestamp == null ? quote.timestamp == null : timestamp.equals(quote.timestamp)) &&
        (symbol == null ? quote.symbol == null : symbol.equals(quote.symbol)) &&
        (bidSize == null ? quote.bidSize == null : bidSize.equals(quote.bidSize)) &&
        (bidPrice == null ? quote.bidPrice == null : bidPrice.equals(quote.bidPrice)) &&
        (askPrice == null ? quote.askPrice == null : askPrice.equals(quote.askPrice)) &&
        (askSize == null ? quote.askSize == null : askSize.equals(quote.askSize));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (timestamp == null ? 0: timestamp.hashCode());
    result = 31 * result + (symbol == null ? 0: symbol.hashCode());
    result = 31 * result + (bidSize == null ? 0: bidSize.hashCode());
    result = 31 * result + (bidPrice == null ? 0: bidPrice.hashCode());
    result = 31 * result + (askPrice == null ? 0: askPrice.hashCode());
    result = 31 * result + (askSize == null ? 0: askSize.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quote {\n");
    
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  bidSize: ").append(bidSize).append("\n");
    sb.append("  bidPrice: ").append(bidPrice).append("\n");
    sb.append("  askPrice: ").append(askPrice).append("\n");
    sb.append("  askSize: ").append(askSize).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
