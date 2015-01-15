package apis

import com.wordnik.client.model.Object
import com.wordnik.client.model.Order
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
  override protected val applicationName: Option[String] = Some("order")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }



  val getOrdersOperation = (apiOperation[List[Order]]("getOrders")
      summary "Get your orders."
      parameters(
        queryParam[String]("symbol").description(""),queryParam[Any]("filter").description(""),queryParam[List[String]]("columns").description(""),queryParam[Double]("start").description(""),queryParam[Boolean]("reverse").description(""),queryParam[Date]("startTime").description(""),queryParam[Date]("endTime").description(""),queryParam[Double]("count").description("").defaultValue(100))
  )

  get("/",operation(getOrdersOperation)) {
    val symbol = params.getAs[String]("symbol")
    println("symbol: " + symbol)
  val filter = params.getAs[Any]("filter")
    println("filter: " + filter)
  val columns = params.getAs[List[String]]("columns")
    println("columns: " + columns)
  val start = params.getAs[Double]("start")
    println("start: " + start)
  val reverse = params.getAs[Boolean]("reverse")
    println("reverse: " + reverse)
  val startTime = params.getAs[Date]("startTime")
    println("startTime: " + startTime)
  val endTime = params.getAs[Date]("endTime")
    println("endTime: " + endTime)
  val count = params.getAs[Double]("count")
    println("count: " + count)
  }




  val newOrderOperation = (apiOperation[Order]("newOrder")
      summary "Create a new order."
      parameters(
        formParam[String]("symbol").description(""),formParam[Double]("quantity").description(""),formParam[Double]("price").description(""),formParam[Boolean]("ioc").description(""),formParam[String]("clOrdID").description(""))
  )

  post("/",operation(newOrderOperation)) {
    val symbol = params.getAs[String]("symbol")
    println("symbol: " + symbol)
  val quantity = params.getAs[Double]("quantity")
    println("quantity: " + quantity)
  val price = params.getAs[Double]("price")
    println("price: " + price)
  val ioc = params.getAs[Boolean]("ioc")
    println("ioc: " + ioc)
  val clOrdID = params.getAs[String]("clOrdID")
    println("clOrdID: " + clOrdID)
  }




  val cancelOrderOperation = (apiOperation[List[Order]]("cancelOrder")
      summary "Cancel order(s). Send multiple order IDs to cancel in bulk."
      parameters(
        formParam[String]("orderID").description(""),formParam[String]("clOrdID").description(""),formParam[String]("text").description(""))
  )

  delete("/",operation(cancelOrderOperation)) {
    val orderID = params.getAs[String]("orderID")
    println("orderID: " + orderID)
  val clOrdID = params.getAs[String]("clOrdID")
    println("clOrdID: " + clOrdID)
  val text = params.getAs[String]("text")
    println("text: " + text)
  }




  val cancelAllAfterOperation = (apiOperation[Any]("cancelAllAfter")
      summary "Automatically cancel all your orders after a specified timeout."
      parameters(
        formParam[Double]("timeout").description(""))
  )

  post("/cancelAllAfter",operation(cancelAllAfterOperation)) {
    val timeout = params.getAs[Double]("timeout")
    println("timeout: " + timeout)
  }

}
