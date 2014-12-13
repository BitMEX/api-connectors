package com.wordnik.client.api;





import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.wordnik.client.common.ApiUtils
//-------------

import com.wordnik.client.model.Error
import com.wordnik.client.model.ApiKey
import java.util.*;

@Mixin(ApiUtils)
class ApiKeyApi {
    String basePath = "https://www.bitmex.com/api/v1"
    String versionPath = "/api/v1"


  def createKey (String name,String cidr,Boolean enabled,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/apiKey"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ApiKey.class )

  }
  def getKeys (Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/apiKey"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "List",
                    ApiKey.class )

  }
  def remove (String accessKey,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/apiKey"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    Boolean.class )

  }
  def disable (String accessKey,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/apiKey/disable"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ApiKey.class )

  }
  def enable (String accessKey,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/apiKey/enable"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ApiKey.class )

  }
  }

