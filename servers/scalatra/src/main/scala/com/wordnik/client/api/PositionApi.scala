package com.wordnik.client.api

import com.wordnik.client.model.Position
import com.wordnik.client.model.Error
import java.math.BigDecimal

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class PositionApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "PositionApi"
  override protected val applicationName: Option[String] = Some("Position")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val position.getOperation = (apiOperation[List[Position]]("position.get")
      summary "Get your positions."
      parameters(queryParam[String]("filter").description("").optional,
        queryParam[String]("columns").description("").optional,
        queryParam[BigDecimal]("count").description("").optional)
  )

  get("/position",operation(position.getOperation)) {
    
    
    
        
      
      val filter = params.getAs[String]("filter")
            

    
    println("filter: " + filter)
  
    
    
        
      
      val columns = params.getAs[String]("columns")
            

    
    println("columns: " + columns)
  
    
    
        
      
      val count = params.getAs[BigDecimal]("count")
            

    
    println("count: " + count)
  
  }

  

  val position.isolateMarginOperation = (apiOperation[Position]("position.isolateMargin")
      summary "Enable isolated margin or cross margin per-position."
      parameters(formParam[String]("symbol").description(""),
        formParam[Boolean]("enabled").description("").optional.defaultValue(true))
  )

  post("/position/isolate",operation(position.isolateMarginOperation)) {
    
    
    
                
      val symbol = params.getAs[String]("symbol")
    

    
    println("symbol: " + symbol)
  
    
    
                
      val enabled = params.getAs[Boolean]("enabled")
    

    
    println("enabled: " + enabled)
  
  }

  

  val position.updateLeverageOperation = (apiOperation[Position]("position.updateLeverage")
      summary "Choose leverage for a position."
      parameters(formParam[String]("symbol").description(""),
        formParam[Double]("leverage").description(""))
  )

  post("/position/leverage",operation(position.updateLeverageOperation)) {
    
    
    
                
      val symbol = params.getAs[String]("symbol")
    

    
    println("symbol: " + symbol)
  
    
    
                
      val leverage = params.getAs[Double]("leverage")
    

    
    println("leverage: " + leverage)
  
  }

  

  val position.transferIsolatedMarginOperation = (apiOperation[Position]("position.transferIsolatedMargin")
      summary "Transfer equity in or out of a position."
      parameters(formParam[String]("symbol").description(""),
        formParam[BigDecimal]("amount").description(""))
  )

  post("/position/transferMargin",operation(position.transferIsolatedMarginOperation)) {
    
    
    
                
      val symbol = params.getAs[String]("symbol")
    

    
    println("symbol: " + symbol)
  
    
    
                
      val amount = params.getAs[BigDecimal]("amount")
    

    
    println("amount: " + amount)
  
  }

}