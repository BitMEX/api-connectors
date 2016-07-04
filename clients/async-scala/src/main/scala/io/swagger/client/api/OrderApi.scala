package io.swagger.client.api

import io.swagger.client.model.Order
import io.swagger.client.model.Number
import io.swagger.client.model.Error
import io.swagger.client.model.Any
import java.util.Date
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class OrderApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def order.amend(orderID: Option[String] = None,
      clOrdID: Option[String] = None,
      simpleOrderQty: Option[Double] = None,
      orderQty: Option[Number] = None,
      simpleLeavesQty: Option[Double] = None,
      leavesQty: Option[Number] = None,
      price: Option[Double] = None,
      stopPx: Option[Double] = None,
      pegOffsetValue: Option[Double] = None,
      text: Option[String] = None
      )(implicit reader: ClientResponseReader[Order]): Future[Order] = {
    // create path and map variables
    val path = (addFmt("/order"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def order.amendBulk(orders: Option[String] = None
      )(implicit reader: ClientResponseReader[List[Order]]): Future[List[Order]] = {
    // create path and map variables
    val path = (addFmt("/order/bulk"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def order.cancel(orderID: Option[String] = None,
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
      )(implicit reader: ClientResponseReader[Any]): Future[Any] = {
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

  def order.cancelAllAfter(timeout: Double)(implicit reader: ClientResponseReader[Any]): Future[Any] = {
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

    if (symbol != null) symbol.foreach { v => queryParams += "symbol" -> v.toString }

    if (filter != null) filter.foreach { v => queryParams += "filter" -> v.toString }

    if (columns != null) columns.foreach { v => queryParams += "columns" -> v.toString }

    if (count != null) count.foreach { v => queryParams += "count" -> v.toString }

    if (start != null) start.foreach { v => queryParams += "start" -> v.toString }

    if (reverse != null) reverse.foreach { v => queryParams += "reverse" -> v.toString }

    if (startTime != null) startTime.foreach { v => queryParams += "startTime" -> v.toString }

    if (endTime != null) endTime.foreach { v => queryParams += "endTime" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def order.new(symbol: String,
      side: Option[String] = None,
      simpleOrderQty: Option[Double] = None,
      quantity: Option[Number] = None,
      orderQty: Option[Number] = None,
      price: Option[Double] = None,
      displayQty: Option[Number] = None,
      stopPrice: Option[Double] = None,
      stopPx: Option[Double] = None,
      clOrdID: Option[String] = None,
      clOrdLinkID: Option[String] = None,
      pegOffsetValue: Option[Double] = None,
      pegPriceType: Option[String] = None,
      _type: Option[String] = None,
      ordType: Option[String] = Some(Limit),
      timeInForce: Option[String] = None,
      execInst: Option[String] = None,
      contingencyType: Option[String] = None,
      text: Option[String] = None
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

  def order.newBulk(orders: Option[String] = None
      )(implicit reader: ClientResponseReader[List[Order]]): Future[List[Order]] = {
    // create path and map variables
    val path = (addFmt("/order/bulk"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
