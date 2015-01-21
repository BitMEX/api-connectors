package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.Trade;
import com.wordnik.client.model.TradeBin;
import java.util.List;
import com.wordnik.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/trade.json")
@Api(value = "/trade", description = "the trade API")
@Produces({"application/json"})
public class TradeApi {
  @GET
  @Path("/")
  @ApiOperation(value = "Get Trades.", notes = "", responseClass = "List<Trade>")
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
  @Path("/bucketed")
  @ApiOperation(value = "Get previous trades in time buckets.", notes = "", responseClass = "List<TradeBin>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response getBucketed(
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
    ,@ApiParam(value = "Time interval to bucket by. Available options: ['30s', '1m', '5m', '1h', '1d']."
    , defaultValue="1m"
)@QueryParam("binSize")
 String binSize
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
  @Path("/byDate")
  @ApiOperation(value = "Get trades between two dates. [Deprecated, use GET /trades]", notes = "", responseClass = "List<Trade>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response getByDate(
    @ApiParam(value = "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series."
    )@QueryParam("symbol")
 String symbol
    ,@ApiParam(value = "Start date."
    ,required=true
)@QueryParam("startTime")
 Date startTime
    ,@ApiParam(value = "End Date."
    )@QueryParam("endTime")
 Date endTime
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @GET
  @Path("/recent")
  @ApiOperation(value = "Get recent trades. [Deprecated, use GET /trades]", notes = "", responseClass = "List<Trade>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response getRecent(
    @ApiParam(value = "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series."
    )@QueryParam("symbol")
 String symbol
    ,@ApiParam(value = "Number of trades to fetch."
    ,required=true
, defaultValue="100"
)@QueryParam("count")
 Double count
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

