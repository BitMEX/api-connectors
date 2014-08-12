package apis

import com.wordnik.client.model.OrderBook
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
  override protected val applicationName: Option[String] = Some("orderBook")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }



  val orderBook_getOrderBookOperation = (apiOperation[List[orderBook]]("orderBook_getOrderBook")
      summary "Get current orderbook."
      parameters(
        queryParam[symbol]("symbol").description(""))
  )

  get("/",operation(orderBook_getOrderBookOperation)) {
    val symbol = params.getAs[symbol]("symbol")
    println("symbol: " + symbol)
  }

}
