package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.LocalDate;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-05T09:41:19.947-05:00")

public class Order   {
  
  private String orderID = null;
  private String clOrdID = null;
  private String clOrdLinkID = null;
  private BigDecimal account = null;
  private String symbol = null;
  private String side = null;
  private Double simpleOrderQty = null;
  private BigDecimal orderQty = null;
  private Double price = null;
  private BigDecimal displayQty = null;
  private Double stopPx = null;
  private Double pegOffsetValue = null;
  private String pegPriceType = null;
  private String currency = null;
  private String settlCurrency = null;
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
  private String multiLegReportingType = null;
  private String text = null;
  private LocalDate transactTime = null;
  private LocalDate timestamp = null;

  /**
   **/
  public Order orderID(String orderID) {
    this.orderID = orderID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("orderID")
  public String getOrderID() {
    return orderID;
  }
  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }

  /**
   **/
  public Order clOrdID(String clOrdID) {
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
  public Order clOrdLinkID(String clOrdLinkID) {
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
  public Order account(BigDecimal account) {
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
  public Order symbol(String symbol) {
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
  public Order side(String side) {
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
  public Order simpleOrderQty(Double simpleOrderQty) {
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
  public Order orderQty(BigDecimal orderQty) {
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
  public Order price(Double price) {
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
  public Order displayQty(BigDecimal displayQty) {
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
  public Order stopPx(Double stopPx) {
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
  public Order pegOffsetValue(Double pegOffsetValue) {
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
  public Order pegPriceType(String pegPriceType) {
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
  public Order currency(String currency) {
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
  public Order settlCurrency(String settlCurrency) {
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
  public Order ordType(String ordType) {
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
  public Order timeInForce(String timeInForce) {
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
  public Order execInst(String execInst) {
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
  public Order contingencyType(String contingencyType) {
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
  public Order exDestination(String exDestination) {
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
  public Order ordStatus(String ordStatus) {
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
  public Order triggered(String triggered) {
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
  public Order workingIndicator(Boolean workingIndicator) {
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
  public Order ordRejReason(String ordRejReason) {
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
  public Order simpleLeavesQty(Double simpleLeavesQty) {
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
  public Order leavesQty(BigDecimal leavesQty) {
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
  public Order simpleCumQty(Double simpleCumQty) {
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
  public Order cumQty(BigDecimal cumQty) {
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
  public Order avgPx(Double avgPx) {
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
  public Order multiLegReportingType(String multiLegReportingType) {
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
  public Order text(String text) {
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
  public Order transactTime(LocalDate transactTime) {
    this.transactTime = transactTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("transactTime")
  public LocalDate getTransactTime() {
    return transactTime;
  }
  public void setTransactTime(LocalDate transactTime) {
    this.transactTime = transactTime;
  }

  /**
   **/
  public Order timestamp(LocalDate timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timestamp")
  public LocalDate getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(LocalDate timestamp) {
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
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
    sb.append("    clOrdID: ").append(toIndentedString(clOrdID)).append("\n");
    sb.append("    clOrdLinkID: ").append(toIndentedString(clOrdLinkID)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    simpleOrderQty: ").append(toIndentedString(simpleOrderQty)).append("\n");
    sb.append("    orderQty: ").append(toIndentedString(orderQty)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    displayQty: ").append(toIndentedString(displayQty)).append("\n");
    sb.append("    stopPx: ").append(toIndentedString(stopPx)).append("\n");
    sb.append("    pegOffsetValue: ").append(toIndentedString(pegOffsetValue)).append("\n");
    sb.append("    pegPriceType: ").append(toIndentedString(pegPriceType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    settlCurrency: ").append(toIndentedString(settlCurrency)).append("\n");
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
    sb.append("    multiLegReportingType: ").append(toIndentedString(multiLegReportingType)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

