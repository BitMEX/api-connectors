package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserApiService;
import io.swagger.api.factories.UserApiServiceFactory;

import io.swagger.annotations.ApiParam;

import io.swagger.model.Transaction;
import io.swagger.model.AccessToken;
import io.swagger.model.User;
import io.swagger.model.Affiliate;
import io.swagger.model.UserCommission;
import io.swagger.model.Margin;
import java.math.BigDecimal;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/user")
@Consumes({ "application/json", "application/x-www-form-urlencoded" })
@Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
@io.swagger.annotations.Api(description = "the user API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-05T09:41:09.909-05:00")
public class UserApi  {
   private final UserApiService delegate = UserApiServiceFactory.getUserApi();

    @POST
    @Path("/cancelWithdrawal")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Cancel a withdrawal.", notes = "", response = Transaction.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Transaction.class) })
    public Response userCancelWithdrawal(@ApiParam(value = "", required=true)@FormParam("token")  String token,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userCancelWithdrawal(token,securityContext);
    }
    @GET
    @Path("/checkReferralCode")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Check if a referral code is valid.", notes = "If the code is valid, responds with the referral code's discount (e.g. `0.1` for 10%). Otherwise, will return a 404.", response = Double.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Double.class) })
    public Response userCheckReferralCode(@ApiParam(value = "") @QueryParam("referralCode") String referralCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userCheckReferralCode(referralCode,securityContext);
    }
    @POST
    @Path("/confirmEmail")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Confirm your email address with a token.", notes = "", response = AccessToken.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = AccessToken.class) })
    public Response userConfirmEmail(@ApiParam(value = "", required=true)@FormParam("token")  String token,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userConfirmEmail(token,securityContext);
    }
    @POST
    @Path("/confirmEnableTFA")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Confirm two-factor auth for this account. If using a Yubikey, simply send a token to this endpoint.", notes = "", response = Boolean.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })
    public Response userConfirmEnableTFA(@ApiParam(value = "Token from your selected TFA type.", required=true)@FormParam("token")  String token,@ApiParam(value = "Two-factor auth type. Supported types: 'GA' (Google Authenticator), 'Yubikey'")@FormParam("type")  String type,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userConfirmEnableTFA(token,type,securityContext);
    }
    @POST
    @Path("/confirmPasswordReset")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Confirm a password reset.", notes = "", response = Boolean.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })
    public Response userConfirmPasswordReset(@ApiParam(value = "", required=true)@FormParam("token")  String token,@ApiParam(value = "", required=true)@FormParam("newPassword")  String newPassword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userConfirmPasswordReset(token,newPassword,securityContext);
    }
    @POST
    @Path("/confirmWithdrawal")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Confirm a withdrawal.", notes = "", response = Transaction.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Transaction.class) })
    public Response userConfirmWithdrawal(@ApiParam(value = "", required=true)@FormParam("token")  String token,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userConfirmWithdrawal(token,securityContext);
    }
    @POST
    @Path("/disableTFA")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Disable two-factor auth for this account.", notes = "", response = Boolean.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })
    public Response userDisableTFA(@ApiParam(value = "Token from your selected TFA type.", required=true)@FormParam("token")  String token,@ApiParam(value = "Two-factor auth type. Supported types: 'GA' (Google Authenticator)")@FormParam("type")  String type,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userDisableTFA(token,type,securityContext);
    }
    @GET
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get your user model.", notes = "", response = User.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = User.class) })
    public Response userGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userGet(securityContext);
    }
    @GET
    @Path("/affiliateStatus")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get your current affiliate/referral status.", notes = "", response = Affiliate.class, responseContainer = "List", tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Affiliate.class, responseContainer = "List") })
    public Response userGetAffiliateStatus(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userGetAffiliateStatus(securityContext);
    }
    @GET
    @Path("/commission")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get your account's commission status.", notes = "", response = UserCommission.class, responseContainer = "List", tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = UserCommission.class, responseContainer = "List") })
    public Response userGetCommission(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userGetCommission(securityContext);
    }
    @GET
    @Path("/depositAddress")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get a deposit address.", notes = "", response = String.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = String.class) })
    public Response userGetDepositAddress(@ApiParam(value = "", defaultValue="XBt") @DefaultValue("XBt") @QueryParam("currency") String currency,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userGetDepositAddress(currency,securityContext);
    }
    @GET
    @Path("/margin")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get your account's margin status. Send a currency of \"all\" to receive an array of all supported currencies.", notes = "", response = Margin.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Margin.class) })
    public Response userGetMargin(@ApiParam(value = "", defaultValue="XBt") @DefaultValue("XBt") @QueryParam("currency") String currency,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userGetMargin(currency,securityContext);
    }
    @GET
    @Path("/walletHistory")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get a history of all of your wallet transactions (deposits and withdrawals).", notes = "", response = Transaction.class, responseContainer = "List", tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Transaction.class, responseContainer = "List") })
    public Response userGetWalletHistory(@ApiParam(value = "", defaultValue="XBt") @DefaultValue("XBt") @QueryParam("currency") String currency,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userGetWalletHistory(currency,securityContext);
    }
    @POST
    @Path("/login")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Log in to BitMEX.", notes = "", response = AccessToken.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = AccessToken.class) })
    public Response userLogin(@ApiParam(value = "Your email address.", required=true)@FormParam("email")  String email,@ApiParam(value = "Your password.", required=true)@FormParam("password")  String password,@ApiParam(value = "OTP Token (YubiKey, Google Authenticator)")@FormParam("token")  String token,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userLogin(email,password,token,securityContext);
    }
    @POST
    @Path("/logout")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Log out of BitMEX.", notes = "", response = void.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = void.class) })
    public Response userLogout(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userLogout(securityContext);
    }
    @POST
    @Path("/logoutAll")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Log all systems out of BitMEX. This will revoke all of your account's access tokens, logging you out on all devices.", notes = "", response = Double.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Double.class) })
    public Response userLogoutAll(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userLogoutAll(securityContext);
    }
    @POST
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Register a new user.", notes = "", response = User.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = User.class) })
    public Response userNew(@ApiParam(value = "Your email address.", required=true)@FormParam("email")  String email,@ApiParam(value = "Your password.", required=true)@FormParam("password")  String password,@ApiParam(value = "Country of residence.", required=true)@FormParam("country")  String country,@ApiParam(value = "Desired username.")@FormParam("username")  String username,@ApiParam(value = "First name.")@FormParam("firstname")  String firstname,@ApiParam(value = "Last name.")@FormParam("lastname")  String lastname,@ApiParam(value = "Set to true to indicate acceptance of the Terms of Service (https://www.bitmex.com/terms).")@FormParam("acceptsTOS")  String acceptsTOS,@ApiParam(value = "Optional Referrer ID.")@FormParam("referrerID")  String referrerID,@ApiParam(value = "Optional Two-Factor Type. Accepted values: GA, Yubikey, Clef")@FormParam("tfaType")  String tfaType,@ApiParam(value = "Two-Factor Token.")@FormParam("tfaToken")  String tfaToken,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userNew(email,password,country,username,firstname,lastname,acceptsTOS,referrerID,tfaType,tfaToken,securityContext);
    }
    @POST
    @Path("/requestEnableTFA")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Get Google Authenticator secret key for setting up two-factor auth. Fails if already enabled. Use /confirmEnableTFA for Yubikeys.", notes = "", response = Boolean.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })
    public Response userRequestEnableTFA(@ApiParam(value = "Two-factor auth type. Supported types: 'GA' (Google Authenticator)")@FormParam("type")  String type,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userRequestEnableTFA(type,securityContext);
    }
    @POST
    @Path("/requestPasswordReset")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Request a password reset.", notes = "", response = Boolean.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })
    public Response userRequestPasswordReset(@ApiParam(value = "", required=true)@FormParam("email")  String email,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userRequestPasswordReset(email,securityContext);
    }
    @POST
    @Path("/requestWithdrawal")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Request a withdrawal to an external wallet.", notes = "This will send a confirmation email to the email address on record, unless requested via an API Key with the `withdraw` permission.", response = Transaction.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Transaction.class) })
    public Response userRequestWithdrawal(@ApiParam(value = "Currency you're withdrawing. Options: `XBt`", required=true, defaultValue="XBt")@FormParam("currency")  String currency,@ApiParam(value = "Amount of withdrawal currency.", required=true)@FormParam("amount")  BigDecimal amount,@ApiParam(value = "Destination Address.", required=true)@FormParam("address")  String address,@ApiParam(value = "2FA token. Required if 2FA is enabled on your account.")@FormParam("otpToken")  String otpToken,@ApiParam(value = "Network fee for Bitcoin withdrawals. If not specified, a default value will be calculated based on Bitcoin network conditions. You will have a chance to confirm this via email.")@FormParam("fee")  Double fee,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userRequestWithdrawal(currency,amount,address,otpToken,fee,securityContext);
    }
    @POST
    @Path("/preferences")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Save user preferences.", notes = "", response = User.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = User.class) })
    public Response userSavePreferences(@ApiParam(value = "", required=true)@FormParam("prefs")  String prefs,@ApiParam(value = "If true, will overwrite all existing preferences.", defaultValue="false")@FormParam("overwrite")  Boolean overwrite,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userSavePreferences(prefs,overwrite,securityContext);
    }
    @POST
    @Path("/resendVerificationEmail")
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Re-send verification email.", notes = "", response = Boolean.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = Boolean.class) })
    public Response userSendVerificationEmail(@ApiParam(value = "", required=true)@FormParam("email")  String email,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userSendVerificationEmail(email,securityContext);
    }
    @PUT
    
    @Consumes({ "application/json", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" })
    @io.swagger.annotations.ApiOperation(value = "Update your password, name, and other attributes.", notes = "", response = User.class, tags={ "User", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Request was successful", response = User.class) })
    public Response userUpdate(@ApiParam(value = "")@FormParam("firstname")  String firstname,@ApiParam(value = "")@FormParam("lastname")  String lastname,@ApiParam(value = "")@FormParam("oldPassword")  String oldPassword,@ApiParam(value = "")@FormParam("newPassword")  String newPassword,@ApiParam(value = "")@FormParam("newPasswordConfirm")  String newPasswordConfirm,@ApiParam(value = "Username can only be set once. To reset, email support.")@FormParam("username")  String username,@ApiParam(value = "Country of residence.")@FormParam("country")  String country,@ApiParam(value = "PGP Public Key. If specified, automated emails will be sentwith this key.")@FormParam("pgpPubKey")  String pgpPubKey,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userUpdate(firstname,lastname,oldPassword,newPassword,newPasswordConfirm,username,country,pgpPubKey,securityContext);
    }
}
