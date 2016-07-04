package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.Order;
import io.swagger.client.model.Error;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

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
  * Amend the quantity or price of an open order.
  * &lt;p&gt;Send an &lt;code&gt;orderID&lt;/code&gt; or &lt;code&gt;clOrdID&lt;/code&gt; to identify the order you wish to amend.&lt;/p&gt; &lt;p&gt;Both order quantity and price can be amended. Only one &lt;code&gt;qty&lt;/code&gt; field can be used to amend.&lt;/p&gt; &lt;p&gt;Use the &lt;code&gt;leavesQty&lt;/code&gt; field to specify how much of the order you wish to remain open. This can be useful if you want to adjust your position&amp;#39;s delta by a certain amount, regardless of how much of the order has already filled.&lt;/p&gt; &lt;p&gt;Use the &lt;code&gt;simpleOrderQty&lt;/code&gt; and &lt;code&gt;simpleLeavesQty&lt;/code&gt; fields to specify order size in Bitcoin, rather than contracts. These fields will round up to the nearest contract.&lt;/p&gt; &lt;p&gt;Like order placement, amending can be done in bulk. Simply send a request to &lt;code&gt;PUT /api/v1/order/bulk&lt;/code&gt; with a JSON body of the shape: &lt;code&gt;{&amp;quot;orders&amp;quot;: [{...}, {...}]}&lt;/code&gt;, each object containing the fields used in this endpoint.&lt;/p&gt; 
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
  public Order orderAmend (String orderID, String clOrdID, Double simpleOrderQty, BigDecimal orderQty, Double simpleLeavesQty, BigDecimal leavesQty, Double price, Double stopPx, Double pegOffsetValue, String text) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (orderID != null) {
          localVarBuilder.addTextBody("orderID", ApiInvoker.parameterToString(orderID), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (clOrdID != null) {
          localVarBuilder.addTextBody("clOrdID", ApiInvoker.parameterToString(clOrdID), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (simpleOrderQty != null) {
          localVarBuilder.addTextBody("simpleOrderQty", ApiInvoker.parameterToString(simpleOrderQty), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (orderQty != null) {
          localVarBuilder.addTextBody("orderQty", ApiInvoker.parameterToString(orderQty), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (simpleLeavesQty != null) {
          localVarBuilder.addTextBody("simpleLeavesQty", ApiInvoker.parameterToString(simpleLeavesQty), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (leavesQty != null) {
          localVarBuilder.addTextBody("leavesQty", ApiInvoker.parameterToString(leavesQty), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (price != null) {
          localVarBuilder.addTextBody("price", ApiInvoker.parameterToString(price), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (stopPx != null) {
          localVarBuilder.addTextBody("stopPx", ApiInvoker.parameterToString(stopPx), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (pegOffsetValue != null) {
          localVarBuilder.addTextBody("pegOffsetValue", ApiInvoker.parameterToString(pegOffsetValue), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (text != null) {
          localVarBuilder.addTextBody("text", ApiInvoker.parameterToString(text), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
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

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Order) ApiInvoker.deserialize(localVarResponse, "", Order.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Amend the quantity or price of an open order.
   * &lt;p&gt;Send an &lt;code&gt;orderID&lt;/code&gt; or &lt;code&gt;clOrdID&lt;/code&gt; to identify the order you wish to amend.&lt;/p&gt; &lt;p&gt;Both order quantity and price can be amended. Only one &lt;code&gt;qty&lt;/code&gt; field can be used to amend.&lt;/p&gt; &lt;p&gt;Use the &lt;code&gt;leavesQty&lt;/code&gt; field to specify how much of the order you wish to remain open. This can be useful if you want to adjust your position&amp;#39;s delta by a certain amount, regardless of how much of the order has already filled.&lt;/p&gt; &lt;p&gt;Use the &lt;code&gt;simpleOrderQty&lt;/code&gt; and &lt;code&gt;simpleLeavesQty&lt;/code&gt; fields to specify order size in Bitcoin, rather than contracts. These fields will round up to the nearest contract.&lt;/p&gt; &lt;p&gt;Like order placement, amending can be done in bulk. Simply send a request to &lt;code&gt;PUT /api/v1/order/bulk&lt;/code&gt; with a JSON body of the shape: &lt;code&gt;{&amp;quot;orders&amp;quot;: [{...}, {...}]}&lt;/code&gt;, each object containing the fields used in this endpoint.&lt;/p&gt; 
   * @param orderID Order ID   * @param clOrdID Client Order ID. See POST /order.   * @param simpleOrderQty Optional order quantity in units of the underlying instrument (i.e. Bitcoin).   * @param orderQty Optional order quantity in units of the instrument (i.e. contracts).   * @param simpleLeavesQty Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders.   * @param leavesQty Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.   * @param price Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.   * @param stopPx Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.   * @param pegOffsetValue Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.   * @param text Optional amend annotation. e.g. &#39;Adjust skew&#39;.
  */
  public void orderAmend (String orderID, String clOrdID, Double simpleOrderQty, BigDecimal orderQty, Double simpleLeavesQty, BigDecimal leavesQty, Double price, Double stopPx, Double pegOffsetValue, String text, final Response.Listener<Order> responseListener, final Response.ErrorListener errorListener) {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (orderID != null) {
        localVarBuilder.addTextBody("orderID", ApiInvoker.parameterToString(orderID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (clOrdID != null) {
        localVarBuilder.addTextBody("clOrdID", ApiInvoker.parameterToString(clOrdID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (simpleOrderQty != null) {
        localVarBuilder.addTextBody("simpleOrderQty", ApiInvoker.parameterToString(simpleOrderQty), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (orderQty != null) {
        localVarBuilder.addTextBody("orderQty", ApiInvoker.parameterToString(orderQty), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (simpleLeavesQty != null) {
        localVarBuilder.addTextBody("simpleLeavesQty", ApiInvoker.parameterToString(simpleLeavesQty), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (leavesQty != null) {
        localVarBuilder.addTextBody("leavesQty", ApiInvoker.parameterToString(leavesQty), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (price != null) {
        localVarBuilder.addTextBody("price", ApiInvoker.parameterToString(price), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (stopPx != null) {
        localVarBuilder.addTextBody("stopPx", ApiInvoker.parameterToString(stopPx), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (pegOffsetValue != null) {
        localVarBuilder.addTextBody("pegOffsetValue", ApiInvoker.parameterToString(pegOffsetValue), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (text != null) {
        localVarBuilder.addTextBody("text", ApiInvoker.parameterToString(text), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
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

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Order) ApiInvoker.deserialize(localVarResponse,  "", Order.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Amend multiple orders.
  * Similar to POST /amend, but with multiple orders. &#x60;application/json&#x60; only. Ratelimited at 50%.
   * @param orders An array of orders.
   * @return List<Order>
  */
  public List<Order> orderAmendBulk (String orders) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (orders != null) {
          localVarBuilder.addTextBody("orders", ApiInvoker.parameterToString(orders), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("orders", ApiInvoker.parameterToString(orders));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<Order>) ApiInvoker.deserialize(localVarResponse, "array", Order.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Amend multiple orders.
   * Similar to POST /amend, but with multiple orders. &#x60;application/json&#x60; only. Ratelimited at 50%.
   * @param orders An array of orders.
  */
  public void orderAmendBulk (String orders, final Response.Listener<List<Order>> responseListener, final Response.ErrorListener errorListener) {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (orders != null) {
        localVarBuilder.addTextBody("orders", ApiInvoker.parameterToString(orders), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("orders", ApiInvoker.parameterToString(orders));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Order>) ApiInvoker.deserialize(localVarResponse,  "array", Order.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
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
  public List<Order> orderCancel (String orderID, String clOrdID, String text) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (orderID != null) {
          localVarBuilder.addTextBody("orderID", ApiInvoker.parameterToString(orderID), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (clOrdID != null) {
          localVarBuilder.addTextBody("clOrdID", ApiInvoker.parameterToString(clOrdID), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (text != null) {
          localVarBuilder.addTextBody("text", ApiInvoker.parameterToString(text), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("orderID", ApiInvoker.parameterToString(orderID));
formParams.put("clOrdID", ApiInvoker.parameterToString(clOrdID));
formParams.put("text", ApiInvoker.parameterToString(text));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<Order>) ApiInvoker.deserialize(localVarResponse, "array", Order.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Cancel order(s). Send multiple order IDs to cancel in bulk.
   * Either an orderID or a clOrdID must be provided.
   * @param orderID Order ID(s).   * @param clOrdID Client Order ID(s). See POST /order.   * @param text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;.
  */
  public void orderCancel (String orderID, String clOrdID, String text, final Response.Listener<List<Order>> responseListener, final Response.ErrorListener errorListener) {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (orderID != null) {
        localVarBuilder.addTextBody("orderID", ApiInvoker.parameterToString(orderID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (clOrdID != null) {
        localVarBuilder.addTextBody("clOrdID", ApiInvoker.parameterToString(clOrdID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (text != null) {
        localVarBuilder.addTextBody("text", ApiInvoker.parameterToString(text), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("orderID", ApiInvoker.parameterToString(orderID));
formParams.put("clOrdID", ApiInvoker.parameterToString(clOrdID));
formParams.put("text", ApiInvoker.parameterToString(text));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Order>) ApiInvoker.deserialize(localVarResponse,  "array", Order.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Cancels all of your orders.
  * 
   * @param symbol Optional symbol. If provided, only cancels orders for that symbol.
   * @param filter Optional filter for cancellation. Use to only cancel some orders, e.g. &#x60;{\&quot;side\&quot;: \&quot;Buy\&quot;}&#x60;.
   * @param text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;
   * @return Object
  */
  public Object orderCancelAll (String symbol, String filter, String text) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (symbol != null) {
          localVarBuilder.addTextBody("symbol", ApiInvoker.parameterToString(symbol), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (filter != null) {
          localVarBuilder.addTextBody("filter", ApiInvoker.parameterToString(filter), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (text != null) {
          localVarBuilder.addTextBody("text", ApiInvoker.parameterToString(text), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("symbol", ApiInvoker.parameterToString(symbol));
formParams.put("filter", ApiInvoker.parameterToString(filter));
formParams.put("text", ApiInvoker.parameterToString(text));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Cancels all of your orders.
   * 
   * @param symbol Optional symbol. If provided, only cancels orders for that symbol.   * @param filter Optional filter for cancellation. Use to only cancel some orders, e.g. &#x60;{\&quot;side\&quot;: \&quot;Buy\&quot;}&#x60;.   * @param text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;
  */
  public void orderCancelAll (String symbol, String filter, String text, final Response.Listener<Object> responseListener, final Response.ErrorListener errorListener) {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (symbol != null) {
        localVarBuilder.addTextBody("symbol", ApiInvoker.parameterToString(symbol), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (filter != null) {
        localVarBuilder.addTextBody("filter", ApiInvoker.parameterToString(filter), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (text != null) {
        localVarBuilder.addTextBody("text", ApiInvoker.parameterToString(text), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("symbol", ApiInvoker.parameterToString(symbol));
formParams.put("filter", ApiInvoker.parameterToString(filter));
formParams.put("text", ApiInvoker.parameterToString(text));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Object) ApiInvoker.deserialize(localVarResponse,  "", Object.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Automatically cancel all your orders after a specified timeout.
  * Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.  Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.  This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-). 
   * @param timeout Timeout in ms. Set to 0 to cancel this timer. 
   * @return Object
  */
  public Object orderCancelAllAfter (Double timeout) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'timeout' is set
      if (timeout == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'timeout' when calling orderCancelAllAfter",
      new ApiException(400, "Missing the required parameter 'timeout' when calling orderCancelAllAfter"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (timeout != null) {
          localVarBuilder.addTextBody("timeout", ApiInvoker.parameterToString(timeout), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("timeout", ApiInvoker.parameterToString(timeout));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Automatically cancel all your orders after a specified timeout.
   * Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.  Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.  This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-). 
   * @param timeout Timeout in ms. Set to 0 to cancel this timer. 
  */
  public void orderCancelAllAfter (Double timeout, final Response.Listener<Object> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'timeout' is set
    if (timeout == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'timeout' when calling orderCancelAllAfter",
         new ApiException(400, "Missing the required parameter 'timeout' when calling orderCancelAllAfter"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (timeout != null) {
        localVarBuilder.addTextBody("timeout", ApiInvoker.parameterToString(timeout), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("timeout", ApiInvoker.parameterToString(timeout));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Object) ApiInvoker.deserialize(localVarResponse,  "", Object.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]
  * If no &#x60;price&#x60; is specified, a market order will be submitted to close the whole of your position. + This will also close all other open orders in this symbol.
   * @param symbol Symbol of position to close.
   * @param price Optional limit price.
   * @return Order
  */
  public Order orderClosePosition (String symbol, Double price) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'symbol' is set
      if (symbol == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling orderClosePosition",
      new ApiException(400, "Missing the required parameter 'symbol' when calling orderClosePosition"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (symbol != null) {
          localVarBuilder.addTextBody("symbol", ApiInvoker.parameterToString(symbol), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (price != null) {
          localVarBuilder.addTextBody("price", ApiInvoker.parameterToString(price), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("symbol", ApiInvoker.parameterToString(symbol));
formParams.put("price", ApiInvoker.parameterToString(price));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Order) ApiInvoker.deserialize(localVarResponse, "", Order.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]
   * If no &#x60;price&#x60; is specified, a market order will be submitted to close the whole of your position. + This will also close all other open orders in this symbol.
   * @param symbol Symbol of position to close.   * @param price Optional limit price.
  */
  public void orderClosePosition (String symbol, Double price, final Response.Listener<Order> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling orderClosePosition",
         new ApiException(400, "Missing the required parameter 'symbol' when calling orderClosePosition"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (symbol != null) {
        localVarBuilder.addTextBody("symbol", ApiInvoker.parameterToString(symbol), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (price != null) {
        localVarBuilder.addTextBody("price", ApiInvoker.parameterToString(price), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("symbol", ApiInvoker.parameterToString(symbol));
formParams.put("price", ApiInvoker.parameterToString(price));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Order) ApiInvoker.deserialize(localVarResponse,  "", Order.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get your orders.
  * To get open orders only, send {\&quot;open\&quot;: true} in the filter param.  See &lt;a href&#x3D;\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
   * @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;.
   * @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.
   * @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
   * @param count Number of results to fetch.
   * @param start Starting point for results.
   * @param reverse If true, will sort results newest first.
   * @param startTime Starting date filter for results.
   * @param endTime Ending date filter for results.
   * @return List<Order>
  */
  public List<Order> orderGetOrders (String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, Date startTime, Date endTime) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<Order>) ApiInvoker.deserialize(localVarResponse, "array", Order.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Get your orders.
   * To get open orders only, send {\&quot;open\&quot;: true} in the filter param.  See &lt;a href&#x3D;\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
   * @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;.   * @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.   * @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.   * @param count Number of results to fetch.   * @param start Starting point for results.   * @param reverse If true, will sort results newest first.   * @param startTime Starting date filter for results.   * @param endTime Ending date filter for results.
  */
  public void orderGetOrders (String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, Date startTime, Date endTime, final Response.Listener<List<Order>> responseListener, final Response.ErrorListener errorListener) {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Order>) ApiInvoker.deserialize(localVarResponse,  "array", Order.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Create a new order.
  * This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  If no order type is provided, BitMEX will assume &#39;Limit&#39;. Be very careful with &#39;Market&#39; and &#39;Stop&#39; orders as you may be filled at an unfavourable price.  You can submit bulk orders by POSTing an array of orders to &#x60;/api/v1/order/bulk&#x60;. Send a JSON payload with the shape: &#x60;{\&quot;orders\&quot;: [{...}, {...}]}&#x60;, with each inner object containing the same fields that would be sent to this endpoint.  A note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This clOrdID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.  To generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix &#x60;&#39;bmex_mm_&#39;&#x60; and the UUID &#x60;&#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39;&#x60; creates &#x60;&#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;&#x60;.  See the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152) for an example of how to use and generate clOrdIDs. 
   * @param symbol Instrument symbol. e.g. &#39;XBT24H&#39;.
   * @param side Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless &#x60;orderQty&#x60; or &#x60;simpleOrderQty&#x60; is negative.
   * @param simpleOrderQty Order quantity in units of the underlying instrument (i.e. Bitcoin).
   * @param quantity Deprecated: use &#x60;orderQty&#x60;.
   * @param orderQty Order quantity in units of the instrument (i.e. contracts).
   * @param price Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.
   * @param displayQty Optional quantity to display in the book. Use 0 for a hidden order.
   * @param stopPrice Deprecated: use &#x60;stopPx&#x60;.
   * @param stopPx Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use &#x60;execInst&#x60; of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering.
   * @param clOrdID Optional Client Order ID. This clOrdID will come back on the order and any related executions.
   * @param clOrdLinkID Optional Client Order Link ID for contingent orders.
   * @param pegOffsetValue Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.
   * @param pegPriceType Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg.
   * @param type Deprecated: use &#x60;ordType&#x60;.
   * @param ordType Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to &#39;Limit&#39; when &#x60;price&#x60; is specified. Defaults to &#39;Stop&#39; when &#x60;stopPx&#x60; is specified. Defaults to &#39;StopLimit&#39; when &#x60;price&#x60; and &#x60;stopPx&#x60; are specified.
   * @param timeInForce Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, &#39;LimitIfTouched&#39;, and &#39;MarketWithLeftOverAsLimit&#39; orders.
   * @param execInst Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. &#39;AllOrNone&#39; instruction requires &#x60;displayQty&#x60; to be 0. &#39;MarkPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders.
   * @param contingencyType Optional contingency type for use with &#x60;clOrdLinkID&#x60;. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional.
   * @param text Optional order annotation. e.g. &#39;Take profit&#39;.
   * @return Order
  */
  public Order orderNew (String symbol, String side, Double simpleOrderQty, BigDecimal quantity, BigDecimal orderQty, Double price, BigDecimal displayQty, Double stopPrice, Double stopPx, String clOrdID, String clOrdLinkID, Double pegOffsetValue, String pegPriceType, String type, String ordType, String timeInForce, String execInst, String contingencyType, String text) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'symbol' is set
      if (symbol == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling orderNew",
      new ApiException(400, "Missing the required parameter 'symbol' when calling orderNew"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (symbol != null) {
          localVarBuilder.addTextBody("symbol", ApiInvoker.parameterToString(symbol), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (side != null) {
          localVarBuilder.addTextBody("side", ApiInvoker.parameterToString(side), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (simpleOrderQty != null) {
          localVarBuilder.addTextBody("simpleOrderQty", ApiInvoker.parameterToString(simpleOrderQty), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (quantity != null) {
          localVarBuilder.addTextBody("quantity", ApiInvoker.parameterToString(quantity), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (orderQty != null) {
          localVarBuilder.addTextBody("orderQty", ApiInvoker.parameterToString(orderQty), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (price != null) {
          localVarBuilder.addTextBody("price", ApiInvoker.parameterToString(price), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (displayQty != null) {
          localVarBuilder.addTextBody("displayQty", ApiInvoker.parameterToString(displayQty), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (stopPrice != null) {
          localVarBuilder.addTextBody("stopPrice", ApiInvoker.parameterToString(stopPrice), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (stopPx != null) {
          localVarBuilder.addTextBody("stopPx", ApiInvoker.parameterToString(stopPx), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (clOrdID != null) {
          localVarBuilder.addTextBody("clOrdID", ApiInvoker.parameterToString(clOrdID), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (clOrdLinkID != null) {
          localVarBuilder.addTextBody("clOrdLinkID", ApiInvoker.parameterToString(clOrdLinkID), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (pegOffsetValue != null) {
          localVarBuilder.addTextBody("pegOffsetValue", ApiInvoker.parameterToString(pegOffsetValue), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (pegPriceType != null) {
          localVarBuilder.addTextBody("pegPriceType", ApiInvoker.parameterToString(pegPriceType), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (type != null) {
          localVarBuilder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (ordType != null) {
          localVarBuilder.addTextBody("ordType", ApiInvoker.parameterToString(ordType), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (timeInForce != null) {
          localVarBuilder.addTextBody("timeInForce", ApiInvoker.parameterToString(timeInForce), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (execInst != null) {
          localVarBuilder.addTextBody("execInst", ApiInvoker.parameterToString(execInst), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (contingencyType != null) {
          localVarBuilder.addTextBody("contingencyType", ApiInvoker.parameterToString(contingencyType), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  
          if (text != null) {
          localVarBuilder.addTextBody("text", ApiInvoker.parameterToString(text), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
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

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (Order) ApiInvoker.deserialize(localVarResponse, "", Order.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Create a new order.
   * This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  If no order type is provided, BitMEX will assume &#39;Limit&#39;. Be very careful with &#39;Market&#39; and &#39;Stop&#39; orders as you may be filled at an unfavourable price.  You can submit bulk orders by POSTing an array of orders to &#x60;/api/v1/order/bulk&#x60;. Send a JSON payload with the shape: &#x60;{\&quot;orders\&quot;: [{...}, {...}]}&#x60;, with each inner object containing the same fields that would be sent to this endpoint.  A note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This clOrdID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.  To generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix &#x60;&#39;bmex_mm_&#39;&#x60; and the UUID &#x60;&#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39;&#x60; creates &#x60;&#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;&#x60;.  See the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152) for an example of how to use and generate clOrdIDs. 
   * @param symbol Instrument symbol. e.g. &#39;XBT24H&#39;.   * @param side Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless &#x60;orderQty&#x60; or &#x60;simpleOrderQty&#x60; is negative.   * @param simpleOrderQty Order quantity in units of the underlying instrument (i.e. Bitcoin).   * @param quantity Deprecated: use &#x60;orderQty&#x60;.   * @param orderQty Order quantity in units of the instrument (i.e. contracts).   * @param price Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.   * @param displayQty Optional quantity to display in the book. Use 0 for a hidden order.   * @param stopPrice Deprecated: use &#x60;stopPx&#x60;.   * @param stopPx Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use &#x60;execInst&#x60; of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering.   * @param clOrdID Optional Client Order ID. This clOrdID will come back on the order and any related executions.   * @param clOrdLinkID Optional Client Order Link ID for contingent orders.   * @param pegOffsetValue Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.   * @param pegPriceType Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg.   * @param type Deprecated: use &#x60;ordType&#x60;.   * @param ordType Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to &#39;Limit&#39; when &#x60;price&#x60; is specified. Defaults to &#39;Stop&#39; when &#x60;stopPx&#x60; is specified. Defaults to &#39;StopLimit&#39; when &#x60;price&#x60; and &#x60;stopPx&#x60; are specified.   * @param timeInForce Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, &#39;LimitIfTouched&#39;, and &#39;MarketWithLeftOverAsLimit&#39; orders.   * @param execInst Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. &#39;AllOrNone&#39; instruction requires &#x60;displayQty&#x60; to be 0. &#39;MarkPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders.   * @param contingencyType Optional contingency type for use with &#x60;clOrdLinkID&#x60;. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional.   * @param text Optional order annotation. e.g. &#39;Take profit&#39;.
  */
  public void orderNew (String symbol, String side, Double simpleOrderQty, BigDecimal quantity, BigDecimal orderQty, Double price, BigDecimal displayQty, Double stopPrice, Double stopPx, String clOrdID, String clOrdLinkID, Double pegOffsetValue, String pegPriceType, String type, String ordType, String timeInForce, String execInst, String contingencyType, String text, final Response.Listener<Order> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'symbol' when calling orderNew",
         new ApiException(400, "Missing the required parameter 'symbol' when calling orderNew"));
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (symbol != null) {
        localVarBuilder.addTextBody("symbol", ApiInvoker.parameterToString(symbol), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (side != null) {
        localVarBuilder.addTextBody("side", ApiInvoker.parameterToString(side), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (simpleOrderQty != null) {
        localVarBuilder.addTextBody("simpleOrderQty", ApiInvoker.parameterToString(simpleOrderQty), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (quantity != null) {
        localVarBuilder.addTextBody("quantity", ApiInvoker.parameterToString(quantity), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (orderQty != null) {
        localVarBuilder.addTextBody("orderQty", ApiInvoker.parameterToString(orderQty), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (price != null) {
        localVarBuilder.addTextBody("price", ApiInvoker.parameterToString(price), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (displayQty != null) {
        localVarBuilder.addTextBody("displayQty", ApiInvoker.parameterToString(displayQty), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (stopPrice != null) {
        localVarBuilder.addTextBody("stopPrice", ApiInvoker.parameterToString(stopPrice), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (stopPx != null) {
        localVarBuilder.addTextBody("stopPx", ApiInvoker.parameterToString(stopPx), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (clOrdID != null) {
        localVarBuilder.addTextBody("clOrdID", ApiInvoker.parameterToString(clOrdID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (clOrdLinkID != null) {
        localVarBuilder.addTextBody("clOrdLinkID", ApiInvoker.parameterToString(clOrdLinkID), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (pegOffsetValue != null) {
        localVarBuilder.addTextBody("pegOffsetValue", ApiInvoker.parameterToString(pegOffsetValue), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (pegPriceType != null) {
        localVarBuilder.addTextBody("pegPriceType", ApiInvoker.parameterToString(pegPriceType), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (type != null) {
        localVarBuilder.addTextBody("type", ApiInvoker.parameterToString(type), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (ordType != null) {
        localVarBuilder.addTextBody("ordType", ApiInvoker.parameterToString(ordType), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (timeInForce != null) {
        localVarBuilder.addTextBody("timeInForce", ApiInvoker.parameterToString(timeInForce), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (execInst != null) {
        localVarBuilder.addTextBody("execInst", ApiInvoker.parameterToString(execInst), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (contingencyType != null) {
        localVarBuilder.addTextBody("contingencyType", ApiInvoker.parameterToString(contingencyType), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (text != null) {
        localVarBuilder.addTextBody("text", ApiInvoker.parameterToString(text), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
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

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Order) ApiInvoker.deserialize(localVarResponse,  "", Order.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Create multiple new orders.
  * This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  Each individual order object in the array should have the same properties as an individual POST /order call.  This endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX systems, this endpoint is ratelimited at &#x60;ceil(0.5 * orders)&#x60;. Submitting 10 orders via a bulk order call will only count as 5 requests.  For now, only &#x60;application/json&#x60; is supported on this endpoint. 
   * @param orders An array of orders.
   * @return List<Order>
  */
  public List<Order> orderNewBulk (String orders) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  
          if (orders != null) {
          localVarBuilder.addTextBody("orders", ApiInvoker.parameterToString(orders), ApiInvoker.TEXT_PLAIN_UTF8);
          }
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
  formParams.put("orders", ApiInvoker.parameterToString(orders));
      }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<Order>) ApiInvoker.deserialize(localVarResponse, "array", Order.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Create multiple new orders.
   * This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  Each individual order object in the array should have the same properties as an individual POST /order call.  This endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX systems, this endpoint is ratelimited at &#x60;ceil(0.5 * orders)&#x60;. Submitting 10 orders via a bulk order call will only count as 5 requests.  For now, only &#x60;application/json&#x60; is supported on this endpoint. 
   * @param orders An array of orders.
  */
  public void orderNewBulk (String orders, final Response.Listener<List<Order>> responseListener, final Response.ErrorListener errorListener) {
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
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (orders != null) {
        localVarBuilder.addTextBody("orders", ApiInvoker.parameterToString(orders), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("orders", ApiInvoker.parameterToString(orders));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<Order>) ApiInvoker.deserialize(localVarResponse,  "array", Order.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
