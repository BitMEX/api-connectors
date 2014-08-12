package com.wordnik.client.api;





import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.wordnik.client.common.ApiUtils
//-------------

import com.wordnik.client.model.Leaderboard
import java.util.*;

@Mixin(ApiUtils)
class LeaderboardApi {
    String basePath = "https://www.bitmex.com/api/v1"
    String versionPath = "/api/v1"


  def leaderboard_getOrderBook (Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/leaderboard"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "List",
                    leaderboard.class )

  }
  }

