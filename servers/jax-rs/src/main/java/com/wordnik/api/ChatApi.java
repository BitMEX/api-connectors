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
  @POST
  @Path("/")
  @ApiOperation(value = "Send a chat message.", notes = "", responseClass = "chat")
  @ApiErrors(value = { })
     
  public Response chat_create(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @GET
  @Path("/")
  @ApiOperation(value = "Get chat messages.", notes = "", responseClass = "List<chat>")
  @ApiErrors(value = { })
     
  public Response chat_find(
    @ApiParam(value = ""
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

