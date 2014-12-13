package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
public class TradeBin {
  @JsonProperty("timestamp")
  private Date timestamp = null;
  @JsonProperty("symbol")
  private String symbol = null;
  @JsonProperty("open")
  private Double open = null;
  @JsonProperty("high")
  private Double high = null;
  @JsonProperty("low")
  private Double low = null;
  @JsonProperty("close")
  private Double close = null;
  @JsonProperty("trades")
  private Double trades = null;
  @JsonProperty("volume")
  private Double volume = null;
  @JsonProperty("vwap")
  private Double vwap = null;
  @JsonProperty("lastSize")
  private Double lastSize = null;
  @JsonProperty("id")
  private Double id = null;
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Double getOpen() {
    return open;
  }
  public void setOpen(Double open) {
    this.open = open;
  }

  public Double getHigh() {
    return high;
  }
  public void setHigh(Double high) {
    this.high = high;
  }

  public Double getLow() {
    return low;
  }
  public void setLow(Double low) {
    this.low = low;
  }

  public Double getClose() {
    return close;
  }
  public void setClose(Double close) {
    this.close = close;
  }

  public Double getTrades() {
    return trades;
  }
  public void setTrades(Double trades) {
    this.trades = trades;
  }

  public Double getVolume() {
    return volume;
  }
  public void setVolume(Double volume) {
    this.volume = volume;
  }

  public Double getVwap() {
    return vwap;
  }
  public void setVwap(Double vwap) {
    this.vwap = vwap;
  }

  public Double getLastSize() {
    return lastSize;
  }
  public void setLastSize(Double lastSize) {
    this.lastSize = lastSize;
  }

  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeBin {\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  open: ").append(open).append("\n");
    sb.append("  high: ").append(high).append("\n");
    sb.append("  low: ").append(low).append("\n");
    sb.append("  close: ").append(close).append("\n");
    sb.append("  trades: ").append(trades).append("\n");
    sb.append("  volume: ").append(volume).append("\n");
    sb.append("  vwap: ").append(vwap).append("\n");
    sb.append("  lastSize: ").append(lastSize).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

