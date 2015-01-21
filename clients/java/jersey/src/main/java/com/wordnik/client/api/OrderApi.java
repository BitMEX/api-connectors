package com.wordnik.client.api;

import com.wordnik.client.common.ApiException;
import com.wordnik.client.common.ApiInvoker;

import com.wordnik.client.model.Object;
import com.wordnik.client.model.Order;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class OrderApi {
  String basePath = "https://www.bitmex.com/api/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }
  
  public String getBasePath() {
    return basePath;
  }

  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  * error info- code: 400 reason: "Parameter Error" model: <none>
  * error info- code: 401 reason: "Unauthorized" model: <none>
  * error info- code: 404 reason: "Not Found" model: <none>
  */
  public List<Order> getOrders (String symbol, Object filter, List<String> columns, Double start, Boolean reverse, Date startTime, Date endTime, Double count) throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/order".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(symbol)))
      queryParams.put("symbol", String.valueOf(symbol));
    if(!"null".equals(String.valueOf(filter)))
      queryParams.put("filter", String.valueOf(filter));
    if(!"null".equals(String.valueOf(columns)))
      queryParams.put("columns", String.valueOf(columns));
    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
    if(!"null".equals(String.valueOf(start)))
      queryParams.put("start", String.valueOf(start));
    if(!"null".equals(String.valueOf(reverse)))
      queryParams.put("reverse", String.valueOf(reverse));
    if(!"null".equals(String.valueOf(startTime)))
      queryParams.put("startTime", String.valueOf(startTime));
    if(!"null".equals(String.valueOf(endTime)))
      queryParams.put("endTime", String.valueOf(endTime));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<Order>) ApiInvoker.deserialize(response, "List", Order.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  * error info- code: 400 reason: "Parameter Error" model: <none>
  * error info- code: 401 reason: "Unauthorized" model: <none>
  * error info- code: 404 reason: "Not Found" model: <none>
  */
  public Order newOrder (String symbol, Double quantity, Double price, Boolean ioc, String clOrdID) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(symbol == null || quantity == null || price == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/order".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("symbol", symbol, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("quantity", quantity, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("price", price, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("ioc", ioc, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("clOrdID", clOrdID, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("symbol", String.valueOf(symbol));
      formParams.put("quantity", String.valueOf(quantity));
      formParams.put("price", String.valueOf(price));
      formParams.put("ioc", String.valueOf(ioc));
      formParams.put("clOrdID", String.valueOf(clOrdID));
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
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  * error info- code: 400 reason: "Parameter Error" model: <none>
  * error info- code: 401 reason: "Unauthorized" model: <none>
  * error info- code: 404 reason: "Not Found" model: <none>
  */
  public List<Order> cancelOrder (String orderID, String clOrdID, String text) throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/order".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("orderID", orderID, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("clOrdID", clOrdID, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("text", text, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("orderID", String.valueOf(orderID));
      formParams.put("clOrdID", String.valueOf(clOrdID));
      formParams.put("text", String.valueOf(text));
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<Order>) ApiInvoker.deserialize(response, "List", Order.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  /*
  * error info- code: 200 reason: "Request was successful" model: <none>
  * error info- code: 400 reason: "Parameter Error" model: <none>
  * error info- code: 401 reason: "Unauthorized" model: <none>
  * error info- code: 404 reason: "Not Found" model: <none>
  */
  public Object cancelAllAfter (Double timeout) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(timeout == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/order/cancelAllAfter".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("timeout", timeout, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("timeout", String.valueOf(timeout));
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Object) ApiInvoker.deserialize(response, "", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  }

