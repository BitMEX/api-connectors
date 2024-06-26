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

import java.text.SimpleDateFormat

import java.util.Date
import io.swagger.client.model.Error
import io.swagger.client.model.Quote
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class QuoteApi(
  val defBasePath: String = "https://www.bitmex.com/api/v1",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new QuoteApiAsyncHelper(client, config)

  /**
   * Get Quotes.
   * 
   *
   * @param symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. (optional)
   * @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
   * @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
   * @param count Number of results to fetch. Must be a positive integer. (optional, default to 100)
   * @param start Starting point for results. (optional, default to 0)
   * @param reverse If true, will sort results newest first. (optional, default to false)
   * @param startTime Starting date filter for results. (optional)
   * @param endTime Ending date filter for results. (optional)
   * @return List[Quote]
   */
  def quoteGet(symbol: Option[String] = None, filter: Option[String] = None, columns: Option[String] = None, count: Option[Integer] = Option(100), start: Option[Integer] = Option(0), reverse: Option[Boolean] = Option(false), startTime: Option[Date] = None, endTime: Option[Date] = None): Option[List[Quote]] = {
    val await = Try(Await.result(quoteGetAsync(symbol, filter, columns, count, start, reverse, startTime, endTime), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get Quotes. asynchronously
   * 
   *
   * @param symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. (optional)
   * @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
   * @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
   * @param count Number of results to fetch. Must be a positive integer. (optional, default to 100)
   * @param start Starting point for results. (optional, default to 0)
   * @param reverse If true, will sort results newest first. (optional, default to false)
   * @param startTime Starting date filter for results. (optional)
   * @param endTime Ending date filter for results. (optional)
   * @return Future(List[Quote])
   */
  def quoteGetAsync(symbol: Option[String] = None, filter: Option[String] = None, columns: Option[String] = None, count: Option[Integer] = Option(100), start: Option[Integer] = Option(0), reverse: Option[Boolean] = Option(false), startTime: Option[Date] = None, endTime: Option[Date] = None): Future[List[Quote]] = {
      helper.quoteGet(symbol, filter, columns, count, start, reverse, startTime, endTime)
  }

  /**
   * Get previous quotes in time buckets.
   * Timestamps returned by our bucketed endpoints are the **end** of the period, indicating when the bucket was written to disk. Some other common systems use the timestamp as the beginning of the period. Please be aware of this when using this endpoint.
   *
   * @param binSize Time interval to bucket by. Available options: [1m,5m,1h,1d]. (optional, default to 1m)
   * @param partial If true, will send in-progress (incomplete) bins for the current time period. (optional, default to false)
   * @param symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. (optional)
   * @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
   * @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
   * @param count Number of results to fetch. Must be a positive integer. (optional, default to 100)
   * @param start Starting point for results. (optional, default to 0)
   * @param reverse If true, will sort results newest first. (optional, default to false)
   * @param startTime Starting date filter for results. (optional)
   * @param endTime Ending date filter for results. (optional)
   * @return List[Quote]
   */
  def quoteGetBucketed(binSize: Option[String] = Option("1m"), partial: Option[Boolean] = Option(false), symbol: Option[String] = None, filter: Option[String] = None, columns: Option[String] = None, count: Option[Integer] = Option(100), start: Option[Integer] = Option(0), reverse: Option[Boolean] = Option(false), startTime: Option[Date] = None, endTime: Option[Date] = None): Option[List[Quote]] = {
    val await = Try(Await.result(quoteGetBucketedAsync(binSize, partial, symbol, filter, columns, count, start, reverse, startTime, endTime), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get previous quotes in time buckets. asynchronously
   * Timestamps returned by our bucketed endpoints are the **end** of the period, indicating when the bucket was written to disk. Some other common systems use the timestamp as the beginning of the period. Please be aware of this when using this endpoint.
   *
   * @param binSize Time interval to bucket by. Available options: [1m,5m,1h,1d]. (optional, default to 1m)
   * @param partial If true, will send in-progress (incomplete) bins for the current time period. (optional, default to false)
   * @param symbol Instrument symbol. Send a bare series (e.g. XBT) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBT:quarterly&#x60;. Timeframes are &#x60;nearest&#x60;, &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, &#x60;biquarterly&#x60;, and &#x60;perpetual&#x60;.  Symbols are case-insensitive. (optional)
   * @param filter Generic table filter. Send JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
   * @param columns Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
   * @param count Number of results to fetch. Must be a positive integer. (optional, default to 100)
   * @param start Starting point for results. (optional, default to 0)
   * @param reverse If true, will sort results newest first. (optional, default to false)
   * @param startTime Starting date filter for results. (optional)
   * @param endTime Ending date filter for results. (optional)
   * @return Future(List[Quote])
   */
  def quoteGetBucketedAsync(binSize: Option[String] = Option("1m"), partial: Option[Boolean] = Option(false), symbol: Option[String] = None, filter: Option[String] = None, columns: Option[String] = None, count: Option[Integer] = Option(100), start: Option[Integer] = Option(0), reverse: Option[Boolean] = Option(false), startTime: Option[Date] = None, endTime: Option[Date] = None): Future[List[Quote]] = {
      helper.quoteGetBucketed(binSize, partial, symbol, filter, columns, count, start, reverse, startTime, endTime)
  }

}

class QuoteApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def quoteGet(symbol: Option[String] = None,
    filter: Option[String] = None,
    columns: Option[String] = None,
    count: Option[Integer] = Option(100),
    start: Option[Integer] = Option(0),
    reverse: Option[Boolean] = Option(false),
    startTime: Option[Date] = None,
    endTime: Option[Date] = None
    )(implicit reader: ClientResponseReader[List[Quote]]): Future[List[Quote]] = {
    // create path and map variables
    val path = (addFmt("/quote"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    symbol match {
      case Some(param) => queryParams += "symbol" -> param.toString
      case _ => queryParams
    }
    filter match {
      case Some(param) => queryParams += "filter" -> param.toString
      case _ => queryParams
    }
    columns match {
      case Some(param) => queryParams += "columns" -> param.toString
      case _ => queryParams
    }
    count match {
      case Some(param) => queryParams += "count" -> param.toString
      case _ => queryParams
    }
    start match {
      case Some(param) => queryParams += "start" -> param.toString
      case _ => queryParams
    }
    reverse match {
      case Some(param) => queryParams += "reverse" -> param.toString
      case _ => queryParams
    }
    startTime match {
      case Some(param) => queryParams += "startTime" -> param.toString
      case _ => queryParams
    }
    endTime match {
      case Some(param) => queryParams += "endTime" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def quoteGetBucketed(binSize: Option[String] = Option("1m"),
    partial: Option[Boolean] = Option(false),
    symbol: Option[String] = None,
    filter: Option[String] = None,
    columns: Option[String] = None,
    count: Option[Integer] = Option(100),
    start: Option[Integer] = Option(0),
    reverse: Option[Boolean] = Option(false),
    startTime: Option[Date] = None,
    endTime: Option[Date] = None
    )(implicit reader: ClientResponseReader[List[Quote]]): Future[List[Quote]] = {
    // create path and map variables
    val path = (addFmt("/quote/bucketed"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    binSize match {
      case Some(param) => queryParams += "binSize" -> param.toString
      case _ => queryParams
    }
    partial match {
      case Some(param) => queryParams += "partial" -> param.toString
      case _ => queryParams
    }
    symbol match {
      case Some(param) => queryParams += "symbol" -> param.toString
      case _ => queryParams
    }
    filter match {
      case Some(param) => queryParams += "filter" -> param.toString
      case _ => queryParams
    }
    columns match {
      case Some(param) => queryParams += "columns" -> param.toString
      case _ => queryParams
    }
    count match {
      case Some(param) => queryParams += "count" -> param.toString
      case _ => queryParams
    }
    start match {
      case Some(param) => queryParams += "start" -> param.toString
      case _ => queryParams
    }
    reverse match {
      case Some(param) => queryParams += "reverse" -> param.toString
      case _ => queryParams
    }
    startTime match {
      case Some(param) => queryParams += "startTime" -> param.toString
      case _ => queryParams
    }
    endTime match {
      case Some(param) => queryParams += "endTime" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
