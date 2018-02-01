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
 * Raw Order and Balance Data
 **/
@ApiModel(description = "Raw Order and Balance Data")
public class Execution   {
  
  @SerializedName("execID")
  private String execID = null;

  @SerializedName("orderID")
  private String orderID = null;

  @SerializedName("clOrdID")
  private String clOrdID = null;

  @SerializedName("clOrdLinkID")
  private String clOrdLinkID = null;

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

  @SerializedName("displayQty")
  private BigDecimal displayQty = null;

  @SerializedName("stopPx")
  private Double stopPx = null;

  @SerializedName("pegOffsetValue")
  private Double pegOffsetValue = null;

  @SerializedName("pegPriceType")
  private String pegPriceType = null;

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

  @SerializedName("execInst")
  private String execInst = null;

  @SerializedName("contingencyType")
  private String contingencyType = null;

  @SerializedName("exDestination")
  private String exDestination = null;

  @SerializedName("ordStatus")
  private String ordStatus = null;

  @SerializedName("triggered")
  private String triggered = null;

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
  private OffsetDateTime transactTime = null;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

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
  public String getClOrdLinkID() {
    return clOrdLinkID;
  }
  public void setClOrdLinkID(String clOrdLinkID) {
    this.clOrdLinkID = clOrdLinkID;
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
  public BigDecimal getDisplayQty() {
    return displayQty;
  }
  public void setDisplayQty(BigDecimal displayQty) {
    this.displayQty = displayQty;
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
  public Double getPegOffsetValue() {
    return pegOffsetValue;
  }
  public void setPegOffsetValue(Double pegOffsetValue) {
    this.pegOffsetValue = pegOffsetValue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPegPriceType() {
    return pegPriceType;
  }
  public void setPegPriceType(String pegPriceType) {
    this.pegPriceType = pegPriceType;
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
  public String getExecInst() {
    return execInst;
  }
  public void setExecInst(String execInst) {
    this.execInst = execInst;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContingencyType() {
    return contingencyType;
  }
  public void setContingencyType(String contingencyType) {
    this.contingencyType = contingencyType;
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
  public String getTriggered() {
    return triggered;
  }
  public void setTriggered(String triggered) {
    this.triggered = triggered;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean isWorkingIndicator() {
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
  public OffsetDateTime getTransactTime() {
    return transactTime;
  }
  public void setTransactTime(OffsetDateTime transactTime) {
    this.transactTime = transactTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Execution execution = (Execution) o;
    return Objects.equals(execID, execution.execID) &&
        Objects.equals(orderID, execution.orderID) &&
        Objects.equals(clOrdID, execution.clOrdID) &&
        Objects.equals(clOrdLinkID, execution.clOrdLinkID) &&
        Objects.equals(account, execution.account) &&
        Objects.equals(symbol, execution.symbol) &&
        Objects.equals(side, execution.side) &&
        Objects.equals(lastQty, execution.lastQty) &&
        Objects.equals(lastPx, execution.lastPx) &&
        Objects.equals(underlyingLastPx, execution.underlyingLastPx) &&
        Objects.equals(lastMkt, execution.lastMkt) &&
        Objects.equals(lastLiquidityInd, execution.lastLiquidityInd) &&
        Objects.equals(simpleOrderQty, execution.simpleOrderQty) &&
        Objects.equals(orderQty, execution.orderQty) &&
        Objects.equals(price, execution.price) &&
        Objects.equals(displayQty, execution.displayQty) &&
        Objects.equals(stopPx, execution.stopPx) &&
        Objects.equals(pegOffsetValue, execution.pegOffsetValue) &&
        Objects.equals(pegPriceType, execution.pegPriceType) &&
        Objects.equals(currency, execution.currency) &&
        Objects.equals(settlCurrency, execution.settlCurrency) &&
        Objects.equals(execType, execution.execType) &&
        Objects.equals(ordType, execution.ordType) &&
        Objects.equals(timeInForce, execution.timeInForce) &&
        Objects.equals(execInst, execution.execInst) &&
        Objects.equals(contingencyType, execution.contingencyType) &&
        Objects.equals(exDestination, execution.exDestination) &&
        Objects.equals(ordStatus, execution.ordStatus) &&
        Objects.equals(triggered, execution.triggered) &&
        Objects.equals(workingIndicator, execution.workingIndicator) &&
        Objects.equals(ordRejReason, execution.ordRejReason) &&
        Objects.equals(simpleLeavesQty, execution.simpleLeavesQty) &&
        Objects.equals(leavesQty, execution.leavesQty) &&
        Objects.equals(simpleCumQty, execution.simpleCumQty) &&
        Objects.equals(cumQty, execution.cumQty) &&
        Objects.equals(avgPx, execution.avgPx) &&
        Objects.equals(commission, execution.commission) &&
        Objects.equals(tradePublishIndicator, execution.tradePublishIndicator) &&
        Objects.equals(multiLegReportingType, execution.multiLegReportingType) &&
        Objects.equals(text, execution.text) &&
        Objects.equals(trdMatchID, execution.trdMatchID) &&
        Objects.equals(execCost, execution.execCost) &&
        Objects.equals(execComm, execution.execComm) &&
        Objects.equals(homeNotional, execution.homeNotional) &&
        Objects.equals(foreignNotional, execution.foreignNotional) &&
        Objects.equals(transactTime, execution.transactTime) &&
        Objects.equals(timestamp, execution.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(execID, orderID, clOrdID, clOrdLinkID, account, symbol, side, lastQty, lastPx, underlyingLastPx, lastMkt, lastLiquidityInd, simpleOrderQty, orderQty, price, displayQty, stopPx, pegOffsetValue, pegPriceType, currency, settlCurrency, execType, ordType, timeInForce, execInst, contingencyType, exDestination, ordStatus, triggered, workingIndicator, ordRejReason, simpleLeavesQty, leavesQty, simpleCumQty, cumQty, avgPx, commission, tradePublishIndicator, multiLegReportingType, text, trdMatchID, execCost, execComm, homeNotional, foreignNotional, transactTime, timestamp);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Execution {\n");
    
    sb.append("    execID: ").append(StringUtil.toIndentedString(execID)).append("\n");
    sb.append("    orderID: ").append(StringUtil.toIndentedString(orderID)).append("\n");
    sb.append("    clOrdID: ").append(StringUtil.toIndentedString(clOrdID)).append("\n");
    sb.append("    clOrdLinkID: ").append(StringUtil.toIndentedString(clOrdLinkID)).append("\n");
    sb.append("    account: ").append(StringUtil.toIndentedString(account)).append("\n");
    sb.append("    symbol: ").append(StringUtil.toIndentedString(symbol)).append("\n");
    sb.append("    side: ").append(StringUtil.toIndentedString(side)).append("\n");
    sb.append("    lastQty: ").append(StringUtil.toIndentedString(lastQty)).append("\n");
    sb.append("    lastPx: ").append(StringUtil.toIndentedString(lastPx)).append("\n");
    sb.append("    underlyingLastPx: ").append(StringUtil.toIndentedString(underlyingLastPx)).append("\n");
    sb.append("    lastMkt: ").append(StringUtil.toIndentedString(lastMkt)).append("\n");
    sb.append("    lastLiquidityInd: ").append(StringUtil.toIndentedString(lastLiquidityInd)).append("\n");
    sb.append("    simpleOrderQty: ").append(StringUtil.toIndentedString(simpleOrderQty)).append("\n");
    sb.append("    orderQty: ").append(StringUtil.toIndentedString(orderQty)).append("\n");
    sb.append("    price: ").append(StringUtil.toIndentedString(price)).append("\n");
    sb.append("    displayQty: ").append(StringUtil.toIndentedString(displayQty)).append("\n");
    sb.append("    stopPx: ").append(StringUtil.toIndentedString(stopPx)).append("\n");
    sb.append("    pegOffsetValue: ").append(StringUtil.toIndentedString(pegOffsetValue)).append("\n");
    sb.append("    pegPriceType: ").append(StringUtil.toIndentedString(pegPriceType)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    settlCurrency: ").append(StringUtil.toIndentedString(settlCurrency)).append("\n");
    sb.append("    execType: ").append(StringUtil.toIndentedString(execType)).append("\n");
    sb.append("    ordType: ").append(StringUtil.toIndentedString(ordType)).append("\n");
    sb.append("    timeInForce: ").append(StringUtil.toIndentedString(timeInForce)).append("\n");
    sb.append("    execInst: ").append(StringUtil.toIndentedString(execInst)).append("\n");
    sb.append("    contingencyType: ").append(StringUtil.toIndentedString(contingencyType)).append("\n");
    sb.append("    exDestination: ").append(StringUtil.toIndentedString(exDestination)).append("\n");
    sb.append("    ordStatus: ").append(StringUtil.toIndentedString(ordStatus)).append("\n");
    sb.append("    triggered: ").append(StringUtil.toIndentedString(triggered)).append("\n");
    sb.append("    workingIndicator: ").append(StringUtil.toIndentedString(workingIndicator)).append("\n");
    sb.append("    ordRejReason: ").append(StringUtil.toIndentedString(ordRejReason)).append("\n");
    sb.append("    simpleLeavesQty: ").append(StringUtil.toIndentedString(simpleLeavesQty)).append("\n");
    sb.append("    leavesQty: ").append(StringUtil.toIndentedString(leavesQty)).append("\n");
    sb.append("    simpleCumQty: ").append(StringUtil.toIndentedString(simpleCumQty)).append("\n");
    sb.append("    cumQty: ").append(StringUtil.toIndentedString(cumQty)).append("\n");
    sb.append("    avgPx: ").append(StringUtil.toIndentedString(avgPx)).append("\n");
    sb.append("    commission: ").append(StringUtil.toIndentedString(commission)).append("\n");
    sb.append("    tradePublishIndicator: ").append(StringUtil.toIndentedString(tradePublishIndicator)).append("\n");
    sb.append("    multiLegReportingType: ").append(StringUtil.toIndentedString(multiLegReportingType)).append("\n");
    sb.append("    text: ").append(StringUtil.toIndentedString(text)).append("\n");
    sb.append("    trdMatchID: ").append(StringUtil.toIndentedString(trdMatchID)).append("\n");
    sb.append("    execCost: ").append(StringUtil.toIndentedString(execCost)).append("\n");
    sb.append("    execComm: ").append(StringUtil.toIndentedString(execComm)).append("\n");
    sb.append("    homeNotional: ").append(StringUtil.toIndentedString(homeNotional)).append("\n");
    sb.append("    foreignNotional: ").append(StringUtil.toIndentedString(foreignNotional)).append("\n");
    sb.append("    transactTime: ").append(StringUtil.toIndentedString(transactTime)).append("\n");
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
