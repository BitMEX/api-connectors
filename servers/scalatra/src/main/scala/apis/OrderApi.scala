package apis

import com.wordnik.client.model.Error
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



  val newOrderOperation = (apiOperation[Order]("newOrder")
      summary "Create a new order. [Deprecated]"
      parameters(
        formParam[String]("symbol").description(""),formParam[Double]("quantity").description(""),formParam[Double]("price").description(""),formParam[Boolean]("ioc").description(""),formParam[String]("clOrdID").description(""))
  )

  post("/new",operation(newOrderOperation)) {
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




  val newOrder_OrderApi_0Operation = (apiOperation[Order]("newOrder_OrderApi_0")
      summary "Create a new order."
      parameters(
        formParam[String]("symbol").description(""),formParam[Double]("quantity").description(""),formParam[Double]("price").description(""),formParam[Boolean]("ioc").description(""),formParam[String]("clOrdID").description(""))
  )

  post("/",operation(newOrder_OrderApi_0Operation)) {
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




  val getOrdersOperation = (apiOperation[List[Order]]("getOrders")
      summary "Get your orders."
      parameters(
        queryParam[Any]("filter").description(""),queryParam[List[any]]("columns").description(""),queryParam[Double]("count").description(""))
  )

  get("/",operation(getOrdersOperation)) {
    val filter = params.getAs[Any]("filter")
    println("filter: " + filter)
  val columns = params.getAs[List[any]]("columns")
    println("columns: " + columns)
  val count = params.getAs[Double]("count")
    println("count: " + count)
  }




  val cancelOrder_OrderApi_0Operation = (apiOperation[List[Order]]("cancelOrder_OrderApi_0")
      summary "Cancel order(s). Send multiple order IDs to cancel in bulk. [Deprecated]"
      parameters(
        formParam[String]("orderID").description(""),formParam[String]("clOrdID").description(""),formParam[String]("text").description(""))
  )

  post("/cancel",operation(cancelOrder_OrderApi_0Operation)) {
    val orderID = params.getAs[String]("orderID")
    println("orderID: " + orderID)
  val clOrdID = params.getAs[String]("clOrdID")
    println("clOrdID: " + clOrdID)
  val text = params.getAs[String]("text")
    println("text: " + text)
  }




  val getOrders_OrderApi_0Operation = (apiOperation[List[Order]]("getOrders_OrderApi_0")
      summary "Get your orders. [Deprecated, use GET /order]"
      parameters(
        queryParam[Any]("filter").description(""),queryParam[List[any]]("columns").description(""),queryParam[Double]("count").description(""))
  )

  get("/myOrders",operation(getOrders_OrderApi_0Operation)) {
    val filter = params.getAs[Any]("filter")
    println("filter: " + filter)
  val columns = params.getAs[List[any]]("columns")
    println("columns: " + columns)
  val count = params.getAs[Double]("count")
    println("count: " + count)
  }




  val getOrders_OrderApi_1Operation = (apiOperation[List[Order]]("getOrders_OrderApi_1")
      summary "Get your open orders."
      parameters(
        queryParam[Any]("filter").description(""),queryParam[List[any]]("columns").description(""),queryParam[Double]("count").description(""))
  )

  get("/myOpenOrders",operation(getOrders_OrderApi_1Operation)) {
    val filter = params.getAs[Any]("filter")
    println("filter: " + filter)
  val columns = params.getAs[List[any]]("columns")
    println("columns: " + columns)
  val count = params.getAs[Double]("count")
    println("count: " + count)
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
