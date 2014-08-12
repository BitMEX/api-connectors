package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.TradeBin;
import com.wordnik.client.model.Trade;
import com.wordnik.client.model.Any;
import java.util.List;
import com.wordnik.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/trade.json")
@Api(value = "/trade", description = "the trade API")
@Produces({"application/json"})
public class TradeApi {
  @GET
  @Path("/getBucketed")
  @ApiOperation(value = "Get previous trades bucketed by seconds.", notes = "", responseClass = "List<tradeBin>")
  @ApiErrors(value = { })
     
  public Response trade_getBucketed(
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
    ,@ApiParam(value = "Return dates in milliseconds (GMT). Useful for charting."
    ,required=true
)@QueryParam("useMillisecondTime")
 Boolean useMillisecondTime
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

  @GET
  @Path("/getByDate")
  @ApiOperation(value = "Get trades within two dates.", notes = "", responseClass = "List<trade>")
  @ApiErrors(value = { })
     
  public Response trade_getByDate(
    @ApiParam(value = "Instrument name."
    ,required=true
)@QueryParam("symbol")
 String symbol
    ,@ApiParam(value = "Start date."
    ,required=true
)@QueryParam("starttime")
 Date starttime
    ,@ApiParam(value = "End Date."
    ,required=true
)@QueryParam("endtime")
 Date endtime
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @GET
  @Path("/getRecent")
  @ApiOperation(value = "Get recent trades.", notes = "", responseClass = "List<any>")
  @ApiErrors(value = { })
     
  public Response trade_getRecent(
    @ApiParam(value = "Instrument name."
    ,required=true
)@QueryParam("symbol")
 String symbol
    ,@ApiParam(value = "Number of trades to fetch"
    ,required=true
)@QueryParam("count")
 Double count
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

