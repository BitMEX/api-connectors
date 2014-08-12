package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.Leaderboard;
import java.util.List;
import com.wordnik.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/leaderboard.json")
@Api(value = "/leaderboard", description = "the leaderboard API")
@Produces({"application/json"})
public class LeaderboardApi {
  @GET
  @Path("/")
  @ApiOperation(value = "Get current leaderboard.", notes = "", responseClass = "List<leaderboard>")
  @ApiErrors(value = { })
     
  public Response leaderboard_getOrderBook(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

