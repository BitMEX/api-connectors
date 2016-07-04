package com.wordnik.client.api

import com.wordnik.client.model.User
import com.wordnik.client.model.Affiliate
import com.wordnik.client.model.Transaction
import com.wordnik.client.model.UserCommission
import com.wordnik.client.model.AccessToken
import com.wordnik.client.model.Margin
import java.math.BigDecimal

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
  override protected val applicationName: Option[String] = Some("User")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val user.getOperation = (apiOperation[User]("user.get")
      summary "Get your user model."
      parameters()
  )

  get("/user",operation(user.getOperation)) {
    
  }

  

  val user.updateOperation = (apiOperation[User]("user.update")
      summary "Update your password, name, and other attributes."
      parameters(formParam[String]("firstname").description("").optional,
        formParam[String]("lastname").description("").optional,
        formParam[String]("oldPassword").description("").optional,
        formParam[String]("newPassword").description("").optional,
        formParam[String]("newPasswordConfirm").description("").optional,
        formParam[String]("username").description("").optional,
        formParam[String]("country").description("").optional,
        formParam[String]("pgpPubKey").description("").optional)
  )

  put("/user",operation(user.updateOperation)) {
    
    
    
                
      val firstname = params.getAs[String]("firstname")
    

    
    println("firstname: " + firstname)
  
    
    
                
      val lastname = params.getAs[String]("lastname")
    

    
    println("lastname: " + lastname)
  
    
    
                
      val oldPassword = params.getAs[String]("oldPassword")
    

    
    println("oldPassword: " + oldPassword)
  
    
    
                
      val newPassword = params.getAs[String]("newPassword")
    

    
    println("newPassword: " + newPassword)
  
    
    
                
      val newPasswordConfirm = params.getAs[String]("newPasswordConfirm")
    

    
    println("newPasswordConfirm: " + newPasswordConfirm)
  
    
    
                
      val username = params.getAs[String]("username")
    

    
    println("username: " + username)
  
    
    
                
      val country = params.getAs[String]("country")
    

    
    println("country: " + country)
  
    
    
                
      val pgpPubKey = params.getAs[String]("pgpPubKey")
    

    
    println("pgpPubKey: " + pgpPubKey)
  
  }

  

  val user.newOperation = (apiOperation[User]("user.new")
      summary "Register a new user."
      parameters(formParam[String]("email").description(""),
        formParam[String]("password").description(""),
        formParam[String]("country").description(""),
        formParam[String]("username").description("").optional,
        formParam[String]("firstname").description("").optional,
        formParam[String]("lastname").description("").optional,
        formParam[String]("acceptsTOS").description("").optional,
        formParam[String]("referrerID").description("").optional,
        formParam[String]("tfaType").description("").optional,
        formParam[String]("tfaToken").description("").optional)
  )

  post("/user",operation(user.newOperation)) {
    
    
    
                
      val email = params.getAs[String]("email")
    

    
    println("email: " + email)
  
    
    
                
      val password = params.getAs[String]("password")
    

    
    println("password: " + password)
  
    
    
                
      val country = params.getAs[String]("country")
    

    
    println("country: " + country)
  
    
    
                
      val username = params.getAs[String]("username")
    

    
    println("username: " + username)
  
    
    
                
      val firstname = params.getAs[String]("firstname")
    

    
    println("firstname: " + firstname)
  
    
    
                
      val lastname = params.getAs[String]("lastname")
    

    
    println("lastname: " + lastname)
  
    
    
                
      val acceptsTOS = params.getAs[String]("acceptsTOS")
    

    
    println("acceptsTOS: " + acceptsTOS)
  
    
    
                
      val referrerID = params.getAs[String]("referrerID")
    

    
    println("referrerID: " + referrerID)
  
    
    
                
      val tfaType = params.getAs[String]("tfaType")
    

    
    println("tfaType: " + tfaType)
  
    
    
                
      val tfaToken = params.getAs[String]("tfaToken")
    

    
    println("tfaToken: " + tfaToken)
  
  }

  

  val user.getAffiliateStatusOperation = (apiOperation[List[Affiliate]]("user.getAffiliateStatus")
      summary "Get your current affiliate/referral status."
      parameters()
  )

  get("/user/affiliateStatus",operation(user.getAffiliateStatusOperation)) {
    
  }

  

  val user.cancelWithdrawalOperation = (apiOperation[Transaction]("user.cancelWithdrawal")
      summary "Cancel a withdrawal."
      parameters(formParam[String]("token").description(""))
  )

  post("/user/cancelWithdrawal",operation(user.cancelWithdrawalOperation)) {
    
    
    
                
      val token = params.getAs[String]("token")
    

    
    println("token: " + token)
  
  }

  

  val user.checkReferralCodeOperation = (apiOperation[Double]("user.checkReferralCode")
      summary "Check if a referral code is valid."
      parameters(queryParam[String]("referralCode").description("").optional)
  )

  get("/user/checkReferralCode",operation(user.checkReferralCodeOperation)) {
    
    
    
        
      
      val referralCode = params.getAs[String]("referralCode")
            

    
    println("referralCode: " + referralCode)
  
  }

  

  val user.getCommissionOperation = (apiOperation[List[UserCommission]]("user.getCommission")
      summary "Get your account's commission status."
      parameters()
  )

  get("/user/commission",operation(user.getCommissionOperation)) {
    
  }

  

  val user.confirmEmailOperation = (apiOperation[AccessToken]("user.confirmEmail")
      summary "Confirm your email address with a token."
      parameters(formParam[String]("token").description(""))
  )

  post("/user/confirmEmail",operation(user.confirmEmailOperation)) {
    
    
    
                
      val token = params.getAs[String]("token")
    

    
    println("token: " + token)
  
  }

  

  val user.confirmEnableTFAOperation = (apiOperation[Boolean]("user.confirmEnableTFA")
      summary "Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint."
      parameters(formParam[String]("token").description(""),
        formParam[String]("type").description("").optional)
  )

  post("/user/confirmEnableTFA",operation(user.confirmEnableTFAOperation)) {
    
    
    
                
      val token = params.getAs[String]("token")
    

    
    println("token: " + token)
  
    
    
                
      val type = params.getAs[String]("type")
    

    
    println("type: " + type)
  
  }

  

  val user.confirmPasswordResetOperation = (apiOperation[Boolean]("user.confirmPasswordReset")
      summary "Confirm a password reset."
      parameters(formParam[String]("token").description(""),
        formParam[String]("newPassword").description(""))
  )

  post("/user/confirmPasswordReset",operation(user.confirmPasswordResetOperation)) {
    
    
    
                
      val token = params.getAs[String]("token")
    

    
    println("token: " + token)
  
    
    
                
      val newPassword = params.getAs[String]("newPassword")
    

    
    println("newPassword: " + newPassword)
  
  }

  

  val user.confirmWithdrawalOperation = (apiOperation[Transaction]("user.confirmWithdrawal")
      summary "Confirm a withdrawal."
      parameters(formParam[String]("token").description(""))
  )

  post("/user/confirmWithdrawal",operation(user.confirmWithdrawalOperation)) {
    
    
    
                
      val token = params.getAs[String]("token")
    

    
    println("token: " + token)
  
  }

  

  val user.getDepositAddressOperation = (apiOperation[String]("user.getDepositAddress")
      summary "Get a deposit address."
      parameters(queryParam[String]("currency").description("").optional.defaultValue(XBt))
  )

  get("/user/depositAddress",operation(user.getDepositAddressOperation)) {
    
    
    
        
      
      val currency = params.getAs[String]("currency")
            

    
    println("currency: " + currency)
  
  }

  

  val user.disableTFAOperation = (apiOperation[Boolean]("user.disableTFA")
      summary "Disable two-factor auth for this account."
      parameters(formParam[String]("token").description(""),
        formParam[String]("type").description("").optional)
  )

  post("/user/disableTFA",operation(user.disableTFAOperation)) {
    
    
    
                
      val token = params.getAs[String]("token")
    

    
    println("token: " + token)
  
    
    
                
      val type = params.getAs[String]("type")
    

    
    println("type: " + type)
  
  }

  

  val user.loginOperation = (apiOperation[AccessToken]("user.login")
      summary "Log in to BitMEX."
      parameters(formParam[String]("email").description(""),
        formParam[String]("password").description(""),
        formParam[String]("token").description("").optional)
  )

  post("/user/login",operation(user.loginOperation)) {
    
    
    
                
      val email = params.getAs[String]("email")
    

    
    println("email: " + email)
  
    
    
                
      val password = params.getAs[String]("password")
    

    
    println("password: " + password)
  
    
    
                
      val token = params.getAs[String]("token")
    

    
    println("token: " + token)
  
  }

  

  val user.logoutOperation = (apiOperation[Unit]("user.logout")
      summary "Log out of BitMEX."
      parameters()
  )

  post("/user/logout",operation(user.logoutOperation)) {
    
  }

  

  val user.logoutAllOperation = (apiOperation[Double]("user.logoutAll")
      summary "Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices."
      parameters()
  )

  post("/user/logoutAll",operation(user.logoutAllOperation)) {
    
  }

  

  val user.getMarginOperation = (apiOperation[Margin]("user.getMargin")
      summary "Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies."
      parameters(queryParam[String]("currency").description("").optional.defaultValue(XBt))
  )

  get("/user/margin",operation(user.getMarginOperation)) {
    
    
    
        
      
      val currency = params.getAs[String]("currency")
            

    
    println("currency: " + currency)
  
  }

  

  val user.savePreferencesOperation = (apiOperation[User]("user.savePreferences")
      summary "Save user preferences."
      parameters(formParam[String]("prefs").description(""),
        formParam[Boolean]("overwrite").description("").optional.defaultValue(false))
  )

  post("/user/preferences",operation(user.savePreferencesOperation)) {
    
    
    
                
      val prefs = params.getAs[String]("prefs")
    

    
    println("prefs: " + prefs)
  
    
    
                
      val overwrite = params.getAs[Boolean]("overwrite")
    

    
    println("overwrite: " + overwrite)
  
  }

  

  val user.requestEnableTFAOperation = (apiOperation[Boolean]("user.requestEnableTFA")
      summary "Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys."
      parameters(formParam[String]("type").description("").optional)
  )

  post("/user/requestEnableTFA",operation(user.requestEnableTFAOperation)) {
    
    
    
                
      val type = params.getAs[String]("type")
    

    
    println("type: " + type)
  
  }

  

  val user.requestPasswordResetOperation = (apiOperation[Boolean]("user.requestPasswordReset")
      summary "Request a password reset."
      parameters(formParam[String]("email").description(""))
  )

  post("/user/requestPasswordReset",operation(user.requestPasswordResetOperation)) {
    
    
    
                
      val email = params.getAs[String]("email")
    

    
    println("email: " + email)
  
  }

  

  val user.requestWithdrawalOperation = (apiOperation[Transaction]("user.requestWithdrawal")
      summary "Request a withdrawal to an external wallet."
      parameters(formParam[String]("currency").description("").defaultValue(XBt),
        formParam[BigDecimal]("amount").description(""),
        formParam[String]("address").description(""),
        formParam[String]("otpToken").description("").optional,
        formParam[Double]("fee").description("").optional)
  )

  post("/user/requestWithdrawal",operation(user.requestWithdrawalOperation)) {
    
    
    
                
      val currency = params.getAs[String]("currency")
    

    
    println("currency: " + currency)
  
    
    
                
      val amount = params.getAs[BigDecimal]("amount")
    

    
    println("amount: " + amount)
  
    
    
                
      val address = params.getAs[String]("address")
    

    
    println("address: " + address)
  
    
    
                
      val otpToken = params.getAs[String]("otpToken")
    

    
    println("otpToken: " + otpToken)
  
    
    
                
      val fee = params.getAs[Double]("fee")
    

    
    println("fee: " + fee)
  
  }

  

  val user.sendVerificationEmailOperation = (apiOperation[Boolean]("user.sendVerificationEmail")
      summary "Re-send verification email."
      parameters(formParam[String]("email").description(""))
  )

  post("/user/resendVerificationEmail",operation(user.sendVerificationEmailOperation)) {
    
    
    
                
      val email = params.getAs[String]("email")
    

    
    println("email: " + email)
  
  }

  

  val user.getWalletHistoryOperation = (apiOperation[List[Transaction]]("user.getWalletHistory")
      summary "Get a history of all of your wallet transactions (deposits and withdrawals)."
      parameters(queryParam[String]("currency").description("").optional.defaultValue(XBt))
  )

  get("/user/walletHistory",operation(user.getWalletHistoryOperation)) {
    
    
    
        
      
      val currency = params.getAs[String]("currency")
            

    
    println("currency: " + currency)
  
  }

}