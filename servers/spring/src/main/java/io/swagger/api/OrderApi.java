package io.swagger.api;

import io.swagger.model.Order;
import io.swagger.model.Error;
import java.math.BigDecimal;
import org.joda.time.LocalDate;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-07-05T09:41:19.947-05:00")

@Api(value = "order", description = "the order API")
public interface OrderApi {

    @ApiOperation(value = "Amend the quantity or price of an open order.", notes = "<p>Send an <code>orderID</code> or <code>clOrdID</code> to identify the order you wish to amend.</p> <p>Both order quantity and price can be amended. Only one <code>qty</code> field can be used to amend.</p> <p>Use the <code>leavesQty</code> field to specify how much of the order you wish to remain open. This can be useful if you want to adjust your position&#39;s delta by a certain amount, regardless of how much of the order has already filled.</p> <p>Use the <code>simpleOrderQty</code> and <code>simpleLeavesQty</code> fields to specify order size in Bitcoin, rather than contracts. These fields will round up to the nearest contract.</p> <p>Like order placement, amending can be done in bulk. Simply send a request to <code>PUT /api/v1/order/bulk</code> with a JSON body of the shape: <code>{&quot;orders&quot;: [{...}, {...}]}</code>, each object containing the fields used in this endpoint.</p> ", response = Order.class, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Order.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = Order.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Order.class),
        @ApiResponse(code = 404, message = "Not Found", response = Order.class) })
    @RequestMapping(value = "/order",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.PUT)
    ResponseEntity<Order> orderAmend(@ApiParam(value = "Order ID" ) @RequestPart(value="orderID", required=false)  String orderID,@ApiParam(value = "Client Order ID. See POST /order." ) @RequestPart(value="clOrdID", required=false)  String clOrdID,@ApiParam(value = "Optional order quantity in units of the underlying instrument (i.e. Bitcoin)." ) @RequestPart(value="simpleOrderQty", required=false)  Double simpleOrderQty,@ApiParam(value = "Optional order quantity in units of the instrument (i.e. contracts)." ) @RequestPart(value="orderQty", required=false)  BigDecimal orderQty,@ApiParam(value = "Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders." ) @RequestPart(value="simpleLeavesQty", required=false)  Double simpleLeavesQty,@ApiParam(value = "Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders." ) @RequestPart(value="leavesQty", required=false)  BigDecimal leavesQty,@ApiParam(value = "Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders." ) @RequestPart(value="price", required=false)  Double price,@ApiParam(value = "Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders." ) @RequestPart(value="stopPx", required=false)  Double stopPx,@ApiParam(value = "Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders." ) @RequestPart(value="pegOffsetValue", required=false)  Double pegOffsetValue,@ApiParam(value = "Optional amend annotation. e.g. 'Adjust skew'." ) @RequestPart(value="text", required=false)  String text);


    @ApiOperation(value = "Amend multiple orders.", notes = "Similar to POST /amend, but with multiple orders. `application/json` only. Ratelimited at 50%.", response = Order.class, responseContainer = "List", tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Order.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = Order.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Order.class),
        @ApiResponse(code = 404, message = "Not Found", response = Order.class) })
    @RequestMapping(value = "/order/bulk",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.PUT)
    ResponseEntity<List<Order>> orderAmendBulk(@ApiParam(value = "An array of orders." ) @RequestPart(value="orders", required=false)  String orders);


    @ApiOperation(value = "Cancel order(s). Send multiple order IDs to cancel in bulk.", notes = "Either an orderID or a clOrdID must be provided.", response = Order.class, responseContainer = "List", tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Order.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = Order.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Order.class),
        @ApiResponse(code = 404, message = "Not Found", response = Order.class) })
    @RequestMapping(value = "/order",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.DELETE)
    ResponseEntity<List<Order>> orderCancel(@ApiParam(value = "Order ID(s)." ) @RequestPart(value="orderID", required=false)  String orderID,@ApiParam(value = "Client Order ID(s). See POST /order." ) @RequestPart(value="clOrdID", required=false)  String clOrdID,@ApiParam(value = "Optional cancellation annotation. e.g. 'Spread Exceeded'." ) @RequestPart(value="text", required=false)  String text);


    @ApiOperation(value = "Cancels all of your orders.", notes = "", response = Object.class, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Object.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = Object.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Object.class),
        @ApiResponse(code = 404, message = "Not Found", response = Object.class) })
    @RequestMapping(value = "/order/all",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.DELETE)
    ResponseEntity<Object> orderCancelAll(@ApiParam(value = "Optional symbol. If provided, only cancels orders for that symbol." ) @RequestPart(value="symbol", required=false)  String symbol,@ApiParam(value = "Optional filter for cancellation. Use to only cancel some orders, e.g. `{\"side\": \"Buy\"}`." ) @RequestPart(value="filter", required=false)  String filter,@ApiParam(value = "Optional cancellation annotation. e.g. 'Spread Exceeded'" ) @RequestPart(value="text", required=false)  String text);


    @ApiOperation(value = "Automatically cancel all your orders after a specified timeout.", notes = "Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.  Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.  This is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-). ", response = Object.class, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Object.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = Object.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Object.class),
        @ApiResponse(code = 404, message = "Not Found", response = Object.class) })
    @RequestMapping(value = "/order/cancelAllAfter",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Object> orderCancelAllAfter(@ApiParam(value = "Timeout in ms. Set to 0 to cancel this timer. ", required=true ) @RequestPart(value="timeout", required=true)  Double timeout);


    @ApiOperation(value = "Close a position. [Deprecated, use POST /order with execInst: 'Close']", notes = "If no `price` is specified, a market order will be submitted to close the whole of your position. + This will also close all other open orders in this symbol.", response = Order.class, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Order.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = Order.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Order.class),
        @ApiResponse(code = 404, message = "Not Found", response = Order.class) })
    @RequestMapping(value = "/order/closePosition",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Order> orderClosePosition(@ApiParam(value = "Symbol of position to close.", required=true ) @RequestPart(value="symbol", required=true)  String symbol,@ApiParam(value = "Optional limit price." ) @RequestPart(value="price", required=false)  Double price);


    @ApiOperation(value = "Get your orders.", notes = "To get open orders only, send {\"open\": true} in the filter param.  See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\">the FIX Spec</a> for explanations of these fields.", response = Order.class, responseContainer = "List", tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Order.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = Order.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Order.class),
        @ApiResponse(code = 404, message = "Not Found", response = Order.class) })
    @RequestMapping(value = "/order",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.GET)
    ResponseEntity<List<Order>> orderGetOrders(@ApiParam(value = "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.") @RequestParam(value = "symbol", required = false) String symbol,@ApiParam(value = "Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.") @RequestParam(value = "filter", required = false) String filter,@ApiParam(value = "Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect.") @RequestParam(value = "columns", required = false) String columns,@ApiParam(value = "Number of results to fetch.", defaultValue = "100") @RequestParam(value = "count", required = false, defaultValue="100") BigDecimal count,@ApiParam(value = "Starting point for results.", defaultValue = "0") @RequestParam(value = "start", required = false, defaultValue="0") BigDecimal start,@ApiParam(value = "If true, will sort results newest first.", defaultValue = "false") @RequestParam(value = "reverse", required = false, defaultValue="false") Boolean reverse,@ApiParam(value = "Starting date filter for results.") @RequestParam(value = "startTime", required = false) LocalDate startTime,@ApiParam(value = "Ending date filter for results.") @RequestParam(value = "endTime", required = false) LocalDate endTime);


    @ApiOperation(value = "Create a new order.", notes = "This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  If no order type is provided, BitMEX will assume 'Limit'. Be very careful with 'Market' and 'Stop' orders as you may be filled at an unfavourable price.  You can submit bulk orders by POSTing an array of orders to `/api/v1/order/bulk`. Send a JSON payload with the shape: `{\"orders\": [{...}, {...}]}`, with each inner object containing the same fields that would be sent to this endpoint.  A note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This clOrdID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.  To generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix `'bmex_mm_'` and the UUID `'7fbd6545-bb0c-11e4-a273-6003088a7c04'` creates `'bmex_mm_f71lRbsMEeSic2ADCIp8BA'`.  See the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152) for an example of how to use and generate clOrdIDs. ", response = Order.class, tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Order.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = Order.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Order.class),
        @ApiResponse(code = 404, message = "Not Found", response = Order.class) })
    @RequestMapping(value = "/order",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Order> orderNew(@ApiParam(value = "Instrument symbol. e.g. 'XBT24H'.", required=true ) @RequestPart(value="symbol", required=true)  String symbol,@ApiParam(value = "Order side. Valid options: Buy, Sell. Defaults to 'Buy' unless `orderQty` or `simpleOrderQty` is negative." ) @RequestPart(value="side", required=false)  String side,@ApiParam(value = "Order quantity in units of the underlying instrument (i.e. Bitcoin)." ) @RequestPart(value="simpleOrderQty", required=false)  Double simpleOrderQty,@ApiParam(value = "Deprecated: use `orderQty`." ) @RequestPart(value="quantity", required=false)  BigDecimal quantity,@ApiParam(value = "Order quantity in units of the instrument (i.e. contracts)." ) @RequestPart(value="orderQty", required=false)  BigDecimal orderQty,@ApiParam(value = "Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders." ) @RequestPart(value="price", required=false)  Double price,@ApiParam(value = "Optional quantity to display in the book. Use 0 for a hidden order." ) @RequestPart(value="displayQty", required=false)  BigDecimal displayQty,@ApiParam(value = "Deprecated: use `stopPx`." ) @RequestPart(value="stopPrice", required=false)  Double stopPrice,@ApiParam(value = "Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of 'MarkPrice' or 'LastPrice' to define the current price used for triggering." ) @RequestPart(value="stopPx", required=false)  Double stopPx,@ApiParam(value = "Optional Client Order ID. This clOrdID will come back on the order and any related executions." ) @RequestPart(value="clOrdID", required=false)  String clOrdID,@ApiParam(value = "Optional Client Order Link ID for contingent orders." ) @RequestPart(value="clOrdLinkID", required=false)  String clOrdLinkID,@ApiParam(value = "Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders." ) @RequestPart(value="pegOffsetValue", required=false)  Double pegOffsetValue,@ApiParam(value = "Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg." ) @RequestPart(value="pegPriceType", required=false)  String pegPriceType,@ApiParam(value = "Deprecated: use `ordType`." ) @RequestPart(value="type", required=false)  String type,@ApiParam(value = "Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to 'Limit' when `price` is specified. Defaults to 'Stop' when `stopPx` is specified. Defaults to 'StopLimit' when `price` and `stopPx` are specified." , defaultValue="Limit") @RequestPart(value="ordType", required=false)  String ordType,@ApiParam(value = "Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to 'GoodTillCancel' for 'Limit', 'StopLimit', 'LimitIfTouched', and 'MarketWithLeftOverAsLimit' orders." ) @RequestPart(value="timeInForce", required=false)  String timeInForce,@ApiParam(value = "Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. 'AllOrNone' instruction requires `displayQty` to be 0. 'MarkPrice' or 'LastPrice' instruction valid for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders." ) @RequestPart(value="execInst", required=false)  String execInst,@ApiParam(value = "Optional contingency type for use with `clOrdLinkID`. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional." ) @RequestPart(value="contingencyType", required=false)  String contingencyType,@ApiParam(value = "Optional order annotation. e.g. 'Take profit'." ) @RequestPart(value="text", required=false)  String text);


    @ApiOperation(value = "Create multiple new orders.", notes = "This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.  Each individual order object in the array should have the same properties as an individual POST /order call.  This endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX systems, this endpoint is ratelimited at `ceil(0.5 * orders)`. Submitting 10 orders via a bulk order call will only count as 5 requests.  For now, only `application/json` is supported on this endpoint. ", response = Order.class, responseContainer = "List", tags={ "Order", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request was successful", response = Order.class),
        @ApiResponse(code = 400, message = "Parameter Error", response = Order.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Order.class),
        @ApiResponse(code = 404, message = "Not Found", response = Order.class) })
    @RequestMapping(value = "/order/bulk",
        produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
        consumes = { "application/json", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<List<Order>> orderNewBulk(@ApiParam(value = "An array of orders." ) @RequestPart(value="orders", required=false)  String orders);

}
