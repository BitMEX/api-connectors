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
import io.swagger.client.model.InlineResponse2001;

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
   * To get open orders only, send {\&quot;open\&quot;: true} in the filter param.\n\nSee &lt;a href=\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
   * @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.
   * @param filter Generic table filter. Send JSON key/value pairs, such as `{\&quot;key\&quot;: \&quot;value\&quot;}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.
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
   * Amend the quantity or price of an open order.
   * &lt;p&gt;Send an &lt;code&gt;orderID&lt;/code&gt; or &lt;code&gt;clOrdID&lt;/code&gt; to identify the order you wish to amend.&lt;/p&gt;\n&lt;p&gt;Both order quantity and price can be amended. Only one &lt;code&gt;qty&lt;/code&gt; field can be used to amend.&lt;/p&gt;\n&lt;p&gt;Use the &lt;code&gt;leavesQty&lt;/code&gt; field to specify how much of the order you wish to remain open. This can be useful\nif you want to adjust your position&amp;#39;s delta by a certain amount, regardless of how much of the order has\nalready filled.&lt;/p&gt;\n&lt;p&gt;Use the &lt;code&gt;simpleOrderQty&lt;/code&gt; and &lt;code&gt;simpleLeavesQty&lt;/code&gt; fields to specify order size in Bitcoin, rather than contracts.\nThese fields will round up to the nearest contract.&lt;/p&gt;\n&lt;p&gt;Like order placement, amending can be done in bulk. Simply send a request to &lt;code&gt;PUT /api/v1/order/bulk&lt;/code&gt; with\na JSON body of the shape: &lt;code&gt;{&amp;quot;orders&amp;quot;: [{...}, {...}]}&lt;/code&gt;, each object containing the fields used in this endpoint.&lt;/p&gt;
   * @param orderID Order ID
   * @param clOrdID Client Order ID. See POST /order.
   * @param simpleOrderQty Optional order quantity in units of the underlying instrument (i.e. Bitcoin).
   * @param orderQty Optional order quantity in units of the instrument (i.e. contracts).
   * @param simpleLeavesQty Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders.
   * @param leavesQty Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.
   * @param price Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.
   * @param stopPx Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.
   * @param pegOffsetValue Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.
   * @param text Optional amend annotation. e.g. &#39;Adjust skew&#39;.
   * @return Order
   */
  public Order  orderAmend (String orderID, String clOrdID, Double simpleOrderQty, BigDecimal orderQty, Double simpleLeavesQty, BigDecimal leavesQty, Double price, Double stopPx, Double pegOffsetValue, String text) throws ApiException {
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
      
      if (simpleOrderQty != null) {
        builder.addTextBody("simpleOrderQty", ApiInvoker.parameterToString(simpleOrderQty), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (orderQty != null) {
        builder.addTextBody("orderQty", ApiInvoker.parameterToString(orderQty), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (simpleLeavesQty != null) {
        builder.addTextBody("simpleLeavesQty", ApiInvoker.parameterToString(simpleLeavesQty), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (leavesQty != null) {
        builder.addTextBody("leavesQty", ApiInvoker.parameterToString(leavesQty), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (price != null) {
        builder.addTextBody("price", ApiInvoker.parameterToString(price), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (stopPx != null) {
        builder.addTextBody("stopPx", ApiInvoker.parameterToString(stopPx), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (pegOffsetValue != null) {
        builder.addTextBody("pegOffsetValue", ApiInvoker.parameterToString(pegOffsetValue), ApiInvoker.TEXT_PLAIN_UTF8);
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
      formParams.put("simpleOrderQty", ApiInvoker.parameterToString(simpleOrderQty));
      formParams.put("orderQty", ApiInvoker.parameterToString(orderQty));
      formParams.put("simpleLeavesQty", ApiInvoker.parameterToString(simpleLeavesQty));
      formParams.put("leavesQty", ApiInvoker.parameterToString(leavesQty));
      formParams.put("price", ApiInvoker.parameterToString(price));
      formParams.put("stopPx", ApiInvoker.parameterToString(stopPx));
      formParams.put("pegOffsetValue", ApiInvoker.parameterToString(pegOffsetValue));
      formParams.put("text", ApiInvoker.parameterToString(text));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
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
   * Create a new order.
   * This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nIf no order type is provided, BitMEX will assume &#39;Limit&#39;.\nBe very careful with &#39;Market&#39; and &#39;Stop&#39; orders as you may be filled at an unfavourable price.\n\nYou can submit bulk orders by POSTing an array of orders to `/api/v1/order/bulk`. Send a JSON payload\nwith the shape: `{\&quot;orders\&quot;: [{...}, {...}]}`, with each inner object containing the same fields that would be\nsent to this endpoint.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order.\nThis clOrdID will come back as a property on the order and any related executions (including on the WebSocket),\nand can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID.\nSome UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix `&#39;bmex_mm_&#39;`\nand the UUID `&#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39;` creates `&#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;`.\n\nSee the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152)\nfor an example of how to use and generate clOrdIDs.
   * @param symbol Instrument symbol. e.g. &#39;XBT24H&#39;.
   * @param side Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless `orderQty` or `simpleOrderQty` is negative.
   * @param simpleOrderQty Order quantity in units of the underlying instrument (i.e. Bitcoin).
   * @param quantity Deprecated: use `orderQty`.
   * @param orderQty Order quantity in units of the instrument (i.e. contracts).
   * @param price Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.
   * @param displayQty Optional quantity to display in the book. Use 0 for a hidden order.
   * @param stopPrice Deprecated: use `stopPx`.
   * @param stopPx Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering.
   * @param clOrdID Optional Client Order ID. This clOrdID will come back on the order and any related executions.
   * @param clOrdLinkID Optional Client Order Link ID for contingent orders.
   * @param pegOffsetValue Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.
   * @param pegPriceType Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg.
   * @param type Deprecated: use `ordType`.
   * @param ordType Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to &#39;Limit&#39; when `price` is specified. Defaults to &#39;Stop&#39; when `stopPx` is specified. Defaults to &#39;StopLimit&#39; when `price` and `stopPx` are specified.
   * @param timeInForce Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, &#39;LimitIfTouched&#39;, and &#39;MarketWithLeftOverAsLimit&#39; orders.
   * @param execInst Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. &#39;AllOrNone&#39; instruction requires `displayQty` to be 0. &#39;MarkPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders.
   * @param contingencyType Optional contingency type for use with `clOrdLinkID`. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional.
   * @param text Optional order annotation. e.g. &#39;Take profit&#39;.
   * @return Order
   */
  public Order  orderNew (String symbol, String side, Double simpleOrderQty, BigDecimal quantity, BigDecimal orderQty, Double price, BigDecimal displayQty, Double stopPrice, Double stopPx, String clOrdID, String clOrdLinkID, Double pegOffsetValue, String pegPriceType, String type, String ordType, String timeInForce, String execInst, String contingencyType, String text) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
       throw new ApiException(400, "Missing the required parameter 'symbol' when calling orderNew");
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
      
      if (side != null) {
        builder.addTextBody("side", ApiInvoker.parameterToString(side), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (simpleOrderQty != null) {
        builder.addTextBody("simpleOrderQty", ApiInvoker.parameterToString(simpleOrderQty), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (quantity != null) {
        builder.addTextBody("quantity", ApiInvoker.parameterToString(quantity), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (orderQty != null) {
        builder.addTextBody("orderQty", ApiInvoker.parameterToString(orderQty), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (price != null) {
        builder.addTextBody("price", ApiInvoker.parameterToString(price), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (displayQty != null) {
        builder.addTextBody("displayQty", ApiInvoker.parameterToString(displayQty), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (stopPrice != null) {
        builder.addTextBody("stopPrice", ApiInvoker.parameterToString(stopPrice), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (stopPx != null) {
        builder.addTextBody("stopPx", ApiInvoker.parameterToString(stopPx), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (clOrdID != null) {
        builder.addTextBody("clOrdID", ApiInvoker.parameterToString(clOrdID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (clOrdLinkID != null) {
        builder.addTextBody("clOrdLinkID", ApiInvoker.parameterToString(clOrdLinkID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (pegOffsetValue != null) {
        builder.addTextBody("pegOffsetValue", ApiInvoker.parameterToString(pegOffsetValue), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (pegPriceType != null) {
        builder.addTextBody("pegPriceType", ApiInvoker.parameterToString(pegPriceType), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (type != null) {
        builder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (ordType != null) {
        builder.addTextBody("ordType", ApiInvoker.parameterToString(ordType), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (timeInForce != null) {
        builder.addTextBody("timeInForce", ApiInvoker.parameterToString(timeInForce), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (execInst != null) {
        builder.addTextBody("execInst", ApiInvoker.parameterToString(execInst), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (contingencyType != null) {
        builder.addTextBody("contingencyType", ApiInvoker.parameterToString(contingencyType), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (text != null) {
        builder.addTextBody("text", ApiInvoker.parameterToString(text), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("symbol", ApiInvoker.parameterToString(symbol));
      formParams.put("side", ApiInvoker.parameterToString(side));
      formParams.put("simpleOrderQty", ApiInvoker.parameterToString(simpleOrderQty));
      formParams.put("quantity", ApiInvoker.parameterToString(quantity));
      formParams.put("orderQty", ApiInvoker.parameterToString(orderQty));
      formParams.put("price", ApiInvoker.parameterToString(price));
      formParams.put("displayQty", ApiInvoker.parameterToString(displayQty));
      formParams.put("stopPrice", ApiInvoker.parameterToString(stopPrice));
      formParams.put("stopPx", ApiInvoker.parameterToString(stopPx));
      formParams.put("clOrdID", ApiInvoker.parameterToString(clOrdID));
      formParams.put("clOrdLinkID", ApiInvoker.parameterToString(clOrdLinkID));
      formParams.put("pegOffsetValue", ApiInvoker.parameterToString(pegOffsetValue));
      formParams.put("pegPriceType", ApiInvoker.parameterToString(pegPriceType));
      formParams.put("type", ApiInvoker.parameterToString(type));
      formParams.put("ordType", ApiInvoker.parameterToString(ordType));
      formParams.put("timeInForce", ApiInvoker.parameterToString(timeInForce));
      formParams.put("execInst", ApiInvoker.parameterToString(execInst));
      formParams.put("contingencyType", ApiInvoker.parameterToString(contingencyType));
      formParams.put("text", ApiInvoker.parameterToString(text));
      
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
   * @param text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;.
   * @return List<Order>
   */
  public List<Order>  orderCancel (String orderID, String clOrdID, String text) throws ApiException {
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
   * @return InlineResponse2001
   */
  public InlineResponse2001  orderCancelAll (String symbol, String filter, String text) throws ApiException {
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
        return (InlineResponse2001) ApiInvoker.deserialize(response, "", InlineResponse2001.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Amend multiple orders.
   * Similar to POST /amend, but with multiple orders. `application/json` only. Ratelimited at 50%.
   * @param orders An array of orders.
   * @return List<Order>
   */
  public List<Order>  orderAmendBulk (String orders) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/order/bulk".replaceAll("\\{format\\}","json");

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
      
      if (orders != null) {
        builder.addTextBody("orders", ApiInvoker.parameterToString(orders), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("orders", ApiInvoker.parameterToString(orders));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
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
   * Create multiple new orders.
   * This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nEach individual order object in the array should have the same properties as an individual POST /order call.\n\nThis endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX\nsystems, this endpoint is ratelimited at `ceil(0.5 * orders)`. Submitting 10 orders via a bulk order call\nwill only count as 5 requests.\n\nFor now, only `application/json` is supported on this endpoint.
   * @param orders An array of orders.
   * @return List<Order>
   */
  public List<Order>  orderNewBulk (String orders) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/order/bulk".replaceAll("\\{format\\}","json");

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
      
      if (orders != null) {
        builder.addTextBody("orders", ApiInvoker.parameterToString(orders), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("orders", ApiInvoker.parameterToString(orders));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
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
   * Automatically cancel all your orders after a specified timeout.
   * Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage.\nIf called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.\n\nExample usage: call this route at 15s intervals with an offset of 60000 (60s).\nIf this route is not called within 60 seconds, all your orders will be automatically canceled.\n\nThis is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-).
   * @param timeout Timeout in ms. Set to 0 to cancel this timer.
   * @return InlineResponse2001
   */
  public InlineResponse2001  orderCancelAllAfter (Double timeout) throws ApiException {
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
        return (InlineResponse2001) ApiInvoker.deserialize(response, "", InlineResponse2001.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]
   * If no `price` is specified, a market order will be submitted to close the whole of your position. + This will also close all other open orders in this symbol.
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
  
}
