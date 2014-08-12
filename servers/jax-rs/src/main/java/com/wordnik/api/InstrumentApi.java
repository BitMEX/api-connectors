package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.Instrument;
import java.util.List;
import com.wordnik.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/instrument.json")
@Api(value = "/instrument", description = "the instrument API")
@Produces({"application/json"})
public class InstrumentApi {
  @GET
  @Path("/")
  @ApiOperation(value = "Get all listed instruments.", notes = "", responseClass = "List<instrument>")
  @ApiErrors(value = { })
     
  public Response instrument_find(
    @ApiParam(value = "Filter defining fields, where, orderBy, offset, and limit"
    ,required=true
)@QueryParam("filter")
 Object filter
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

