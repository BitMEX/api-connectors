package com.wordnik.client.api;





import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.wordnik.client.common.ApiUtils
//-------------

import com.wordnik.client.model.Error
import com.wordnik.client.model.Trade
import com.wordnik.client.model.TradeBin
import java.util.*;

@Mixin(ApiUtils)
class TradeApi {
    String basePath = "https://www.bitmex.com/api/v1"
    String versionPath = "/api/v1"


  def getBucketed (String symbol,Date startTime,Date endTime,Double count,Boolean useMillisecondTime,String binSize,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/trade/bucketed"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(symbol == null ) {
       throw new RuntimeException("missing required params")
    }
    if(!"null".equals(String.valueOf(symbol)))
      queryParams.put("symbol", String.valueOf(symbol))
    if(!"null".equals(String.valueOf(binSize)))
      queryParams.put("binSize", String.valueOf(binSize))
    if(!"null".equals(String.valueOf(startTime)))
      queryParams.put("startTime", String.valueOf(startTime))
    if(!"null".equals(String.valueOf(endTime)))
      queryParams.put("endTime", String.valueOf(endTime))
    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count))
    if(!"null".equals(String.valueOf(useMillisecondTime)))
      queryParams.put("useMillisecondTime", String.valueOf(useMillisecondTime))
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "List",
                    TradeBin.class )

  }
  def getByDate (String symbol,Date startTime,Date endTime,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/trade/byDate"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(startTime == null ) {
       throw new RuntimeException("missing required params")
    }
    if(!"null".equals(String.valueOf(symbol)))
      queryParams.put("symbol", String.valueOf(symbol))
    if(!"null".equals(String.valueOf(startTime)))
      queryParams.put("startTime", String.valueOf(startTime))
    if(!"null".equals(String.valueOf(endTime)))
      queryParams.put("endTime", String.valueOf(endTime))
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "List",
                    Trade.class )

  }
  def getRecent (String symbol,Double count,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/trade/recent"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(count == null ) {
       throw new RuntimeException("missing required params")
    }
    if(!"null".equals(String.valueOf(symbol)))
      queryParams.put("symbol", String.valueOf(symbol))
    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count))
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "List",
                    Trade.class )

  }
  }

