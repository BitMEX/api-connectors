part of api;


class OrderApi {
  String basePath = "https://localhost/api/v1";
  ApiClient apiClient = ApiClient.defaultApiClient;

  OrderApi([ApiClient apiClient]) {
    if (apiClient != null) {
      this.apiClient = apiClient;
    }
  }

  
  /// Get your orders.
  ///
  /// To get open orders only, send {\&quot;open\&quot;: true} in the filter param.
  Future<List<Order>> orderGetOrders(String symbol, String filter, String columns, Number count, Number start, bool reverse, DateTime startTime, DateTime endTime) {
    Object postBody = null;
    

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
  /// This endpoint is used for placing orders. Valid order types are &#39;Limit&#39; and &#39;StopLimit&#39;. If none is provided, BitMEX will assume a Limit Order.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix &#39;bmex_mm_&#39; and the UUID &#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39; creates &#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;.\n\nSee the BitMEX &lt;a href=&#39;https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152&#39;&gt;Reference Market Maker&lt;/a&gt; for an example of how to use and generate clOrdIDs.
  Future<Order> orderNewOrder(String symbol, Number quantity, num price, String timeInForce, String type, num stopPrice, String clOrdID) {
    Object postBody = null;
    

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
      
      if (quantity != null) {
        hasFields = true;
        mp.fields['quantity'] = apiClient.parameterToString(quantity);
      }
      
      if (price != null) {
        hasFields = true;
        mp.fields['price'] = apiClient.parameterToString(price);
      }
      
      if (timeInForce != null) {
        hasFields = true;
        mp.fields['timeInForce'] = apiClient.parameterToString(timeInForce);
      }
      
      if (type != null) {
        hasFields = true;
        mp.fields['type'] = apiClient.parameterToString(type);
      }
      
      if (stopPrice != null) {
        hasFields = true;
        mp.fields['stopPrice'] = apiClient.parameterToString(stopPrice);
      }
      
      if (clOrdID != null) {
        hasFields = true;
        mp.fields['clOrdID'] = apiClient.parameterToString(clOrdID);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (symbol != null)
        formParams['symbol'] = apiClient.parameterToString(symbol);
      if (quantity != null)
        formParams['quantity'] = apiClient.parameterToString(quantity);
      if (price != null)
        formParams['price'] = apiClient.parameterToString(price);
      if (timeInForce != null)
        formParams['timeInForce'] = apiClient.parameterToString(timeInForce);
      if (type != null)
        formParams['type'] = apiClient.parameterToString(type);
      if (stopPrice != null)
        formParams['stopPrice'] = apiClient.parameterToString(stopPrice);
      if (clOrdID != null)
        formParams['clOrdID'] = apiClient.parameterToString(clOrdID);
      
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
  
  /// Cancel order(s). Send multiple order IDs to cancel in bulk.
  ///
  /// Either an orderID or a clOrdID must be provided.
  Future<List<Order>> orderCancelOrder(String orderID, String clOrdID, String text) {
    Object postBody = null;
    

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
  Future<InlineResponse200> orderCancelAll(String symbol, String filter, String text) {
    Object postBody = null;
    

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
        return ApiClient.deserialize(response.body, InlineResponse200);
      }
      else {
        return null;
      }
    });
  }
  
  /// Automatically cancel all your orders after a specified timeout.
  ///
  /// Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. &lt;br&gt;&lt;br&gt;Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.&lt;br&gt;&lt;br&gt;This is also available via &lt;a href=\&quot;https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-\&quot;&gt;WebSocket&lt;/a&gt;.
  Future<InlineResponse200> orderCancelAllAfter(num timeout) {
    Object postBody = null;
    

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
        return ApiClient.deserialize(response.body, InlineResponse200);
      }
      else {
        return null;
      }
    });
  }
  
  /// Close a position with a market order.
  ///
  /// If no price is specified, a market order will be submitted to close the entirety of your position. Be careful with market orders as you may not be filled at a favorable price.
  Future<Order> orderClosePosition(String symbol, num price) {
    Object postBody = null;
    

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
  
  /// Get open liquidation orders.
  ///
  /// 
  Future<List<LiquidationOrder>> orderGetCloseOutOrders(String filter) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/order/liquidations".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if("null" != filter)
      queryParams["filter"] = filter is List ? filter.join(',') : filter;
    
    

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
        return ApiClient.deserialize(response.body, LiquidationOrder);
      }
      else {
        return null;
      }
    });
  }
  
}
