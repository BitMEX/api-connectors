package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
public class Execution {
  @JsonProperty("execID")
  private String execID = null;
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
  @JsonProperty("lastQty")
  private Double lastQty = null;
  @JsonProperty("lastPx")
  private Double lastPx = null;
  @JsonProperty("underlyingLastPx")
  private Double underlyingLastPx = null;
  @JsonProperty("lastMkt")
  private String lastMkt = null;
  @JsonProperty("lastLiquidityInd")
  private String lastLiquidityInd = null;
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
  @JsonProperty("execType")
  private String execType = null;
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
  @JsonProperty("leavesQty")
  private Double leavesQty = null;
  @JsonProperty("cumQty")
  private Double cumQty = null;
  @JsonProperty("avgPx")
  private Double avgPx = null;
  @JsonProperty("commission")
  private Double commission = null;
  @JsonProperty("commType")
  private String commType = null;
  @JsonProperty("tradePublishIndicator")
  private String tradePublishIndicator = null;
  @JsonProperty("multiLegReportingType")
  private String multiLegReportingType = null;
  @JsonProperty("text")
  private String text = null;
  @JsonProperty("trdMatchID")
  private String trdMatchID = null;
  @JsonProperty("execCost")
  private Double execCost = null;
  @JsonProperty("execComm")
  private Double execComm = null;
  @JsonProperty("homeNotional")
  private Double homeNotional = null;
  @JsonProperty("foreignNotional")
  private Double foreignNotional = null;
  @JsonProperty("transactTime")
  private Date transactTime = null;
  @JsonProperty("timestamp")
  private Date timestamp = null;
  public String getExecID() {
    return execID;
  }
  public void setExecID(String execID) {
    this.execID = execID;
  }

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

  public Double getLastQty() {
    return lastQty;
  }
  public void setLastQty(Double lastQty) {
    this.lastQty = lastQty;
  }

  public Double getLastPx() {
    return lastPx;
  }
  public void setLastPx(Double lastPx) {
    this.lastPx = lastPx;
  }

  public Double getUnderlyingLastPx() {
    return underlyingLastPx;
  }
  public void setUnderlyingLastPx(Double underlyingLastPx) {
    this.underlyingLastPx = underlyingLastPx;
  }

  public String getLastMkt() {
    return lastMkt;
  }
  public void setLastMkt(String lastMkt) {
    this.lastMkt = lastMkt;
  }

  public String getLastLiquidityInd() {
    return lastLiquidityInd;
  }
  public void setLastLiquidityInd(String lastLiquidityInd) {
    this.lastLiquidityInd = lastLiquidityInd;
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

  public String getExecType() {
    return execType;
  }
  public void setExecType(String execType) {
    this.execType = execType;
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

  public Double getLeavesQty() {
    return leavesQty;
  }
  public void setLeavesQty(Double leavesQty) {
    this.leavesQty = leavesQty;
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

  public Double getCommission() {
    return commission;
  }
  public void setCommission(Double commission) {
    this.commission = commission;
  }

  public String getCommType() {
    return commType;
  }
  public void setCommType(String commType) {
    this.commType = commType;
  }

  public String getTradePublishIndicator() {
    return tradePublishIndicator;
  }
  public void setTradePublishIndicator(String tradePublishIndicator) {
    this.tradePublishIndicator = tradePublishIndicator;
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

  public String getTrdMatchID() {
    return trdMatchID;
  }
  public void setTrdMatchID(String trdMatchID) {
    this.trdMatchID = trdMatchID;
  }

  public Double getExecCost() {
    return execCost;
  }
  public void setExecCost(Double execCost) {
    this.execCost = execCost;
  }

  public Double getExecComm() {
    return execComm;
  }
  public void setExecComm(Double execComm) {
    this.execComm = execComm;
  }

  public Double getHomeNotional() {
    return homeNotional;
  }
  public void setHomeNotional(Double homeNotional) {
    this.homeNotional = homeNotional;
  }

  public Double getForeignNotional() {
    return foreignNotional;
  }
  public void setForeignNotional(Double foreignNotional) {
    this.foreignNotional = foreignNotional;
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
    sb.append("class Execution {\n");
    sb.append("  execID: ").append(execID).append("\n");
    sb.append("  orderID: ").append(orderID).append("\n");
    sb.append("  clOrdID: ").append(clOrdID).append("\n");
    sb.append("  account: ").append(account).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  lastQty: ").append(lastQty).append("\n");
    sb.append("  lastPx: ").append(lastPx).append("\n");
    sb.append("  underlyingLastPx: ").append(underlyingLastPx).append("\n");
    sb.append("  lastMkt: ").append(lastMkt).append("\n");
    sb.append("  lastLiquidityInd: ").append(lastLiquidityInd).append("\n");
    sb.append("  orderQty: ").append(orderQty).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  minQty: ").append(minQty).append("\n");
    sb.append("  stopPx: ").append(stopPx).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  settlCurrency: ").append(settlCurrency).append("\n");
    sb.append("  execType: ").append(execType).append("\n");
    sb.append("  ordType: ").append(ordType).append("\n");
    sb.append("  timeInForce: ").append(timeInForce).append("\n");
    sb.append("  exDestination: ").append(exDestination).append("\n");
    sb.append("  ordStatus: ").append(ordStatus).append("\n");
    sb.append("  workingIndicator: ").append(workingIndicator).append("\n");
    sb.append("  ordRejReason: ").append(ordRejReason).append("\n");
    sb.append("  leavesQty: ").append(leavesQty).append("\n");
    sb.append("  cumQty: ").append(cumQty).append("\n");
    sb.append("  avgPx: ").append(avgPx).append("\n");
    sb.append("  commission: ").append(commission).append("\n");
    sb.append("  commType: ").append(commType).append("\n");
    sb.append("  tradePublishIndicator: ").append(tradePublishIndicator).append("\n");
    sb.append("  multiLegReportingType: ").append(multiLegReportingType).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  trdMatchID: ").append(trdMatchID).append("\n");
    sb.append("  execCost: ").append(execCost).append("\n");
    sb.append("  execComm: ").append(execComm).append("\n");
    sb.append("  homeNotional: ").append(homeNotional).append("\n");
    sb.append("  foreignNotional: ").append(foreignNotional).append("\n");
    sb.append("  transactTime: ").append(transactTime).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

