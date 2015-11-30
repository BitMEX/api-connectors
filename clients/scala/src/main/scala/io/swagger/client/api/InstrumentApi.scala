package io.swagger.client.api

import io.swagger.client.model.Number
import io.swagger.client.model.Instrument
import io.swagger.client.model.Error
import java.util.Date
import io.swagger.client.model.InstrumentInterval
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class InstrumentApi(val defBasePath: String = "https://localhost/api/v1",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  
  /**
   * Get instruments.
   * This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use the endpoint /instrument/active to return active instruments, or use a filter like {\&quot;state\&quot;: \&quot;Open\&quot;}.
   * @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.
   * @param filter Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.
   * @param columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
   * @param count Number of results to fetch.
   * @param start Starting point for results.
   * @param reverse If true, will sort results newest first.
   * @param startTime Starting date filter for results.
   * @param endTime Ending date filter for results.
   * @return List[Instrument]
   */
  def instrumentGet (symbol: String, filter: String, columns: String, count: Number /* = 100 */, start: Number /* = 0 */, reverse: Boolean /* = false */, startTime: Date, endTime: Date) : Option[List[Instrument]] = {
    // create path and map variables
    val path = "/instrument".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(symbol) != "null") queryParams += "symbol" -> symbol.toString
    if(String.valueOf(filter) != "null") queryParams += "filter" -> filter.toString
    if(String.valueOf(columns) != "null") queryParams += "columns" -> columns.toString
    if(String.valueOf(count) != "null") queryParams += "count" -> count.toString
    if(String.valueOf(start) != "null") queryParams += "start" -> start.toString
    if(String.valueOf(reverse) != "null") queryParams += "reverse" -> reverse.toString
    if(String.valueOf(startTime) != "null") queryParams += "startTime" -> startTime.toString
    if(String.valueOf(endTime) != "null") queryParams += "endTime" -> endTime.toString
    
    
    

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
           Some(ApiInvoker.deserialize(s, "array", classOf[Instrument]).asInstanceOf[List[Instrument]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Get all active instruments and instruments that have expired in &lt;24hrs.
   * 
   * @return List[Instrument]
   */
  def instrumentGetActive () : Option[List[Instrument]] = {
    // create path and map variables
    val path = "/instrument/active".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

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
           Some(ApiInvoker.deserialize(s, "array", classOf[Instrument]).asInstanceOf[List[Instrument]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.
   * 
   * @return List[Instrument]
   */
  def instrumentGetActiveAndIndices () : Option[List[Instrument]] = {
    // create path and map variables
    val path = "/instrument/activeAndIndices".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

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
           Some(ApiInvoker.deserialize(s, "array", classOf[Instrument]).asInstanceOf[List[Instrument]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Return all active contract series and interval pairs.
   * This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as `[\&quot;BVOL:daily\&quot;, \&quot;BVOL:weekly\&quot;, \&quot;XBU:daily\&quot;, \&quot;XBU:monthly\&quot;, ...]`. These identifiers are usable in any query&#39;s \&quot;symbol\&quot; param. The second array is the current resolution of these intervals. Results are mapped at the same index.
   * @return InstrumentInterval
   */
  def instrumentGetActiveIntervals () : Option[InstrumentInterval] = {
    // create path and map variables
    val path = "/instrument/activeIntervals".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

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
           Some(ApiInvoker.deserialize(s, "", classOf[InstrumentInterval]).asInstanceOf[InstrumentInterval])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Get all price indices.
   * 
   * @return List[Instrument]
   */
  def instrumentGetIndices () : Option[List[Instrument]] = {
    // create path and map variables
    val path = "/instrument/indices".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

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
           Some(ApiInvoker.deserialize(s, "array", classOf[Instrument]).asInstanceOf[List[Instrument]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
}
