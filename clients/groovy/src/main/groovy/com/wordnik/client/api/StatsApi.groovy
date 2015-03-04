package com.wordnik.client.api;





import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.wordnik.client.common.ApiUtils
//-------------

import com.wordnik.client.model.StatsHistory
import com.wordnik.client.model.Stats
import java.util.*;

@Mixin(ApiUtils)
class StatsApi {
    String basePath = "https://www.bitmex.com/api/v1"
    String versionPath = "/api/v1"


  def find (Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/stats"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "List",
                    Stats.class )

  }
  def history (Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/stats/history"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "List",
                    StatsHistory.class )

  }
  }

