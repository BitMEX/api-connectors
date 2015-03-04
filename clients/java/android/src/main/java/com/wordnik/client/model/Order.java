package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
public class Order {
  @JsonProperty("orderID")
  private String orderID = null;
  @JsonProperty("clOrdID")
  private String clOrdID = null;
  @JsonProperty("account")
  private Double account = null;
  @JsonProperty("symbol")
  private String symbol = null;
  @JsonProperty("side")
  private String side = null;
  @JsonProperty("simpleOrderQty")
  private Double simpleOrderQty = null;
  @JsonProperty("orderQty")
  private Double orderQty = null;
  @JsonProperty("price")
  private Double price = null;
  @JsonProperty("minQty")
  private Double minQty = null;
  @JsonProperty("stopPx")
  private Double stopPx = null;
  @JsonProperty("currency")
  private String currency = null;
  @JsonProperty("settlCurrency")
  private String settlCurrency = null;
  @JsonProperty("ordType")
  private String ordType = null;
  @JsonProperty("timeInForce")
  private String timeInForce = null;
  @JsonProperty("exDestination")
  private String exDestination = null;
  @JsonProperty("ordStatus")
  private String ordStatus = null;
  @JsonProperty("workingIndicator")
  private Boolean workingIndicator = null;
  @JsonProperty("ordRejReason")
  private String ordRejReason = null;
  @JsonProperty("simpleLeavesQty")
  private Double simpleLeavesQty = null;
  @JsonProperty("leavesQty")
  private Double leavesQty = null;
  @JsonProperty("simpleCumQty")
  private Double simpleCumQty = null;
  @JsonProperty("cumQty")
  private Double cumQty = null;
  @JsonProperty("avgPx")
  private Double avgPx = null;
  @JsonProperty("multiLegReportingType")
  private String multiLegReportingType = null;
  @JsonProperty("text")
  private String text = null;
  @JsonProperty("transactTime")
  private Date transactTime = null;
  @JsonProperty("timestamp")
  private Date timestamp = null;
  public String getOrderID() {
    return orderID;
  }
  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }

  public String getClOrdID() {
    return clOrdID;
  }
  public void setClOrdID(String clOrdID) {
    this.clOrdID = clOrdID;
  }

  public Double getAccount() {
    return account;
  }
  public void setAccount(Double account) {
    this.account = account;
  }

  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getSide() {
    return side;
  }
  public void setSide(String side) {
    this.side = side;
  }

  public Double getSimpleOrderQty() {
    return simpleOrderQty;
  }
  public void setSimpleOrderQty(Double simpleOrderQty) {
    this.simpleOrderQty = simpleOrderQty;
  }

  public Double getOrderQty() {
    return orderQty;
  }
  public void setOrderQty(Double orderQty) {
    this.orderQty = orderQty;
  }

  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  public Double getMinQty() {
    return minQty;
  }
  public void setMinQty(Double minQty) {
    this.minQty = minQty;
  }

  public Double getStopPx() {
    return stopPx;
  }
  public void setStopPx(Double stopPx) {
    this.stopPx = stopPx;
  }

  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getSettlCurrency() {
    return settlCurrency;
  }
  public void setSettlCurrency(String settlCurrency) {
    this.settlCurrency = settlCurrency;
  }

  public String getOrdType() {
    return ordType;
  }
  public void setOrdType(String ordType) {
    this.ordType = ordType;
  }

  public String getTimeInForce() {
    return timeInForce;
  }
  public void setTimeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
  }

  public String getExDestination() {
    return exDestination;
  }
  public void setExDestination(String exDestination) {
    this.exDestination = exDestination;
  }

  public String getOrdStatus() {
    return ordStatus;
  }
  public void setOrdStatus(String ordStatus) {
    this.ordStatus = ordStatus;
  }

  public Boolean getWorkingIndicator() {
    return workingIndicator;
  }
  public void setWorkingIndicator(Boolean workingIndicator) {
    this.workingIndicator = workingIndicator;
  }

  public String getOrdRejReason() {
    return ordRejReason;
  }
  public void setOrdRejReason(String ordRejReason) {
    this.ordRejReason = ordRejReason;
  }

  public Double getSimpleLeavesQty() {
    return simpleLeavesQty;
  }
  public void setSimpleLeavesQty(Double simpleLeavesQty) {
    this.simpleLeavesQty = simpleLeavesQty;
  }

  public Double getLeavesQty() {
    return leavesQty;
  }
  public void setLeavesQty(Double leavesQty) {
    this.leavesQty = leavesQty;
  }

  public Double getSimpleCumQty() {
    return simpleCumQty;
  }
  public void setSimpleCumQty(Double simpleCumQty) {
    this.simpleCumQty = simpleCumQty;
  }

  public Double getCumQty() {
    return cumQty;
  }
  public void setCumQty(Double cumQty) {
    this.cumQty = cumQty;
  }

  public Double getAvgPx() {
    return avgPx;
  }
  public void setAvgPx(Double avgPx) {
    this.avgPx = avgPx;
  }

  public String getMultiLegReportingType() {
    return multiLegReportingType;
  }
  public void setMultiLegReportingType(String multiLegReportingType) {
    this.multiLegReportingType = multiLegReportingType;
  }

  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  public Date getTransactTime() {
    return transactTime;
  }
  public void setTransactTime(Date transactTime) {
    this.transactTime = transactTime;
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
    sb.append("class Order {\n");
    sb.append("  orderID: ").append(orderID).append("\n");
    sb.append("  clOrdID: ").append(clOrdID).append("\n");
    sb.append("  account: ").append(account).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  simpleOrderQty: ").append(simpleOrderQty).append("\n");
    sb.append("  orderQty: ").append(orderQty).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  minQty: ").append(minQty).append("\n");
    sb.append("  stopPx: ").append(stopPx).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  settlCurrency: ").append(settlCurrency).append("\n");
    sb.append("  ordType: ").append(ordType).append("\n");
    sb.append("  timeInForce: ").append(timeInForce).append("\n");
    sb.append("  exDestination: ").append(exDestination).append("\n");
    sb.append("  ordStatus: ").append(ordStatus).append("\n");
    sb.append("  workingIndicator: ").append(workingIndicator).append("\n");
    sb.append("  ordRejReason: ").append(ordRejReason).append("\n");
    sb.append("  simpleLeavesQty: ").append(simpleLeavesQty).append("\n");
    sb.append("  leavesQty: ").append(leavesQty).append("\n");
    sb.append("  simpleCumQty: ").append(simpleCumQty).append("\n");
    sb.append("  cumQty: ").append(cumQty).append("\n");
    sb.append("  avgPx: ").append(avgPx).append("\n");
    sb.append("  multiLegReportingType: ").append(multiLegReportingType).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  transactTime: ").append(transactTime).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

