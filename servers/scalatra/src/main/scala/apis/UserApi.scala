package apis

import com.wordnik.client.model.Object
import com.wordnik.client.model.User
import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class UserApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "UserApi"
  override protected val applicationName: Option[String] = Some("user")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }



  val user_loginOperation = (apiOperation[Any]("user_login")
      summary "Log in to BitMEX."
      parameters(
        bodyParam[Any]("body").description(""))
  )

  post("/login",operation(user_loginOperation)) {
    val body = parsedBody.extract[Any]
    println("body: " + body)
  }




  val user_logoutOperation = (apiOperation[Unit]("user_logout")
      summary "Log out of BitMEX."
      parameters(
        )
  )

  post("/logout",operation(user_logoutOperation)) {
    }




  val user_createOperation = (apiOperation[user]("user_create")
      summary "Register a new user."
      parameters(
        bodyParam[user]("body").description("").optional)
  )

  post("/",operation(user_createOperation)) {
    val body = parsedBody.extract[user]
    println("body: " + body)
  }




  val user_getMeOperation = (apiOperation[user]("user_getMe")
      summary "Get your user model."
      parameters(
        )
  )

  get("/",operation(user_getMeOperation)) {
    }




  val user_updateMeOperation = (apiOperation[user]("user_updateMe")
      summary "Update your password, name, and other attributes."
      parameters(
        formParam[String]("firstname").description(""),formParam[String]("lastname").description(""),formParam[String]("phone").description(""),formParam[String]("oldPassword").description(""),formParam[String]("newPassword").description(""),formParam[String]("newPasswordConfirm").description(""))
  )

  put("/",operation(user_updateMeOperation)) {
    val firstname = params.getAs[String]("firstname")
    println("firstname: " + firstname)
  val lastname = params.getAs[String]("lastname")
    println("lastname: " + lastname)
  val phone = params.getAs[String]("phone")
    println("phone: " + phone)
  val oldPassword = params.getAs[String]("oldPassword")
    println("oldPassword: " + oldPassword)
  val newPassword = params.getAs[String]("newPassword")
    println("newPassword: " + newPassword)
  val newPasswordConfirm = params.getAs[String]("newPasswordConfirm")
    println("newPasswordConfirm: " + newPasswordConfirm)
  }




  val user_savePreferencesOperation = (apiOperation[user]("user_savePreferences")
      summary "Save application preferences."
      parameters(
        formParam[Any]("prefs").description(""))
  )

  post("/savePrefs",operation(user_savePreferencesOperation)) {
    val prefs = params.getAs[Any]("prefs")
    println("prefs: " + prefs)
  }




  val user_verifyPhoneOperation = (apiOperation[Boolean]("user_verifyPhone")
      summary "Request an SMS verification token."
      parameters(
        )
  )

  post("/requestSMS",operation(user_verifyPhoneOperation)) {
    }




  val user_confirmPhoneOperation = (apiOperation[user]("user_confirmPhone")
      summary "Confirm your phone number by entering your SMS verification token."
      parameters(
        formParam[String]("token").description(""))
  )

  post("/confirmPhone",operation(user_confirmPhoneOperation)) {
    val token = params.getAs[String]("token")
    println("token: " + token)
  }

}
