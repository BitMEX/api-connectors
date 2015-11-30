package io.swagger.client.api

import io.swagger.client.model.Order
import io.swagger.client.model.Number
import io.swagger.client.model.Error
import java.util.Date
import io.swagger.client.model.Inline_response_200
import io.swagger.client.model.LiquidationOrder
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class OrderApi(val defBasePath: String = "https://localhost/api/v1",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  
  /**
   * Get your orders.
   * To get open orders only, send {\&quot;open\&quot;: true} in the filter param.
   * @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.
   * @param filter Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.
   * @param columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
   * @param count Number of results to fetch.
   * @param start Starting point for results.
   * @param reverse If true, will sort results newest first.
   * @param startTime Starting date filter for results.
   * @param endTime Ending date filter for results.
   * @return List[Order]
   */
  def orderGetOrders (symbol: String, filter: String, columns: String, count: Number /* = 100 */, start: Number /* = 0 */, reverse: Boolean /* = false */, startTime: Date, endTime: Date) : Option[List[Order]] = {
    // create path and map variables
    val path = "/order".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(symbol) != "null") queryParams += "symbol" -> symbol.toString
    if(String.valueOf(filter) != "null") queryParams += "filter" -> filter.toString
    if(String.valueOf(columns) != "null") queryParams += "columns" -> columns.toString
    if(String.valueOf(count) != "null") queryParams += "count" -> count.toString
    if(String.valueOf(start) != "null") queryParams += "start" -> start.toString
    if(String.valueOf(reverse) != "null") queryParams += "reverse" -> reverse.toString
    if(String.valueOf(startTime) != "null") queryParams += "startTime" -> startTime.toString
    if(String.valueOf(endTime) != "null") queryParams += "endTime" -> endTime.toString
    
    
    

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
           Some(ApiInvoker.deserialize(s, "array", classOf[Order]).asInstanceOf[List[Order]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Create a new order.
   * This endpoint is used for placing orders. Valid order types are &#39;Limit&#39; and &#39;StopLimit&#39;. If none is provided, BitMEX will assume a Limit Order.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix &#39;bmex_mm_&#39; and the UUID &#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39; creates &#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;.\n\nSee the BitMEX &lt;a href=&#39;https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152&#39;&gt;Reference Market Maker&lt;/a&gt; for an example of how to use and generate clOrdIDs.
   * @param symbol Instrument symbol.
   * @param quantity Quantity. Use positive numbers to buy, negative to sell.
   * @param price Order price.
   * @param timeInForce Time in force. Valid options: &#39;IOC&#39; (Immediate-Or-Cancel), &#39;GTC&#39; (Good-Till-Cancelled).
   * @param _type Order type. Available: &#39;Limit&#39;, &#39;StopLimit&#39;
   * @param stopPrice If order type is &#39;StopLimit&#39;, this is the trigger/stop price.
   * @param clOrdID Optional Client Order ID to give this order. This ID will come back on any execution messages tied to this order.
   * @return Order
   */
  def orderNewOrder (symbol: String, quantity: Number, price: Double, timeInForce: String /* = GTC */, _type: String /* = Limit */, stopPrice: Double, clOrdID: String) : Option[Order] = {
    // create path and map variables
    val path = "/order".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("symbol", symbol.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("quantity", quantity.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("price", price.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("timeInForce", timeInForce.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("type", _type.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("stopPrice", stopPrice.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("clOrdID", clOrdID.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "symbol" -> symbol.toString()
      formParams += "quantity" -> quantity.toString()
      formParams += "price" -> price.toString()
      formParams += "timeInForce" -> timeInForce.toString()
      formParams += "type" -> _type.toString()
      formParams += "stopPrice" -> stopPrice.toString()
      formParams += "clOrdID" -> clOrdID.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Order]).asInstanceOf[Order])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Cancel order(s). Send multiple order IDs to cancel in bulk.
   * Either an orderID or a clOrdID must be provided.
   * @param orderID Order ID(s).
   * @param clOrdID Client Order ID(s). See POST /order.
   * @param text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;
   * @return List[Order]
   */
  def orderCancelOrder (orderID: String, clOrdID: String, text: String) : Option[List[Order]] = {
    // create path and map variables
    val path = "/order".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("orderID", orderID.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("clOrdID", clOrdID.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("text", text.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "orderID" -> orderID.toString()
      formParams += "clOrdID" -> clOrdID.toString()
      formParams += "text" -> text.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "array", classOf[Order]).asInstanceOf[List[Order]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Cancels all of your orders.
   * 
   * @param symbol Optional symbol. If provided, only cancels orders for that symbol.
   * @param filter Optional filter for cancellation. Use to only cancel some orders, e.g. `{\&quot;side\&quot;: \&quot;Buy\&quot;}`.
   * @param text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;
   * @return Inline_response_200
   */
  def orderCancelAll (symbol: String, filter: String, text: String) : Option[Inline_response_200] = {
    // create path and map variables
    val path = "/order/all".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("symbol", symbol.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("filter", filter.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("text", text.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "symbol" -> symbol.toString()
      formParams += "filter" -> filter.toString()
      formParams += "text" -> text.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "DELETE", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Inline_response_200]).asInstanceOf[Inline_response_200])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Automatically cancel all your orders after a specified timeout.
   * Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. &lt;br&gt;&lt;br&gt;Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.&lt;br&gt;&lt;br&gt;This is also available via &lt;a href=\&quot;https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-\&quot;&gt;WebSocket&lt;/a&gt;.
   * @param timeout Timeout in ms. Set to 0 to cancel this timer.
   * @return Inline_response_200
   */
  def orderCancelAllAfter (timeout: Double) : Option[Inline_response_200] = {
    // create path and map variables
    val path = "/order/cancelAllAfter".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("timeout", timeout.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "timeout" -> timeout.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Inline_response_200]).asInstanceOf[Inline_response_200])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Close a position with a market order.
   * If no price is specified, a market order will be submitted to close the entirety of your position. Be careful with market orders as you may not be filled at a favorable price.
   * @param symbol Symbol of position to close.
   * @param price Optional limit price.
   * @return Order
   */
  def orderClosePosition (symbol: String, price: Double) : Option[Order] = {
    // create path and map variables
    val path = "/order/closePosition".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("symbol", symbol.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("price", price.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "symbol" -> symbol.toString()
      formParams += "price" -> price.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[Order]).asInstanceOf[Order])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Get open liquidation orders.
   * 
   * @param filter Filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.
   * @return List[LiquidationOrder]
   */
  def orderGetCloseOutOrders (filter: String) : Option[List[LiquidationOrder]] = {
    // create path and map variables
    val path = "/order/liquidations".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    if(String.valueOf(filter) != "null") queryParams += "filter" -> filter.toString
    
    
    

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
           Some(ApiInvoker.deserialize(s, "array", classOf[LiquidationOrder]).asInstanceOf[List[LiquidationOrder]])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
}
