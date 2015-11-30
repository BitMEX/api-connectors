package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Execution;
import io.swagger.client.model.Error;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class ExecutionApi {
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
   * Get all raw executions for your account.
   * This returns all raw transactions, which includes order opening and cancelation, and order status changes. It can be quite noisy. More focused information is available at /execution/tradeHistory. You may also use the `filter` param to target your query. Specify an array as a filter value, such as {\&quot;execType\&quot;: [\&quot;Settlement\&quot;, \&quot;Trade\&quot;]} to filter on multiple values.
   * @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.
   * @param filter Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.
   * @param columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
   * @param count Number of results to fetch.
   * @param start Starting point for results.
   * @param reverse If true, will sort results newest first.
   * @param startTime Starting date filter for results.
   * @param endTime Ending date filter for results.
   * @return List<Execution>
   */
  public List<Execution>  executionGet (String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, Date startTime, Date endTime) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/execution".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "filter", filter));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "columns", columns));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "count", count));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "start", start));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "reverse", reverse));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "startTime", startTime));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endTime", endTime));
    

    

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
        return (List<Execution>) ApiInvoker.deserialize(response, "array", Execution.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get all balance-affecting executions. This includes each trade, insurance charge, and settlement.
   * 
   * @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.
   * @param filter Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.
   * @param columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
   * @param count Number of results to fetch.
   * @param start Starting point for results.
   * @param reverse If true, will sort results newest first.
   * @param startTime Starting date filter for results.
   * @param endTime Ending date filter for results.
   * @return List<Execution>
   */
  public List<Execution>  executionGetTradeHistory (String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, Date startTime, Date endTime) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/execution/tradeHistory".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "symbol", symbol));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "filter", filter));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "columns", columns));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "count", count));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "start", start));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "reverse", reverse));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "startTime", startTime));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endTime", endTime));
    

    

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
        return (List<Execution>) ApiInvoker.deserialize(response, "array", Execution.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
