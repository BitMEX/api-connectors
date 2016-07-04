package io.swagger.client.api

import io.swagger.client.model.Number
import io.swagger.client.model.Position
import io.swagger.client.model.Error
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class PositionApi(val defBasePath: String = "https://localhost/api/v1",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  
  /**
   * Get your positions.
   * See &lt;a href=\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
   * @param filter Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.
   * @param columns Which columns to fetch. For example, send [\&quot;columnName\&quot;].
   * @param count Number of rows to fetch.
   * @return List[Position]
   */
  def positionGet (filter: String, columns: String, count: Number) : Option[List[Position]] = {
    // create path and map variables
    val path = "/position".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(filter) != "null") queryParams += "filter" -> filter.toString
    if(String.valueOf(columns) != "null") queryParams += "columns" -> columns.toString
    if(String.valueOf(count) != "null") queryParams += "count" -> count.toString
    
    
    

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
           Some(ApiInvoker.deserialize(s, "array", classOf[Position]).asInstanceOf[List[Position]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Enable isolated margin or cross margin per-position.
   * On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.
   * @param symbol Position symbol to isolate.
   * @param enabled True for isolated margin, false for cross margin.
   * @return Position
   */
  def positionIsolateMargin (symbol: String, enabled: Boolean /* = true */) : Option[Position] = {
    // create path and map variables
    val path = "/position/isolate".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("symbol", symbol.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("enabled", enabled.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "symbol" -> symbol.toString()
      formParams += "enabled" -> enabled.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Position]).asInstanceOf[Position])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Choose leverage for a position.
   * On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.
   * @param symbol Symbol of position to adjust.
   * @param leverage Leverage value. Send a number between 0.01 and 100 to enable isolated margin with a fixed leverage. Send 0 to enable cross margin.
   * @return Position
   */
  def positionUpdateLeverage (symbol: String, leverage: Double) : Option[Position] = {
    // create path and map variables
    val path = "/position/leverage".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("symbol", symbol.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("leverage", leverage.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "symbol" -> symbol.toString()
      formParams += "leverage" -> leverage.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Position]).asInstanceOf[Position])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Transfer equity in or out of a position.
   * When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
   * @param symbol Symbol of position to isolate.
   * @param amount Amount to transfer, in Satoshis. May be negative.
   * @return Position
   */
  def positionTransferIsolatedMargin (symbol: String, amount: Number) : Option[Position] = {
    // create path and map variables
    val path = "/position/transferMargin".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("symbol", symbol.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("amount", amount.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "symbol" -> symbol.toString()
      formParams += "amount" -> amount.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Position]).asInstanceOf[Position])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
}
