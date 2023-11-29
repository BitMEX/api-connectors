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

import java.math.BigDecimal;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Transaction {
  
  @SerializedName("transactID")
  private String transactID = null;
  @SerializedName("account")
  private BigDecimal account = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("network")
  private String network = null;
  @SerializedName("transactType")
  private String transactType = null;
  @SerializedName("amount")
  private BigDecimal amount = null;
  @SerializedName("fee")
  private BigDecimal fee = null;
  @SerializedName("transactStatus")
  private String transactStatus = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("tx")
  private String tx = null;
  @SerializedName("text")
  private String text = null;
  @SerializedName("transactTime")
  private Date transactTime = null;
  @SerializedName("timestamp")
  private Date timestamp = null;
  @SerializedName("walletBalance")
  private BigDecimal walletBalance = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTransactID() {
    return transactID;
  }
  public void setTransactID(String transactID) {
    this.transactID = transactID;
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
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNetwork() {
    return network;
  }
  public void setNetwork(String network) {
    this.network = network;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTransactType() {
    return transactType;
  }
  public void setTransactType(String transactType) {
    this.transactType = transactType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getFee() {
    return fee;
  }
  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTransactStatus() {
    return transactStatus;
  }
  public void setTransactStatus(String transactStatus) {
    this.transactStatus = transactStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTx() {
    return tx;
  }
  public void setTx(String tx) {
    this.tx = tx;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getWalletBalance() {
    return walletBalance;
  }
  public void setWalletBalance(BigDecimal walletBalance) {
    this.walletBalance = walletBalance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return (this.transactID == null ? transaction.transactID == null : this.transactID.equals(transaction.transactID)) &&
        (this.account == null ? transaction.account == null : this.account.equals(transaction.account)) &&
        (this.currency == null ? transaction.currency == null : this.currency.equals(transaction.currency)) &&
        (this.network == null ? transaction.network == null : this.network.equals(transaction.network)) &&
        (this.transactType == null ? transaction.transactType == null : this.transactType.equals(transaction.transactType)) &&
        (this.amount == null ? transaction.amount == null : this.amount.equals(transaction.amount)) &&
        (this.fee == null ? transaction.fee == null : this.fee.equals(transaction.fee)) &&
        (this.transactStatus == null ? transaction.transactStatus == null : this.transactStatus.equals(transaction.transactStatus)) &&
        (this.address == null ? transaction.address == null : this.address.equals(transaction.address)) &&
        (this.tx == null ? transaction.tx == null : this.tx.equals(transaction.tx)) &&
        (this.text == null ? transaction.text == null : this.text.equals(transaction.text)) &&
        (this.transactTime == null ? transaction.transactTime == null : this.transactTime.equals(transaction.transactTime)) &&
        (this.timestamp == null ? transaction.timestamp == null : this.timestamp.equals(transaction.timestamp)) &&
        (this.walletBalance == null ? transaction.walletBalance == null : this.walletBalance.equals(transaction.walletBalance));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.transactID == null ? 0: this.transactID.hashCode());
    result = 31 * result + (this.account == null ? 0: this.account.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.network == null ? 0: this.network.hashCode());
    result = 31 * result + (this.transactType == null ? 0: this.transactType.hashCode());
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.fee == null ? 0: this.fee.hashCode());
    result = 31 * result + (this.transactStatus == null ? 0: this.transactStatus.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.tx == null ? 0: this.tx.hashCode());
    result = 31 * result + (this.text == null ? 0: this.text.hashCode());
    result = 31 * result + (this.transactTime == null ? 0: this.transactTime.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    result = 31 * result + (this.walletBalance == null ? 0: this.walletBalance.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("  transactID: ").append(transactID).append("\n");
    sb.append("  account: ").append(account).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  network: ").append(network).append("\n");
    sb.append("  transactType: ").append(transactType).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  fee: ").append(fee).append("\n");
    sb.append("  transactStatus: ").append(transactStatus).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  tx: ").append(tx).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  transactTime: ").append(transactTime).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  walletBalance: ").append(walletBalance).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
