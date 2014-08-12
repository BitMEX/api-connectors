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
  @ApiErrors(value = { })
     
  public Response schema_find(
    @ApiParam(value = "Optional model filter. If omitted, will return all models."
    ,required=true
)@QueryParam("model")
 String model
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

