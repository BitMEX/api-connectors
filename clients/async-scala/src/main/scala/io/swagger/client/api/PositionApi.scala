package io.swagger.client.api

import io.swagger.client.model.Number
import io.swagger.client.model.Position
import io.swagger.client.model.Error
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class PositionApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def position.get(filter: Option[String] = None,
      columns: Option[String] = None,
      count: Option[Number] = None
      )(implicit reader: ClientResponseReader[List[Position]]): Future[List[Position]] = {
    // create path and map variables
    val path = (addFmt("/position"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(filter != null) filter.foreach { v => queryParams += "filter" -> v.toString }if(columns != null) columns.foreach { v => queryParams += "columns" -> v.toString }if(count != null) count.foreach { v => queryParams += "count" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def position.isolateMargin(symbol: String,
      enabled: Option[Boolean] = Some(true)
      )(implicit reader: ClientResponseReader[Position]): Future[Position] = {
    // create path and map variables
    val path = (addFmt("/position/isolate"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def position.updateLeverage(symbol: String,
      leverage: Double)(implicit reader: ClientResponseReader[Position]): Future[Position] = {
    // create path and map variables
    val path = (addFmt("/position/leverage"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def position.transferIsolatedMargin(symbol: String,
      amount: Number)(implicit reader: ClientResponseReader[Position]): Future[Position] = {
    // create path and map variables
    val path = (addFmt("/position/transferMargin"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
