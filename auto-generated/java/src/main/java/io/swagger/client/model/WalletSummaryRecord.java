/*
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WalletSummaryRecord
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-28T18:24:26.857+08:00")
public class WalletSummaryRecord {
  @SerializedName("account")
  private Double account = null;

  @SerializedName("currency")
  private String currency = "XBt";

  @SerializedName("transactType")
  private String transactType = null;

  @SerializedName("symbol")
  private String symbol = "XBTUSD";

  @SerializedName("amount")
  private Double amount = 0.0d;

  @SerializedName("pendingDebit")
  private Double pendingDebit = 0.0d;

  @SerializedName("realisedPnl")
  private Double realisedPnl = 0.0d;

  @SerializedName("walletBalance")
  private Double walletBalance = 0.0d;

  @SerializedName("unrealisedPnl")
  private Double unrealisedPnl = 0.0d;

  @SerializedName("marginBalance")
  private Double marginBalance = 0.0d;

  public WalletSummaryRecord account(Double account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getAccount() {
    return account;
  }

  public void setAccount(Double account) {
    this.account = account;
  }

  public WalletSummaryRecord currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public WalletSummaryRecord transactType(String transactType) {
    this.transactType = transactType;
    return this;
  }

   /**
   * Get transactType
   * @return transactType
  **/
  @ApiModelProperty(value = "")
  public String getTransactType() {
    return transactType;
  }

  public void setTransactType(String transactType) {
    this.transactType = transactType;
  }

  public WalletSummaryRecord symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public WalletSummaryRecord amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public WalletSummaryRecord pendingDebit(Double pendingDebit) {
    this.pendingDebit = pendingDebit;
    return this;
  }

   /**
   * Get pendingDebit
   * @return pendingDebit
  **/
  @ApiModelProperty(value = "")
  public Double getPendingDebit() {
    return pendingDebit;
  }

  public void setPendingDebit(Double pendingDebit) {
    this.pendingDebit = pendingDebit;
  }

  public WalletSummaryRecord realisedPnl(Double realisedPnl) {
    this.realisedPnl = realisedPnl;
    return this;
  }

   /**
   * Get realisedPnl
   * @return realisedPnl
  **/
  @ApiModelProperty(value = "")
  public Double getRealisedPnl() {
    return realisedPnl;
  }

  public void setRealisedPnl(Double realisedPnl) {
    this.realisedPnl = realisedPnl;
  }

  public WalletSummaryRecord walletBalance(Double walletBalance) {
    this.walletBalance = walletBalance;
    return this;
  }

   /**
   * Get walletBalance
   * @return walletBalance
  **/
  @ApiModelProperty(value = "")
  public Double getWalletBalance() {
    return walletBalance;
  }

  public void setWalletBalance(Double walletBalance) {
    this.walletBalance = walletBalance;
  }

  public WalletSummaryRecord unrealisedPnl(Double unrealisedPnl) {
    this.unrealisedPnl = unrealisedPnl;
    return this;
  }

   /**
   * Get unrealisedPnl
   * @return unrealisedPnl
  **/
  @ApiModelProperty(value = "")
  public Double getUnrealisedPnl() {
    return unrealisedPnl;
  }

  public void setUnrealisedPnl(Double unrealisedPnl) {
    this.unrealisedPnl = unrealisedPnl;
  }

  public WalletSummaryRecord marginBalance(Double marginBalance) {
    this.marginBalance = marginBalance;
    return this;
  }

   /**
   * Get marginBalance
   * @return marginBalance
  **/
  @ApiModelProperty(value = "")
  public Double getMarginBalance() {
    return marginBalance;
  }

  public void setMarginBalance(Double marginBalance) {
    this.marginBalance = marginBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletSummaryRecord walletSummaryRecord = (WalletSummaryRecord) o;
    return Objects.equals(this.account, walletSummaryRecord.account) &&
        Objects.equals(this.currency, walletSummaryRecord.currency) &&
        Objects.equals(this.transactType, walletSummaryRecord.transactType) &&
        Objects.equals(this.symbol, walletSummaryRecord.symbol) &&
        Objects.equals(this.amount, walletSummaryRecord.amount) &&
        Objects.equals(this.pendingDebit, walletSummaryRecord.pendingDebit) &&
        Objects.equals(this.realisedPnl, walletSummaryRecord.realisedPnl) &&
        Objects.equals(this.walletBalance, walletSummaryRecord.walletBalance) &&
        Objects.equals(this.unrealisedPnl, walletSummaryRecord.unrealisedPnl) &&
        Objects.equals(this.marginBalance, walletSummaryRecord.marginBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, currency, transactType, symbol, amount, pendingDebit, realisedPnl, walletBalance, unrealisedPnl, marginBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletSummaryRecord {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    transactType: ").append(toIndentedString(transactType)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    pendingDebit: ").append(toIndentedString(pendingDebit)).append("\n");
    sb.append("    realisedPnl: ").append(toIndentedString(realisedPnl)).append("\n");
    sb.append("    walletBalance: ").append(toIndentedString(walletBalance)).append("\n");
    sb.append("    unrealisedPnl: ").append(toIndentedString(unrealisedPnl)).append("\n");
    sb.append("    marginBalance: ").append(toIndentedString(marginBalance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

