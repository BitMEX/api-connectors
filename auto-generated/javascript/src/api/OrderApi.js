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
    define(['ApiClient', 'model/Error', 'model/Order'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Error'), require('../model/Order'));
  } else {
    // Browser globals (root is window)
    if (!root.BitMexApi) {
      root.BitMexApi = {};
    }
    root.BitMexApi.OrderApi = factory(root.BitMexApi.ApiClient, root.BitMexApi.Error, root.BitMexApi.Order);
  }
}(this, function(ApiClient, Error, Order) {
  'use strict';

  /**
   * Order service.
   * @module api/OrderApi
   * @version 1.2.0
   */

  /**
   * Constructs a new OrderApi. 
   * @alias module:api/OrderApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the orderAmend operation.
     * @callback module:api/OrderApi~orderAmendCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Order} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Amend the quantity or price of an open order.
     * Send an `orderID` or `origClOrdID` to identify the order you wish to amend.  Both order quantity and price can be amended. Only one `qty` field can be used to amend.  Use the `leavesQty` field to specify how much of the order you wish to remain open. This can be useful if you want to adjust your position's delta by a certain amount, regardless of how much of the order has already filled.  > A `leavesQty` can be used to make a \"Filled\" order live again, if it is received within 60 seconds of the fill.  Like order placement, amending can be done in bulk. Simply send a request to `PUT /api/v1/order/bulk` with a JSON body of the shape: `{\"orders\": [{...}, {...}]}`, each object containing the fields used in this endpoint. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.orderID Order ID
     * @param {String} opts.origClOrdID Client Order ID. See POST /order.
     * @param {String} opts.clOrdID Optional new Client Order ID, requires `origClOrdID`.
     * @param {Number} opts.simpleOrderQty Deprecated: simple orders are not supported after 2018/10/26
     * @param {Number} opts.orderQty Optional order quantity in units of the instrument (i.e. contracts).
     * @param {Number} opts.simpleLeavesQty Deprecated: simple orders are not supported after 2018/10/26
     * @param {Number} opts.leavesQty Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.
     * @param {Number} opts.price Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.
     * @param {Number} opts.stopPx Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.
     * @param {Number} opts.pegOffsetValue Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders.
     * @param {String} opts.text Optional amend annotation. e.g. 'Adjust skew'.
     * @param {module:api/OrderApi~orderAmendCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Order}
     */
    this.orderAmend = function(opts, callback) {
      opts = opts || {};
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
        'orderID': opts['orderID'],
        'origClOrdID': opts['origClOrdID'],
        'clOrdID': opts['clOrdID'],
        'simpleOrderQty': opts['simpleOrderQty'],
        'orderQty': opts['orderQty'],
        'simpleLeavesQty': opts['simpleLeavesQty'],
        'leavesQty': opts['leavesQty'],
        'price': opts['price'],
        'stopPx': opts['stopPx'],
        'pegOffsetValue': opts['pegOffsetValue'],
        'text': opts['text']
      };

      var authNames = ['apiExpires', 'apiKey', 'apiSignature'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = Order;

      return this.apiClient.callApi(
        '/order', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderCancel operation.
     * @callback module:api/OrderApi~orderCancelCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Order>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancel order(s). Send multiple order IDs to cancel in bulk.
     * Either an orderID or a clOrdID must be provided.
     * @param {Object} opts Optional parameters
     * @param {String} opts.orderID Order ID(s).
     * @param {String} opts.clOrdID Client Order ID(s). See POST /order.
     * @param {String} opts.text Optional cancellation annotation. e.g. 'Spread Exceeded'.
     * @param {module:api/OrderApi~orderCancelCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Order>}
     */
    this.orderCancel = function(opts, callback) {
      opts = opts || {};
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
        'orderID': opts['orderID'],
        'clOrdID': opts['clOrdID'],
        'text': opts['text']
      };

      var authNames = ['apiExpires', 'apiKey', 'apiSignature'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = [Order];

      return this.apiClient.callApi(
        '/order', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderCancelAll operation.
     * @callback module:api/OrderApi~orderCancelAllCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Order>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancels all of your orders.
     * @param {Object} opts Optional parameters
     * @param {String} opts.symbol Optional symbol. If provided, only cancels orders for that symbol.
     * @param {String} opts.filter Optional filter for cancellation. Use to only cancel some orders, e.g. `{\"side\": \"Buy\"}`.
     * @param {String} opts.text Optional cancellation annotation. e.g. 'Spread Exceeded'
     * @param {module:api/OrderApi~orderCancelAllCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Order>}
     */
    this.orderCancelAll = function(opts, callback) {
      opts = opts || {};
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
        'symbol': opts['symbol'],
        'filter': opts['filter'],
        'text': opts['text']
      };

      var authNames = ['apiExpires', 'apiKey', 'apiSignature'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = [Order];

      return this.apiClient.callApi(
        '/order/all', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderCancelAllAfter operation.
     * @callback module:api/OrderApi~orderCancelAllAfterCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Automatically cancel all your orders after a specified timeout.
     * Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.  Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.  This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#Dead-Mans-Switch-Auto-Cancel). 
     * @param {Number} timeout Timeout in ms. Set to 0 to cancel this timer. 
     * @param {module:api/OrderApi~orderCancelAllAfterCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.orderCancelAllAfter = function(timeout, callback) {
      var postBody = null;

      // verify the required parameter 'timeout' is set
      if (timeout === undefined || timeout === null) {
        throw new Error("Missing the required parameter 'timeout' when calling orderCancelAllAfter");
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
        'timeout': timeout
      };

      var authNames = ['apiExpires', 'apiKey', 'apiSignature'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = Object;

      return this.apiClient.callApi(
        '/order/cancelAllAfter', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderClosePosition operation.
     * @callback module:api/OrderApi~orderClosePositionCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Order} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Close a position. [Deprecated, use POST /order with execInst: 'Close']
     * If no `price` is specified, a market order will be submitted to close the whole of your position. This will also close all other open orders in this symbol.
     * @param {String} symbol Symbol of position to close.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.price Optional limit price.
     * @param {module:api/OrderApi~orderClosePositionCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Order}
     */
    this.orderClosePosition = function(symbol, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'symbol' is set
      if (symbol === undefined || symbol === null) {
        throw new Error("Missing the required parameter 'symbol' when calling orderClosePosition");
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
        'symbol': symbol,
        'price': opts['price']
      };

      var authNames = ['apiExpires', 'apiKey', 'apiSignature'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = Order;

      return this.apiClient.callApi(
        '/order/closePosition', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderGetOrders operation.
     * @callback module:api/OrderApi~orderGetOrdersCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Order>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get your orders.
     * To get open orders only, send {\"open\": true} in the filter param.  See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\">the FIX Spec</a> for explanations of these fields.
     * @param {Object} opts Optional parameters
     * @param {String} opts.symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBT:quarterly`. Timeframes are `nearest`, `daily`, `weekly`, `monthly`, `quarterly`, `biquarterly`, and `perpetual`.  Symbols are case-insensitive.
     * @param {String} opts.filter Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details.
     * @param {String} opts.columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
     * @param {Number} opts.count Number of results to fetch. Must be a positive integer. (default to 100)
     * @param {Number} opts.start Starting point for results. (default to 0)
     * @param {Boolean} opts.reverse If true, will sort results newest first. (default to false)
     * @param {Date} opts.startTime Starting date filter for results.
     * @param {Date} opts.endTime Ending date filter for results.
     * @param {module:api/OrderApi~orderGetOrdersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Order>}
     */
    this.orderGetOrders = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'symbol': opts['symbol'],
        'filter': opts['filter'],
        'columns': opts['columns'],
        'count': opts['count'],
        'start': opts['start'],
        'reverse': opts['reverse'],
        'startTime': opts['startTime'],
        'endTime': opts['endTime'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['apiExpires', 'apiKey', 'apiSignature'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = [Order];

      return this.apiClient.callApi(
        '/order', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderNew operation.
     * @callback module:api/OrderApi~orderNewCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Order} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create a new order.
     * ## Placing Orders  This endpoint is used for placing orders. See individual fields below for more details on their use.  #### Order Types  All orders require a `symbol`. All other fields are optional except when otherwise specified.  These are the valid `ordType`s:  - **Limit**: The default order type. Specify an `orderQty` and `price`. - **Market**: A traditional Market order. A Market order will execute until filled or your bankruptcy price is reached, at   which point it will cancel. - **Stop**: A Stop Market order. Specify an `orderQty` and `stopPx`. When the `stopPx` is reached, the order will be entered   into the book.   - On sell orders, the order will trigger if the triggering price is lower than the `stopPx`. On buys, higher.   - Note: Stop orders do not consume margin until triggered. Be sure that the required margin is available in your     account so that it may trigger fully.   - `Close` Stops don't require an `orderQty`. See Execution Instructions below. - **StopLimit**: Like a Stop Market, but enters a Limit order instead of a Market order. Specify an `orderQty`, `stopPx`,   and `price`. - **MarketIfTouched**: Similar to a Stop, but triggers are done in the opposite direction. Useful for Take Profit orders. - **LimitIfTouched**: As above; use for Take Profit Limit orders. - **Pegged**: Pegged orders allow users to submit a limit price relative to the current market price. Specify a   `pegPriceType`, and `pegOffsetValue`.   - Pegged orders **must** have an `execInst` of `Fixed`. This means the limit price is set at the time the order     is accepted and does not change as the reference price changes.   - `PrimaryPeg`: Price is set relative to near touch price.   - `MarketPeg`: Price is set relative to far touch price.   - A `pegPriceType` submitted with no `ordType` is treated as a `Pegged` order.  #### Execution Instructions  The following `execInst`s are supported. If using multiple, separate with a comma (e.g. `LastPrice,Close`).  - **ParticipateDoNotInitiate**: Also known as a Post-Only order. If this order would have executed on placement, it will cancel instead.   This is intended to protect you from the far touch moving towards you while the order is in transit.   It is not intended for speculating on the far touch moving away after submission - we consider such behaviour abusive and monitor for it. - **MarkPrice, LastPrice, IndexPrice**: Used by stop and if-touched orders to determine the triggering price.   Use only one. By default, `MarkPrice` is used. Also used for Pegged orders to define the value of `LastPeg`. - **ReduceOnly**: A `ReduceOnly` order can only reduce your position, not increase it. If you have a `ReduceOnly`   limit order that rests in the order book while the position is reduced by other orders, then its order quantity will   be amended down or canceled. If there are multiple `ReduceOnly` orders the least aggressive will be amended first. - **Close**: `Close` implies `ReduceOnly`. A `Close` order will cancel other active limit orders with the same side   and symbol if the open quantity exceeds the current position. This is useful for stops: by canceling these orders, a   `Close` Stop is ensured to have the margin required to execute, and can only execute up to the full size of your   position. If `orderQty` is not specified, a `Close` order has an `orderQty` equal to your current position's size.   - Note that a `Close` order without an `orderQty` requires a `side`, so that BitMEX knows if it should trigger     above or below the `stopPx`. - **LastWithinMark**: Used by stop orders with `LastPrice` to allow stop triggers only when:   - For Sell Stop Market / Stop Limit Order     - Last Price &lt= Stop Price     - Last Price &gt= Mark Price × (1 - 5%)   - For Buy Stop Market / Stop Limit Order:     - Last Price &gt= Stop Price     - Last Price &lt= Mark Price × (1 + 5%) - **Fixed**: Pegged orders **must** have an `execInst` of `Fixed`. This means the limit price is set at the time   the order is accepted and does not change as the reference price changes.  #### Pegged Orders  Pegged orders allow users to submit a limit price relative to the current market price. The limit price is set once when the order is submitted and does not change with the reference price. This order type is not intended for speculating on the far touch moving away after submission - we consider such behaviour abusive and monitor for it.  Pegged orders have an `ordType` of `Pegged`, and an `execInst` of `Fixed`.  A `pegPriceType` and `pegOffsetValue` must also be submitted:  - `PrimaryPeg` - price is set relative to the **near touch** price - `MarketPeg` - price is set relative to the **far touch** price  #### Trailing Stop Pegged Orders  Use `pegPriceType` of `TrailingStopPeg` to create Trailing Stops.  The price is set at submission and updates once per second if the underlying price (last/mark/index) has moved by more than 0.1%. `stopPx` then moves as the market moves away from the peg, and freezes as the market moves toward it.  Use `pegOffsetValue` to set the `stopPx` of your order. The peg is set to the triggering price specified in the `execInst` (default `MarkPrice`). Use a negative offset for stop-sell and buy-if-touched orders.  Requires `ordType`: `Stop`, `StopLimit`, `MarketIfTouched`, `LimitIfTouched`.  #### Linked Orders  [Linked Orders are deprecated as of 2018/11/10](https://blog.bitmex.com/api_announcement/deprecation-of-contingent-orders/)  #### Trailing Stops  You may use `pegPriceType` of `'TrailingStopPeg'` to create Trailing Stops. The pegged `stopPx` will move as the market moves away from the peg, and freeze as the market moves toward it.  To use, combine with `pegOffsetValue` to set the `stopPx` of your order. The peg is set to the triggering price specified in the `execInst` (default `'MarkPrice'`). Use a negative offset for stop-sell and buy-if-touched orders.  Requires `ordType`: `'Stop', 'StopLimit', 'MarketIfTouched', 'LimitIfTouched'`.  #### Simple Quantities  [Simple Quantities are deprecated as of 2018/10/26](https://blog.bitmex.com/api_announcement/deprecation-of-simpleorderqty-functionality/)  #### Rate Limits  See the [Bulk Order Documentation](#!/Order/Order_newBulk) if you need to place multiple orders at the same time. Bulk orders require fewer risk checks in the trading engine and thus are ratelimited at **1/10** the normal rate.  You can also improve your reactivity to market movements while staying under your ratelimit by using the [Amend](#!/Order/Order_amend) and [Amend Bulk](#!/Order/Order_amendBulk) endpoints. This allows you to stay in the market and avoids the cancel/replace cycle.  #### Tracking Your Orders  If you want to keep track of order IDs yourself, set a unique `clOrdID` per order. This `clOrdID` will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.  You can also change the `clOrdID` by amending an order, supplying an `origClOrdID`, and your desired new ID as the `clOrdID` param, like so:  ``` # Amends an order's leavesQty, and updates its clOrdID to \"def-456\" PUT /api/v1/order {\"origClOrdID\": \"abc-123\", \"clOrdID\": \"def-456\", \"leavesQty\": 1000} ``` 
     * @param {String} symbol Instrument symbol. e.g. 'XBTUSD'.
     * @param {Object} opts Optional parameters
     * @param {String} opts.side Order side. Valid options: Buy, Sell. Defaults to 'Buy' unless `orderQty` is negative.
     * @param {Number} opts.simpleOrderQty Deprecated: simple orders are not supported after 2018/10/26
     * @param {Number} opts.orderQty Order quantity in units of the instrument (i.e. contracts).
     * @param {Number} opts.price Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.
     * @param {Number} opts.displayQty Optional quantity to display in the book. Use 0 for a fully hidden order.
     * @param {Number} opts.stopPx Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of 'MarkPrice' or 'LastPrice' to define the current price used for triggering.
     * @param {String} opts.clOrdID Optional Client Order ID. This clOrdID will come back on the order and any related executions.
     * @param {String} opts.clOrdLinkID Deprecated: linked orders are not supported after 2018/11/10.
     * @param {Number} opts.pegOffsetValue Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders.
     * @param {String} opts.pegPriceType Optional peg price type. Valid options: MarketPeg, PrimaryPeg, TrailingStopPeg.
     * @param {String} opts.ordType Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, Pegged. Defaults to 'Limit' when `price` is specified. Defaults to 'Stop' when `stopPx` is specified. Defaults to 'StopLimit' when `price` and `stopPx` are specified. (default to Limit)
     * @param {String} opts.timeInForce Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to 'GoodTillCancel' for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.
     * @param {String} opts.execInst Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, IndexPrice, LastPrice, Close, ReduceOnly, Fixed, LastWithinMark. 'AllOrNone' instruction requires `displayQty` to be 0. 'MarkPrice', 'IndexPrice' or 'LastPrice' instruction valid for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. 'LastWithinMark' instruction valid for 'Stop' and 'StopLimit' with instruction 'LastPrice'.
     * @param {String} opts.contingencyType Deprecated: linked orders are not supported after 2018/11/10.
     * @param {String} opts.text Optional order annotation. e.g. 'Take profit'.
     * @param {module:api/OrderApi~orderNewCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Order}
     */
    this.orderNew = function(symbol, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'symbol' is set
      if (symbol === undefined || symbol === null) {
        throw new Error("Missing the required parameter 'symbol' when calling orderNew");
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
        'symbol': symbol,
        'side': opts['side'],
        'simpleOrderQty': opts['simpleOrderQty'],
        'orderQty': opts['orderQty'],
        'price': opts['price'],
        'displayQty': opts['displayQty'],
        'stopPx': opts['stopPx'],
        'clOrdID': opts['clOrdID'],
        'clOrdLinkID': opts['clOrdLinkID'],
        'pegOffsetValue': opts['pegOffsetValue'],
        'pegPriceType': opts['pegPriceType'],
        'ordType': opts['ordType'],
        'timeInForce': opts['timeInForce'],
        'execInst': opts['execInst'],
        'contingencyType': opts['contingencyType'],
        'text': opts['text']
      };

      var authNames = ['apiExpires', 'apiKey', 'apiSignature'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'];
      var returnType = Order;

      return this.apiClient.callApi(
        '/order', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
