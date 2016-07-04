package io.swagger.client.api

import io.swagger.client.model.Stats
import io.swagger.client.model.Error
import io.swagger.client.model.StatsHistory
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class StatsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def stats.get()(implicit reader: ClientResponseReader[List[Stats]]): Future[List[Stats]] = {
    // create path and map variables
    val path = (addFmt("/stats"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def stats.history()(implicit reader: ClientResponseReader[List[StatsHistory]]): Future[List[StatsHistory]] = {
    // create path and map variables
    val path = (addFmt("/stats/history"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
