using System;
using System.IO;
using System.Collections.Generic;
using RestSharp;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IOrderApi
    {
        
        /// <summary>
        /// Get your orders.
        /// </summary>
        /// <remarks>
        /// To get open orders only, send {\&quot;open\&quot;: true} in the filter param.\n\nSee &lt;a href=\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
        /// </remarks>
        /// <param name="symbol">Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.</param>
        /// <param name="filter">Generic table filter. Send JSON key/value pairs, such as `{\&quot;key\&quot;: \&quot;value\&quot;}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.</param>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.</param>
        /// <param name="count">Number of results to fetch.</param>
        /// <param name="start">Starting point for results.</param>
        /// <param name="reverse">If true, will sort results newest first.</param>
        /// <param name="startTime">Starting date filter for results.</param>
        /// <param name="endTime">Ending date filter for results.</param>
        /// <returns></returns>
        List<Order> OrderGetOrders (string symbol = null, string filter = null, string columns = null, double? count = null, double? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null);
  
        /// <summary>
        /// Get your orders.
        /// </summary>
        /// <remarks>
        /// To get open orders only, send {\&quot;open\&quot;: true} in the filter param.\n\nSee &lt;a href=\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
        /// </remarks>
        /// <param name="symbol">Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.</param>
        /// <param name="filter">Generic table filter. Send JSON key/value pairs, such as `{\&quot;key\&quot;: \&quot;value\&quot;}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.</param>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.</param>
        /// <param name="count">Number of results to fetch.</param>
        /// <param name="start">Starting point for results.</param>
        /// <param name="reverse">If true, will sort results newest first.</param>
        /// <param name="startTime">Starting date filter for results.</param>
        /// <param name="endTime">Ending date filter for results.</param>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<Order>> OrderGetOrdersAsync (string symbol = null, string filter = null, string columns = null, double? count = null, double? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null);
        
        /// <summary>
        /// Amend the quantity or price of an open order.
        /// </summary>
        /// <remarks>
        /// &lt;p&gt;Send an &lt;code&gt;orderID&lt;/code&gt; or &lt;code&gt;clOrdID&lt;/code&gt; to identify the order you wish to amend.&lt;/p&gt;\n&lt;p&gt;Both order quantity and price can be amended. Only one &lt;code&gt;qty&lt;/code&gt; field can be used to amend.&lt;/p&gt;\n&lt;p&gt;Use the &lt;code&gt;leavesQty&lt;/code&gt; field to specify how much of the order you wish to remain open. This can be useful\nif you want to adjust your position&amp;#39;s delta by a certain amount, regardless of how much of the order has\nalready filled.&lt;/p&gt;\n&lt;p&gt;Use the &lt;code&gt;simpleOrderQty&lt;/code&gt; and &lt;code&gt;simpleLeavesQty&lt;/code&gt; fields to specify order size in Bitcoin, rather than contracts.\nThese fields will round up to the nearest contract.&lt;/p&gt;\n&lt;p&gt;Like order placement, amending can be done in bulk. Simply send a request to &lt;code&gt;PUT /api/v1/order/bulk&lt;/code&gt; with\na JSON body of the shape: &lt;code&gt;{&amp;quot;orders&amp;quot;: [{...}, {...}]}&lt;/code&gt;, each object containing the fields used in this endpoint.&lt;/p&gt;
        /// </remarks>
        /// <param name="orderID">Order ID</param>
        /// <param name="clOrdID">Client Order ID. See POST /order.</param>
        /// <param name="simpleOrderQty">Optional order quantity in units of the underlying instrument (i.e. Bitcoin).</param>
        /// <param name="orderQty">Optional order quantity in units of the instrument (i.e. contracts).</param>
        /// <param name="simpleLeavesQty">Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders.</param>
        /// <param name="leavesQty">Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.</param>
        /// <param name="price">Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.</param>
        /// <param name="stopPx">Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.</param>
        /// <param name="pegOffsetValue">Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.</param>
        /// <param name="text">Optional amend annotation. e.g. &#39;Adjust skew&#39;.</param>
        /// <returns>Order</returns>
        Order OrderAmend (string orderID = null, string clOrdID = null, double? simpleOrderQty = null, double? orderQty = null, double? simpleLeavesQty = null, double? leavesQty = null, double? price = null, double? stopPx = null, double? pegOffsetValue = null, string text = null);
  
        /// <summary>
        /// Amend the quantity or price of an open order.
        /// </summary>
        /// <remarks>
        /// &lt;p&gt;Send an &lt;code&gt;orderID&lt;/code&gt; or &lt;code&gt;clOrdID&lt;/code&gt; to identify the order you wish to amend.&lt;/p&gt;\n&lt;p&gt;Both order quantity and price can be amended. Only one &lt;code&gt;qty&lt;/code&gt; field can be used to amend.&lt;/p&gt;\n&lt;p&gt;Use the &lt;code&gt;leavesQty&lt;/code&gt; field to specify how much of the order you wish to remain open. This can be useful\nif you want to adjust your position&amp;#39;s delta by a certain amount, regardless of how much of the order has\nalready filled.&lt;/p&gt;\n&lt;p&gt;Use the &lt;code&gt;simpleOrderQty&lt;/code&gt; and &lt;code&gt;simpleLeavesQty&lt;/code&gt; fields to specify order size in Bitcoin, rather than contracts.\nThese fields will round up to the nearest contract.&lt;/p&gt;\n&lt;p&gt;Like order placement, amending can be done in bulk. Simply send a request to &lt;code&gt;PUT /api/v1/order/bulk&lt;/code&gt; with\na JSON body of the shape: &lt;code&gt;{&amp;quot;orders&amp;quot;: [{...}, {...}]}&lt;/code&gt;, each object containing the fields used in this endpoint.&lt;/p&gt;
        /// </remarks>
        /// <param name="orderID">Order ID</param>
        /// <param name="clOrdID">Client Order ID. See POST /order.</param>
        /// <param name="simpleOrderQty">Optional order quantity in units of the underlying instrument (i.e. Bitcoin).</param>
        /// <param name="orderQty">Optional order quantity in units of the instrument (i.e. contracts).</param>
        /// <param name="simpleLeavesQty">Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders.</param>
        /// <param name="leavesQty">Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.</param>
        /// <param name="price">Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.</param>
        /// <param name="stopPx">Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.</param>
        /// <param name="pegOffsetValue">Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.</param>
        /// <param name="text">Optional amend annotation. e.g. &#39;Adjust skew&#39;.</param>
        /// <returns>Order</returns>
        System.Threading.Tasks.Task<Order> OrderAmendAsync (string orderID = null, string clOrdID = null, double? simpleOrderQty = null, double? orderQty = null, double? simpleLeavesQty = null, double? leavesQty = null, double? price = null, double? stopPx = null, double? pegOffsetValue = null, string text = null);
        
        /// <summary>
        /// Create a new order.
        /// </summary>
        /// <remarks>
        /// This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nIf no order type is provided, BitMEX will assume &#39;Limit&#39;.\nBe very careful with &#39;Market&#39; and &#39;Stop&#39; orders as you may be filled at an unfavourable price.\n\nYou can submit bulk orders by POSTing an array of orders to `/api/v1/order/bulk`. Send a JSON payload\nwith the shape: `{\&quot;orders\&quot;: [{...}, {...}]}`, with each inner object containing the same fields that would be\nsent to this endpoint.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order.\nThis clOrdID will come back as a property on the order and any related executions (including on the WebSocket),\nand can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID.\nSome UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix `&#39;bmex_mm_&#39;`\nand the UUID `&#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39;` creates `&#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;`.\n\nSee the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152)\nfor an example of how to use and generate clOrdIDs.
        /// </remarks>
        /// <param name="symbol">Instrument symbol. e.g. &#39;XBT24H&#39;.</param>
        /// <param name="side">Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless `orderQty` or `simpleOrderQty` is negative.</param>
        /// <param name="simpleOrderQty">Order quantity in units of the underlying instrument (i.e. Bitcoin).</param>
        /// <param name="quantity">Deprecated: use `orderQty`.</param>
        /// <param name="orderQty">Order quantity in units of the instrument (i.e. contracts).</param>
        /// <param name="price">Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.</param>
        /// <param name="displayQty">Optional quantity to display in the book. Use 0 for a hidden order.</param>
        /// <param name="stopPrice">Deprecated: use `stopPx`.</param>
        /// <param name="stopPx">Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering.</param>
        /// <param name="clOrdID">Optional Client Order ID. This clOrdID will come back on the order and any related executions.</param>
        /// <param name="clOrdLinkID">Optional Client Order Link ID for contingent orders.</param>
        /// <param name="pegOffsetValue">Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.</param>
        /// <param name="pegPriceType">Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg.</param>
        /// <param name="type">Deprecated: use `ordType`.</param>
        /// <param name="ordType">Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to &#39;Limit&#39; when `price` is specified. Defaults to &#39;Stop&#39; when `stopPx` is specified. Defaults to &#39;StopLimit&#39; when `price` and `stopPx` are specified.</param>
        /// <param name="timeInForce">Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, &#39;LimitIfTouched&#39;, and &#39;MarketWithLeftOverAsLimit&#39; orders.</param>
        /// <param name="execInst">Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. &#39;AllOrNone&#39; instruction requires `displayQty` to be 0. &#39;MarkPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders.</param>
        /// <param name="contingencyType">Optional contingency type for use with `clOrdLinkID`. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional.</param>
        /// <param name="text">Optional order annotation. e.g. &#39;Take profit&#39;.</param>
        /// <returns>Order</returns>
        Order OrderNew (string symbol, string side = null, double? simpleOrderQty = null, double? quantity = null, double? orderQty = null, double? price = null, double? displayQty = null, double? stopPrice = null, double? stopPx = null, string clOrdID = null, string clOrdLinkID = null, double? pegOffsetValue = null, string pegPriceType = null, string type = null, string ordType = null, string timeInForce = null, string execInst = null, string contingencyType = null, string text = null);
  
        /// <summary>
        /// Create a new order.
        /// </summary>
        /// <remarks>
        /// This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nIf no order type is provided, BitMEX will assume &#39;Limit&#39;.\nBe very careful with &#39;Market&#39; and &#39;Stop&#39; orders as you may be filled at an unfavourable price.\n\nYou can submit bulk orders by POSTing an array of orders to `/api/v1/order/bulk`. Send a JSON payload\nwith the shape: `{\&quot;orders\&quot;: [{...}, {...}]}`, with each inner object containing the same fields that would be\nsent to this endpoint.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order.\nThis clOrdID will come back as a property on the order and any related executions (including on the WebSocket),\nand can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID.\nSome UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix `&#39;bmex_mm_&#39;`\nand the UUID `&#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39;` creates `&#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;`.\n\nSee the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152)\nfor an example of how to use and generate clOrdIDs.
        /// </remarks>
        /// <param name="symbol">Instrument symbol. e.g. &#39;XBT24H&#39;.</param>
        /// <param name="side">Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless `orderQty` or `simpleOrderQty` is negative.</param>
        /// <param name="simpleOrderQty">Order quantity in units of the underlying instrument (i.e. Bitcoin).</param>
        /// <param name="quantity">Deprecated: use `orderQty`.</param>
        /// <param name="orderQty">Order quantity in units of the instrument (i.e. contracts).</param>
        /// <param name="price">Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.</param>
        /// <param name="displayQty">Optional quantity to display in the book. Use 0 for a hidden order.</param>
        /// <param name="stopPrice">Deprecated: use `stopPx`.</param>
        /// <param name="stopPx">Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering.</param>
        /// <param name="clOrdID">Optional Client Order ID. This clOrdID will come back on the order and any related executions.</param>
        /// <param name="clOrdLinkID">Optional Client Order Link ID for contingent orders.</param>
        /// <param name="pegOffsetValue">Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.</param>
        /// <param name="pegPriceType">Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg.</param>
        /// <param name="type">Deprecated: use `ordType`.</param>
        /// <param name="ordType">Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to &#39;Limit&#39; when `price` is specified. Defaults to &#39;Stop&#39; when `stopPx` is specified. Defaults to &#39;StopLimit&#39; when `price` and `stopPx` are specified.</param>
        /// <param name="timeInForce">Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, &#39;LimitIfTouched&#39;, and &#39;MarketWithLeftOverAsLimit&#39; orders.</param>
        /// <param name="execInst">Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. &#39;AllOrNone&#39; instruction requires `displayQty` to be 0. &#39;MarkPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders.</param>
        /// <param name="contingencyType">Optional contingency type for use with `clOrdLinkID`. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional.</param>
        /// <param name="text">Optional order annotation. e.g. &#39;Take profit&#39;.</param>
        /// <returns>Order</returns>
        System.Threading.Tasks.Task<Order> OrderNewAsync (string symbol, string side = null, double? simpleOrderQty = null, double? quantity = null, double? orderQty = null, double? price = null, double? displayQty = null, double? stopPrice = null, double? stopPx = null, string clOrdID = null, string clOrdLinkID = null, double? pegOffsetValue = null, string pegPriceType = null, string type = null, string ordType = null, string timeInForce = null, string execInst = null, string contingencyType = null, string text = null);
        
        /// <summary>
        /// Cancel order(s). Send multiple order IDs to cancel in bulk.
        /// </summary>
        /// <remarks>
        /// Either an orderID or a clOrdID must be provided.
        /// </remarks>
        /// <param name="orderID">Order ID(s).</param>
        /// <param name="clOrdID">Client Order ID(s). See POST /order.</param>
        /// <param name="text">Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;.</param>
        /// <returns></returns>
        List<Order> OrderCancel (string orderID = null, string clOrdID = null, string text = null);
  
        /// <summary>
        /// Cancel order(s). Send multiple order IDs to cancel in bulk.
        /// </summary>
        /// <remarks>
        /// Either an orderID or a clOrdID must be provided.
        /// </remarks>
        /// <param name="orderID">Order ID(s).</param>
        /// <param name="clOrdID">Client Order ID(s). See POST /order.</param>
        /// <param name="text">Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;.</param>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<Order>> OrderCancelAsync (string orderID = null, string clOrdID = null, string text = null);
        
        /// <summary>
        /// Cancels all of your orders.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="symbol">Optional symbol. If provided, only cancels orders for that symbol.</param>
        /// <param name="filter">Optional filter for cancellation. Use to only cancel some orders, e.g. `{\&quot;side\&quot;: \&quot;Buy\&quot;}`.</param>
        /// <param name="text">Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;</param>
        /// <returns>InlineResponse2001</returns>
        InlineResponse2001 OrderCancelAll (string symbol = null, string filter = null, string text = null);
  
        /// <summary>
        /// Cancels all of your orders.
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="symbol">Optional symbol. If provided, only cancels orders for that symbol.</param>
        /// <param name="filter">Optional filter for cancellation. Use to only cancel some orders, e.g. `{\&quot;side\&quot;: \&quot;Buy\&quot;}`.</param>
        /// <param name="text">Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;</param>
        /// <returns>InlineResponse2001</returns>
        System.Threading.Tasks.Task<InlineResponse2001> OrderCancelAllAsync (string symbol = null, string filter = null, string text = null);
        
        /// <summary>
        /// Amend multiple orders.
        /// </summary>
        /// <remarks>
        /// Similar to POST /amend, but with multiple orders. `application/json` only. Ratelimited at 50%.
        /// </remarks>
        /// <param name="orders">An array of orders.</param>
        /// <returns></returns>
        List<Order> OrderAmendBulk (string orders = null);
  
        /// <summary>
        /// Amend multiple orders.
        /// </summary>
        /// <remarks>
        /// Similar to POST /amend, but with multiple orders. `application/json` only. Ratelimited at 50%.
        /// </remarks>
        /// <param name="orders">An array of orders.</param>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<Order>> OrderAmendBulkAsync (string orders = null);
        
        /// <summary>
        /// Create multiple new orders.
        /// </summary>
        /// <remarks>
        /// This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nEach individual order object in the array should have the same properties as an individual POST /order call.\n\nThis endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX\nsystems, this endpoint is ratelimited at `ceil(0.5 * orders)`. Submitting 10 orders via a bulk order call\nwill only count as 5 requests.\n\nFor now, only `application/json` is supported on this endpoint.
        /// </remarks>
        /// <param name="orders">An array of orders.</param>
        /// <returns></returns>
        List<Order> OrderNewBulk (string orders = null);
  
        /// <summary>
        /// Create multiple new orders.
        /// </summary>
        /// <remarks>
        /// This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nEach individual order object in the array should have the same properties as an individual POST /order call.\n\nThis endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX\nsystems, this endpoint is ratelimited at `ceil(0.5 * orders)`. Submitting 10 orders via a bulk order call\nwill only count as 5 requests.\n\nFor now, only `application/json` is supported on this endpoint.
        /// </remarks>
        /// <param name="orders">An array of orders.</param>
        /// <returns></returns>
        System.Threading.Tasks.Task<List<Order>> OrderNewBulkAsync (string orders = null);
        
        /// <summary>
        /// Automatically cancel all your orders after a specified timeout.
        /// </summary>
        /// <remarks>
        /// Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage.\nIf called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.\n\nExample usage: call this route at 15s intervals with an offset of 60000 (60s).\nIf this route is not called within 60 seconds, all your orders will be automatically canceled.\n\nThis is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-).
        /// </remarks>
        /// <param name="timeout">Timeout in ms. Set to 0 to cancel this timer.</param>
        /// <returns>InlineResponse2001</returns>
        InlineResponse2001 OrderCancelAllAfter (double? timeout);
  
        /// <summary>
        /// Automatically cancel all your orders after a specified timeout.
        /// </summary>
        /// <remarks>
        /// Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage.\nIf called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.\n\nExample usage: call this route at 15s intervals with an offset of 60000 (60s).\nIf this route is not called within 60 seconds, all your orders will be automatically canceled.\n\nThis is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-).
        /// </remarks>
        /// <param name="timeout">Timeout in ms. Set to 0 to cancel this timer.</param>
        /// <returns>InlineResponse2001</returns>
        System.Threading.Tasks.Task<InlineResponse2001> OrderCancelAllAfterAsync (double? timeout);
        
        /// <summary>
        /// Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]
        /// </summary>
        /// <remarks>
        /// If no `price` is specified, a market order will be submitted to close the whole of your position. + This will also close all other open orders in this symbol.
        /// </remarks>
        /// <param name="symbol">Symbol of position to close.</param>
        /// <param name="price">Optional limit price.</param>
        /// <returns>Order</returns>
        Order OrderClosePosition (string symbol, double? price = null);
  
        /// <summary>
        /// Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;]
        /// </summary>
        /// <remarks>
        /// If no `price` is specified, a market order will be submitted to close the whole of your position. + This will also close all other open orders in this symbol.
        /// </remarks>
        /// <param name="symbol">Symbol of position to close.</param>
        /// <param name="price">Optional limit price.</param>
        /// <returns>Order</returns>
        System.Threading.Tasks.Task<Order> OrderClosePositionAsync (string symbol, double? price = null);
        
    }
  
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class OrderApi : IOrderApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public OrderApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient; 
            else
                this.ApiClient = apiClient;
        }
    
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderApi"/> class.
        /// </summary>
        /// <returns></returns>
        public OrderApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }
    
        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }
    
        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.ApiClient.BasePath;
        }
    
        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}
    
        
        /// <summary>
        /// Get your orders. To get open orders only, send {\&quot;open\&quot;: true} in the filter param.\n\nSee &lt;a href=\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
        /// </summary>
        /// <param name="symbol">Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.</param> 
        /// <param name="filter">Generic table filter. Send JSON key/value pairs, such as `{\&quot;key\&quot;: \&quot;value\&quot;}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.</param> 
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.</param> 
        /// <param name="count">Number of results to fetch.</param> 
        /// <param name="start">Starting point for results.</param> 
        /// <param name="reverse">If true, will sort results newest first.</param> 
        /// <param name="startTime">Starting date filter for results.</param> 
        /// <param name="endTime">Ending date filter for results.</param> 
        /// <returns></returns>            
        public List<Order> OrderGetOrders (string symbol = null, string filter = null, string columns = null, double? count = null, double? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null)
        {
            
    
            var path_ = "/order";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            if (symbol != null) queryParams.Add("symbol", ApiClient.ParameterToString(symbol)); // query parameter
            if (filter != null) queryParams.Add("filter", ApiClient.ParameterToString(filter)); // query parameter
            if (columns != null) queryParams.Add("columns", ApiClient.ParameterToString(columns)); // query parameter
            if (count != null) queryParams.Add("count", ApiClient.ParameterToString(count)); // query parameter
            if (start != null) queryParams.Add("start", ApiClient.ParameterToString(start)); // query parameter
            if (reverse != null) queryParams.Add("reverse", ApiClient.ParameterToString(reverse)); // query parameter
            if (startTime != null) queryParams.Add("startTime", ApiClient.ParameterToString(startTime)); // query parameter
            if (endTime != null) queryParams.Add("endTime", ApiClient.ParameterToString(endTime)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderGetOrders: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderGetOrders: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Order>) ApiClient.Deserialize(response, typeof(List<Order>));
        }
    
        /// <summary>
        /// Get your orders. To get open orders only, send {\&quot;open\&quot;: true} in the filter param.\n\nSee &lt;a href=\&quot;http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\&quot;&gt;the FIX Spec&lt;/a&gt; for explanations of these fields.
        /// </summary>
        /// <param name="symbol">Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.</param>
        /// <param name="filter">Generic table filter. Send JSON key/value pairs, such as `{\&quot;key\&quot;: \&quot;value\&quot;}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.</param>
        /// <param name="columns">Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.</param>
        /// <param name="count">Number of results to fetch.</param>
        /// <param name="start">Starting point for results.</param>
        /// <param name="reverse">If true, will sort results newest first.</param>
        /// <param name="startTime">Starting date filter for results.</param>
        /// <param name="endTime">Ending date filter for results.</param>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<Order>> OrderGetOrdersAsync (string symbol = null, string filter = null, string columns = null, double? count = null, double? start = null, bool? reverse = null, DateTime? startTime = null, DateTime? endTime = null)
        {
            
    
            var path_ = "/order";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            if (symbol != null) queryParams.Add("symbol", ApiClient.ParameterToString(symbol)); // query parameter
            if (filter != null) queryParams.Add("filter", ApiClient.ParameterToString(filter)); // query parameter
            if (columns != null) queryParams.Add("columns", ApiClient.ParameterToString(columns)); // query parameter
            if (count != null) queryParams.Add("count", ApiClient.ParameterToString(count)); // query parameter
            if (start != null) queryParams.Add("start", ApiClient.ParameterToString(start)); // query parameter
            if (reverse != null) queryParams.Add("reverse", ApiClient.ParameterToString(reverse)); // query parameter
            if (startTime != null) queryParams.Add("startTime", ApiClient.ParameterToString(startTime)); // query parameter
            if (endTime != null) queryParams.Add("endTime", ApiClient.ParameterToString(endTime)); // query parameter
            
            
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderGetOrders: " + response.Content, response.Content);

            return (List<Order>) ApiClient.Deserialize(response, typeof(List<Order>));
        }
        
        /// <summary>
        /// Amend the quantity or price of an open order. &lt;p&gt;Send an &lt;code&gt;orderID&lt;/code&gt; or &lt;code&gt;clOrdID&lt;/code&gt; to identify the order you wish to amend.&lt;/p&gt;\n&lt;p&gt;Both order quantity and price can be amended. Only one &lt;code&gt;qty&lt;/code&gt; field can be used to amend.&lt;/p&gt;\n&lt;p&gt;Use the &lt;code&gt;leavesQty&lt;/code&gt; field to specify how much of the order you wish to remain open. This can be useful\nif you want to adjust your position&amp;#39;s delta by a certain amount, regardless of how much of the order has\nalready filled.&lt;/p&gt;\n&lt;p&gt;Use the &lt;code&gt;simpleOrderQty&lt;/code&gt; and &lt;code&gt;simpleLeavesQty&lt;/code&gt; fields to specify order size in Bitcoin, rather than contracts.\nThese fields will round up to the nearest contract.&lt;/p&gt;\n&lt;p&gt;Like order placement, amending can be done in bulk. Simply send a request to &lt;code&gt;PUT /api/v1/order/bulk&lt;/code&gt; with\na JSON body of the shape: &lt;code&gt;{&amp;quot;orders&amp;quot;: [{...}, {...}]}&lt;/code&gt;, each object containing the fields used in this endpoint.&lt;/p&gt;
        /// </summary>
        /// <param name="orderID">Order ID</param> 
        /// <param name="clOrdID">Client Order ID. See POST /order.</param> 
        /// <param name="simpleOrderQty">Optional order quantity in units of the underlying instrument (i.e. Bitcoin).</param> 
        /// <param name="orderQty">Optional order quantity in units of the instrument (i.e. contracts).</param> 
        /// <param name="simpleLeavesQty">Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders.</param> 
        /// <param name="leavesQty">Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.</param> 
        /// <param name="price">Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.</param> 
        /// <param name="stopPx">Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.</param> 
        /// <param name="pegOffsetValue">Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.</param> 
        /// <param name="text">Optional amend annotation. e.g. &#39;Adjust skew&#39;.</param> 
        /// <returns>Order</returns>            
        public Order OrderAmend (string orderID = null, string clOrdID = null, double? simpleOrderQty = null, double? orderQty = null, double? simpleLeavesQty = null, double? leavesQty = null, double? price = null, double? stopPx = null, double? pegOffsetValue = null, string text = null)
        {
            
    
            var path_ = "/order";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (orderID != null) formParams.Add("orderID", ApiClient.ParameterToString(orderID)); // form parameter
            if (clOrdID != null) formParams.Add("clOrdID", ApiClient.ParameterToString(clOrdID)); // form parameter
            if (simpleOrderQty != null) formParams.Add("simpleOrderQty", ApiClient.ParameterToString(simpleOrderQty)); // form parameter
            if (orderQty != null) formParams.Add("orderQty", ApiClient.ParameterToString(orderQty)); // form parameter
            if (simpleLeavesQty != null) formParams.Add("simpleLeavesQty", ApiClient.ParameterToString(simpleLeavesQty)); // form parameter
            if (leavesQty != null) formParams.Add("leavesQty", ApiClient.ParameterToString(leavesQty)); // form parameter
            if (price != null) formParams.Add("price", ApiClient.ParameterToString(price)); // form parameter
            if (stopPx != null) formParams.Add("stopPx", ApiClient.ParameterToString(stopPx)); // form parameter
            if (pegOffsetValue != null) formParams.Add("pegOffsetValue", ApiClient.ParameterToString(pegOffsetValue)); // form parameter
            if (text != null) formParams.Add("text", ApiClient.ParameterToString(text)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderAmend: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderAmend: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Order) ApiClient.Deserialize(response, typeof(Order));
        }
    
        /// <summary>
        /// Amend the quantity or price of an open order. &lt;p&gt;Send an &lt;code&gt;orderID&lt;/code&gt; or &lt;code&gt;clOrdID&lt;/code&gt; to identify the order you wish to amend.&lt;/p&gt;\n&lt;p&gt;Both order quantity and price can be amended. Only one &lt;code&gt;qty&lt;/code&gt; field can be used to amend.&lt;/p&gt;\n&lt;p&gt;Use the &lt;code&gt;leavesQty&lt;/code&gt; field to specify how much of the order you wish to remain open. This can be useful\nif you want to adjust your position&amp;#39;s delta by a certain amount, regardless of how much of the order has\nalready filled.&lt;/p&gt;\n&lt;p&gt;Use the &lt;code&gt;simpleOrderQty&lt;/code&gt; and &lt;code&gt;simpleLeavesQty&lt;/code&gt; fields to specify order size in Bitcoin, rather than contracts.\nThese fields will round up to the nearest contract.&lt;/p&gt;\n&lt;p&gt;Like order placement, amending can be done in bulk. Simply send a request to &lt;code&gt;PUT /api/v1/order/bulk&lt;/code&gt; with\na JSON body of the shape: &lt;code&gt;{&amp;quot;orders&amp;quot;: [{...}, {...}]}&lt;/code&gt;, each object containing the fields used in this endpoint.&lt;/p&gt;
        /// </summary>
        /// <param name="orderID">Order ID</param>
        /// <param name="clOrdID">Client Order ID. See POST /order.</param>
        /// <param name="simpleOrderQty">Optional order quantity in units of the underlying instrument (i.e. Bitcoin).</param>
        /// <param name="orderQty">Optional order quantity in units of the instrument (i.e. contracts).</param>
        /// <param name="simpleLeavesQty">Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders.</param>
        /// <param name="leavesQty">Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.</param>
        /// <param name="price">Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.</param>
        /// <param name="stopPx">Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.</param>
        /// <param name="pegOffsetValue">Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.</param>
        /// <param name="text">Optional amend annotation. e.g. &#39;Adjust skew&#39;.</param>
        /// <returns>Order</returns>
        public async System.Threading.Tasks.Task<Order> OrderAmendAsync (string orderID = null, string clOrdID = null, double? simpleOrderQty = null, double? orderQty = null, double? simpleLeavesQty = null, double? leavesQty = null, double? price = null, double? stopPx = null, double? pegOffsetValue = null, string text = null)
        {
            
    
            var path_ = "/order";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (orderID != null) formParams.Add("orderID", ApiClient.ParameterToString(orderID)); // form parameter
            if (clOrdID != null) formParams.Add("clOrdID", ApiClient.ParameterToString(clOrdID)); // form parameter
            if (simpleOrderQty != null) formParams.Add("simpleOrderQty", ApiClient.ParameterToString(simpleOrderQty)); // form parameter
            if (orderQty != null) formParams.Add("orderQty", ApiClient.ParameterToString(orderQty)); // form parameter
            if (simpleLeavesQty != null) formParams.Add("simpleLeavesQty", ApiClient.ParameterToString(simpleLeavesQty)); // form parameter
            if (leavesQty != null) formParams.Add("leavesQty", ApiClient.ParameterToString(leavesQty)); // form parameter
            if (price != null) formParams.Add("price", ApiClient.ParameterToString(price)); // form parameter
            if (stopPx != null) formParams.Add("stopPx", ApiClient.ParameterToString(stopPx)); // form parameter
            if (pegOffsetValue != null) formParams.Add("pegOffsetValue", ApiClient.ParameterToString(pegOffsetValue)); // form parameter
            if (text != null) formParams.Add("text", ApiClient.ParameterToString(text)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderAmend: " + response.Content, response.Content);

            return (Order) ApiClient.Deserialize(response, typeof(Order));
        }
        
        /// <summary>
        /// Create a new order. This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nIf no order type is provided, BitMEX will assume &#39;Limit&#39;.\nBe very careful with &#39;Market&#39; and &#39;Stop&#39; orders as you may be filled at an unfavourable price.\n\nYou can submit bulk orders by POSTing an array of orders to `/api/v1/order/bulk`. Send a JSON payload\nwith the shape: `{\&quot;orders\&quot;: [{...}, {...}]}`, with each inner object containing the same fields that would be\nsent to this endpoint.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order.\nThis clOrdID will come back as a property on the order and any related executions (including on the WebSocket),\nand can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID.\nSome UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix `&#39;bmex_mm_&#39;`\nand the UUID `&#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39;` creates `&#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;`.\n\nSee the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152)\nfor an example of how to use and generate clOrdIDs.
        /// </summary>
        /// <param name="symbol">Instrument symbol. e.g. &#39;XBT24H&#39;.</param> 
        /// <param name="side">Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless `orderQty` or `simpleOrderQty` is negative.</param> 
        /// <param name="simpleOrderQty">Order quantity in units of the underlying instrument (i.e. Bitcoin).</param> 
        /// <param name="quantity">Deprecated: use `orderQty`.</param> 
        /// <param name="orderQty">Order quantity in units of the instrument (i.e. contracts).</param> 
        /// <param name="price">Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.</param> 
        /// <param name="displayQty">Optional quantity to display in the book. Use 0 for a hidden order.</param> 
        /// <param name="stopPrice">Deprecated: use `stopPx`.</param> 
        /// <param name="stopPx">Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering.</param> 
        /// <param name="clOrdID">Optional Client Order ID. This clOrdID will come back on the order and any related executions.</param> 
        /// <param name="clOrdLinkID">Optional Client Order Link ID for contingent orders.</param> 
        /// <param name="pegOffsetValue">Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.</param> 
        /// <param name="pegPriceType">Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg.</param> 
        /// <param name="type">Deprecated: use `ordType`.</param> 
        /// <param name="ordType">Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to &#39;Limit&#39; when `price` is specified. Defaults to &#39;Stop&#39; when `stopPx` is specified. Defaults to &#39;StopLimit&#39; when `price` and `stopPx` are specified.</param> 
        /// <param name="timeInForce">Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, &#39;LimitIfTouched&#39;, and &#39;MarketWithLeftOverAsLimit&#39; orders.</param> 
        /// <param name="execInst">Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. &#39;AllOrNone&#39; instruction requires `displayQty` to be 0. &#39;MarkPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders.</param> 
        /// <param name="contingencyType">Optional contingency type for use with `clOrdLinkID`. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional.</param> 
        /// <param name="text">Optional order annotation. e.g. &#39;Take profit&#39;.</param> 
        /// <returns>Order</returns>            
        public Order OrderNew (string symbol, string side = null, double? simpleOrderQty = null, double? quantity = null, double? orderQty = null, double? price = null, double? displayQty = null, double? stopPrice = null, double? stopPx = null, string clOrdID = null, string clOrdLinkID = null, double? pegOffsetValue = null, string pegPriceType = null, string type = null, string ordType = null, string timeInForce = null, string execInst = null, string contingencyType = null, string text = null)
        {
            
            // verify the required parameter 'symbol' is set
            if (symbol == null) throw new ApiException(400, "Missing required parameter 'symbol' when calling OrderNew");
            
    
            var path_ = "/order";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (symbol != null) formParams.Add("symbol", ApiClient.ParameterToString(symbol)); // form parameter
            if (side != null) formParams.Add("side", ApiClient.ParameterToString(side)); // form parameter
            if (simpleOrderQty != null) formParams.Add("simpleOrderQty", ApiClient.ParameterToString(simpleOrderQty)); // form parameter
            if (quantity != null) formParams.Add("quantity", ApiClient.ParameterToString(quantity)); // form parameter
            if (orderQty != null) formParams.Add("orderQty", ApiClient.ParameterToString(orderQty)); // form parameter
            if (price != null) formParams.Add("price", ApiClient.ParameterToString(price)); // form parameter
            if (displayQty != null) formParams.Add("displayQty", ApiClient.ParameterToString(displayQty)); // form parameter
            if (stopPrice != null) formParams.Add("stopPrice", ApiClient.ParameterToString(stopPrice)); // form parameter
            if (stopPx != null) formParams.Add("stopPx", ApiClient.ParameterToString(stopPx)); // form parameter
            if (clOrdID != null) formParams.Add("clOrdID", ApiClient.ParameterToString(clOrdID)); // form parameter
            if (clOrdLinkID != null) formParams.Add("clOrdLinkID", ApiClient.ParameterToString(clOrdLinkID)); // form parameter
            if (pegOffsetValue != null) formParams.Add("pegOffsetValue", ApiClient.ParameterToString(pegOffsetValue)); // form parameter
            if (pegPriceType != null) formParams.Add("pegPriceType", ApiClient.ParameterToString(pegPriceType)); // form parameter
            if (type != null) formParams.Add("type", ApiClient.ParameterToString(type)); // form parameter
            if (ordType != null) formParams.Add("ordType", ApiClient.ParameterToString(ordType)); // form parameter
            if (timeInForce != null) formParams.Add("timeInForce", ApiClient.ParameterToString(timeInForce)); // form parameter
            if (execInst != null) formParams.Add("execInst", ApiClient.ParameterToString(execInst)); // form parameter
            if (contingencyType != null) formParams.Add("contingencyType", ApiClient.ParameterToString(contingencyType)); // form parameter
            if (text != null) formParams.Add("text", ApiClient.ParameterToString(text)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderNew: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderNew: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Order) ApiClient.Deserialize(response, typeof(Order));
        }
    
        /// <summary>
        /// Create a new order. This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nIf no order type is provided, BitMEX will assume &#39;Limit&#39;.\nBe very careful with &#39;Market&#39; and &#39;Stop&#39; orders as you may be filled at an unfavourable price.\n\nYou can submit bulk orders by POSTing an array of orders to `/api/v1/order/bulk`. Send a JSON payload\nwith the shape: `{\&quot;orders\&quot;: [{...}, {...}]}`, with each inner object containing the same fields that would be\nsent to this endpoint.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order.\nThis clOrdID will come back as a property on the order and any related executions (including on the WebSocket),\nand can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID.\nSome UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix `&#39;bmex_mm_&#39;`\nand the UUID `&#39;7fbd6545-bb0c-11e4-a273-6003088a7c04&#39;` creates `&#39;bmex_mm_f71lRbsMEeSic2ADCIp8BA&#39;`.\n\nSee the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152)\nfor an example of how to use and generate clOrdIDs.
        /// </summary>
        /// <param name="symbol">Instrument symbol. e.g. &#39;XBT24H&#39;.</param>
        /// <param name="side">Order side. Valid options: Buy, Sell. Defaults to &#39;Buy&#39; unless `orderQty` or `simpleOrderQty` is negative.</param>
        /// <param name="simpleOrderQty">Order quantity in units of the underlying instrument (i.e. Bitcoin).</param>
        /// <param name="quantity">Deprecated: use `orderQty`.</param>
        /// <param name="orderQty">Order quantity in units of the instrument (i.e. contracts).</param>
        /// <param name="price">Optional limit price for &#39;Limit&#39;, &#39;StopLimit&#39;, and &#39;LimitIfTouched&#39; orders.</param>
        /// <param name="displayQty">Optional quantity to display in the book. Use 0 for a hidden order.</param>
        /// <param name="stopPrice">Deprecated: use `stopPx`.</param>
        /// <param name="stopPx">Optional trigger price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of &#39;MarkPrice&#39; or &#39;LastPrice&#39; to define the current price used for triggering.</param>
        /// <param name="clOrdID">Optional Client Order ID. This clOrdID will come back on the order and any related executions.</param>
        /// <param name="clOrdLinkID">Optional Client Order Link ID for contingent orders.</param>
        /// <param name="pegOffsetValue">Optional trailing offset from the current price for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for &#39;Pegged&#39; orders.</param>
        /// <param name="pegPriceType">Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg.</param>
        /// <param name="type">Deprecated: use `ordType`.</param>
        /// <param name="ordType">Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to &#39;Limit&#39; when `price` is specified. Defaults to &#39;Stop&#39; when `stopPx` is specified. Defaults to &#39;StopLimit&#39; when `price` and `stopPx` are specified.</param>
        /// <param name="timeInForce">Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to &#39;GoodTillCancel&#39; for &#39;Limit&#39;, &#39;StopLimit&#39;, &#39;LimitIfTouched&#39;, and &#39;MarketWithLeftOverAsLimit&#39; orders.</param>
        /// <param name="execInst">Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. &#39;AllOrNone&#39; instruction requires `displayQty` to be 0. &#39;MarkPrice&#39; or &#39;LastPrice&#39; instruction valid for &#39;Stop&#39;, &#39;StopLimit&#39;, &#39;MarketIfTouched&#39;, and &#39;LimitIfTouched&#39; orders.</param>
        /// <param name="contingencyType">Optional contingency type for use with `clOrdLinkID`. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional.</param>
        /// <param name="text">Optional order annotation. e.g. &#39;Take profit&#39;.</param>
        /// <returns>Order</returns>
        public async System.Threading.Tasks.Task<Order> OrderNewAsync (string symbol, string side = null, double? simpleOrderQty = null, double? quantity = null, double? orderQty = null, double? price = null, double? displayQty = null, double? stopPrice = null, double? stopPx = null, string clOrdID = null, string clOrdLinkID = null, double? pegOffsetValue = null, string pegPriceType = null, string type = null, string ordType = null, string timeInForce = null, string execInst = null, string contingencyType = null, string text = null)
        {
            // verify the required parameter 'symbol' is set
            if (symbol == null) throw new ApiException(400, "Missing required parameter 'symbol' when calling OrderNew");
            
    
            var path_ = "/order";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (symbol != null) formParams.Add("symbol", ApiClient.ParameterToString(symbol)); // form parameter
            if (side != null) formParams.Add("side", ApiClient.ParameterToString(side)); // form parameter
            if (simpleOrderQty != null) formParams.Add("simpleOrderQty", ApiClient.ParameterToString(simpleOrderQty)); // form parameter
            if (quantity != null) formParams.Add("quantity", ApiClient.ParameterToString(quantity)); // form parameter
            if (orderQty != null) formParams.Add("orderQty", ApiClient.ParameterToString(orderQty)); // form parameter
            if (price != null) formParams.Add("price", ApiClient.ParameterToString(price)); // form parameter
            if (displayQty != null) formParams.Add("displayQty", ApiClient.ParameterToString(displayQty)); // form parameter
            if (stopPrice != null) formParams.Add("stopPrice", ApiClient.ParameterToString(stopPrice)); // form parameter
            if (stopPx != null) formParams.Add("stopPx", ApiClient.ParameterToString(stopPx)); // form parameter
            if (clOrdID != null) formParams.Add("clOrdID", ApiClient.ParameterToString(clOrdID)); // form parameter
            if (clOrdLinkID != null) formParams.Add("clOrdLinkID", ApiClient.ParameterToString(clOrdLinkID)); // form parameter
            if (pegOffsetValue != null) formParams.Add("pegOffsetValue", ApiClient.ParameterToString(pegOffsetValue)); // form parameter
            if (pegPriceType != null) formParams.Add("pegPriceType", ApiClient.ParameterToString(pegPriceType)); // form parameter
            if (type != null) formParams.Add("type", ApiClient.ParameterToString(type)); // form parameter
            if (ordType != null) formParams.Add("ordType", ApiClient.ParameterToString(ordType)); // form parameter
            if (timeInForce != null) formParams.Add("timeInForce", ApiClient.ParameterToString(timeInForce)); // form parameter
            if (execInst != null) formParams.Add("execInst", ApiClient.ParameterToString(execInst)); // form parameter
            if (contingencyType != null) formParams.Add("contingencyType", ApiClient.ParameterToString(contingencyType)); // form parameter
            if (text != null) formParams.Add("text", ApiClient.ParameterToString(text)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderNew: " + response.Content, response.Content);

            return (Order) ApiClient.Deserialize(response, typeof(Order));
        }
        
        /// <summary>
        /// Cancel order(s). Send multiple order IDs to cancel in bulk. Either an orderID or a clOrdID must be provided.
        /// </summary>
        /// <param name="orderID">Order ID(s).</param> 
        /// <param name="clOrdID">Client Order ID(s). See POST /order.</param> 
        /// <param name="text">Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;.</param> 
        /// <returns></returns>            
        public List<Order> OrderCancel (string orderID = null, string clOrdID = null, string text = null)
        {
            
    
            var path_ = "/order";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (orderID != null) formParams.Add("orderID", ApiClient.ParameterToString(orderID)); // form parameter
            if (clOrdID != null) formParams.Add("clOrdID", ApiClient.ParameterToString(clOrdID)); // form parameter
            if (text != null) formParams.Add("text", ApiClient.ParameterToString(text)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancel: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancel: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Order>) ApiClient.Deserialize(response, typeof(List<Order>));
        }
    
        /// <summary>
        /// Cancel order(s). Send multiple order IDs to cancel in bulk. Either an orderID or a clOrdID must be provided.
        /// </summary>
        /// <param name="orderID">Order ID(s).</param>
        /// <param name="clOrdID">Client Order ID(s). See POST /order.</param>
        /// <param name="text">Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;.</param>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<Order>> OrderCancelAsync (string orderID = null, string clOrdID = null, string text = null)
        {
            
    
            var path_ = "/order";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (orderID != null) formParams.Add("orderID", ApiClient.ParameterToString(orderID)); // form parameter
            if (clOrdID != null) formParams.Add("clOrdID", ApiClient.ParameterToString(clOrdID)); // form parameter
            if (text != null) formParams.Add("text", ApiClient.ParameterToString(text)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancel: " + response.Content, response.Content);

            return (List<Order>) ApiClient.Deserialize(response, typeof(List<Order>));
        }
        
        /// <summary>
        /// Cancels all of your orders. 
        /// </summary>
        /// <param name="symbol">Optional symbol. If provided, only cancels orders for that symbol.</param> 
        /// <param name="filter">Optional filter for cancellation. Use to only cancel some orders, e.g. `{\&quot;side\&quot;: \&quot;Buy\&quot;}`.</param> 
        /// <param name="text">Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;</param> 
        /// <returns>InlineResponse2001</returns>            
        public InlineResponse2001 OrderCancelAll (string symbol = null, string filter = null, string text = null)
        {
            
    
            var path_ = "/order/all";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (symbol != null) formParams.Add("symbol", ApiClient.ParameterToString(symbol)); // form parameter
            if (filter != null) formParams.Add("filter", ApiClient.ParameterToString(filter)); // form parameter
            if (text != null) formParams.Add("text", ApiClient.ParameterToString(text)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancelAll: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancelAll: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse2001) ApiClient.Deserialize(response, typeof(InlineResponse2001));
        }
    
        /// <summary>
        /// Cancels all of your orders. 
        /// </summary>
        /// <param name="symbol">Optional symbol. If provided, only cancels orders for that symbol.</param>
        /// <param name="filter">Optional filter for cancellation. Use to only cancel some orders, e.g. `{\&quot;side\&quot;: \&quot;Buy\&quot;}`.</param>
        /// <param name="text">Optional cancellation annotation. e.g. &#39;Spread Exceeded&#39;</param>
        /// <returns>InlineResponse2001</returns>
        public async System.Threading.Tasks.Task<InlineResponse2001> OrderCancelAllAsync (string symbol = null, string filter = null, string text = null)
        {
            
    
            var path_ = "/order/all";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (symbol != null) formParams.Add("symbol", ApiClient.ParameterToString(symbol)); // form parameter
            if (filter != null) formParams.Add("filter", ApiClient.ParameterToString(filter)); // form parameter
            if (text != null) formParams.Add("text", ApiClient.ParameterToString(text)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.DELETE, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancelAll: " + response.Content, response.Content);

            return (InlineResponse2001) ApiClient.Deserialize(response, typeof(InlineResponse2001));
        }
        
        /// <summary>
        /// Amend multiple orders. Similar to POST /amend, but with multiple orders. `application/json` only. Ratelimited at 50%.
        /// </summary>
        /// <param name="orders">An array of orders.</param> 
        /// <returns></returns>            
        public List<Order> OrderAmendBulk (string orders = null)
        {
            
    
            var path_ = "/order/bulk";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (orders != null) formParams.Add("orders", ApiClient.ParameterToString(orders)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderAmendBulk: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderAmendBulk: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Order>) ApiClient.Deserialize(response, typeof(List<Order>));
        }
    
        /// <summary>
        /// Amend multiple orders. Similar to POST /amend, but with multiple orders. `application/json` only. Ratelimited at 50%.
        /// </summary>
        /// <param name="orders">An array of orders.</param>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<Order>> OrderAmendBulkAsync (string orders = null)
        {
            
    
            var path_ = "/order/bulk";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (orders != null) formParams.Add("orders", ApiClient.ParameterToString(orders)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.PUT, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderAmendBulk: " + response.Content, response.Content);

            return (List<Order>) ApiClient.Deserialize(response, typeof(List<Order>));
        }
        
        /// <summary>
        /// Create multiple new orders. This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nEach individual order object in the array should have the same properties as an individual POST /order call.\n\nThis endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX\nsystems, this endpoint is ratelimited at `ceil(0.5 * orders)`. Submitting 10 orders via a bulk order call\nwill only count as 5 requests.\n\nFor now, only `application/json` is supported on this endpoint.
        /// </summary>
        /// <param name="orders">An array of orders.</param> 
        /// <returns></returns>            
        public List<Order> OrderNewBulk (string orders = null)
        {
            
    
            var path_ = "/order/bulk";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (orders != null) formParams.Add("orders", ApiClient.ParameterToString(orders)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderNewBulk: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderNewBulk: " + response.ErrorMessage, response.ErrorMessage);
    
            return (List<Order>) ApiClient.Deserialize(response, typeof(List<Order>));
        }
    
        /// <summary>
        /// Create multiple new orders. This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nEach individual order object in the array should have the same properties as an individual POST /order call.\n\nThis endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX\nsystems, this endpoint is ratelimited at `ceil(0.5 * orders)`. Submitting 10 orders via a bulk order call\nwill only count as 5 requests.\n\nFor now, only `application/json` is supported on this endpoint.
        /// </summary>
        /// <param name="orders">An array of orders.</param>
        /// <returns></returns>
        public async System.Threading.Tasks.Task<List<Order>> OrderNewBulkAsync (string orders = null)
        {
            
    
            var path_ = "/order/bulk";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (orders != null) formParams.Add("orders", ApiClient.ParameterToString(orders)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderNewBulk: " + response.Content, response.Content);

            return (List<Order>) ApiClient.Deserialize(response, typeof(List<Order>));
        }
        
        /// <summary>
        /// Automatically cancel all your orders after a specified timeout. Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage.\nIf called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.\n\nExample usage: call this route at 15s intervals with an offset of 60000 (60s).\nIf this route is not called within 60 seconds, all your orders will be automatically canceled.\n\nThis is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-).
        /// </summary>
        /// <param name="timeout">Timeout in ms. Set to 0 to cancel this timer.</param> 
        /// <returns>InlineResponse2001</returns>            
        public InlineResponse2001 OrderCancelAllAfter (double? timeout)
        {
            
            // verify the required parameter 'timeout' is set
            if (timeout == null) throw new ApiException(400, "Missing required parameter 'timeout' when calling OrderCancelAllAfter");
            
    
            var path_ = "/order/cancelAllAfter";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (timeout != null) formParams.Add("timeout", ApiClient.ParameterToString(timeout)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancelAllAfter: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancelAllAfter: " + response.ErrorMessage, response.ErrorMessage);
    
            return (InlineResponse2001) ApiClient.Deserialize(response, typeof(InlineResponse2001));
        }
    
        /// <summary>
        /// Automatically cancel all your orders after a specified timeout. Useful as a dead-man&#39;s switch to ensure your orders are canceled in case of an outage.\nIf called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.\n\nExample usage: call this route at 15s intervals with an offset of 60000 (60s).\nIf this route is not called within 60 seconds, all your orders will be automatically canceled.\n\nThis is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-).
        /// </summary>
        /// <param name="timeout">Timeout in ms. Set to 0 to cancel this timer.</param>
        /// <returns>InlineResponse2001</returns>
        public async System.Threading.Tasks.Task<InlineResponse2001> OrderCancelAllAfterAsync (double? timeout)
        {
            // verify the required parameter 'timeout' is set
            if (timeout == null) throw new ApiException(400, "Missing required parameter 'timeout' when calling OrderCancelAllAfter");
            
    
            var path_ = "/order/cancelAllAfter";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (timeout != null) formParams.Add("timeout", ApiClient.ParameterToString(timeout)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderCancelAllAfter: " + response.Content, response.Content);

            return (InlineResponse2001) ApiClient.Deserialize(response, typeof(InlineResponse2001));
        }
        
        /// <summary>
        /// Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;] If no `price` is specified, a market order will be submitted to close the whole of your position. + This will also close all other open orders in this symbol.
        /// </summary>
        /// <param name="symbol">Symbol of position to close.</param> 
        /// <param name="price">Optional limit price.</param> 
        /// <returns>Order</returns>            
        public Order OrderClosePosition (string symbol, double? price = null)
        {
            
            // verify the required parameter 'symbol' is set
            if (symbol == null) throw new ApiException(400, "Missing required parameter 'symbol' when calling OrderClosePosition");
            
    
            var path_ = "/order/closePosition";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (symbol != null) formParams.Add("symbol", ApiClient.ParameterToString(symbol)); // form parameter
            if (price != null) formParams.Add("price", ApiClient.ParameterToString(price)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
    
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderClosePosition: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderClosePosition: " + response.ErrorMessage, response.ErrorMessage);
    
            return (Order) ApiClient.Deserialize(response, typeof(Order));
        }
    
        /// <summary>
        /// Close a position. [Deprecated, use POST /order with execInst: &#39;Close&#39;] If no `price` is specified, a market order will be submitted to close the whole of your position. + This will also close all other open orders in this symbol.
        /// </summary>
        /// <param name="symbol">Symbol of position to close.</param>
        /// <param name="price">Optional limit price.</param>
        /// <returns>Order</returns>
        public async System.Threading.Tasks.Task<Order> OrderClosePositionAsync (string symbol, double? price = null)
        {
            // verify the required parameter 'symbol' is set
            if (symbol == null) throw new ApiException(400, "Missing required parameter 'symbol' when calling OrderClosePosition");
            
    
            var path_ = "/order/closePosition";
    
            var pathParams = new Dictionary<String, String>();
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

            // to determine the Accept header
            String[] http_header_accepts = new String[] {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
            };
            String http_header_accept = ApiClient.SelectHeaderAccept(http_header_accepts);
            if (http_header_accept != null)
                headerParams.Add("Accept", ApiClient.SelectHeaderAccept(http_header_accepts));

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            pathParams.Add("format", "json");
            
            
            
            if (symbol != null) formParams.Add("symbol", ApiClient.ParameterToString(symbol)); // form parameter
            if (price != null) formParams.Add("price", ApiClient.ParameterToString(price)); // form parameter
            
            
    
            // authentication setting, if any
            String[] authSettings = new String[] {  };
    
            // make the HTTP request
            IRestResponse response = (IRestResponse) await ApiClient.CallApiAsync(path_, Method.POST, queryParams, postBody, headerParams, formParams, fileParams, pathParams, authSettings);
            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling OrderClosePosition: " + response.Content, response.Content);

            return (Order) ApiClient.Deserialize(response, typeof(Order));
        }
        
    }
    
}
