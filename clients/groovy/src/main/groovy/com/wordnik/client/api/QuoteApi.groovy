package com.wordnik.client.api;





import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.wordnik.client.common.ApiUtils
//-------------

import com.wordnik.client.model.Error
import com.wordnik.client.model.Quote
import java.util.*;

@Mixin(ApiUtils)
class QuoteApi {
    String basePath = "https://www.bitmex.com/api/v1"
    String versionPath = "/api/v1"


  def getBucketed (String symbol,Date startTime,Date endTime,Double count,String binSize,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/quote/bucketed"


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
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "List",
                    Quote.class )

  }
  }

