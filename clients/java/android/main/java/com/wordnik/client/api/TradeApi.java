package com.wordnik.client.api;

import com.wordnik.client.ApiException;
import com.wordnik.client.ApiInvoker;
import com.wordnik.client.model.TradeBin;
import com.wordnik.client.model.Trade;
import com.wordnik.client.model.Any;
import java.util.*;
import java.io.File;

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

  public List<tradeBin> trade_getBucketed (String symbol, Date startTime, Date endTime, Double count, Boolean useMillisecondTime, String binSize) throws ApiException {
    // verify required params are set
    if(symbol == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/trade/getBucketed".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(symbol)))
      queryParams.put("symbol", String.valueOf(symbol));
    if(!"null".equals(String.valueOf(binSize)))
      queryParams.put("binSize", String.valueOf(binSize));
    if(!"null".equals(String.valueOf(startTime)))
      queryParams.put("startTime", String.valueOf(startTime));
    if(!"null".equals(String.valueOf(endTime)))
      queryParams.put("endTime", String.valueOf(endTime));
    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
    if(!"null".equals(String.valueOf(useMillisecondTime)))
      queryParams.put("useMillisecondTime", String.valueOf(useMillisecondTime));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<tradeBin>) ApiInvoker.deserialize(response, "List", tradeBin.class);
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
  public List<trade> trade_getByDate (String symbol, Date starttime, Date endtime) throws ApiException {
    // verify required params are set
    if(symbol == null || starttime == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/trade/getByDate".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(symbol)))
      queryParams.put("symbol", String.valueOf(symbol));
    if(!"null".equals(String.valueOf(starttime)))
      queryParams.put("starttime", String.valueOf(starttime));
    if(!"null".equals(String.valueOf(endtime)))
      queryParams.put("endtime", String.valueOf(endtime));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<trade>) ApiInvoker.deserialize(response, "List", trade.class);
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
  public List<any> trade_getRecent (String symbol, Double count) throws ApiException {
    // verify required params are set
    if(symbol == null || count == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/trade/getRecent".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(symbol)))
      queryParams.put("symbol", String.valueOf(symbol));
    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<any>) ApiInvoker.deserialize(response, "List", any.class);
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

