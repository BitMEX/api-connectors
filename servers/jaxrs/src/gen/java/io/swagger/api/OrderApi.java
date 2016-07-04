package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.OrderApiService;
import io.swagger.api.factories.OrderApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Order;
import io.swagger.model.Error;
import java.math.BigDecimal;
import java.util.Date;
import io.swagger.model.InlineResponse2001;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/order")
@Consumes({ "application/json", "application/x-www-form-urlencoded" })
@Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
@io.swagger.annotations.Api(description = "the order API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-07-04T18:25:32.992-05:00")
public class OrderApi  {
   private final OrderApiService delegate = OrderApiServiceFactory.getOrderApi();

    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get your orders.", notes = "To get open orders only, send {\"open\": true} in the filter param.\n\nSee <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_D_68.html\">the FIX Spec</a> for explanations of these fields.", response = Order.class, responseContainer = "List", tags={ "Order",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Order.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Order.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Order.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Order.class, responseContainer = "List") })

    public Response orderGetOrders(@ApiParam(value = "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. `XBU:monthly`. Timeframes are `daily`, `weekly`, `monthly`, `quarterly`, and `biquarterly`.") @QueryParam("symbol") String symbol,
    @ApiParam(value = "Generic table filter. Send JSON key/value pairs, such as `{\"key\": \"value\"}`. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#timestamp-filters) for more details.") @QueryParam("filter") String filter,
    @ApiParam(value = "Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.") @QueryParam("columns") String columns,
    @ApiParam(value = "Number of results to fetch.", defaultValue="100") @QueryParam("count") BigDecimal count,
    @ApiParam(value = "Starting point for results.", defaultValue="0") @QueryParam("start") BigDecimal start,
    @ApiParam(value = "If true, will sort results newest first.", defaultValue="false") @QueryParam("reverse") Boolean reverse,
    @ApiParam(value = "Starting date filter for results.") @QueryParam("startTime") Date startTime,
    @ApiParam(value = "Ending date filter for results.") @QueryParam("endTime") Date endTime)
    throws NotFoundException {
        return delegate.orderGetOrders(symbol,filter,columns,count,start,reverse,startTime,endTime);
    }
    @PUT
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Amend the quantity or price of an open order.", notes = "<p>Send an <code>orderID</code> or <code>clOrdID</code> to identify the order you wish to amend.</p>\n<p>Both order quantity and price can be amended. Only one <code>qty</code> field can be used to amend.</p>\n<p>Use the <code>leavesQty</code> field to specify how much of the order you wish to remain open. This can be useful\nif you want to adjust your position&#39;s delta by a certain amount, regardless of how much of the order has\nalready filled.</p>\n<p>Use the <code>simpleOrderQty</code> and <code>simpleLeavesQty</code> fields to specify order size in Bitcoin, rather than contracts.\nThese fields will round up to the nearest contract.</p>\n<p>Like order placement, amending can be done in bulk. Simply send a request to <code>PUT /api/v1/order/bulk</code> with\na JSON body of the shape: <code>{&quot;orders&quot;: [{...}, {...}]}</code>, each object containing the fields used in this endpoint.</p>", response = Order.class, tags={ "Order",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Order.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Order.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Order.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Order.class) })

    public Response orderAmend(@ApiParam(value = "Order ID")@FormParam("orderID")  String orderID,
    @ApiParam(value = "Client Order ID. See POST /order.")@FormParam("clOrdID")  String clOrdID,
    @ApiParam(value = "Optional order quantity in units of the underlying instrument (i.e. Bitcoin).")@FormParam("simpleOrderQty")  Double simpleOrderQty,
    @ApiParam(value = "Optional order quantity in units of the instrument (i.e. contracts).")@FormParam("orderQty")  BigDecimal orderQty,
    @ApiParam(value = "Optional leaves quantity in units of the underlying instrument (i.e. Bitcoin). Useful for amending partially filled orders.")@FormParam("simpleLeavesQty")  Double simpleLeavesQty,
    @ApiParam(value = "Optional leaves quantity in units of the instrument (i.e. contracts). Useful for amending partially filled orders.")@FormParam("leavesQty")  BigDecimal leavesQty,
    @ApiParam(value = "Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.")@FormParam("price")  Double price,
    @ApiParam(value = "Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders.")@FormParam("stopPx")  Double stopPx,
    @ApiParam(value = "Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders.")@FormParam("pegOffsetValue")  Double pegOffsetValue,
    @ApiParam(value = "Optional amend annotation. e.g. 'Adjust skew'.")@FormParam("text")  String text)
    throws NotFoundException {
        return delegate.orderAmend(orderID,clOrdID,simpleOrderQty,orderQty,simpleLeavesQty,leavesQty,price,stopPx,pegOffsetValue,text);
    }
    @POST
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Create a new order.", notes = "This endpoint is used for placing orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nIf no order type is provided, BitMEX will assume 'Limit'.\nBe very careful with 'Market' and 'Stop' orders as you may be filled at an unfavourable price.\n\nYou can submit bulk orders by POSTing an array of orders to `/api/v1/order/bulk`. Send a JSON payload\nwith the shape: `{\"orders\": [{...}, {...}]}`, with each inner object containing the same fields that would be\nsent to this endpoint.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order.\nThis clOrdID will come back as a property on the order and any related executions (including on the WebSocket),\nand can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID.\nSome UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix `'bmex_mm_'`\nand the UUID `'7fbd6545-bb0c-11e4-a273-6003088a7c04'` creates `'bmex_mm_f71lRbsMEeSic2ADCIp8BA'`.\n\nSee the [BitMEX Reference Market Maker](https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152)\nfor an example of how to use and generate clOrdIDs.", response = Order.class, tags={ "Order",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Order.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Order.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Order.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Order.class) })

    public Response orderNew(@ApiParam(value = "Instrument symbol. e.g. 'XBT24H'.", required=true)@FormParam("symbol")  String symbol,
    @ApiParam(value = "Order side. Valid options: Buy, Sell. Defaults to 'Buy' unless `orderQty` or `simpleOrderQty` is negative.")@FormParam("side")  String side,
    @ApiParam(value = "Order quantity in units of the underlying instrument (i.e. Bitcoin).")@FormParam("simpleOrderQty")  Double simpleOrderQty,
    @ApiParam(value = "Deprecated: use `orderQty`.")@FormParam("quantity")  BigDecimal quantity,
    @ApiParam(value = "Order quantity in units of the instrument (i.e. contracts).")@FormParam("orderQty")  BigDecimal orderQty,
    @ApiParam(value = "Optional limit price for 'Limit', 'StopLimit', and 'LimitIfTouched' orders.")@FormParam("price")  Double price,
    @ApiParam(value = "Optional quantity to display in the book. Use 0 for a hidden order.")@FormParam("displayQty")  BigDecimal displayQty,
    @ApiParam(value = "Deprecated: use `stopPx`.")@FormParam("stopPrice")  Double stopPrice,
    @ApiParam(value = "Optional trigger price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders. Use a price below the current price for stop-sell orders and buy-if-touched orders. Use `execInst` of 'MarkPrice' or 'LastPrice' to define the current price used for triggering.")@FormParam("stopPx")  Double stopPx,
    @ApiParam(value = "Optional Client Order ID. This clOrdID will come back on the order and any related executions.")@FormParam("clOrdID")  String clOrdID,
    @ApiParam(value = "Optional Client Order Link ID for contingent orders.")@FormParam("clOrdLinkID")  String clOrdLinkID,
    @ApiParam(value = "Optional trailing offset from the current price for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders; use a negative offset for stop-sell orders and buy-if-touched orders. Optional offset from the peg price for 'Pegged' orders.")@FormParam("pegOffsetValue")  Double pegOffsetValue,
    @ApiParam(value = "Optional peg price type. Valid options: LastPeg, MidPricePeg, MarketPeg, PrimaryPeg, TrailingStopPeg, TrailingStopPeg.")@FormParam("pegPriceType")  String pegPriceType,
    @ApiParam(value = "Deprecated: use `ordType`.")@FormParam("type")  String type,
    @ApiParam(value = "Order type. Valid options: Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, Pegged. Defaults to 'Limit' when `price` is specified. Defaults to 'Stop' when `stopPx` is specified. Defaults to 'StopLimit' when `price` and `stopPx` are specified.", defaultValue="Limit")@FormParam("ordType")  String ordType,
    @ApiParam(value = "Time in force. Valid options: Day, GoodTillCancel, ImmediateOrCancel, FillOrKill. Defaults to 'GoodTillCancel' for 'Limit', 'StopLimit', 'LimitIfTouched', and 'MarketWithLeftOverAsLimit' orders.")@FormParam("timeInForce")  String timeInForce,
    @ApiParam(value = "Optional execution instructions. Valid options: ParticipateDoNotInitiate, AllOrNone, MarkPrice, LastPrice, Close, ReduceOnly. 'AllOrNone' instruction requires `displayQty` to be 0. 'MarkPrice' or 'LastPrice' instruction valid for 'Stop', 'StopLimit', 'MarketIfTouched', and 'LimitIfTouched' orders.")@FormParam("execInst")  String execInst,
    @ApiParam(value = "Optional contingency type for use with `clOrdLinkID`. Valid options: OneCancelsTheOther, OneTriggersTheOther, OneUpdatesTheOtherAbsolute, OneUpdatesTheOtherProportional.")@FormParam("contingencyType")  String contingencyType,
    @ApiParam(value = "Optional order annotation. e.g. 'Take profit'.")@FormParam("text")  String text)
    throws NotFoundException {
        return delegate.orderNew(symbol,side,simpleOrderQty,quantity,orderQty,price,displayQty,stopPrice,stopPx,clOrdID,clOrdLinkID,pegOffsetValue,pegPriceType,type,ordType,timeInForce,execInst,contingencyType,text);
    }
    @DELETE
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Cancel order(s). Send multiple order IDs to cancel in bulk.", notes = "Either an orderID or a clOrdID must be provided.", response = Order.class, responseContainer = "List", tags={ "Order",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Order.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Order.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Order.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Order.class, responseContainer = "List") })

    public Response orderCancel(@ApiParam(value = "Order ID(s).")@FormParam("orderID")  String orderID,
    @ApiParam(value = "Client Order ID(s). See POST /order.")@FormParam("clOrdID")  String clOrdID,
    @ApiParam(value = "Optional cancellation annotation. e.g. 'Spread Exceeded'.")@FormParam("text")  String text)
    throws NotFoundException {
        return delegate.orderCancel(orderID,clOrdID,text);
    }
    @DELETE
    @Path("/all")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Cancels all of your orders.", notes = "", response = InlineResponse2001.class, tags={ "Order",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = InlineResponse2001.class) })

    public Response orderCancelAll(@ApiParam(value = "Optional symbol. If provided, only cancels orders for that symbol.")@FormParam("symbol")  String symbol,
    @ApiParam(value = "Optional filter for cancellation. Use to only cancel some orders, e.g. `{\"side\": \"Buy\"}`.")@FormParam("filter")  String filter,
    @ApiParam(value = "Optional cancellation annotation. e.g. 'Spread Exceeded'")@FormParam("text")  String text)
    throws NotFoundException {
        return delegate.orderCancelAll(symbol,filter,text);
    }
    @PUT
    @Path("/bulk")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Amend multiple orders.", notes = "Similar to POST /amend, but with multiple orders. `application/json` only. Ratelimited at 50%.", response = Order.class, responseContainer = "List", tags={ "Order",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Order.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Order.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Order.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Order.class, responseContainer = "List") })

    public Response orderAmendBulk(@ApiParam(value = "An array of orders.")@FormParam("orders")  String orders)
    throws NotFoundException {
        return delegate.orderAmendBulk(orders);
    }
    @POST
    @Path("/bulk")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Create multiple new orders.", notes = "This endpoint is used for placing bulk orders. Valid order types are Market, Limit, Stop, StopLimit, MarketIfTouched, LimitIfTouched, MarketWithLeftOverAsLimit, and Pegged.\n\nEach individual order object in the array should have the same properties as an individual POST /order call.\n\nThis endpoint is much faster for getting many orders into the book at once. Because it reduces load on BitMEX\nsystems, this endpoint is ratelimited at `ceil(0.5 * orders)`. Submitting 10 orders via a bulk order call\nwill only count as 5 requests.\n\nFor now, only `application/json` is supported on this endpoint.", response = Order.class, responseContainer = "List", tags={ "Order",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Order.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Order.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Order.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Order.class, responseContainer = "List") })

    public Response orderNewBulk(@ApiParam(value = "An array of orders.")@FormParam("orders")  String orders)
    throws NotFoundException {
        return delegate.orderNewBulk(orders);
    }
    @POST
    @Path("/cancelAllAfter")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Automatically cancel all your orders after a specified timeout.", notes = "Useful as a dead-man's switch to ensure your orders are canceled in case of an outage.\nIf called repeatedly, the existing offset will be canceled and a new one will be inserted in its place.\n\nExample usage: call this route at 15s intervals with an offset of 60000 (60s).\nIf this route is not called within 60 seconds, all your orders will be automatically canceled.\n\nThis is also available via [WebSocket](https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-).", response = InlineResponse2001.class, tags={ "Order",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = InlineResponse2001.class) })

    public Response orderCancelAllAfter(@ApiParam(value = "Timeout in ms. Set to 0 to cancel this timer.", required=true)@FormParam("timeout")  Double timeout)
    throws NotFoundException {
        return delegate.orderCancelAllAfter(timeout);
    }
    @POST
    @Path("/closePosition")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Close a position. [Deprecated, use POST /order with execInst: 'Close']", notes = "If no `price` is specified, a market order will be submitted to close the whole of your position. + This will also close all other open orders in this symbol.", response = Order.class, tags={ "Order" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Order.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Order.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Order.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Order.class) })

    public Response orderClosePosition(@ApiParam(value = "Symbol of position to close.", required=true)@FormParam("symbol")  String symbol,
    @ApiParam(value = "Optional limit price.")@FormParam("price")  Double price)
    throws NotFoundException {
        return delegate.orderClosePosition(symbol,price);
    }
}

