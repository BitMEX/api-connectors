package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.Quote;
import java.util.List;
import com.wordnik.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/quote.json")
@Api(value = "/quote", description = "the quote API")
@Produces({"application/json"})
public class QuoteApi {
  @GET
  @Path("/bucketed")
  @ApiOperation(value = "Get previous quotes in time buckets.", notes = "", responseClass = "List<Quote>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response getBucketed(
    @ApiParam(value = "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series."
    ,required=true
)@QueryParam("symbol")
 String symbol
    ,@ApiParam(value = "Generic table filter. Send JSON key/value pairs, such as {"key": "value"}."
    ,required=true
)@QueryParam("filter")
 Object filter
    ,@ApiParam(value = "Array of column names to fetch. If omitted, will return all columns. Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect."
    ,required=true
)@QueryParam("columns")
 List<String> columns
    ,@ApiParam(value = "Starting point for results."
    ,required=true
)@QueryParam("start")
 Double start
    ,@ApiParam(value = "If true, will sort results newest first."
    ,required=true
)@QueryParam("reverse")
 Boolean reverse
    ,@ApiParam(value = "Starting date filter for results."
    ,required=true
)@QueryParam("startTime")
 Date startTime
    ,@ApiParam(value = "Ending date filter for results."
    ,required=true
)@QueryParam("endTime")
 Date endTime
    ,@ApiParam(value = "Time interval to bucket by. Available options: ['30s', '1m', '5m', '1h', '1d']."
    ,required=true
, defaultValue="1m"
)@QueryParam("binSize")
 String binSize
    ,@ApiParam(value = "Number of results to fetch."
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

