package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.Position;
import io.swagger.client.model.Error;
import java.math.BigDecimal;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-30T13:35:44.556-06:00")
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
   * 
   * @param filter Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.
   * @param columns Which columns to fetch. For example, send [\&quot;columnName\&quot;].
   * @param count Number of rows to fetch.
   * @return List<Position>
   */
  public List<Position> positionFind (String filter, String columns, BigDecimal count) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/position".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    
    queryParams.addAll(apiClient.parameterToPairs("", "columns", columns));
    
    queryParams.addAll(apiClient.parameterToPairs("", "count", count));
    

    

    

    final String[] accepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<Position>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Toggle isolated (fixed) margin per-position.
   * On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off. A position must be open to isolate it.
   * @param symbol Position symbol to isolate.
   * @param enabled If true, will enable isolated margin.
   * @return Position
   */
  public Position positionIsolateMargin (String symbol, Boolean enabled) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'symbol' is set
     if (symbol == null) {
        throw new ApiException(400, "Missing the required parameter 'symbol' when calling positionIsolateMargin");
     }
     
    // create path and map variables
    String path = "/position/isolate".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    if (symbol != null)
      formParams.put("symbol", symbol);
    if (enabled != null)
      formParams.put("enabled", enabled);
    

    final String[] accepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Position>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Transfer equity in or out of a position.
   * When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
   * @param symbol Position symbol to isolate.
   * @param amount Amount to transfer, in satoshis. May be negative.
   * @return Position
   */
  public Position positionTransferIsolatedMargin (String symbol, BigDecimal amount) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'symbol' is set
     if (symbol == null) {
        throw new ApiException(400, "Missing the required parameter 'symbol' when calling positionTransferIsolatedMargin");
     }
     
     // verify the required parameter 'amount' is set
     if (amount == null) {
        throw new ApiException(400, "Missing the required parameter 'amount' when calling positionTransferIsolatedMargin");
     }
     
    // create path and map variables
    String path = "/position/transferMargin".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    if (symbol != null)
      formParams.put("symbol", symbol);
    if (amount != null)
      formParams.put("amount", amount);
    

    final String[] accepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Position>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
