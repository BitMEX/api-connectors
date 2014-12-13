package apis

import com.wordnik.client.model.Error
import com.wordnik.client.model.Chat
import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class ChatApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "ChatApi"
  override protected val applicationName: Option[String] = Some("chat")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }



  val getOperation = (apiOperation[List[Chat]]("get")
      summary "Get chat messages."
      parameters(
        queryParam[Double]("count").description("").defaultValue(100))
  )

  get("/",operation(getOperation)) {
    val count = params.getAs[Double]("count")
    println("count: " + count)
  }




  val sendOperation = (apiOperation[Chat]("send")
      summary "Send a chat message."
      parameters(
        formParam[String]("message").description(""))
  )

  post("/",operation(sendOperation)) {
    val message = params.getAs[String]("message")
    println("message: " + message)
  }

}
