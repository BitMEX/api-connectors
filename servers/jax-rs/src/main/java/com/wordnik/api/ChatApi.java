package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.Chat;
import java.util.List;
import com.wordnik.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/chat.json")
@Api(value = "/chat", description = "the chat API")
@Produces({"application/json"})
public class ChatApi {
  @GET
  @Path("/")
  @ApiOperation(value = "Get chat messages.", notes = "", responseClass = "List<Chat>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response get(
    @ApiParam(value = "Starting point for results."
    ,required=true
)@QueryParam("start")
 Double start
    ,@ApiParam(value = "Number of results to fetch."
    ,required=true
, defaultValue="100"
)@QueryParam("count")
 Double count
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/")
  @ApiOperation(value = "Send a chat message.", notes = "", responseClass = "Chat")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful"),@ApiError(code = 400, reason = "Parameter Error"),@ApiError(code = 401, reason = "Unauthorized"),@ApiError(code = 404, reason = "Not Found")})
     
  public Response send(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

