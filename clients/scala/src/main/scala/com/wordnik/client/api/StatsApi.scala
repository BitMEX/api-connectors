package com.wordnik.client.api

import com.wordnik.client.model.StatsHistory
import com.wordnik.client.model.Stats
import com.wordnik.client.common.ApiInvoker
import com.wordnik.client.common.ApiException

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class StatsApi {
  var basePath: String = "https://www.bitmex.com/api/v1"
  var apiInvoker = ApiInvoker
  
  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  def find () : Option[List[Stats]]= {
    // create path and map variables
    val path = "/stats".replaceAll("\\{format\\}","json")

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "Array", classOf[Stats]).asInstanceOf[List[Stats]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  def history () : Option[List[StatsHistory]]= {
    // create path and map variables
    val path = "/stats/history".replaceAll("\\{format\\}","json")

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "Array", classOf[StatsHistory]).asInstanceOf[List[StatsHistory]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  }

