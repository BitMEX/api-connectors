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



  val getOperation = (apiOperation[List[Instrument]]("get")
      summary "Get instruments."
      parameters(
        queryParam[Any]("filter").description("").optional)
  )

  get("/",operation(getOperation)) {
    val filter = params.getAs[Any]("filter")
    println("filter: " + filter)
  }




  val getActiveOperation = (apiOperation[List[Instrument]]("getActive")
      summary "Get all active instruments and instruments that have expired in <24hrs."
      parameters(
        )
  )

  get("/active",operation(getActiveOperation)) {
    }

}
