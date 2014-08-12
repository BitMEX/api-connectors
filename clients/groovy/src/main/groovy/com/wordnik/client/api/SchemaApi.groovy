package com.wordnik.client.api;





import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.wordnik.client.common.ApiUtils
//-------------

import com.wordnik.client.model.Object
import java.util.*;

@Mixin(ApiUtils)
class SchemaApi {
    String basePath = "https://www.bitmex.com/api/v1"
    String versionPath = "/api/v1"


  def schema_find (String model,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/schema"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    if(!"null".equals(String.valueOf(model)))
      queryParams.put("model", String.valueOf(model))
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Object.class )

  }
  }

