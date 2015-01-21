package com.wordnik.client.api;





import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.wordnik.client.common.ApiUtils
//-------------

import com.wordnik.client.model.Chat
import java.util.*;

@Mixin(ApiUtils)
class ChatApi {
    String basePath = "https://www.bitmex.com/api/v1"
    String versionPath = "/api/v1"


  def get (Double start,Boolean reverse,Double count,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/chat"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    if(!"null".equals(String.valueOf(count)))
      queryParams.put("count", String.valueOf(count))
    if(!"null".equals(String.valueOf(start)))
      queryParams.put("start", String.valueOf(start))
    if(!"null".equals(String.valueOf(reverse)))
      queryParams.put("reverse", String.valueOf(reverse))
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "List",
                    Chat.class )

  }
  def send (String message,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/chat"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(message == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Chat.class )

  }
  }

