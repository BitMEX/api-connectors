package com.wordnik.client.api

import com.wordnik.client.model.Order
import com.wordnik.client.model.Error
import java.math.BigDecimal
import java.util.Date
import com.wordnik.client.model.Inline_response_200
import com.wordnik.client.model.LiquidationOrder

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class OrderApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "OrderApi"
  override protected val applicationName: Option[String] = Some("Order")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val order.getOrdersOperation = (apiOperation[List[Order]]("order.getOrders")
      summary "Get your orders."
      parameters(queryParam[String]("symbol").description("").optional,
        queryParam[String]("filter").description("").optional,
        queryParam[String]("columns").description("").optional,
        queryParam[BigDecimal]("count").description("").optional.defaultValue(100),
        queryParam[BigDecimal]("start").description("").optional.defaultValue(0),
        queryParam[Boolean]("reverse").description("").optional.defaultValue(false),
        queryParam[Date]("startTime").description("").optional,
        queryParam[Date]("endTime").description("").optional)
  )

  get("/order",operation(order.getOrdersOperation)) {
    
    
    
        
      
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

  

  val order.newOrderOperation = (apiOperation[Order]("order.newOrder")
      summary "Create a new order."
      parameters(formParam[String]("symbol").description(""),
        formParam[BigDecimal]("quantity").description(""),
        formParam[Double]("price").description(""),
        formParam[String]("timeInForce").description("").optional.defaultValue(GTC),
        formParam[String]("type").description("").optional.defaultValue(Limit),
        formParam[Double]("stopPrice").description("").optional,
        formParam[String]("clOrdID").description("").optional)
  )

  post("/order",operation(order.newOrderOperation)) {
    
    
    
                
      val symbol = params.getAs[String]("symbol")
    

    
    println("symbol: " + symbol)
  
    
    
                
      val quantity = params.getAs[BigDecimal]("quantity")
    

    
    println("quantity: " + quantity)
  
    
    
                
      val price = params.getAs[Double]("price")
    

    
    println("price: " + price)
  
    
    
                
      val timeInForce = params.getAs[String]("timeInForce")
    

    
    println("timeInForce: " + timeInForce)
  
    
    
                
      val type = params.getAs[String]("type")
    

    
    println("type: " + type)
  
    
    
                
      val stopPrice = params.getAs[Double]("stopPrice")
    

    
    println("stopPrice: " + stopPrice)
  
    
    
                
      val clOrdID = params.getAs[String]("clOrdID")
    

    
    println("clOrdID: " + clOrdID)
  
  }

  

  val order.cancelOrderOperation = (apiOperation[List[Order]]("order.cancelOrder")
      summary "Cancel order(s). Send multiple order IDs to cancel in bulk."
      parameters(formParam[String]("orderID").description("").optional,
        formParam[String]("clOrdID").description("").optional,
        formParam[String]("text").description("").optional)
  )

  delete("/order",operation(order.cancelOrderOperation)) {
    
    
    
                
      val orderID = params.getAs[String]("orderID")
    

    
    println("orderID: " + orderID)
  
    
    
                
      val clOrdID = params.getAs[String]("clOrdID")
    

    
    println("clOrdID: " + clOrdID)
  
    
    
                
      val text = params.getAs[String]("text")
    

    
    println("text: " + text)
  
  }

  

  val order.cancelAllOperation = (apiOperation[Inline_response_200]("order.cancelAll")
      summary "Cancels all of your orders."
      parameters(formParam[String]("symbol").description("").optional,
        formParam[String]("filter").description("").optional,
        formParam[String]("text").description("").optional)
  )

  delete("/order/all",operation(order.cancelAllOperation)) {
    
    
    
                
      val symbol = params.getAs[String]("symbol")
    

    
    println("symbol: " + symbol)
  
    
    
                
      val filter = params.getAs[String]("filter")
    

    
    println("filter: " + filter)
  
    
    
                
      val text = params.getAs[String]("text")
    

    
    println("text: " + text)
  
  }

  

  val order.cancelAllAfterOperation = (apiOperation[Inline_response_200]("order.cancelAllAfter")
      summary "Automatically cancel all your orders after a specified timeout."
      parameters(formParam[Double]("timeout").description(""))
  )

  post("/order/cancelAllAfter",operation(order.cancelAllAfterOperation)) {
    
    
    
                
      val timeout = params.getAs[Double]("timeout")
    

    
    println("timeout: " + timeout)
  
  }

  

  val order.closePositionOperation = (apiOperation[Order]("order.closePosition")
      summary "Close a position with a market order."
      parameters(formParam[String]("symbol").description(""),
        formParam[Double]("price").description("").optional)
  )

  post("/order/closePosition",operation(order.closePositionOperation)) {
    
    
    
                
      val symbol = params.getAs[String]("symbol")
    

    
    println("symbol: " + symbol)
  
    
    
                
      val price = params.getAs[Double]("price")
    

    
    println("price: " + price)
  
  }

  

  val order.getCloseOutOrdersOperation = (apiOperation[List[LiquidationOrder]]("order.getCloseOutOrders")
      summary "Get open liquidation orders."
      parameters(queryParam[String]("filter").description("").optional)
  )

  get("/order/liquidations",operation(order.getCloseOutOrdersOperation)) {
    
    
    
        
      
      val filter = params.getAs[String]("filter")
            

    
    println("filter: " + filter)
  
  }

}