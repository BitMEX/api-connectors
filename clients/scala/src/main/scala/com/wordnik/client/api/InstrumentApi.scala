package com.wordnik.client.api

import com.wordnik.client.model.Instrument
import com.wordnik.client.common.ApiInvoker
import com.wordnik.client.common.ApiException

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class InstrumentApi {
  var basePath: String = "https://www.bitmex.com/api/v1"
  var apiInvoker = ApiInvoker
  
  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  def instrument_find (filter: Any) : Option[List[instrument]]= {
    // create path and map variables
    val path = "/instrument".replaceAll("\\{format\\}","json")

    val contentType = {
      "application/json"}

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]

    if(String.valueOf(filter) != "null") queryParams += "filter" -> filter.toString
    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, None, headerParams.toMap, contentType) match {
        case s: String =>
          Some(ApiInvoker.deserialize(s, "Array", classOf[instrument]).asInstanceOf[List[instrument]])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  }

