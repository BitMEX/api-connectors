package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.Order;
import java.util.List;
import com.wordnik.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/order.json")
@Api(value = "/order", description = "the order API")
@Produces({"application/json"})
public class OrderApi {
  @POST
  @Path("/new")
  @ApiOperation(value = "Create a new order.", notes = "", responseClass = "order")
  @ApiErrors(value = { })
     
  public Response order_newOrder(
    ,,,)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/cancel")
  @ApiOperation(value = "Cancel an order.", notes = "", responseClass = "order")
  @ApiErrors(value = { })
     
  public Response order_cancelOrder(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @GET
  @Path("/myOrders")
  @ApiOperation(value = "Get your recent orders.", notes = "", responseClass = "List<order>")
  @ApiErrors(value = { })
     
  public Response order_myOrders(
    @ApiParam(value = "Table filter. Filter e.g. by symbol."
    ,required=true
)@QueryParam("filter")
 Object filter
    ,@ApiParam(value = "Which columns to fetch."
    ,required=true
)@QueryParam("columns")
 array<String> columns
    ,@ApiParam(value = "Number of rows to fetch"
    ,required=true
)@QueryParam("count")
 Double count
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @GET
  @Path("/myOpenOrders")
  @ApiOperation(value = "Get your open orders.", notes = "", responseClass = "List<order>")
  @ApiErrors(value = { })
     
  public Response order_myOpenOrders(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

