package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Execution  {
  
  @SerializedName("execID")
  private String execID = null;
  @SerializedName("orderID")
  private String orderID = null;
  @SerializedName("clOrdID")
  private String clOrdID = null;
  @SerializedName("account")
  private BigDecimal account = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("side")
  private String side = null;
  @SerializedName("lastQty")
  private BigDecimal lastQty = null;
  @SerializedName("lastPx")
  private Double lastPx = null;
  @SerializedName("underlyingLastPx")
  private Double underlyingLastPx = null;
  @SerializedName("lastMkt")
  private String lastMkt = null;
  @SerializedName("lastLiquidityInd")
  private String lastLiquidityInd = null;
  @SerializedName("simpleOrderQty")
  private Double simpleOrderQty = null;
  @SerializedName("orderQty")
  private BigDecimal orderQty = null;
  @SerializedName("price")
  private Double price = null;
  @SerializedName("minQty")
  private BigDecimal minQty = null;
  @SerializedName("stopPx")
  private Double stopPx = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("settlCurrency")
  private String settlCurrency = null;
  @SerializedName("execType")
  private String execType = null;
  @SerializedName("ordType")
  private String ordType = null;
  @SerializedName("timeInForce")
  private String timeInForce = null;
  @SerializedName("exDestination")
  private String exDestination = null;
  @SerializedName("ordStatus")
  private String ordStatus = null;
  @SerializedName("workingIndicator")
  private Boolean workingIndicator = null;
  @SerializedName("ordRejReason")
  private String ordRejReason = null;
  @SerializedName("simpleLeavesQty")
  private Double simpleLeavesQty = null;
  @SerializedName("leavesQty")
  private BigDecimal leavesQty = null;
  @SerializedName("simpleCumQty")
  private Double simpleCumQty = null;
  @SerializedName("cumQty")
  private BigDecimal cumQty = null;
  @SerializedName("avgPx")
  private Double avgPx = null;
  @SerializedName("commission")
  private Double commission = null;
  @SerializedName("commType")
  private String commType = null;
  @SerializedName("tradePublishIndicator")
  private String tradePublishIndicator = null;
  @SerializedName("multiLegReportingType")
  private String multiLegReportingType = null;
  @SerializedName("text")
  private String text = null;
  @SerializedName("trdMatchID")
  private String trdMatchID = null;
  @SerializedName("execCost")
  private BigDecimal execCost = null;
  @SerializedName("execComm")
  private BigDecimal execComm = null;
  @SerializedName("homeNotional")
  private Double homeNotional = null;
  @SerializedName("foreignNotional")
  private Double foreignNotional = null;
  @SerializedName("transactTime")
  private Date transactTime = null;
  @SerializedName("timestamp")
  private Date timestamp = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getExecID() {
    return execID;
  }
  public void setExecID(String execID) {
    this.execID = execID;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrderID() {
    return orderID;
  }
  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getClOrdID() {
    return clOrdID;
  }
  public void setClOrdID(String clOrdID) {
    this.clOrdID = clOrdID;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getAccount() {
    return account;
  }
  public void setAccount(BigDecimal account) {
    this.account = account;
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
  public String getSide() {
    return side;
  }
  public void setSide(String side) {
    this.side = side;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getLastQty() {
    return lastQty;
  }
  public void setLastQty(BigDecimal lastQty) {
    this.lastQty = lastQty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLastPx() {
    return lastPx;
  }
  public void setLastPx(Double lastPx) {
    this.lastPx = lastPx;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getUnderlyingLastPx() {
    return underlyingLastPx;
  }
  public void setUnderlyingLastPx(Double underlyingLastPx) {
    this.underlyingLastPx = underlyingLastPx;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastMkt() {
    return lastMkt;
  }
  public void setLastMkt(String lastMkt) {
    this.lastMkt = lastMkt;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastLiquidityInd() {
    return lastLiquidityInd;
  }
  public void setLastLiquidityInd(String lastLiquidityInd) {
    this.lastLiquidityInd = lastLiquidityInd;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSimpleOrderQty() {
    return simpleOrderQty;
  }
  public void setSimpleOrderQty(Double simpleOrderQty) {
    this.simpleOrderQty = simpleOrderQty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOrderQty() {
    return orderQty;
  }
  public void setOrderQty(BigDecimal orderQty) {
    this.orderQty = orderQty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getMinQty() {
    return minQty;
  }
  public void setMinQty(BigDecimal minQty) {
    this.minQty = minQty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getStopPx() {
    return stopPx;
  }
  public void setStopPx(Double stopPx) {
    this.stopPx = stopPx;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSettlCurrency() {
    return settlCurrency;
  }
  public void setSettlCurrency(String settlCurrency) {
    this.settlCurrency = settlCurrency;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getExecType() {
    return execType;
  }
  public void setExecType(String execType) {
    this.execType = execType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrdType() {
    return ordType;
  }
  public void setOrdType(String ordType) {
    this.ordType = ordType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTimeInForce() {
    return timeInForce;
  }
  public void setTimeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getExDestination() {
    return exDestination;
  }
  public void setExDestination(String exDestination) {
    this.exDestination = exDestination;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrdStatus() {
    return ordStatus;
  }
  public void setOrdStatus(String ordStatus) {
    this.ordStatus = ordStatus;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getWorkingIndicator() {
    return workingIndicator;
  }
  public void setWorkingIndicator(Boolean workingIndicator) {
    this.workingIndicator = workingIndicator;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrdRejReason() {
    return ordRejReason;
  }
  public void setOrdRejReason(String ordRejReason) {
    this.ordRejReason = ordRejReason;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSimpleLeavesQty() {
    return simpleLeavesQty;
  }
  public void setSimpleLeavesQty(Double simpleLeavesQty) {
    this.simpleLeavesQty = simpleLeavesQty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getLeavesQty() {
    return leavesQty;
  }
  public void setLeavesQty(BigDecimal leavesQty) {
    this.leavesQty = leavesQty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSimpleCumQty() {
    return simpleCumQty;
  }
  public void setSimpleCumQty(Double simpleCumQty) {
    this.simpleCumQty = simpleCumQty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getCumQty() {
    return cumQty;
  }
  public void setCumQty(BigDecimal cumQty) {
    this.cumQty = cumQty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getAvgPx() {
    return avgPx;
  }
  public void setAvgPx(Double avgPx) {
    this.avgPx = avgPx;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getCommission() {
    return commission;
  }
  public void setCommission(Double commission) {
    this.commission = commission;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCommType() {
    return commType;
  }
  public void setCommType(String commType) {
    this.commType = commType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTradePublishIndicator() {
    return tradePublishIndicator;
  }
  public void setTradePublishIndicator(String tradePublishIndicator) {
    this.tradePublishIndicator = tradePublishIndicator;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMultiLegReportingType() {
    return multiLegReportingType;
  }
  public void setMultiLegReportingType(String multiLegReportingType) {
    this.multiLegReportingType = multiLegReportingType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTrdMatchID() {
    return trdMatchID;
  }
  public void setTrdMatchID(String trdMatchID) {
    this.trdMatchID = trdMatchID;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getExecCost() {
    return execCost;
  }
  public void setExecCost(BigDecimal execCost) {
    this.execCost = execCost;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getExecComm() {
    return execComm;
  }
  public void setExecComm(BigDecimal execComm) {
    this.execComm = execComm;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getHomeNotional() {
    return homeNotional;
  }
  public void setHomeNotional(Double homeNotional) {
    this.homeNotional = homeNotional;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getForeignNotional() {
    return foreignNotional;
  }
  public void setForeignNotional(Double foreignNotional) {
    this.foreignNotional = foreignNotional;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getTransactTime() {
    return transactTime;
  }
  public void setTransactTime(Date transactTime) {
    this.transactTime = transactTime;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
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
    sb.append("  simpleOrderQty: ").append(simpleOrderQty).append("\n");
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
    sb.append("  simpleLeavesQty: ").append(simpleLeavesQty).append("\n");
    sb.append("  leavesQty: ").append(leavesQty).append("\n");
    sb.append("  simpleCumQty: ").append(simpleCumQty).append("\n");
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
