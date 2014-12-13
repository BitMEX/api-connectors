package apis

import com.wordnik.client.model.Error
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



  val getOrderBookOperation = (apiOperation[List[OrderBook]]("getOrderBook")
      summary "Get current orderbook."
      parameters(
        queryParam[String]("symbol").description(""),queryParam[Double]("depth").description("").defaultValue(25))
  )

  get("/",operation(getOrderBookOperation)) {
    val symbol = params.getAs[String]("symbol")
    println("symbol: " + symbol)
  val depth = params.getAs[Double]("depth")
    println("depth: " + depth)
  }

}
