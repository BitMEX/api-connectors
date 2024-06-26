/**
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.api

import io.swagger.client.model.Error
import io.swagger.client.model.XAny
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object UserAffiliatesApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[XAny] (Request was successful)
   *   code 400 : Error (Parameter Error)
   *   code 401 : Error (Unauthorized)
   *   code 403 : Error (Access Denied)
   *   code 404 : Error (Not Found)
   * 
   * Available security schemes:
   *   apiExpires (apiKey)
   *   apiKey (apiKey)
   *   apiSignature (apiKey)
   * 
   * @param depth the depth of affiliates to return. Eg depth &#x3D; 2 would return direct affiliates and their affiliates
   * @param targetAccountId AccountId of Sub-Affiliate Account
   * @param selectUserId User id of result array to keep
   */
  def userAffiliates.get(depth: Option[Double] = None, targetAccountId: Option[Double] = None, selectUserId: Option[Double] = None)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[Seq[XAny]] =
    ApiRequest[Seq[XAny]](ApiMethods.GET, "https://www.bitmex.com/api/v1", "/userAffiliates", "application/json")
      .withApiKey(apiKey, "api-expires", HEADER)
      .withApiKey(apiKey, "api-key", HEADER)
      .withApiKey(apiKey, "api-signature", HEADER)
      .withQueryParam("depth", depth)
      .withQueryParam("targetAccountId", targetAccountId)
      .withQueryParam("selectUserId", selectUserId)
      .withSuccessResponse[Seq[XAny]](200)
      .withErrorResponse[Error](400)
      .withErrorResponse[Error](401)
      .withErrorResponse[Error](403)
      .withErrorResponse[Error](404)
      

}

