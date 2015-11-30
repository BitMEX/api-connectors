package com.wordnik.client.api

import com.wordnik.client.model.Chat
import com.wordnik.client.model.Error
import java.math.BigDecimal
import com.wordnik.client.model.ConnectedUsers

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class ChatApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "ChatApi"
  override protected val applicationName: Option[String] = Some("Chat")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val chat.getOperation = (apiOperation[List[Chat]]("chat.get")
      summary "Get chat messages."
      parameters(queryParam[BigDecimal]("count").description("").optional.defaultValue(100),
        queryParam[BigDecimal]("start").description("").optional.defaultValue(0),
        queryParam[Boolean]("reverse").description("").optional.defaultValue(true))
  )

  get("/chat",operation(chat.getOperation)) {
    
    
    
        
      
      val count = params.getAs[BigDecimal]("count")
            

    
    println("count: " + count)
  
    
    
        
      
      val start = params.getAs[BigDecimal]("start")
            

    
    println("start: " + start)
  
    
    
        
      
      val reverse = params.getAs[Boolean]("reverse")
            

    
    println("reverse: " + reverse)
  
  }

  

  val chat.sendOperation = (apiOperation[Chat]("chat.send")
      summary "Send a chat message."
      parameters(formParam[String]("message").description(""))
  )

  post("/chat",operation(chat.sendOperation)) {
    
    
    
                
      val message = params.getAs[String]("message")
    

    
    println("message: " + message)
  
  }

  

  val chat.getConnectedOperation = (apiOperation[ConnectedUsers]("chat.getConnected")
      summary "Get connected users."
      parameters()
  )

  get("/chat/connected",operation(chat.getConnectedOperation)) {
    
  }

}