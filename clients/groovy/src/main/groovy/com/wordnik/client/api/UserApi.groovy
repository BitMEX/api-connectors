package com.wordnik.client.api;





import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.wordnik.client.common.ApiUtils
//-------------

import com.wordnik.client.model.User
import com.wordnik.client.model.Transaction
import com.wordnik.client.model.AccessToken
import com.wordnik.client.model.Any
import java.util.*;

@Mixin(ApiUtils)
class UserApi {
    String basePath = "https://www.bitmex.com/api/v1"
    String versionPath = "/api/v1"


  def getDepositAddress (String currency,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/depositAddress"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    if(!"null".equals(String.valueOf(currency)))
      queryParams.put("currency", String.valueOf(currency))
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )

  }
  def getWalletHistory (Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/walletHistory"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "List",
                    Transaction.class )

  }
  def requestWithdrawal (Double amount,String address,String currency,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/requestWithdrawal"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(amount == null || address == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Transaction.class )

  }
  def cancelWithdrawal (String token,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/cancelWithdrawal"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(token == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Transaction.class )

  }
  def confirmWithdrawal (String token,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/confirmWithdrawal"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(token == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Transaction.class )

  }
  def requestEnableTFA (String type,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/requestEnableTFA"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Boolean.class )

  }
  def confirmEnableTFA (String token,String type,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/confirmEnableTFA"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(token == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Boolean.class )

  }
  def sendVerificationEmail (String email,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/resendVerificationEmail"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(email == null ) {
       throw new RuntimeException("missing required params")
    }
    if(!"null".equals(String.valueOf(email)))
      queryParams.put("email", String.valueOf(email))
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Boolean.class )

  }
  def confirmEmail (String token,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/confirmEmail"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(token == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Boolean.class )

  }
  def requestPasswordReset (String email,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/requestPasswordReset"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(email == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Boolean.class )

  }
  def confirmPasswordReset (String email,String token,String newPassword,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/confirmPasswordReset"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(email == null || token == null || newPassword == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Boolean.class )

  }
  def newUser (String email,String password,String username,String firstname,String lastname,String acceptsTOS,String accountType,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(email == null || password == null || username == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    User.class )

  }
  def getMe (Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    User.class )

  }
  def updateMe (String firstname,String lastname,String oldPassword,String newPassword,String newPasswordConfirm,String accountType,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    User.class )

  }
  def login (String email,String password,String token,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/login"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(email == null || password == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    AccessToken.class )

  }
  def logout (Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/logout"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

  }
  def savePreferences (Object prefs,Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/preferences"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    // verify required params are set
    if(prefs == null ) {
       throw new RuntimeException("missing required params")
    }
    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    User.class )

  }
  def getCommission (Closure onSuccess, Closure onFailure)  {
    // create path and map variables
    String resourcePath = "/user/commission"


    // query params
    def queryParams = [:]
    def headerParams = [:]

    invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "List",
                    any.class )

  }
  }

