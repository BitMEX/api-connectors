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
  @ApiOperation(value = "Get instruments.", notes = "", responseClass = "List<Instrument>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response get(
    @ApiParam(value = "Table filter. For example, send {"symbol": "XBTF15"}."
    ,required=true
)@QueryParam("filter")
 Object filter
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @GET
  @Path("/active")
  @ApiOperation(value = "Get all active instruments and instruments that have expired in <24hrs.", notes = "", responseClass = "List<Instrument>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response getActive(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

