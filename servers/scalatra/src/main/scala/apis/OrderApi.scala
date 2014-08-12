package apis

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



  val order_newOrderOperation = (apiOperation[order]("order_newOrder")
      summary "Create a new order."
      parameters(
        formParam[String]("symbol").description(""),formParam[Double]("quantity").description(""),formParam[Double]("price").description(""),formParam[Boolean]("ioc").description(""))
  )

  post("/new",operation(order_newOrderOperation)) {
    val symbol = params.getAs[String]("symbol")
    println("symbol: " + symbol)
  val quantity = params.getAs[Double]("quantity")
    println("quantity: " + quantity)
  val price = params.getAs[Double]("price")
    println("price: " + price)
  val ioc = params.getAs[Boolean]("ioc")
    println("ioc: " + ioc)
  }




  val order_cancelOrderOperation = (apiOperation[order]("order_cancelOrder")
      summary "Cancel an order."
      parameters(
        formParam[String]("orderID").description(""))
  )

  post("/cancel",operation(order_cancelOrderOperation)) {
    val orderID = params.getAs[String]("orderID")
    println("orderID: " + orderID)
  }




  val order_myOrdersOperation = (apiOperation[List[order]]("order_myOrders")
      summary "Get your recent orders."
      parameters(
        queryParam[Any]("filter").description(""),queryParam[array[String]]("columns").description(""),queryParam[Double]("count").description(""))
  )

  get("/myOrders",operation(order_myOrdersOperation)) {
    val filter = params.getAs[Any]("filter")
    println("filter: " + filter)
  val columns = params.getAs[array[String]]("columns")
    println("columns: " + columns)
  val count = params.getAs[Double]("count")
    println("count: " + count)
  }




  val order_myOpenOrdersOperation = (apiOperation[List[order]]("order_myOpenOrders")
      summary "Get your open orders."
      parameters(
        )
  )

  get("/myOpenOrders",operation(order_myOpenOrdersOperation)) {
    }

}
