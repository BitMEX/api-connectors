part of api;


class ApiKeyApi {
  String basePath = "https://localhost/api/v1";
  ApiClient apiClient = ApiClient.defaultApiClient;

  ApiKeyApi([ApiClient apiClient]) {
    if (apiClient != null) {
      this.apiClient = apiClient;
    }
  }

  /// Disable an API Key.
  ///
  /// 
  Future<ApiKey> apiKeyDisable(String apiKeyID) {
    Object postBody = null;
    // verify required params are set
    if() {
       throw new ApiException(400, "missing required params");
    }

    // create path and map variables
    String path = "/apiKey/disable".replaceAll("{format}","json");

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
      
      if (apiKeyID != null) {
        hasFields = true;
        mp.fields['apiKeyID'] = apiClient.parameterToString(apiKeyID);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (apiKeyID != null)
        formParams['apiKeyID'] = apiClient.parameterToString(apiKeyID);
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, ApiKey);
      }
      else {
        return null;
      }
    });
  }
  /// Enable an API Key.
  ///
  /// 
  Future<ApiKey> apiKeyEnable(String apiKeyID) {
    Object postBody = null;
    // verify required params are set
    if() {
       throw new ApiException(400, "missing required params");
    }

    // create path and map variables
    String path = "/apiKey/enable".replaceAll("{format}","json");

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
      
      if (apiKeyID != null) {
        hasFields = true;
        mp.fields['apiKeyID'] = apiClient.parameterToString(apiKeyID);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (apiKeyID != null)
        formParams['apiKeyID'] = apiClient.parameterToString(apiKeyID);
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, ApiKey);
      }
      else {
        return null;
      }
    });
  }
  /// Get your API Keys.
  ///
  /// 
  Future<List<ApiKey>> apiKeyGet(bool reverse) {
    Object postBody = null;
    // verify required params are set
    if() {
       throw new ApiException(400, "missing required params");
    }

    // create path and map variables
    String path = "/apiKey".replaceAll("{format}","json");

    // query params
    Map<String, String> queryParams = {};
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
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
        return ApiClient.deserialize(response.body, ApiKey);
      }
      else {
        return null;
      }
    });
  }
  /// Create a new API Key.
  ///
  /// API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.
  Future<ApiKey> apiKeyNew(String name, String cidr, String permissions, bool enabled, String token) {
    Object postBody = null;
    // verify required params are set
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
    }

    // create path and map variables
    String path = "/apiKey".replaceAll("{format}","json");

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
      
      if (name != null) {
        hasFields = true;
        mp.fields['name'] = apiClient.parameterToString(name);
      }
      
      if (cidr != null) {
        hasFields = true;
        mp.fields['cidr'] = apiClient.parameterToString(cidr);
      }
      
      if (permissions != null) {
        hasFields = true;
        mp.fields['permissions'] = apiClient.parameterToString(permissions);
      }
      
      if (enabled != null) {
        hasFields = true;
        mp.fields['enabled'] = apiClient.parameterToString(enabled);
      }
      
      if (token != null) {
        hasFields = true;
        mp.fields['token'] = apiClient.parameterToString(token);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (name != null)
        formParams['name'] = apiClient.parameterToString(name);
if (cidr != null)
        formParams['cidr'] = apiClient.parameterToString(cidr);
if (permissions != null)
        formParams['permissions'] = apiClient.parameterToString(permissions);
if (enabled != null)
        formParams['enabled'] = apiClient.parameterToString(enabled);
if (token != null)
        formParams['token'] = apiClient.parameterToString(token);
    }

    return apiClient.invokeAPI(basePath, path, 'POST', queryParams, postBody, headerParams, formParams, contentType, authNames).then((response) {
      if(response.statusCode >= 400) {
        throw new ApiException(response.statusCode, response.body);
      }
      else if(response.body != null){
        return ApiClient.deserialize(response.body, ApiKey);
      }
      else {
        return null;
      }
    });
  }
  /// Remove an API Key.
  ///
  /// 
  Future<InlineResponse200> apiKeyRemove(String apiKeyID) {
    Object postBody = null;
    // verify required params are set
    if() {
       throw new ApiException(400, "missing required params");
    }

    // create path and map variables
    String path = "/apiKey".replaceAll("{format}","json");

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
      
      if (apiKeyID != null) {
        hasFields = true;
        mp.fields['apiKeyID'] = apiClient.parameterToString(apiKeyID);
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      if (apiKeyID != null)
        formParams['apiKeyID'] = apiClient.parameterToString(apiKeyID);
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
}
