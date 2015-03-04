package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.StatsHistory;
import com.wordnik.client.model.Stats;
import java.util.List;
import com.wordnik.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/stats.json")
@Api(value = "/stats", description = "the stats API")
@Produces({"application/json"})
public class StatsApi {
  @GET
  @Path("/")
  @ApiOperation(value = "Get exchange-wide and per-series turnover and volume statistics.", notes = "", responseClass = "List<Stats>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response find(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @GET
  @Path("/history")
  @ApiOperation(value = "Get historical exchange-wide and per-series turnover and volume statistics.", notes = "", responseClass = "List<StatsHistory>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response history(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

