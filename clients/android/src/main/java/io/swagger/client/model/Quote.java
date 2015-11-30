package io.swagger.client.model;

import java.util.Date;
import java.math.BigDecimal;

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
    sb.append("class Quote {\n");
    
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  bidSize: ").append(bidSize).append("\n");
    sb.append("  bidPrice: ").append(bidPrice).append("\n");
    sb.append("  askPrice: ").append(askPrice).append("\n");
    sb.append("  askSize: ").append(askSize).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
