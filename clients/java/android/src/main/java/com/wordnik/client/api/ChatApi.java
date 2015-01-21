package com.wordnik.client.api;

import com.wordnik.client.ApiException;
import com.wordnik.client.ApiInvoker;
import com.wordnik.client.model.Chat;
import java.util.*;
import java.io.File;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.entity.mime.*;
import org.apache.http.entity.mime.content.*;
import org.apache.http.entity.ContentType;

import android.webkit.MimeTypeMap;

public class ChatApi {
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
  public List<Chat> get (Double start, Boolean reverse, Double count) throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/chat".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
    if(!"null".equals(String.valueOf(start)))
      queryParams.put("start", String.valueOf(start));
    if(!"null".equals(String.valueOf(reverse)))
      queryParams.put("reverse", String.valueOf(reverse));
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
        return (List<Chat>) ApiInvoker.deserialize(response, "List", Chat.class);
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
  public Chat send (String message) throws ApiException {
    Object postBody = null;
    // verify required params are set
    if(message == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/chat".replaceAll("\\{format\\}","json");

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
      mp.add(new BasicNameValuePair("message", message));
      if(hasFields)
        postBody = mp;
    }
    else if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
      hasFields = true;
      builder.addTextBody("message", message.toString());
      if(hasFields)
        postBody = builder;
    }
    else {
      postBody = null;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, contentType);
      if(response != null){
        return (Chat) ApiInvoker.deserialize(response, "", Chat.class);
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

