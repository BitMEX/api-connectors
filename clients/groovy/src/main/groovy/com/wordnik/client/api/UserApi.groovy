package com.wordnik.client.api;





import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.wordnik.client.common.ApiUtils
//-------------

import com.wordnik.client.model.Object
import com.wordnik.client.model.User
import java.util.*;

@Mixin(ApiUtils)
class UserApi {
    String basePath = "https://www.bitmex.com/api/v1"
    String versionPath = "/api/v1"


  def user_login (Object body,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/login"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(body == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Object.class )

  }
  def user_logout (Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/logout"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

  }
  def user_create (user body,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    user.class )

  }
  def user_getMe (Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    user.class )

  }
  def user_updateMe (String firstname,String lastname,String phone,String oldPassword,String newPassword,String newPasswordConfirm,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    user.class )

  }
  def user_savePreferences (Object prefs,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/savePrefs"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(prefs == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    user.class )

  }
  def user_verifyPhone (Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/requestSMS"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Boolean.class )

  }
  def user_confirmPhone (String token,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/confirmPhone"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(token == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    user.class )

  }
  }

