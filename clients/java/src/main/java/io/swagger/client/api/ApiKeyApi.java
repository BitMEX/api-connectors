package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.ApiKey;
import io.swagger.client.model.Error;
import io.swagger.client.model.InlineResponse200;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-05T09:40:48.217-05:00")
public class ApiKeyApi {
  private ApiClient apiClient;

  public ApiKeyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ApiKeyApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Disable an API Key.
   * 
   * @param apiKeyID API Key ID (public component). (required)
   * @return ApiKey
   * @throws ApiException if fails to make API call
   */
  public ApiKey apiKeyDisable(String apiKeyID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKeyID' is set
    if (apiKeyID == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKeyID' when calling apiKeyDisable");
    }
    
    // create path and map variables
    String localVarPath = "/apiKey/disable".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (apiKeyID != null)
      localVarFormParams.put("apiKeyID", apiKeyID);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiKey> localVarReturnType = new GenericType<ApiKey>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Enable an API Key.
   * 
   * @param apiKeyID API Key ID (public component). (required)
   * @return ApiKey
   * @throws ApiException if fails to make API call
   */
  public ApiKey apiKeyEnable(String apiKeyID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKeyID' is set
    if (apiKeyID == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKeyID' when calling apiKeyEnable");
    }
    
    // create path and map variables
    String localVarPath = "/apiKey/enable".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (apiKeyID != null)
      localVarFormParams.put("apiKeyID", apiKeyID);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiKey> localVarReturnType = new GenericType<ApiKey>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get your API Keys.
   * 
   * @param reverse If true, will sort results newest first. (optional, default to false)
   * @return List<ApiKey>
   * @throws ApiException if fails to make API call
   */
  public List<ApiKey> apiKeyGet(Boolean reverse) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/apiKey".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));

    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ApiKey>> localVarReturnType = new GenericType<List<ApiKey>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a new API Key.
   * API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.
   * @param name Key name. This name is for reference only. (optional)
   * @param cidr CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href&#x3D;\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt; (optional)
   * @param permissions Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;withdraw\&quot;]. (optional)
   * @param enabled Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable. (optional, default to false)
   * @param token OTP Token (YubiKey, Google Authenticator) (optional)
   * @return ApiKey
   * @throws ApiException if fails to make API call
   */
  public ApiKey apiKeyNew(String name, String cidr, String permissions, Boolean enabled, String token) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/apiKey".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (name != null)
      localVarFormParams.put("name", name);
if (cidr != null)
      localVarFormParams.put("cidr", cidr);
if (permissions != null)
      localVarFormParams.put("permissions", permissions);
if (enabled != null)
      localVarFormParams.put("enabled", enabled);
if (token != null)
      localVarFormParams.put("token", token);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiKey> localVarReturnType = new GenericType<ApiKey>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Remove an API Key.
   * 
   * @param apiKeyID API Key ID (public component). (required)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public InlineResponse200 apiKeyRemove(String apiKeyID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKeyID' is set
    if (apiKeyID == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKeyID' when calling apiKeyRemove");
    }
    
    // create path and map variables
    String localVarPath = "/apiKey".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (apiKeyID != null)
      localVarFormParams.put("apiKeyID", apiKeyID);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
