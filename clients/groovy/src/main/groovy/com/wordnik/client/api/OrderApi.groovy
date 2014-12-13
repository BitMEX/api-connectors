package com.wordnik.client.api;





import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.wordnik.client.common.ApiUtils
//-------------

import com.wordnik.client.model.Error
import com.wordnik.client.model.Object
import com.wordnik.client.model.Order
import java.util.*;

@Mixin(ApiUtils)
class OrderApi {
    String basePath = "https://www.bitmex.com/api/v1"
    String versionPath = "/api/v1"


  def newOrder (String symbol,Double quantity,Double price,Boolean ioc,String clOrdID,Closure onSuccess, Closure onFailure)  {
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
                    Order.class )

  }
  def newOrder_OrderApi_0 (String symbol,Double quantity,Double price,Boolean ioc,String clOrdID,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/order"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(symbol == null || quantity == null || price == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Order.class )

  }
  def cancelOrder (String orderID,String clOrdID,String text,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/order"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "List",
                    Order.class )

  }
  def getOrders (Object filter,List<any> columns,Double count,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/order"


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
                    Order.class )

  }
  def cancelOrder_OrderApi_0 (String orderID,String clOrdID,String text,Closure onSuccess, Closure onFailure)  {
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
                    "POST", "List",
                    Order.class )

  }
  def getOrders_OrderApi_0 (Object filter,List<any> columns,Double count,Closure onSuccess, Closure onFailure)  {
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
                    Order.class )

  }
  def getOrders_OrderApi_1 (Object filter,List<any> columns,Double count,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/order/myOpenOrders"


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
                    Order.class )

  }
  def cancelAllAfter (Double timeout,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/order/cancelAllAfter"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(timeout == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Object.class )

  }
  }

