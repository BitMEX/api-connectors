package apis

import com.wordnik.client.model.Error
import com.wordnik.client.model.Trade
import com.wordnik.client.model.TradeBin
import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class TradeApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "TradeApi"
  override protected val applicationName: Option[String] = Some("trade")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }



  val getBucketedOperation = (apiOperation[List[TradeBin]]("getBucketed")
      summary "Get previous trades bucketed by seconds."
      parameters(
        queryParam[String]("symbol").description(""),queryParam[Date]("startTime").description(""),queryParam[Date]("endTime").description(""),queryParam[Double]("count").description(""),queryParam[Boolean]("useMillisecondTime").description(""),queryParam[String]("binSize").description("").defaultValue("1m"))
  )

  get("/bucketed",operation(getBucketedOperation)) {
    val symbol = params.getAs[String]("symbol")
    println("symbol: " + symbol)
  val startTime = params.getAs[Date]("startTime")
    println("startTime: " + startTime)
  val endTime = params.getAs[Date]("endTime")
    println("endTime: " + endTime)
  val count = params.getAs[Double]("count")
    println("count: " + count)
  val useMillisecondTime = params.getAs[Boolean]("useMillisecondTime")
    println("useMillisecondTime: " + useMillisecondTime)
  val binSize = params.getAs[String]("binSize")
    println("binSize: " + binSize)
  }




  val getByDateOperation = (apiOperation[List[Trade]]("getByDate")
      summary "Get trades between two dates."
      parameters(
        queryParam[String]("symbol").description(""),queryParam[Date]("startTime").description(""),queryParam[Date]("endTime").description(""))
  )

  get("/byDate",operation(getByDateOperation)) {
    val symbol = params.getAs[String]("symbol")
    println("symbol: " + symbol)
  val startTime = params.getAs[Date]("startTime")
    println("startTime: " + startTime)
  val endTime = params.getAs[Date]("endTime")
    println("endTime: " + endTime)
  }




  val getRecentOperation = (apiOperation[List[Trade]]("getRecent")
      summary "Get recent trades."
      parameters(
        queryParam[String]("symbol").description(""),queryParam[Double]("count").description("").defaultValue(100))
  )

  get("/recent",operation(getRecentOperation)) {
    val symbol = params.getAs[String]("symbol")
    println("symbol: " + symbol)
  val count = params.getAs[Double]("count")
    println("count: " + count)
  }

}
