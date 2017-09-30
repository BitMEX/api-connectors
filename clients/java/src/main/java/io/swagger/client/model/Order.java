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
 * Placement, Cancellation, Amending, and History
 **/
@ApiModel(description = "Placement, Cancellation, Amending, and History")
public class Order   {
  
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

  @SerializedName("multiLegReportingType")
  private String multiLegReportingType = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("transactTime")
  private OffsetDateTime transactTime = null;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
    Order order = (Order) o;
    return Objects.equals(orderID, order.orderID) &&
        Objects.equals(clOrdID, order.clOrdID) &&
        Objects.equals(clOrdLinkID, order.clOrdLinkID) &&
        Objects.equals(account, order.account) &&
        Objects.equals(symbol, order.symbol) &&
        Objects.equals(side, order.side) &&
        Objects.equals(simpleOrderQty, order.simpleOrderQty) &&
        Objects.equals(orderQty, order.orderQty) &&
        Objects.equals(price, order.price) &&
        Objects.equals(displayQty, order.displayQty) &&
        Objects.equals(stopPx, order.stopPx) &&
        Objects.equals(pegOffsetValue, order.pegOffsetValue) &&
        Objects.equals(pegPriceType, order.pegPriceType) &&
        Objects.equals(currency, order.currency) &&
        Objects.equals(settlCurrency, order.settlCurrency) &&
        Objects.equals(ordType, order.ordType) &&
        Objects.equals(timeInForce, order.timeInForce) &&
        Objects.equals(execInst, order.execInst) &&
        Objects.equals(contingencyType, order.contingencyType) &&
        Objects.equals(exDestination, order.exDestination) &&
        Objects.equals(ordStatus, order.ordStatus) &&
        Objects.equals(triggered, order.triggered) &&
        Objects.equals(workingIndicator, order.workingIndicator) &&
        Objects.equals(ordRejReason, order.ordRejReason) &&
        Objects.equals(simpleLeavesQty, order.simpleLeavesQty) &&
        Objects.equals(leavesQty, order.leavesQty) &&
        Objects.equals(simpleCumQty, order.simpleCumQty) &&
        Objects.equals(cumQty, order.cumQty) &&
        Objects.equals(avgPx, order.avgPx) &&
        Objects.equals(multiLegReportingType, order.multiLegReportingType) &&
        Objects.equals(text, order.text) &&
        Objects.equals(transactTime, order.transactTime) &&
        Objects.equals(timestamp, order.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderID, clOrdID, clOrdLinkID, account, symbol, side, simpleOrderQty, orderQty, price, displayQty, stopPx, pegOffsetValue, pegPriceType, currency, settlCurrency, ordType, timeInForce, execInst, contingencyType, exDestination, ordStatus, triggered, workingIndicator, ordRejReason, simpleLeavesQty, leavesQty, simpleCumQty, cumQty, avgPx, multiLegReportingType, text, transactTime, timestamp);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    orderID: ").append(StringUtil.toIndentedString(orderID)).append("\n");
    sb.append("    clOrdID: ").append(StringUtil.toIndentedString(clOrdID)).append("\n");
    sb.append("    clOrdLinkID: ").append(StringUtil.toIndentedString(clOrdLinkID)).append("\n");
    sb.append("    account: ").append(StringUtil.toIndentedString(account)).append("\n");
    sb.append("    symbol: ").append(StringUtil.toIndentedString(symbol)).append("\n");
    sb.append("    side: ").append(StringUtil.toIndentedString(side)).append("\n");
    sb.append("    simpleOrderQty: ").append(StringUtil.toIndentedString(simpleOrderQty)).append("\n");
    sb.append("    orderQty: ").append(StringUtil.toIndentedString(orderQty)).append("\n");
    sb.append("    price: ").append(StringUtil.toIndentedString(price)).append("\n");
    sb.append("    displayQty: ").append(StringUtil.toIndentedString(displayQty)).append("\n");
    sb.append("    stopPx: ").append(StringUtil.toIndentedString(stopPx)).append("\n");
    sb.append("    pegOffsetValue: ").append(StringUtil.toIndentedString(pegOffsetValue)).append("\n");
    sb.append("    pegPriceType: ").append(StringUtil.toIndentedString(pegPriceType)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    settlCurrency: ").append(StringUtil.toIndentedString(settlCurrency)).append("\n");
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
    sb.append("    multiLegReportingType: ").append(StringUtil.toIndentedString(multiLegReportingType)).append("\n");
    sb.append("    text: ").append(StringUtil.toIndentedString(text)).append("\n");
    sb.append("    transactTime: ").append(StringUtil.toIndentedString(transactTime)).append("\n");
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
