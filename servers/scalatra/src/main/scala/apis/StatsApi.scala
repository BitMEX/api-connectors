package apis

import com.wordnik.client.model.StatsHistory
import com.wordnik.client.model.Stats
import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class StatsApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "StatsApi"
  override protected val applicationName: Option[String] = Some("stats")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }



  val findOperation = (apiOperation[List[Stats]]("find")
      summary "Get exchange-wide and per-series turnover and volume statistics."
      parameters(
        )
  )

  get("/",operation(findOperation)) {
    }




  val historyOperation = (apiOperation[List[StatsHistory]]("history")
      summary "Get historical exchange-wide and per-series turnover and volume statistics."
      parameters(
        )
  )

  get("/history",operation(historyOperation)) {
    }

}
