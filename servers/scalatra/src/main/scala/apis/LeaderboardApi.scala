package apis

import com.wordnik.client.model.Leaderboard
import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class LeaderboardApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "LeaderboardApi"
  override protected val applicationName: Option[String] = Some("leaderboard")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }



  val leaderboard_getOrderBookOperation = (apiOperation[List[leaderboard]]("leaderboard_getOrderBook")
      summary "Get current leaderboard."
      parameters(
        )
  )

  get("/",operation(leaderboard_getOrderBookOperation)) {
    }

}
