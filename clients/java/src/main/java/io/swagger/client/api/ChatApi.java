package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.Chat;
import io.swagger.client.model.Error;
import java.math.BigDecimal;
import io.swagger.client.model.ConnectedUsers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-04T18:27:59.355-05:00")
public class ChatApi {
  private ApiClient apiClient;

  public ChatApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ChatApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get chat messages.
   * 
   * @param count Number of results to fetch. (optional, default to 100)
   * @param start Starting point for results. (optional, default to 0)
   * @param reverse If true, will sort results newest first. (optional, default to true)
   * @return List<Chat>
   * @throws ApiException if fails to make API call
   */
  public List<Chat> chatGet(BigDecimal count, BigDecimal start, Boolean reverse) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/chat".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
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

    GenericType<List<Chat>> localVarReturnType = new GenericType<List<Chat>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get connected users.
   * Returns an array with browser users in the first position and API users (bots) in the second position.
   * @return ConnectedUsers
   * @throws ApiException if fails to make API call
   */
  public ConnectedUsers chatGetConnected() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/chat/connected".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ConnectedUsers> localVarReturnType = new GenericType<ConnectedUsers>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Send a chat message.
   * 
   * @param message  (required)
   * @return Chat
   * @throws ApiException if fails to make API call
   */
  public Chat chatNew(String message) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'message' is set
    if (message == null) {
      throw new ApiException(400, "Missing the required parameter 'message' when calling chatNew");
    }
    
    // create path and map variables
    String localVarPath = "/chat".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (message != null)
      localVarFormParams.put("message", message);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Chat> localVarReturnType = new GenericType<Chat>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
