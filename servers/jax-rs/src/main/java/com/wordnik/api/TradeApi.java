package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.Error;
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
  @Path("/bucketed")
  @ApiOperation(value = "Get previous trades bucketed by seconds.", notes = "", responseClass = "List<TradeBin>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response getBucketed(
    @ApiParam(value = "Instrument name."
    ,required=true
)@QueryParam("symbol")
 String symbol
    ,@ApiParam(value = "Start date. Expects ISO formatted date strings."
    ,required=true
)@QueryParam("startTime")
 Date startTime
    ,@ApiParam(value = "End Date. Expects ISO formatted date strings."
    ,required=true
)@QueryParam("endTime")
 Date endTime
    ,@ApiParam(value = "Number of buckets to fetch."
    ,required=true
)@QueryParam("count")
 Double count
    ,@ApiParam(value = "Return dates in milliseconds (GMT). Useful for charting."
    ,required=true
)@QueryParam("useMillisecondTime")
 Boolean useMillisecondTime
    ,@ApiParam(value = "Time interval to bucket by. Available options: ['30s', '1m', '5m', '1h', '1d']."
    ,required=true
, defaultValue="1m"
)@QueryParam("binSize")
 String binSize
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @GET
  @Path("/byDate")
  @ApiOperation(value = "Get trades between two dates.", notes = "", responseClass = "List<Trade>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response getByDate(
    @ApiParam(value = "Instrument name."
    ,required=true
)@QueryParam("symbol")
 String symbol
    ,@ApiParam(value = "Start date."
    ,required=true
)@QueryParam("startTime")
 Date startTime
    ,@ApiParam(value = "End Date."
    ,required=true
)@QueryParam("endTime")
 Date endTime
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @GET
  @Path("/recent")
  @ApiOperation(value = "Get recent trades.", notes = "", responseClass = "List<Trade>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response getRecent(
    @ApiParam(value = "Instrument name."
    ,required=true
)@QueryParam("symbol")
 String symbol
    ,@ApiParam(value = "Number of trades to fetch"
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

