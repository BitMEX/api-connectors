package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.Position;
import java.util.List;
import com.wordnik.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/position.json")
@Api(value = "/position", description = "the position API")
@Produces({"application/json"})
public class PositionApi {
  @GET
  @Path("/")
  @ApiOperation(value = "Get your positions.", notes = "", responseClass = "List<position>")
  @ApiErrors(value = { })
     
  public Response position_find(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

