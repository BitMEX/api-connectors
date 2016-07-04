package io.swagger.client.api

import io.swagger.client.model.Number
import io.swagger.client.model.Funding
import io.swagger.client.model.Error
import java.util.Date
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class FundingApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def funding.get(symbol: Option[String] = None,
      filter: Option[String] = None,
      columns: Option[String] = None,
      count: Option[Number] = Some(100),
      start: Option[Number] = Some(0),
      reverse: Option[Boolean] = Some(false),
      startTime: Option[Date] = None,
      endTime: Option[Date] = None
      )(implicit reader: ClientResponseReader[List[Funding]]): Future[List[Funding]] = {
    // create path and map variables
    val path = (addFmt("/funding"))

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


}
