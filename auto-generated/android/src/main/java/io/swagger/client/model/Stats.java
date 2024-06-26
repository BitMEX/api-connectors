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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Exchange Statistics
 **/
@ApiModel(description = "Exchange Statistics")
public class Stats {
  
  @SerializedName("rootSymbol")
  private String rootSymbol = null;
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("volume24h")
  private Long volume24h = null;
  @SerializedName("turnover24h")
  private Long turnover24h = null;
  @SerializedName("openInterest")
  private Long openInterest = null;
  @SerializedName("openValue")
  private Long openValue = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getRootSymbol() {
    return rootSymbol;
  }
  public void setRootSymbol(String rootSymbol) {
    this.rootSymbol = rootSymbol;
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
  public Long getVolume24h() {
    return volume24h;
  }
  public void setVolume24h(Long volume24h) {
    this.volume24h = volume24h;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTurnover24h() {
    return turnover24h;
  }
  public void setTurnover24h(Long turnover24h) {
    this.turnover24h = turnover24h;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getOpenInterest() {
    return openInterest;
  }
  public void setOpenInterest(Long openInterest) {
    this.openInterest = openInterest;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getOpenValue() {
    return openValue;
  }
  public void setOpenValue(Long openValue) {
    this.openValue = openValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stats stats = (Stats) o;
    return (this.rootSymbol == null ? stats.rootSymbol == null : this.rootSymbol.equals(stats.rootSymbol)) &&
        (this.currency == null ? stats.currency == null : this.currency.equals(stats.currency)) &&
        (this.volume24h == null ? stats.volume24h == null : this.volume24h.equals(stats.volume24h)) &&
        (this.turnover24h == null ? stats.turnover24h == null : this.turnover24h.equals(stats.turnover24h)) &&
        (this.openInterest == null ? stats.openInterest == null : this.openInterest.equals(stats.openInterest)) &&
        (this.openValue == null ? stats.openValue == null : this.openValue.equals(stats.openValue));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.rootSymbol == null ? 0: this.rootSymbol.hashCode());
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.volume24h == null ? 0: this.volume24h.hashCode());
    result = 31 * result + (this.turnover24h == null ? 0: this.turnover24h.hashCode());
    result = 31 * result + (this.openInterest == null ? 0: this.openInterest.hashCode());
    result = 31 * result + (this.openValue == null ? 0: this.openValue.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stats {\n");
    
    sb.append("  rootSymbol: ").append(rootSymbol).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  volume24h: ").append(volume24h).append("\n");
    sb.append("  turnover24h: ").append(turnover24h).append("\n");
    sb.append("  openInterest: ").append(openInterest).append("\n");
    sb.append("  openValue: ").append(openValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
