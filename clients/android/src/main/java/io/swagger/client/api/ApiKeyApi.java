package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.ApiKey;
import io.swagger.client.model.Error;
import io.swagger.client.model.InlineResponse200;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class ApiKeyApi {
  String basePath = "https://localhost/api/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * Get your API Keys.
   * 
   * @param reverse If true, will sort results newest first.
   * @return List<ApiKey>
   */
  public List<ApiKey>  apiKeyGet (Boolean reverse) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/apiKey".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "reverse", reverse));
    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<ApiKey>) ApiInvoker.deserialize(response, "array", ApiKey.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create a new API Key.
   * API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.
   * @param name Key name. This name is for reference only.
   * @param cidr CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href=\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt;
   * @param permissions Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;withdraw\&quot;].
   * @param enabled Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.
   * @param token OTP Token (YubiKey, Google Authenticator)
   * @return ApiKey
   */
  public ApiKey  apiKeyNew (String name, String cidr, String permissions, Boolean enabled, String token) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/apiKey".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (name != null) {
        builder.addTextBody("name", ApiInvoker.parameterToString(name), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (cidr != null) {
        builder.addTextBody("cidr", ApiInvoker.parameterToString(cidr), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (permissions != null) {
        builder.addTextBody("permissions", ApiInvoker.parameterToString(permissions), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (enabled != null) {
        builder.addTextBody("enabled", ApiInvoker.parameterToString(enabled), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (token != null) {
        builder.addTextBody("token", ApiInvoker.parameterToString(token), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("name", ApiInvoker.parameterToString(name));
      formParams.put("cidr", ApiInvoker.parameterToString(cidr));
      formParams.put("permissions", ApiInvoker.parameterToString(permissions));
      formParams.put("enabled", ApiInvoker.parameterToString(enabled));
      formParams.put("token", ApiInvoker.parameterToString(token));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ApiKey) ApiInvoker.deserialize(response, "", ApiKey.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Remove an API Key.
   * 
   * @param apiKeyID API Key ID (public component).
   * @return InlineResponse200
   */
  public InlineResponse200  apiKeyRemove (String apiKeyID) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'apiKeyID' is set
    if (apiKeyID == null) {
       throw new ApiException(400, "Missing the required parameter 'apiKeyID' when calling apiKeyRemove");
    }
    

    // create path and map variables
    String path = "/apiKey".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (apiKeyID != null) {
        builder.addTextBody("apiKeyID", ApiInvoker.parameterToString(apiKeyID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("apiKeyID", ApiInvoker.parameterToString(apiKeyID));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (InlineResponse200) ApiInvoker.deserialize(response, "", InlineResponse200.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Disable an API Key.
   * 
   * @param apiKeyID API Key ID (public component).
   * @return ApiKey
   */
  public ApiKey  apiKeyDisable (String apiKeyID) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'apiKeyID' is set
    if (apiKeyID == null) {
       throw new ApiException(400, "Missing the required parameter 'apiKeyID' when calling apiKeyDisable");
    }
    

    // create path and map variables
    String path = "/apiKey/disable".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (apiKeyID != null) {
        builder.addTextBody("apiKeyID", ApiInvoker.parameterToString(apiKeyID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("apiKeyID", ApiInvoker.parameterToString(apiKeyID));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ApiKey) ApiInvoker.deserialize(response, "", ApiKey.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Enable an API Key.
   * 
   * @param apiKeyID API Key ID (public component).
   * @return ApiKey
   */
  public ApiKey  apiKeyEnable (String apiKeyID) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'apiKeyID' is set
    if (apiKeyID == null) {
       throw new ApiException(400, "Missing the required parameter 'apiKeyID' when calling apiKeyEnable");
    }
    

    // create path and map variables
    String path = "/apiKey/enable".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (apiKeyID != null) {
        builder.addTextBody("apiKeyID", ApiInvoker.parameterToString(apiKeyID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("apiKeyID", ApiInvoker.parameterToString(apiKeyID));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ApiKey) ApiInvoker.deserialize(response, "", ApiKey.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
