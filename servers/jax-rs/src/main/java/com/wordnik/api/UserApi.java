package com.wordnik.api;

import com.wordnik.swagger.annotations.*;

import com.wordnik.client.model.User;
import com.wordnik.client.model.Transaction;
import com.wordnik.client.model.Affiliate;
import com.wordnik.client.model.AccessToken;
import com.wordnik.client.model.Any;
import java.util.List;
import com.wordnik.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/user.json")
@Api(value = "/user", description = "the user API")
@Produces({"application/json"})
public class UserApi {
  @GET
  @Path("/depositAddress")
  @ApiOperation(value = "Get a deposit address.", notes = "", responseClass = "String")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response getDepositAddress(
    @ApiParam(value = ""
    , defaultValue="XBt"
)@QueryParam("currency")
 String currency
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @GET
  @Path("/walletHistory")
  @ApiOperation(value = "Get a history of all of your wallet transactions (deposits and withdrawals).", notes = "", responseClass = "List<Transaction>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response getWalletHistory(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/requestWithdrawal")
  @ApiOperation(value = "Request a withdrawal to an external wallet.", notes = "", responseClass = "Transaction")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response requestWithdrawal(
    ,,,)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/cancelWithdrawal")
  @ApiOperation(value = "Cancel a withdrawal.", notes = "", responseClass = "Transaction")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response cancelWithdrawal(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/confirmWithdrawal")
  @ApiOperation(value = "Confirm a withdrawal.", notes = "", responseClass = "Transaction")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response confirmWithdrawal(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/requestEnableTFA")
  @ApiOperation(value = "Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled.", notes = "", responseClass = "Boolean")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response requestEnableTFA(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/confirmEnableTFA")
  @ApiOperation(value = "Confirm two-factor auth for this account.", notes = "", responseClass = "Boolean")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response confirmEnableTFA(
    ,)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @GET
  @Path("/resendVerificationEmail")
  @ApiOperation(value = "Re-send verification email.", notes = "", responseClass = "Boolean")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response sendVerificationEmail(
    @ApiParam(value = ""
    ,required=true
)@QueryParam("email")
 String email
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/confirmEmail")
  @ApiOperation(value = "Confirm your email address with a token.", notes = "", responseClass = "Boolean")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response confirmEmail(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/requestPasswordReset")
  @ApiOperation(value = "Request a password reset.", notes = "", responseClass = "Boolean")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response requestPasswordReset(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/confirmPasswordReset")
  @ApiOperation(value = "Confirm a password reset.", notes = "", responseClass = "Boolean")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response confirmPasswordReset(
    ,,)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/affiliateStatus")
  @ApiOperation(value = "Get your current affiliate/referral status.", notes = "", responseClass = "List<Affiliate>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response getAffiliateStatus(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/")
  @ApiOperation(value = "Register a new user.", notes = "", responseClass = "User")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response newUser(
    ,,,,,,,)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @GET
  @Path("/")
  @ApiOperation(value = "Get your user model.", notes = "", responseClass = "User")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response getMe(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @PUT
  @Path("/")
  @ApiOperation(value = "Update your password, name, and other attributes.", notes = "", responseClass = "User")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response updateMe(
    ,,,,,)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/login")
  @ApiOperation(value = "Log in to BitMEX.", notes = "", responseClass = "AccessToken")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response login(
    ,,)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/logout")
  @ApiOperation(value = "Log out of BitMEX.", notes = "", responseClass = "void")
  @ApiErrors(value = { @ApiError(code = 204, reason = "Request was successful")})
     
  public Response logout(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/logoutAll")
  @ApiOperation(value = "Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.", notes = "", responseClass = "void")
  @ApiErrors(value = { @ApiError(code = 204, reason = "Request was successful")})
     
  public Response logoutAll(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @POST
  @Path("/preferences")
  @ApiOperation(value = "Save application preferences.", notes = "", responseClass = "User")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response savePreferences(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  @GET
  @Path("/commission")
  @ApiOperation(value = "Get your account's commission status.", notes = "", responseClass = "List<any>")
  @ApiErrors(value = { @ApiError(code = 200, reason = "Request was successful")})
     
  public Response getCommission(
    )
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponse(ApiResponse.OK, "magic!")).build();
  }

  }

