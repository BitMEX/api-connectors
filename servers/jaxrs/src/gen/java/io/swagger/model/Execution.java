package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class Execution   {
  
  private String execID = null;
  private String orderID = null;
  private String clOrdID = null;
  private String clOrdLinkID = null;
  private BigDecimal account = null;
  private String symbol = null;
  private String side = null;
  private BigDecimal lastQty = null;
  private Double lastPx = null;
  private Double underlyingLastPx = null;
  private String lastMkt = null;
  private String lastLiquidityInd = null;
  private Double simpleOrderQty = null;
  private BigDecimal orderQty = null;
  private Double price = null;
  private BigDecimal displayQty = null;
  private Double stopPx = null;
  private Double pegOffsetValue = null;
  private String pegPriceType = null;
  private String currency = null;
  private String settlCurrency = null;
  private String execType = null;
  private String ordType = null;
  private String timeInForce = null;
  private String execInst = null;
  private String contingencyType = null;
  private String exDestination = null;
  private String ordStatus = null;
  private String triggered = null;
  private Boolean workingIndicator = null;
  private String ordRejReason = null;
  private Double simpleLeavesQty = null;
  private BigDecimal leavesQty = null;
  private Double simpleCumQty = null;
  private BigDecimal cumQty = null;
  private Double avgPx = null;
  private Double commission = null;
  private String tradePublishIndicator = null;
  private String multiLegReportingType = null;
  private String text = null;
  private String trdMatchID = null;
  private BigDecimal execCost = null;
  private BigDecimal execComm = null;
  private Double homeNotional = null;
  private Double foreignNotional = null;
  private Date transactTime = null;
  private Date timestamp = null;

  /**
   **/
  public Execution execID(String execID) {
    this.execID = execID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("execID")
  public String getExecID() {
    return execID;
  }
  public void setExecID(String execID) {
    this.execID = execID;
  }

  /**
   **/
  public Execution orderID(String orderID) {
    this.orderID = orderID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("orderID")
  public String getOrderID() {
    return orderID;
  }
  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }

  /**
   **/
  public Execution clOrdID(String clOrdID) {
    this.clOrdID = clOrdID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("clOrdID")
  public String getClOrdID() {
    return clOrdID;
  }
  public void setClOrdID(String clOrdID) {
    this.clOrdID = clOrdID;
  }

  /**
   **/
  public Execution clOrdLinkID(String clOrdLinkID) {
    this.clOrdLinkID = clOrdLinkID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("clOrdLinkID")
  public String getClOrdLinkID() {
    return clOrdLinkID;
  }
  public void setClOrdLinkID(String clOrdLinkID) {
    this.clOrdLinkID = clOrdLinkID;
  }

  /**
   **/
  public Execution account(BigDecimal account) {
    this.account = account;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("account")
  public BigDecimal getAccount() {
    return account;
  }
  public void setAccount(BigDecimal account) {
    this.account = account;
  }

  /**
   **/
  public Execution symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("symbol")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   **/
  public Execution side(String side) {
    this.side = side;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("side")
  public String getSide() {
    return side;
  }
  public void setSide(String side) {
    this.side = side;
  }

  /**
   **/
  public Execution lastQty(BigDecimal lastQty) {
    this.lastQty = lastQty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("lastQty")
  public BigDecimal getLastQty() {
    return lastQty;
  }
  public void setLastQty(BigDecimal lastQty) {
    this.lastQty = lastQty;
  }

  /**
   **/
  public Execution lastPx(Double lastPx) {
    this.lastPx = lastPx;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("lastPx")
  public Double getLastPx() {
    return lastPx;
  }
  public void setLastPx(Double lastPx) {
    this.lastPx = lastPx;
  }

  /**
   **/
  public Execution underlyingLastPx(Double underlyingLastPx) {
    this.underlyingLastPx = underlyingLastPx;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("underlyingLastPx")
  public Double getUnderlyingLastPx() {
    return underlyingLastPx;
  }
  public void setUnderlyingLastPx(Double underlyingLastPx) {
    this.underlyingLastPx = underlyingLastPx;
  }

  /**
   **/
  public Execution lastMkt(String lastMkt) {
    this.lastMkt = lastMkt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("lastMkt")
  public String getLastMkt() {
    return lastMkt;
  }
  public void setLastMkt(String lastMkt) {
    this.lastMkt = lastMkt;
  }

  /**
   **/
  public Execution lastLiquidityInd(String lastLiquidityInd) {
    this.lastLiquidityInd = lastLiquidityInd;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("lastLiquidityInd")
  public String getLastLiquidityInd() {
    return lastLiquidityInd;
  }
  public void setLastLiquidityInd(String lastLiquidityInd) {
    this.lastLiquidityInd = lastLiquidityInd;
  }

  /**
   **/
  public Execution simpleOrderQty(Double simpleOrderQty) {
    this.simpleOrderQty = simpleOrderQty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("simpleOrderQty")
  public Double getSimpleOrderQty() {
    return simpleOrderQty;
  }
  public void setSimpleOrderQty(Double simpleOrderQty) {
    this.simpleOrderQty = simpleOrderQty;
  }

  /**
   **/
  public Execution orderQty(BigDecimal orderQty) {
    this.orderQty = orderQty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("orderQty")
  public BigDecimal getOrderQty() {
    return orderQty;
  }
  public void setOrderQty(BigDecimal orderQty) {
    this.orderQty = orderQty;
  }

  /**
   **/
  public Execution price(Double price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("price")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  /**
   **/
  public Execution displayQty(BigDecimal displayQty) {
    this.displayQty = displayQty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("displayQty")
  public BigDecimal getDisplayQty() {
    return displayQty;
  }
  public void setDisplayQty(BigDecimal displayQty) {
    this.displayQty = displayQty;
  }

  /**
   **/
  public Execution stopPx(Double stopPx) {
    this.stopPx = stopPx;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stopPx")
  public Double getStopPx() {
    return stopPx;
  }
  public void setStopPx(Double stopPx) {
    this.stopPx = stopPx;
  }

  /**
   **/
  public Execution pegOffsetValue(Double pegOffsetValue) {
    this.pegOffsetValue = pegOffsetValue;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pegOffsetValue")
  public Double getPegOffsetValue() {
    return pegOffsetValue;
  }
  public void setPegOffsetValue(Double pegOffsetValue) {
    this.pegOffsetValue = pegOffsetValue;
  }

  /**
   **/
  public Execution pegPriceType(String pegPriceType) {
    this.pegPriceType = pegPriceType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pegPriceType")
  public String getPegPriceType() {
    return pegPriceType;
  }
  public void setPegPriceType(String pegPriceType) {
    this.pegPriceType = pegPriceType;
  }

  /**
   **/
  public Execution currency(String currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  public Execution settlCurrency(String settlCurrency) {
    this.settlCurrency = settlCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("settlCurrency")
  public String getSettlCurrency() {
    return settlCurrency;
  }
  public void setSettlCurrency(String settlCurrency) {
    this.settlCurrency = settlCurrency;
  }

  /**
   **/
  public Execution execType(String execType) {
    this.execType = execType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("execType")
  public String getExecType() {
    return execType;
  }
  public void setExecType(String execType) {
    this.execType = execType;
  }

  /**
   **/
  public Execution ordType(String ordType) {
    this.ordType = ordType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ordType")
  public String getOrdType() {
    return ordType;
  }
  public void setOrdType(String ordType) {
    this.ordType = ordType;
  }

  /**
   **/
  public Execution timeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timeInForce")
  public String getTimeInForce() {
    return timeInForce;
  }
  public void setTimeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
  }

  /**
   **/
  public Execution execInst(String execInst) {
    this.execInst = execInst;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("execInst")
  public String getExecInst() {
    return execInst;
  }
  public void setExecInst(String execInst) {
    this.execInst = execInst;
  }

  /**
   **/
  public Execution contingencyType(String contingencyType) {
    this.contingencyType = contingencyType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("contingencyType")
  public String getContingencyType() {
    return contingencyType;
  }
  public void setContingencyType(String contingencyType) {
    this.contingencyType = contingencyType;
  }

  /**
   **/
  public Execution exDestination(String exDestination) {
    this.exDestination = exDestination;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exDestination")
  public String getExDestination() {
    return exDestination;
  }
  public void setExDestination(String exDestination) {
    this.exDestination = exDestination;
  }

  /**
   **/
  public Execution ordStatus(String ordStatus) {
    this.ordStatus = ordStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ordStatus")
  public String getOrdStatus() {
    return ordStatus;
  }
  public void setOrdStatus(String ordStatus) {
    this.ordStatus = ordStatus;
  }

  /**
   **/
  public Execution triggered(String triggered) {
    this.triggered = triggered;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("triggered")
  public String getTriggered() {
    return triggered;
  }
  public void setTriggered(String triggered) {
    this.triggered = triggered;
  }

  /**
   **/
  public Execution workingIndicator(Boolean workingIndicator) {
    this.workingIndicator = workingIndicator;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("workingIndicator")
  public Boolean getWorkingIndicator() {
    return workingIndicator;
  }
  public void setWorkingIndicator(Boolean workingIndicator) {
    this.workingIndicator = workingIndicator;
  }

  /**
   **/
  public Execution ordRejReason(String ordRejReason) {
    this.ordRejReason = ordRejReason;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ordRejReason")
  public String getOrdRejReason() {
    return ordRejReason;
  }
  public void setOrdRejReason(String ordRejReason) {
    this.ordRejReason = ordRejReason;
  }

  /**
   **/
  public Execution simpleLeavesQty(Double simpleLeavesQty) {
    this.simpleLeavesQty = simpleLeavesQty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("simpleLeavesQty")
  public Double getSimpleLeavesQty() {
    return simpleLeavesQty;
  }
  public void setSimpleLeavesQty(Double simpleLeavesQty) {
    this.simpleLeavesQty = simpleLeavesQty;
  }

  /**
   **/
  public Execution leavesQty(BigDecimal leavesQty) {
    this.leavesQty = leavesQty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("leavesQty")
  public BigDecimal getLeavesQty() {
    return leavesQty;
  }
  public void setLeavesQty(BigDecimal leavesQty) {
    this.leavesQty = leavesQty;
  }

  /**
   **/
  public Execution simpleCumQty(Double simpleCumQty) {
    this.simpleCumQty = simpleCumQty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("simpleCumQty")
  public Double getSimpleCumQty() {
    return simpleCumQty;
  }
  public void setSimpleCumQty(Double simpleCumQty) {
    this.simpleCumQty = simpleCumQty;
  }

  /**
   **/
  public Execution cumQty(BigDecimal cumQty) {
    this.cumQty = cumQty;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cumQty")
  public BigDecimal getCumQty() {
    return cumQty;
  }
  public void setCumQty(BigDecimal cumQty) {
    this.cumQty = cumQty;
  }

  /**
   **/
  public Execution avgPx(Double avgPx) {
    this.avgPx = avgPx;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("avgPx")
  public Double getAvgPx() {
    return avgPx;
  }
  public void setAvgPx(Double avgPx) {
    this.avgPx = avgPx;
  }

  /**
   **/
  public Execution commission(Double commission) {
    this.commission = commission;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("commission")
  public Double getCommission() {
    return commission;
  }
  public void setCommission(Double commission) {
    this.commission = commission;
  }

  /**
   **/
  public Execution tradePublishIndicator(String tradePublishIndicator) {
    this.tradePublishIndicator = tradePublishIndicator;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tradePublishIndicator")
  public String getTradePublishIndicator() {
    return tradePublishIndicator;
  }
  public void setTradePublishIndicator(String tradePublishIndicator) {
    this.tradePublishIndicator = tradePublishIndicator;
  }

  /**
   **/
  public Execution multiLegReportingType(String multiLegReportingType) {
    this.multiLegReportingType = multiLegReportingType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("multiLegReportingType")
  public String getMultiLegReportingType() {
    return multiLegReportingType;
  }
  public void setMultiLegReportingType(String multiLegReportingType) {
    this.multiLegReportingType = multiLegReportingType;
  }

  /**
   **/
  public Execution text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   **/
  public Execution trdMatchID(String trdMatchID) {
    this.trdMatchID = trdMatchID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("trdMatchID")
  public String getTrdMatchID() {
    return trdMatchID;
  }
  public void setTrdMatchID(String trdMatchID) {
    this.trdMatchID = trdMatchID;
  }

  /**
   **/
  public Execution execCost(BigDecimal execCost) {
    this.execCost = execCost;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("execCost")
  public BigDecimal getExecCost() {
    return execCost;
  }
  public void setExecCost(BigDecimal execCost) {
    this.execCost = execCost;
  }

  /**
   **/
  public Execution execComm(BigDecimal execComm) {
    this.execComm = execComm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("execComm")
  public BigDecimal getExecComm() {
    return execComm;
  }
  public void setExecComm(BigDecimal execComm) {
    this.execComm = execComm;
  }

  /**
   **/
  public Execution homeNotional(Double homeNotional) {
    this.homeNotional = homeNotional;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("homeNotional")
  public Double getHomeNotional() {
    return homeNotional;
  }
  public void setHomeNotional(Double homeNotional) {
    this.homeNotional = homeNotional;
  }

  /**
   **/
  public Execution foreignNotional(Double foreignNotional) {
    this.foreignNotional = foreignNotional;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("foreignNotional")
  public Double getForeignNotional() {
    return foreignNotional;
  }
  public void setForeignNotional(Double foreignNotional) {
    this.foreignNotional = foreignNotional;
  }

  /**
   **/
  public Execution transactTime(Date transactTime) {
    this.transactTime = transactTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("transactTime")
  public Date getTransactTime() {
    return transactTime;
  }
  public void setTransactTime(Date transactTime) {
    this.transactTime = transactTime;
  }

  /**
   **/
  public Execution timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timestamp")
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
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Execution {\n");
    
    sb.append("    execID: ").append(toIndentedString(execID)).append("\n");
    sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
    sb.append("    clOrdID: ").append(toIndentedString(clOrdID)).append("\n");
    sb.append("    clOrdLinkID: ").append(toIndentedString(clOrdLinkID)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    lastQty: ").append(toIndentedString(lastQty)).append("\n");
    sb.append("    lastPx: ").append(toIndentedString(lastPx)).append("\n");
    sb.append("    underlyingLastPx: ").append(toIndentedString(underlyingLastPx)).append("\n");
    sb.append("    lastMkt: ").append(toIndentedString(lastMkt)).append("\n");
    sb.append("    lastLiquidityInd: ").append(toIndentedString(lastLiquidityInd)).append("\n");
    sb.append("    simpleOrderQty: ").append(toIndentedString(simpleOrderQty)).append("\n");
    sb.append("    orderQty: ").append(toIndentedString(orderQty)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    displayQty: ").append(toIndentedString(displayQty)).append("\n");
    sb.append("    stopPx: ").append(toIndentedString(stopPx)).append("\n");
    sb.append("    pegOffsetValue: ").append(toIndentedString(pegOffsetValue)).append("\n");
    sb.append("    pegPriceType: ").append(toIndentedString(pegPriceType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    settlCurrency: ").append(toIndentedString(settlCurrency)).append("\n");
    sb.append("    execType: ").append(toIndentedString(execType)).append("\n");
    sb.append("    ordType: ").append(toIndentedString(ordType)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    execInst: ").append(toIndentedString(execInst)).append("\n");
    sb.append("    contingencyType: ").append(toIndentedString(contingencyType)).append("\n");
    sb.append("    exDestination: ").append(toIndentedString(exDestination)).append("\n");
    sb.append("    ordStatus: ").append(toIndentedString(ordStatus)).append("\n");
    sb.append("    triggered: ").append(toIndentedString(triggered)).append("\n");
    sb.append("    workingIndicator: ").append(toIndentedString(workingIndicator)).append("\n");
    sb.append("    ordRejReason: ").append(toIndentedString(ordRejReason)).append("\n");
    sb.append("    simpleLeavesQty: ").append(toIndentedString(simpleLeavesQty)).append("\n");
    sb.append("    leavesQty: ").append(toIndentedString(leavesQty)).append("\n");
    sb.append("    simpleCumQty: ").append(toIndentedString(simpleCumQty)).append("\n");
    sb.append("    cumQty: ").append(toIndentedString(cumQty)).append("\n");
    sb.append("    avgPx: ").append(toIndentedString(avgPx)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    tradePublishIndicator: ").append(toIndentedString(tradePublishIndicator)).append("\n");
    sb.append("    multiLegReportingType: ").append(toIndentedString(multiLegReportingType)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    trdMatchID: ").append(toIndentedString(trdMatchID)).append("\n");
    sb.append("    execCost: ").append(toIndentedString(execCost)).append("\n");
    sb.append("    execComm: ").append(toIndentedString(execComm)).append("\n");
    sb.append("    homeNotional: ").append(toIndentedString(homeNotional)).append("\n");
    sb.append("    foreignNotional: ").append(toIndentedString(foreignNotional)).append("\n");
    sb.append("    transactTime: ").append(toIndentedString(transactTime)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

