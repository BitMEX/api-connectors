package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
public class OrderBook {
  @JsonProperty("symbol")
  private String symbol = null;
  @JsonProperty("level")
  private Double level = null;
  @JsonProperty("bidSize")
  private Double bidSize = null;
  @JsonProperty("bidPrice")
  private Double bidPrice = null;
  @JsonProperty("askPrice")
  private Double askPrice = null;
  @JsonProperty("askSize")
  private Double askSize = null;
  @JsonProperty("timestamp")
  private Date timestamp = null;
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Double getLevel() {
    return level;
  }
  public void setLevel(Double level) {
    this.level = level;
  }

  public Double getBidSize() {
    return bidSize;
  }
  public void setBidSize(Double bidSize) {
    this.bidSize = bidSize;
  }

  public Double getBidPrice() {
    return bidPrice;
  }
  public void setBidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
  }

  public Double getAskPrice() {
    return askPrice;
  }
  public void setAskPrice(Double askPrice) {
    this.askPrice = askPrice;
  }

  public Double getAskSize() {
    return askSize;
  }
  public void setAskSize(Double askSize) {
    this.askSize = askSize;
  }

  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
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

