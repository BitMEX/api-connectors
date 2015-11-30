package com.wordnik.client.api

import com.wordnik.client.model.OrderBook
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

class OrderBookApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "OrderBookApi"
  override protected val applicationName: Option[String] = Some("OrderBook")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val orderBook.getOrderBookOperation = (apiOperation[List[OrderBook]]("orderBook.getOrderBook")
      summary "Get current orderbook."
      parameters(queryParam[String]("symbol").description(""),
        queryParam[BigDecimal]("depth").description("").optional)
  )

  get("/orderBook",operation(orderBook.getOrderBookOperation)) {
    
    
    
        
      
      val symbol = params.getAs[String]("symbol")
            

    
    println("symbol: " + symbol)
  
    
    
        
      
      val depth = params.getAs[BigDecimal]("depth")
            

    
    println("depth: " + depth)
  
  }

}