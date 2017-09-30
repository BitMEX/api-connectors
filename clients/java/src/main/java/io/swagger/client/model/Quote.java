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



/**
 * Best Bid/Offer Snapshots &amp; Historical Bins
 **/
@ApiModel(description = "Best Bid/Offer Snapshots & Historical Bins")
public class Quote   {
  
  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

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
    return Objects.equals(timestamp, quote.timestamp) &&
        Objects.equals(symbol, quote.symbol) &&
        Objects.equals(bidSize, quote.bidSize) &&
        Objects.equals(bidPrice, quote.bidPrice) &&
        Objects.equals(askPrice, quote.askPrice) &&
        Objects.equals(askSize, quote.askSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, symbol, bidSize, bidPrice, askPrice, askSize);
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
    sb.append("}");
    return sb.toString();
  }
}
