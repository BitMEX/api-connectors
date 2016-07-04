package io.swagger.client.api

import io.swagger.client.model.ApiKey
import io.swagger.client.model.Error
import io.swagger.client.model.Inline_response_200
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class ApiKeyApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def apiKey.get(reverse: Option[Boolean] = Some(false)
      )(implicit reader: ClientResponseReader[List[ApiKey]]): Future[List[ApiKey]] = {
    // create path and map variables
    val path = (addFmt("/apiKey"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(reverse != null) reverse.foreach { v => queryParams += "reverse" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def apiKey.new(name: Option[String] = None,
      cidr: Option[String] = None,
      permissions: Option[String] = None,
      enabled: Option[Boolean] = Some(false),
      token: Option[String] = None
      )(implicit reader: ClientResponseReader[ApiKey]): Future[ApiKey] = {
    // create path and map variables
    val path = (addFmt("/apiKey"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def apiKey.remove(apiKeyID: String)(implicit reader: ClientResponseReader[Inline_response_200]): Future[Inline_response_200] = {
    // create path and map variables
    val path = (addFmt("/apiKey"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def apiKey.disable(apiKeyID: String)(implicit reader: ClientResponseReader[ApiKey]): Future[ApiKey] = {
    // create path and map variables
    val path = (addFmt("/apiKey/disable"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def apiKey.enable(apiKeyID: String)(implicit reader: ClientResponseReader[ApiKey]): Future[ApiKey] = {
    // create path and map variables
    val path = (addFmt("/apiKey/enable"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
