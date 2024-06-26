/**
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Raw Order and Balance Data
 **/
@ApiModel(description = "Raw Order and Balance Data")
public class Execution {
  
  @SerializedName("execID")
  private String execID = null;
  @SerializedName("orderID")
  private String orderID = null;
  @SerializedName("clOrdID")
  private String clOrdID = null;
  @SerializedName("clOrdLinkID")
  private String clOrdLinkID = null;
  @SerializedName("account")
  private Long account = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("side")
  private String side = null;
  @SerializedName("lastQty")
  private Long lastQty = null;
  @SerializedName("lastPx")
  private Double lastPx = null;
  @SerializedName("lastLiquidityInd")
  private String lastLiquidityInd = null;
  @SerializedName("orderQty")
  private Long orderQty = null;
  @SerializedName("price")
  private Double price = null;
  @SerializedName("displayQty")
  private Long displayQty = null;
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
  @SerializedName("ordStatus")
  private String ordStatus = null;
  @SerializedName("triggered")
  private String triggered = null;
  @SerializedName("workingIndicator")
  private Boolean workingIndicator = null;
  @SerializedName("ordRejReason")
  private String ordRejReason = null;
  @SerializedName("leavesQty")
  private Long leavesQty = null;
  @SerializedName("cumQty")
  private Long cumQty = null;
  @SerializedName("avgPx")
  private Double avgPx = null;
  @SerializedName("commission")
  private Double commission = null;
  @SerializedName("feeType")
  private String feeType = null;
  @SerializedName("tradePublishIndicator")
  private String tradePublishIndicator = null;
  @SerializedName("text")
  private String text = null;
  @SerializedName("trdMatchID")
  private String trdMatchID = null;
  @SerializedName("execCost")
  private Long execCost = null;
  @SerializedName("execComm")
  private Long execComm = null;
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
  @ApiModelProperty(value = "")
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
  public Long getAccount() {
    return account;
  }
  public void setAccount(Long account) {
    this.account = account;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
  public Long getLastQty() {
    return lastQty;
  }
  public void setLastQty(Long lastQty) {
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
  public String getLastLiquidityInd() {
    return lastLiquidityInd;
  }
  public void setLastLiquidityInd(String lastLiquidityInd) {
    this.lastLiquidityInd = lastLiquidityInd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getOrderQty() {
    return orderQty;
  }
  public void setOrderQty(Long orderQty) {
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
  public Long getDisplayQty() {
    return displayQty;
  }
  public void setDisplayQty(Long displayQty) {
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
  public Long getLeavesQty() {
    return leavesQty;
  }
  public void setLeavesQty(Long leavesQty) {
    this.leavesQty = leavesQty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getCumQty() {
    return cumQty;
  }
  public void setCumQty(Long cumQty) {
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
  public String getFeeType() {
    return feeType;
  }
  public void setFeeType(String feeType) {
    this.feeType = feeType;
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
  public Long getExecCost() {
    return execCost;
  }
  public void setExecCost(Long execCost) {
    this.execCost = execCost;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getExecComm() {
    return execComm;
  }
  public void setExecComm(Long execComm) {
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
  @ApiModelProperty(required = true, value = "")
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
    return (this.execID == null ? execution.execID == null : this.execID.equals(execution.execID)) &&
        (this.orderID == null ? execution.orderID == null : this.orderID.equals(execution.orderID)) &&
        (this.clOrdID == null ? execution.clOrdID == null : this.clOrdID.equals(execution.clOrdID)) &&
        (this.clOrdLinkID == null ? execution.clOrdLinkID == null : this.clOrdLinkID.equals(execution.clOrdLinkID)) &&
        (this.account == null ? execution.account == null : this.account.equals(execution.account)) &&
        (this.symbol == null ? execution.symbol == null : this.symbol.equals(execution.symbol)) &&
        (this.side == null ? execution.side == null : this.side.equals(execution.side)) &&
        (this.lastQty == null ? execution.lastQty == null : this.lastQty.equals(execution.lastQty)) &&
        (this.lastPx == null ? execution.lastPx == null : this.lastPx.equals(execution.lastPx)) &&
        (this.lastLiquidityInd == null ? execution.lastLiquidityInd == null : this.lastLiquidityInd.equals(execution.lastLiquidityInd)) &&
        (this.orderQty == null ? execution.orderQty == null : this.orderQty.equals(execution.orderQty)) &&
        (this.price == null ? execution.price == null : this.price.equals(execution.price)) &&
        (this.displayQty == null ? execution.displayQty == null : this.displayQty.equals(execution.displayQty)) &&
        (this.stopPx == null ? execution.stopPx == null : this.stopPx.equals(execution.stopPx)) &&
        (this.pegOffsetValue == null ? execution.pegOffsetValue == null : this.pegOffsetValue.equals(execution.pegOffsetValue)) &&
        (this.pegPriceType == null ? execution.pegPriceType == null : this.pegPriceType.equals(execution.pegPriceType)) &&
        (this.currency == null ? execution.currency == null : this.currency.equals(execution.currency)) &&
        (this.settlCurrency == null ? execution.settlCurrency == null : this.settlCurrency.equals(execution.settlCurrency)) &&
        (this.execType == null ? execution.execType == null : this.execType.equals(execution.execType)) &&
        (this.ordType == null ? execution.ordType == null : this.ordType.equals(execution.ordType)) &&
        (this.timeInForce == null ? execution.timeInForce == null : this.timeInForce.equals(execution.timeInForce)) &&
        (this.execInst == null ? execution.execInst == null : this.execInst.equals(execution.execInst)) &&
        (this.contingencyType == null ? execution.contingencyType == null : this.contingencyType.equals(execution.contingencyType)) &&
        (this.ordStatus == null ? execution.ordStatus == null : this.ordStatus.equals(execution.ordStatus)) &&
        (this.triggered == null ? execution.triggered == null : this.triggered.equals(execution.triggered)) &&
        (this.workingIndicator == null ? execution.workingIndicator == null : this.workingIndicator.equals(execution.workingIndicator)) &&
        (this.ordRejReason == null ? execution.ordRejReason == null : this.ordRejReason.equals(execution.ordRejReason)) &&
        (this.leavesQty == null ? execution.leavesQty == null : this.leavesQty.equals(execution.leavesQty)) &&
        (this.cumQty == null ? execution.cumQty == null : this.cumQty.equals(execution.cumQty)) &&
        (this.avgPx == null ? execution.avgPx == null : this.avgPx.equals(execution.avgPx)) &&
        (this.commission == null ? execution.commission == null : this.commission.equals(execution.commission)) &&
        (this.feeType == null ? execution.feeType == null : this.feeType.equals(execution.feeType)) &&
        (this.tradePublishIndicator == null ? execution.tradePublishIndicator == null : this.tradePublishIndicator.equals(execution.tradePublishIndicator)) &&
        (this.text == null ? execution.text == null : this.text.equals(execution.text)) &&
        (this.trdMatchID == null ? execution.trdMatchID == null : this.trdMatchID.equals(execution.trdMatchID)) &&
        (this.execCost == null ? execution.execCost == null : this.execCost.equals(execution.execCost)) &&
        (this.execComm == null ? execution.execComm == null : this.execComm.equals(execution.execComm)) &&
        (this.homeNotional == null ? execution.homeNotional == null : this.homeNotional.equals(execution.homeNotional)) &&
        (this.foreignNotional == null ? execution.foreignNotional == null : this.foreignNotional.equals(execution.foreignNotional)) &&
        (this.transactTime == null ? execution.transactTime == null : this.transactTime.equals(execution.transactTime)) &&
        (this.timestamp == null ? execution.timestamp == null : this.timestamp.equals(execution.timestamp));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.execID == null ? 0: this.execID.hashCode());
    result = 31 * result + (this.orderID == null ? 0: this.orderID.hashCode());
    result = 31 * result + (this.clOrdID == null ? 0: this.clOrdID.hashCode());
    result = 31 * result + (this.clOrdLinkID == null ? 0: this.clOrdLinkID.hashCode());
    result = 31 * result + (this.account == null ? 0: this.account.hashCode());
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    result = 31 * result + (this.side == null ? 0: this.side.hashCode());
    result = 31 * result + (this.lastQty == null ? 0: this.lastQty.hashCode());
    result = 31 * result + (this.lastPx == null ? 0: this.lastPx.hashCode());
    result = 31 * result + (this.lastLiquidityInd == null ? 0: this.lastLiquidityInd.hashCode());
    result = 31 * result + (this.orderQty == null ? 0: this.orderQty.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.displayQty == null ? 0: this.displayQty.hashCode());
    result = 31 * result + (this.stopPx == null ? 0: this.stopPx.hashCode());
    result = 31 * result + (this.pegOffsetValue == null ? 0: this.pegOffsetValue.hashCode());
    result = 31 * result + (this.pegPriceType == null ? 0: this.pegPriceType.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.settlCurrency == null ? 0: this.settlCurrency.hashCode());
    result = 31 * result + (this.execType == null ? 0: this.execType.hashCode());
    result = 31 * result + (this.ordType == null ? 0: this.ordType.hashCode());
    result = 31 * result + (this.timeInForce == null ? 0: this.timeInForce.hashCode());
    result = 31 * result + (this.execInst == null ? 0: this.execInst.hashCode());
    result = 31 * result + (this.contingencyType == null ? 0: this.contingencyType.hashCode());
    result = 31 * result + (this.ordStatus == null ? 0: this.ordStatus.hashCode());
    result = 31 * result + (this.triggered == null ? 0: this.triggered.hashCode());
    result = 31 * result + (this.workingIndicator == null ? 0: this.workingIndicator.hashCode());
    result = 31 * result + (this.ordRejReason == null ? 0: this.ordRejReason.hashCode());
    result = 31 * result + (this.leavesQty == null ? 0: this.leavesQty.hashCode());
    result = 31 * result + (this.cumQty == null ? 0: this.cumQty.hashCode());
    result = 31 * result + (this.avgPx == null ? 0: this.avgPx.hashCode());
    result = 31 * result + (this.commission == null ? 0: this.commission.hashCode());
    result = 31 * result + (this.feeType == null ? 0: this.feeType.hashCode());
    result = 31 * result + (this.tradePublishIndicator == null ? 0: this.tradePublishIndicator.hashCode());
    result = 31 * result + (this.text == null ? 0: this.text.hashCode());
    result = 31 * result + (this.trdMatchID == null ? 0: this.trdMatchID.hashCode());
    result = 31 * result + (this.execCost == null ? 0: this.execCost.hashCode());
    result = 31 * result + (this.execComm == null ? 0: this.execComm.hashCode());
    result = 31 * result + (this.homeNotional == null ? 0: this.homeNotional.hashCode());
    result = 31 * result + (this.foreignNotional == null ? 0: this.foreignNotional.hashCode());
    result = 31 * result + (this.transactTime == null ? 0: this.transactTime.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
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
    sb.append("  lastLiquidityInd: ").append(lastLiquidityInd).append("\n");
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
    sb.append("  ordStatus: ").append(ordStatus).append("\n");
    sb.append("  triggered: ").append(triggered).append("\n");
    sb.append("  workingIndicator: ").append(workingIndicator).append("\n");
    sb.append("  ordRejReason: ").append(ordRejReason).append("\n");
    sb.append("  leavesQty: ").append(leavesQty).append("\n");
    sb.append("  cumQty: ").append(cumQty).append("\n");
    sb.append("  avgPx: ").append(avgPx).append("\n");
    sb.append("  commission: ").append(commission).append("\n");
    sb.append("  feeType: ").append(feeType).append("\n");
    sb.append("  tradePublishIndicator: ").append(tradePublishIndicator).append("\n");
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
