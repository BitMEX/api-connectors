part of api;


class OrderApi {
  String basePath = "https://localhost/api/v1";
  ApiClient apiClient = ApiClient.defaultApiClient;

  OrderApi([ApiClient apiClient]) {
    if (apiClient != null) {
      this.apiClient = apiClient;
    }
  }

  /// Amend the quantity or price of an open order.
  ///
  /// Send an &#x60;orderID&#x60; or &#x60;origClOrdID&#x60; to identify the order you wish to amend.  Both order quantity and price can be amended. Only one &#x60;qty&#x60; field can be used to amend.  Use the &#x60;leavesQty&#x60; field to specify how much of the order you wish to remain open. This can be useful if you want to adjust your position&#39;s delta by a certain amount, regardless of how much of the order has already filled.  Use the &#x60;simpleOrderQty&#x60; and &#x60;simpleLeavesQty&#x60; fields to specify order size in Bitcoin, rather than contracts. These fields will round up to the nearest contract.  Like order placement, amending can be done in bulk. Simply send a request to &#x60;PUT /api/v1/order/bulk&#x60; with a JSON body of the shape: &#x60;{\&quot;orders\&quot;: [{...}, {...}]}&#x60;, each object containing the fields used in this endpoint. 
  Future<Order> orderAmend(String orderID, String origClOrdID, String clOrdID, double simpleOrderQty, Number orderQty, double simpleLeavesQty, Number leavesQty, double price, double stopPx, double pegOffsetValue, String text) {
    Object postBody = null;
    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if() {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }

    // create path and map variables
    String path = "/order".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
        
    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (orderID != null) {
        hasFields = true;
        mp.fields['orderID'] = apiClient.parameterToString(orderID);
      }
      
      if (origClOrdID != null) {
        hasFields = true;
        mp.fields['origClOrdID'] = apiClient.parameterToString(origClOrdID);
      }
      
      if (clOrdID != null) {
        hasFields = true;
        mp.fields['clOrdID'] = apiClient.parameterToString(clOrdID);
      }
      
      if (simpleOrderQty != null) {
        hasFields = true;
        mp.fields['simpleOrderQty'] = apiClient.parameterToString(simpleOrderQty);
      }
      
      if (orderQty != null) {
        hasFields = true;
        mp.fields['orderQty'] = apiClient.parameterToString(orderQty);
      }
      
      if (simpleLeavesQty != null) {
        hasFields = true;
        mp.fields['simpleLeavesQty'] = apiClient.parameterToString(simpleLeavesQty);
      }
      
      if (leavesQty != null) {
        hasFields = true;
        mp.fields['leavesQty'] = apiClient.parameterToString(leavesQty);
      }
      
      if (price != null) {
        hasFields = true;
        mp.fields['price'] = apiClient.parameterToString(price);
      }
      
      if (stopPx != null) {
        hasFields = true;
        mp.fields['stopPx'] = apiClient.parameterToString(stopPx);
      }
      
      if (pegOffsetValue != null) {
        hasFields = true;
        mp.fields['pegOffsetValue'] = apiClient.parameterToString(pegOffsetValue);
      }
      
      if (text != null) {
        hasFields = true;
        mp.fields['text'] = apiClient.parameterToString(text);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (orderID != null)
        formParams['orderID'] = apiClient.parameterToString(orderID);
if (origClOrdID != null)
        formParams['origClOrdID'] = apiClient.parameterToString(origClOrdID);
if (clOrdID != null)
        formParams['clOrdID'] = apiClient.parameterToString(clOrdID);
if (simpleOrderQty != null)
        formParams['simpleOrderQty'] = apiClient.parameterToString(simpleOrderQty);
if (orderQty != null)
        formParams['orderQty'] = apiClient.parameterToString(orderQty);
if (simpleLeavesQty != null)
        formParams['simpleLeavesQty'] = apiClient.parameterToString(simpleLeavesQty);
if (leavesQty != null)
        formParams['leavesQty'] = apiClient.parameterToString(leavesQty);
if (price != null)
        formParams['price'] = apiClient.parameterToString(price);
if (stopPx != null)
        formParams['stopPx'] = apiClient.parameterToString(stopPx);
if (pegOffsetValue != null)
        formParams['pegOffsetValue'] = apiClient.parameterToString(pegOffsetValue);
if (text != null)
        formParams['text'] = apiClient.parameterToString(text);
    }

    return apiClient.invokeAPI(basePath, path, 'PUT', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Order);
      }
      else {
        return null;
      }
    });
  }
  /// Amend multiple orders.
  ///
  /// Similar to POST /amend, but with multiple orders. &#x60;application/json&#x60; only. Ratelimited at 50%.
  Future<List<Order>> orderAmendBulk(String orders) {
    Object postBody = null;
    // verify required params are set
    if() {
       throw new ApiException(400, "missing required params");
    }

    // create path and map variables
    String path = "/order/bulk".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
        
    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (orders != null) {
        hasFields = true;
        mp.fields['orders'] = apiClient.parameterToString(orders);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (orders != null)
        formParams['orders'] = apiClient.parameterToString(orders);
    }

    return apiClient.invokeAPI(basePath, path, 'PUT', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Order);
      }
      else {
        return null;
      }
    });
  }
  /// Cancel order(s). Send multiple order IDs to cancel in bulk.
  ///
  /// Either an orderID or a clOrdID must be provided.
  Future<List<Order>> orderCancel(String orderID, String clOrdID, String text) {
    Object postBody = null;
    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if() {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }

    // create path and map variables
    String path = "/order".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
        
    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (orderID != null) {
        hasFields = true;
        mp.fields['orderID'] = apiClient.parameterToString(orderID);
      }
      
      if (clOrdID != null) {
        hasFields = true;
        mp.fields['clOrdID'] = apiClient.parameterToString(clOrdID);
      }
      
      if (text != null) {
        hasFields = true;
        mp.fields['text'] = apiClient.parameterToString(text);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (orderID != null)
        formParams['orderID'] = apiClient.parameterToString(orderID);
if (clOrdID != null)
        formParams['clOrdID'] = apiClient.parameterToString(clOrdID);
if (text != null)
        formParams['text'] = apiClient.parameterToString(text);
    }

    return apiClient.invokeAPI(basePath, path, 'DELETE', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Order);
      }
      else {
        return null;
      }
    });
  }
  /// Cancels all of your orders.
  ///
  /// 
  Future<Object> orderCancelAll(String symbol, String filter, String text) {
    Object postBody = null;
    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if() {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }

    // create path and map variables
    String path = "/order/all".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
        
    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (symbol != null) {
        hasFields = true;
        mp.fields['symbol'] = apiClient.parameterToString(symbol);
      }
      
      if (filter != null) {
        hasFields = true;
        mp.fields['filter'] = apiClient.parameterToString(filter);
      }
      
      if (text != null) {
        hasFields = true;
        mp.fields['text'] = apiClient.parameterToString(text);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (symbol != null)
        formParams['symbol'] = apiClient.parameterToString(symbol);
if (filter != null)
        formParams['filter'] = apiClient.parameterToString(filter);
if (text != null)
        formParams['text'] = apiClient.parameterToString(text);
    }

    return apiClient.invokeAPI(basePath, path, 'DELETE', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Object);
      }
      else {
        return null;
      }
    });
  }
  /// Automatically cancel all your orders after a specified timeout.
  ///
  /// Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.  Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.  This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-). 
  Future<Object> orderCancelAllAfter(double timeout) {
    Object postBody = null;
    // verify required params are set
    if() {
       throw new ApiException(400, "missing required params");
    }

    // create path and map variables
    String path = "/order/cancelAllAfter".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
        
    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (timeout != null) {
        hasFields = true;
        mp.fields['timeout'] = apiClient.parameterToString(timeout);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (timeout != null)
        formParams['timeout'] = apiClient.parameterToString(timeout);
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Object);
      }
      else {
        return null;
      }
    });
  }
  /// Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]
  ///
  /// If no &#x60;price&#x60; is specified, a market order will be submitted to close the whole of your position. This will also close all other open orders in this symbol.
  Future<Order> orderClosePosition(String symbol, double price) {
    Object postBody = null;
    // verify required params are set
    if(    // verify required params are set
    if() {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }

    // create path and map variables
    String path = "/order/closePosition".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
        
    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (symbol != null) {
        hasFields = true;
        mp.fields['symbol'] = apiClient.parameterToString(symbol);
      }
      
      if (price != null) {
        hasFields = true;
        mp.fields['price'] = apiClient.parameterToString(price);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (symbol != null)
        formParams['symbol'] = apiClient.parameterToString(symbol);
if (price != null)
        formParams['price'] = apiClient.parameterToString(price);
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Order);
      }
      else {
        return null;
      }
    });
  }
  /// Get your orders.
  ///
  /// To get open orders only, send {\&quot;open\&quot;: true} in the filter param.  See &lt;a href&#x3D;\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
  Future<List<Order>> orderGetOrders(String symbol, String filter, String columns, Number count, Number start, bool reverse, DateTime startTime, DateTime endTime) {
    Object postBody = null;
    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if() {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }

    // create path and map variables
    String path = "/order".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if("null" != symbol)
      queryParams["symbol"] = symbol is List ? symbol.join(',') : symbol;
if("null" != filter)
      queryParams["filter"] = filter is List ? filter.join(',') : filter;
if("null" != columns)
      queryParams["columns"] = columns is List ? columns.join(',') : columns;
if("null" != count)
      queryParams["count"] = count is List ? count.join(',') : count;
if("null" != start)
      queryParams["start"] = start is List ? start.join(',') : start;
if("null" != reverse)
      queryParams["reverse"] = reverse is List ? reverse.join(',') : reverse;
if("null" != startTime)
      queryParams["startTime"] = startTime is List ? startTime.join(',') : startTime;
if("null" != endTime)
      queryParams["endTime"] = endTime is List ? endTime.join(',') : endTime;
    
    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    return apiClient.invokeAPI(basePath, path, 'GET', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Order);
      }
      else {
        return null;
      }
    });
  }
  /// Create a new order.
  ///
  /// This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  If no order type is provided, BitMEX will assume &#39;Limit&#39;. Be very careful with &#39;Market&#39; and &#39;Stop&#39; orders as you may be filled at an unfavourable price.  You can submit bulk orders by POSTing an array of orders to &#x60;/api/v1/order/bulk&#x60;. Send a JSON payload with the shape: &#x60;{\&quot;orders\&quot;: [{...}, {...}]}&#x60;, with each inner object containing the same fields that would be sent to this endpoint.  A note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This clOrdID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.  To generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix &#x60;&#39;bmex_mm_&#39;&#x60; and the UUID &#x60;&#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39;&#x60; creates &#x60;&#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;&#x60;.  See the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152) for an example of how to use and generate clOrdIDs. 
  Future<Order> orderNew(String symbol, String side, double simpleOrderQty, Number quantity, Number orderQty, double price, Number displayQty, double stopPrice, double stopPx, String clOrdID, String clOrdLinkID, double pegOffsetValue, String pegPriceType, String type, String ordType, String timeInForce, String execInst, String contingencyType, String text) {
    Object postBody = null;
    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if(    // verify required params are set
    if() {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }) {
       throw new ApiException(400, "missing required params");
    }

    // create path and map variables
    String path = "/order".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
        
    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (symbol != null) {
        hasFields = true;
        mp.fields['symbol'] = apiClient.parameterToString(symbol);
      }
      
      if (side != null) {
        hasFields = true;
        mp.fields['side'] = apiClient.parameterToString(side);
      }
      
      if (simpleOrderQty != null) {
        hasFields = true;
        mp.fields['simpleOrderQty'] = apiClient.parameterToString(simpleOrderQty);
      }
      
      if (quantity != null) {
        hasFields = true;
        mp.fields['quantity'] = apiClient.parameterToString(quantity);
      }
      
      if (orderQty != null) {
        hasFields = true;
        mp.fields['orderQty'] = apiClient.parameterToString(orderQty);
      }
      
      if (price != null) {
        hasFields = true;
        mp.fields['price'] = apiClient.parameterToString(price);
      }
      
      if (displayQty != null) {
        hasFields = true;
        mp.fields['displayQty'] = apiClient.parameterToString(displayQty);
      }
      
      if (stopPrice != null) {
        hasFields = true;
        mp.fields['stopPrice'] = apiClient.parameterToString(stopPrice);
      }
      
      if (stopPx != null) {
        hasFields = true;
        mp.fields['stopPx'] = apiClient.parameterToString(stopPx);
      }
      
      if (clOrdID != null) {
        hasFields = true;
        mp.fields['clOrdID'] = apiClient.parameterToString(clOrdID);
      }
      
      if (clOrdLinkID != null) {
        hasFields = true;
        mp.fields['clOrdLinkID'] = apiClient.parameterToString(clOrdLinkID);
      }
      
      if (pegOffsetValue != null) {
        hasFields = true;
        mp.fields['pegOffsetValue'] = apiClient.parameterToString(pegOffsetValue);
      }
      
      if (pegPriceType != null) {
        hasFields = true;
        mp.fields['pegPriceType'] = apiClient.parameterToString(pegPriceType);
      }
      
      if (type != null) {
        hasFields = true;
        mp.fields['type'] = apiClient.parameterToString(type);
      }
      
      if (ordType != null) {
        hasFields = true;
        mp.fields['ordType'] = apiClient.parameterToString(ordType);
      }
      
      if (timeInForce != null) {
        hasFields = true;
        mp.fields['timeInForce'] = apiClient.parameterToString(timeInForce);
      }
      
      if (execInst != null) {
        hasFields = true;
        mp.fields['execInst'] = apiClient.parameterToString(execInst);
      }
      
      if (contingencyType != null) {
        hasFields = true;
        mp.fields['contingencyType'] = apiClient.parameterToString(contingencyType);
      }
      
      if (text != null) {
        hasFields = true;
        mp.fields['text'] = apiClient.parameterToString(text);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (symbol != null)
        formParams['symbol'] = apiClient.parameterToString(symbol);
if (side != null)
        formParams['side'] = apiClient.parameterToString(side);
if (simpleOrderQty != null)
        formParams['simpleOrderQty'] = apiClient.parameterToString(simpleOrderQty);
if (quantity != null)
        formParams['quantity'] = apiClient.parameterToString(quantity);
if (orderQty != null)
        formParams['orderQty'] = apiClient.parameterToString(orderQty);
if (price != null)
        formParams['price'] = apiClient.parameterToString(price);
if (displayQty != null)
        formParams['displayQty'] = apiClient.parameterToString(displayQty);
if (stopPrice != null)
        formParams['stopPrice'] = apiClient.parameterToString(stopPrice);
if (stopPx != null)
        formParams['stopPx'] = apiClient.parameterToString(stopPx);
if (clOrdID != null)
        formParams['clOrdID'] = apiClient.parameterToString(clOrdID);
if (clOrdLinkID != null)
        formParams['clOrdLinkID'] = apiClient.parameterToString(clOrdLinkID);
if (pegOffsetValue != null)
        formParams['pegOffsetValue'] = apiClient.parameterToString(pegOffsetValue);
if (pegPriceType != null)
        formParams['pegPriceType'] = apiClient.parameterToString(pegPriceType);
if (type != null)
        formParams['type'] = apiClient.parameterToString(type);
if (ordType != null)
        formParams['ordType'] = apiClient.parameterToString(ordType);
if (timeInForce != null)
        formParams['timeInForce'] = apiClient.parameterToString(timeInForce);
if (execInst != null)
        formParams['execInst'] = apiClient.parameterToString(execInst);
if (contingencyType != null)
        formParams['contingencyType'] = apiClient.parameterToString(contingencyType);
if (text != null)
        formParams['text'] = apiClient.parameterToString(text);
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Order);
      }
      else {
        return null;
      }
    });
  }
  /// Create multiple new orders.
  ///
  /// This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  Each individual order object in the array should have the same properties as an individual POST /order call.  This endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX systems, this endpoint is ratelimited at &#x60;ceil(0.5 * orders)&#x60;. Submitting 10 orders via a bulk order call will only count as 5 requests.  For now, only &#x60;application/json&#x60; is supported on this endpoint. 
  Future<List<Order>> orderNewBulk(String orders) {
    Object postBody = null;
    // verify required params are set
    if() {
       throw new ApiException(400, "missing required params");
    }

    // create path and map variables
    String path = "/order/bulk".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
        
    List<String> contentTypes = ["application/json","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      
      if (orders != null) {
        hasFields = true;
        mp.fields['orders'] = apiClient.parameterToString(orders);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (orders != null)
        formParams['orders'] = apiClient.parameterToString(orders);
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Order);
      }
      else {
        return null;
      }
    });
  }
}
