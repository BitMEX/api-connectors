part of api;


class ExecutionApi {
  String basePath = "https://localhost/api/v1";
  ApiClient apiClient = ApiClient.defaultApiClient;

  ExecutionApi([ApiClient apiClient]) {
    if (apiClient != null) {
      this.apiClient = apiClient;
    }
  }

  /// Get all raw executions for your account.
  ///
  /// This returns all raw transactions, which includes order opening and cancelation, and order status changes. It can be quite noisy. More focused information is available at &#x60;/execution/tradeHistory&#x60;.  You may also use the &#x60;filter&#x60; param to target your query. Specify an array as a filter value, such as &#x60;{\&quot;execType\&quot;: [\&quot;Settlement\&quot;, \&quot;Trade\&quot;]}&#x60; to filter on multiple values.  See [the FIX Spec](http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_8_8.html) for explanations of these fields. 
  Future<List<Execution>> executionGet(String symbol, String filter, String columns, Number count, Number start, bool reverse, DateTime startTime, DateTime endTime) {
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
    String path = "/execution".replaceAll("{format}","json");

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
        return ApiClient.deserialize(response.body, Execution);
      }
      else {
        return null;
      }
    });
  }
  /// Get all balance-affecting executions. This includes each trade, insurance charge, and settlement.
  ///
  /// 
  Future<List<Execution>> executionGetTradeHistory(String symbol, String filter, String columns, Number count, Number start, bool reverse, DateTime startTime, DateTime endTime) {
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
    String path = "/execution/tradeHistory".replaceAll("{format}","json");

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
        return ApiClient.deserialize(response.body, Execution);
      }
      else {
        return null;
      }
    });
  }
}
