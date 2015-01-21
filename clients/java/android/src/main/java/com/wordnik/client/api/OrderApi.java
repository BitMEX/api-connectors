package com.wordnik.client.api;

import com.wordnik.client.ApiException;
import com.wordnik.client.ApiInvoker;
import com.wordnik.client.model.Object;
import com.wordnik.client.model.Order;
import java.util.*;
import java.io.File;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.entity.mime.*;
import org.apache.http.entity.mime.content.*;
import org.apache.http.entity.ContentType;

import android.webkit.MimeTypeMap;

public class OrderApi {
  String basePath = "https://www.bitmex.com/api/v1";
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

  private static String getMimeType(File file) {
    MimeTypeMap mime = MimeTypeMap.getSingleton();
    int index = file.getName().lastIndexOf('.')+1;
    String ext = file.getName().substring(index).toLowerCase();
    return mime.getMimeTypeFromExtension(ext);
  }

  //error info- code: 200 reason: "Request was successful" model: <none>
  //error info- code: 400 reason: "Parameter Error" model: <none>
  //error info- code: 401 reason: "Unauthorized" model: <none>
  //error info- code: 404 reason: "Not Found" model: <none>
  public List<Order> getOrders (String symbol, Object filter, List<String> columns, Double start, Boolean reverse, Date startTime, Date endTime, Double count) throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/order".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

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

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
  //error info- code: 400 reason: "Parameter Error" model: <none>
  //error info- code: 401 reason: "Unauthorized" model: <none>
  //error info- code: 404 reason: "Not Found" model: <none>
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

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      hasFields = true;
      mp.add(new BasicNameValuePair("symbol", symbol));
      hasFields = true;
      mp.add(new BasicNameValuePair("quantity", quantity));
      hasFields = true;
      mp.add(new BasicNameValuePair("price", price));
      hasFields = true;
      mp.add(new BasicNameValuePair("ioc", ioc));
      hasFields = true;
      mp.add(new BasicNameValuePair("clOrdID", clOrdID));
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      hasFields = true;
      builder.addTextBody("symbol", symbol.toString());
      hasFields = true;
      builder.addTextBody("quantity", quantity.toString());
      hasFields = true;
      builder.addTextBody("price", price.toString());
      hasFields = true;
      builder.addTextBody("ioc", ioc.toString());
      hasFields = true;
      builder.addTextBody("clOrdID", clOrdID.toString());
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
  //error info- code: 400 reason: "Parameter Error" model: <none>
  //error info- code: 401 reason: "Unauthorized" model: <none>
  //error info- code: 404 reason: "Not Found" model: <none>
  public List<Order> cancelOrder (String orderID, String clOrdID, String text) throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/order".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      hasFields = true;
      mp.add(new BasicNameValuePair("orderID", orderID));
      hasFields = true;
      mp.add(new BasicNameValuePair("clOrdID", clOrdID));
      hasFields = true;
      mp.add(new BasicNameValuePair("text", text));
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      hasFields = true;
      builder.addTextBody("orderID", orderID.toString());
      hasFields = true;
      builder.addTextBody("clOrdID", clOrdID.toString());
      hasFields = true;
      builder.addTextBody("text", text.toString());
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, contentType);
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
  //error info- code: 200 reason: "Request was successful" model: <none>
  //error info- code: 400 reason: "Parameter Error" model: <none>
  //error info- code: 401 reason: "Unauthorized" model: <none>
  //error info- code: 404 reason: "Not Found" model: <none>
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

    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("application/x-www-form-urlencoded")) {
      boolean hasFields = false;
      List<NameValuePair> mp = new ArrayList<NameValuePair>();
      hasFields = true;
      mp.add(new BasicNameValuePair("timeout", timeout));
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      hasFields = true;
      builder.addTextBody("timeout", timeout.toString());
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
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

