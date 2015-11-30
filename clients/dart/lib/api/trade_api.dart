part of api;


class TradeApi {
  String basePath = "https://localhost/api/v1";
  ApiClient apiClient = ApiClient.defaultApiClient;

  TradeApi([ApiClient apiClient]) {
    if (apiClient != null) {
      this.apiClient = apiClient;
    }
  }

  
  /// Get Trades.
  ///
  /// 
  Future<List<Trade>> tradeGet(String symbol, String filter, String columns, Number count, Number start, bool reverse, DateTime startTime, DateTime endTime) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/trade".replaceAll("{format}","json");

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
        return ApiClient.deserialize(response.body, Trade);
      }
      else {
        return null;
      }
    });
  }
  
  /// Get previous trades in time buckets.
  ///
  /// 
  Future<List<TradeBin>> tradeGetBucketed(String binSize, String symbol, String filter, String columns, Number count, Number start, bool reverse, DateTime startTime, DateTime endTime) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/trade/bucketed".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if("null" != binSize)
      queryParams["binSize"] = binSize is List ? binSize.join(',') : binSize;
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
        return ApiClient.deserialize(response.body, TradeBin);
      }
      else {
        return null;
      }
    });
  }
  
  /// Get trades between two dates. [Deprecated, use GET /trades]
  ///
  /// 
  Future<List<Trade>> tradeGetByDate(DateTime startTime, String symbol, DateTime endTime) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/trade/byDate".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if("null" != symbol)
      queryParams["symbol"] = symbol is List ? symbol.join(',') : symbol;
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
        return ApiClient.deserialize(response.body, Trade);
      }
      else {
        return null;
      }
    });
  }
  
  /// Get recent trades. [Deprecated, use GET /trades]
  ///
  /// 
  Future<List<Trade>> tradeGetRecent(Number count, String symbol) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/trade/recent".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if("null" != symbol)
      queryParams["symbol"] = symbol is List ? symbol.join(',') : symbol;
    if("null" != count)
      queryParams["count"] = count is List ? count.join(',') : count;
    
    

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
        return ApiClient.deserialize(response.body, Trade);
      }
      else {
        return null;
      }
    });
  }
  
}
