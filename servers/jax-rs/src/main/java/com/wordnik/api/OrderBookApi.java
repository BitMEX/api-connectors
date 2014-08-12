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
  @ApiOperation(value = "Get current orderbook.", notes = "", responseClass = "List<orderBook>")
  @ApiErrors(value = { })
     
  public Response orderBook_getOrderBook(
    @ApiParam(value = ""
    ,required=true
)@QueryParam("symbol")
 symbol symbol
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

