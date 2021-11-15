/*
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  ---  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  ---  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.24-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.BitMexApi) {
      root.BitMexApi = {};
    }
    root.BitMexApi.Order = factory(root.BitMexApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The Order model module.
   * @module model/Order
   * @version 1.2.0
   */

  /**
   * Constructs a new <code>Order</code>.
   * Placement, Cancellation, Amending, and History
   * @alias module:model/Order
   * @class
   * @param orderID {String} 
   */
  var exports = function(orderID) {
    this.orderID = orderID;
  };

  /**
   * Constructs a <code>Order</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Order} obj Optional instance to populate.
   * @return {module:model/Order} The populated <code>Order</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('orderID'))
        obj.orderID = ApiClient.convertToType(data['orderID'], 'String');
      if (data.hasOwnProperty('clOrdID'))
        obj.clOrdID = ApiClient.convertToType(data['clOrdID'], 'String');
      if (data.hasOwnProperty('clOrdLinkID'))
        obj.clOrdLinkID = ApiClient.convertToType(data['clOrdLinkID'], 'String');
      if (data.hasOwnProperty('account'))
        obj.account = ApiClient.convertToType(data['account'], 'Number');
      if (data.hasOwnProperty('symbol'))
        obj.symbol = ApiClient.convertToType(data['symbol'], 'String');
      if (data.hasOwnProperty('side'))
        obj.side = ApiClient.convertToType(data['side'], 'String');
      if (data.hasOwnProperty('simpleOrderQty'))
        obj.simpleOrderQty = ApiClient.convertToType(data['simpleOrderQty'], 'Number');
      if (data.hasOwnProperty('orderQty'))
        obj.orderQty = ApiClient.convertToType(data['orderQty'], 'Number');
      if (data.hasOwnProperty('price'))
        obj.price = ApiClient.convertToType(data['price'], 'Number');
      if (data.hasOwnProperty('displayQty'))
        obj.displayQty = ApiClient.convertToType(data['displayQty'], 'Number');
      if (data.hasOwnProperty('stopPx'))
        obj.stopPx = ApiClient.convertToType(data['stopPx'], 'Number');
      if (data.hasOwnProperty('pegOffsetValue'))
        obj.pegOffsetValue = ApiClient.convertToType(data['pegOffsetValue'], 'Number');
      if (data.hasOwnProperty('pegPriceType'))
        obj.pegPriceType = ApiClient.convertToType(data['pegPriceType'], 'String');
      if (data.hasOwnProperty('currency'))
        obj.currency = ApiClient.convertToType(data['currency'], 'String');
      if (data.hasOwnProperty('settlCurrency'))
        obj.settlCurrency = ApiClient.convertToType(data['settlCurrency'], 'String');
      if (data.hasOwnProperty('ordType'))
        obj.ordType = ApiClient.convertToType(data['ordType'], 'String');
      if (data.hasOwnProperty('timeInForce'))
        obj.timeInForce = ApiClient.convertToType(data['timeInForce'], 'String');
      if (data.hasOwnProperty('execInst'))
        obj.execInst = ApiClient.convertToType(data['execInst'], 'String');
      if (data.hasOwnProperty('contingencyType'))
        obj.contingencyType = ApiClient.convertToType(data['contingencyType'], 'String');
      if (data.hasOwnProperty('exDestination'))
        obj.exDestination = ApiClient.convertToType(data['exDestination'], 'String');
      if (data.hasOwnProperty('ordStatus'))
        obj.ordStatus = ApiClient.convertToType(data['ordStatus'], 'String');
      if (data.hasOwnProperty('triggered'))
        obj.triggered = ApiClient.convertToType(data['triggered'], 'String');
      if (data.hasOwnProperty('workingIndicator'))
        obj.workingIndicator = ApiClient.convertToType(data['workingIndicator'], 'Boolean');
      if (data.hasOwnProperty('ordRejReason'))
        obj.ordRejReason = ApiClient.convertToType(data['ordRejReason'], 'String');
      if (data.hasOwnProperty('simpleLeavesQty'))
        obj.simpleLeavesQty = ApiClient.convertToType(data['simpleLeavesQty'], 'Number');
      if (data.hasOwnProperty('leavesQty'))
        obj.leavesQty = ApiClient.convertToType(data['leavesQty'], 'Number');
      if (data.hasOwnProperty('simpleCumQty'))
        obj.simpleCumQty = ApiClient.convertToType(data['simpleCumQty'], 'Number');
      if (data.hasOwnProperty('cumQty'))
        obj.cumQty = ApiClient.convertToType(data['cumQty'], 'Number');
      if (data.hasOwnProperty('avgPx'))
        obj.avgPx = ApiClient.convertToType(data['avgPx'], 'Number');
      if (data.hasOwnProperty('multiLegReportingType'))
        obj.multiLegReportingType = ApiClient.convertToType(data['multiLegReportingType'], 'String');
      if (data.hasOwnProperty('text'))
        obj.text = ApiClient.convertToType(data['text'], 'String');
      if (data.hasOwnProperty('transactTime'))
        obj.transactTime = ApiClient.convertToType(data['transactTime'], 'Date');
      if (data.hasOwnProperty('timestamp'))
        obj.timestamp = ApiClient.convertToType(data['timestamp'], 'Date');
    }
    return obj;
  }

  /**
   * @member {String} orderID
   */
  exports.prototype.orderID = undefined;

  /**
   * @member {String} clOrdID
   */
  exports.prototype.clOrdID = undefined;

  /**
   * @member {String} clOrdLinkID
   */
  exports.prototype.clOrdLinkID = undefined;

  /**
   * @member {Number} account
   */
  exports.prototype.account = undefined;

  /**
   * @member {String} symbol
   */
  exports.prototype.symbol = undefined;

  /**
   * @member {String} side
   */
  exports.prototype.side = undefined;

  /**
   * @member {Number} simpleOrderQty
   */
  exports.prototype.simpleOrderQty = undefined;

  /**
   * @member {Number} orderQty
   */
  exports.prototype.orderQty = undefined;

  /**
   * @member {Number} price
   */
  exports.prototype.price = undefined;

  /**
   * @member {Number} displayQty
   */
  exports.prototype.displayQty = undefined;

  /**
   * @member {Number} stopPx
   */
  exports.prototype.stopPx = undefined;

  /**
   * @member {Number} pegOffsetValue
   */
  exports.prototype.pegOffsetValue = undefined;

  /**
   * @member {String} pegPriceType
   */
  exports.prototype.pegPriceType = undefined;

  /**
   * @member {String} currency
   */
  exports.prototype.currency = undefined;

  /**
   * @member {String} settlCurrency
   */
  exports.prototype.settlCurrency = undefined;

  /**
   * @member {String} ordType
   */
  exports.prototype.ordType = undefined;

  /**
   * @member {String} timeInForce
   */
  exports.prototype.timeInForce = undefined;

  /**
   * @member {String} execInst
   */
  exports.prototype.execInst = undefined;

  /**
   * @member {String} contingencyType
   */
  exports.prototype.contingencyType = undefined;

  /**
   * @member {String} exDestination
   */
  exports.prototype.exDestination = undefined;

  /**
   * @member {String} ordStatus
   */
  exports.prototype.ordStatus = undefined;

  /**
   * @member {String} triggered
   */
  exports.prototype.triggered = undefined;

  /**
   * @member {Boolean} workingIndicator
   */
  exports.prototype.workingIndicator = undefined;

  /**
   * @member {String} ordRejReason
   */
  exports.prototype.ordRejReason = undefined;

  /**
   * @member {Number} simpleLeavesQty
   */
  exports.prototype.simpleLeavesQty = undefined;

  /**
   * @member {Number} leavesQty
   */
  exports.prototype.leavesQty = undefined;

  /**
   * @member {Number} simpleCumQty
   */
  exports.prototype.simpleCumQty = undefined;

  /**
   * @member {Number} cumQty
   */
  exports.prototype.cumQty = undefined;

  /**
   * @member {Number} avgPx
   */
  exports.prototype.avgPx = undefined;

  /**
   * @member {String} multiLegReportingType
   */
  exports.prototype.multiLegReportingType = undefined;

  /**
   * @member {String} text
   */
  exports.prototype.text = undefined;

  /**
   * @member {Date} transactTime
   */
  exports.prototype.transactTime = undefined;

  /**
   * @member {Date} timestamp
   */
  exports.prototype.timestamp = undefined;


  return exports;

}));
