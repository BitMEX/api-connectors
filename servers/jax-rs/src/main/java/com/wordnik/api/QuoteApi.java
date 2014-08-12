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
  @Path("/getBucketed")
  @ApiOperation(value = "Get previous quotes bucketed by seconds.", notes = "", responseClass = "List<quote>")
  @ApiErrors(value = { })
     
  public Response quote_getBucketed(
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
    ,@ApiParam(value = "Number of buckets to fetch"
    ,required=true
)@QueryParam("count")
 Double count
    ,@ApiParam(value = "Time interval to bucket by. Available options: ['30s', '5m', '1h', '1d']."
    ,required=true
, defaultValue="30s"
)@QueryParam("binSize")
 String binSize
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

