package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.Object;
import java.util.List;
import com.wordnik.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/schema.json")
@Api(value = "/schema", description = "the schema API")
@Produces({"application/json"})
public class SchemaApi {
  @GET
  @Path("/")
  @ApiOperation(value = "Get model schemata for data objects returned by this API.", notes = "", responseClass = "Object")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response find(
    @ApiParam(value = "Optional model filter. If omitted, will return all models."
    ,required=true
)@QueryParam("model")
 String model
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @GET
  @Path("/websocketHelp")
  @ApiOperation(value = "Returns help text & subject list for websocket usage.", notes = "", responseClass = "Object")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response websocketHelp(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

