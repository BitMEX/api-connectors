package io.swagger.client.api

import io.swagger.client.model.Order
import io.swagger.client.model.Number
import io.swagger.client.model.Error
import java.util.Date
import io.swagger.client.model.Inline_response_200_1
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
   * To get open orders only, send {\&quot;open\&quot;: true} in the filter param.\n\nSee &lt;a href=\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
   * @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.
   * @param filter Generic table filter. Send JSON key/value pairs, such as `{\&quot;key\&quot;: \&quot;value\&quot;}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.
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
   * Amend the quantity or price of an open order.
   * &lt;p&gt;Send an &lt;code&gt;orderID&lt;/code&gt; or &lt;code&gt;clOrdID&lt;/code&gt; to identify the order you wish to amend.&lt;/p&gt;\n&lt;p&gt;Both order quantity and price can be amended. Only one &lt;code&gt;qty&lt;/code&gt; field can be used to amend.&lt;/p&gt;\n&lt;p&gt;Use the &lt;code&gt;leavesQty&lt;/code&gt; field to specify how much of the order you wish to remain open. This can be useful\nif you want to adjust your position&amp;#39;s delta by a certain amount, regardless of how much of the order has\nalready filled.&lt;/p&gt;\n&lt;p&gt;Use the &lt;code&gt;simpleOrderQty&lt;/code&gt; and &lt;code&gt;simpleLeavesQty&lt;/code&gt; fields to specify order size in Bitcoin, rather than contracts.\nThese fields will round up to the nearest contract.&lt;/p&gt;\n&lt;p&gt;Like order placement, amending can be done in bulk. Simply send a request to &lt;code&gt;PUT /api/v1/order/bulk&lt;/code&gt; with\na JSON body of the shape: &lt;code&gt;{&amp;quot;orders&amp;quot;: [{...}, {...}]}&lt;/code&gt;, each object containing the fields used in this endpoint.&lt;/p&gt;
   * @param orderID Order ID
   * @param clOrdID Client Order ID. See POST /order.
   * @param simpleOrderQty Optional order quantity in units of the underlying instrument (i.e. Bitcoin).
   * @param orderQty Optional order quantity in units of the instrument (i.e. contracts).
   * @param simpleLeavesQty Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders.
   * @param leavesQty Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.
   * @param price Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.
   * @param stopPx Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.
   * @param pegOffsetValue Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.
   * @param text Optional amend annotation. e.g. &#39;Adjust skew&#39;.
   * @return Order
   */
  def orderAmend (orderID: String, clOrdID: String, simpleOrderQty: Double, orderQty: Number, simpleLeavesQty: Double, leavesQty: Number, price: Double, stopPx: Double, pegOffsetValue: Double, text: String) : Option[Order] = {
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
      
      mp.field("simpleOrderQty", simpleOrderQty.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("orderQty", orderQty.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("simpleLeavesQty", simpleLeavesQty.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("leavesQty", leavesQty.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("price", price.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("stopPx", stopPx.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("pegOffsetValue", pegOffsetValue.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("text", text.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "orderID" -> orderID.toString()
      formParams += "clOrdID" -> clOrdID.toString()
      formParams += "simpleOrderQty" -> simpleOrderQty.toString()
      formParams += "orderQty" -> orderQty.toString()
      formParams += "simpleLeavesQty" -> simpleLeavesQty.toString()
      formParams += "leavesQty" -> leavesQty.toString()
      formParams += "price" -> price.toString()
      formParams += "stopPx" -> stopPx.toString()
      formParams += "pegOffsetValue" -> pegOffsetValue.toString()
      formParams += "text" -> text.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
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
   * Create a new order.
   * This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nIf no order type is provided, BitMEX will assume &#39;Limit&#39;.\nBe very careful with &#39;Market&#39; and &#39;Stop&#39; orders as you may be filled at an unfavourable price.\n\nYou can submit bulk orders by POSTing an array of orders to `/api/v1/order/bulk`. Send a JSON payload\nwith the shape: `{\&quot;orders\&quot;: [{...}, {...}]}`, with each inner object containing the same fields that would be\nsent to this endpoint.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order.\nThis clOrdID will come back as a property on the order and any related executions (including on the WebSocket),\nand can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID.\nSome UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix `&#39;bmex_mm_&#39;`\nand the UUID `&#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39;` creates `&#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;`.\n\nSee the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152)\nfor an example of how to use and generate clOrdIDs.
   * @param symbol Instrument symbol. e.g. &#39;XBT24H&#39;.
   * @param side Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless `orderQty` or `simpleOrderQty` is negative.
   * @param simpleOrderQty Order quantity in units of the underlying instrument (i.e. Bitcoin).
   * @param quantity Deprecated: use `orderQty`.
   * @param orderQty Order quantity in units of the instrument (i.e. contracts).
   * @param price Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.
   * @param displayQty Optional quantity to display in the book. Use 0 for a hidden order.
   * @param stopPrice Deprecated: use `stopPx`.
   * @param stopPx Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering.
   * @param clOrdID Optional Client Order ID. This clOrdID will come back on the order and any related executions.
   * @param clOrdLinkID Optional Client Order Link ID for contingent orders.
   * @param pegOffsetValue Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.
   * @param pegPriceType Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg.
   * @param _type Deprecated: use `ordType`.
   * @param ordType Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to &#39;Limit&#39; when `price` is specified. Defaults to &#39;Stop&#39; when `stopPx` is specified. Defaults to &#39;StopLimit&#39; when `price` and `stopPx` are specified.
   * @param timeInForce Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, &#39;LimitIfTouched&#39;, and &#39;MarketWithLeftOverAsLimit&#39; orders.
   * @param execInst Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. &#39;AllOrNone&#39; instruction requires `displayQty` to be 0. &#39;MarkPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders.
   * @param contingencyType Optional contingency type for use with `clOrdLinkID`. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional.
   * @param text Optional order annotation. e.g. &#39;Take profit&#39;.
   * @return Order
   */
  def orderNew (symbol: String, side: String, simpleOrderQty: Double, quantity: Number, orderQty: Number, price: Double, displayQty: Number, stopPrice: Double, stopPx: Double, clOrdID: String, clOrdLinkID: String, pegOffsetValue: Double, pegPriceType: String, _type: String, ordType: String /* = Limit */, timeInForce: String, execInst: String, contingencyType: String, text: String) : Option[Order] = {
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
      
      mp.field("side", side.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("simpleOrderQty", simpleOrderQty.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("quantity", quantity.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("orderQty", orderQty.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("price", price.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("displayQty", displayQty.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("stopPrice", stopPrice.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("stopPx", stopPx.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("clOrdID", clOrdID.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("clOrdLinkID", clOrdLinkID.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("pegOffsetValue", pegOffsetValue.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("pegPriceType", pegPriceType.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("type", _type.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("ordType", ordType.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("timeInForce", timeInForce.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("execInst", execInst.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("contingencyType", contingencyType.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      mp.field("text", text.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "symbol" -> symbol.toString()
      formParams += "side" -> side.toString()
      formParams += "simpleOrderQty" -> simpleOrderQty.toString()
      formParams += "quantity" -> quantity.toString()
      formParams += "orderQty" -> orderQty.toString()
      formParams += "price" -> price.toString()
      formParams += "displayQty" -> displayQty.toString()
      formParams += "stopPrice" -> stopPrice.toString()
      formParams += "stopPx" -> stopPx.toString()
      formParams += "clOrdID" -> clOrdID.toString()
      formParams += "clOrdLinkID" -> clOrdLinkID.toString()
      formParams += "pegOffsetValue" -> pegOffsetValue.toString()
      formParams += "pegPriceType" -> pegPriceType.toString()
      formParams += "type" -> _type.toString()
      formParams += "ordType" -> ordType.toString()
      formParams += "timeInForce" -> timeInForce.toString()
      formParams += "execInst" -> execInst.toString()
      formParams += "contingencyType" -> contingencyType.toString()
      formParams += "text" -> text.toString()
      
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
   * @param text Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;.
   * @return List[Order]
   */
  def orderCancel (orderID: String, clOrdID: String, text: String) : Option[List[Order]] = {
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
   * @return Inline_response_200_1
   */
  def orderCancelAll (symbol: String, filter: String, text: String) : Option[Inline_response_200_1] = {
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
           Some(ApiInvoker.deserialize(s, "", classOf[Inline_response_200_1]).asInstanceOf[Inline_response_200_1])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Amend multiple orders.
   * Similar to POST /amend, but with multiple orders. `application/json` only. Ratelimited at 50%.
   * @param orders An array of orders.
   * @return List[Order]
   */
  def orderAmendBulk (orders: String) : Option[List[Order]] = {
    // create path and map variables
    val path = "/order/bulk".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("orders", orders.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "orders" -> orders.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "PUT", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
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
   * Create multiple new orders.
   * This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nEach individual order object in the array should have the same properties as an individual POST /order call.\n\nThis endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX\nsystems, this endpoint is ratelimited at `ceil(0.5 * orders)`. Submitting 10 orders via a bulk order call\nwill only count as 5 requests.\n\nFor now, only `application/json` is supported on this endpoint.
   * @param orders An array of orders.
   * @return List[Order]
   */
  def orderNewBulk (orders: String) : Option[List[Order]] = {
    // create path and map variables
    val path = "/order/bulk".replaceAll("\\{format\\}","json")

    val contentTypes = List("application/json", "application/x-www-form-urlencoded", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    

    
    
    

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      mp.field("orders", orders.toString(), MediaType.MULTIPART_FORM_DATA_TYPE)
      
      postBody = mp
    }
    else {
      formParams += "orders" -> orders.toString()
      
    }

    try {
      apiInvoker.invokeApi(basePath, path, "POST", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
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
   * Automatically cancel all your orders after a specified timeout.
   * Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage.\nIf called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.\n\nExample usage: call this route at 15s intervals with an offset of 60000 (60s).\nIf this route is not called within 60 seconds, all your orders will be automatically canceled.\n\nThis is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-).
   * @param timeout Timeout in ms. Set to 0 to cancel this timer.
   * @return Inline_response_200_1
   */
  def orderCancelAllAfter (timeout: Double) : Option[Inline_response_200_1] = {
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
           Some(ApiInvoker.deserialize(s, "", classOf[Inline_response_200_1]).asInstanceOf[Inline_response_200_1])
         
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }
  
  /**
   * Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]
   * If no `price` is specified, a market order will be submitted to close the whole of your position. + This will also close all other open orders in this symbol.
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
  
}
