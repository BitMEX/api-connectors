package io.swagger.client.api

import io.swagger.client.model.Number
import io.swagger.client.model.OrderBook
import io.swagger.client.model.Error
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class OrderBookApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def orderBook.getOrderBook(symbol: String,
      depth: Option[Number] = None
      )(implicit reader: ClientResponseReader[List[OrderBook]]): Future[List[OrderBook]] = {
    // create path and map variables
    val path = (addFmt("/orderBook"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(symbol != null)   queryParams += "symbol" -> symbol.toStringif(depth != null) depth.foreach { v => queryParams += "depth" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
