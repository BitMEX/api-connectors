package io.swagger.client.api

import io.swagger.client.model.Leaderboard
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class LeaderboardApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def leaderboard.get(method: Option[String] = Some(notional)
      )(implicit reader: ClientResponseReader[List[Leaderboard]]): Future[List[Leaderboard]] = {
    // create path and map variables
    val path = (addFmt("/leaderboard"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(method != null) method.foreach { v => queryParams += "method" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
