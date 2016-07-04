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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Execution execution = (Execution) o;
    return (execID == null ? execution.execID == null : execID.equals(execution.execID)) &&
        (orderID == null ? execution.orderID == null : orderID.equals(execution.orderID)) &&
        (clOrdID == null ? execution.clOrdID == null : clOrdID.equals(execution.clOrdID)) &&
        (clOrdLinkID == null ? execution.clOrdLinkID == null : clOrdLinkID.equals(execution.clOrdLinkID)) &&
        (account == null ? execution.account == null : account.equals(execution.account)) &&
        (symbol == null ? execution.symbol == null : symbol.equals(execution.symbol)) &&
        (side == null ? execution.side == null : side.equals(execution.side)) &&
        (lastQty == null ? execution.lastQty == null : lastQty.equals(execution.lastQty)) &&
        (lastPx == null ? execution.lastPx == null : lastPx.equals(execution.lastPx)) &&
        (underlyingLastPx == null ? execution.underlyingLastPx == null : underlyingLastPx.equals(execution.underlyingLastPx)) &&
        (lastMkt == null ? execution.lastMkt == null : lastMkt.equals(execution.lastMkt)) &&
        (lastLiquidityInd == null ? execution.lastLiquidityInd == null : lastLiquidityInd.equals(execution.lastLiquidityInd)) &&
        (simpleOrderQty == null ? execution.simpleOrderQty == null : simpleOrderQty.equals(execution.simpleOrderQty)) &&
        (orderQty == null ? execution.orderQty == null : orderQty.equals(execution.orderQty)) &&
        (price == null ? execution.price == null : price.equals(execution.price)) &&
        (displayQty == null ? execution.displayQty == null : displayQty.equals(execution.displayQty)) &&
        (stopPx == null ? execution.stopPx == null : stopPx.equals(execution.stopPx)) &&
        (pegOffsetValue == null ? execution.pegOffsetValue == null : pegOffsetValue.equals(execution.pegOffsetValue)) &&
        (pegPriceType == null ? execution.pegPriceType == null : pegPriceType.equals(execution.pegPriceType)) &&
        (currency == null ? execution.currency == null : currency.equals(execution.currency)) &&
        (settlCurrency == null ? execution.settlCurrency == null : settlCurrency.equals(execution.settlCurrency)) &&
        (execType == null ? execution.execType == null : execType.equals(execution.execType)) &&
        (ordType == null ? execution.ordType == null : ordType.equals(execution.ordType)) &&
        (timeInForce == null ? execution.timeInForce == null : timeInForce.equals(execution.timeInForce)) &&
        (execInst == null ? execution.execInst == null : execInst.equals(execution.execInst)) &&
        (contingencyType == null ? execution.contingencyType == null : contingencyType.equals(execution.contingencyType)) &&
        (exDestination == null ? execution.exDestination == null : exDestination.equals(execution.exDestination)) &&
        (ordStatus == null ? execution.ordStatus == null : ordStatus.equals(execution.ordStatus)) &&
        (triggered == null ? execution.triggered == null : triggered.equals(execution.triggered)) &&
        (workingIndicator == null ? execution.workingIndicator == null : workingIndicator.equals(execution.workingIndicator)) &&
        (ordRejReason == null ? execution.ordRejReason == null : ordRejReason.equals(execution.ordRejReason)) &&
        (simpleLeavesQty == null ? execution.simpleLeavesQty == null : simpleLeavesQty.equals(execution.simpleLeavesQty)) &&
        (leavesQty == null ? execution.leavesQty == null : leavesQty.equals(execution.leavesQty)) &&
        (simpleCumQty == null ? execution.simpleCumQty == null : simpleCumQty.equals(execution.simpleCumQty)) &&
        (cumQty == null ? execution.cumQty == null : cumQty.equals(execution.cumQty)) &&
        (avgPx == null ? execution.avgPx == null : avgPx.equals(execution.avgPx)) &&
        (commission == null ? execution.commission == null : commission.equals(execution.commission)) &&
        (tradePublishIndicator == null ? execution.tradePublishIndicator == null : tradePublishIndicator.equals(execution.tradePublishIndicator)) &&
        (multiLegReportingType == null ? execution.multiLegReportingType == null : multiLegReportingType.equals(execution.multiLegReportingType)) &&
        (text == null ? execution.text == null : text.equals(execution.text)) &&
        (trdMatchID == null ? execution.trdMatchID == null : trdMatchID.equals(execution.trdMatchID)) &&
        (execCost == null ? execution.execCost == null : execCost.equals(execution.execCost)) &&
        (execComm == null ? execution.execComm == null : execComm.equals(execution.execComm)) &&
        (homeNotional == null ? execution.homeNotional == null : homeNotional.equals(execution.homeNotional)) &&
        (foreignNotional == null ? execution.foreignNotional == null : foreignNotional.equals(execution.foreignNotional)) &&
        (transactTime == null ? execution.transactTime == null : transactTime.equals(execution.transactTime)) &&
        (timestamp == null ? execution.timestamp == null : timestamp.equals(execution.timestamp));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (execID == null ? 0: execID.hashCode());
    result = 31 * result + (orderID == null ? 0: orderID.hashCode());
    result = 31 * result + (clOrdID == null ? 0: clOrdID.hashCode());
    result = 31 * result + (clOrdLinkID == null ? 0: clOrdLinkID.hashCode());
    result = 31 * result + (account == null ? 0: account.hashCode());
    result = 31 * result + (symbol == null ? 0: symbol.hashCode());
    result = 31 * result + (side == null ? 0: side.hashCode());
    result = 31 * result + (lastQty == null ? 0: lastQty.hashCode());
    result = 31 * result + (lastPx == null ? 0: lastPx.hashCode());
    result = 31 * result + (underlyingLastPx == null ? 0: underlyingLastPx.hashCode());
    result = 31 * result + (lastMkt == null ? 0: lastMkt.hashCode());
    result = 31 * result + (lastLiquidityInd == null ? 0: lastLiquidityInd.hashCode());
    result = 31 * result + (simpleOrderQty == null ? 0: simpleOrderQty.hashCode());
    result = 31 * result + (orderQty == null ? 0: orderQty.hashCode());
    result = 31 * result + (price == null ? 0: price.hashCode());
    result = 31 * result + (displayQty == null ? 0: displayQty.hashCode());
    result = 31 * result + (stopPx == null ? 0: stopPx.hashCode());
    result = 31 * result + (pegOffsetValue == null ? 0: pegOffsetValue.hashCode());
    result = 31 * result + (pegPriceType == null ? 0: pegPriceType.hashCode());
    result = 31 * result + (currency == null ? 0: currency.hashCode());
    result = 31 * result + (settlCurrency == null ? 0: settlCurrency.hashCode());
    result = 31 * result + (execType == null ? 0: execType.hashCode());
    result = 31 * result + (ordType == null ? 0: ordType.hashCode());
    result = 31 * result + (timeInForce == null ? 0: timeInForce.hashCode());
    result = 31 * result + (execInst == null ? 0: execInst.hashCode());
    result = 31 * result + (contingencyType == null ? 0: contingencyType.hashCode());
    result = 31 * result + (exDestination == null ? 0: exDestination.hashCode());
    result = 31 * result + (ordStatus == null ? 0: ordStatus.hashCode());
    result = 31 * result + (triggered == null ? 0: triggered.hashCode());
    result = 31 * result + (workingIndicator == null ? 0: workingIndicator.hashCode());
    result = 31 * result + (ordRejReason == null ? 0: ordRejReason.hashCode());
    result = 31 * result + (simpleLeavesQty == null ? 0: simpleLeavesQty.hashCode());
    result = 31 * result + (leavesQty == null ? 0: leavesQty.hashCode());
    result = 31 * result + (simpleCumQty == null ? 0: simpleCumQty.hashCode());
    result = 31 * result + (cumQty == null ? 0: cumQty.hashCode());
    result = 31 * result + (avgPx == null ? 0: avgPx.hashCode());
    result = 31 * result + (commission == null ? 0: commission.hashCode());
    result = 31 * result + (tradePublishIndicator == null ? 0: tradePublishIndicator.hashCode());
    result = 31 * result + (multiLegReportingType == null ? 0: multiLegReportingType.hashCode());
    result = 31 * result + (text == null ? 0: text.hashCode());
    result = 31 * result + (trdMatchID == null ? 0: trdMatchID.hashCode());
    result = 31 * result + (execCost == null ? 0: execCost.hashCode());
    result = 31 * result + (execComm == null ? 0: execComm.hashCode());
    result = 31 * result + (homeNotional == null ? 0: homeNotional.hashCode());
    result = 31 * result + (foreignNotional == null ? 0: foreignNotional.hashCode());
    result = 31 * result + (transactTime == null ? 0: transactTime.hashCode());
    result = 31 * result + (timestamp == null ? 0: timestamp.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Execution {\n");
    
    sb.append("  execID: ").append(execID).append("\n");
    sb.append("  orderID: ").append(orderID).append("\n");
    sb.append("  clOrdID: ").append(clOrdID).append("\n");
    sb.append("  clOrdLinkID: ").append(clOrdLinkID).append("\n");
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
    sb.append("  displayQty: ").append(displayQty).append("\n");
    sb.append("  stopPx: ").append(stopPx).append("\n");
    sb.append("  pegOffsetValue: ").append(pegOffsetValue).append("\n");
    sb.append("  pegPriceType: ").append(pegPriceType).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  settlCurrency: ").append(settlCurrency).append("\n");
    sb.append("  execType: ").append(execType).append("\n");
    sb.append("  ordType: ").append(ordType).append("\n");
    sb.append("  timeInForce: ").append(timeInForce).append("\n");
    sb.append("  execInst: ").append(execInst).append("\n");
    sb.append("  contingencyType: ").append(contingencyType).append("\n");
    sb.append("  exDestination: ").append(exDestination).append("\n");
    sb.append("  ordStatus: ").append(ordStatus).append("\n");
    sb.append("  triggered: ").append(triggered).append("\n");
    sb.append("  workingIndicator: ").append(workingIndicator).append("\n");
    sb.append("  ordRejReason: ").append(ordRejReason).append("\n");
    sb.append("  simpleLeavesQty: ").append(simpleLeavesQty).append("\n");
    sb.append("  leavesQty: ").append(leavesQty).append("\n");
    sb.append("  simpleCumQty: ").append(simpleCumQty).append("\n");
    sb.append("  cumQty: ").append(cumQty).append("\n");
    sb.append("  avgPx: ").append(avgPx).append("\n");
    sb.append("  commission: ").append(commission).append("\n");
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
