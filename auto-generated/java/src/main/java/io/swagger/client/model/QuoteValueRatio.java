/*
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  ---  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  ---  ## All API Endpoints  Click to expand a section. 
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
import org.threeten.bp.OffsetDateTime;

/**
 * Hourly Quote Value Ratio Statistic
 */
@ApiModel(description = "Hourly Quote Value Ratio Statistic")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-15T14:00:25.412+08:00")
public class QuoteValueRatio {
  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("account")
  private Double account = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("quoteCount")
  private Double quoteCount = null;

  @SerializedName("volumeXBT")
  private Double volumeXBT = null;

  @SerializedName("QVR")
  private Double QVR = null;

  @SerializedName("id")
  private Double id = null;

  public QuoteValueRatio timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public QuoteValueRatio account(Double account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public Double getAccount() {
    return account;
  }

  public void setAccount(Double account) {
    this.account = account;
  }

  public QuoteValueRatio symbol(String symbol) {
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

  public QuoteValueRatio quoteCount(Double quoteCount) {
    this.quoteCount = quoteCount;
    return this;
  }

   /**
   * Get quoteCount
   * @return quoteCount
  **/
  @ApiModelProperty(value = "")
  public Double getQuoteCount() {
    return quoteCount;
  }

  public void setQuoteCount(Double quoteCount) {
    this.quoteCount = quoteCount;
  }

  public QuoteValueRatio volumeXBT(Double volumeXBT) {
    this.volumeXBT = volumeXBT;
    return this;
  }

   /**
   * Get volumeXBT
   * @return volumeXBT
  **/
  @ApiModelProperty(value = "")
  public Double getVolumeXBT() {
    return volumeXBT;
  }

  public void setVolumeXBT(Double volumeXBT) {
    this.volumeXBT = volumeXBT;
  }

  public QuoteValueRatio QVR(Double QVR) {
    this.QVR = QVR;
    return this;
  }

   /**
   * Get QVR
   * @return QVR
  **/
  @ApiModelProperty(value = "")
  public Double getQVR() {
    return QVR;
  }

  public void setQVR(Double QVR) {
    this.QVR = QVR;
  }

  public QuoteValueRatio id(Double id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Double getId() {
    return id;
  }

  public void setId(Double id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteValueRatio quoteValueRatio = (QuoteValueRatio) o;
    return Objects.equals(this.timestamp, quoteValueRatio.timestamp) &&
        Objects.equals(this.account, quoteValueRatio.account) &&
        Objects.equals(this.symbol, quoteValueRatio.symbol) &&
        Objects.equals(this.quoteCount, quoteValueRatio.quoteCount) &&
        Objects.equals(this.volumeXBT, quoteValueRatio.volumeXBT) &&
        Objects.equals(this.QVR, quoteValueRatio.QVR) &&
        Objects.equals(this.id, quoteValueRatio.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, account, symbol, quoteCount, volumeXBT, QVR, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteValueRatio {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    quoteCount: ").append(toIndentedString(quoteCount)).append("\n");
    sb.append("    volumeXBT: ").append(toIndentedString(volumeXBT)).append("\n");
    sb.append("    QVR: ").append(toIndentedString(QVR)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

