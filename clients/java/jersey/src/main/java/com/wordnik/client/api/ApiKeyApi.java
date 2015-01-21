package com.wordnik.client.api;

import com.wordnik.client.common.ApiException;
import com.wordnik.client.common.ApiInvoker;

import com.wordnik.client.model.ApiKey;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class ApiKeyApi {
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
  public ApiKey createKey (String name, String cidr, Boolean enabled) throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/apiKey".replaceAll("\\{format\\}","json");

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
      mp.field("name", name, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("cidr", cidr, MediaType.MULTIPART_FORM_DATA_TYPE);
      hasFields = true;
      mp.field("enabled", enabled, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("name", String.valueOf(name));
      formParams.put("cidr", String.valueOf(cidr));
      formParams.put("enabled", String.valueOf(enabled));
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ApiKey) ApiInvoker.deserialize(response, "", ApiKey.class);
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
  public List<ApiKey> getKeys () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/apiKey".replaceAll("\\{format\\}","json");

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
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<ApiKey>) ApiInvoker.deserialize(response, "List", ApiKey.class);
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
  public Boolean remove (String apiKeyID) throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/apiKey".replaceAll("\\{format\\}","json");

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
      mp.field("apiKeyID", apiKeyID, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("apiKeyID", String.valueOf(apiKeyID));
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Boolean) ApiInvoker.deserialize(response, "", Boolean.class);
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
  public ApiKey disable (String apiKeyID) throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/apiKey/disable".replaceAll("\\{format\\}","json");

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
      mp.field("apiKeyID", apiKeyID, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("apiKeyID", String.valueOf(apiKeyID));
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ApiKey) ApiInvoker.deserialize(response, "", ApiKey.class);
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
  public ApiKey enable (String apiKeyID) throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/apiKey/enable".replaceAll("\\{format\\}","json");

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
      mp.field("apiKeyID", apiKeyID, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("apiKeyID", String.valueOf(apiKeyID));
      }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (ApiKey) ApiInvoker.deserialize(response, "", ApiKey.class);
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

