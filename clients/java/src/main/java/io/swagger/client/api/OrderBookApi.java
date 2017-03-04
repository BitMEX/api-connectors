package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.OrderBook;
import io.swagger.client.model.Error;
import java.math.BigDecimal;
import io.swagger.client.model.OrderBookL2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-04T11:15:54.597-06:00")
public class OrderBookApi {
  private ApiClient apiClient;

  public OrderBookApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrderBookApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get current orderbook [deprecated, use /orderBook/L2].
   * 
   * @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. (required)
   * @param depth Orderbook depth. (optional, default to 25)
   * @return List<OrderBook>
   * @throws ApiException if fails to make API call
   */
  public List<OrderBook> orderBookGet(String symbol, BigDecimal depth) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling orderBookGet");
    }
    
    // create path and map variables
    String localVarPath = "/orderBook".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "depth", depth));

    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OrderBook>> localVarReturnType = new GenericType<List<OrderBook>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get current orderbook in vertical format.
   * 
   * @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. (required)
   * @param depth Orderbook depth per side. Send 0 for full depth. (optional, default to 25)
   * @return List<OrderBookL2>
   * @throws ApiException if fails to make API call
   */
  public List<OrderBookL2> orderBookGetL2(String symbol, BigDecimal depth) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling orderBookGetL2");
    }
    
    // create path and map variables
    String localVarPath = "/orderBook/L2".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "depth", depth));

    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OrderBookL2>> localVarReturnType = new GenericType<List<OrderBookL2>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
