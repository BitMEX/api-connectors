package io.swagger.client.api

import io.swagger.client.model.Number
import io.swagger.client.model.OrderBook
import io.swagger.client.model.Error
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class OrderBookApi(val defBasePath: String = "https://localhost/api/v1",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  
  /**
   * Get current orderbook.
   * 
   * @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
   * @param depth Orderbook depth.
   * @return List[OrderBook]
   */
  def orderBookGetOrderBook (symbol: String, depth: Number) : Option[List[OrderBook]] = {
    // create path and map variables
    val path = "/orderBook".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(symbol) != "null") queryParams += "symbol" -> symbol.toString
    if(String.valueOf(depth) != "null") queryParams += "depth" -> depth.toString
    
    
    

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
           Some(ApiInvoker.deserialize(s, "array", classOf[OrderBook]).asInstanceOf[List[OrderBook]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
}
