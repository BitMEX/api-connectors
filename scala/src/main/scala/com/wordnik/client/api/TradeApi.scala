package com.wordnik.client.api

import com.wordnik.client.model.TradeBin
import com.wordnik.client.model.Trade
import com.wordnik.client.model.Any
import com.wordnik.client.common.ApiInvoker
import com.wordnik.client.common.ApiException

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class TradeApi {
  var basePath: String = "https://www.bitmex.com/api/v1"
  var apiInvoker = ApiInvoker
  
  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  def trade_getBucketed (symbol: String, startTime: Date, endTime: Date, count: Double, useMillisecondTime: Boolean, binSize: String= "30s") : Option[List[tradeBin]]= {
    // create path and map variables
    val path = "/trade/getBucketed".replaceAll("\\{format\\}","json")

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
    if(String.valueOf(binSize) != "null") queryParams += "binSize" -> binSize.toString
    if(String.valueOf(startTime) != "null") queryParams += "startTime" -> startTime.toString
    if(String.valueOf(endTime) != "null") queryParams += "endTime" -> endTime.toString
    if(String.valueOf(count) != "null") queryParams += "count" -> count.toString
    if(String.valueOf(useMillisecondTime) != "null") queryParams += "useMillisecondTime" -> useMillisecondTime.toString
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "Array", classOf[tradeBin]).asInstanceOf[List[tradeBin]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def trade_getByDate (symbol: String, starttime: Date, endtime: Date) : Option[List[trade]]= {
    // create path and map variables
    val path = "/trade/getByDate".replaceAll("\\{format\\}","json")

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(symbol, starttime).filter(_ != null)).size match {
       case 2 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    if(String.valueOf(symbol) != "null") queryParams += "symbol" -> symbol.toString
    if(String.valueOf(starttime) != "null") queryParams += "starttime" -> starttime.toString
    if(String.valueOf(endtime) != "null") queryParams += "endtime" -> endtime.toString
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "Array", classOf[trade]).asInstanceOf[List[trade]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def trade_getRecent (symbol: String, count: Double) : Option[List[any]]= {
    // create path and map variables
    val path = "/trade/getRecent".replaceAll("\\{format\\}","json")

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    // verify required params are set
    (List(symbol, count).filter(_ != null)).size match {
       case 2 => // all required values set
       case _ => throw new Exception("missing required params")
    }
    if(String.valueOf(symbol) != "null") queryParams += "symbol" -> symbol.toString
    if(String.valueOf(count) != "null") queryParams += "count" -> count.toString
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "Array", classOf[any]).asInstanceOf[List[any]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  }

