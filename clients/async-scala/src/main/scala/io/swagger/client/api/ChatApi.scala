package io.swagger.client.api

import io.swagger.client.model.Number
import io.swagger.client.model.Chat
import io.swagger.client.model.Error
import io.swagger.client.model.ConnectedUsers
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class ChatApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def chat.get(count: Option[Number] = Some(100),
      start: Option[Number] = Some(0),
      reverse: Option[Boolean] = Some(true)
      )(implicit reader: ClientResponseReader[List[Chat]]): Future[List[Chat]] = {
    // create path and map variables
    val path = (addFmt("/chat"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(count != null) count.foreach { v => queryParams += "count" -> v.toString }if(start != null) start.foreach { v => queryParams += "start" -> v.toString }if(reverse != null) reverse.foreach { v => queryParams += "reverse" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def chat.new(message: String)(implicit reader: ClientResponseReader[Chat]): Future[Chat] = {
    // create path and map variables
    val path = (addFmt("/chat"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def chat.getConnected()(implicit reader: ClientResponseReader[ConnectedUsers]): Future[ConnectedUsers] = {
    // create path and map variables
    val path = (addFmt("/chat/connected"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}
