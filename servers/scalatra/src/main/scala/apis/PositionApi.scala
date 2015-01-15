package apis

import com.wordnik.client.model.Position
import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class PositionApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "PositionApi"
  override protected val applicationName: Option[String] = Some("position")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }



  val findOperation = (apiOperation[List[Position]]("find")
      summary "Get your positions."
      parameters(
        queryParam[Any]("filter").description(""),queryParam[List[any]]("columns").description(""),queryParam[Double]("count").description(""))
  )

  get("/",operation(findOperation)) {
    val filter = params.getAs[Any]("filter")
    println("filter: " + filter)
  val columns = params.getAs[List[any]]("columns")
    println("columns: " + columns)
  val count = params.getAs[Double]("count")
    println("count: " + count)
  }

}
