package io.swagger.client.api

import io.swagger.client.model.Order
import io.swagger.client.model.Number
import io.swagger.client.model.Error
import java.util.Date
import io.swagger.client.model.Inline_response_200
import io.swagger.client.model.LiquidationOrder
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class OrderApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def order.getOrders(symbol: Option[String] = None,
      filter: Option[String] = None,
      columns: Option[String] = None,
      count: Option[Number] = Some(100),
      start: Option[Number] = Some(0),
      reverse: Option[Boolean] = Some(false),
      startTime: Option[Date] = None,
      endTime: Option[Date] = None
      )(implicit reader: ClientResponseReader[List[Order]]): Future[List[Order]] = {
    // create path and map variables
    val path = (addFmt("/order"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(symbol != null) symbol.foreach { v => queryParams += "symbol" -> v.toString }if(filter != null) filter.foreach { v => queryParams += "filter" -> v.toString }if(columns != null) columns.foreach { v => queryParams += "columns" -> v.toString }if(count != null) count.foreach { v => queryParams += "count" -> v.toString }if(start != null) start.foreach { v => queryParams += "start" -> v.toString }if(reverse != null) reverse.foreach { v => queryParams += "reverse" -> v.toString }if(startTime != null) startTime.foreach { v => queryParams += "startTime" -> v.toString }if(endTime != null) endTime.foreach { v => queryParams += "endTime" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def order.newOrder(symbol: String,
      quantity: Number,
      price: Double,
      timeInForce: Option[String] = Some(GTC),
      _type: Option[String] = Some(Limit),
      stopPrice: Option[Double] = None,
      clOrdID: Option[String] = None
      )(implicit reader: ClientResponseReader[Order]): Future[Order] = {
    // create path and map variables
    val path = (addFmt("/order"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def order.cancelOrder(orderID: Option[String] = None,
      clOrdID: Option[String] = None,
      text: Option[String] = None
      )(implicit reader: ClientResponseReader[List[Order]]): Future[List[Order]] = {
    // create path and map variables
    val path = (addFmt("/order"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def order.cancelAll(symbol: Option[String] = None,
      filter: Option[String] = None,
      text: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_200]): Future[Inline_response_200] = {
    // create path and map variables
    val path = (addFmt("/order/all"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def order.cancelAllAfter(timeout: Double)(implicit reader: ClientResponseReader[Inline_response_200]): Future[Inline_response_200] = {
    // create path and map variables
    val path = (addFmt("/order/cancelAllAfter"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def order.closePosition(symbol: String,
      price: Option[Double] = None
      )(implicit reader: ClientResponseReader[Order]): Future[Order] = {
    // create path and map variables
    val path = (addFmt("/order/closePosition"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def order.getCloseOutOrders(filter: Option[String] = None
      )(implicit reader: ClientResponseReader[List[LiquidationOrder]]): Future[List[LiquidationOrder]] = {
    // create path and map variables
    val path = (addFmt("/order/liquidations"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(filter != null) filter.foreach { v => queryParams += "filter" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
