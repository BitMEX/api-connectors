package io.swagger.client.api

import io.swagger.client.model.Number
import io.swagger.client.model.OrderBook
import io.swagger.client.model.Error
import io.swagger.client.model.OrderBookL2
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class OrderBookApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def orderBook.get(symbol: String,
      depth: Option[Number] = Some(25)
      )(implicit reader: ClientResponseReader[List[OrderBook]]): Future[List[OrderBook]] = {
    // create path and map variables
    val path = (addFmt("/orderBook"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (symbol != null) queryParams += "symbol" -> symbol.toString

    if (depth != null) depth.foreach { v => queryParams += "depth" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def orderBook.getL2(symbol: String,
      depth: Option[Number] = Some(25)
      )(implicit reader: ClientResponseReader[List[OrderBookL2]]): Future[List[OrderBookL2]] = {
    // create path and map variables
    val path = (addFmt("/orderBook/L2"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (symbol != null) queryParams += "symbol" -> symbol.toString

    if (depth != null) depth.foreach { v => queryParams += "depth" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
