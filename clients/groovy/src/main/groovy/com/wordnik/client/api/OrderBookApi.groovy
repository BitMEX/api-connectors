package com.wordnik.client.api;





import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.wordnik.client.common.ApiUtils
//-------------

import com.wordnik.client.model.OrderBook
import java.util.*;

@Mixin(ApiUtils)
class OrderBookApi {
    String basePath = "https://www.bitmex.com/api/v1"
    String versionPath = "/api/v1"


  def getOrderBook (String symbol,Double depth,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/orderBook"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(symbol == null ) {
       throw new RuntimeException("missing required params")
    }
    if(!"null".equals(String.valueOf(symbol)))
      queryParams.put("symbol", String.valueOf(symbol))
    if(!"null".equals(String.valueOf(depth)))
      queryParams.put("depth", String.valueOf(depth))
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "List",
                    OrderBook.class )

  }
  }

