package com.wordnik.client.api

import com.wordnik.client.model.OrderBook
import com.wordnik.client.common.ApiInvoker
import com.wordnik.client.common.ApiException

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class OrderBookApi {
  var basePath: String = "https://www.bitmex.com/api/v1"
  var apiInvoker = ApiInvoker
  
  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  def getOrderBook (symbol: String, depth: Double= 25) : Option[List[OrderBook]]= {
    // create path and map variables
    val path = "/orderBook".replaceAll("\\{format\\}","json")

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(symbol).filter(_ != null)).size match {
       case 1 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    if(String.valueOf(symbol) != "null") queryParams += "symbol" -> symbol.toString
    if(String.valueOf(depth) != "null") queryParams += "depth" -> depth.toString
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "Array", classOf[OrderBook]).asInstanceOf[List[OrderBook]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  }

