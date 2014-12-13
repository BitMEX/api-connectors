package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.Error;
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
  @ApiOperation(value = "Get your positions.", notes = "", responseClass = "List<Position>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response find(
    @ApiParam(value = "Filter. For example, send {"symbol": "XBTF15", "open": true}."
    ,required=true
)@QueryParam("filter")
 Object filter
    ,@ApiParam(value = "Which columns to fetch. For example, send ["columnName"]."
    ,required=true
)@QueryParam("columns")
 List<any> columns
    ,@ApiParam(value = "Number of rows to fetch."
    ,required=true
)@QueryParam("count")
 Double count
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

