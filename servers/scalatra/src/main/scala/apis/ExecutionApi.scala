package apis

import com.wordnik.client.model.Error
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



  val getMyExecutionsOperation = (apiOperation[List[Execution]]("getMyExecutions")
      summary "Get your executions. This includes each trade and insurance charge."
      parameters(
        queryParam[Any]("filter").description(""),queryParam[Double]("count").description("").defaultValue(100))
  )

  get("/",operation(getMyExecutionsOperation)) {
    val filter = params.getAs[Any]("filter")
    println("filter: " + filter)
  val count = params.getAs[Double]("count")
    println("count: " + count)
  }

}
