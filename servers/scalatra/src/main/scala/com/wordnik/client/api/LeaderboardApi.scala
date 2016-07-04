package com.wordnik.client.api

import com.wordnik.client.model.Leaderboard

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class LeaderboardApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "LeaderboardApi"
  override protected val applicationName: Option[String] = Some("Leaderboard")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val leaderboard.getOperation = (apiOperation[List[Leaderboard]]("leaderboard.get")
      summary "Get current leaderboard."
      parameters(queryParam[String]("method").description("").optional.defaultValue(notional))
  )

  get("/leaderboard",operation(leaderboard.getOperation)) {
    
    
    
        
      
      val method = params.getAs[String]("method")
            

    
    println("method: " + method)
  
  }

}