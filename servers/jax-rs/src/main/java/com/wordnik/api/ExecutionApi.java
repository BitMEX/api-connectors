package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.Error;
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
  @ApiOperation(value = "Get your executions. This includes each trade and insurance charge.", notes = "", responseClass = "List<Execution>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response getMyExecutions(
    @ApiParam(value = "Table filter. For example, send {"symbol": "XBTF15"}."
    ,required=true
)@QueryParam("filter")
 Object filter
    ,@ApiParam(value = "Number of executions to fetch"
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

