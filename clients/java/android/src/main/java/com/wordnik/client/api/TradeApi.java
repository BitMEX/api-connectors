package com.wordnik.client.api;

import com.wordnik.client.ApiException;
import com.wordnik.client.ApiInvoker;
import com.wordnik.client.model.Trade;
import com.wordnik.client.model.TradeBin;
import java.util.*;
import java.io.File;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.entity.mime.*;
import org.apache.http.entity.mime.content.*;
import org.apache.http.entity.ContentType;

import android.webkit.MimeTypeMap;

public class TradeApi {
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
  public List<Trade> get (String symbol, Object filter, List<String> columns, Double start, Boolean reverse, Date startTime, Date endTime, Double count) throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/trade".replaceAll("\\{format\\}","json");

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
        return (List<Trade>) ApiInvoker.deserialize(response, "List", Trade.class);
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
  public List<TradeBin> getBucketed (String symbol, Object filter, List<String> columns, Double start, Boolean reverse, Date startTime, Date endTime, String binSize, Double count) throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/trade/bucketed".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(binSize)))
      queryParams.put("binSize", String.valueOf(binSize));
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
        return (List<TradeBin>) ApiInvoker.deserialize(response, "List", TradeBin.class);
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
  public List<Trade> getByDate (String symbol, Date startTime, Date endTime) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(startTime == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/trade/byDate".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(symbol)))
      queryParams.put("symbol", String.valueOf(symbol));
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
        return (List<Trade>) ApiInvoker.deserialize(response, "List", Trade.class);
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
  public List<Trade> getRecent (String symbol, Double count) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(count == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/trade/recent".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(symbol)))
      queryParams.put("symbol", String.valueOf(symbol));
    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
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
        return (List<Trade>) ApiInvoker.deserialize(response, "List", Trade.class);
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

