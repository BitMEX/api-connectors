package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.Object;
import com.wordnik.client.model.Order;
import java.util.List;
import com.wordnik.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/order.json")
@Api(value = "/order", description = "the order API")
@Produces({"application/json"})
public class OrderApi {
  @GET
  @Path("/")
  @ApiOperation(value = "Get your orders.", notes = "To get open orders only, send {"open": true} in the filter param.", responseClass = "List<Order>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response getOrders(
    @ApiParam(value = "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series."
    )@QueryParam("symbol")
 String symbol
    ,@ApiParam(value = "Generic table filter. Send JSON key/value pairs, such as {"key": "value"}."
    )@QueryParam("filter")
 Object filter
    ,@ApiParam(value = "Array of column names to fetch. If omitted, will return all columns. Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect."
    )@QueryParam("columns")
 List<String> columns
    ,@ApiParam(value = "Starting point for results."
    )@QueryParam("start")
 Double start
    ,@ApiParam(value = "If true, will sort results newest first."
    )@QueryParam("reverse")
 Boolean reverse
    ,@ApiParam(value = "Starting date filter for results."
    )@QueryParam("startTime")
 Date startTime
    ,@ApiParam(value = "Ending date filter for results."
    )@QueryParam("endTime")
 Date endTime
    ,@ApiParam(value = "Number of results to fetch."
    , defaultValue="100"
)@QueryParam("count")
 Double count
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/")
  @ApiOperation(value = "Create a new order.", notes = "If you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.

To generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix 'bmex_mm_' and the UUID '7fbd6545-bb0c-11e4-a273-6003088a7c04' creates 'bmex_mm_f71lRbsMEeSic2ADCIp8BA'.

See the BitMEX <a href='https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152'>Reference Market Maker</a> for an example of how to use and generate clOrdIDs.", responseClass = "Order")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response newOrder(
    ,,,,)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @DELETE
  @Path("/")
  @ApiOperation(value = "Cancel order(s). Send multiple order IDs to cancel in bulk.", notes = "Either an orderID or a clOrdID must be provided.", responseClass = "List<Order>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response cancelOrder(
    ,,)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @DELETE
  @Path("/all")
  @ApiOperation(value = "Cancels all of your orders.", notes = "", responseClass = "Object")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response cancelAll(
    ,)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/cancelAllAfter")
  @ApiOperation(value = "Automatically cancel all your orders after a specified timeout.", notes = "Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. <br><br>Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.<br><br>This is also available via <a href="https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-">WebSocket</a>.", responseClass = "Object")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response cancelAllAfter(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

