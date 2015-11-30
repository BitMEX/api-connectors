package com.wordnik.client.api

import com.wordnik.client.model.Announcement
import com.wordnik.client.model.Error

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class AnnouncementApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "AnnouncementApi"
  override protected val applicationName: Option[String] = Some("Announcement")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val announcement.getOperation = (apiOperation[List[Announcement]]("announcement.get")
      summary "Get site announcements."
      parameters(queryParam[String]("columns").description("").optional)
  )

  get("/announcement",operation(announcement.getOperation)) {
    
    
    
        
      
      val columns = params.getAs[String]("columns")
            

    
    println("columns: " + columns)
  
  }

  

  val announcement.getUrgentOperation = (apiOperation[List[Announcement]]("announcement.getUrgent")
      summary "Get urgent (banner) announcements."
      parameters()
  )

  get("/announcement/urgent",operation(announcement.getUrgentOperation)) {
    
  }

}