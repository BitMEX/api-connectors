package io.swagger.client.api

import io.swagger.client.model.Error
import io.swagger.client.model.Inline_response_200_1
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class SchemaApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def schema.get(model: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200_1]): Future[Inline_response_200_1] = {
    // create path and map variables
    val path = (addFmt("/schema"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(model != null) model.foreach { v => queryParams += "model" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def schema.websocketHelp()(implicit reader: ClientResponseReader[Inline_response_200_1]): Future[Inline_response_200_1] = {
    // create path and map variables
    val path = (addFmt("/schema/websocketHelp"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
