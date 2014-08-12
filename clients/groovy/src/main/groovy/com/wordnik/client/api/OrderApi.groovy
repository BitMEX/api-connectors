package com.wordnik.client.api;





import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.wordnik.client.common.ApiUtils
//-------------

import com.wordnik.client.model.Order
import java.util.*;

@Mixin(ApiUtils)
class OrderApi {
    String basePath = "https://www.bitmex.com/api/v1"
    String versionPath = "/api/v1"


  def order_newOrder (String symbol,Double quantity,Double price,Boolean ioc,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/order/new"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(symbol == null || quantity == null || price == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    order.class )

  }
  def order_cancelOrder (String orderID,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/order/cancel"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(orderID == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    order.class )

  }
  def order_myOrders (Object filter,array<String> columns,Double count,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/order/myOrders"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    if(!"null".equals(String.valueOf(filter)))
      queryParams.put("filter", String.valueOf(filter))
    if(!"null".equals(String.valueOf(columns)))
      queryParams.put("columns", String.valueOf(columns))
    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count))
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "List",
                    order.class )

  }
  def order_myOpenOrders (Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/order/myOpenOrders"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "List",
                    order.class )

  }
  }

