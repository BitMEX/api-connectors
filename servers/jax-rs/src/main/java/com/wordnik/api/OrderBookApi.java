package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.OrderBook;
import java.util.List;
import com.wordnik.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/orderBook.json")
@Api(value = "/orderBook", description = "the orderBook API")
@Produces({"application/json"})
public class OrderBookApi {
  @GET
  @Path("/")
  @ApiOperation(value = "Get current orderbook.", notes = "", responseClass = "List<OrderBook>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response getOrderBook(
    @ApiParam(value = "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series."
    ,required=true
)@QueryParam("symbol")
 String symbol
    ,@ApiParam(value = "Orderbook depth."
    ,required=true
, defaultValue="25"
)@QueryParam("depth")
 Double depth
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

