part of api;


class StatsApi {
  String basePath = "https://localhost/api/v1";
  ApiClient apiClient = ApiClient.defaultApiClient;

  StatsApi([ApiClient apiClient]) {
    if (apiClient != null) {
      this.apiClient = apiClient;
    }
  }

  /// Get exchange-wide and per-series turnover and volume statistics.
  ///
  /// 
  Future<List<Stats>> statsGet() {
    Object postBody = null;


    // create path and map variables
    String path = "/stats".replaceAll("{format}","json");

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
        return ApiClient.deserialize(response.body, Stats);
      }
      else {
        return null;
      }
    });
  }
  /// Get historical exchange-wide and per-series turnover and volume statistics.
  ///
  /// 
  Future<List<StatsHistory>> statsHistory() {
    Object postBody = null;


    // create path and map variables
    String path = "/stats/history".replaceAll("{format}","json");

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
        return ApiClient.deserialize(response.body, StatsHistory);
      }
      else {
        return null;
      }
    });
  }
}
