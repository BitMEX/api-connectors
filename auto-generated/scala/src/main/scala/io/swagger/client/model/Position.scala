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

package io.swagger.client.model

import java.util.Date

case class Position (
  account: Number,
  symbol: String,
  currency: Option[String] = None,
  underlying: Option[String] = None,
  quoteCurrency: Option[String] = None,
  commission: Option[Double] = None,
  initMarginReq: Option[Double] = None,
  maintMarginReq: Option[Double] = None,
  riskLimit: Option[Number] = None,
  leverage: Option[Double] = None,
  crossMargin: Option[Boolean] = None,
  deleveragePercentile: Option[Double] = None,
  rebalancedPnl: Option[Number] = None,
  prevRealisedPnl: Option[Number] = None,
  prevUnrealisedPnl: Option[Number] = None,
  openingQty: Option[Number] = None,
  openOrderBuyQty: Option[Number] = None,
  openOrderBuyCost: Option[Number] = None,
  openOrderBuyPremium: Option[Number] = None,
  openOrderSellQty: Option[Number] = None,
  openOrderSellCost: Option[Number] = None,
  openOrderSellPremium: Option[Number] = None,
  currentQty: Option[Number] = None,
  currentCost: Option[Number] = None,
  currentComm: Option[Number] = None,
  realisedCost: Option[Number] = None,
  unrealisedCost: Option[Number] = None,
  grossOpenPremium: Option[Number] = None,
  isOpen: Option[Boolean] = None,
  markPrice: Option[Double] = None,
  markValue: Option[Number] = None,
  riskValue: Option[Number] = None,
  homeNotional: Option[Double] = None,
  foreignNotional: Option[Double] = None,
  posState: Option[String] = None,
  posCost: Option[Number] = None,
  posCross: Option[Number] = None,
  posComm: Option[Number] = None,
  posLoss: Option[Number] = None,
  posMargin: Option[Number] = None,
  posMaint: Option[Number] = None,
  initMargin: Option[Number] = None,
  maintMargin: Option[Number] = None,
  realisedPnl: Option[Number] = None,
  unrealisedPnl: Option[Number] = None,
  unrealisedPnlPcnt: Option[Double] = None,
  unrealisedRoePcnt: Option[Double] = None,
  avgCostPrice: Option[Double] = None,
  avgEntryPrice: Option[Double] = None,
  breakEvenPrice: Option[Double] = None,
  marginCallPrice: Option[Double] = None,
  liquidationPrice: Option[Double] = None,
  bankruptPrice: Option[Double] = None,
  timestamp: Option[Date] = None
)

