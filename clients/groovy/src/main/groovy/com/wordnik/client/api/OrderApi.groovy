package com.wordnik.client.api;





import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.wordnik.client.common.ApiUtils
//-------------

import com.wordnik.client.model.Object
import com.wordnik.client.model.Order
import java.util.*;

@Mixin(ApiUtils)
class OrderApi {
    String basePath = "https://www.bitmex.com/api/v1"
    String versionPath = "/api/v1"


  def getOrders (String symbol,Object filter,List<String> columns,Double start,Boolean reverse,Date startTime,Date endTime,Double count,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/order"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    if(!"null".equals(String.valueOf(symbol)))
      queryParams.put("symbol", String.valueOf(symbol))
    if(!"null".equals(String.valueOf(filter)))
      queryParams.put("filter", String.valueOf(filter))
    if(!"null".equals(String.valueOf(columns)))
      queryParams.put("columns", String.valueOf(columns))
    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count))
    if(!"null".equals(String.valueOf(start)))
      queryParams.put("start", String.valueOf(start))
    if(!"null".equals(String.valueOf(reverse)))
      queryParams.put("reverse", String.valueOf(reverse))
    if(!"null".equals(String.valueOf(startTime)))
      queryParams.put("startTime", String.valueOf(startTime))
    if(!"null".equals(String.valueOf(endTime)))
      queryParams.put("endTime", String.valueOf(endTime))
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "List",
                    Order.class )

  }
  def newOrder (String symbol,Double quantity,Double price,Boolean ioc,String clOrdID,Closure onSuccess, Closure onFailure)  {
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
  def cancelAll (String symbol,String text,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/order/all"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    Object.class )

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

