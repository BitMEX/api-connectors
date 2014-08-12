package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.Object;
import com.wordnik.client.model.User;
import java.util.List;
import com.wordnik.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/user.json")
@Api(value = "/user", description = "the user API")
@Produces({"application/json"})
public class UserApi {
  @POST
  @Path("/login")
  @ApiOperation(value = "Log in to BitMEX.", notes = "", responseClass = "Object")
  @ApiErrors(value = { })
     
  public Response user_login(
    @ApiParam(value = ""
    ,required=true
) Object body
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/logout")
  @ApiOperation(value = "Log out of BitMEX.", notes = "", responseClass = "void")
  @ApiErrors(value = { })
     
  public Response user_logout(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/")
  @ApiOperation(value = "Register a new user.", notes = "", responseClass = "user")
  @ApiErrors(value = { })
     
  public Response user_create(
    @ApiParam(value = "Model instance data"
    ) user body
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @GET
  @Path("/")
  @ApiOperation(value = "Get your user model.", notes = "", responseClass = "user")
  @ApiErrors(value = { })
     
  public Response user_getMe(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @PUT
  @Path("/")
  @ApiOperation(value = "Update your password, name, and other attributes.", notes = "", responseClass = "user")
  @ApiErrors(value = { })
     
  public Response user_updateMe(
    ,,,,,)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/savePrefs")
  @ApiOperation(value = "Save application preferences.", notes = "", responseClass = "user")
  @ApiErrors(value = { })
     
  public Response user_savePreferences(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/requestSMS")
  @ApiOperation(value = "Request an SMS verification token.", notes = "", responseClass = "Boolean")
  @ApiErrors(value = { })
     
  public Response user_verifyPhone(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/confirmPhone")
  @ApiOperation(value = "Confirm your phone number by entering your SMS verification token.", notes = "", responseClass = "user")
  @ApiErrors(value = { })
     
  public Response user_confirmPhone(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

