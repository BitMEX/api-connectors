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
    define(['ApiClient', 'model/Chat', 'model/ChatChannel', 'model/ConnectedUsers', 'model/Error'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Chat'), require('../model/ChatChannel'), require('../model/ConnectedUsers'), require('../model/Error'));
  } else {
    // Browser globals (root is window)
    if (!root.BitMexApi) {
      root.BitMexApi = {};
    }
    root.BitMexApi.ChatApi = factory(root.BitMexApi.ApiClient, root.BitMexApi.Chat, root.BitMexApi.ChatChannel, root.BitMexApi.ConnectedUsers, root.BitMexApi.Error);
  }
}(this, function(ApiClient, Chat, ChatChannel, ConnectedUsers, Error) {
  'use strict';

  /**
   * Chat service.
   * @module api/ChatApi
   * @version 1.2.0
   */

  /**
   * Constructs a new ChatApi. 
   * @alias module:api/ChatApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the chatGet operation.
     * @callback module:api/ChatApi~chatGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Chat>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get chat messages.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.count Number of results to fetch. (default to 100)
     * @param {Number} opts.start Starting ID for results. (default to 0)
     * @param {Boolean} opts.reverse If true, will sort results newest first. (default to true)
     * @param {Number} opts.channelID Channel id. GET /chat/channels for ids. Leave blank for all.
     * @param {module:api/ChatApi~chatGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Chat>}
     */
    this.chatGet = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'count': opts['count'],
        'start': opts['start'],
        'reverse': opts['reverse'],
        'channelID': opts['channelID'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = [Chat];

      return this.apiClient.callApi(
        '/chat', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the chatGetChannels operation.
     * @callback module:api/ChatApi~chatGetChannelsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/ChatChannel>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get available channels.
     * @param {module:api/ChatApi~chatGetChannelsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/ChatChannel>}
     */
    this.chatGetChannels = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = [ChatChannel];

      return this.apiClient.callApi(
        '/chat/channels', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the chatGetConnected operation.
     * @callback module:api/ChatApi~chatGetConnectedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ConnectedUsers} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get connected users.
     * Returns an array with browser users in the first position and API users (bots) in the second position.
     * @param {module:api/ChatApi~chatGetConnectedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ConnectedUsers}
     */
    this.chatGetConnected = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = ConnectedUsers;

      return this.apiClient.callApi(
        '/chat/connected', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the chatNew operation.
     * @callback module:api/ChatApi~chatNewCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Chat} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Send a chat message.
     * @param {String} message 
     * @param {Object} opts Optional parameters
     * @param {Number} opts.channelID Channel to post to. Default 1 (English). (default to 1)
     * @param {module:api/ChatApi~chatNewCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Chat}
     */
    this.chatNew = function(message, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'message' is set
      if (message === undefined || message === null) {
        throw new Error("Missing the required parameter 'message' when calling chatNew");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'message': message,
        'channelID': opts['channelID']
      };

      var authNames = ['apiExpires', 'apiKey', 'apiSignature'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = Chat;

      return this.apiClient.callApi(
        '/chat', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
