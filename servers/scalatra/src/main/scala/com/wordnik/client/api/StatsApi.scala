package com.wordnik.client.api

import com.wordnik.client.model.Stats
import com.wordnik.client.model.Error
import com.wordnik.client.model.StatsHistory

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class StatsApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "StatsApi"
  override protected val applicationName: Option[String] = Some("Stats")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val stats.findOperation = (apiOperation[List[Stats]]("stats.find")
      summary "Get exchange-wide and per-series turnover and volume statistics."
      parameters()
  )

  get("/stats",operation(stats.findOperation)) {
    
  }

  

  val stats.historyOperation = (apiOperation[List[StatsHistory]]("stats.history")
      summary "Get historical exchange-wide and per-series turnover and volume statistics."
      parameters()
  )

  get("/stats/history",operation(stats.historyOperation)) {
    
  }

}