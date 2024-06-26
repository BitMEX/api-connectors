/*
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.42-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/XAny'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./XAny'));
  } else {
    // Browser globals (root is window)
    if (!root.BitMexApi) {
      root.BitMexApi = {};
    }
    root.BitMexApi.APIKey = factory(root.BitMexApi.ApiClient, root.BitMexApi.XAny);
  }
}(this, function(ApiClient, XAny) {
  'use strict';

  /**
   * The APIKey model module.
   * @module model/APIKey
   * @version 1.2.0
   */

  /**
   * Constructs a new <code>APIKey</code>.
   * Persistent API Keys for Developers
   * @alias module:model/APIKey
   * @class
   * @param id {String} 
   * @param secret {String} 
   * @param name {String} 
   * @param nonce {Number} 
   * @param userId {Number} 
   */
  var exports = function(id, secret, name, nonce, userId) {
    this.id = id;
    this.secret = secret;
    this.name = name;
    this.nonce = nonce;
    this.userId = userId;
  };

  /**
   * Constructs a <code>APIKey</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/APIKey} obj Optional instance to populate.
   * @return {module:model/APIKey} The populated <code>APIKey</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('id'))
        obj.id = ApiClient.convertToType(data['id'], 'String');
      if (data.hasOwnProperty('secret'))
        obj.secret = ApiClient.convertToType(data['secret'], 'String');
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
      if (data.hasOwnProperty('nonce'))
        obj.nonce = ApiClient.convertToType(data['nonce'], 'Number');
      if (data.hasOwnProperty('cidr'))
        obj.cidr = ApiClient.convertToType(data['cidr'], 'String');
      if (data.hasOwnProperty('cidrs'))
        obj.cidrs = ApiClient.convertToType(data['cidrs'], [XAny]);
      if (data.hasOwnProperty('targetAccountId'))
        obj.targetAccountId = ApiClient.convertToType(data['targetAccountId'], 'Number');
      if (data.hasOwnProperty('permissions'))
        obj.permissions = ApiClient.convertToType(data['permissions'], [XAny]);
      if (data.hasOwnProperty('enabled'))
        obj.enabled = ApiClient.convertToType(data['enabled'], 'Boolean');
      if (data.hasOwnProperty('userId'))
        obj.userId = ApiClient.convertToType(data['userId'], 'Number');
      if (data.hasOwnProperty('created'))
        obj.created = ApiClient.convertToType(data['created'], 'Date');
    }
    return obj;
  }

  /**
   * @member {String} id
   */
  exports.prototype.id = undefined;

  /**
   * @member {String} secret
   */
  exports.prototype.secret = undefined;

  /**
   * @member {String} name
   */
  exports.prototype.name = undefined;

  /**
   * @member {Number} nonce
   * @default 0
   */
  exports.prototype.nonce = 0;

  /**
   * @member {String} cidr
   */
  exports.prototype.cidr = undefined;

  /**
   * @member {Array.<module:model/XAny>} cidrs
   */
  exports.prototype.cidrs = undefined;

  /**
   * @member {Number} targetAccountId
   */
  exports.prototype.targetAccountId = undefined;

  /**
   * @member {Array.<module:model/XAny>} permissions
   */
  exports.prototype.permissions = undefined;

  /**
   * @member {Boolean} enabled
   * @default false
   */
  exports.prototype.enabled = false;

  /**
   * @member {Number} userId
   */
  exports.prototype.userId = undefined;

  /**
   * @member {Date} created
   */
  exports.prototype.created = undefined;


  return exports;

}));
