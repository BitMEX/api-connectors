part of api;


class ChatApi {
  String basePath = "https://localhost/api/v1";
  ApiClient apiClient = ApiClient.defaultApiClient;

  ChatApi([ApiClient apiClient]) {
    if (apiClient != null) {
      this.apiClient = apiClient;
    }
  }

  
  /// Get chat messages.
  ///
  /// 
  Future<List<Chat>> chatGet(Number count, Number start, bool reverse) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/chat".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if("null" != count)
      queryParams["count"] = count is List ? count.join(',') : count;
    if("null" != start)
      queryParams["start"] = start is List ? start.join(',') : start;
    if("null" != reverse)
      queryParams["reverse"] = reverse is List ? reverse.join(',') : reverse;
    
    

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
        return ApiClient.deserialize(response.body, Chat);
      }
      else {
        return null;
      }
    });
  }
  
  /// Send a chat message.
  ///
  /// 
  Future<Chat> chatSend(String message) {
    Object postBody = null;
    

    // create path and map variables
    String path = "/chat".replaceAll("{format}","json");

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
      
      if (message != null) {
        hasFields = true;
        mp.fields['message'] = apiClient.parameterToString(message);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (message != null)
        formParams['message'] = apiClient.parameterToString(message);
      
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, Chat);
      }
      else {
        return null;
      }
    });
  }
  
  /// Get connected users.
  ///
  /// Returns an array with browser users in the first position and API users (bots) in the second position.
  Future<ConnectedUsers> chatGetConnected() {
    Object postBody = null;
    

    // create path and map variables
    String path = "/chat/connected".replaceAll("{format}","json");

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
        return ApiClient.deserialize(response.body, ConnectedUsers);
      }
      else {
        return null;
      }
    });
  }
  
}
