package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Order;
import io.swagger.client.model.Error;
import java.math.BigDecimal;
import java.util.Date;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.LiquidationOrder;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class OrderApi {
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
   * Get your orders.
   * To get open orders only, send {\&quot;open\&quot;: true} in the filter param.
   * @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.
   * @param filter Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.
   * @param columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
   * @param count Number of results to fetch.
   * @param start Starting point for results.
   * @param reverse If true, will sort results newest first.
   * @param startTime Starting date filter for results.
   * @param endTime Ending date filter for results.
   * @return List<Order>
   */
  public List<Order>  orderGetOrders (String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, Date startTime, Date endTime) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/order".replaceAll("\\{format\\}","json");

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
        return (List<Order>) ApiInvoker.deserialize(response, "array", Order.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create a new order.
   * This endpoint is used for placing orders. Valid order types are &#39;Limit&#39; and &#39;StopLimit&#39;. If none is provided, BitMEX will assume a Limit Order.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix &#39;bmex_mm_&#39; and the UUID &#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39; creates &#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;.\n\nSee the BitMEX &lt;a href=&#39;https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152&#39;&gt;Reference Market Maker&lt;/a&gt; for an example of how to use and generate clOrdIDs.
   * @param symbol Instrument symbol.
   * @param quantity Quantity. Use positive numbers to buy, negative to sell.
   * @param price Order price.
   * @param timeInForce Time in force. Valid options: &#39;IOC&#39; (Immediate-Or-Cancel), &#39;GTC&#39; (Good-Till-Cancelled).
   * @param type Order type. Available: &#39;Limit&#39;, &#39;StopLimit&#39;
   * @param stopPrice If order type is &#39;StopLimit&#39;, this is the trigger/stop price.
   * @param clOrdID Optional Client Order ID to give this order. This ID will come back on any execution messages tied to this order.
   * @return Order
   */
  public Order  orderNewOrder (String symbol, BigDecimal quantity, Double price, String timeInForce, String type, Double stopPrice, String clOrdID) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
       throw new ApiException(400, "Missing the required parameter 'symbol' when calling orderNewOrder");
    }
    
    // verify the required parameter 'quantity' is set
    if (quantity == null) {
       throw new ApiException(400, "Missing the required parameter 'quantity' when calling orderNewOrder");
    }
    
    // verify the required parameter 'price' is set
    if (price == null) {
       throw new ApiException(400, "Missing the required parameter 'price' when calling orderNewOrder");
    }
    

    // create path and map variables
    String path = "/order".replaceAll("\\{format\\}","json");

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
      
      if (symbol != null) {
        builder.addTextBody("symbol", ApiInvoker.parameterToString(symbol), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (quantity != null) {
        builder.addTextBody("quantity", ApiInvoker.parameterToString(quantity), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (price != null) {
        builder.addTextBody("price", ApiInvoker.parameterToString(price), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (timeInForce != null) {
        builder.addTextBody("timeInForce", ApiInvoker.parameterToString(timeInForce), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (type != null) {
        builder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (stopPrice != null) {
        builder.addTextBody("stopPrice", ApiInvoker.parameterToString(stopPrice), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (clOrdID != null) {
        builder.addTextBody("clOrdID", ApiInvoker.parameterToString(clOrdID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("symbol", ApiInvoker.parameterToString(symbol));
      formParams.put("quantity", ApiInvoker.parameterToString(quantity));
      formParams.put("price", ApiInvoker.parameterToString(price));
      formParams.put("timeInForce", ApiInvoker.parameterToString(timeInForce));
      formParams.put("type", ApiInvoker.parameterToString(type));
      formParams.put("stopPrice", ApiInvoker.parameterToString(stopPrice));
      formParams.put("clOrdID", ApiInvoker.parameterToString(clOrdID));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Order) ApiInvoker.deserialize(response, "", Order.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cancel order(s). Send multiple order IDs to cancel in bulk.
   * Either an orderID or a clOrdID must be provided.
   * @param orderID Order ID(s).
   * @param clOrdID Client Order ID(s). See POST /order.
   * @param text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;
   * @return List<Order>
   */
  public List<Order>  orderCancelOrder (String orderID, String clOrdID, String text) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/order".replaceAll("\\{format\\}","json");

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
      
      if (orderID != null) {
        builder.addTextBody("orderID", ApiInvoker.parameterToString(orderID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (clOrdID != null) {
        builder.addTextBody("clOrdID", ApiInvoker.parameterToString(clOrdID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (text != null) {
        builder.addTextBody("text", ApiInvoker.parameterToString(text), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("orderID", ApiInvoker.parameterToString(orderID));
      formParams.put("clOrdID", ApiInvoker.parameterToString(clOrdID));
      formParams.put("text", ApiInvoker.parameterToString(text));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<Order>) ApiInvoker.deserialize(response, "array", Order.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cancels all of your orders.
   * 
   * @param symbol Optional symbol. If provided, only cancels orders for that symbol.
   * @param filter Optional filter for cancellation. Use to only cancel some orders, e.g. `{\&quot;side\&quot;: \&quot;Buy\&quot;}`.
   * @param text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;
   * @return InlineResponse200
   */
  public InlineResponse200  orderCancelAll (String symbol, String filter, String text) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/order/all".replaceAll("\\{format\\}","json");

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
      
      if (symbol != null) {
        builder.addTextBody("symbol", ApiInvoker.parameterToString(symbol), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (filter != null) {
        builder.addTextBody("filter", ApiInvoker.parameterToString(filter), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (text != null) {
        builder.addTextBody("text", ApiInvoker.parameterToString(text), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("symbol", ApiInvoker.parameterToString(symbol));
      formParams.put("filter", ApiInvoker.parameterToString(filter));
      formParams.put("text", ApiInvoker.parameterToString(text));
      
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
   * Automatically cancel all your orders after a specified timeout.
   * Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. &lt;br&gt;&lt;br&gt;Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.&lt;br&gt;&lt;br&gt;This is also available via &lt;a href=\&quot;https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-\&quot;&gt;WebSocket&lt;/a&gt;.
   * @param timeout Timeout in ms. Set to 0 to cancel this timer.
   * @return InlineResponse200
   */
  public InlineResponse200  orderCancelAllAfter (Double timeout) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'timeout' is set
    if (timeout == null) {
       throw new ApiException(400, "Missing the required parameter 'timeout' when calling orderCancelAllAfter");
    }
    

    // create path and map variables
    String path = "/order/cancelAllAfter".replaceAll("\\{format\\}","json");

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
      
      if (timeout != null) {
        builder.addTextBody("timeout", ApiInvoker.parameterToString(timeout), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("timeout", ApiInvoker.parameterToString(timeout));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
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
   * Close a position with a market order.
   * If no price is specified, a market order will be submitted to close the entirety of your position. Be careful with market orders as you may not be filled at a favorable price.
   * @param symbol Symbol of position to close.
   * @param price Optional limit price.
   * @return Order
   */
  public Order  orderClosePosition (String symbol, Double price) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
       throw new ApiException(400, "Missing the required parameter 'symbol' when calling orderClosePosition");
    }
    

    // create path and map variables
    String path = "/order/closePosition".replaceAll("\\{format\\}","json");

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
      
      if (symbol != null) {
        builder.addTextBody("symbol", ApiInvoker.parameterToString(symbol), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (price != null) {
        builder.addTextBody("price", ApiInvoker.parameterToString(price), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("symbol", ApiInvoker.parameterToString(symbol));
      formParams.put("price", ApiInvoker.parameterToString(price));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Order) ApiInvoker.deserialize(response, "", Order.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get open liquidation orders.
   * 
   * @param filter Filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.
   * @return List<LiquidationOrder>
   */
  public List<LiquidationOrder>  orderGetCloseOutOrders (String filter) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/order/liquidations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "filter", filter));
    

    

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
        return (List<LiquidationOrder>) ApiInvoker.deserialize(response, "array", LiquidationOrder.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
