package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.Execution;
import java.util.List;
import com.wordnik.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/execution.json")
@Api(value = "/execution", description = "the execution API")
@Produces({"application/json"})
public class ExecutionApi {
  @GET
  @Path("/")
  @ApiOperation(value = "Get all raw executions for your account.", notes = "This returns all raw transactions, which includes order opening and cancelation, and order status changes. It can be quite noisy. More focused information is available at /execution/tradeHistory. You may also use the `filter` param to target your query. Specify an array as a filter value, such as {"execType": ["Settlement", "Trade"]} to filter on multiple values.", responseClass = "List<Execution>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response get(
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

  @GET
  @Path("/tradeHistory")
  @ApiOperation(value = "Get all balance-affecting executions. This includes each trade, insurance charge, and settlement.", notes = "", responseClass = "List<Execution>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response getTradeHistory(
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

  }

