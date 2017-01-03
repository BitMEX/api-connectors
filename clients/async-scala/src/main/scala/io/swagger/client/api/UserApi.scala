package io.swagger.client.api

import io.swagger.client.model.Transaction
import io.swagger.client.model.AccessToken
import io.swagger.client.model.User
import io.swagger.client.model.Affiliate
import io.swagger.client.model.UserCommission
import io.swagger.client.model.Margin
import io.swagger.client.model.Wallet
import io.swagger.client.model.Number
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class UserApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def user.cancelWithdrawal(token: String)(implicit reader: ClientResponseReader[Transaction]): Future[Transaction] = {
    // create path and map variables
    val path = (addFmt("/user/cancelWithdrawal"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.checkReferralCode(referralCode: Option[String] = None
      )(implicit reader: ClientResponseReader[Double]): Future[Double] = {
    // create path and map variables
    val path = (addFmt("/user/checkReferralCode"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (referralCode != null) referralCode.foreach { v => queryParams += "referralCode" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.confirmEmail(token: String)(implicit reader: ClientResponseReader[AccessToken]): Future[AccessToken] = {
    // create path and map variables
    val path = (addFmt("/user/confirmEmail"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.confirmEnableTFA(token: String,
      _type: Option[String] = None
      )(implicit reader: ClientResponseReader[Boolean]): Future[Boolean] = {
    // create path and map variables
    val path = (addFmt("/user/confirmEnableTFA"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.confirmWithdrawal(token: String)(implicit reader: ClientResponseReader[Transaction]): Future[Transaction] = {
    // create path and map variables
    val path = (addFmt("/user/confirmWithdrawal"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.disableTFA(token: String,
      _type: Option[String] = None
      )(implicit reader: ClientResponseReader[Boolean]): Future[Boolean] = {
    // create path and map variables
    val path = (addFmt("/user/disableTFA"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.get()(implicit reader: ClientResponseReader[User]): Future[User] = {
    // create path and map variables
    val path = (addFmt("/user"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.getAffiliateStatus()(implicit reader: ClientResponseReader[List[Affiliate]]): Future[List[Affiliate]] = {
    // create path and map variables
    val path = (addFmt("/user/affiliateStatus"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.getCommission()(implicit reader: ClientResponseReader[List[UserCommission]]): Future[List[UserCommission]] = {
    // create path and map variables
    val path = (addFmt("/user/commission"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.getDepositAddress(currency: Option[String] = Some(XBt)
      )(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/user/depositAddress"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (currency != null) currency.foreach { v => queryParams += "currency" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.getMargin(currency: Option[String] = Some(XBt)
      )(implicit reader: ClientResponseReader[Margin]): Future[Margin] = {
    // create path and map variables
    val path = (addFmt("/user/margin"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (currency != null) currency.foreach { v => queryParams += "currency" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.getWallet(currency: Option[String] = Some(XBt)
      )(implicit reader: ClientResponseReader[Wallet]): Future[Wallet] = {
    // create path and map variables
    val path = (addFmt("/user/wallet"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (currency != null) currency.foreach { v => queryParams += "currency" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.getWalletHistory(currency: Option[String] = Some(XBt)
      )(implicit reader: ClientResponseReader[List[Transaction]]): Future[List[Transaction]] = {
    // create path and map variables
    val path = (addFmt("/user/walletHistory"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (currency != null) currency.foreach { v => queryParams += "currency" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.getWalletSummary(currency: Option[String] = Some(XBt)
      )(implicit reader: ClientResponseReader[List[Transaction]]): Future[List[Transaction]] = {
    // create path and map variables
    val path = (addFmt("/user/walletSummary"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (currency != null) currency.foreach { v => queryParams += "currency" -> v.toString }



    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.logout()(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/user/logout"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.logoutAll()(implicit reader: ClientResponseReader[Double]): Future[Double] = {
    // create path and map variables
    val path = (addFmt("/user/logoutAll"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.requestEnableTFA(_type: Option[String] = None
      )(implicit reader: ClientResponseReader[Boolean]): Future[Boolean] = {
    // create path and map variables
    val path = (addFmt("/user/requestEnableTFA"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.requestWithdrawal(currency: String = XBt,
      amount: Number,
      address: String,
      otpToken: Option[String] = None,
      fee: Option[Double] = None
      )(implicit reader: ClientResponseReader[Transaction]): Future[Transaction] = {
    // create path and map variables
    val path = (addFmt("/user/requestWithdrawal"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.savePreferences(prefs: String,
      overwrite: Option[Boolean] = Some(false)
      )(implicit reader: ClientResponseReader[User]): Future[User] = {
    // create path and map variables
    val path = (addFmt("/user/preferences"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def user.update(firstname: Option[String] = None,
      lastname: Option[String] = None,
      oldPassword: Option[String] = None,
      newPassword: Option[String] = None,
      newPasswordConfirm: Option[String] = None,
      username: Option[String] = None,
      country: Option[String] = None,
      pgpPubKey: Option[String] = None
      )(implicit reader: ClientResponseReader[User]): Future[User] = {
    // create path and map variables
    val path = (addFmt("/user"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]



    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
