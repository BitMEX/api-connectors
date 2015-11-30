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
import io.swagger.model.InlineResponse200;
import io.swagger.model.LiquidationOrder;

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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class OrderApi  {
   private final OrderApiService delegate = OrderApiServiceFactory.getOrderApi();

    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get your orders.", notes = "To get open orders only, send {\"open\": true} in the filter param.", response = Order.class, responseContainer = "List", tags={ "Order",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Order.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Order.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Order.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Order.class, responseContainer = "List") })

    public Response orderGetOrders(@ApiParam(value = "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. 'XBU:monthly'. Timeframes are 'daily', 'weekly', 'monthly', 'quarterly', and 'biquarterly'.") @QueryParam("symbol") String symbol,
    @ApiParam(value = "Generic table filter. Send JSON key/value pairs, such as {\"key\": \"value\"}. You can key on individual fields, and do more advanced querying on timestamps. See <a href=\"http://localhost:2001/app/restAPI#timestamp-filters\">http://localhost:2001/app/restAPI#timestamp-filters</a> for more details.") @QueryParam("filter") String filter,
    @ApiParam(value = "Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.") @QueryParam("columns") String columns,
    @ApiParam(value = "Number of results to fetch.", defaultValue="100") @QueryParam("count") BigDecimal count,
    @ApiParam(value = "Starting point for results.", defaultValue="0") @QueryParam("start") BigDecimal start,
    @ApiParam(value = "If true, will sort results newest first.", defaultValue="false") @QueryParam("reverse") Boolean reverse,
    @ApiParam(value = "Starting date filter for results.") @QueryParam("startTime") Date startTime,
    @ApiParam(value = "Ending date filter for results.") @QueryParam("endTime") Date endTime)
    throws NotFoundException {
        return delegate.orderGetOrders(symbol,filter,columns,count,start,reverse,startTime,endTime);
    }
    @POST
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Create a new order.", notes = "This endpoint is used for placing orders. Valid order types are 'Limit' and 'StopLimit'. If none is provided, BitMEX will assume a Limit Order.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix 'bmex_mm_' and the UUID '7fbd6545-bb0c-11e4-a273-6003088a7c04' creates 'bmex_mm_f71lRbsMEeSic2ADCIp8BA'.\n\nSee the BitMEX <a href='https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152'>Reference Market Maker</a> for an example of how to use and generate clOrdIDs.", response = Order.class, tags={ "Order",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Order.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = Order.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Order.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Order.class) })

    public Response orderNewOrder(@ApiParam(value = "Instrument symbol.", required=true)@FormParam("symbol")  String symbol,
    @ApiParam(value = "Quantity. Use positive numbers to buy, negative to sell.", required=true)@FormParam("quantity")  BigDecimal quantity,
    @ApiParam(value = "Order price.", required=true)@FormParam("price")  Double price,
    @ApiParam(value = "Time in force. Valid options: 'IOC' (Immediate-Or-Cancel), 'GTC' (Good-Till-Cancelled).", defaultValue="GTC")@FormParam("timeInForce")  String timeInForce,
    @ApiParam(value = "Order type. Available: 'Limit', 'StopLimit'", defaultValue="Limit")@FormParam("type")  String type,
    @ApiParam(value = "If order type is 'StopLimit', this is the trigger/stop price.")@FormParam("stopPrice")  Double stopPrice,
    @ApiParam(value = "Optional Client Order ID to give this order. This ID will come back on any execution messages tied to this order.")@FormParam("clOrdID")  String clOrdID)
    throws NotFoundException {
        return delegate.orderNewOrder(symbol,quantity,price,timeInForce,type,stopPrice,clOrdID);
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

    public Response orderCancelOrder(@ApiParam(value = "Order ID(s).")@FormParam("orderID")  String orderID,
    @ApiParam(value = "Client Order ID(s). See POST /order.")@FormParam("clOrdID")  String clOrdID,
    @ApiParam(value = "Optional cancellation annotation. e.g. 'Spread Exceeded'")@FormParam("text")  String text)
    throws NotFoundException {
        return delegate.orderCancelOrder(orderID,clOrdID,text);
    }
    @DELETE
    @Path("/all")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Cancels all of your orders.", notes = "", response = InlineResponse200.class, tags={ "Order",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = InlineResponse200.class) })

    public Response orderCancelAll(@ApiParam(value = "Optional symbol. If provided, only cancels orders for that symbol.")@FormParam("symbol")  String symbol,
    @ApiParam(value = "Optional filter for cancellation. Use to only cancel some orders, e.g. `{\"side\": \"Buy\"}`.")@FormParam("filter")  String filter,
    @ApiParam(value = "Optional cancellation annotation. e.g. 'Spread Exceeded'")@FormParam("text")  String text)
    throws NotFoundException {
        return delegate.orderCancelAll(symbol,filter,text);
    }
    @POST
    @Path("/cancelAllAfter")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Automatically cancel all your orders after a specified timeout.", notes = "Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. <br><br>Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.<br><br>This is also available via <a href=\"https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-\">WebSocket</a>.", response = InlineResponse200.class, tags={ "Order",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = InlineResponse200.class) })

    public Response orderCancelAllAfter(@ApiParam(value = "Timeout in ms. Set to 0 to cancel this timer.", required=true)@FormParam("timeout")  Double timeout)
    throws NotFoundException {
        return delegate.orderCancelAllAfter(timeout);
    }
    @POST
    @Path("/closePosition")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Close a position with a market order.", notes = "If no price is specified, a market order will be submitted to close the entirety of your position. Be careful with market orders as you may not be filled at a favorable price.", response = Order.class, tags={ "Order",  })
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
    @GET
    @Path("/liquidations")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get open liquidation orders.", notes = "", response = LiquidationOrder.class, responseContainer = "List", tags={ "Order" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = LiquidationOrder.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Parameter Error", response = LiquidationOrder.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = LiquidationOrder.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = LiquidationOrder.class, responseContainer = "List") })

    public Response orderGetCloseOutOrders(@ApiParam(value = "Filter. For example, send {\"symbol\": \"XBT24H\"}.") @QueryParam("filter") String filter)
    throws NotFoundException {
        return delegate.orderGetCloseOutOrders(filter);
    }
}

