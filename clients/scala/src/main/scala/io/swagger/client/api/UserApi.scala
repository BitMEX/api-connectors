package io.swagger.client.api

import io.swagger.client.model.User
import io.swagger.client.model.Affiliate
import io.swagger.client.model.Transaction
import io.swagger.client.model.UserCommission
import io.swagger.client.model.AccessToken
import io.swagger.client.model.Margin
import io.swagger.client.model.Number
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class UserApi(val defBasePath: String = "https://localhost/api/v1",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  
  /**
   * Get your user model.
   * 
   * @return User
   */
  def userGet () : Option[User] = {
    // create path and map variables
    val path = "/user".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[User]).asInstanceOf[User])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Update your password, name, and other attributes.
   * 
   * @param firstname 
   * @param lastname 
   * @param oldPassword 
   * @param newPassword 
   * @param newPasswordConfirm 
   * @param username Username can only be set once. To reset, email support.
   * @param country Country of residence.
   * @param pgpPubKey PGP Public Key. If specified, automated emails will be sentwith this key.
   * @return User
   */
  def userUpdate (firstname: String, lastname: String, oldPassword: String, newPassword: String, newPasswordConfirm: String, username: String, country: String, pgpPubKey: String) : Option[User] = {
    // create path and map variables
    val path = "/user".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("firstname", firstname.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("lastname", lastname.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("oldPassword", oldPassword.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("newPassword", newPassword.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("newPasswordConfirm", newPasswordConfirm.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("username", username.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("country", country.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("pgpPubKey", pgpPubKey.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "firstname" -> firstname.toString()
      formParams += "lastname" -> lastname.toString()
      formParams += "oldPassword" -> oldPassword.toString()
      formParams += "newPassword" -> newPassword.toString()
      formParams += "newPasswordConfirm" -> newPasswordConfirm.toString()
      formParams += "username" -> username.toString()
      formParams += "country" -> country.toString()
      formParams += "pgpPubKey" -> pgpPubKey.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[User]).asInstanceOf[User])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Register a new user.
   * 
   * @param email Your email address.
   * @param password Your password.
   * @param country Country of residence.
   * @param username Desired username.
   * @param firstname First name.
   * @param lastname Last name.
   * @param acceptsTOS Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/terms).
   * @param referrerID Optional Referrer ID.
   * @param tfaType Optional Two-Factor Type. Accepted values: GA, Yubikey, Clef
   * @param tfaToken Two-Factor Token.
   * @return User
   */
  def userNew (email: String, password: String, country: String, username: String, firstname: String, lastname: String, acceptsTOS: String, referrerID: String, tfaType: String, tfaToken: String) : Option[User] = {
    // create path and map variables
    val path = "/user".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("email", email.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("password", password.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("username", username.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("firstname", firstname.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("lastname", lastname.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("acceptsTOS", acceptsTOS.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("referrerID", referrerID.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("country", country.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("tfaType", tfaType.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("tfaToken", tfaToken.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "email" -> email.toString()
      formParams += "password" -> password.toString()
      formParams += "username" -> username.toString()
      formParams += "firstname" -> firstname.toString()
      formParams += "lastname" -> lastname.toString()
      formParams += "acceptsTOS" -> acceptsTOS.toString()
      formParams += "referrerID" -> referrerID.toString()
      formParams += "country" -> country.toString()
      formParams += "tfaType" -> tfaType.toString()
      formParams += "tfaToken" -> tfaToken.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[User]).asInstanceOf[User])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Get your current affiliate/referral status.
   * 
   * @return List[Affiliate]
   */
  def userGetAffiliateStatus () : Option[List[Affiliate]] = {
    // create path and map variables
    val path = "/user/affiliateStatus".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "array", classOf[Affiliate]).asInstanceOf[List[Affiliate]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Cancel a withdrawal.
   * 
   * @param token 
   * @return Transaction
   */
  def userCancelWithdrawal (token: String) : Option[Transaction] = {
    // create path and map variables
    val path = "/user/cancelWithdrawal".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("token", token.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "token" -> token.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Transaction]).asInstanceOf[Transaction])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Check if a referral code is valid.
   * If the code is valid, responds with the referral code&#39;s discount (e.g. `0.1` for 10%). Otherwise, will return a 404.
   * @param referralCode 
   * @return Double
   */
  def userCheckReferralCode (referralCode: String) : Option[Double] = {
    // create path and map variables
    val path = "/user/checkReferralCode".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(referralCode) != "null") queryParams += "referralCode" -> referralCode.toString
    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Double]).asInstanceOf[Double])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Get your account&#39;s commission status.
   * 
   * @return List[UserCommission]
   */
  def userGetCommission () : Option[List[UserCommission]] = {
    // create path and map variables
    val path = "/user/commission".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "array", classOf[UserCommission]).asInstanceOf[List[UserCommission]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Confirm your email address with a token.
   * 
   * @param token 
   * @return AccessToken
   */
  def userConfirmEmail (token: String) : Option[AccessToken] = {
    // create path and map variables
    val path = "/user/confirmEmail".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("token", token.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "token" -> token.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[AccessToken]).asInstanceOf[AccessToken])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.
   * 
   * @param token Token from your selected TFA type.
   * @param _type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator), &#39;Yubikey&#39;
   * @return Boolean
   */
  def userConfirmEnableTFA (token: String, _type: String) : Option[Boolean] = {
    // create path and map variables
    val path = "/user/confirmEnableTFA".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("type", _type.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("token", token.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "type" -> _type.toString()
      formParams += "token" -> token.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Boolean]).asInstanceOf[Boolean])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Confirm a password reset.
   * 
   * @param token 
   * @param newPassword 
   * @return Boolean
   */
  def userConfirmPasswordReset (token: String, newPassword: String) : Option[Boolean] = {
    // create path and map variables
    val path = "/user/confirmPasswordReset".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("token", token.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("newPassword", newPassword.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "token" -> token.toString()
      formParams += "newPassword" -> newPassword.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Boolean]).asInstanceOf[Boolean])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Confirm a withdrawal.
   * 
   * @param token 
   * @return Transaction
   */
  def userConfirmWithdrawal (token: String) : Option[Transaction] = {
    // create path and map variables
    val path = "/user/confirmWithdrawal".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("token", token.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "token" -> token.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Transaction]).asInstanceOf[Transaction])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Get a deposit address.
   * 
   * @param currency 
   * @return String
   */
  def userGetDepositAddress (currency: String /* = XBt */) : Option[String] = {
    // create path and map variables
    val path = "/user/depositAddress".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(currency) != "null") queryParams += "currency" -> currency.toString
    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[String]).asInstanceOf[String])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Disable two-factor auth for this account.
   * 
   * @param token Token from your selected TFA type.
   * @param _type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)
   * @return Boolean
   */
  def userDisableTFA (token: String, _type: String) : Option[Boolean] = {
    // create path and map variables
    val path = "/user/disableTFA".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("type", _type.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("token", token.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "type" -> _type.toString()
      formParams += "token" -> token.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Boolean]).asInstanceOf[Boolean])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Log in to BitMEX.
   * 
   * @param email Your email address.
   * @param password Your password.
   * @param token OTP Token (YubiKey, Google Authenticator)
   * @return AccessToken
   */
  def userLogin (email: String, password: String, token: String) : Option[AccessToken] = {
    // create path and map variables
    val path = "/user/login".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("email", email.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("password", password.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("token", token.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "email" -> email.toString()
      formParams += "password" -> password.toString()
      formParams += "token" -> token.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[AccessToken]).asInstanceOf[AccessToken])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Log out of BitMEX.
   * 
   * @return void
   */
  def userLogout ()  = {
    // create path and map variables
    val path = "/user/logout".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Log all systems out of BitMEX. This will revoke all of your account&#39;s access tokens, logging you out on all devices.
   * 
   * @return Double
   */
  def userLogoutAll () : Option[Double] = {
    // create path and map variables
    val path = "/user/logoutAll".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Double]).asInstanceOf[Double])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Get your account&#39;s margin status. Send a currency of \&quot;all\&quot; to receive an array of all supported currencies.
   * 
   * @param currency 
   * @return Margin
   */
  def userGetMargin (currency: String /* = XBt */) : Option[Margin] = {
    // create path and map variables
    val path = "/user/margin".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(currency) != "null") queryParams += "currency" -> currency.toString
    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Margin]).asInstanceOf[Margin])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Save user preferences.
   * 
   * @param prefs 
   * @param overwrite If true, will overwrite all existing preferences.
   * @return User
   */
  def userSavePreferences (prefs: String, overwrite: Boolean /* = false */) : Option[User] = {
    // create path and map variables
    val path = "/user/preferences".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("prefs", prefs.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("overwrite", overwrite.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "prefs" -> prefs.toString()
      formParams += "overwrite" -> overwrite.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[User]).asInstanceOf[User])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.
   * 
   * @param _type Two-factor auth type. Supported types: &#39;GA&#39; (Google Authenticator)
   * @return Boolean
   */
  def userRequestEnableTFA (_type: String) : Option[Boolean] = {
    // create path and map variables
    val path = "/user/requestEnableTFA".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("type", _type.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "type" -> _type.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Boolean]).asInstanceOf[Boolean])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Request a password reset.
   * 
   * @param email 
   * @return Boolean
   */
  def userRequestPasswordReset (email: String) : Option[Boolean] = {
    // create path and map variables
    val path = "/user/requestPasswordReset".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("email", email.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "email" -> email.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Boolean]).asInstanceOf[Boolean])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Request a withdrawal to an external wallet.
   * This will send a confirmation email to the email address on record, unless requested via an API Key with the `withdraw` permission.
   * @param currency Currency you&#39;re withdrawing. Options: `XBt`
   * @param amount Amount of withdrawal currency.
   * @param address Destination Address.
   * @param otpToken 2FA token. Required if 2FA is enabled on your account.
   * @param fee Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.
   * @return Transaction
   */
  def userRequestWithdrawal (currency: String /* = XBt */, amount: Number, address: String, otpToken: String, fee: Double) : Option[Transaction] = {
    // create path and map variables
    val path = "/user/requestWithdrawal".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("otpToken", otpToken.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("currency", currency.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("amount", amount.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("address", address.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("fee", fee.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "otpToken" -> otpToken.toString()
      formParams += "currency" -> currency.toString()
      formParams += "amount" -> amount.toString()
      formParams += "address" -> address.toString()
      formParams += "fee" -> fee.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Transaction]).asInstanceOf[Transaction])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Re-send verification email.
   * 
   * @param email 
   * @return Boolean
   */
  def userSendVerificationEmail (email: String) : Option[Boolean] = {
    // create path and map variables
    val path = "/user/resendVerificationEmail".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("email", email.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "email" -> email.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Boolean]).asInstanceOf[Boolean])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Get a history of all of your wallet transactions (deposits and withdrawals).
   * 
   * @param currency 
   * @return List[Transaction]
   */
  def userGetWalletHistory (currency: String /* = XBt */) : Option[List[Transaction]] = {
    // create path and map variables
    val path = "/user/walletHistory".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(currency) != "null") queryParams += "currency" -> currency.toString
    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "array", classOf[Transaction]).asInstanceOf[List[Transaction]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
}
