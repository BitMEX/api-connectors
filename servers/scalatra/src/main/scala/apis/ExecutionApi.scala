package apis

import com.wordnik.client.model.Execution
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
  override protected val applicationName: Option[String] = Some("execution")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }



  val getOperation = (apiOperation[List[Execution]]("get")
      summary "Get all raw executions for your account."
      parameters(
        queryParam[String]("symbol").description("").optional,queryParam[Any]("filter").description("").optional,queryParam[List[String]]("columns").description("").optional,queryParam[Double]("start").description("").optional,queryParam[Boolean]("reverse").description("").optional,queryParam[Date]("startTime").description("").optional,queryParam[Date]("endTime").description("").optional,queryParam[Double]("count").description("").optional.defaultValue(100))
  )

  get("/",operation(getOperation)) {
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




  val getTradeHistoryOperation = (apiOperation[List[Execution]]("getTradeHistory")
      summary "Get all balance-affecting executions. This includes each trade, insurance charge, and settlement."
      parameters(
        queryParam[String]("symbol").description("").optional,queryParam[Any]("filter").description("").optional,queryParam[List[String]]("columns").description("").optional,queryParam[Double]("start").description("").optional,queryParam[Boolean]("reverse").description("").optional,queryParam[Date]("startTime").description("").optional,queryParam[Date]("endTime").description("").optional,queryParam[Double]("count").description("").optional.defaultValue(100))
  )

  get("/tradeHistory",operation(getTradeHistoryOperation)) {
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

}
