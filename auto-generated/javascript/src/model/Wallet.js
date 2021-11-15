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
    root.BitMexApi.Wallet = factory(root.BitMexApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The Wallet model module.
   * @module model/Wallet
   * @version 1.2.0
   */

  /**
   * Constructs a new <code>Wallet</code>.
   * @alias module:model/Wallet
   * @class
   * @param account {Number} 
   * @param currency {String} 
   */
  var exports = function(account, currency) {
    this.account = account;
    this.currency = currency;
  };

  /**
   * Constructs a <code>Wallet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Wallet} obj Optional instance to populate.
   * @return {module:model/Wallet} The populated <code>Wallet</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('account'))
        obj.account = ApiClient.convertToType(data['account'], 'Number');
      if (data.hasOwnProperty('currency'))
        obj.currency = ApiClient.convertToType(data['currency'], 'String');
      if (data.hasOwnProperty('prevDeposited'))
        obj.prevDeposited = ApiClient.convertToType(data['prevDeposited'], 'Number');
      if (data.hasOwnProperty('prevWithdrawn'))
        obj.prevWithdrawn = ApiClient.convertToType(data['prevWithdrawn'], 'Number');
      if (data.hasOwnProperty('prevTransferIn'))
        obj.prevTransferIn = ApiClient.convertToType(data['prevTransferIn'], 'Number');
      if (data.hasOwnProperty('prevTransferOut'))
        obj.prevTransferOut = ApiClient.convertToType(data['prevTransferOut'], 'Number');
      if (data.hasOwnProperty('prevAmount'))
        obj.prevAmount = ApiClient.convertToType(data['prevAmount'], 'Number');
      if (data.hasOwnProperty('prevTimestamp'))
        obj.prevTimestamp = ApiClient.convertToType(data['prevTimestamp'], 'Date');
      if (data.hasOwnProperty('deltaDeposited'))
        obj.deltaDeposited = ApiClient.convertToType(data['deltaDeposited'], 'Number');
      if (data.hasOwnProperty('deltaWithdrawn'))
        obj.deltaWithdrawn = ApiClient.convertToType(data['deltaWithdrawn'], 'Number');
      if (data.hasOwnProperty('deltaTransferIn'))
        obj.deltaTransferIn = ApiClient.convertToType(data['deltaTransferIn'], 'Number');
      if (data.hasOwnProperty('deltaTransferOut'))
        obj.deltaTransferOut = ApiClient.convertToType(data['deltaTransferOut'], 'Number');
      if (data.hasOwnProperty('deltaAmount'))
        obj.deltaAmount = ApiClient.convertToType(data['deltaAmount'], 'Number');
      if (data.hasOwnProperty('deposited'))
        obj.deposited = ApiClient.convertToType(data['deposited'], 'Number');
      if (data.hasOwnProperty('withdrawn'))
        obj.withdrawn = ApiClient.convertToType(data['withdrawn'], 'Number');
      if (data.hasOwnProperty('transferIn'))
        obj.transferIn = ApiClient.convertToType(data['transferIn'], 'Number');
      if (data.hasOwnProperty('transferOut'))
        obj.transferOut = ApiClient.convertToType(data['transferOut'], 'Number');
      if (data.hasOwnProperty('amount'))
        obj.amount = ApiClient.convertToType(data['amount'], 'Number');
      if (data.hasOwnProperty('pendingCredit'))
        obj.pendingCredit = ApiClient.convertToType(data['pendingCredit'], 'Number');
      if (data.hasOwnProperty('pendingDebit'))
        obj.pendingDebit = ApiClient.convertToType(data['pendingDebit'], 'Number');
      if (data.hasOwnProperty('confirmedDebit'))
        obj.confirmedDebit = ApiClient.convertToType(data['confirmedDebit'], 'Number');
      if (data.hasOwnProperty('timestamp'))
        obj.timestamp = ApiClient.convertToType(data['timestamp'], 'Date');
    }
    return obj;
  }

  /**
   * @member {Number} account
   */
  exports.prototype.account = undefined;

  /**
   * @member {String} currency
   */
  exports.prototype.currency = undefined;

  /**
   * @member {Number} prevDeposited
   */
  exports.prototype.prevDeposited = undefined;

  /**
   * @member {Number} prevWithdrawn
   */
  exports.prototype.prevWithdrawn = undefined;

  /**
   * @member {Number} prevTransferIn
   */
  exports.prototype.prevTransferIn = undefined;

  /**
   * @member {Number} prevTransferOut
   */
  exports.prototype.prevTransferOut = undefined;

  /**
   * @member {Number} prevAmount
   */
  exports.prototype.prevAmount = undefined;

  /**
   * @member {Date} prevTimestamp
   */
  exports.prototype.prevTimestamp = undefined;

  /**
   * @member {Number} deltaDeposited
   */
  exports.prototype.deltaDeposited = undefined;

  /**
   * @member {Number} deltaWithdrawn
   */
  exports.prototype.deltaWithdrawn = undefined;

  /**
   * @member {Number} deltaTransferIn
   */
  exports.prototype.deltaTransferIn = undefined;

  /**
   * @member {Number} deltaTransferOut
   */
  exports.prototype.deltaTransferOut = undefined;

  /**
   * @member {Number} deltaAmount
   */
  exports.prototype.deltaAmount = undefined;

  /**
   * @member {Number} deposited
   */
  exports.prototype.deposited = undefined;

  /**
   * @member {Number} withdrawn
   */
  exports.prototype.withdrawn = undefined;

  /**
   * @member {Number} transferIn
   */
  exports.prototype.transferIn = undefined;

  /**
   * @member {Number} transferOut
   */
  exports.prototype.transferOut = undefined;

  /**
   * @member {Number} amount
   */
  exports.prototype.amount = undefined;

  /**
   * @member {Number} pendingCredit
   */
  exports.prototype.pendingCredit = undefined;

  /**
   * @member {Number} pendingDebit
   */
  exports.prototype.pendingDebit = undefined;

  /**
   * @member {Number} confirmedDebit
   */
  exports.prototype.confirmedDebit = undefined;

  /**
   * @member {Date} timestamp
   */
  exports.prototype.timestamp = undefined;


  return exports;

}));
