package io.swagger.client.api

import io.swagger.client.model.Announcement
import io.swagger.client.model.Error
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class AnnouncementApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def announcement.get(columns: Option[String] = None
      )(implicit reader: ClientResponseReader[List[Announcement]]): Future[List[Announcement]] = {
    // create path and map variables
    val path = (addFmt("/announcement"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(columns != null) columns.foreach { v => queryParams += "columns" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def announcement.getUrgent()(implicit reader: ClientResponseReader[List[Announcement]]): Future[List[Announcement]] = {
    // create path and map variables
    val path = (addFmt("/announcement/urgent"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
