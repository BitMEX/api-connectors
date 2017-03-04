package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.model.*;
import io.swagger.client.Pair;

import io.swagger.client.model.Position;
import io.swagger.client.model.Error;
import java.math.BigDecimal;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-04T11:15:54.597-06:00")
public class PositionApi {
  private ApiClient apiClient;

  public PositionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PositionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get your positions.
   * See &lt;a href&#x3D;\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
   * @param filter Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}. (optional)
   * @param columns Which columns to fetch. For example, send [\&quot;columnName\&quot;]. (optional)
   * @param count Number of rows to fetch. (optional)
   * @return List<Position>
   * @throws ApiException if fails to make API call
   */
  public List<Position> positionGet(String filter, String columns, BigDecimal count) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/position".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "columns", columns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));

    
    
    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Position>> localVarReturnType = new GenericType<List<Position>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Enable isolated margin or cross margin per-position.
   * On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.
   * @param symbol Position symbol to isolate. (required)
   * @param enabled True for isolated margin, false for cross margin. (optional, default to true)
   * @return Position
   * @throws ApiException if fails to make API call
   */
  public Position positionIsolateMargin(String symbol, Boolean enabled) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling positionIsolateMargin");
    }
    
    // create path and map variables
    String localVarPath = "/position/isolate".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (symbol != null)
      localVarFormParams.put("symbol", symbol);
if (enabled != null)
      localVarFormParams.put("enabled", enabled);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Position> localVarReturnType = new GenericType<Position>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Transfer equity in or out of a position.
   * When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
   * @param symbol Symbol of position to isolate. (required)
   * @param amount Amount to transfer, in Satoshis. May be negative. (required)
   * @return Position
   * @throws ApiException if fails to make API call
   */
  public Position positionTransferIsolatedMargin(String symbol, BigDecimal amount) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling positionTransferIsolatedMargin");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling positionTransferIsolatedMargin");
    }
    
    // create path and map variables
    String localVarPath = "/position/transferMargin".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (symbol != null)
      localVarFormParams.put("symbol", symbol);
if (amount != null)
      localVarFormParams.put("amount", amount);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Position> localVarReturnType = new GenericType<Position>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Choose leverage for a position.
   * On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.
   * @param symbol Symbol of position to adjust. (required)
   * @param leverage Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin. (required)
   * @return Position
   * @throws ApiException if fails to make API call
   */
  public Position positionUpdateLeverage(String symbol, Double leverage) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling positionUpdateLeverage");
    }
    
    // verify the required parameter 'leverage' is set
    if (leverage == null) {
      throw new ApiException(400, "Missing the required parameter 'leverage' when calling positionUpdateLeverage");
    }
    
    // create path and map variables
    String localVarPath = "/position/leverage".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (symbol != null)
      localVarFormParams.put("symbol", symbol);
if (leverage != null)
      localVarFormParams.put("leverage", leverage);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Position> localVarReturnType = new GenericType<Position>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update your risk limit.
   * Risk Limits limit the size of positions you can trade at various margin levels. Larger positions require more margin. Please see the Risk Limit documentation for more details.
   * @param symbol Symbol of position to isolate. (required)
   * @param riskLimit New Risk Limit, in Satoshis. (required)
   * @return Position
   * @throws ApiException if fails to make API call
   */
  public Position positionUpdateRiskLimit(String symbol, BigDecimal riskLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling positionUpdateRiskLimit");
    }
    
    // verify the required parameter 'riskLimit' is set
    if (riskLimit == null) {
      throw new ApiException(400, "Missing the required parameter 'riskLimit' when calling positionUpdateRiskLimit");
    }
    
    // create path and map variables
    String localVarPath = "/position/riskLimit".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (symbol != null)
      localVarFormParams.put("symbol", symbol);
if (riskLimit != null)
      localVarFormParams.put("riskLimit", riskLimit);

    final String[] localVarAccepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Position> localVarReturnType = new GenericType<Position>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
