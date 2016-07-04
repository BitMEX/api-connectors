package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Order  {
  
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
  private Date transactTime = null;
  @SerializedName("timestamp")
  private Date timestamp = null;

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
    Order order = (Order) o;
    return (orderID == null ? order.orderID == null : orderID.equals(order.orderID)) &&
        (clOrdID == null ? order.clOrdID == null : clOrdID.equals(order.clOrdID)) &&
        (clOrdLinkID == null ? order.clOrdLinkID == null : clOrdLinkID.equals(order.clOrdLinkID)) &&
        (account == null ? order.account == null : account.equals(order.account)) &&
        (symbol == null ? order.symbol == null : symbol.equals(order.symbol)) &&
        (side == null ? order.side == null : side.equals(order.side)) &&
        (simpleOrderQty == null ? order.simpleOrderQty == null : simpleOrderQty.equals(order.simpleOrderQty)) &&
        (orderQty == null ? order.orderQty == null : orderQty.equals(order.orderQty)) &&
        (price == null ? order.price == null : price.equals(order.price)) &&
        (displayQty == null ? order.displayQty == null : displayQty.equals(order.displayQty)) &&
        (stopPx == null ? order.stopPx == null : stopPx.equals(order.stopPx)) &&
        (pegOffsetValue == null ? order.pegOffsetValue == null : pegOffsetValue.equals(order.pegOffsetValue)) &&
        (pegPriceType == null ? order.pegPriceType == null : pegPriceType.equals(order.pegPriceType)) &&
        (currency == null ? order.currency == null : currency.equals(order.currency)) &&
        (settlCurrency == null ? order.settlCurrency == null : settlCurrency.equals(order.settlCurrency)) &&
        (ordType == null ? order.ordType == null : ordType.equals(order.ordType)) &&
        (timeInForce == null ? order.timeInForce == null : timeInForce.equals(order.timeInForce)) &&
        (execInst == null ? order.execInst == null : execInst.equals(order.execInst)) &&
        (contingencyType == null ? order.contingencyType == null : contingencyType.equals(order.contingencyType)) &&
        (exDestination == null ? order.exDestination == null : exDestination.equals(order.exDestination)) &&
        (ordStatus == null ? order.ordStatus == null : ordStatus.equals(order.ordStatus)) &&
        (triggered == null ? order.triggered == null : triggered.equals(order.triggered)) &&
        (workingIndicator == null ? order.workingIndicator == null : workingIndicator.equals(order.workingIndicator)) &&
        (ordRejReason == null ? order.ordRejReason == null : ordRejReason.equals(order.ordRejReason)) &&
        (simpleLeavesQty == null ? order.simpleLeavesQty == null : simpleLeavesQty.equals(order.simpleLeavesQty)) &&
        (leavesQty == null ? order.leavesQty == null : leavesQty.equals(order.leavesQty)) &&
        (simpleCumQty == null ? order.simpleCumQty == null : simpleCumQty.equals(order.simpleCumQty)) &&
        (cumQty == null ? order.cumQty == null : cumQty.equals(order.cumQty)) &&
        (avgPx == null ? order.avgPx == null : avgPx.equals(order.avgPx)) &&
        (multiLegReportingType == null ? order.multiLegReportingType == null : multiLegReportingType.equals(order.multiLegReportingType)) &&
        (text == null ? order.text == null : text.equals(order.text)) &&
        (transactTime == null ? order.transactTime == null : transactTime.equals(order.transactTime)) &&
        (timestamp == null ? order.timestamp == null : timestamp.equals(order.timestamp));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (orderID == null ? 0: orderID.hashCode());
    result = 31 * result + (clOrdID == null ? 0: clOrdID.hashCode());
    result = 31 * result + (clOrdLinkID == null ? 0: clOrdLinkID.hashCode());
    result = 31 * result + (account == null ? 0: account.hashCode());
    result = 31 * result + (symbol == null ? 0: symbol.hashCode());
    result = 31 * result + (side == null ? 0: side.hashCode());
    result = 31 * result + (simpleOrderQty == null ? 0: simpleOrderQty.hashCode());
    result = 31 * result + (orderQty == null ? 0: orderQty.hashCode());
    result = 31 * result + (price == null ? 0: price.hashCode());
    result = 31 * result + (displayQty == null ? 0: displayQty.hashCode());
    result = 31 * result + (stopPx == null ? 0: stopPx.hashCode());
    result = 31 * result + (pegOffsetValue == null ? 0: pegOffsetValue.hashCode());
    result = 31 * result + (pegPriceType == null ? 0: pegPriceType.hashCode());
    result = 31 * result + (currency == null ? 0: currency.hashCode());
    result = 31 * result + (settlCurrency == null ? 0: settlCurrency.hashCode());
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
    result = 31 * result + (multiLegReportingType == null ? 0: multiLegReportingType.hashCode());
    result = 31 * result + (text == null ? 0: text.hashCode());
    result = 31 * result + (transactTime == null ? 0: transactTime.hashCode());
    result = 31 * result + (timestamp == null ? 0: timestamp.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("  orderID: ").append(orderID).append("\n");
    sb.append("  clOrdID: ").append(clOrdID).append("\n");
    sb.append("  clOrdLinkID: ").append(clOrdLinkID).append("\n");
    sb.append("  account: ").append(account).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  simpleOrderQty: ").append(simpleOrderQty).append("\n");
    sb.append("  orderQty: ").append(orderQty).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  displayQty: ").append(displayQty).append("\n");
    sb.append("  stopPx: ").append(stopPx).append("\n");
    sb.append("  pegOffsetValue: ").append(pegOffsetValue).append("\n");
    sb.append("  pegPriceType: ").append(pegPriceType).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  settlCurrency: ").append(settlCurrency).append("\n");
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
    sb.append("  multiLegReportingType: ").append(multiLegReportingType).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  transactTime: ").append(transactTime).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
