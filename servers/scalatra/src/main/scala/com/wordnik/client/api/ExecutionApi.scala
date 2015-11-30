package com.wordnik.client.api

import com.wordnik.client.model.Execution
import com.wordnik.client.model.Error
import java.math.BigDecimal
import java.util.Date

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class ExecutionApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "ExecutionApi"
  override protected val applicationName: Option[String] = Some("Execution")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val execution.getOperation = (apiOperation[List[Execution]]("execution.get")
      summary "Get all raw executions for your account."
      parameters(queryParam[String]("symbol").description("").optional,
        queryParam[String]("filter").description("").optional,
        queryParam[String]("columns").description("").optional,
        queryParam[BigDecimal]("count").description("").optional.defaultValue(100),
        queryParam[BigDecimal]("start").description("").optional.defaultValue(0),
        queryParam[Boolean]("reverse").description("").optional.defaultValue(false),
        queryParam[Date]("startTime").description("").optional,
        queryParam[Date]("endTime").description("").optional)
  )

  get("/execution",operation(execution.getOperation)) {
    
    
    
        
      
      val symbol = params.getAs[String]("symbol")
            

    
    println("symbol: " + symbol)
  
    
    
        
      
      val filter = params.getAs[String]("filter")
            

    
    println("filter: " + filter)
  
    
    
        
      
      val columns = params.getAs[String]("columns")
            

    
    println("columns: " + columns)
  
    
    
        
      
      val count = params.getAs[BigDecimal]("count")
            

    
    println("count: " + count)
  
    
    
        
      
      val start = params.getAs[BigDecimal]("start")
            

    
    println("start: " + start)
  
    
    
        
      
      val reverse = params.getAs[Boolean]("reverse")
            

    
    println("reverse: " + reverse)
  
    
    
        
      
      val startTime = params.getAs[Date]("startTime")
            

    
    println("startTime: " + startTime)
  
    
    
        
      
      val endTime = params.getAs[Date]("endTime")
            

    
    println("endTime: " + endTime)
  
  }

  

  val execution.getTradeHistoryOperation = (apiOperation[List[Execution]]("execution.getTradeHistory")
      summary "Get all balance-affecting executions. This includes each trade, insurance charge, and settlement."
      parameters(queryParam[String]("symbol").description("").optional,
        queryParam[String]("filter").description("").optional,
        queryParam[String]("columns").description("").optional,
        queryParam[BigDecimal]("count").description("").optional.defaultValue(100),
        queryParam[BigDecimal]("start").description("").optional.defaultValue(0),
        queryParam[Boolean]("reverse").description("").optional.defaultValue(false),
        queryParam[Date]("startTime").description("").optional,
        queryParam[Date]("endTime").description("").optional)
  )

  get("/execution/tradeHistory",operation(execution.getTradeHistoryOperation)) {
    
    
    
        
      
      val symbol = params.getAs[String]("symbol")
            

    
    println("symbol: " + symbol)
  
    
    
        
      
      val filter = params.getAs[String]("filter")
            

    
    println("filter: " + filter)
  
    
    
        
      
      val columns = params.getAs[String]("columns")
            

    
    println("columns: " + columns)
  
    
    
        
      
      val count = params.getAs[BigDecimal]("count")
            

    
    println("count: " + count)
  
    
    
        
      
      val start = params.getAs[BigDecimal]("start")
            

    
    println("start: " + start)
  
    
    
        
      
      val reverse = params.getAs[Boolean]("reverse")
            

    
    println("reverse: " + reverse)
  
    
    
        
      
      val startTime = params.getAs[Date]("startTime")
            

    
    println("startTime: " + startTime)
  
    
    
        
      
      val endTime = params.getAs[Date]("endTime")
            

    
    println("endTime: " + endTime)
  
  }

}