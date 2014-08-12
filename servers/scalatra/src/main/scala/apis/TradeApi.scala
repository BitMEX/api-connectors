package apis

import com.wordnik.client.model.TradeBin
import com.wordnik.client.model.Trade
import com.wordnik.client.model.Any
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



  val trade_getBucketedOperation = (apiOperation[List[tradeBin]]("trade_getBucketed")
      summary "Get previous trades bucketed by seconds."
      parameters(
        queryParam[String]("symbol").description(""),queryParam[Date]("startTime").description(""),queryParam[Date]("endTime").description(""),queryParam[Double]("count").description(""),queryParam[Boolean]("useMillisecondTime").description(""),queryParam[String]("binSize").description("").defaultValue("30s"))
  )

  get("/getBucketed",operation(trade_getBucketedOperation)) {
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




  val trade_getByDateOperation = (apiOperation[List[trade]]("trade_getByDate")
      summary "Get trades within two dates."
      parameters(
        queryParam[String]("symbol").description(""),queryParam[Date]("starttime").description(""),queryParam[Date]("endtime").description(""))
  )

  get("/getByDate",operation(trade_getByDateOperation)) {
    val symbol = params.getAs[String]("symbol")
    println("symbol: " + symbol)
  val starttime = params.getAs[Date]("starttime")
    println("starttime: " + starttime)
  val endtime = params.getAs[Date]("endtime")
    println("endtime: " + endtime)
  }




  val trade_getRecentOperation = (apiOperation[List[any]]("trade_getRecent")
      summary "Get recent trades."
      parameters(
        queryParam[String]("symbol").description(""),queryParam[Double]("count").description(""))
  )

  get("/getRecent",operation(trade_getRecentOperation)) {
    val symbol = params.getAs[String]("symbol")
    println("symbol: " + symbol)
  val count = params.getAs[Double]("count")
    println("count: " + count)
  }

}
