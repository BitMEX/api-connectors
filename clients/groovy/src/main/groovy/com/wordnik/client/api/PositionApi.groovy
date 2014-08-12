package com.wordnik.client.api;





import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.wordnik.client.common.ApiUtils
//-------------

import com.wordnik.client.model.Position
import java.util.*;

@Mixin(ApiUtils)
class PositionApi {
    String basePath = "https://www.bitmex.com/api/v1"
    String versionPath = "/api/v1"


  def position_find (Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/position"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "List",
                    position.class )

  }
  }

