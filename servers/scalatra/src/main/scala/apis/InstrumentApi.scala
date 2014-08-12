package apis

import com.wordnik.client.model.Instrument
import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class InstrumentApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "InstrumentApi"
  override protected val applicationName: Option[String] = Some("instrument")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }



  val instrument_findOperation = (apiOperation[List[instrument]]("instrument_find")
      summary "Get all listed instruments."
      parameters(
        queryParam[Any]("filter").description(""))
  )

  get("/",operation(instrument_findOperation)) {
    val filter = params.getAs[Any]("filter")
    println("filter: " + filter)
  }

}
