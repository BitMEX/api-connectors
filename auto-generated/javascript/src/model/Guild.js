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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.BitMexApi) {
      root.BitMexApi = {};
    }
    root.BitMexApi.Guild = factory(root.BitMexApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The Guild model module.
   * @module model/Guild
   * @version 1.2.0
   */

  /**
   * Constructs a new <code>Guild</code>.
   * @alias module:model/Guild
   * @class
   * @param created {Date} 
   * @param updated {Date} 
   * @param name {String} 
   * @param chatChannelId {Number} 
   * @param isPrivate {Boolean} 
   */
  var exports = function(created, updated, name, chatChannelId, isPrivate) {
    this.created = created;
    this.updated = updated;
    this.name = name;
    this.chatChannelId = chatChannelId;
    this.isPrivate = isPrivate;
  };

  /**
   * Constructs a <code>Guild</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Guild} obj Optional instance to populate.
   * @return {module:model/Guild} The populated <code>Guild</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('id'))
        obj.id = ApiClient.convertToType(data['id'], 'Number');
      if (data.hasOwnProperty('created'))
        obj.created = ApiClient.convertToType(data['created'], 'Date');
      if (data.hasOwnProperty('updated'))
        obj.updated = ApiClient.convertToType(data['updated'], 'Date');
      if (data.hasOwnProperty('archived'))
        obj.archived = ApiClient.convertToType(data['archived'], 'Boolean');
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
      if (data.hasOwnProperty('imgUrl'))
        obj.imgUrl = ApiClient.convertToType(data['imgUrl'], 'String');
      if (data.hasOwnProperty('mobileHeroImgUrl'))
        obj.mobileHeroImgUrl = ApiClient.convertToType(data['mobileHeroImgUrl'], 'String');
      if (data.hasOwnProperty('emoji'))
        obj.emoji = ApiClient.convertToType(data['emoji'], 'String');
      if (data.hasOwnProperty('logoUrl'))
        obj.logoUrl = ApiClient.convertToType(data['logoUrl'], 'String');
      if (data.hasOwnProperty('description'))
        obj.description = ApiClient.convertToType(data['description'], 'String');
      if (data.hasOwnProperty('chatChannelId'))
        obj.chatChannelId = ApiClient.convertToType(data['chatChannelId'], 'Number');
      if (data.hasOwnProperty('isPrivate'))
        obj.isPrivate = ApiClient.convertToType(data['isPrivate'], 'Boolean');
      if (data.hasOwnProperty('affiliateId'))
        obj.affiliateId = ApiClient.convertToType(data['affiliateId'], 'String');
      if (data.hasOwnProperty('potDistributionPreferences'))
        obj.potDistributionPreferences = ApiClient.convertToType(data['potDistributionPreferences'], Object);
      if (data.hasOwnProperty('socials'))
        obj.socials = ApiClient.convertToType(data['socials'], Object);
      if (data.hasOwnProperty('deleted'))
        obj.deleted = ApiClient.convertToType(data['deleted'], 'Boolean');
    }
    return obj;
  }

  /**
   * @member {Number} id
   */
  exports.prototype.id = undefined;

  /**
   * @member {Date} created
   */
  exports.prototype.created = undefined;

  /**
   * @member {Date} updated
   */
  exports.prototype.updated = undefined;

  /**
   * @member {Boolean} archived
   */
  exports.prototype.archived = undefined;

  /**
   * @member {String} name
   */
  exports.prototype.name = undefined;

  /**
   * @member {String} imgUrl
   */
  exports.prototype.imgUrl = undefined;

  /**
   * @member {String} mobileHeroImgUrl
   */
  exports.prototype.mobileHeroImgUrl = undefined;

  /**
   * @member {String} emoji
   */
  exports.prototype.emoji = undefined;

  /**
   * @member {String} logoUrl
   */
  exports.prototype.logoUrl = undefined;

  /**
   * @member {String} description
   */
  exports.prototype.description = undefined;

  /**
   * @member {Number} chatChannelId
   */
  exports.prototype.chatChannelId = undefined;

  /**
   * @member {Boolean} isPrivate
   */
  exports.prototype.isPrivate = undefined;

  /**
   * @member {String} affiliateId
   */
  exports.prototype.affiliateId = undefined;

  /**
   * @member {Object} potDistributionPreferences
   */
  exports.prototype.potDistributionPreferences = undefined;

  /**
   * @member {Object} socials
   */
  exports.prototype.socials = undefined;

  /**
   * @member {Boolean} deleted
   */
  exports.prototype.deleted = undefined;


  return exports;

}));
