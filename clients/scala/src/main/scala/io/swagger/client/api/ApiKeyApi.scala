package io.swagger.client.api

import io.swagger.client.model.ApiKey
import io.swagger.client.model.Error
import io.swagger.client.model.Inline_response_200
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class ApiKeyApi(val defBasePath: String = "https://localhost/api/v1",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  
  /**
   * Get your API Keys.
   * 
   * @param reverse If true, will sort results newest first.
   * @return List[ApiKey]
   */
  def apiKeyGetKeys (reverse: Boolean /* = false */) : Option[List[ApiKey]] = {
    // create path and map variables
    val path = "/apiKey".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(reverse) != "null") queryParams += "reverse" -> reverse.toString
    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "array", classOf[ApiKey]).asInstanceOf[List[ApiKey]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Create a new API Key.
   * API Keys can also be created via &lt;a href=\&quot;https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py\&quot;&gt;this Python script&lt;/a&gt;. See the &lt;a href=\&quot;/app/apiKeys\&quot;&gt;API Key Documentation&lt;/a&gt; for more information on capabilities.
   * @param name Key name. This name is for reference only.
   * @param cidr CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href=\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt;
   * @param permissions Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;withdraw\&quot;].
   * @param enabled Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.
   * @param token OTP Token (YubiKey, Google Authenticator)
   * @return ApiKey
   */
  def apiKeyCreateKey (name: String, cidr: String, permissions: String, enabled: Boolean /* = false */, token: String) : Option[ApiKey] = {
    // create path and map variables
    val path = "/apiKey".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("name", name.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("cidr", cidr.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("permissions", permissions.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("enabled", enabled.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("token", token.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "name" -> name.toString()
      formParams += "cidr" -> cidr.toString()
      formParams += "permissions" -> permissions.toString()
      formParams += "enabled" -> enabled.toString()
      formParams += "token" -> token.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[ApiKey]).asInstanceOf[ApiKey])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Remove an API Key.
   * 
   * @param apiKeyID API Key ID (public component).
   * @return Inline_response_200
   */
  def apiKeyRemove (apiKeyID: String) : Option[Inline_response_200] = {
    // create path and map variables
    val path = "/apiKey".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("apiKeyID", apiKeyID.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "apiKeyID" -> apiKeyID.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Inline_response_200]).asInstanceOf[Inline_response_200])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Disable an API Key.
   * 
   * @param apiKeyID API Key ID (public component).
   * @return ApiKey
   */
  def apiKeyDisable (apiKeyID: String) : Option[ApiKey] = {
    // create path and map variables
    val path = "/apiKey/disable".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("apiKeyID", apiKeyID.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "apiKeyID" -> apiKeyID.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[ApiKey]).asInstanceOf[ApiKey])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Enable an API Key.
   * 
   * @param apiKeyID API Key ID (public component).
   * @return ApiKey
   */
  def apiKeyEnable (apiKeyID: String) : Option[ApiKey] = {
    // create path and map variables
    val path = "/apiKey/enable".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("apiKeyID", apiKeyID.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "apiKeyID" -> apiKeyID.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[ApiKey]).asInstanceOf[ApiKey])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
}
