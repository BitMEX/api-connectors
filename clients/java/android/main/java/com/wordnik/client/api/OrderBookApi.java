package com.wordnik.client.api;

import com.wordnik.client.ApiException;
import com.wordnik.client.ApiInvoker;
import com.wordnik.client.model.OrderBook;
import java.util.*;
import java.io.File;

public class OrderBookApi {
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

  public List<orderBook> orderBook_getOrderBook (symbol symbol) throws ApiException {
    // verify required params are set
    if(symbol == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/orderBook".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(symbol)))
      queryParams.put("symbol", String.valueOf(symbol));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<orderBook>) ApiInvoker.deserialize(response, "List", orderBook.class);
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

